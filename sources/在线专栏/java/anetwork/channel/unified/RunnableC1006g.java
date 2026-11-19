package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.C0891c;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.HttpUrl;

/* renamed from: anetwork.channel.unified.g */
/* loaded from: classes.dex */
class RunnableC1006g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SessionCenter f5666a;

    /* renamed from: b */
    final /* synthetic */ HttpUrl f5667b;

    /* renamed from: c */
    final /* synthetic */ RequestStatistic f5668c;

    /* renamed from: d */
    final /* synthetic */ HttpUrl f5669d;

    /* renamed from: e */
    final /* synthetic */ boolean f5670e;

    /* renamed from: f */
    final /* synthetic */ C1004e f5671f;

    RunnableC1006g(C1004e c1004e, SessionCenter sessionCenter, HttpUrl httpUrl, RequestStatistic requestStatistic, HttpUrl httpUrl2, boolean z3) {
        this.f5671f = c1004e;
        this.f5666a = sessionCenter;
        this.f5667b = httpUrl;
        this.f5668c = requestStatistic;
        this.f5669d = httpUrl2;
        this.f5670e = z3;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Session session = this.f5666a.get(this.f5667b, C0891c.f5150a, 3000L);
        this.f5668c.connWaitTime = System.currentTimeMillis() - jCurrentTimeMillis;
        this.f5668c.spdyRequestSend = session != null;
        Session sessionM4746a = this.f5671f.m4746a(session, this.f5666a, this.f5669d, this.f5670e);
        C1004e c1004e = this.f5671f;
        c1004e.m4751a(sessionM4746a, c1004e.f5649a.f5682a.m4724a());
    }
}
