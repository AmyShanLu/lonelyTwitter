package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by shanlu on 2017-10-12.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public TweetList(){

    }

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public void delete(Tweet tweet){
        tweets.remove(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
        return tweets.get(index);
    }

    public boolean hasDuplicateTweet(Tweet tweet){
        // Check if tweets contains tweet
        for (Tweet eachTweet : tweets){
            if (tweet.getMessage().equals(eachTweet.getMessage())){
                return true;
            }
        }
        return false;
    }

    /**
     * throw an IllegalArgumentException when one tries to add a duplicate tweet
     * @param tweet
     * @throws IllegalArgumentException
     */
    public void addTweet(Tweet tweet) throws IllegalArgumentException{
        if (this.hasDuplicateTweet(tweet)){
            throw new IllegalArgumentException();
        } else {
            this.add(tweet);
        }
    }

    /**
     * return a list of tweets in chronological order
     */
    public ArrayList<Tweet> getTweets(){
        Collections.sort(tweets, new TweetComparator());

        return tweets;
    }

    /**
     * accurately count up the tweets
     */
    public int getCount(){
        return tweets.size();
    }
}
