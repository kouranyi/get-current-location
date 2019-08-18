package com.kouranyi.getcurrentlocation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

public class MainActivity extends AppCompatActivity {

    private FusedLocationProviderClient mFusedLocationClient;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createFusedLocationProviderClient();
    }


    private void createFusedLocationProviderClient() {
        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
    }
}
