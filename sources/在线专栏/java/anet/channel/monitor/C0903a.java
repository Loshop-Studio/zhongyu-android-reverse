package anet.channel.monitor;

import anet.channel.util.ALog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: anet.channel.monitor.a */
/* loaded from: classes.dex */
public class C0903a {

    /* renamed from: a */
    private static volatile C0903a f5185a;

    /* renamed from: b */
    private Map<INetworkQualityChangeListener, C0908f> f5186b = new ConcurrentHashMap();

    /* renamed from: c */
    private C0908f f5187c = new C0908f();

    private C0903a() {
    }

    /* renamed from: a */
    public static C0903a m4459a() {
        if (f5185a == null) {
            synchronized (C0903a.class) {
                if (f5185a == null) {
                    f5185a = new C0903a();
                }
            }
        }
        return f5185a;
    }

    /* renamed from: a */
    public void m4462a(INetworkQualityChangeListener iNetworkQualityChangeListener, C0908f c0908f) {
        if (iNetworkQualityChangeListener == null) {
            ALog.m4638e("BandWidthListenerHelp", "listener is null", null, new Object[0]);
            return;
        }
        if (c0908f == null) {
            this.f5187c.f5220b = System.currentTimeMillis();
            this.f5186b.put(iNetworkQualityChangeListener, this.f5187c);
        } else {
            c0908f.f5220b = System.currentTimeMillis();
            this.f5186b.put(iNetworkQualityChangeListener, c0908f);
        }
    }

    /* renamed from: a */
    public void m4461a(INetworkQualityChangeListener iNetworkQualityChangeListener) {
        this.f5186b.remove(iNetworkQualityChangeListener);
    }

    /* renamed from: a */
    public void m4460a(double d4) {
        boolean zM4477a;
        for (Map.Entry<INetworkQualityChangeListener, C0908f> entry : this.f5186b.entrySet()) {
            INetworkQualityChangeListener key = entry.getKey();
            C0908f value = entry.getValue();
            if (key != null && value != null && !value.m4478b() && value.f5219a != (zM4477a = value.m4477a(d4))) {
                value.f5219a = zM4477a;
                key.onNetworkQualityChanged(zM4477a ? NetworkSpeed.Slow : NetworkSpeed.Fast);
            }
        }
    }
}
