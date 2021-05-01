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
    }

    public void services(View view) {
        Intent intent = new Intent(MenuActivity.this, ServicesActivity.class);
        MenuActivity.this.startActivity(intent);
    }

    public void contactUs(View view) {
    }
}