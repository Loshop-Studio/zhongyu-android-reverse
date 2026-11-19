package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C5794ao;
import com.tencent.bugly.proguard.C5842p;

/* loaded from: classes3.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m3756d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z6 = C5842p.f4355a;
        C5794ao.m3945a("D", str, str2);
    }

    /* renamed from: e */
    public static void m3757e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C5842p.f4357c) {
            Log.e(str, str2);
        }
        C5794ao.m3945a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m3759i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C5842p.f4357c) {
            Log.i(str, str2);
        }
        C5794ao.m3945a("I", str, str2);
    }

    public static void setCache(int i6) {
        C5794ao.m3943a(i6);
    }

    /* renamed from: v */
    public static void m3760v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z6 = C5842p.f4355a;
        C5794ao.m3945a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m3761w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C5842p.f4357c) {
            Log.w(str, str2);
        }
        C5794ao.m3945a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m3758e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C5842p.f4357c) {
            Log.e(str, str2, th);
        }
        C5794ao.m3946a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
