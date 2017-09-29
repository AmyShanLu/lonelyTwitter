/*
 * Class Name: HappyMood
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
 * Represents a Happy Mood
 *
 * @author Shan Lu
 * @version 1.0
 * @see Mood
 * @see SadMood
 * @since 1.0
 */

public class HappyMood extends Mood {

    /**
     * Construct Happy Mood objects
     */
    public HappyMood() {
        super();
    }

    /**
     * Construct Happy Mood objects
     *
     * @param date Happy Mood date
     */
    public HappyMood(Date date) {
        super(date);
    }

    /**
     * Gets the description for Happy Mood
     *
     * @return String "Happy" the description for Happy Mood
     */
    public String getMood() {
        return "Happy";
    }
}
