package com.taobao.accs.data;

import com.taobao.accs.p085ut.monitor.TrafficsMonitor;

/* renamed from: com.taobao.accs.data.f */
/* loaded from: classes5.dex */
class RunnableC7625f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7623d f13000a;

    public RunnableC7625f(C7623d c7623d) {
        this.f13000a = c7623d;
    }

    @Override // java.lang.Runnable
    public void run() {
        TrafficsMonitor trafficsMonitor = this.f13000a.f12985c;
        if (trafficsMonitor != null) {
            trafficsMonitor.m10114a();
        }
    }
}
