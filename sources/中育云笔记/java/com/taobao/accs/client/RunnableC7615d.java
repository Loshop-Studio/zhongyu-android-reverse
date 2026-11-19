package com.taobao.accs.client;

import com.taobao.accs.utl.UtilityImpl;

/* renamed from: com.taobao.accs.client.d */
/* loaded from: classes5.dex */
class RunnableC7615d implements Runnable {

    /* renamed from: a */
    final /* synthetic */ GlobalClientInfo f12916a;

    public RunnableC7615d(GlobalClientInfo globalClientInfo) {
        this.f12916a = globalClientInfo;
    }

    @Override // java.lang.Runnable
    public void run() {
        GlobalClientInfo.f12904b = UtilityImpl.m10159j(GlobalClientInfo.f12903a);
    }
}
