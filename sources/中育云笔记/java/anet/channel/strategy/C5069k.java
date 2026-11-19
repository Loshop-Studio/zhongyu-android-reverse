package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.k */
/* loaded from: classes3.dex */
class C5069k implements Comparator<IPConnStrategy> {

    /* renamed from: a */
    final /* synthetic */ StrategyList f2687a;

    public C5069k(StrategyList strategyList) {
        this.f2687a = strategyList;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        int i10;
        int i11;
        ConnHistoryItem connHistoryItem = (ConnHistoryItem) this.f2687a.f2643b.get(Integer.valueOf(iPConnStrategy.getUniqueId()));
        ConnHistoryItem connHistoryItem2 = (ConnHistoryItem) this.f2687a.f2643b.get(Integer.valueOf(iPConnStrategy2.getUniqueId()));
        int iM2455a = connHistoryItem.m2455a();
        int iM2455a2 = connHistoryItem2.m2455a();
        if (iM2455a != iM2455a2) {
            return iM2455a - iM2455a2;
        }
        if (iPConnStrategy.f2621a != iPConnStrategy2.f2621a) {
            i10 = iPConnStrategy.f2621a;
            i11 = iPConnStrategy2.f2621a;
        } else {
            i10 = iPConnStrategy.protocol.isHttp;
            i11 = iPConnStrategy2.protocol.isHttp;
        }
        return i10 - i11;
    }
}
