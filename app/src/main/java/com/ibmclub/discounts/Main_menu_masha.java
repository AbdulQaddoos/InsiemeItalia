package com.ibmclub.discounts;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;



public class Main_menu_masha extends Activity implements
		GoogleApiClient.ConnectionCallbacks,
		GoogleApiClient.OnConnectionFailedListener, OnClickListener {
	ImageView aboutIBM, nearestplaces_masha, current_masha, discounts;
	Location mLastLocation_masha;
	public LocationManager mLocationManager_masha, lm_masha;
	Double localDouble2_masha, localDouble1_masha;

	Dialog dialog_masha;


	LayoutInflater inflater_masha;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);





		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu_masha);
//		AlertDialog.Builder builderabc = new AlertDialog.Builder(this);
//		builderabc.setIcon(R.drawable.gps);
//		builderabc.setMessage("Discounts are available only for IBMers.")
//				.setCancelable(false)
//				.setPositiveButton("Continue",
//						new DialogInterface.OnClickListener() {
//							public void onClick(DialogInterface dialog,
//                                                int id) {
//								//Intent intent = new Intent(
////										Settings.ACTION_LOCATION_SOURCE_SETTINGS);
//								//startActivity(intent);
//							}
//						});
//		AlertDialog alertabc = builderabc.create();
//
//		alertabc.setTitle("Disclaimer");
//		alertabc.show();





		lm_masha = (LocationManager) getSystemService(LOCATION_SERVICE);
		if (!lm_masha.isProviderEnabled(LocationManager.GPS_PROVIDER)
				|| !lm_masha.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
			AlertDialog.Builder builder = new AlertDialog.Builder(this);
			builder.setIcon(R.drawable.gps);
			builder.setMessage("you want to open the GPS?")
					.setCancelable(false)
					.setPositiveButton("Yes",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
                                                    int id) {
									Intent intent = new Intent(
											Settings.ACTION_LOCATION_SOURCE_SETTINGS);
									startActivity(intent);
								}
							})
					.setNegativeButton("No",
							new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog,
                                                    int id) {

									dialog.cancel();
								}
							});

			AlertDialog alert = builder.create();

			alert.setTitle("Your Mobile GPS is OFF");
			alert.show();

		}
		aboutIBM = (ImageView)findViewById(R.id.mydistination_masha);
		nearestplaces_masha = (ImageView) findViewById(R.id.nearest_masha);
		current_masha = (ImageView) findViewById(R.id.current_masha);
		discounts = (ImageView) findViewById(R.id.route_masha);


		aboutIBM.setOnClickListener(this);
		nearestplaces_masha.setOnClickListener(this);
		current_masha.setOnClickListener(this);
		discounts.setOnClickListener(this);
	}





	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {

			case R.id.mydistination_masha:

				Intent localIntent = new Intent(Main_menu_masha.this,MainActivityAbout.class);
				startActivity(localIntent);

				break;
			case R.id.nearest_masha:




				Intent i = new Intent(Main_menu_masha.this,
						MainActivityListedCom.class);
				startActivity(i);

			break;

		case R.id.current_masha:


				Intent twolocations = new Intent(Main_menu_masha.this,
						appointments.class);
				startActivity(twolocations);





			break;

		case R.id.route_masha:


					Intent twolocation = new Intent(Main_menu_masha.this,

					MainActivityList.class);
					startActivity(twolocation);



				break;

			}
		}


	private final LocationListener mLocationListener = new LocationListener() {
		@Override
		public void onLocationChanged(Location location) {

			mLastLocation_masha = location;
			localDouble1_masha = location.getLongitude();
			localDouble2_masha = location.getLatitude();

		}

		@Override
		public void onStatusChanged(String provider, int status, Bundle extras) {

		}

		@Override
		public void onProviderEnabled(String provider) {

		}

		@Override
		public void onProviderDisabled(String provider) {

		}
	};

	@Override
	public void onConnected(Bundle bundle) {

	}

	@Override
	public void onConnectionSuspended(int i) {

	}

	@Override
	public void onConnectionFailed(ConnectionResult connectionResult) {

	}

}
