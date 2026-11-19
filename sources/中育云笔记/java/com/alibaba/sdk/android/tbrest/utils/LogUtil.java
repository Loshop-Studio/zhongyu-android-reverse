package com.alibaba.sdk.android.tbrest.utils;

import android.util.Log;

/* loaded from: classes3.dex */
public class LogUtil {
    public static final String TAG = "RestApi";

    /* renamed from: d */
    public static void m3869d(String str) {
    }

    /* renamed from: e */
    public static void m3870e(String str) {
        Log.e(TAG, str);
    }

    /* renamed from: i */
    public static void m3872i(String str) {
        Log.i(TAG, str);
    }

    /* renamed from: w */
    public static void m3873w(String str, Throwable th) {
        Log.w(TAG, str, th);
    }

    /* renamed from: e */
    public static void m3871e(String str, Throwable th) {
        Log.e(TAG, str, th);
    }
}
