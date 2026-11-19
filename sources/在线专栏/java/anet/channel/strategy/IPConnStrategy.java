package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C0947l;
import java.io.Serializable;

/* loaded from: classes.dex */
class IPConnStrategy implements IConnStrategy, Serializable {
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;

    /* renamed from: a */
    volatile int f5343a = 1;

    /* renamed from: b */
    volatile int f5344b = 1;

    /* renamed from: c */
    transient boolean f5345c;
    public volatile int cto;
    public volatile int heartbeat;

    /* renamed from: ip */
    public final String f5346ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    private IPConnStrategy(String str, int i4, ConnProtocol connProtocol, int i5, int i6, int i7, int i8) {
        this.f5346ip = str;
        this.port = i4;
        this.protocol = connProtocol;
        this.cto = i5;
        this.rto = i6;
        this.retry = i7;
        this.heartbeat = i8;
    }

    /* renamed from: a */
    static IPConnStrategy m4570a(String str, C0947l.a aVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(aVar);
        if (connProtocolValueOf == null) {
            return null;
        }
        return m4569a(str, aVar.f5410a, connProtocolValueOf, aVar.f5412c, aVar.f5413d, aVar.f5414e, aVar.f5415f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof IPConnStrategy)) {
            return false;
        }
        IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
        return this.port == iPConnStrategy.port && this.f5346ip.equals(iPConnStrategy.f5346ip) && this.protocol.equals(iPConnStrategy.protocol);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getConnectionTimeout() {
        return this.cto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getHeartbeat() {
        return this.heartbeat;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public String getIp() {
        return this.f5346ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f5344b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f5343a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getPort() {
        return this.port;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public ConnProtocol getProtocol() {
        return this.protocol;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getReadTimeout() {
        return this.rto;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getRetryTimes() {
        return this.retry;
    }

    public int getUniqueId() {
        return hashCode();
    }

    public int hashCode() {
        return ((((527 + this.f5346ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append('{');
        sb.append(this.f5346ip);
        if (this.f5343a == 0) {
            sb.append("(*)");
        }
        sb.append(' ');
        sb.append(this.port);
        sb.append(' ');
        sb.append(this.protocol);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    static IPConnStrategy m4569a(String str, int i4, ConnProtocol connProtocol, int i5, int i6, int i7, int i8) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i4 <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i4, connProtocol, i5, i6, i7, i8);
    }
}
