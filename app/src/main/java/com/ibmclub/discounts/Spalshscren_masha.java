package com.ibmclub.discounts;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

public class Spalshscren_masha extends Activity {

	private static int SPLASH_TIME_OUT = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.spalshscren_masha);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				Intent i = new Intent(Spalshscren_masha.this,
						Main_menu_masha.class);

				startActivity(i);
				finish();
			}
		}, SPLASH_TIME_OUT);
	}

}
