package com.p040uc.crashsdk.p041a;

import android.util.Log;
import com.p040uc.crashsdk.C3307b;
import com.p040uc.crashsdk.C3312g;
import com.p040uc.crashsdk.JNIBridge;

/* renamed from: com.uc.crashsdk.a.a */
/* loaded from: classes2.dex */
public final class C3299a {
    /* renamed from: a */
    public static void m2318a(String str) {
        C3312g.m2705M();
    }

    /* renamed from: b */
    public static void m2321b(String str) {
        if (C3312g.m2705M()) {
            Log.w("crashsdk", str);
        }
    }

    /* renamed from: c */
    public static void m2323c(String str, String str2) {
        if (C3307b.f1428d) {
            JNIBridge.nativeLog(5, str, str2);
        } else {
            Log.w(str, str2);
        }
    }

    /* renamed from: d */
    public static void m2324d(String str, String str2) {
        if (C3307b.f1428d) {
            JNIBridge.nativeLog(6, str, str2);
        } else {
            Log.e(str, str2);
        }
    }

    /* renamed from: a */
    public static void m2319a(String str, String str2) {
        if (C3312g.m2705M()) {
            Log.i(str, str2);
        }
    }

    /* renamed from: b */
    public static void m2322b(String str, String str2) {
        if (C3307b.f1428d) {
            JNIBridge.nativeLog(4, str, str2);
        } else {
            Log.i(str, str2);
        }
    }

    /* renamed from: a */
    public static void m2320a(String str, String str2, Throwable th) {
        if (C3312g.m2705M()) {
            if (th == null) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, th);
            }
        }
    }
}
