package com.audacityit.finder.model;

/**
 * Created by tusharaits on 7/24/15.
 */
public class Comment {

    private String userName;
    private float rating;
    private String textComment;
    private String date;

    public Comment() {
    }

    public Comment(String userName, float rating, String textComment, String date) {
        this.userName = userName;
        this.rating = rating;
        this.textComment = textComment;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getText() {
        return textComment;
    }

    public void setText(String text) {
        this.textComment = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String time) {
        this.date = time;
    }
}
