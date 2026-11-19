package anet.channel.entity;

import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.entity.a */
/* loaded from: classes.dex */
public class C0889a {

    /* renamed from: a */
    public final IConnStrategy f5142a;

    /* renamed from: b */
    public int f5143b = 0;

    /* renamed from: c */
    public int f5144c = 0;

    /* renamed from: d */
    private String f5145d;

    /* renamed from: e */
    private String f5146e;

    public C0889a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f5142a = iConnStrategy;
        this.f5145d = str;
        this.f5146e = str2;
    }

    /* renamed from: a */
    public String m4446a() {
        IConnStrategy iConnStrategy = this.f5142a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    /* renamed from: b */
    public int m4447b() {
        IConnStrategy iConnStrategy = this.f5142a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    /* renamed from: c */
    public ConnType m4448c() {
        IConnStrategy iConnStrategy = this.f5142a;
        return iConnStrategy != null ? ConnType.valueOf(iConnStrategy.getProtocol()) : ConnType.HTTP;
    }

    /* renamed from: d */
    public int m4449d() {
        IConnStrategy iConnStrategy = this.f5142a;
        if (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) {
            return 20000;
        }
        return this.f5142a.getConnectionTimeout();
    }

    /* renamed from: e */
    public int m4450e() {
        IConnStrategy iConnStrategy = this.f5142a;
        if (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) {
            return 20000;
        }
        return this.f5142a.getReadTimeout();
    }

    /* renamed from: f */
    public String m4451f() {
        return this.f5145d;
    }

    /* renamed from: g */
    public int m4452g() {
        IConnStrategy iConnStrategy = this.f5142a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    /* renamed from: h */
    public String m4453h() {
        return this.f5146e;
    }

    public String toString() {
        return "ConnInfo [ip=" + m4446a() + ",port=" + m4447b() + ",type=" + m4448c() + ",hb" + m4452g() + "]";
    }
}
