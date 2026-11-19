package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.o */
/* loaded from: classes.dex */
final class C0950o implements Comparator<StrategyCollection> {
    C0950o() {
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        return strategyCollection.f5348b != strategyCollection2.f5348b ? (int) (strategyCollection.f5348b - strategyCollection2.f5348b) : strategyCollection.f5347a.compareTo(strategyCollection2.f5347a);
    }
}
