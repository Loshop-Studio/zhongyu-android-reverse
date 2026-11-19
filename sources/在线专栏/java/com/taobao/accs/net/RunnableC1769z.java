package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.z */
/* loaded from: classes.dex */
class RunnableC1769z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7764a;

    /* renamed from: b */
    final /* synthetic */ C1766w f7765b;

    RunnableC1769z(C1766w c1766w, String str) {
        this.f7765b = c1766w;
        this.f7764a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.f7764a;
        if (str != null && str.equals(this.f7765b.f7742N) && this.f7765b.f7748s == 2) {
            this.f7765b.f7738J = false;
            this.f7765b.f7740L = true;
            this.f7765b.m6071q();
            this.f7765b.f7736H.setCloseReason("conn timeout");
        }
    }
}
