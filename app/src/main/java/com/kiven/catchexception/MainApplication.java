package com.kiven.catchexception;

import android.app.Application;

/**
 * Created by Kiven on 2017/7/27.
 * Details:
 */

public class MainApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}
