package anet.channel.entity;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import anet.channel.strategy.IConnStrategy;

/* renamed from: anet.channel.entity.a */
/* loaded from: classes3.dex */
public class C5012a {

    /* renamed from: a */
    public final IConnStrategy f2420a;

    /* renamed from: b */
    public int f2421b = 0;

    /* renamed from: c */
    public int f2422c = 0;

    /* renamed from: d */
    private String f2423d;

    /* renamed from: e */
    private String f2424e;

    public C5012a(String str, String str2, IConnStrategy iConnStrategy) {
        this.f2420a = iConnStrategy;
        this.f2423d = str;
        this.f2424e = str2;
    }

    /* renamed from: a */
    public String m2337a() {
        IConnStrategy iConnStrategy = this.f2420a;
        if (iConnStrategy != null) {
            return iConnStrategy.getIp();
        }
        return null;
    }

    /* renamed from: b */
    public int m2338b() {
        IConnStrategy iConnStrategy = this.f2420a;
        if (iConnStrategy != null) {
            return iConnStrategy.getPort();
        }
        return 0;
    }

    /* renamed from: c */
    public ConnType m2339c() {
        IConnStrategy iConnStrategy = this.f2420a;
        return iConnStrategy != null ? ConnType.valueOf(iConnStrategy.getProtocol()) : ConnType.HTTP;
    }

    /* renamed from: d */
    public int m2340d() {
        IConnStrategy iConnStrategy = this.f2420a;
        return (iConnStrategy == null || iConnStrategy.getConnectionTimeout() == 0) ? AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : this.f2420a.getConnectionTimeout();
    }

    /* renamed from: e */
    public int m2341e() {
        IConnStrategy iConnStrategy = this.f2420a;
        return (iConnStrategy == null || iConnStrategy.getReadTimeout() == 0) ? AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH : this.f2420a.getReadTimeout();
    }

    /* renamed from: f */
    public String m2342f() {
        return this.f2423d;
    }

    /* renamed from: g */
    public int m2343g() {
        IConnStrategy iConnStrategy = this.f2420a;
        if (iConnStrategy != null) {
            return iConnStrategy.getHeartbeat();
        }
        return 45000;
    }

    /* renamed from: h */
    public String m2344h() {
        return this.f2424e;
    }

    public String toString() {
        return "ConnInfo [ip=" + m2337a() + ",port=" + m2338b() + ",type=" + m2339c() + ",hb" + m2343g() + "]";
    }
}
