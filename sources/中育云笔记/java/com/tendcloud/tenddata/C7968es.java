package com.tendcloud.tenddata;

import android.content.Context;
import java.lang.reflect.Proxy;

/* renamed from: com.tendcloud.tenddata.es */
/* loaded from: classes5.dex */
public final class C7968es {
    /* renamed from: a */
    public static boolean m11909a() {
        try {
            Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectMSA(Context context) {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("com.bun.miitmdid.core.MdidSdkHelper");
            try {
                cls = Class.forName("com.bun.miitmdid.interfaces.IIdentifierListener");
            } catch (Throwable unused) {
                cls = Class.forName("com.bun.supplier.IIdentifierListener");
            }
            cls2.getMethod("InitSdk", Context.class, Boolean.TYPE, cls).invoke(null, context, Boolean.TRUE, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C7962em()));
        } catch (Throwable unused2) {
            C7945dw.f14801a.countDown();
        }
    }
}
