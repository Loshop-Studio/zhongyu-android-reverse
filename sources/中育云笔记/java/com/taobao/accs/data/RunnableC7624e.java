package com.taobao.accs.data;

import com.taobao.accs.p085ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.e */
/* loaded from: classes5.dex */
class RunnableC7624e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TrafficsMonitor.C7673a f12998a;

    /* renamed from: b */
    final /* synthetic */ C7623d f12999b;

    public RunnableC7624e(C7623d c7623d, TrafficsMonitor.C7673a c7673a) {
        this.f12999b = c7623d;
        this.f12998a = c7673a;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f12999b.f12985c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m10115a(this.f12998a);
        }
    }
}
