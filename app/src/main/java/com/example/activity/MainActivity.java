package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // create tag for the activity to use in log
    public static final String TAG = MainActivity.class.getSimpleName();

    public int counter = 0;

    private void logMethodCall(String methodName) {
        counter++;
        Log.d(TAG, counter + ". " + methodName + " called");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logMethodCall("onCreate()");

        // get the button from the view
        Button button = findViewById(R.id.change_activity);

        // add click listener for the button
        button.setOnClickListener(view -> {
            // create a intent object for going to another activity
            Intent intent = new Intent(MainActivity.this, Activity2.class);

            // pass values to another activity
            intent.putExtra("value 1", 100);
            intent.putExtra("value 2", 200);

            // change the activity
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        logMethodCall("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        logMethodCall("onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        logMethodCall("onDestroy()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        logMethodCall("onStop()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        logMethodCall("onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        logMethodCall("onRestart()");
    }
}