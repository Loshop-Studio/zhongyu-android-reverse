package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.entity.ConnType;
import anet.channel.p024e.C5005a;
import anet.channel.util.ALog;

/* renamed from: anet.channel.strategy.h */
/* loaded from: classes3.dex */
class C5066h implements IStrategyFilter {

    /* renamed from: a */
    final /* synthetic */ C5065g f2681a;

    public C5066h(C5065g c5065g) {
        this.f2681a = c5065g;
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (ConnType.QUIC.equals(str) || ConnType.QUIC_PLAIN.equals(str)) {
            ALog.m2530i("awcn.StrategyCenter", "gquic strategy disabled", null, "strategy", iConnStrategy);
            return false;
        }
        boolean zIsHttp3Enable = AwcnConfig.isHttp3Enable();
        boolean zM2326b = C5005a.m2326b();
        if (zIsHttp3Enable && zM2326b) {
            return true;
        }
        if (!ConnType.HTTP3.equals(str) && !ConnType.HTTP3_PLAIN.equals(str)) {
            return true;
        }
        ALog.m2530i("awcn.StrategyCenter", "http3 strategy disabled", null, "strategy", iConnStrategy);
        return false;
    }
}
