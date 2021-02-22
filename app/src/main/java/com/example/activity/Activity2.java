package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        // catch the intent from previous activity
        Intent intent = getIntent();

        // get the value passed in the intent
        int value1 = intent.getIntExtra("value 1", 0);
        int value2 = intent.getIntExtra("value 2", 0);

        // display the value passed in the intent
        TextView textView = findViewById(R.id.intent_value);
        textView.setText("Value 1: " + value1 + ", Value 2: " + value2);
    }
}