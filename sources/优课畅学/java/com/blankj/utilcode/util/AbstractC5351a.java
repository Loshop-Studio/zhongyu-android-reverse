package com.blankj.utilcode.util;

import android.app.Activity;

/* renamed from: com.blankj.utilcode.util.a */
/* loaded from: classes3.dex */
public abstract class AbstractC5351a {
    /* renamed from: a */
    public static void m2419a() {
        m2420b(false);
    }

    /* renamed from: b */
    public static void m2420b(boolean z10) {
        for (Activity activity : AbstractC5372k0.m2555k()) {
            activity.finish();
            if (!z10) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    /* renamed from: c */
    public static boolean m2421c(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }
}
