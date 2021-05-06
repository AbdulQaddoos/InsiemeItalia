package com.insieme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void aboutUs(View view) {
        Intent aboutusBtn = new Intent(MenuActivity.this, MainActivityAbout.class);
        MenuActivity.this.startActivity(aboutusBtn);
    }

    public void services(View view) {
        Intent intent = new Intent(MenuActivity.this, ServicesActivity.class);
        MenuActivity.this.startActivity(intent);
    }

//    public void about_us(View view) {
//        Intent intent = new Intent(MenuActivity.this, ServicesActivity.class);
//        MenuActivity.this.startActivity(intent);
//    }


    public void contactUs(View view) {
        Intent contactBtn = new Intent(MenuActivity.this, MainActivityList.class);
        MenuActivity.this.startActivity(contactBtn);
    }

    public void appointments(View view) {
        Intent appoint = new Intent(MenuActivity.this, appointments.class);
        MenuActivity.this.startActivity(appoint);
    }
}