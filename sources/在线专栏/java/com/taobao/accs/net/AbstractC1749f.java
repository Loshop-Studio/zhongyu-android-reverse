package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.ServiceReceiver;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.OrangeAdapter;

/* renamed from: com.taobao.accs.net.f */
/* loaded from: classes.dex */
public abstract class AbstractC1749f {

    /* renamed from: b */
    protected static volatile AbstractC1749f f7677b;

    /* renamed from: c */
    private static final int[] f7678c = {270, 360, 480};

    /* renamed from: a */
    protected Context f7679a;

    /* renamed from: d */
    private int f7680d;

    /* renamed from: e */
    private long f7681e;

    /* renamed from: f */
    private boolean f7682f = false;

    /* renamed from: g */
    private int[] f7683g = {0, 0, 0};

    /* renamed from: h */
    private boolean f7684h;

    protected AbstractC1749f(Context context) {
        this.f7684h = true;
        try {
            this.f7679a = context;
            this.f7680d = 0;
            this.f7681e = System.currentTimeMillis();
            this.f7684h = OrangeAdapter.isSmartHb();
        } catch (Throwable th) {
            ALog.m6091e("HeartbeatManager", "HeartbeatManager", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static AbstractC1749f m6018a(Context context) {
        if (f7677b == null) {
            synchronized (AbstractC1749f.class) {
                if (f7677b == null) {
                    if (m6019b(context)) {
                        ALog.m6093i("HeartbeatManager", "hb use job", new Object[0]);
                        f7677b = new C1763t(context);
                    } else if (m6020c(context)) {
                        ALog.m6093i("HeartbeatManager", "hb use alarm", new Object[0]);
                        f7677b = new C1743a(context);
                    } else {
                        ALog.m6093i("HeartbeatManager", "hb use thread", new Object[0]);
                        f7677b = new C1764u(context);
                    }
                }
            }
        }
        return f7677b;
    }

    /* renamed from: b */
    private static boolean m6019b(Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getPackageName(), AccsJobService.class.getName())) == 1;
    }

    /* renamed from: c */
    private static boolean m6020c(Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getPackageName(), ServiceReceiver.class.getName())) == 1;
    }

    /* renamed from: a */
    protected abstract void mo5987a(int i4);

    /* renamed from: d */
    public void m6024d() {
        this.f7681e = -1L;
        ALog.m6090d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    /* renamed from: e */
    public void m6025e() {
        ALog.m6090d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f7681e <= 7199000) {
            this.f7682f = false;
            this.f7683g[this.f7680d] = 0;
            return;
        }
        int i4 = this.f7680d;
        if (i4 >= f7678c.length - 1 || this.f7683g[i4] > 2) {
            return;
        }
        ALog.m6090d("HeartbeatManager", "upgrade", new Object[0]);
        this.f7680d++;
        this.f7682f = true;
        this.f7681e = System.currentTimeMillis();
    }

    /* renamed from: f */
    public void m6026f() {
        this.f7680d = 0;
        this.f7681e = System.currentTimeMillis();
        ALog.m6090d("HeartbeatManager", "resetLevel", new Object[0]);
    }

    /* renamed from: b */
    public int m6022b() {
        int i4 = this.f7684h ? f7678c[this.f7680d] : 270;
        this.f7684h = OrangeAdapter.isSmartHb();
        return i4;
    }

    /* renamed from: c */
    public void m6023c() {
        this.f7681e = -1L;
        if (this.f7682f) {
            int[] iArr = this.f7683g;
            int i4 = this.f7680d;
            iArr[i4] = iArr[i4] + 1;
        }
        int i5 = this.f7680d;
        this.f7680d = i5 > 0 ? i5 - 1 : 0;
        ALog.m6090d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    /* renamed from: a */
    public synchronized void m6021a() {
        try {
            if (this.f7681e < 0) {
                this.f7681e = System.currentTimeMillis();
            }
            int iM6022b = m6022b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m6090d("HeartbeatManager", "set " + iM6022b, new Object[0]);
            }
            mo5987a(iM6022b);
        } catch (Throwable th) {
            ALog.m6091e("HeartbeatManager", "set", th, new Object[0]);
        }
    }
}
