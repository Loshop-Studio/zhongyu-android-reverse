package anet.channel.strategy;

import java.util.Comparator;

/* renamed from: anet.channel.strategy.o */
/* loaded from: classes3.dex */
final class C5073o implements Comparator<StrategyCollection> {
    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        return strategyCollection.f2626b != strategyCollection2.f2626b ? (int) (strategyCollection.f2626b - strategyCollection2.f2626b) : strategyCollection.f2625a.compareTo(strategyCollection2.f2625a);
    }
}
