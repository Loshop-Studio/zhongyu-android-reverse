package com.taobao.accs.data;

import com.taobao.accs.p064ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.f */
/* loaded from: classes.dex */
class RunnableC1728f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1726d f7602a;

    RunnableC1728f(C1726d c1726d) {
        this.f7602a = c1726d;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f7602a.f7587c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m6088a();
        }
    }
}
