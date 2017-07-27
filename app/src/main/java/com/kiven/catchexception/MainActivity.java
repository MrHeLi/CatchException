package com.kiven.catchexception;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    private static String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        String a = "2";
        a = a.substring(0, 3);
    }

}
