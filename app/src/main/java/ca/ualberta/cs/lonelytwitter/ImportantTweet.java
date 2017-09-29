/*
 * Class Name: ImportantTweet
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
 * Represents an Important Tweet
 *
 * @author Shan Lu
 * @version 1.0
 * @see Tweet
 * @see NormalTweet
 * @since 1.0
 */

public class ImportantTweet extends Tweet {

    /**
     * Constructs Important Tweet objects
     *
     * @param message Important Tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructs Important Tweet objects
     *
     * @param message Important Tweet message
     * @param date Important Tweet date
     */
    public ImportantTweet(String message, Date date){
        super(message, date);
    }

    /**
     * Return if important tweet is important
     *
     * @return true Important Tweet is not important
     */
    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
