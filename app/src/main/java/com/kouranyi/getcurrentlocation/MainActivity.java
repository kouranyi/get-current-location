package com.kouranyi.getcurrentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {

    private FusedLocationProviderClient mFusedLocationClient;
    private LocationRequest mLocationRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFusedLocationProviderClient();
        createLocationRequest();
    }


    private void createFusedLocationProviderClient() {
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    }
    private void createLocationRequest() {

        mLocationRequest = LocationRequest.create();
        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
        mLocationRequest.setInterval(10*000); //get updated about location changes every 5 seconds
        mLocationRequest.setFastestInterval(5000); // update rate upper limit is 5 seconds
    }
}
