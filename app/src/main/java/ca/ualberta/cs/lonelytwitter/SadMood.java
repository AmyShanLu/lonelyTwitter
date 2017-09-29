/*
 * Class Name: SadMood
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
 * Represents a Sad Mood
 *
 * @author Shan Lu
 * @version 1.0
 * @see Mood
 * @see HappyMood
 * @since 1.0
 */

public class SadMood extends Mood {

    /**
     * Construct Sad Mood objects
     */
    public SadMood() {
        super();
    }

    /**
     * Construct Sad Mood objects
     *
     * @param date Sad Mood date
     */
    public SadMood(Date date) {
        super(date);
    }

    /**
     * Gets the description for Sad Mood
     *
     * @return String "Sad" the description for Sad Mood
     */
    public String getMood() {
        return "Sad";
    }
}
