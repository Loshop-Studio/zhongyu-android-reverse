package com.p071uc.crashsdk.p072a;

import android.util.Log;
import com.p071uc.crashsdk.C6746b;
import com.p071uc.crashsdk.C6751g;
import com.p071uc.crashsdk.JNIBridge;

/* renamed from: com.uc.crashsdk.a.a */
/* loaded from: classes4.dex */
public final class C6738a {
    /* renamed from: a */
    public static void m5562a(String str) {
        C6751g.m5949M();
    }

    /* renamed from: b */
    public static void m5565b(String str) {
        if (C6751g.m5949M()) {
            Log.w("crashsdk", str);
        }
    }

    /* renamed from: c */
    public static void m5567c(String str, String str2) {
        if (C6746b.f6426d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m5568d(String str, String str2) {
        if (C6746b.f6426d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m5563a(String str, String str2) {
        if (C6751g.m5949M()) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m5566b(String str, String str2) {
        if (C6746b.f6426d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m5564a(String str, String str2, Throwable th) {
        if (C6751g.m5949M()) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
