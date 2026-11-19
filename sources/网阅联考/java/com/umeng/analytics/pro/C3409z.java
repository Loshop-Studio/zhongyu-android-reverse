package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.umeng.analytics.pro.z */
/* loaded from: classes2.dex */
public class C3409z {

    /* renamed from: a */
    private static InterfaceC3408y f2347a = null;

    /* renamed from: b */
    private static boolean f2348b = false;

    /* renamed from: a */
    public static synchronized String m3361a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            m3362b(context);
            InterfaceC3408y interfaceC3408y = f2347a;
            if (interfaceC3408y != null) {
                try {
                    return interfaceC3408y.mo2826a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    private static void m3362b(Context context) {
        if (f2347a != null || f2348b) {
            return;
        }
        synchronized (C3409z.class) {
            if (f2347a == null && !f2348b) {
                f2347a = C3327aa.m2825a(context);
                f2348b = true;
            }
        }
    }
}
