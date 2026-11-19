package anet.channel.session;

import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.h */
/* loaded from: classes3.dex */
class RunnableC5048h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f2580a;

    public RunnableC5048h(TnetSpdySession tnetSpdySession) {
        this.f2580a = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2580a.f2559y) {
            TnetSpdySession tnetSpdySession = this.f2580a;
            ALog.m2529e("awcn.TnetSpdySession", "send msg time out!", tnetSpdySession.f2283p, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.f2559y));
            try {
                this.f2580a.handleCallbacks(2048, null);
                SessionStatistic sessionStatistic = this.f2580a.f2284q;
                if (sessionStatistic != null) {
                    sessionStatistic.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                connEvent.isAccs = this.f2580a.f2556I;
                StrategyCenter.getInstance().notifyConnEvent(this.f2580a.f2271d, this.f2580a.f2278k, connEvent);
                this.f2580a.close(true);
            } catch (Exception unused) {
            }
        }
    }
}
