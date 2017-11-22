package com.gsrathoreniks.logutil;

import android.util.Log;

/**
 * Created by gajendrasinghrathore on 22/11/17.
 */

public class LogDebug {
    private static final String TAG = "Debug Log";
    public static void d(String message){
        Log.d(TAG,message);
    }
}
