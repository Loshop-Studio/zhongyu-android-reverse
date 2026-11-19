package com.taobao.accs.p084b;

import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.b.a */
/* loaded from: classes5.dex */
public class C7605a {

    /* renamed from: a */
    private static C7605a f12900a;

    /* renamed from: b */
    private ClassLoader f12901b = null;

    /* renamed from: c */
    private boolean f12902c = false;

    /* renamed from: a */
    public static synchronized C7605a m9861a() {
        try {
            if (f12900a == null) {
                f12900a = new C7605a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f12900a;
    }

    /* renamed from: b */
    public synchronized ClassLoader m9862b() {
        try {
            if (this.f12901b == null) {
                ALog.m10116d("ACCSClassLoader", "getClassLoader", new Object[0]);
                this.f12901b = C7605a.class.getClassLoader();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f12901b;
    }
}
