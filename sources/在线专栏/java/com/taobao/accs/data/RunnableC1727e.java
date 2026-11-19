package com.taobao.accs.data;

import com.taobao.accs.p064ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.e */
/* loaded from: classes.dex */
class RunnableC1727e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TrafficsMonitor.C1776a f7600a;

    /* renamed from: b */
    final /* synthetic */ C1726d f7601b;

    RunnableC1727e(C1726d c1726d, TrafficsMonitor.C1776a c1776a) {
        this.f7601b = c1726d;
        this.f7600a = c1776a;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f7601b.f7587c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m6089a(this.f7600a);
        }
    }
}
