package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.AccsState;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p064ut.p065a.C1773d;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.net.o */
/* loaded from: classes.dex */
class RunnableC1758o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f7713a;

    /* renamed from: b */
    final /* synthetic */ int f7714b;

    /* renamed from: c */
    final /* synthetic */ byte[] f7715c;

    /* renamed from: d */
    final /* synthetic */ TnetSpdySession f7716d;

    /* renamed from: e */
    final /* synthetic */ C1753j f7717e;

    RunnableC1758o(C1753j c1753j, int i4, int i5, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f7717e = c1753j;
        this.f7713a = i4;
        this.f7714b = i5;
        this.f7715c = bArr;
        this.f7716d = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7717e.f7695t.mo5089i("onDataReceive", "type", Integer.valueOf(this.f7713a), Constants.KEY_DATA_ID, Integer.valueOf(this.f7714b));
        AccsState.getInstance().m5816a(this.f7717e.f7666m, AccsState.LAST_MSG_RECEIVE_TIME, Integer.valueOf(this.f7714b));
        if (this.f7713a != 200) {
            this.f7717e.f7695t.mo5085e("drop frame len:" + this.f7715c.length + " frameType" + this.f7713a);
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f7717e.f7658e.m5924a(this.f7715c, this.f7716d.getHost());
            C1773d c1773dM5932g = this.f7717e.f7658e.m5932g();
            if (c1773dM5932g != null) {
                c1773dM5932g.f7790c = String.valueOf(jCurrentTimeMillis);
                c1773dM5932g.f7794g = this.f7717e.f7656c == 0 ? "service" : "inapp";
                c1773dM5932g.m6084a();
            }
        } catch (Throwable th) {
            this.f7717e.f7695t.mo5086e("onDataReceive", th);
            UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.m6104a(th));
        }
    }
}
