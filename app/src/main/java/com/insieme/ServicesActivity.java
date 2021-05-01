package com.insieme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class ServicesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);
    }

    public void rem(View view) {
        Intent intent = new Intent(ServicesActivity.this, RemActivity.class);
       ServicesActivity.this.startActivity(intent);
    }

    public void italianCode(View view) {
    }
}