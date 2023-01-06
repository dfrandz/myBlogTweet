package com.example.myBlogTweet.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Tweet")

public class Tweet {
    

    @Id
    static int id=0;

    private String author;
    private String title;

    private Binary image;
    // private String file;


    public Tweet(String author, String title) {
        this.author = author;
        this.title = title;
        Tweet.id++;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return this.title;
    }

    public void setText(String title) {
        this.title = title;
    }

    public Binary getImage() {
        return this.image;
    }

    public void setImage(org.bson.types.Binary binary) {
        this.image = (Binary) binary;
    }
}
