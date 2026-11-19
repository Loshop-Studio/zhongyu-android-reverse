package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.y */
/* loaded from: classes.dex */
class RunnableC1768y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1766w f7763a;

    RunnableC1768y(C1766w c1766w) {
        this.f7763a = c1766w;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7763a.m6071q();
        if (this.f7763a.f7736H != null) {
            this.f7763a.f7736H.setCloseReason("shut down");
        }
        synchronized (this.f7763a.f7749t) {
            try {
                this.f7763a.f7749t.notifyAll();
            } catch (Exception unused) {
            }
        }
    }
}
