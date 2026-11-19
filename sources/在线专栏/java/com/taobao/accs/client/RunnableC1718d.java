package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.client.d */
/* loaded from: classes.dex */
class RunnableC1718d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GlobalClientInfo f7518a;

    RunnableC1718d(GlobalClientInfo globalClientInfo) {
        this.f7518a = globalClientInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalClientInfo.f7506b = UtilityImpl.m6133j(GlobalClientInfo.f7505a);
    }
}
