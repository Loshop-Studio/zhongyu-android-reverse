package com.p074ta.p075a;

import android.content.Context;

/* renamed from: com.ta.a.a */
/* loaded from: classes5.dex */
public class C7569a {

    /* renamed from: a */
    private static final C7569a f12827a = new C7569a();
    private Context mContext = null;

    /* renamed from: a */
    private long f12828a = 0;

    private C7569a() {
    }

    /* renamed from: a */
    public static C7569a m9757a() {
        return f12827a;
    }

    public Context getContext() {
        return this.mContext;
    }

    /* renamed from: a */
    public synchronized void m9761a(Context context) {
        try {
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
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: a */
    public void m9760a(long j10) {
        this.f12828a = j10 - System.currentTimeMillis();
    }

    /* renamed from: a */
    public long m9758a() {
        return System.currentTimeMillis() + this.f12828a;
    }

    /* renamed from: a */
    public String m9759a() {
        return "" + m9758a();
    }
}
