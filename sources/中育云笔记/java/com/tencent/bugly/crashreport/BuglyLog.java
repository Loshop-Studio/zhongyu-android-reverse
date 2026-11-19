package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C7782ao;
import com.tencent.bugly.proguard.C7830p;

/* loaded from: classes5.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m10441d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z10 = C7830p.f14076a;
        C7782ao.m10630a("D", str, str2);
    }

    /* renamed from: e */
    public static void m10442e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C7830p.f14078c) {
            Log.e(str, str2);
        }
        C7782ao.m10630a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m10444i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C7830p.f14078c) {
            Log.i(str, str2);
        }
        C7782ao.m10630a("I", str, str2);
    }

    public static void setCache(int i10) {
        C7782ao.m10628a(i10);
    }

    /* renamed from: v */
    public static void m10445v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z10 = C7830p.f14076a;
        C7782ao.m10630a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m10446w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C7830p.f14078c) {
            Log.w(str, str2);
        }
        C7782ao.m10630a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m10443e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C7830p.f14078c) {
            Log.e(str, str2, th);
        }
        C7782ao.m10631a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
