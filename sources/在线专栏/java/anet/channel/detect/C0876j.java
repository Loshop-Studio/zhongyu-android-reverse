package anet.channel.detect;

import anet.channel.strategy.C0947l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.detect.j */
/* loaded from: classes.dex */
final class C0876j implements IConnStrategy {

    /* renamed from: a */
    final /* synthetic */ C0947l.e f5110a;

    /* renamed from: b */
    final /* synthetic */ ConnProtocol f5111b;

    C0876j(C0947l.e eVar, ConnProtocol connProtocol) {
        this.f5110a = eVar;
        this.f5111b = connProtocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f5110a.f5441b.f5412c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f5110a.f5440a;
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
        return this.f5110a.f5441b.f5410a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.f5111b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f5110a.f5441b.f5413d;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return 0;
    }
}
