package com.example.lonelytwitter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.Console;
import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tweet tweet = new Tweet("main message");
        NormalTweet normalTweet = new NormalTweet("normal Tweet");
        ImportantTweet importantTweet = new ImportantTweet("important tweet");
        Tweet importantTweet1 = new ImportantTweet("Type Tweet but object of important tweet!"); // debug this!

        importantTweet1.getMessage();
        Boolean isNormalTweetImportant = normalTweet.isImportant(); // debug this!
        Boolean isImportantTweetImportant = importantTweet.isImportant(); // debug this!

        ArrayList<Tweet> tweetList = new ArrayList<Tweet>();
        tweetList.add(normalTweet);
        tweetList.add(importantTweet);
        tweetList.add(importantTweet1);

//        String message = tweet.getMessage(); // prints main message
//        Date mainDate = tweet.getDate(); // current date and time
//        Tweet tweet2 = new Tweet(new Date(), "second obejct");
//        tweet2.setTweet(new Date(), "updated messaged");
//        String message2 = tweet2.getMessage(); // prints updated message
//
//        ImportantTweet importantTweet = new ImportantTweet("important Tweet");
//        importantTweet.getDate();
//        importantTweet.setTweet(new Date(), "");
    }
}