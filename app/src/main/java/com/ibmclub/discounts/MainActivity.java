package com.ibmclub.discounts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		setViewClickListener();
	}

	private void setViewClickListener() {


		View view = findViewById(R.id.json_array_request);
		if (view != null)
			view.setOnClickListener(this);


	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

//			case R.id.json_array_request:
//				startActivity(new Intent(MainActivity.this, JsonArrayRequestActivity.class));
//				break;

		}
	}
}
