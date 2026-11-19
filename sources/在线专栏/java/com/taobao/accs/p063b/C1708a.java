package com.taobao.accs.p063b;

import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.b.a */
/* loaded from: classes.dex */
public class C1708a {

    /* renamed from: a */
    private static C1708a f7502a;

    /* renamed from: b */
    private ClassLoader f7503b = null;

    /* renamed from: c */
    private boolean f7504c = false;

    /* renamed from: a */
    public static synchronized C1708a m5835a() {
        if (f7502a == null) {
            f7502a = new C1708a();
        }
        return f7502a;
    }

    /* renamed from: b */
    public synchronized ClassLoader m5836b() {
        if (this.f7503b == null) {
            ALog.m6090d("ACCSClassLoader", "getClassLoader", new Object[0]);
            this.f7503b = C1708a.class.getClassLoader();
        }
        return this.f7503b;
    }
}
