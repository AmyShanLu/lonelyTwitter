/*
 * Class Name: Tweet
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Represents a Tweet
 *
 * @author Shan Lu
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    /**
     * Constructs Tweet objects
     *
     * @param message Tweet message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs Tweet objects
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        this.message = message;
        this.date = date;
    }

    /**
     * Adds a mood object to moods arraylist
     *
     * @param mood Mood object
     */
    public void addMood(Mood mood){
        this.moods.add(mood);
    }

    /**
     * Gets the moods arraylist
     *
     * @return moods the moods arraylist
     */
    public ArrayList<Mood> getMoodList(){
        return this.moods;
    }

    /**
     * Sets Tweet date
     *
     * @param date Tweet date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Sets tweet messages
     *
     * @param message Tweet message
     * @throws TweetTooLongException
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() <= 140){
            this.message = message;
        }
        else {
            throw new TweetTooLongException();
        }
    }

    /**
     * Get Tweet date
     *
     * @return date Tweet date
     */
    public Date getDate(){
        return this.date;
    }

    /**
     * Get tweet message
     *
     * @return message tweet message
     */
    public String getMessage(){
        return this.message;
    }

    /**
     * Return if Tweet is important
     *
     * @return true Tweet is important
     *         false Tweet is important
     */
    public abstract Boolean isImportant();

    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }

}
