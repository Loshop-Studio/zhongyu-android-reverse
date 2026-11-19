package anet.channel;

import anet.channel.entity.C0890b;
import anet.channel.entity.EventCb;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.util.ALog;

/* renamed from: anet.channel.g */
/* loaded from: classes.dex */
class C0895g implements EventCb {

    /* renamed from: a */
    final /* synthetic */ Session f5166a;

    /* renamed from: b */
    final /* synthetic */ SessionRequest f5167b;

    C0895g(SessionRequest sessionRequest, Session session) {
        this.f5167b = sessionRequest;
        this.f5166a = session;
    }

    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i4, C0890b c0890b) {
        ALog.m4636d("awcn.SessionRequest", "Receive session event", null, "eventType", Integer.valueOf(i4));
        ConnEvent connEvent = new ConnEvent();
        if (i4 == 512) {
            connEvent.isSuccess = true;
        }
        SessionInfo sessionInfo = this.f5167b.f5030c;
        if (sessionInfo != null) {
            connEvent.isAccs = sessionInfo.isAccs;
        }
        StrategyCenter.getInstance().notifyConnEvent(this.f5166a.getRealHost(), this.f5166a.getConnStrategy(), connEvent);
    }
}
