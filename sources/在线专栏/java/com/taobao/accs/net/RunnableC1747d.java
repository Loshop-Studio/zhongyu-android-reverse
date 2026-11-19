package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.d */
/* loaded from: classes.dex */
class RunnableC1747d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC1745b f7674a;

    RunnableC1747d(AbstractC1745b abstractC1745b) {
        this.f7674a = abstractC1745b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7674a.f7658e.m5928c()) {
            ALog.m6092e(this.f7674a.mo6005d(), "receive ping time out! ", new Object[0]);
            AbstractC1749f.m6018a(this.f7674a.f7657d).m6023c();
            this.f7674a.mo5994a("", false, "receive ping timeout");
            this.f7674a.f7658e.m5917a(AccsErrorCode.SPDY_PING_TIME_OUT.copy().detail(AccsErrorCode.getAllDetails(null)).build());
        }
    }
}
