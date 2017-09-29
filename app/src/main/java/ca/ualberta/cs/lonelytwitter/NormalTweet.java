/*
 * Class Name: NormalTweet
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
 * Represents a Normal Tweet
 *
 * @author Shan Lu
 * @version 1.0
 * @see Tweet
 * @see ImportantTweet
 * @since 1.0
 */

public class NormalTweet extends Tweet {

    /**
     * Constructs Normal Tweet objects
     *
     * @param message Normal Tweet message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructs Normal Tweet objects
     *
     * @param message Normal Tweet message
     * @param date Normal Tweet date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Return if normal tweet is important
     *
     * @return false Normal Tweet is not important
     */
    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }
}
