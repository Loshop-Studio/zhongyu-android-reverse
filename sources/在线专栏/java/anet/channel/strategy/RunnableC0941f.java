package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import java.io.Serializable;
import java.util.Map;

/* renamed from: anet.channel.strategy.f */
/* loaded from: classes.dex */
class RunnableC0941f implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Map.Entry f5396a;

    /* renamed from: b */
    final /* synthetic */ StrategyInfoHolder.LruStrategyMap f5397b;

    RunnableC0941f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f5397b = lruStrategyMap;
        this.f5396a = entry;
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f5396a.getValue();
        if (strategyTable.f5372d) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f5369a;
            C0948m.m4618a((Serializable) this.f5396a.getValue(), strategyTable.f5369a, strategyStatObject);
            strategyTable.f5372d = false;
        }
    }
}
