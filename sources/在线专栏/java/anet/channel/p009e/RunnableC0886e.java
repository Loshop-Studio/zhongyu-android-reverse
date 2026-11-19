package anet.channel.p009e;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.C0889a;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import java.util.List;

/* renamed from: anet.channel.e.e */
/* loaded from: classes.dex */
final class RunnableC0886e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f5137a;

    /* renamed from: b */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f5138b;

    RunnableC0886e(List list, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f5137a = list;
        this.f5138b = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        IConnStrategy iConnStrategy = (IConnStrategy) this.f5137a.get(0);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new C0889a("https://" + C0882a.f5125b, "Http3Detect" + C0882a.f5131h.getAndIncrement(), C0882a.m4434b(iConnStrategy)));
        tnetSpdySession.registerEventcb(257, new C0887f(this, iConnStrategy));
        tnetSpdySession.f5006q.isCommitted = true;
        tnetSpdySession.connect();
    }
}
