package com.gsrathoreniks.logutilexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gsrathoreniks.logutil.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogDebug.d("This is Debug Log");
        LogVerbose.v("This is Verbose Log");
        LogError.e("This is Error Log");
        LogInfo.i("This is Info Log");
        LogWarn.w("This is Warn Log");

    }
}
