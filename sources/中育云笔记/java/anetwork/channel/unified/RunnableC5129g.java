package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.entity.C5014c;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.HttpUrl;

/* renamed from: anetwork.channel.unified.g */
/* loaded from: classes3.dex */
class RunnableC5129g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ SessionCenter f2944a;

    /* renamed from: b */
    final /* synthetic */ HttpUrl f2945b;

    /* renamed from: c */
    final /* synthetic */ RequestStatistic f2946c;

    /* renamed from: d */
    final /* synthetic */ HttpUrl f2947d;

    /* renamed from: e */
    final /* synthetic */ boolean f2948e;

    /* renamed from: f */
    final /* synthetic */ C5127e f2949f;

    public RunnableC5129g(C5127e c5127e, SessionCenter sessionCenter, HttpUrl httpUrl, RequestStatistic requestStatistic, HttpUrl httpUrl2, boolean z10) {
        this.f2949f = c5127e;
        this.f2944a = sessionCenter;
        this.f2945b = httpUrl;
        this.f2946c = requestStatistic;
        this.f2947d = httpUrl2;
        this.f2948e = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Session session = this.f2944a.get(this.f2945b, C5014c.f2428a, 3000L);
        this.f2946c.connWaitTime = System.currentTimeMillis() - jCurrentTimeMillis;
        this.f2946c.spdyRequestSend = session != null;
        Session sessionM2637a = this.f2949f.m2637a(session, this.f2944a, this.f2947d, this.f2948e);
        C5127e c5127e = this.f2949f;
        c5127e.m2642a(sessionM2637a, c5127e.f2927a.f2960a.m2615a());
    }
}
