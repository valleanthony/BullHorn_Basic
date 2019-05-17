package com.example.basic_bull_horn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.stereotype.Component;

@Component
public class CommandLine implements CommandLineRunner{
    /// We can add some default tweets to the app by having the command line runner run first.

    @Autowired
    TweetRepo tweetRepo;

    @Override
    public void run(String...Strings) throws Exception{
        Tweet tweet = new Tweet();
        tweet.setContent("Hello World");
        tweet.setPostedBy("AntMan");
        tweet.setTitle("Auto Gen Tweet");
        tweet.setPostedDate("Today");
        tweetRepo.save(tweet);


    }

}
