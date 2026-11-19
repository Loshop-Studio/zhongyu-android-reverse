package anetwork.channel.unified;

import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionGetCallback;
import anet.channel.request.Request;
import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import anet.channel.util.HttpUrl;
import org.android.agoo.common.AgooConstants;

/* renamed from: anetwork.channel.unified.h */
/* loaded from: classes.dex */
class C1007h implements SessionGetCallback {

    /* renamed from: a */
    final /* synthetic */ RequestStatistic f5672a;

    /* renamed from: b */
    final /* synthetic */ long f5673b;

    /* renamed from: c */
    final /* synthetic */ Request f5674c;

    /* renamed from: d */
    final /* synthetic */ SessionCenter f5675d;

    /* renamed from: e */
    final /* synthetic */ HttpUrl f5676e;

    /* renamed from: f */
    final /* synthetic */ boolean f5677f;

    /* renamed from: g */
    final /* synthetic */ C1004e f5678g;

    C1007h(C1004e c1004e, RequestStatistic requestStatistic, long j4, Request request, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z3) {
        this.f5678g = c1004e;
        this.f5672a = requestStatistic;
        this.f5673b = j4;
        this.f5674c = request;
        this.f5675d = sessionCenter;
        this.f5676e = httpUrl;
        this.f5677f = z3;
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetFail() {
        ALog.m4638e(C1004e.TAG, "onSessionGetFail", this.f5678g.f5649a.f5684c, AgooConstants.OPEN_URL, this.f5672a.url);
        this.f5672a.connWaitTime = System.currentTimeMillis() - this.f5673b;
        C1004e c1004e = this.f5678g;
        c1004e.m4751a(c1004e.m4746a(null, this.f5675d, this.f5676e, this.f5677f), this.f5674c);
    }

    @Override // anet.channel.SessionGetCallback
    public void onSessionGetSuccess(Session session) {
        ALog.m4639i(C1004e.TAG, "onSessionGetSuccess", this.f5678g.f5649a.f5684c, "Session", session);
        this.f5672a.connWaitTime = System.currentTimeMillis() - this.f5673b;
        this.f5672a.spdyRequestSend = true;
        this.f5678g.m4751a(session, this.f5674c);
    }
}
