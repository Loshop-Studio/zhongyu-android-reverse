package com.taobao.accs.net;

import anet.channel.strategy.dispatch.DispatchEvent;
import anet.channel.strategy.dispatch.HttpDispatcher;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.xuexiang.xui.widget.popupwindow.bar.Cookie;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.h */
/* loaded from: classes.dex */
class C1751h implements HttpDispatcher.IDispatchEventListener {

    /* renamed from: a */
    final /* synthetic */ C1750g f7687a;

    C1751h(C1750g c1750g) {
        this.f7687a = c1750g;
    }

    @Override // anet.channel.strategy.dispatch.HttpDispatcher.IDispatchEventListener
    public void onEvent(DispatchEvent dispatchEvent) {
        ThreadPoolExecutorFactory.schedule(new RunnableC1752i(this), Cookie.DEFAULT_COOKIE_DURATION, TimeUnit.MILLISECONDS);
    }
}
