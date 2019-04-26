package com.example.minidemo;

import android.app.Application;
import android.content.Context;

/**
 * @author bob
 * Date     19-4-26
 * Description
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
