package anet.channel.p024e;

import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C5013b;
import anet.channel.entity.EventCb;
import anet.channel.statist.Http3DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.e.f */
/* loaded from: classes3.dex */
class C5010f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ IConnStrategy f2417a;

    /* renamed from: b */
    final /* synthetic */ RunnableC5009e f2418b;

    public C5010f(RunnableC5009e runnableC5009e, IConnStrategy iConnStrategy) {
        this.f2418b = runnableC5009e;
        this.f2417a = iConnStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i10, C5013b c5013b) {
        ?? r02 = i10 != 1 ? 0 : 1;
        C5005a.f2402a.m2334a(NetworkStatusHelper.getUniqueId(this.f2418b.f2416b), r02);
        session.close(false);
        Http3DetectStat http3DetectStat = new Http3DetectStat(C5005a.f2403b, this.f2417a);
        http3DetectStat.ret = r02;
        AppMonitor.getInstance().commitStat(http3DetectStat);
    }
}
