package com.umeng.commonsdk.internal;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.internal.b */
/* loaded from: classes.dex */
public class C1966b {

    /* renamed from: b */
    private static C1966b f9194b;

    /* renamed from: a */
    private Context f9195a;

    /* renamed from: c */
    private C1967c f9196c;

    private C1966b(Context context) {
        this.f9195a = context;
        this.f9196c = new C1967c(context);
    }

    /* renamed from: a */
    public static synchronized C1966b m7392a(Context context) {
        if (f9194b == null) {
            f9194b = new C1966b(context.getApplicationContext());
        }
        return f9194b;
    }

    /* renamed from: a */
    public C1967c m7393a() {
        return this.f9196c;
    }
}
