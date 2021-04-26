package com.ibmclub.discounts;



import android.app.Activity;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends Activity implements OnClickListener {
	ImageView iv;
	TextView tvTitle, tvDescription;
	Button btnDirection;
	MyLocation myLocation;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_detail);
		String title = getIntent().getExtras().getString("locTitle");
		String description = getIntent().getExtras()
				.getString("locDescription");
		int img = getIntent().getExtras().getInt("locDrawable");
		double lat = getIntent().getExtras().getDouble("locLat");
		double lng = getIntent().getExtras().getDouble("locLng");
		Location loc = new Location("gps");
		loc.setLatitude(lat);
		loc.setLongitude(lng);
		myLocation = new MyLocation(title, description, loc, 0, img);

		iv = (ImageView) findViewById(R.id.adIv);
		tvTitle = (TextView) findViewById(R.id.adTvTitle);
		tvDescription = (TextView) findViewById(R.id.adTvDesc);
		btnDirection = (Button) findViewById(R.id.adBtnDirection);
		btnDirection.setOnClickListener(this);


		iv.setImageResource(myLocation.getDrawable());
		tvTitle.setText(myLocation.getName());
		tvDescription.setText(myLocation.getDescription());
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.adBtnDirection:
			findDirecttion();
			break;

		default:
			break;
		}
		

	}

	private void findDirecttion() {
		try {
			final Double myLat = getIntent().getExtras().getDouble("lat");
			final Double myLng = getIntent().getExtras().getDouble("lng");
			Intent intent = new Intent(android.content.Intent.ACTION_VIEW,
					Uri.parse("http://maps.google.com/maps?saddr=" + myLat
							+ "," + myLng + "&daddr="
							+ myLocation.getLocation().getLatitude() + ","
							+ myLocation.getLocation().getLongitude()));
			intent.setClassName("com.google.android.apps.maps",
					"com.google.android.maps.MapsActivity");
			startActivity(intent);
		} catch (Exception e) {
			Toast.makeText(DetailActivity.this, "Your location not found",
					Toast.LENGTH_SHORT).show();
			e.printStackTrace();
		}
	}
}
