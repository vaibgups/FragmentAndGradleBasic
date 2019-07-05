package com.example.fragmentandgradlebasic;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, ""+ BuildConfig.BASE_URL);
        Log.i(TAG, ""+ BuildConfig.API_URL);
        Log.i(TAG, " BuildConfig "+ BuildConfig.APP_KEY_1);
        Log.i(TAG, " getString "+getString(R.string.APP_KEY_2));
    }
}
