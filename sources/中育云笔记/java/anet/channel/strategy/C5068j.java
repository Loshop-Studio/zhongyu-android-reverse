package anet.channel.strategy;

import anet.channel.strategy.C5070l;
import anet.channel.strategy.StrategyList;

/* renamed from: anet.channel.strategy.j */
/* loaded from: classes3.dex */
class C5068j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ C5070l.a f2683a;

    /* renamed from: b */
    final /* synthetic */ String f2684b;

    /* renamed from: c */
    final /* synthetic */ ConnProtocol f2685c;

    /* renamed from: d */
    final /* synthetic */ StrategyList f2686d;

    public C5068j(StrategyList strategyList, C5070l.a aVar, String str, ConnProtocol connProtocol) {
        this.f2686d = strategyList;
        this.f2683a = aVar;
        this.f2684b = str;
        this.f2685c = connProtocol;
    }

    @Override // anet.channel.strategy.StrategyList.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        return iPConnStrategy.getPort() == this.f2683a.f2688a && iPConnStrategy.getIp().equals(this.f2684b) && iPConnStrategy.protocol.equals(this.f2685c);
    }
}
