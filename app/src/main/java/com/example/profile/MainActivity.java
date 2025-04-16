package com.example.profile;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.profile.R;

public class MainActivity extends AppCompatActivity {

    // Declare the UI components
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private Button buttonSubmit;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Set the content view to the XML layout

        // Initialize the views
        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        buttonSubmit = findViewById(R.id.buttonSubmit);
    }
}