package com.example.probnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        getSupportActionBar().hide();

        Button b = findViewById(R.id.Registration);
        b.setOnClickListener(view -> {
            Intent i = new Intent(SignIn.this,SignUp.class);
            startActivity(i);
        });

        Button b2 = findViewById(R.id.EnterToAccaunt);
        b2.setOnClickListener(view -> {
            Intent i = new Intent(SignIn.this, MainScreen.class);
            startActivity(i);
        });
    }
}