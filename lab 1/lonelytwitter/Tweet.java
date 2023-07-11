package com.example.lonelytwitter;

import java.util.Date;

public abstract class Tweet implements Tweetable {
    private Date date;
    private String message;
    public abstract Boolean isImportant();
    public Tweet(String message){
        this.date = new Date();
        this.message = message;
    }

    public Tweet(Date date, String message){
        this.date = date;
        this.message = message;
    }

    // getter date
    public Date getDate(){
        return this.date;
    }

    // getter message
    public String getMessage(){
        return this.message;
    }

    // setter tweet
    public void setTweet(Date date, String message){
        this.date = date;
        this.message = message;
    }
}


