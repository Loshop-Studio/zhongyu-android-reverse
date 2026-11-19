package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.h */
/* loaded from: classes5.dex */
class C7648h implements HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    final /* synthetic */ C7647g f13085a;

    public C7648h(C7647g c7647g) {
        this.f13085a = c7647g;
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new RunnableC7649i(this), 2000L, TimeUnit.MILLISECONDS);
    }
}
