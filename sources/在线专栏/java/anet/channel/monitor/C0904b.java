package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;

/* renamed from: anet.channel.monitor.b */
/* loaded from: classes.dex */
public class C0904b {

    /* renamed from: a */
    static int f5188a = 0;

    /* renamed from: b */
    static long f5189b = 0;

    /* renamed from: c */
    static long f5190c = 0;

    /* renamed from: d */
    static long f5191d = 0;

    /* renamed from: e */
    static long f5192e = 0;

    /* renamed from: f */
    static long f5193f = 0;

    /* renamed from: g */
    static double f5194g = 0.0d;

    /* renamed from: h */
    static double f5195h = 0.0d;

    /* renamed from: i */
    static double f5196i = 0.0d;

    /* renamed from: j */
    static double f5197j = 40.0d;

    /* renamed from: k */
    private static volatile boolean f5198k = false;

    /* renamed from: l */
    private int f5199l;

    /* renamed from: m */
    private int f5200m;

    /* renamed from: n */
    private C0907e f5201n;

    /* renamed from: anet.channel.monitor.b$a */
    static class a {

        /* renamed from: a */
        static C0904b f5202a = new C0904b(null);

        a() {
        }
    }

    /* synthetic */ C0904b(C0905c c0905c) {
        this();
    }

    /* renamed from: b */
    static /* synthetic */ int m4466b(C0904b c0904b) {
        int i4 = c0904b.f5200m;
        c0904b.f5200m = i4 + 1;
        return i4;
    }

    /* renamed from: d */
    public synchronized void m4472d() {
        try {
            ALog.m4639i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
        } catch (Exception e4) {
            ALog.m4640w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e4, new Object[0]);
        }
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            f5198k = false;
        } else {
            f5198k = true;
        }
    }

    /* renamed from: e */
    public void m4473e() {
        f5198k = false;
    }

    private C0904b() {
        this.f5199l = 5;
        this.f5200m = 0;
        this.f5201n = new C0907e();
        NetworkStatusHelper.addStatusChangeListener(new C0905c(this));
    }

    /* renamed from: c */
    public double m4471c() {
        return f5196i;
    }

    /* renamed from: a */
    public static C0904b m4464a() {
        return a.f5202a;
    }

    /* renamed from: b */
    public int m4470b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f5199l;
    }

    /* renamed from: a */
    public void m4469a(long j4, long j5, long j6) {
        if (f5198k) {
            if (ALog.isPrintLog(1)) {
                ALog.m4636d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j4), "mRequestFinishedTime", Long.valueOf(j5), "mRequestDataSize", Long.valueOf(j6));
            }
            if (j6 <= 3000 || j4 >= j5) {
                return;
            }
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0906d(this, j6, j5, j4));
        }
    }
}
