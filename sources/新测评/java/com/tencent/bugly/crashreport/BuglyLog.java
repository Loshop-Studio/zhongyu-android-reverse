package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C6417ao;
import com.tencent.bugly.proguard.C6465p;

/* loaded from: classes4.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m4751d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z9 = C6465p.f5634a;
        C6417ao.m4940a("D", str, str2);
    }

    /* renamed from: e */
    public static void m4752e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6465p.f5636c) {
            Log.e(str, str2);
        }
        C6417ao.m4940a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m4754i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6465p.f5636c) {
            Log.i(str, str2);
        }
        C6417ao.m4940a("I", str, str2);
    }

    public static void setCache(int i10) {
        C6417ao.m4938a(i10);
    }

    /* renamed from: v */
    public static void m4755v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z9 = C6465p.f5634a;
        C6417ao.m4940a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m4756w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6465p.f5636c) {
            Log.w(str, str2);
        }
        C6417ao.m4940a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m4753e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6465p.f5636c) {
            Log.e(str, str2, th);
        }
        C6417ao.m4941a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
