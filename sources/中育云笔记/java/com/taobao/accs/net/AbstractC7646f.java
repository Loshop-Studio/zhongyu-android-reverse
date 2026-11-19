package com.taobao.accs.net;

import android.content.ComponentName;
import android.content.Context;
import com.taobao.accs.ServiceReceiver;
import com.taobao.accs.internal.AccsJobService;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.OrangeAdapter;

/* renamed from: com.taobao.accs.net.f */
/* loaded from: classes5.dex */
public abstract class AbstractC7646f {

    /* renamed from: b */
    protected static volatile AbstractC7646f f13075b;

    /* renamed from: c */
    private static final int[] f13076c = {270, 360, 480};

    /* renamed from: a */
    protected Context f13077a;

    /* renamed from: d */
    private int f13078d;

    /* renamed from: e */
    private long f13079e;

    /* renamed from: f */
    private boolean f13080f = false;

    /* renamed from: g */
    private int[] f13081g = {0, 0, 0};

    /* renamed from: h */
    private boolean f13082h;

    public AbstractC7646f(Context context) {
        this.f13082h = true;
        try {
            this.f13077a = context;
            this.f13078d = 0;
            this.f13079e = System.currentTimeMillis();
            this.f13082h = OrangeAdapter.isSmartHb();
        } catch (Throwable th) {
            ALog.m10117e("HeartbeatManager", "HeartbeatManager", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public static AbstractC7646f m10044a(Context context) {
        if (f13075b == null) {
            synchronized (AbstractC7646f.class) {
                try {
                    if (f13075b == null) {
                        if (m10045b(context)) {
                            ALog.m10119i("HeartbeatManager", "hb use job", new Object[0]);
                            f13075b = new C7660t(context);
                        } else if (m10046c(context)) {
                            ALog.m10119i("HeartbeatManager", "hb use alarm", new Object[0]);
                            f13075b = new C7640a(context);
                        } else {
                            ALog.m10119i("HeartbeatManager", "hb use thread", new Object[0]);
                            f13075b = new C7661u(context);
                        }
                    }
                } finally {
                }
            }
        }
        return f13075b;
    }

    /* renamed from: b */
    private static boolean m10045b(Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getPackageName(), AccsJobService.class.getName())) == 1;
    }

    /* renamed from: c */
    private static boolean m10046c(Context context) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context.getPackageName(), ServiceReceiver.class.getName())) == 1;
    }

    /* renamed from: a */
    public abstract void mo10013a(int i10);

    /* renamed from: d */
    public void m10050d() {
        this.f13079e = -1L;
        ALog.m10116d("HeartbeatManager", "onNetworkFail", new Object[0]);
    }

    /* renamed from: e */
    public void m10051e() {
        ALog.m10116d("HeartbeatManager", "onHeartbeatSucc", new Object[0]);
        if (System.currentTimeMillis() - this.f13079e <= 7199000) {
            this.f13080f = false;
            this.f13081g[this.f13078d] = 0;
            return;
        }
        int i10 = this.f13078d;
        if (i10 >= f13076c.length - 1 || this.f13081g[i10] > 2) {
            return;
        }
        ALog.m10116d("HeartbeatManager", "upgrade", new Object[0]);
        this.f13078d++;
        this.f13080f = true;
        this.f13079e = System.currentTimeMillis();
    }

    /* renamed from: f */
    public void m10052f() {
        this.f13078d = 0;
        this.f13079e = System.currentTimeMillis();
        ALog.m10116d("HeartbeatManager", "resetLevel", new Object[0]);
    }

    /* renamed from: b */
    public int m10048b() {
        int i10 = this.f13082h ? f13076c[this.f13078d] : 270;
        this.f13082h = OrangeAdapter.isSmartHb();
        return i10;
    }

    /* renamed from: c */
    public void m10049c() {
        this.f13079e = -1L;
        if (this.f13080f) {
            int[] iArr = this.f13081g;
            int i10 = this.f13078d;
            iArr[i10] = iArr[i10] + 1;
        }
        int i11 = this.f13078d;
        this.f13078d = i11 > 0 ? i11 - 1 : 0;
        ALog.m10116d("HeartbeatManager", "onNetworkTimeout", new Object[0]);
    }

    /* renamed from: a */
    public synchronized void m10047a() {
        try {
            if (this.f13079e < 0) {
                this.f13079e = System.currentTimeMillis();
            }
            int iM10048b = m10048b();
            if (ALog.isPrintLog(ALog.Level.D)) {
                ALog.m10116d("HeartbeatManager", "set " + iM10048b, new Object[0]);
            }
            mo10013a(iM10048b);
        } finally {
        }
    }
}
