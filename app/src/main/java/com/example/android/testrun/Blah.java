package com.example.android.testrun;

import android.content.Intent;
import android.database.Cursor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Blah extends AppCompatActivity {

    private static final int PICKFILE_RESULT_CODE = 1001;
    private StorageReference mStorageRef;
    ImageButton openButton;
    ImageButton BTNplay;
    Button upload;
    TextView path;
    TextView foundpath;
    String songdisplay;
    String FilePath = "";
    private String[] mPath;
    private String[] mMusic;
    MediaPlayer mediaplayer;
    MotherClass motherClass;
    Uri douwnloadURI;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);
        BTNplay = (ImageButton) findViewById(R.id.button3);
        openButton = (ImageButton) findViewById(R.id.button2);
        upload = (Button) findViewById(R.id.btnupload);

        foundpath = (TextView) findViewById(R.id.pathfound);
        mStorageRef = FirebaseStorage.getInstance().getReference();

        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
                intent.setType("audio/mpeg");
                startActivityForResult(intent, PICKFILE_RESULT_CODE);

                openButton.startAnimation(sideanim());
            }
        });


        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Uri file = Uri.fromFile(new File(FilePath));
                StorageReference riversRef = mStorageRef.child(FilePath);

                UploadTask uploadTask;

                uploadTask = riversRef.putFile(file);

                uploadTask.addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(Blah.this,"can not upload song",Toast.LENGTH_SHORT).show();

                    }
                }).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                    @Override
                    public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {

                        douwnloadURI = taskSnapshot.getDownloadUrl();
                        Toast.makeText(Blah.this,taskSnapshot.getDownloadUrl().toString(),Toast.LENGTH_SHORT).show();
                    }
                });




            }
        });

        //Streaming the song
        BTNplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {


                    String pathsss = douwnloadURI.toString();
                    MediaPlayer mediaplayer = new MediaPlayer();
                    mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mediaplayer.reset();
                    mediaplayer.setDataSource(pathsss);
                    mediaplayer.prepare();
                    mediaplayer.start();

                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SecurityException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalStateException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }


            }
        });

    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
// TODO Auto-generated method stub
        Uri selectedImageUri = data.getData();
        String[] projection = {MediaStore.Audio.Media.DISPLAY_NAME};
        switch (requestCode) {
            case PICKFILE_RESULT_CODE:
                if (resultCode == RESULT_OK) {

                    Cursor cursor = getContentResolver().query(selectedImageUri, projection, null, null, null);
                    cursor.moveToFirst();

                    int columnIndex = cursor.getColumnIndex(projection[0]);
                    String picturePath = cursor.getString(columnIndex);
                    cursor.close();
                    FilePath = getFirebaseURIparth(picturePath);

                }
                if (requestCode == RESULT_CANCELED) {

                }
                break;

        }
    }


    //get all the songs Display names
    private String[] getAudioList() {
        final Cursor mCursor = getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                new String[]{MediaStore.Audio.Media.DISPLAY_NAME, MediaStore.Audio.Media.DATA}, null, null
                , "LOWER(" + MediaStore.Audio.Media.TITLE + ")ASC");

        int count = mCursor.getCount();
        String[] songs = new String[count];
        String[] mAudioparth = new String[count];

        int i = 0;
        if (mCursor.moveToFirst()) {
            do {
                songs[i] = mCursor.getString(mCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME));
                mAudioparth[i] = mCursor.getString(mCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA));
                i++;
            } while (mCursor.moveToNext());

        }
        mCursor.close();
        return songs;

    }

    //Get all paths of songs from phone
    private String[] getmAudioPath() {
        final Cursor mCursor = getContentResolver().query(
                MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
                new String[]{MediaStore.Audio.Media.DISPLAY_NAME, MediaStore.Audio.Media.DATA}, null, null,
                "LOWER(" + MediaStore.Audio.Media.TITLE + ") ASC");

        int count = mCursor.getCount();

        String[] songs = new String[count];
        String[] path = new String[count];
        int i = 0;
        if (mCursor.moveToFirst()) {
            do {
                songs[i] = mCursor.getString(mCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DISPLAY_NAME));
                path[i] = mCursor.getString(mCursor.getColumnIndexOrThrow(MediaStore.Audio.Media.DATA));
                i++;
            } while (mCursor.moveToNext());
        }

        mCursor.close();

        return path;
    }


    //how to get path to store file into firebase
    public String getFirebaseURIparth(String songname) {
        String uriPath = "null";

        mPath = getmAudioPath();
        mMusic = getAudioList();
        int i = mMusic.length;

        for (int k = 0; k < i; k++) {
            if (mMusic[k].equals(songname)) {
                uriPath = mPath[k].toString();
                Toast.makeText(this, uriPath, Toast.LENGTH_SHORT).show();
                songdisplay = songname;
                blink();
                break;
            }

        }

        return uriPath;
    }

//----------------------------------------------ANIMATION------------------------------------------
    //button animation
    private Animation sideanim()
    {
        TranslateAnimation animation = new TranslateAnimation(0.0f, 400.0f,
                0.0f, 0.0f);          //  new TranslateAnimation(xFrom,xTo, yFrom,yTo)
        animation.setDuration(5000);  // animation duration
        animation.setRepeatCount(5);  // animation repeat count
        animation.setRepeatMode(2);   // repeat animation (left to right, right to left )
        //animation.setFillAfter(true);

        return animation;
    }

    private void blink(){
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int timeToBlink = 1000;    //in milissegunds
                try{Thread.sleep(timeToBlink);}catch (Exception e) {}
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        TextView txt = (TextView) findViewById(R.id.songdisplay);
                        txt.setText(songdisplay);
                        if(txt.getVisibility() == View.VISIBLE){
                            txt.setVisibility(View.INVISIBLE);
                        }else{
                            txt.setVisibility(View.VISIBLE);
                        }
                        blink();
                    }
                });
            }
        }).start();
    }

}


