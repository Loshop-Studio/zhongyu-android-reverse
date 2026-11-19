package anet.channel.p009e;

import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0890b;
import anet.channel.entity.EventCb;
import anet.channel.statist.Http3DetectStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.e.f */
/* loaded from: classes.dex */
class C0887f implements EventCb {

    /* renamed from: a */
    final /* synthetic */ IConnStrategy f5139a;

    /* renamed from: b */
    final /* synthetic */ RunnableC0886e f5140b;

    C0887f(RunnableC0886e runnableC0886e, IConnStrategy iConnStrategy) {
        this.f5140b = runnableC0886e;
        this.f5139a = iConnStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    @Override // anet.channel.entity.EventCb
    public void onEvent(Session session, int i4, C0890b c0890b) {
        ?? r5 = i4 != 1 ? 0 : 1;
        C0882a.f5124a.m4443a(NetworkStatusHelper.getUniqueId(this.f5140b.f5138b), r5);
        session.close(false);
        Http3DetectStat http3DetectStat = new Http3DetectStat(C0882a.f5125b, this.f5139a);
        http3DetectStat.ret = r5;
        AppMonitor.getInstance().commitStat(http3DetectStat);
    }
}
