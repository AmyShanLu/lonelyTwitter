package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by shanlu on 2017-09-14.
 */

public class HappyMood extends Mood {

    public HappyMood() {
        super();
    }

    public HappyMood(Date date) {
        super(date);
    }

    public String getMood() {
        return "Happy";
    }
}
