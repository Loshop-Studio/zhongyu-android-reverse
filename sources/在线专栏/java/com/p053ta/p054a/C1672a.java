package com.p053ta.p054a;

import android.content.Context;

/* renamed from: com.ta.a.a */
/* loaded from: classes.dex */
public class C1672a {

    /* renamed from: a */
    private static final C1672a f7429a = new C1672a();
    private Context mContext = null;

    /* renamed from: a */
    private long f7430a = 0;

    private C1672a() {
    }

    /* renamed from: a */
    public static C1672a m5731a() {
        return f7429a;
    }

    public Context getContext() {
        return this.mContext;
    }

    /* renamed from: a */
    public synchronized void m5735a(Context context) {
        if (this.mContext == null) {
            if (context == null) {
                return;
            }
            if (context.getApplicationContext() != null) {
                this.mContext = context.getApplicationContext();
            } else {
                this.mContext = context;
            }
        }
    }

    /* renamed from: a */
    public void m5734a(long j4) {
        this.f7430a = j4 - System.currentTimeMillis();
    }

    /* renamed from: a */
    public long m5732a() {
        return System.currentTimeMillis() + this.f7430a;
    }

    /* renamed from: a */
    public String m5733a() {
        return "" + m5732a();
    }
}
