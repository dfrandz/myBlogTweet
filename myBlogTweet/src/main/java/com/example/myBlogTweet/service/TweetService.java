package com.example.myBlogTweet.service;

import java.io.IOException;
import java.util.List;

import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.myBlogTweet.model.Tweet;
import com.example.myBlogTweet.repositoryInterface.TweetRepositoryInterface;
import com.example.myBlogTweet.serviceInterface.TweetServiceInterface;

@Service
public class TweetService implements TweetServiceInterface {

    //attrubute
    @Autowired
    private TweetRepositoryInterface tweetRepository;

    //contructor
    public TweetService(TweetRepositoryInterface tweetRepo) {
        this.tweetRepository = tweetRepo;
    }

    public Tweet saveTweet(String author,String title, MultipartFile file) throws IOException {
        Tweet tweet = new Tweet(author,title);
        tweet.setImage(
            new Binary(BsonBinarySubType.BINARY, file.getBytes())
        );
       return tweetRepository.insert(tweet);
    }

    @Override
    public List<Tweet> getAllTweet() {
        return tweetRepository.findAll();
    }
}
