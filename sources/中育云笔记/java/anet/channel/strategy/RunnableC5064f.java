package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import java.io.Serializable;
import java.util.Map;

/* renamed from: anet.channel.strategy.f */
/* loaded from: classes3.dex */
class RunnableC5064f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f2674a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder.LruStrategyMap f2675b;

    public RunnableC5064f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f2675b = lruStrategyMap;
        this.f2674a = entry;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f2674a.getValue();
        if (strategyTable.f2650d) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f2647a;
            C5071m.m2509a((Serializable) this.f2674a.getValue(), strategyTable.f2647a, strategyStatObject);
            strategyTable.f2650d = false;
        }
    }
}
