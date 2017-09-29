/*
 * Class Name: Mood
 *
 * Version: Version 1.0
 *
 * Date: September 28, 2017
 *
 * Copyright (c) Team X, CMPUT301, University of Alberta - All Rights Reserved. You may use, distribute, or modify this code under terms and conditions of the Code of Students Behaviour at University of Alberta
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Mood
 *
 * @author Shan Lu
 * @version 1.0
 * @see HappyMood
 * @see SadMood
 * @since 1.0
 */

public abstract class Mood {
    private Date date;

    /**
     * Constructs mood objects
     */
    public Mood(){
        this.date = new Date();
    }

    /**
     * Constructs mood objects
     *
     * @param date mood date
     */
    public Mood(Date date){
        this.date = date;
    }

    /**
     * Sets Mood date
     *
     * @param date mood date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Gets mood date
     *
     * @return date mood date
     */
    public Date getDate(){
        return date;
    }

    /**
     * Get the description of the mood object
     *
     * @return String mood description
     */
    public abstract String getMood();
}
