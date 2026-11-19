package com.zykj.utlils;

import android.util.Log;

/* loaded from: classes.dex */
public class LogUtils {
    private static final String TAG = "LogUtils";
    public static boolean isDebug = true;

    private LogUtils() {
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /* renamed from: i */
    public static void m12i(String str) {
        if (isDebug) {
            Log.i(TAG, str);
        }
    }

    /* renamed from: d */
    public static void m8d(String str) {
        if (isDebug) {
            Log.d(TAG, str);
        }
    }

    /* renamed from: e */
    public static void m10e(String str) {
        if (isDebug) {
            Log.e(TAG, str);
        }
    }

    /* renamed from: v */
    public static void m14v(String str) {
        if (isDebug) {
            Log.v(TAG, str);
        }
    }

    /* renamed from: i */
    public static void m13i(String str, String str2) {
        if (isDebug) {
            Log.i(str, str2);
        }
    }

    /* renamed from: d */
    public static void m9d(String str, String str2) {
        if (isDebug) {
            Log.d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m11e(String str, String str2) {
        if (isDebug) {
            Log.e(str, str2);
        }
    }

    /* renamed from: v */
    public static void m15v(String str, String str2) {
        if (isDebug) {
            Log.v(str, str2);
        }
    }
}
