package com.umeng.analytics.pro;

import android.content.Context;
import android.os.Looper;

/* renamed from: com.umeng.analytics.pro.z */
/* loaded from: classes.dex */
public class C1925z {

    /* renamed from: a */
    private static InterfaceC1924y f8939a = null;

    /* renamed from: b */
    private static boolean f8940b = false;

    /* renamed from: a */
    public static synchronized String m7284a(Context context) {
        try {
            if (context == null) {
                throw new RuntimeException("Context is null");
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalStateException("Cannot be called from the main thread");
            }
            m7285b(context);
            InterfaceC1924y interfaceC1924y = f8939a;
            if (interfaceC1924y != null) {
                try {
                    return interfaceC1924y.mo6749a(context);
                } catch (Exception unused) {
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    private static void m7285b(Context context) {
        if (f8939a != null || f8940b) {
            return;
        }
        synchronized (C1925z.class) {
            if (f8939a == null && !f8940b) {
                f8939a = C1843aa.m6748a(context);
                f8940b = true;
            }
        }
    }
}
