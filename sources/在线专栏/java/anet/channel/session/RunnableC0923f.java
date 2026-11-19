package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

/* renamed from: anet.channel.session.f */
/* loaded from: classes.dex */
class RunnableC0923f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f5297a;

    /* renamed from: b */
    final /* synthetic */ RequestCb f5298b;

    /* renamed from: c */
    final /* synthetic */ RequestStatistic f5299c;

    /* renamed from: d */
    final /* synthetic */ C0921d f5300d;

    RunnableC0923f(C0921d c0921d, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f5300d = c0921d;
        this.f5297a = request;
        this.f5298b = requestCb;
        this.f5299c = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5297a.f5223a.sendBeforeTime = System.currentTimeMillis() - this.f5297a.f5223a.reqStart;
        C0919b.m4540a(this.f5297a, new C0924g(this));
    }
}
