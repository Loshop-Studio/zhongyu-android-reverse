package com.alibaba.sdk.android.ams.common.p050a;

import android.app.Application;
import android.content.Context;

/* renamed from: com.alibaba.sdk.android.ams.common.a.b */
/* loaded from: classes3.dex */
public class C5572b {
    /* renamed from: a */
    public static void m3392a(Application application) {
        if (application == null) {
            return;
        }
        C5571a.f3993b = application;
    }

    /* renamed from: b */
    public static void m3396b(String str) {
        C5571a.f3996e = str;
    }

    /* renamed from: c */
    public static void m3397c(String str) {
        C5571a.f3997f = str;
    }

    /* renamed from: a */
    public static void m3393a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("null applicationContext!");
        }
        C5571a.f3992a = context;
    }

    /* renamed from: a */
    public static void m3394a(String str) {
        C5571a.f3995d = str;
    }

    /* renamed from: a */
    public static void m3395a(boolean z10) {
        C5571a.f3994c = z10;
    }
}
