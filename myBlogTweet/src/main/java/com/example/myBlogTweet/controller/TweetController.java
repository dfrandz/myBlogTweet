package com.example.myBlogTweet.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.myBlogTweet.model.Tweet;
import com.example.myBlogTweet.service.TweetService;

import ch.qos.logback.core.model.Model;


@RestController
@CrossOrigin
public class TweetController {
    

    @Autowired()
    private TweetService tweetService;

    // public TweetController(TweetService tweetService){
    //     this.tweetService = tweetService;
    // }


    @PostMapping("/tweets")
    public String addPhoto(@RequestParam("author") String author, @RequestParam("title") String title,
    @RequestParam("image") MultipartFile image, Model model) 
    throws IOException{
        this.tweetService.saveTweet(author, title, image);
        return "success";

    }

    @GetMapping("/list")
    public List<Tweet> getList(){
        return tweetService.getAllTweet();
    }
}
