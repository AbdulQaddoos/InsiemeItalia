package com.ibmclub.discounts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMap.CancelableCallback;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class SecondActivity extends FragmentActivity {
	ArrayList<MyLocation> locationList = new ArrayList<MyLocation>();
	SupportMapFragment mapFragment;
	private GoogleMap mMap; // Might be null if Google Play services APK is not
							// available.
	public static final String EXTRA_TYPE = "type";
	LatLngBounds.Builder builder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		int type = getIntent().getExtras().getInt(EXTRA_TYPE);
		locationList = MyLocation.getFilteredList(type);
		setUpMapIfNeeded();
	}

	private void setUpMapIfNeeded() {
		if (mMap == null) {
			mMap = ((SupportMapFragment) getSupportFragmentManager()
					.findFragmentById(R.id.map)).getMap();

			if (mMap != null) {
				setUpMap();
			}
		} else {
			setUpMap();
		}
	}

	@Override
	public void onResume() {
		super.onResume();
	}

	private void setUpMap() {
		mMap.setMyLocationEnabled(true);
		mMap.getUiSettings().setZoomControlsEnabled(true);
		builder = new LatLngBounds.Builder();
		for (int i = 0; i < locationList.size(); i++) {
			MyLocation myLocation = locationList.get(i);
			mMap.addMarker(new MarkerOptions().position(
					new LatLng(myLocation.getLocation().getLatitude(),
							myLocation.getLocation().getLongitude())).title(
					myLocation.getName()));
			LatLng latlng = new LatLng(myLocation.getLocation().getLatitude(),
					myLocation.getLocation().getLongitude());
			builder.include(latlng);
		}
		mMap.setOnCameraChangeListener(new OnCameraChangeListener() {

			@Override
			public void onCameraChange(CameraPosition arg0) {
				// TODO Auto-generated method stub
				mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(
						builder.build(), 50));

				// Remove listener to prevent position reset on camera move.
				mMap.setOnCameraChangeListener(null);

			}
		});
		mMap.setOnInfoWindowClickListener(new OnInfoWindowClickListener() {

			@Override
			public void onInfoWindowClick(Marker arg0) {
				int index = Integer.parseInt(arg0.getId().replace("m", ""));
				MyLocation mLocation = locationList.get(index);
				Intent intent = new Intent(SecondActivity.this,
						DetailActivity.class);
				intent.putExtra("locTitle", mLocation.getName());
				intent.putExtra("locDescription", mLocation.getDescription());
				intent.putExtra("locDrawable", mLocation.getDrawable());
				intent.putExtra("locLat", mLocation.getLocation().getLatitude());
				intent.putExtra("locLng", mLocation.getLocation()
						.getLongitude());

				double lat = 0, lng = 0;
				try {
					lat = mMap.getMyLocation().getLatitude();
					lng = mMap.getMyLocation().getLongitude();
				} catch (Exception e) {

				}
				intent.putExtra("lat", lat);
				intent.putExtra("lng", lng);
				startActivity(intent);
			}
		});
	}

	void animateCameraTo(final double lat, final double lng) {
		CameraPosition camPosition = mMap.getCameraPosition();
		if (!((Math.floor(camPosition.target.latitude * 100) / 100) == (Math
				.floor(lat * 100) / 100) && (Math
				.floor(camPosition.target.longitude * 100) / 100) == (Math
				.floor(lng * 100) / 100))) {
			mMap.getUiSettings().setScrollGesturesEnabled(false);

			mMap.animateCamera(
					CameraUpdateFactory.newLatLng(new LatLng(lat, lng)),
					new CancelableCallback() {

						@Override
						public void onFinish() {
							mMap.getUiSettings().setScrollGesturesEnabled(true);
						}

						@Override
						public void onCancel() {
							mMap.getUiSettings().setAllGesturesEnabled(true);
						}
					});
			mMap.setOnCameraChangeListener(new OnCameraChangeListener() {

				@Override
				public void onCameraChange(CameraPosition arg0) {

					LatLngBounds.Builder builder = new LatLngBounds.Builder();
					builder.include((new LatLng(lat, lng)));
					if (mMap.getMyLocation() != null) {
						builder.include((new LatLng(mMap.getMyLocation()
								.getLatitude(), mMap.getMyLocation()
								.getLongitude())));
					}
					mMap.moveCamera(CameraUpdateFactory.newLatLngBounds(
							builder.build(), 200));
					// Remove listener to prevent position reset on camera move.
					mMap.setOnCameraChangeListener(null);
				}
			});
		}

	}

}
