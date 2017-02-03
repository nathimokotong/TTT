package com.example.android.testrun.Data;

import android.net.Uri;

import java.io.Serializable;

/**
 * Created by Codetribe on 2016/12/02.
 */

public class Gendre implements Serializable {

    private String songName;
    private String downloadu;
private String Email;
private String timestamp;
    private String dislikes;



//we can have two constractors

    public Gendre(String d)
    {
        songName = d;


    }

    //_____________________first
    public Gendre(String d, String m, String t)
    {
        songName = d;
        downloadu = m;
        timestamp = t;

    }
    //_____________________secound
    public Gendre(String email, String songnm, String downloaduri,String time)
    {

        Email = email;
        songName = songnm;
        downloadu = downloaduri;
        timestamp = time;

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

