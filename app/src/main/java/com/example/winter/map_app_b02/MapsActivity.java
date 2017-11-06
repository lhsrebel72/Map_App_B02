package com.example.winter.map_app_b02;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private UiSettings mUiSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        //Sets up map settings
        mMap = googleMap;
        mUiSettings = mMap.getUiSettings();
        mUiSettings.setZoomControlsEnabled(true);

        //Sets up markers
        ArrayList<ParkingMeterData> meters = new ArrayList<>();
        /*
        id;
        isAvailable;
        timeTillAvailble;
        price;
        timePerUse;
        latlng;
        address;
        */

        LatLng dillionAddress = new LatLng(31.7942, -85.9452);
        LatLng universityAvenue = new LatLng(31.7988, -85.957);
        LatLng walmartAddress = new LatLng(31.7789, -85.9411);
        LatLng tcAddress = new LatLng(31.8018, -85.9554);

        mMap.addMarker(new MarkerOptions()
                .position(dillionAddress)
                .title("Dillion's Meter")
                .snippet("id: 11111\n" +
                        "Street addres: " +
                        "\tLINE 1: 205 S Franklin Dr\n" +
                        "\tLINE 2: \n" +
                        "\tTroy, AL 36081 \n" +
                        "In use?: YES\n" +
                        "Is Active for user?: YES\n" +
                        "How much longer is active: 1 hour"));
        mMap.addMarker(new MarkerOptions()
                .position(universityAvenue)
                .title("Class's Meter")
                .snippet("id: 11112\n" +
                        "Street addres: " +
                        "\tLINE 1:\n" +
                        "\tLINE 2: \n" +
                        "\t\n" +
                        "In use?: NO\n" +
                        "Is Active for user?: NO\n" +
                        "How much longer is active: N/A"));
        mMap.addMarker(new MarkerOptions()
                .position(walmartAddress)
                .title("Walmart's Meter")
                .snippet("id: 11113\n" +
                        "Street addres: " +
                        "\tLINE 1:\n" +
                        "\tLINE 2: \n" +
                        "\t\n" +
                        "In use?: NO\n" +
                        "Is Active for user?: NO\n" +
                        "How much longer is active: N/A"));
        mMap.addMarker(new MarkerOptions()
                .position(tcAddress)
                .title("TC's Meter")
                .snippet("id: 11114\n" +
                        "Street addres: " +
                        "\tLINE 1:\n" +
                        "\tLINE 2: \n" +
                        "\t\n" +
                        "In use?: NO\n" +
                        "Is Active for user?: NO\n" +
                        "How much longer is active: N/A"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(universityAvenue));
    }
}
