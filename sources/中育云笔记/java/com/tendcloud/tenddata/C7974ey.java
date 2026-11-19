package com.tendcloud.tenddata;

import android.content.Context;

/* renamed from: com.tendcloud.tenddata.ey */
/* loaded from: classes5.dex */
public final class C7974ey {
    /* renamed from: a */
    public static boolean m11925a() {
        try {
            if (!C7963en.m11884a()) {
                return false;
            }
            Class.forName("com.android.id.impl.IdProviderImpl");
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void reflectMiUi(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.id.impl.IdProviderImpl");
            Object objNewInstance = cls.newInstance();
            try {
                C7994fr.m11998a().setUDID((String) cls.getMethod("getUDID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused) {
            }
            try {
                C7994fr.m11998a().setOAID((String) cls.getMethod("getOAID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused2) {
            }
            try {
                C7994fr.m11998a().setVAID((String) cls.getMethod("getVAID", Context.class).invoke(objNewInstance, context));
            } catch (Throwable unused3) {
            }
            C7994fr.m11998a().setAAID((String) cls.getMethod("getAAID", Context.class).invoke(objNewInstance, context));
        } catch (Throwable unused4) {
        }
    }
}
