package com.example.lonelytwitter;

import java.util.Date;

public class ImportantTweet extends Tweet {

    @Override
    public Boolean isImportant() {
        return true;
    }

    public ImportantTweet(String message) {
        super(message);
    }

    public ImportantTweet(Date date, String message) {
        super(date, message);
    }
}
