package com.insieme;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Handler handler = new Handler();
        final Runnable doNextActivity = new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }
        };

        new Thread() {
            @Override
            public void run() {
                SystemClock.sleep(4000);
                handler.post(doNextActivity);
            }
        }.start();
    }

}