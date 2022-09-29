package com.edulink.Android_App_Book;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();


        int splash_screen= 3300;

        new Handler().postDelayed(
                new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splash.this,Register.class);
                startActivity(intent);
                finish();
            }
        },splash_screen);

    }
}