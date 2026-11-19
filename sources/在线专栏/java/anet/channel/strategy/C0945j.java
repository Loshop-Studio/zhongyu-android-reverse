package anet.channel.strategy;

import anet.channel.strategy.C0947l;
import anet.channel.strategy.StrategyList;

/* renamed from: anet.channel.strategy.j */
/* loaded from: classes.dex */
class C0945j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ C0947l.a f5405a;

    /* renamed from: b */
    final /* synthetic */ String f5406b;

    /* renamed from: c */
    final /* synthetic */ ConnProtocol f5407c;

    /* renamed from: d */
    final /* synthetic */ StrategyList f5408d;

    C0945j(StrategyList strategyList, C0947l.a aVar, String str, ConnProtocol connProtocol) {
        this.f5408d = strategyList;
        this.f5405a = aVar;
        this.f5406b = str;
        this.f5407c = connProtocol;
    }

    @Override // anet.channel.strategy.StrategyList.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        return iPConnStrategy.getPort() == this.f5405a.f5410a && iPConnStrategy.getIp().equals(this.f5406b) && iPConnStrategy.protocol.equals(this.f5407c);
    }
}
