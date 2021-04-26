package com.ibmclub.discounts;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityListedCom extends Activity implements OnClickListener {

	Button Ibmmap, childcareEdu, electronics, foods, finance, realEstate,Quickdirection, healthBody,
			sports, travel, others, Exit;

	MyLocation myLocation;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainlistedcom);

		Ibmmap = (Button) findViewById(R.id.amBtnIBMmap);
		childcareEdu = (Button) findViewById(R.id.amBtnChildEdu);
		electronics = (Button) findViewById(R.id.amBtnElectronics);
		foods = (Button) findViewById(R.id.amBtnFoods);
		finance = (Button) findViewById(R.id.amBtnFinance);
		//realEstate= (Button) findViewById(R.id.amBtnRealestate);
		//healthBody = (Button) findViewById(R.id.amBtnHealthBody);
		//sports = (Button) findViewById(R.id.amBtnSports);
		//travel = (Button) findViewById(R.id.amBtnTravel);
		Quickdirection = (Button) findViewById(R.id.amDirection);
//		Exit = (Button) findViewById(R.id.amExit);

		Ibmmap.setOnClickListener(this);
		childcareEdu.setOnClickListener(this);
		electronics.setOnClickListener(this);
		foods.setOnClickListener(this);
		finance.setOnClickListener(this);
		Quickdirection.setOnClickListener(this);
//		realEstate.setOnClickListener(this);
//		healthBody.setOnClickListener(this);
//		sports.setOnClickListener(this);
//		travel.setOnClickListener(this);
		// onBackPressed();
//		Quickdirection.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//				// finish();
//				// System.exit(0);
//				try {
//					// final Double myLat =
//					// getIntent().getExtras().getDouble("lat");
//					// final Double myLng =
//					// getIntent().getExtras().getDouble("lng");
//					String myLat = "";
//					String myLng = "";
//					Intent intent = new Intent(
//							android.content.Intent.ACTION_VIEW, Uri
//									.parse("http://maps.google.com/maps?saddr="
//											+ myLat + " " + myLng + "&daddr="
//											+ myLat + " " + myLng));
//					intent.setClassName("com.google.android.apps.maps",
//							"com.google.android.maps.MapsActivity");
//					startActivity(intent);
//				} catch (Exception e) {
//					Toast.makeText(MainActivityListedCom.this,
//							"Your location not found", Toast.LENGTH_SHORT)
//							.show();
//					e.printStackTrace();
//
//				}
//
//			}
//		});


	}

	@Override
	public void onClick(View v) {
		int type = 0;
		switch (v.getId()) {
		case R.id.amBtnIBMmap:
			type = 0;
			break;
		case R.id.amBtnChildEdu:
			type = 1;
			break;
		case R.id.amBtnElectronics:
			type = 2;
			break;
		case R.id.amBtnFoods:
			type = 3;
			break;
		case R.id.amBtnFinance:
			type = 4;
			break;
//		case R.id.amBtnRealestate:
//			type = 5;
//			break;
//		case R.id.amBtnHealthBody:
//			type = 6;
//			break;
//		case R.id.amBtnSports:
//			type = 7;
//			break;
//		case R.id.amBtnTravel:
//			type = 8;
//			break;
		default:
			break;
		}
		startNextActivity(type);

	}

	void startNextActivity(int type) {
		Intent secInt = new Intent(MainActivityListedCom.this, appointments.class);
		secInt.putExtra("type", type);
		startActivity(secInt);
	}


	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
//			Toast.makeText(this, "To go to setting", 3000).show();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
