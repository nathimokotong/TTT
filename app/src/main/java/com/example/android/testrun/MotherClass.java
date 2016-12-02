package com.example.android.testrun;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AlertDialog;

import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.IOException;

/**
 * Created by Codetribe on 2016/11/25.
 */

public class MotherClass {


    String gnr;
    private int PICKFILE_RESULT_CODE;

    Activity activity;

    public  MotherClass()
    {

        PICKFILE_RESULT_CODE = 1001 ;


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
            CountDownTimer timer = null;

            final String pathsss = pathofsong.toString();
            final MediaPlayer mediaplayer = new MediaPlayer();
            mediaplayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mediaplayer.reset();
            mediaplayer.setDataSource(pathsss);
            mediaplayer.prepare();
            mediaplayer.start();

            timer = new CountDownTimer(20000,1000) {
                @Override
                public void onTick(long l) {

                }
                @Override
                public void onFinish()
                {
                    mediaplayer.stop();
                }
            }.start();



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
