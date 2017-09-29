/*
 * Class Name: Tweetable
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
 * Interface class
 *
 * @author Shan Lu
 * @version 1.0
 * @since 1.0
 */

public interface Tweetable {
    /**
     * Get the description of the object that implements tweetable interface
     *
     * @return String message
     */
    public String getMessage();

    /**
     * Get the date of the object that implement tweetable interface
     *
     * @return Date date
     */
    public Date getDate();
}
