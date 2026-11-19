package anet.channel.p024e;

import anet.channel.entity.ConnType;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.e.g */
/* loaded from: classes3.dex */
final class C5011g implements IConnStrategy {

    /* renamed from: a */
    final /* synthetic */ IConnStrategy f2419a;

    public C5011g(IConnStrategy iConnStrategy) {
        this.f2419a = iConnStrategy;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.f2419a.getConnectionTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.f2419a.getHeartbeat();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f2419a.getIp();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f2419a.getIpSource();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f2419a.getIpType();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.f2419a.getPort();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        this.f2419a.getProtocol();
        return ConnProtocol.valueOf(ConnType.HTTP3_1RTT, null, null);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.f2419a.getReadTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.f2419a.getRetryTimes();
    }
}
