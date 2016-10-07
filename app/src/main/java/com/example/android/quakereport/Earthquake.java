package com.example.android.quakereport;

/**
 * Created by ncpow on 10/5/2016.
 */

public class Earthquake {
    private String mLocation;

    private String mTimeInMilliseconds;

    private String mMagnitude;


    //earthquake constructor
    public Earthquake(String magnitude, String location, String timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }


    //returns the location
    public String getEarthquakeLocation() {
        return mLocation;
    }


    //gets the time in UNIX time
    public String getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


    //gets the magnitude of the earthquake
    public String getMagnitude() {
        return mMagnitude;
    }
}
