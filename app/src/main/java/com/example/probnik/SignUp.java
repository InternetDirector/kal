package com.example.probnik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        getSupportActionBar().hide();

        Button b =findViewById(R.id.ToReg);
        b.setOnClickListener(view -> {
            Intent i = new Intent(SignUp.this, MainScreen.class);
            startActivity(i);
        });

        Button b1=findViewById(R.id.HaveAccaunt);
        b1.setOnClickListener(view -> {
            Intent i = new Intent(SignUp.this, SignIn.class);
            startActivity(i);
        });
    }
}