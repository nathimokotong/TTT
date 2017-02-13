package com.example.android.testrun.Data;

/**
 * Created by Codetribe on 2017/02/10.
 */

public class Contacts {

    public String email;
    public String artist;


    public Contacts(String e,String n)
    {
        email = e;
        artist = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
