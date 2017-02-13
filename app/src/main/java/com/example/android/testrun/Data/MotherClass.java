package com.example.android.testrun.Data;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;

//import com.example.android.testrun.MyBounceInterpolator;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



import java.io.IOException;

/**
 * Created by Codetribe on 2016/11/25.
 */

public class MotherClass {


    String gnr;
  //  private int PICKFILE_RESULT_CODE;
    private int x;
    Activity activity;

    private TelephonyManager telephonyManager;
    private PhoneStateListener phoneStateListener;


    public  MotherClass()
    {




    }


    public void playsong(Uri pathofsong)
    {


        try {
            CountDownTimer timer = null;

            final String pathsss = pathofsong.toString();
            final MediaPlayer mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathsss);
            mediaplayer.prepare();
            mediaplayer.start();

            final int dur = mediaplayer.getDuration();


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

    public void playsongs(String pathofsong,Boolean isPlay)
    {
        final MediaPlayer mediaplayer = new MediaPlayer();

        try {
            CountDownTimer timer = null;



            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathofsong);
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


        if(isPlay == true)
        {
            mediaplayer.stop();
        }


    }


    public void songplaying(String pathofsong, Button button, Drawable drawable1)
    {
        final MediaPlayer mediaplayer = new MediaPlayer();

        try {

            if(!mediaplayer.isPlaying())
            {
            button.setBackground(drawable1);
            }
            else
            {

                final String pathsss = pathofsong.toString();
                mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                mediaplayer.reset();
                mediaplayer.setDataSource(pathsss);
                mediaplayer.prepare();
                mediaplayer.start();
            }




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

    public int getDuration(Uri path)
    {


        try {
            final String pathsss = path.toString();
            final MediaPlayer mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathsss);
            x = mediaplayer.getDuration();

        }
        catch (Exception e)
        {

        }

        return x;
    }

    //_____________________-temp
    public void playCond(String pathofsong, Boolean t)
    {


        try {
            CountDownTimer timer = null;

            final String pathsss = pathofsong.toString();
            final MediaPlayer mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathsss);
            mediaplayer.prepare();


            final int dur = mediaplayer.getDuration();

            if (t = false)
            {  mediaplayer.start();
            }
            if(t = true)
            {
                mediaplayer.pause();
            }




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



    //write to database
public void writeCat(String gen, String songnm, Uri downloaduri,String time,String name)
{

    final FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference ref = database.getReference();
    DatabaseReference usersRef = ref.child("Genre").child(gen);
    usersRef.push().setValue(new Gendre(songnm,downloaduri.toString(),time,name,"0"));

}

    public void writeArtist(String name, String email,String songnm, Uri downloaduri,String likes )
    {


        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        DatabaseReference usersRef = ref.child("Artist").child(name);
        usersRef.push().setValue(new Gendre(email,songnm,downloaduri.toString(),likes));


    }


    public void contactInfo(String name,String email)
    {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();

        DatabaseReference usersReff = ref.child("Contacts").child("Artists");
        usersReff.push().setValue(new Contacts(email,name));
    }

    public void writeComments(String songname)
    {
        final FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference ref = database.getReference();
        DatabaseReference usersRef = ref.child("Comments").child(songname);
        usersRef.push().setValue(new Gendre(songname));




    }




    //_____________________animation______________________
//    public Animation didTapButton(Context context) {
//
//
//        final Animation myAnim = AnimationUtils.loadAnimation(context, R.anim.bounce);
//        MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
//        myAnim.setInterpolator(interpolator);
//
//        return myAnim;
//    }

    public void rotateFabForward(FloatingActionButton fab) {
        ViewCompat.animate(fab)
                .rotation(135.0F)
                .withLayer()
                .setDuration(300L)
                .setInterpolator(new OvershootInterpolator(10.0F))
                .start();
    }

    public void rotateFabBackward(FloatingActionButton fab) {
        ViewCompat.animate(fab)
                .rotation(0.0F)
                .withLayer()
                .setDuration(300L)
                .setInterpolator(new OvershootInterpolator(10.0F))
                .start();
    }
}
