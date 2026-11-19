package com.zykj.sketch.utils;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes6.dex */
public class ToastUtils {
    public static boolean isShow = true;

    private ToastUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    public static void show(Context context, CharSequence charSequence, int i10) {
        if (isShow) {
            Toast.makeText(context, charSequence, i10).show();
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

    public static void show(Context context, int i10, int i11) {
        if (isShow) {
            Toast.makeText(context, i10, i11).show();
        }
    }

    public static void showLong(Context context, int i10) {
        if (isShow) {
            Toast.makeText(context, i10, 1).show();
        }
    }

    public static void showShort(Context context, int i10) {
        if (isShow) {
            Toast.makeText(context, i10, 0).show();
        }
    }
}
