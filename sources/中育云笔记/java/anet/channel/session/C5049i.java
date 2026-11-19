package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.i */
/* loaded from: classes3.dex */
class C5049i implements IAuth.AuthCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f2581a;

    public C5049i(TnetSpdySession tnetSpdySession) {
        this.f2581a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i10, String str) {
        this.f2581a.notifyStatus(5, null);
        SessionStatistic sessionStatistic = this.f2581a.f2284q;
        if (sessionStatistic != null) {
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i10;
            this.f2581a.f2284q.errorCode = (long) i10;
        }
        this.f2581a.close();
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f2581a.notifyStatus(4, null);
        this.f2581a.f2560z = System.currentTimeMillis();
        TnetSpdySession tnetSpdySession = this.f2581a;
        IHeartbeat iHeartbeat = tnetSpdySession.f2551D;
        if (iHeartbeat != null) {
            iHeartbeat.start(tnetSpdySession);
        }
        TnetSpdySession tnetSpdySession2 = this.f2581a;
        SessionStatistic sessionStatistic = tnetSpdySession2.f2284q;
        sessionStatistic.ret = 1;
        ALog.m2527d("awcn.TnetSpdySession", "spdyOnStreamResponse", tnetSpdySession2.f2283p, "authTime", Long.valueOf(sessionStatistic.authTime));
        TnetSpdySession tnetSpdySession3 = this.f2581a;
        if (tnetSpdySession3.f2548A > 0) {
            tnetSpdySession3.f2284q.authTime = System.currentTimeMillis() - this.f2581a.f2548A;
        }
    }
}
