package com.example.android.testrun.Data;

/**
 * Created by Codetribe on 2017/02/10.
 */

public class Contacts {

    public String email;
    public String artist;
    public String pictur;



    public Contacts()
    {

    }

    public Contacts(String e,String n,String p)
    {
        email = e;
        artist = n;
        pictur = p;
    }


    public String getPictur() {
        return pictur;
    }

    public void setPictur(String pictur) {
        this.pictur = pictur;
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
