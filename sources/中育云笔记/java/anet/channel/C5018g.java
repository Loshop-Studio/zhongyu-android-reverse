package anet.channel;

import anet.channel.entity.C5013b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.g */
/* loaded from: classes3.dex */
class C5018g implements EventCb {

    /* renamed from: a */
    final /* synthetic */ Session f2444a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest f2445b;

    public C5018g(SessionRequest sessionRequest, Session session) {
        this.f2445b = sessionRequest;
        this.f2444a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C5013b c5013b) {
        ALog.m2527d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i10));
        ConnEvent connEvent = new ConnEvent();
        if (i10 == 512) {
            connEvent.isSuccess = true;
        }
        SessionInfo sessionInfo = this.f2445b.f2308c;
        if (sessionInfo != null) {
            connEvent.isAccs = sessionInfo.isAccs;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f2444a.getRealHost(), this.f2444a.getConnStrategy(), connEvent);
    }
}
