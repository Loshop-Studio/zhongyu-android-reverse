package com.taobao.accs.net;

import anet.channel.session.TnetSpdySession;
import com.taobao.accs.AccsState;
import com.taobao.accs.common.Constants;
import com.taobao.accs.p085ut.p086a.C7670d;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.net.o */
/* loaded from: classes5.dex */
class RunnableC7655o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ int f13111a;

    /* renamed from: b */
    final /* synthetic */ int f13112b;

    /* renamed from: c */
    final /* synthetic */ byte[] f13113c;

    /* renamed from: d */
    final /* synthetic */ TnetSpdySession f13114d;

    /* renamed from: e */
    final /* synthetic */ C7650j f13115e;

    public RunnableC7655o(C7650j c7650j, int i10, int i11, byte[] bArr, TnetSpdySession tnetSpdySession) {
        this.f13115e = c7650j;
        this.f13111a = i10;
        this.f13112b = i11;
        this.f13113c = bArr;
        this.f13114d = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f13115e.f13093t.mo3539i("onDataReceive", "type", Integer.valueOf(this.f13111a), Constants.KEY_DATA_ID, Integer.valueOf(this.f13112b));
        AccsState.getInstance().m9842a(this.f13115e.f13064m, AccsState.LAST_MSG_RECEIVE_TIME, Integer.valueOf(this.f13112b));
        if (this.f13111a != 200) {
            this.f13115e.f13093t.mo3535e("drop frame len:" + this.f13113c.length + " frameType" + this.f13111a);
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f13115e.f13056e.m9950a(this.f13113c, this.f13114d.getHost());
            C7670d c7670dM9958g = this.f13115e.f13056e.m9958g();
            if (c7670dM9958g != null) {
                c7670dM9958g.f13188c = String.valueOf(jCurrentTimeMillis);
                c7670dM9958g.f13192g = this.f13115e.f13054c == 0 ? "service" : "inapp";
                c7670dM9958g.m10110a();
            }
        } catch (Throwable th) {
            this.f13115e.f13093t.mo3536e("onDataReceive", th);
            UTMini.getInstance().commitEvent(66001, "DATA_RECEIVE", UtilityImpl.m10130a(th));
        }
    }
}
