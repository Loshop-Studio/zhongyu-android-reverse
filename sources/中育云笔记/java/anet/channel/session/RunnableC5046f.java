package anet.channel.session;

import anet.channel.RequestCb;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;

/* renamed from: anet.channel.session.f */
/* loaded from: classes3.dex */
class RunnableC5046f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Request f2575a;

    /* renamed from: b */
    final /* synthetic */ RequestCb f2576b;

    /* renamed from: c */
    final /* synthetic */ RequestStatistic f2577c;

    /* renamed from: d */
    final /* synthetic */ C5044d f2578d;

    public RunnableC5046f(C5044d c5044d, Request request, RequestCb requestCb, RequestStatistic requestStatistic) {
        this.f2578d = c5044d;
        this.f2575a = request;
        this.f2576b = requestCb;
        this.f2577c = requestStatistic;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f2575a.f2501a.sendBeforeTime = System.currentTimeMillis() - this.f2575a.f2501a.reqStart;
        C5042b.m2431a(this.f2575a, new C5047g(this));
    }
}
