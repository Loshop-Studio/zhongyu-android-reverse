package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C6431ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes4.dex */
public final class C6444at {

    /* renamed from: D */
    private static C6444at f4697D = null;

    /* renamed from: a */
    public static int f4698a = 0;

    /* renamed from: b */
    public static boolean f4699b = false;

    /* renamed from: d */
    public static int f4700d = 2;

    /* renamed from: e */
    public static boolean f4701e = false;

    /* renamed from: f */
    public static int f4702f = 20480;

    /* renamed from: g */
    public static int f4703g = 3000;

    /* renamed from: h */
    public static int f4704h = 20480;

    /* renamed from: i */
    public static long f4705i = 209715200;

    /* renamed from: j */
    public static long f4706j = 604800000;

    /* renamed from: k */
    public static String f4707k = null;

    /* renamed from: l */
    public static boolean f4708l = false;

    /* renamed from: m */
    public static String f4709m = null;

    /* renamed from: n */
    public static int f4710n = 5000;

    /* renamed from: o */
    public static boolean f4711o = true;

    /* renamed from: p */
    public static boolean f4712p = false;

    /* renamed from: q */
    public static String f4713q;

    /* renamed from: r */
    public static String f4714r;

    /* renamed from: A */
    public Boolean f4715A;

    /* renamed from: B */
    public int f4716B = 31;

    /* renamed from: C */
    public boolean f4717C = false;

    /* renamed from: c */
    public final Context f4718c;

    /* renamed from: s */
    public final C6443as f4719s;

    /* renamed from: t */
    public final C6446av f4720t;

    /* renamed from: u */
    public final NativeCrashHandler f4721u;

    /* renamed from: v */
    public final C6427ac f4722v;

    /* renamed from: w */
    public final C6435ak f4723w;

    /* renamed from: x */
    public final C6449ay f4724x;

    /* renamed from: y */
    public BuglyStrategy.C6410a f4725y;

    /* renamed from: z */
    public InterfaceC6447aw f4726z;

    private C6444at(Context context, C6435ak c6435ak, boolean z10, BuglyStrategy.C6410a c6410a) {
        f4698a = 1004;
        Context contextM4313a = C6440ap.m4313a(context);
        this.f4718c = contextM4313a;
        C6427ac c6427acM4212a = C6427ac.m4212a();
        this.f4722v = c6427acM4212a;
        this.f4723w = c6435ak;
        this.f4725y = c6410a;
        this.f4726z = null;
        C6443as c6443as = new C6443as(contextM4313a, C6433ai.m4248a(), C6494w.m4656a(), c6427acM4212a, c6410a);
        this.f4719s = c6443as;
        C6425aa c6425aaM4148a = C6425aa.m4148a(contextM4313a);
        this.f4720t = new C6446av(contextM4313a, c6443as, c6427acM4212a, c6425aaM4148a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM4313a, c6425aaM4148a, c6443as, c6427acM4212a, c6435ak, z10, null);
        this.f4721u = nativeCrashHandler;
        c6425aaM4148a.f4499N = nativeCrashHandler;
        if (C6449ay.f4767f == null) {
            C6449ay.f4767f = new C6449ay(contextM4313a, c6427acM4212a, c6425aaM4148a, c6435ak, c6443as);
        }
        this.f4724x = C6449ay.f4767f;
    }

    /* renamed from: c */
    public final synchronized void m4414c() {
        this.f4720t.m4438b();
        m4415d();
        m4418g();
    }

    /* renamed from: d */
    public final void m4415d() {
        this.f4721u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m4416e() {
        this.f4721u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m4417f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.1
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(true);
            }
        });
        this.f4724x.m4460b(true);
    }

    /* renamed from: g */
    public final void m4418g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.2
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(false);
            }
        });
        this.f4724x.m4460b(false);
    }

    /* renamed from: h */
    public final synchronized void m4419h() {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 < 30) {
                try {
                    C6436al.m4283a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i11));
                    C6440ap.m4342b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i10 = i11;
                } catch (Throwable th) {
                    if (C6436al.m4284a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m4420i() {
        return this.f4724x.f4768a.get();
    }

    /* renamed from: j */
    public final boolean m4421j() {
        return (this.f4716B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m4422k() {
        return (this.f4716B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C6444at m4407a(Context context, boolean z10, BuglyStrategy.C6410a c6410a) {
        try {
            if (f4697D == null) {
                f4697D = new C6444at(context, C6435ak.m4274a(), z10, c6410a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4697D;
    }

    /* renamed from: b */
    public final synchronized void m4413b() {
        this.f4720t.m4435a();
        m4416e();
        m4417f();
    }

    /* renamed from: a */
    public static synchronized C6444at m4406a() {
        return f4697D;
    }

    /* renamed from: a */
    public final synchronized void m4412a(boolean z10, boolean z11, boolean z12) {
        this.f4721u.testNativeCrash(z10, z11, z12);
    }

    /* renamed from: a */
    public final void m4411a(CrashDetailBean crashDetailBean) {
        this.f4719s.m4403b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m4410a(long j10) {
        C6435ak.m4274a().m4277a(new Thread() { // from class: com.tencent.bugly.proguard.at.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                List<CrashDetailBean> list;
                if (!C6440ap.m4332a(C6444at.this.f4718c, "local_crash_lock")) {
                    C6436al.m4287c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                C6431ag c6431ag = C6431ag.a.f4581a;
                List<C6431ag.b> listM4238a = C6431ag.m4238a();
                if (listM4238a == null || listM4238a.isEmpty()) {
                    C6436al.m4287c("sla local data is null", new Object[0]);
                } else {
                    C6436al.m4287c("sla load local data list size:%s", Integer.valueOf(listM4238a.size()));
                    Iterator<C6431ag.b> it = listM4238a.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        C6431ag.b next = it.next();
                        if (next.f4583b < C6440ap.m4338b() - 604800000) {
                            C6436al.m4287c("sla local data is expired:%s", next.f4584c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    C6431ag.m4241d(arrayList);
                    c6431ag.m4245b(listM4238a);
                }
                List<CrashDetailBean> listM4368a = C6443as.m4368a();
                if (listM4368a == null || listM4368a.size() <= 0) {
                    C6436al.m4287c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    C6436al.m4287c("Size of crash list: %s", Integer.valueOf(listM4368a.size()));
                    int size = listM4368a.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(listM4368a);
                        for (int i10 = 0; i10 < 20; i10++) {
                            arrayList2.add(listM4368a.get((size - 1) - i10));
                        }
                        list = arrayList2;
                    } else {
                        list = listM4368a;
                    }
                    C6444at.this.f4719s.m4401a(list, 0L, false, false, false);
                }
                C6440ap.m4344b(C6444at.this.f4718c, "local_crash_lock");
            }
        }, j10);
    }
}
