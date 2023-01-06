package com.example.myBlogTweet.serviceInterface;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.example.myBlogTweet.model.Tweet;

public interface TweetServiceInterface {
    
    Tweet saveTweet(String author,String title, MultipartFile file) throws IOException;

    List<Tweet> getAllTweet();
}
