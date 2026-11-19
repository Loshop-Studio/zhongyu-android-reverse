package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C4058ao;
import com.tencent.bugly.proguard.C4129p;

/* loaded from: classes3.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m2850d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.d(str, str2);
        }
        C4058ao.m3038a("D", str, str2);
    }

    /* renamed from: e */
    public static void m2851e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.e(str, str2);
        }
        C4058ao.m3038a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m2853i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.i(str, str2);
        }
        C4058ao.m3038a("I", str, str2);
    }

    public static void setCache(int i) {
        C4058ao.m3036a(i);
    }

    /* renamed from: v */
    public static void m2854v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.v(str, str2);
        }
        C4058ao.m3038a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m2855w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.w(str, str2);
        }
        C4058ao.m3038a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m2852e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C4129p.f3864c) {
            Log.e(str, str2, th);
        }
        C4058ao.m3039a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
