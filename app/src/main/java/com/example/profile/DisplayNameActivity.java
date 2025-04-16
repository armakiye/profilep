package com.example.profile;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.profile.R;

public class DisplayNameActivity extends Activity {


    private TextView textViewDisplayName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_name); // Make sure to create this layout


        textViewDisplayName = findViewById(R.id.tvdn);


        String firstName = getIntent().getStringExtra("FIRST_NAME");
        String lastName = getIntent().getStringExtra("LAST_NAME");


        String displayMessage = "Hello, " + firstName + " " + lastName + "!";


        textViewDisplayName.setText(displayMessage);

    }
}