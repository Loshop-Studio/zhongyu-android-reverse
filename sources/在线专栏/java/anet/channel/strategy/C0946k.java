package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.k */
/* loaded from: classes.dex */
class C0946k implements Comparator<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ StrategyList f5409a;

    C0946k(StrategyList strategyList) {
        this.f5409a = strategyList;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        int i4;
        int i5;
        ConnHistoryItem connHistoryItem = (ConnHistoryItem) this.f5409a.f5365b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
        ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) this.f5409a.f5365b.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
        int iM4564a = connHistoryItem.m4564a();
        int iM4564a2 = connHistoryItem2.m4564a();
        if (iM4564a != iM4564a2) {
            return iM4564a - iM4564a2;
        }
        if (iPConnStrategy.f5343a != iPConnStrategy2.f5343a) {
            i4 = iPConnStrategy.f5343a;
            i5 = iPConnStrategy2.f5343a;
        } else {
            i4 = iPConnStrategy.protocol.isHttp;
            i5 = iPConnStrategy2.protocol.isHttp;
        }
        return i4 - i5;
    }
}
