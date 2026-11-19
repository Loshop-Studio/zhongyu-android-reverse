package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.d */
/* loaded from: classes5.dex */
class RunnableC7644d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AbstractC7642b f13072a;

    public RunnableC7644d(AbstractC7642b abstractC7642b) {
        this.f13072a = abstractC7642b;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f13072a.f13056e.m9954c()) {
            ALog.m10118e(this.f13072a.mo10031d(), "receive ping time out! ", new Object[0]);
            AbstractC7646f.m10044a(this.f13072a.f13055d).m10049c();
            this.f13072a.mo10020a("", false, "receive ping timeout");
            this.f13072a.f13056e.m9943a(AccsErrorCode.SPDY_PING_TIME_OUT.copy().detail(AccsErrorCode.getAllDetails(null)).build());
        }
    }
}
