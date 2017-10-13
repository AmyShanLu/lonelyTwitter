package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by shanlu on 2017-10-12.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    public void testAddTweet(){
        //assertTrue(Boolean.TRUE);
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding Tweet");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testDelete(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testHasTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.add(tweet);
        Tweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
    }

    public void testHasDuplicateTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test");
        tweets.add(tweet);
        tweets.add(tweet1);
        assertTrue(tweets.hasDuplicateTweet(tweet1));
    }

    public void testGetChronologicalTweets() throws ParseException {
        TweetList tweets = new TweetList();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = sdf.parse("2016-12-31");
        Date date2 = sdf.parse("2010-01-31");

        Tweet tweet = new NormalTweet("test");
        tweet.setDate(date1);
        tweets.add(tweet);
        Tweet tweet1 = new NormalTweet("test1");
        tweet1.setDate(date2);
        tweets.add(tweet1);

        ArrayList<Tweet> chronologicalTweets = tweets.getTweets();

        assertTrue(chronologicalTweets.get(0).getDate().compareTo(chronologicalTweets.get(1).getDate()) < 0);
        assertTrue(chronologicalTweets.get(0).getMessage().equals("test1"));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        Tweet tweet1 = new NormalTweet("test1");
        tweets.add(tweet);
        assertEquals(tweets.getCount(),1);
        tweets.add(tweet1);
        assertEquals(tweets.getCount(),2);
    }
}
