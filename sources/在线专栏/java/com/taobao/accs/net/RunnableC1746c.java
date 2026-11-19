package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.c */
/* loaded from: classes.dex */
class RunnableC1746c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f7670a;

    /* renamed from: b */
    final /* synthetic */ long f7671b;

    /* renamed from: c */
    final /* synthetic */ boolean f7672c;

    /* renamed from: d */
    final /* synthetic */ AbstractC1745b f7673d;

    RunnableC1746c(AbstractC1745b abstractC1745b, String str, long j4, boolean z3) {
        this.f7673d = abstractC1745b;
        this.f7670a = str;
        this.f7671b = j4;
        this.f7672c = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageM5915a = this.f7673d.f7658e.m5915a(this.f7670a);
        if (messageM5915a != null) {
            this.f7673d.f7658e.m5919a(messageM5915a, AccsErrorCode.REQ_TIME_OUT.copy().msg("发送超过" + this.f7671b + "未收到回执").detail(AccsErrorCode.getAllDetails(null)).build());
            this.f7673d.mo5994a(this.f7670a, this.f7672c, "receive data time out");
            ALog.m6092e(this.f7673d.mo6005d(), this.f7670a + "-> receive data time out!", new Object[0]);
        }
    }
}
