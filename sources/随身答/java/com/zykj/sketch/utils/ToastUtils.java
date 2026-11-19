package com.zykj.sketch.utils;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes5.dex */
public class ToastUtils {
    public static boolean isShow = true;

    private ToastUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static void show(Context context, CharSequence charSequence, int i9) {
        if (isShow) {
            Toast.makeText(context, charSequence, i9).show();
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

    public static void show(Context context, int i9, int i10) {
        if (isShow) {
            Toast.makeText(context, i9, i10).show();
        }
    }

    public static void showLong(Context context, int i9) {
        if (isShow) {
            Toast.makeText(context, i9, 1).show();
        }
    }

    public static void showShort(Context context, int i9) {
        if (isShow) {
            Toast.makeText(context, i9, 0).show();
        }
    }
}
