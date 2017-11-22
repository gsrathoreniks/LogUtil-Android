package com.gsrathoreniks.logutil;

import android.util.Log;

/**
 * Created by gajendrasinghrathore on 22/11/17.
 */

public class LogError {
    private static final String TAG = "Error Log";
    public static void e(String message){
        Log.e(TAG,message);
    }
}
