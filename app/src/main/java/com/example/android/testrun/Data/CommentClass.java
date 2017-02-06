package com.example.android.testrun.Data;

/**
 * Created by Codetribe on 2017/02/03.
 */

public class CommentClass {

    String user;
    String message;


    public CommentClass()
    {

    }


    public CommentClass(String u , String m)
    {
        user = u;
        message = m;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
