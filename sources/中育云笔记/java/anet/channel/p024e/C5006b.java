package anet.channel.p024e;

import anet.channel.entity.ConnType;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;

/* renamed from: anet.channel.e.b */
/* loaded from: classes3.dex */
final class C5006b implements IStrategyFilter {
    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        return ConnType.HTTP3.equals(str) || ConnType.HTTP3_PLAIN.equals(str);
    }
}
