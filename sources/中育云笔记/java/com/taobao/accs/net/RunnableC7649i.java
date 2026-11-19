package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

/* renamed from: com.taobao.accs.net.i */
/* loaded from: classes5.dex */
class RunnableC7649i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C7648h f13086a;

    public RunnableC7649i(C7648h c7648h) {
        this.f13086a = c7648h;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyCenter.getInstance().saveData();
    }
}
