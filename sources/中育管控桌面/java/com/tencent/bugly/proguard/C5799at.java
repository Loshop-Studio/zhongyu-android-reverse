package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C5786ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes3.dex */
public final class C5799at {

    /* renamed from: D */
    private static C5799at f4075D = null;

    /* renamed from: a */
    public static int f4076a = 0;

    /* renamed from: b */
    public static boolean f4077b = false;

    /* renamed from: d */
    public static int f4078d = 2;

    /* renamed from: e */
    public static boolean f4079e = false;

    /* renamed from: f */
    public static int f4080f = 20480;

    /* renamed from: g */
    public static int f4081g = 3000;

    /* renamed from: h */
    public static int f4082h = 20480;

    /* renamed from: i */
    public static long f4083i = 209715200;

    /* renamed from: j */
    public static long f4084j = 604800000;

    /* renamed from: k */
    public static String f4085k = null;

    /* renamed from: l */
    public static boolean f4086l = false;

    /* renamed from: m */
    public static String f4087m = null;

    /* renamed from: n */
    public static int f4088n = 5000;

    /* renamed from: o */
    public static boolean f4089o = true;

    /* renamed from: p */
    public static boolean f4090p = false;

    /* renamed from: q */
    public static String f4091q;

    /* renamed from: r */
    public static String f4092r;

    /* renamed from: A */
    public Boolean f4093A;

    /* renamed from: B */
    public int f4094B = 31;

    /* renamed from: C */
    public boolean f4095C = false;

    /* renamed from: c */
    public final Context f4096c;

    /* renamed from: s */
    public final C5798as f4097s;

    /* renamed from: t */
    public final C5801av f4098t;

    /* renamed from: u */
    public final NativeCrashHandler f4099u;

    /* renamed from: v */
    public final C5782ac f4100v;

    /* renamed from: w */
    public final C5790ak f4101w;

    /* renamed from: x */
    public final C5804ay f4102x;

    /* renamed from: y */
    public BuglyStrategy.C5765a f4103y;

    /* renamed from: z */
    public InterfaceC5802aw f4104z;

    private C5799at(Context context, C5790ak c5790ak, boolean z6, BuglyStrategy.C5765a c5765a) {
        f4076a = 1004;
        Context contextM3958a = C5795ap.m3958a(context);
        this.f4096c = contextM3958a;
        C5782ac c5782acM3857a = C5782ac.m3857a();
        this.f4100v = c5782acM3857a;
        this.f4101w = c5790ak;
        this.f4103y = c5765a;
        this.f4104z = null;
        C5798as c5798as = new C5798as(contextM3958a, C5788ai.m3893a(), C5849w.m4301a(), c5782acM3857a, c5765a);
        this.f4097s = c5798as;
        C5780aa c5780aaM3793a = C5780aa.m3793a(contextM3958a);
        this.f4098t = new C5801av(contextM3958a, c5798as, c5782acM3857a, c5780aaM3793a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM3958a, c5780aaM3793a, c5798as, c5782acM3857a, c5790ak, z6, null);
        this.f4099u = nativeCrashHandler;
        c5780aaM3793a.f3877N = nativeCrashHandler;
        if (C5804ay.f4145f == null) {
            C5804ay.f4145f = new C5804ay(contextM3958a, c5782acM3857a, c5780aaM3793a, c5790ak, c5798as);
        }
        this.f4102x = C5804ay.f4145f;
    }

    /* renamed from: c */
    public final synchronized void m4059c() {
        this.f4098t.m4083b();
        m4060d();
        m4063g();
    }

    /* renamed from: d */
    public final void m4060d() {
        this.f4099u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m4061e() {
        this.f4099u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m4062f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.1
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(true);
            }
        });
        this.f4102x.m4105b(true);
    }

    /* renamed from: g */
    public final void m4063g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.2
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(false);
            }
        });
        this.f4102x.m4105b(false);
    }

    /* renamed from: h */
    public final synchronized void m4064h() {
        int i6 = 0;
        while (true) {
            int i7 = i6 + 1;
            if (i6 < 30) {
                try {
                    C5791al.m3928a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i7));
                    C5795ap.m3987b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i6 = i7;
                } catch (Throwable th) {
                    if (C5791al.m3929a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m4065i() {
        return this.f4102x.f4146a.get();
    }

    /* renamed from: j */
    public final boolean m4066j() {
        return (this.f4094B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m4067k() {
        return (this.f4094B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C5799at m4052a(Context context, boolean z6, BuglyStrategy.C5765a c5765a) {
        try {
            if (f4075D == null) {
                f4075D = new C5799at(context, C5790ak.m3919a(), z6, c5765a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4075D;
    }

    /* renamed from: b */
    public final synchronized void m4058b() {
        this.f4098t.m4080a();
        m4061e();
        m4062f();
    }

    /* renamed from: a */
    public static synchronized C5799at m4051a() {
        return f4075D;
    }

    /* renamed from: a */
    public final synchronized void m4057a(boolean z6, boolean z7, boolean z8) {
        this.f4099u.testNativeCrash(z6, z7, z8);
    }

    /* renamed from: a */
    public final void m4056a(CrashDetailBean crashDetailBean) {
        this.f4097s.m4048b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m4055a(long j6) {
        C5790ak.m3919a().m3922a(new Thread() { // from class: com.tencent.bugly.proguard.at.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                List<CrashDetailBean> list;
                if (!C5795ap.m3977a(C5799at.this.f4096c, "local_crash_lock")) {
                    C5791al.m3932c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                C5786ag c5786ag = C5786ag.a.f3959a;
                List<C5786ag.b> listM3883a = C5786ag.m3883a();
                if (listM3883a == null || listM3883a.isEmpty()) {
                    C5791al.m3932c("sla local data is null", new Object[0]);
                } else {
                    C5791al.m3932c("sla load local data list size:%s", Integer.valueOf(listM3883a.size()));
                    Iterator<C5786ag.b> it = listM3883a.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        C5786ag.b next = it.next();
                        if (next.f3961b < C5795ap.m3983b() - 604800000) {
                            C5791al.m3932c("sla local data is expired:%s", next.f3962c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    C5786ag.m3886d(arrayList);
                    c5786ag.m3890b(listM3883a);
                }
                List<CrashDetailBean> listM4013a = C5798as.m4013a();
                if (listM4013a == null || listM4013a.size() <= 0) {
                    C5791al.m3932c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    C5791al.m3932c("Size of crash list: %s", Integer.valueOf(listM4013a.size()));
                    int size = listM4013a.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(listM4013a);
                        for (int i6 = 0; i6 < 20; i6++) {
                            arrayList2.add(listM4013a.get((size - 1) - i6));
                        }
                        list = arrayList2;
                    } else {
                        list = listM4013a;
                    }
                    C5799at.this.f4097s.m4046a(list, 0L, false, false, false);
                }
                C5795ap.m3989b(C5799at.this.f4096c, "local_crash_lock");
            }
        }, j6);
    }
}
