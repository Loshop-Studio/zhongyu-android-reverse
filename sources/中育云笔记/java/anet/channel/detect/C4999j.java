package anet.channel.detect;

import anet.channel.strategy.C5070l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.detect.j */
/* loaded from: classes3.dex */
final class C4999j implements IConnStrategy {

    /* renamed from: a */
    final /* synthetic */ C5070l.e f2388a;

    /* renamed from: b */
    final /* synthetic */ ConnProtocol f2389b;

    public C4999j(C5070l.e eVar, ConnProtocol connProtocol) {
        this.f2388a = eVar;
        this.f2389b = connProtocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f2388a.f2719b.f2690c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f2388a.f2718a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return 2;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return 1;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f2388a.f2719b.f2688a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.f2389b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f2388a.f2719b.f2691d;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return 0;
    }
}
