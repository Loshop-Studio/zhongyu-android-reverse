package com.tencent.bugly.crashreport;

import android.util.Log;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.proguard.C6677ao;
import com.tencent.bugly.proguard.C6725p;

/* loaded from: classes4.dex */
public class BuglyLog {
    /* renamed from: d */
    public static void m4930d(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z9 = C6725p.f6211a;
        C6677ao.m5119a("D", str, str2);
    }

    /* renamed from: e */
    public static void m4931e(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6725p.f6213c) {
            Log.e(str, str2);
        }
        C6677ao.m5119a(ExifInterface.LONGITUDE_EAST, str, str2);
    }

    /* renamed from: i */
    public static void m4933i(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6725p.f6213c) {
            Log.i(str, str2);
        }
        C6677ao.m5119a("I", str, str2);
    }

    public static void setCache(int i9) {
        C6677ao.m5117a(i9);
    }

    /* renamed from: v */
    public static void m4934v(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        boolean z9 = C6725p.f6211a;
        C6677ao.m5119a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, str, str2);
    }

    /* renamed from: w */
    public static void m4935w(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6725p.f6213c) {
            Log.w(str, str2);
        }
        C6677ao.m5119a(ExifInterface.LONGITUDE_WEST, str, str2);
    }

    /* renamed from: e */
    public static void m4932e(String str, String str2, Throwable th) {
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "null";
        }
        if (C6725p.f6213c) {
            Log.e(str, str2, th);
        }
        C6677ao.m5120a(ExifInterface.LONGITUDE_EAST, str, th);
    }
}
