package com.example.myBlogTweet.repositoryInterface;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.myBlogTweet.model.Tweet;

public interface TweetRepositoryInterface extends MongoRepository<Tweet, Integer> {
    
}
