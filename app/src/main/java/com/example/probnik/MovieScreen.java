package com.example.probnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MovieScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_screen);
        getSupportActionBar().hide();

        Button b=findViewById(R.id.back);
        b.setOnClickListener(view -> {
            Intent i = new Intent(MovieScreen.this, MainScreen.class);
            startActivity(i);
        });
    }
}