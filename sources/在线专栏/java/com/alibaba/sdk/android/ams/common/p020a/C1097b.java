package com.alibaba.sdk.android.ams.common.p020a;

import android.app.Application;
import android.content.Context;

/* renamed from: com.alibaba.sdk.android.ams.common.a.b */
/* loaded from: classes.dex */
public class C1097b {
    /* renamed from: a */
    public static void m4991a(Application application) {
        if (application == null) {
            return;
        }
        C1096a.f6508b = application;
    }

    /* renamed from: a */
    public static void m4992a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("null applicationContext!");
        }
        C1096a.f6507a = context;
    }

    /* renamed from: a */
    public static void m4993a(String str) {
        C1096a.f6510d = str;
    }

    /* renamed from: a */
    public static void m4994a(boolean z3) {
        C1096a.f6509c = z3;
    }

    /* renamed from: b */
    public static void m4995b(String str) {
        C1096a.f6511e = str;
    }

    /* renamed from: c */
    public static void m4996c(String str) {
        C1096a.f6512f = str;
    }
}
