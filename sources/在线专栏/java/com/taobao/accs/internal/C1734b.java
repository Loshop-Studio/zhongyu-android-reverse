package com.taobao.accs.internal;

import android.content.Context;
import com.taobao.accs.ConnectionListener;
import com.taobao.accs.net.AbstractC1745b;

/* renamed from: com.taobao.accs.internal.b */
/* loaded from: classes.dex */
class C1734b implements ConnectionListener {

    /* renamed from: a */
    final /* synthetic */ RunnableC1733a f7624a;

    C1734b(RunnableC1733a runnableC1733a) {
        this.f7624a = runnableC1733a;
    }

    @Override // com.taobao.accs.ConnectionListener
    public void onConnect() {
        if (this.f7624a.f7623c.f7612a.m6011j().m5848e(this.f7624a.f7622b.getPackageName()) && this.f7624a.f7623c.f7614c) {
            RunnableC1733a runnableC1733a = this.f7624a;
            ACCSManagerImpl aCCSManagerImpl = runnableC1733a.f7623c;
            Context context = runnableC1733a.f7622b;
            AbstractC1745b abstractC1745b = aCCSManagerImpl.f7612a;
            aCCSManagerImpl.m5954a(context, abstractC1745b.f7655b, abstractC1745b.f7654a);
        }
    }

    @Override // com.taobao.accs.ConnectionListener
    public void onDisconnect(int i4, String str) {
    }
}
