package com.example.android.testrun;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

/**
 * Created by Codetribe on 2016/11/25.
 */

public class MotherClass {

    String FilePath;
    FirebaseStorage firebaseStorage;
    String pathstr;
    String Songpath;
    private String[] mPath;
    private String[] mMusic;
    MediaPlayer mediaplayer;
    private int PICKFILE_RESULT_CODE;
    private StorageReference mStorageRef;
    Activity activity;

    public  MotherClass()
    {

        String FilePath = "";
        FirebaseStorage firebaseStorage;
        String pathstr = "fsgjbv";
        String Songpath = "?";
        mPath = new String[]{};
         mMusic = new String[]{};
        MediaPlayer mediaplayer;
        PICKFILE_RESULT_CODE = 1001 ;
        StorageReference mStorageRef;

    }

    public void popup()
    {

        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("audio/mpeg");
        activity.startActivityForResult(intent,PICKFILE_RESULT_CODE);
    }


    public void playsong(Uri pathofsong)
    {
        try {


            String pathsss = pathofsong.toString();
            MediaPlayer mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathsss);
            mediaplayer.prepare();
            mediaplayer.start();
          //  play = 1;


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


}
