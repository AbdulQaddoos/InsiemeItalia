package com.ibmclub.discounts;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

import com.google.android.gms.location.LocationListener;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;



public class MainActivity_masha extends FragmentActivity implements LocationListener,
        android.location.LocationListener {
    GoogleMap mMap_masha;
    RadioGroup rgViews_masha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main_masha);

        rgViews_masha = (RadioGroup) findViewById(R.id.rg_views_masha);
        mMap_masha = ((MapFragment) getFragmentManager().findFragmentById(
                R.id.map)).getMap();

        if (mMap_masha != null) {
            mMap_masha.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            mMap_masha.setMyLocationEnabled(true);


            rgViews_masha
                    .setOnCheckedChangeListener(new OnCheckedChangeListener() {

                        @Override
                        public void onCheckedChanged(RadioGroup group,
                                                     int checkedId) {
                            if (checkedId == R.id.rb_normal) {

                                mMap_masha.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                            } else if (checkedId == R.id.rb_satellite) {
                                mMap_masha.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                            } else if (checkedId == R.id.rb_terrain) {
                                mMap_masha.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
                            } else if (checkedId == R.id.rb_hybride) {
                                mMap_masha.setMapType(GoogleMap.MAP_TYPE_HYBRID);
                            }
                        }
                    });

        }

        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        locationManager.requestLocationUpdates(
                LocationManager.NETWORK_PROVIDER, 1, 1, this);

    }

    @Override
    public void onLocationChanged(Location location) {

        mMap_masha.clear();

        LatLng latLng = new LatLng(location.getLatitude(),
                location.getLongitude());

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(latLng);
        markerOptions.title("My Location");

        mMap_masha.addMarker(markerOptions);

        mMap_masha.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 16.0f));
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
}