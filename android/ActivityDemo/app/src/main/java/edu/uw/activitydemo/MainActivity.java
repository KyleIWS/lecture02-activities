package edu.uw.activitydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt = (Button) findViewById(R.id.button);
        butt.setOnClickListener(new View.onClickListeneer() {
            Log.v(TAG, "STUFF");
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.v(TAG, "You made it bruh, startin that thang");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.v(TAG, "made it to resume, my man");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.v(TAG, "You're a wizard Harry (stop)");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.v(TAG, "The end of The Iron Giant");
    }
}
