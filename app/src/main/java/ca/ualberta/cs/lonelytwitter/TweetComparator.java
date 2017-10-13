package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by shanlu on 2017-10-12.
 */

public class TweetComparator implements Comparator<Tweet> {
    public int compare(Tweet lhs, Tweet rhs) {
        return lhs.getDate().compareTo(rhs.getDate());
    }
}
