package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C6439ao;
import com.tencent.bugly.proguard.C6487p;

/* loaded from: classes4.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m4111d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z10 = C6487p.f4977a;
        C6439ao.m4300a("D", str, str2);
    }

    /* renamed from: e */
    public static void m4112e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6487p.f4979c) {
            Log.e(str, str2);
        }
        C6439ao.m4300a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m4114i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6487p.f4979c) {
            Log.i(str, str2);
        }
        C6439ao.m4300a("I", str, str2);
    }

    public static void setCache(int i10) {
        C6439ao.m4298a(i10);
    }

    /* renamed from: v */
    public static void m4115v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z10 = C6487p.f4977a;
        C6439ao.m4300a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m4116w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6487p.f4979c) {
            Log.w(str, str2);
        }
        C6439ao.m4300a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m4113e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6487p.f4979c) {
            Log.e(str, str2, th);
        }
        C6439ao.m4301a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
