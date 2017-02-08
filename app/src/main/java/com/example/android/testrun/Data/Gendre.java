package com.example.android.testrun.Data;

import android.net.Uri;

import com.google.firebase.database.IgnoreExtraProperties;

import java.io.Serializable;

/**
 * Created by Codetribe on 2016/12/02.
 */

@IgnoreExtraProperties //avoids this error Can't convert object of type java.lang.String to type object
public class Gendre implements Serializable {

    private String songName;
    private String downloadu;
private String Email;
private String timestamp;
    private String dislikes;
    private String artist;


    public Gendre()
    {

    }

//we can have two constractors

    public Gendre(String d)
    {
        songName = d;


    }

    //_____________________first for genre
    public Gendre(String d, String m, String t,String n,String b)
    {
        songName = d;
        downloadu = m;
        timestamp = t;
        artist = n;
        dislikes = b;

    }
    //_____________________secound
    public Gendre(String email, String songnm, String downloaduri,String time)
    {

        Email = email;
        songName = songnm;
        downloadu = downloaduri;
        timestamp = time;

    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public void setDownloadu(String downloadu) {
        this.downloadu = downloadu;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public void setDislikes(String dislikes) {
        this.dislikes = dislikes;
    }

    public String getSongName()
    {
        return songName;
    }

    public String getDownloadu()
    {
        return downloadu;
    }


    public String getEmail()
    {
        return Email;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getDislikes() {
        return dislikes;
    }
}

