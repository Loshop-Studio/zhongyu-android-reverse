package anet.channel.session;

import anet.channel.IAuth;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.statist.SessionStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.i */
/* loaded from: classes.dex */
class C0926i implements IAuth.AuthCallback {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f5303a;

    C0926i(TnetSpdySession tnetSpdySession) {
        this.f5303a = tnetSpdySession;
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthFail(int i4, String str) {
        this.f5303a.notifyStatus(5, null);
        SessionStatistic sessionStatistic = this.f5303a.f5006q;
        if (sessionStatistic != null) {
            sessionStatistic.closeReason = "Accs_Auth_Fail:" + i4;
            this.f5303a.f5006q.errorCode = (long) i4;
        }
        this.f5303a.close();
    }

    @Override // anet.channel.IAuth.AuthCallback
    public void onAuthSuccess() {
        this.f5303a.notifyStatus(4, null);
        this.f5303a.f5282z = System.currentTimeMillis();
        TnetSpdySession tnetSpdySession = this.f5303a;
        IHeartbeat iHeartbeat = tnetSpdySession.f5273D;
        if (iHeartbeat != null) {
            iHeartbeat.start(tnetSpdySession);
        }
        TnetSpdySession tnetSpdySession2 = this.f5303a;
        SessionStatistic sessionStatistic = tnetSpdySession2.f5006q;
        sessionStatistic.ret = 1;
        ALog.m4636d("awcn.TnetSpdySession", "spdyOnStreamResponse", tnetSpdySession2.f5005p, "authTime", Long.valueOf(sessionStatistic.authTime));
        TnetSpdySession tnetSpdySession3 = this.f5303a;
        if (tnetSpdySession3.f5270A > 0) {
            tnetSpdySession3.f5006q.authTime = System.currentTimeMillis() - this.f5303a.f5270A;
        }
    }
}
