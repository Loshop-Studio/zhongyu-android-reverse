package anet.channel.session;

import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.session.h */
/* loaded from: classes.dex */
class RunnableC0925h implements Runnable {

    /* renamed from: a */
    final /* synthetic */ TnetSpdySession f5302a;

    RunnableC0925h(TnetSpdySession tnetSpdySession) {
        this.f5302a = tnetSpdySession;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f5302a.f5281y) {
            TnetSpdySession tnetSpdySession = this.f5302a;
            ALog.m4638e("awcn.TnetSpdySession", "send msg time out!", tnetSpdySession.f5005p, "pingUnRcv:", Boolean.valueOf(tnetSpdySession.f5281y));
            try {
                this.f5302a.handleCallbacks(2048, null);
                SessionStatistic sessionStatistic = this.f5302a.f5006q;
                if (sessionStatistic != null) {
                    sessionStatistic.closeReason = "ping time out";
                }
                ConnEvent connEvent = new ConnEvent();
                connEvent.isSuccess = false;
                connEvent.isAccs = this.f5302a.f5278I;
                StrategyCenter.getInstance().notifyConnEvent(this.f5302a.f4993d, this.f5302a.f5000k, connEvent);
                this.f5302a.close(true);
            } catch (Exception unused) {
            }
        }
    }
}
