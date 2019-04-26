package com.example.minidemo.util;

import android.util.Log;

import com.example.minidemo.BuildConfig;

/**
 * @author bob
 * Date     19-4-25
 * Description 打印类 用于调试查看信息
 */
class DebugLog {
    private static final String TAG = "DebugLog";

    public void v(String string) {
        if (BuildConfig.DEBUG) {
            Log.v(TAG, string);
        }
    }

    public void v(String tag, String string) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, string);
        }
    }

    public void d(String string) {
        if (BuildConfig.DEBUG) {
            Log.d(TAG, string);
        }
    }

    public void d(String tag, String string) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, string);
        }
    }

    public void i(String string) {
        if (BuildConfig.DEBUG) {
            Log.i(TAG, string);
        }
    }

    public void i(String tag, String string) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, string);
        }
    }

    public void e(String string) {
        if (BuildConfig.DEBUG) {
            Log.e(TAG, string);
        }
    }

    public void e(String tag, String string) {
        if (BuildConfig.DEBUG) {
            Log.v(tag, string);
        }
    }
}
