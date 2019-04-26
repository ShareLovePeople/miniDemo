package com.example.minidemo.util;

import android.widget.Toast;

import com.example.minidemo.MyApplication;

/**
 * @author bob
 * Date     19-4-26
 * Description 全局Toast类
 */
public class ToastUtil {
    private static Toast toast = null;

    public static void show(CharSequence text, int toastDuration) {
        try {
            toast.getView().isShown();
            toast.setText(text);
        } catch (Exception e) {
            toast = Toast.makeText(MyApplication.getContext(), text, toastDuration);
        }
        toast.show();
    }

    public static void show(CharSequence text) {
        show(text, Toast.LENGTH_SHORT);
    }
}
