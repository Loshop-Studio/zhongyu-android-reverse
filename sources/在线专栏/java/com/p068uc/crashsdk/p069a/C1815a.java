package com.p068uc.crashsdk.p069a;

import android.util.Log;
import com.p068uc.crashsdk.C1823b;
import com.p068uc.crashsdk.C1828g;
import com.p068uc.crashsdk.JNIBridge;

/* renamed from: com.uc.crashsdk.a.a */
/* loaded from: classes.dex */
public final class C1815a {
    /* renamed from: a */
    public static void m6241a(String str) {
        if (C1828g.m6628M()) {
            Log.d("crashsdk", str);
        }
    }

    /* renamed from: b */
    public static void m6244b(String str) {
        if (C1828g.m6628M()) {
            Log.w("crashsdk", str);
        }
    }

    /* renamed from: c */
    public static void m6246c(String str, String str2) {
        if (C1823b.f8020d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m6247d(String str, String str2) {
        if (C1823b.f8020d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6242a(String str, String str2) {
        if (C1828g.m6628M()) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m6245b(String str, String str2) {
        if (C1823b.f8020d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m6243a(String str, String str2, Throwable th) {
        if (C1828g.m6628M()) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
