package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.data.Message;

/* renamed from: com.taobao.accs.net.n */
/* loaded from: classes5.dex */
class RunnableC7654n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13107a;

    /* renamed from: b */
    final /* synthetic */ long f13108b;

    /* renamed from: c */
    final /* synthetic */ boolean f13109c;

    /* renamed from: d */
    final /* synthetic */ C7650j f13110d;

    public RunnableC7654n(C7650j c7650j, String str, long j10, boolean z10) {
        this.f13110d = c7650j;
        this.f13107a = str;
        this.f13108b = j10;
        this.f13109c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageM9941a = this.f13110d.f13056e.m9941a(this.f13107a);
        if (messageM9941a != null) {
            this.f13110d.f13056e.m9945a(messageM9941a, AccsErrorCode.REQ_TIME_OUT.copy().msg("发送超过" + this.f13108b + "未收到回执").detail(AccsErrorCode.getAllDetails(null)).build());
            this.f13110d.mo10020a(this.f13107a, this.f13109c, "receive data time out");
            this.f13110d.f13093t.mo3535e(this.f13107a + "-> receive data time out!");
        }
    }
}
