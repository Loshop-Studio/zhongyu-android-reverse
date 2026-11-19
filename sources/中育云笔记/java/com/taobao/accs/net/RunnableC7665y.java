package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.y */
/* loaded from: classes5.dex */
class RunnableC7665y implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7663w f13161a;

    public RunnableC7665y(C7663w c7663w) {
        this.f13161a = c7663w;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13161a.m10097q();
        if (this.f13161a.f13134H != null) {
            this.f13161a.f13134H.setCloseReason("shut down");
        }
        synchronized (this.f13161a.f13147t) {
            try {
                this.f13161a.f13147t.notifyAll();
            } catch (Exception unused) {
            }
        }
    }
}
