package com.gsrathoreniks.logutil;

import android.util.Log;

/**
 * Created by gajendrasinghrathore on 22/11/17.
 */

public class LogVerbose {
    private static final String TAG = "Verbose Log";
    public static void v(String message){
        Log.v(TAG,message);
    }
}
