package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.monitor.a */
/* loaded from: classes3.dex */
public class C5026a {

    /* renamed from: a */
    private static volatile C5026a f2463a;

    /* renamed from: b */
    private Map<INetworkQualityChangeListener, C5031f> f2464b = new ConcurrentHashMap();

    /* renamed from: c */
    private C5031f f2465c = new C5031f();

    private C5026a() {
    }

    /* renamed from: a */
    public static C5026a m2350a() {
        if (f2463a == null) {
            synchronized (C5026a.class) {
                try {
                    if (f2463a == null) {
                        f2463a = new C5026a();
                    }
                } finally {
                }
            }
        }
        return f2463a;
    }

    /* renamed from: a */
    public void m2353a(INetworkQualityChangeListener iNetworkQualityChangeListener, C5031f c5031f) {
        if (iNetworkQualityChangeListener == null) {
            ALog.m2529e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
            return;
        }
        if (c5031f == null) {
            this.f2465c.f2498b = System.currentTimeMillis();
            this.f2464b.put(iNetworkQualityChangeListener, this.f2465c);
        } else {
            c5031f.f2498b = System.currentTimeMillis();
            this.f2464b.put(iNetworkQualityChangeListener, c5031f);
        }
    }

    /* renamed from: a */
    public void m2352a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f2464b.remove(iNetworkQualityChangeListener);
    }

    /* renamed from: a */
    public void m2351a(double d10) {
        boolean zM2368a;
        for (Map.Entry<INetworkQualityChangeListener, C5031f> entry : this.f2464b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            C5031f value = entry.getValue();
            if (key != null && value != null && !value.m2369b() && value.f2497a != (zM2368a = value.m2368a(d10))) {
                value.f2497a = zM2368a;
                key.onNetworkQualityChanged(zM2368a ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }
}
