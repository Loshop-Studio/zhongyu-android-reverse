package com.umeng.commonsdk.internal;

import android.content.Context;

/* renamed from: com.umeng.commonsdk.internal.b */
/* loaded from: classes2.dex */
public class C3450b {

    /* renamed from: b */
    private static C3450b f2602b;

    /* renamed from: a */
    private Context f2603a;

    /* renamed from: c */
    private C3451c f2604c;

    private C3450b(Context context) {
        this.f2603a = context;
        this.f2604c = new C3451c(context);
    }

    /* renamed from: a */
    public static synchronized C3450b m3469a(Context context) {
        if (f2602b == null) {
            f2602b = new C3450b(context.getApplicationContext());
        }
        return f2602b;
    }

    /* renamed from: a */
    public C3451c m3470a() {
        return this.f2604c;
    }
}
