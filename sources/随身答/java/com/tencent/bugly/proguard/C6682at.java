package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C6669ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes4.dex */
public final class C6682at {

    /* renamed from: D */
    private static C6682at f5931D = null;

    /* renamed from: a */
    public static int f5932a = 0;

    /* renamed from: b */
    public static boolean f5933b = false;

    /* renamed from: d */
    public static int f5934d = 2;

    /* renamed from: e */
    public static boolean f5935e = false;

    /* renamed from: f */
    public static int f5936f = 20480;

    /* renamed from: g */
    public static int f5937g = 3000;

    /* renamed from: h */
    public static int f5938h = 20480;

    /* renamed from: i */
    public static long f5939i = 209715200;

    /* renamed from: j */
    public static long f5940j = 604800000;

    /* renamed from: k */
    public static String f5941k = null;

    /* renamed from: l */
    public static boolean f5942l = false;

    /* renamed from: m */
    public static String f5943m = null;

    /* renamed from: n */
    public static int f5944n = 5000;

    /* renamed from: o */
    public static boolean f5945o = true;

    /* renamed from: p */
    public static boolean f5946p = false;

    /* renamed from: q */
    public static String f5947q;

    /* renamed from: r */
    public static String f5948r;

    /* renamed from: A */
    public Boolean f5949A;

    /* renamed from: B */
    public int f5950B = 31;

    /* renamed from: C */
    public boolean f5951C = false;

    /* renamed from: c */
    public final Context f5952c;

    /* renamed from: s */
    public final C6681as f5953s;

    /* renamed from: t */
    public final C6684av f5954t;

    /* renamed from: u */
    public final NativeCrashHandler f5955u;

    /* renamed from: v */
    public final C6665ac f5956v;

    /* renamed from: w */
    public final C6673ak f5957w;

    /* renamed from: x */
    public final C6687ay f5958x;

    /* renamed from: y */
    public BuglyStrategy.C6648a f5959y;

    /* renamed from: z */
    public InterfaceC6685aw f5960z;

    private C6682at(Context context, C6673ak c6673ak, boolean z9, BuglyStrategy.C6648a c6648a) {
        f5932a = 1004;
        Context contextM5132a = C6678ap.m5132a(context);
        this.f5952c = contextM5132a;
        C6665ac c6665acM5031a = C6665ac.m5031a();
        this.f5956v = c6665acM5031a;
        this.f5957w = c6673ak;
        this.f5959y = c6648a;
        this.f5960z = null;
        C6681as c6681as = new C6681as(contextM5132a, C6671ai.m5067a(), C6732w.m5475a(), c6665acM5031a, c6648a);
        this.f5953s = c6681as;
        C6663aa c6663aaM4967a = C6663aa.m4967a(contextM5132a);
        this.f5954t = new C6684av(contextM5132a, c6681as, c6665acM5031a, c6663aaM4967a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM5132a, c6663aaM4967a, c6681as, c6665acM5031a, c6673ak, z9, null);
        this.f5955u = nativeCrashHandler;
        c6663aaM4967a.f5733N = nativeCrashHandler;
        if (C6687ay.f6001f == null) {
            C6687ay.f6001f = new C6687ay(contextM5132a, c6665acM5031a, c6663aaM4967a, c6673ak, c6681as);
        }
        this.f5958x = C6687ay.f6001f;
    }

    /* renamed from: c */
    public final synchronized void m5233c() {
        this.f5954t.m5257b();
        m5234d();
        m5237g();
    }

    /* renamed from: d */
    public final void m5234d() {
        this.f5955u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m5235e() {
        this.f5955u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m5236f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.1
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(true);
            }
        });
        this.f5958x.m5279b(true);
    }

    /* renamed from: g */
    public final void m5237g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.2
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(false);
            }
        });
        this.f5958x.m5279b(false);
    }

    /* renamed from: h */
    public final synchronized void m5238h() {
        int i9 = 0;
        while (true) {
            int i10 = i9 + 1;
            if (i9 < 30) {
                try {
                    C6674al.m5102a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i10));
                    C6678ap.m5161b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i9 = i10;
                } catch (Throwable th) {
                    if (C6674al.m5103a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m5239i() {
        return this.f5958x.f6002a.get();
    }

    /* renamed from: j */
    public final boolean m5240j() {
        return (this.f5950B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m5241k() {
        return (this.f5950B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C6682at m5226a(Context context, boolean z9, BuglyStrategy.C6648a c6648a) {
        try {
            if (f5931D == null) {
                f5931D = new C6682at(context, C6673ak.m5093a(), z9, c6648a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5931D;
    }

    /* renamed from: b */
    public final synchronized void m5232b() {
        this.f5954t.m5254a();
        m5235e();
        m5236f();
    }

    /* renamed from: a */
    public static synchronized C6682at m5225a() {
        return f5931D;
    }

    /* renamed from: a */
    public final synchronized void m5231a(boolean z9, boolean z10, boolean z11) {
        this.f5955u.testNativeCrash(z9, z10, z11);
    }

    /* renamed from: a */
    public final void m5230a(CrashDetailBean crashDetailBean) {
        this.f5953s.m5222b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m5229a(long j9) {
        C6673ak.m5093a().m5096a(new Thread() { // from class: com.tencent.bugly.proguard.at.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                List<CrashDetailBean> list;
                if (!C6678ap.m5151a(C6682at.this.f5952c, "local_crash_lock")) {
                    C6674al.m5106c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                C6669ag c6669ag = C6669ag.a.f5815a;
                List<C6669ag.b> listM5057a = C6669ag.m5057a();
                if (listM5057a == null || listM5057a.isEmpty()) {
                    C6674al.m5106c("sla local data is null", new Object[0]);
                } else {
                    C6674al.m5106c("sla load local data list size:%s", Integer.valueOf(listM5057a.size()));
                    Iterator<C6669ag.b> it = listM5057a.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        C6669ag.b next = it.next();
                        if (next.f5817b < C6678ap.m5157b() - 604800000) {
                            C6674al.m5106c("sla local data is expired:%s", next.f5818c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    C6669ag.m5060d(arrayList);
                    c6669ag.m5064b(listM5057a);
                }
                List<CrashDetailBean> listM5187a = C6681as.m5187a();
                if (listM5187a == null || listM5187a.size() <= 0) {
                    C6674al.m5106c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    C6674al.m5106c("Size of crash list: %s", Integer.valueOf(listM5187a.size()));
                    int size = listM5187a.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(listM5187a);
                        for (int i9 = 0; i9 < 20; i9++) {
                            arrayList2.add(listM5187a.get((size - 1) - i9));
                        }
                        list = arrayList2;
                    } else {
                        list = listM5187a;
                    }
                    C6682at.this.f5953s.m5220a(list, 0L, false, false, false);
                }
                C6678ap.m5163b(C6682at.this.f5952c, "local_crash_lock");
            }
        }, j9);
    }
}
