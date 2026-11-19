package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.p009e.C0882a;
import anet.channel.util.ALog;

/* renamed from: anet.channel.strategy.h */
/* loaded from: classes.dex */
class C0943h implements IStrategyFilter {

    /* renamed from: a */
    final /* synthetic */ C0942g f5403a;

    C0943h(C0942g c0942g) {
        this.f5403a = c0942g;
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (ConnType.QUIC.equals(str) || ConnType.QUIC_PLAIN.equals(str)) {
            ALog.m4639i("awcn.StrategyCenter", "gquic strategy disabled", null, "strategy", iConnStrategy);
            return false;
        }
        boolean zIsHttp3Enable = AwcnConfig.isHttp3Enable();
        boolean zM4435b = C0882a.m4435b();
        if ((zIsHttp3Enable && zM4435b) || (!ConnType.HTTP3.equals(str) && !ConnType.HTTP3_PLAIN.equals(str))) {
            return true;
        }
        ALog.m4639i("awcn.StrategyCenter", "http3 strategy disabled", null, "strategy", iConnStrategy);
        return false;
    }
}
