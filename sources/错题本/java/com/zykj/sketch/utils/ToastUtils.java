package com.zykj.sketch.utils;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes3.dex */
public class ToastUtils {
    public static boolean isShow = true;

    private ToastUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static void show(Context context, CharSequence charSequence, int i) {
        if (isShow) {
            Toast.makeText(context, charSequence, i).show();
        }
    }

    public static void showLong(Context context, CharSequence charSequence) {
        if (isShow) {
            Toast.makeText(context, charSequence, 1).show();
        }
    }

    public static void showShort(Context context, CharSequence charSequence) {
        if (isShow) {
            Toast.makeText(context, charSequence, 0).show();
        }
    }

    public static void show(Context context, int i, int i8) {
        if (isShow) {
            Toast.makeText(context, i, i8).show();
        }
    }

    public static void showLong(Context context, int i) {
        if (isShow) {
            Toast.makeText(context, i, 1).show();
        }
    }

    public static void showShort(Context context, int i) {
        if (isShow) {
            Toast.makeText(context, i, 0).show();
        }
    }
}
