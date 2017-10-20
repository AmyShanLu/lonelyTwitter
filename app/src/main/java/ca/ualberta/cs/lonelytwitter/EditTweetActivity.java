package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent mIntent = getIntent();
        // Get the selected Tweet's message
        String selected_Tweet_message = mIntent.getStringExtra("Tweet Message");
        // Display the tweet in the EditTweet activity
        ((TextView) findViewById(R.id.edit_text_activity)).setText(selected_Tweet_message);
    }
}
