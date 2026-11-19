package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.b */
/* loaded from: classes3.dex */
public class C5027b {

    /* renamed from: a */
    static int f2466a = 0;

    /* renamed from: b */
    static long f2467b = 0;

    /* renamed from: c */
    static long f2468c = 0;

    /* renamed from: d */
    static long f2469d = 0;

    /* renamed from: e */
    static long f2470e = 0;

    /* renamed from: f */
    static long f2471f = 0;

    /* renamed from: g */
    static double f2472g = 0.0d;

    /* renamed from: h */
    static double f2473h = 0.0d;

    /* renamed from: i */
    static double f2474i = 0.0d;

    /* renamed from: j */
    static double f2475j = 40.0d;

    /* renamed from: k */
    private static volatile boolean f2476k = false;

    /* renamed from: l */
    private int f2477l;

    /* renamed from: m */
    private int f2478m;

    /* renamed from: n */
    private C5030e f2479n;

    /* renamed from: anet.channel.monitor.b$a */
    public static class a {

        /* renamed from: a */
        static C5027b f2480a = new C5027b(null);
    }

    public /* synthetic */ C5027b(C5028c c5028c) {
        this();
    }

    /* renamed from: b */
    public static /* synthetic */ int m2357b(C5027b c5027b) {
        int i10 = c5027b.f2478m;
        c5027b.f2478m = i10 + 1;
        return i10;
    }

    /* renamed from: d */
    public synchronized void m2363d() {
        try {
            ALog.m2530i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
        } catch (Exception e10) {
            ALog.m2531w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e10, new Object[0]);
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            f2476k = false;
        } else {
            f2476k = true;
        }
    }

    /* renamed from: e */
    public void m2364e() {
        f2476k = false;
    }

    private C5027b() {
        this.f2477l = 5;
        this.f2478m = 0;
        this.f2479n = new C5030e();
        NetworkStatusHelper.addStatusChangeListener(new C5028c(this));
    }

    /* renamed from: c */
    public double m2362c() {
        return f2474i;
    }

    /* renamed from: a */
    public static C5027b m2355a() {
        return a.f2480a;
    }

    /* renamed from: b */
    public int m2361b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f2477l;
    }

    /* renamed from: a */
    public void m2360a(long j10, long j11, long j12) {
        if (f2476k) {
            if (ALog.isPrintLog(1)) {
                ALog.m2527d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j10), "mRequestFinishedTime", Long.valueOf(j11), "mRequestDataSize", Long.valueOf(j12));
            }
            if (j12 <= 3000 || j10 >= j11) {
                return;
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC5029d(this, j12, j11, j10));
        }
    }
}
