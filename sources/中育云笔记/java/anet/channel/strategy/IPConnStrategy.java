package anet.channel.strategy;

import android.text.TextUtils;
import anet.channel.strategy.C5070l;
import java.io.Serializable;

/* loaded from: classes3.dex */
class IPConnStrategy implements IConnStrategy, Serializable {
    public static final int SOURCE_AMDC = 0;
    public static final int SOURCE_CUSTOMIZED = 2;
    public static final int SOURCE_LOCAL_DNS = 1;
    public static final int TYPE_IP_TO_HOST = -1;
    public static final int TYPE_NORMAL = 1;
    public static final int TYPE_STATIC_BANDWITDH = 0;

    /* renamed from: a */
    volatile int f2621a = 1;

    /* renamed from: b */
    volatile int f2622b = 1;

    /* renamed from: c */
    transient boolean f2623c;
    public volatile int cto;
    public volatile int heartbeat;

    /* renamed from: ip */
    public final String f2624ip;
    public final int port;
    public final ConnProtocol protocol;
    public volatile int retry;
    public volatile int rto;

    private IPConnStrategy(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        this.f2624ip = str;
        this.port = i10;
        this.protocol = connProtocol;
        this.cto = i11;
        this.rto = i12;
        this.retry = i13;
        this.heartbeat = i14;
    }

    /* renamed from: a */
    public static IPConnStrategy m2461a(String str, C5070l.a aVar) {
        ConnProtocol connProtocolValueOf = ConnProtocol.valueOf(aVar);
        if (connProtocolValueOf == null) {
            return null;
        }
        return m2460a(str, aVar.f2688a, connProtocolValueOf, aVar.f2690c, aVar.f2691d, aVar.f2692e, aVar.f2693f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof IPConnStrategy)) {
            IPConnStrategy iPConnStrategy = (IPConnStrategy) obj;
            if (this.port == iPConnStrategy.port && this.f2624ip.equals(iPConnStrategy.f2624ip) && this.protocol.equals(iPConnStrategy.protocol)) {
                return true;
            }
        }
        return false;
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
        return this.f2624ip;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpSource() {
        return this.f2622b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public int getIpType() {
        return this.f2621a;
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
        return ((((527 + this.f2624ip.hashCode()) * 31) + this.port) * 31) + this.protocol.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append('{');
        sb2.append(this.f2624ip);
        if (this.f2621a == 0) {
            sb2.append("(*)");
        }
        sb2.append(' ');
        sb2.append(this.port);
        sb2.append(' ');
        sb2.append(this.protocol);
        sb2.append('}');
        return sb2.toString();
    }

    /* renamed from: a */
    public static IPConnStrategy m2460a(String str, int i10, ConnProtocol connProtocol, int i11, int i12, int i13, int i14) {
        if (TextUtils.isEmpty(str) || connProtocol == null || i10 <= 0) {
            return null;
        }
        return new IPConnStrategy(str, i10, connProtocol, i11, i12, i13, i14);
    }
}
