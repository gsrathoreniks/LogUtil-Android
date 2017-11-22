package com.gsrathoreniks.logutil;

import android.util.Log;

/**
 * Created by gajendrasinghrathore on 22/11/17.
 */

public class LogWarn {
    private static final String TAG = "Warn Log";
    public static void w(String message){
        Log.w(TAG,message);
    }
}
