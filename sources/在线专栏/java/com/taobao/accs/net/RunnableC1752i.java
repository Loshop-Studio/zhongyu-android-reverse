package com.taobao.accs.net;

import anet.channel.strategy.StrategyCenter;

/* renamed from: com.taobao.accs.net.i */
/* loaded from: classes.dex */
class RunnableC1752i implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1751h f7688a;

    RunnableC1752i(C1751h c1751h) {
        this.f7688a = c1751h;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyCenter.getInstance().saveData();
    }
}
