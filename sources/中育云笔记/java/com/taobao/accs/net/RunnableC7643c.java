package com.taobao.accs.net;

import com.taobao.accs.AccsErrorCode;
import com.taobao.accs.data.Message;
import com.taobao.accs.utl.ALog;

/* renamed from: com.taobao.accs.net.c */
/* loaded from: classes5.dex */
class RunnableC7643c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f13068a;

    /* renamed from: b */
    final /* synthetic */ long f13069b;

    /* renamed from: c */
    final /* synthetic */ boolean f13070c;

    /* renamed from: d */
    final /* synthetic */ AbstractC7642b f13071d;

    public RunnableC7643c(AbstractC7642b abstractC7642b, String str, long j10, boolean z10) {
        this.f13071d = abstractC7642b;
        this.f13068a = str;
        this.f13069b = j10;
        this.f13070c = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        Message messageM9941a = this.f13071d.f13056e.m9941a(this.f13068a);
        if (messageM9941a != null) {
            this.f13071d.f13056e.m9945a(messageM9941a, AccsErrorCode.REQ_TIME_OUT.copy().msg("发送超过" + this.f13069b + "未收到回执").detail(AccsErrorCode.getAllDetails(null)).build());
            this.f13071d.mo10020a(this.f13068a, this.f13070c, "receive data time out");
            ALog.m10118e(this.f13071d.mo10031d(), this.f13068a + "-> receive data time out!", new Object[0]);
        }
    }
}
