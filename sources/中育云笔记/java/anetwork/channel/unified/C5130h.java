package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;

/* renamed from: anetwork.channel.unified.h */
/* loaded from: classes3.dex */
class C5130h implements SessionGetCallback {

    /* renamed from: a */
    final /* synthetic */ RequestStatistic f2950a;

    /* renamed from: b */
    final /* synthetic */ long f2951b;

    /* renamed from: c */
    final /* synthetic */ Request f2952c;

    /* renamed from: d */
    final /* synthetic */ SessionCenter f2953d;

    /* renamed from: e */
    final /* synthetic */ HttpUrl f2954e;

    /* renamed from: f */
    final /* synthetic */ boolean f2955f;

    /* renamed from: g */
    final /* synthetic */ C5127e f2956g;

    public C5130h(C5127e c5127e, RequestStatistic requestStatistic, long j10, Request request, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z10) {
        this.f2956g = c5127e;
        this.f2950a = requestStatistic;
        this.f2951b = j10;
        this.f2952c = request;
        this.f2953d = sessionCenter;
        this.f2954e = httpUrl;
        this.f2955f = z10;
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetFail() {
        ALog.m2529e(C5127e.TAG, "onSessionGetFail", this.f2956g.f2927a.f2962c, "url", this.f2950a.url);
        this.f2950a.connWaitTime = System.currentTimeMillis() - this.f2951b;
        C5127e c5127e = this.f2956g;
        c5127e.m2642a(c5127e.m2637a(null, this.f2953d, this.f2954e, this.f2955f), this.f2952c);
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetSuccess(Session session) {
        ALog.m2530i(C5127e.TAG, "onSessionGetSuccess", this.f2956g.f2927a.f2962c, "Session", session);
        this.f2950a.connWaitTime = System.currentTimeMillis() - this.f2951b;
        this.f2950a.spdyRequestSend = true;
        this.f2956g.m2642a(session, this.f2952c);
    }
}
