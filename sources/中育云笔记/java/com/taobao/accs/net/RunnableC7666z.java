package com.taobao.accs.net;

/* renamed from: com.taobao.accs.net.z */
/* loaded from: classes5.dex */
class RunnableC7666z implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13162a;

    /* renamed from: b */
    final /* synthetic */ C7663w f13163b;

    public RunnableC7666z(C7663w c7663w, String str) {
        this.f13163b = c7663w;
        this.f13162a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = this.f13162a;
        if (str != null && str.equals(this.f13163b.f13140N) && this.f13163b.f13146s == 2) {
            this.f13163b.f13136J = false;
            this.f13163b.f13138L = true;
            this.f13163b.m10097q();
            this.f13163b.f13134H.setCloseReason("conn timeout");
        }
    }
}
