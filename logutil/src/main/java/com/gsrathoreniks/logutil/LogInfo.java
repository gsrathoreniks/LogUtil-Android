package com.gsrathoreniks.logutil;

import android.util.Log;

/**
 * Created by gajendrasinghrathore on 22/11/17.
 */

public class LogInfo {
    private static final String TAG = "Info Log";
    public static void i(String message){
        Log.i(TAG,message);
    }
}
