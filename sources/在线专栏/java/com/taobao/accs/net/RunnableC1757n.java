package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.n */
/* loaded from: classes.dex */
class RunnableC1757n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7709a;

    /* renamed from: b */
    final /* synthetic */ long f7710b;

    /* renamed from: c */
    final /* synthetic */ boolean f7711c;

    /* renamed from: d */
    final /* synthetic */ C1753j f7712d;

    RunnableC1757n(C1753j c1753j, String str, long j4, boolean z3) {
        this.f7712d = c1753j;
        this.f7709a = str;
        this.f7710b = j4;
        this.f7711c = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageM5915a = this.f7712d.f7658e.m5915a(this.f7709a);
        if (messageM5915a != null) {
            this.f7712d.f7658e.m5919a(messageM5915a, AccsErrorCode.REQ_TIME_OUT.copy().msg("发送超过" + this.f7710b + "未收到回执").detail(AccsErrorCode.getAllDetails(null)).build());
            this.f7712d.mo5994a(this.f7709a, this.f7711c, "receive data time out");
            this.f7712d.f7695t.mo5085e(this.f7709a + "-> receive data time out!");
        }
    }
}
