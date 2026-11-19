package anet.channel.p024e;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.entity.C5012a;
import anet.channel.session.TnetSpdySession;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import java.util.List;

/* renamed from: anet.channel.e.e */
/* loaded from: classes3.dex */
final class RunnableC5009e implements Runnable {

    /* renamed from: a */
    final /* synthetic */ List f2415a;

    /* renamed from: b */
    final /* synthetic */ NetworkStatusHelper.NetworkStatus f2416b;

    public RunnableC5009e(List list, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f2415a = list;
        this.f2416b = networkStatus;
    }

    @Override // java.lang.Runnable
    public void run() {
        IConnStrategy iConnStrategy = (IConnStrategy) this.f2415a.get(0);
        TnetSpdySession tnetSpdySession = new TnetSpdySession(GlobalAppRuntimeInfo.getContext(), new C5012a("https://" + C5005a.f2403b, "Http3Detect" + C5005a.f2409h.getAndIncrement(), C5005a.m2325b(iConnStrategy)));
        tnetSpdySession.registerEventcb(257, new C5010f(this, iConnStrategy));
        tnetSpdySession.f2284q.isCommitted = true;
        tnetSpdySession.connect();
    }
}
