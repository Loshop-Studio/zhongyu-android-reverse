package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.CoroutineLiveDataKt;
import com.blankj.utilcode.util.RunnableC3378a;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes3.dex */
public final class C4063at {

    /* renamed from: D */
    private static C4063at f3570D = null;

    /* renamed from: a */
    public static int f3571a = 0;

    /* renamed from: b */
    public static boolean f3572b = false;

    /* renamed from: d */
    public static int f3573d = 2;

    /* renamed from: e */
    public static boolean f3574e = false;

    /* renamed from: f */
    public static int f3575f = 20480;

    /* renamed from: g */
    public static int f3576g = 3000;

    /* renamed from: h */
    public static int f3577h = 20480;

    /* renamed from: i */
    public static long f3578i = 209715200;

    /* renamed from: j */
    public static long f3579j = 604800000;

    /* renamed from: k */
    public static String f3580k = null;

    /* renamed from: l */
    public static boolean f3581l = false;

    /* renamed from: m */
    public static String f3582m = null;

    /* renamed from: n */
    public static int f3583n = 5000;

    /* renamed from: o */
    public static boolean f3584o = true;

    /* renamed from: p */
    public static boolean f3585p = false;

    /* renamed from: q */
    public static String f3586q;

    /* renamed from: r */
    public static String f3587r;

    /* renamed from: A */
    public Boolean f3588A;

    /* renamed from: B */
    public int f3589B = 31;

    /* renamed from: C */
    public boolean f3590C = false;

    /* renamed from: c */
    public final Context f3591c;

    /* renamed from: s */
    public final C4062as f3592s;

    /* renamed from: t */
    public final C4065av f3593t;

    /* renamed from: u */
    public final NativeCrashHandler f3594u;

    /* renamed from: v */
    public final C4046ac f3595v;

    /* renamed from: w */
    public final C4054ak f3596w;

    /* renamed from: x */
    public final C4068ay f3597x;

    /* renamed from: y */
    public BuglyStrategy.C4032a f3598y;

    /* renamed from: z */
    public InterfaceC4066aw f3599z;

    private C4063at(Context context, C4054ak c4054ak, boolean z8, BuglyStrategy.C4032a c4032a) {
        f3571a = 1004;
        Context contextM3051a = C4059ap.m3051a(context);
        this.f3591c = contextM3051a;
        C4046ac c4046acM2951a = C4046ac.m2951a();
        this.f3595v = c4046acM2951a;
        this.f3596w = c4054ak;
        this.f3598y = c4032a;
        this.f3599z = null;
        C4062as c4062as = new C4062as(contextM3051a, C4052ai.m2986a(), C4143w.m3393a(), c4046acM2951a, c4032a);
        this.f3592s = c4062as;
        C4044aa c4044aaM2888a = C4044aa.m2888a(contextM3051a);
        this.f3593t = new C4065av(contextM3051a, c4062as, c4046acM2951a, c4044aaM2888a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM3051a, c4044aaM2888a, c4062as, c4046acM2951a, c4054ak, z8, null);
        this.f3594u = nativeCrashHandler;
        c4044aaM2888a.f3395N = nativeCrashHandler;
        if (C4068ay.f3630f == null) {
            C4068ay.f3630f = new C4068ay(contextM3051a, c4046acM2951a, c4044aaM2888a, c4054ak, c4062as);
        }
        this.f3597x = C4068ay.f3630f;
    }

    /* renamed from: c */
    public final synchronized void m3151c() {
        this.f3593t.m3175b();
        m3152d();
        m3155g();
    }

    /* renamed from: d */
    public final void m3152d() {
        this.f3594u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m3153e() {
        this.f3594u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m3154f() {
        new Handler(Looper.getMainLooper()).post(new RunnableC3378a(3));
        this.f3597x.m3197b(true);
    }

    /* renamed from: g */
    public final void m3155g() {
        new Handler(Looper.getMainLooper()).post(new RunnableC3378a(4));
        this.f3597x.m3197b(false);
    }

    /* renamed from: h */
    public final synchronized void m3156h() {
        int i = 0;
        while (true) {
            int i8 = i + 1;
            if (i < 30) {
                try {
                    C4055al.m3021a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i8));
                    C4059ap.m3080b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i = i8;
                } catch (Throwable th) {
                    if (C4055al.m3022a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m3157i() {
        return this.f3597x.f3631a.get();
    }

    /* renamed from: j */
    public final boolean m3158j() {
        return (this.f3589B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m3159k() {
        return (this.f3589B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C4063at m3144a(Context context, boolean z8, BuglyStrategy.C4032a c4032a) {
        try {
            if (f3570D == null) {
                f3570D = new C4063at(context, C4054ak.m3012a(), z8, c4032a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3570D;
    }

    /* renamed from: b */
    public final synchronized void m3150b() {
        this.f3593t.m3172a();
        m3153e();
        m3154f();
    }

    /* renamed from: a */
    public static synchronized C4063at m3143a() {
        return f3570D;
    }

    /* renamed from: a */
    public final synchronized void m3149a(boolean z8, boolean z9, boolean z10) {
        this.f3594u.testNativeCrash(z8, z9, z10);
    }

    /* renamed from: a */
    public final void m3148a(CrashDetailBean crashDetailBean) {
        this.f3592s.m3141b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m3147a(long j7) {
        C4054ak.m3012a().m3015a(new C4150z0(this, 0), j7);
    }
}
