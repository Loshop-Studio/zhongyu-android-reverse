package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C7774ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes5.dex */
public final class C7787at {

    /* renamed from: D */
    private static C7787at f13796D = null;

    /* renamed from: a */
    public static int f13797a = 0;

    /* renamed from: b */
    public static boolean f13798b = false;

    /* renamed from: d */
    public static int f13799d = 2;

    /* renamed from: e */
    public static boolean f13800e = false;

    /* renamed from: f */
    public static int f13801f = 20480;

    /* renamed from: g */
    public static int f13802g = 3000;

    /* renamed from: h */
    public static int f13803h = 20480;

    /* renamed from: i */
    public static long f13804i = 209715200;

    /* renamed from: j */
    public static long f13805j = 604800000;

    /* renamed from: k */
    public static String f13806k = null;

    /* renamed from: l */
    public static boolean f13807l = false;

    /* renamed from: m */
    public static String f13808m = null;

    /* renamed from: n */
    public static int f13809n = 5000;

    /* renamed from: o */
    public static boolean f13810o = true;

    /* renamed from: p */
    public static boolean f13811p = false;

    /* renamed from: q */
    public static String f13812q;

    /* renamed from: r */
    public static String f13813r;

    /* renamed from: A */
    public Boolean f13814A;

    /* renamed from: B */
    public int f13815B = 31;

    /* renamed from: C */
    public boolean f13816C = false;

    /* renamed from: c */
    public final Context f13817c;

    /* renamed from: s */
    public final C7786as f13818s;

    /* renamed from: t */
    public final C7789av f13819t;

    /* renamed from: u */
    public final NativeCrashHandler f13820u;

    /* renamed from: v */
    public final C7770ac f13821v;

    /* renamed from: w */
    public final C7778ak f13822w;

    /* renamed from: x */
    public final C7792ay f13823x;

    /* renamed from: y */
    public BuglyStrategy.C7753a f13824y;

    /* renamed from: z */
    public InterfaceC7790aw f13825z;

    /* renamed from: com.tencent.bugly.proguard.at$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeCrashHandler.getInstance().unBlockSigquit(true);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.at$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            NativeCrashHandler.getInstance().unBlockSigquit(false);
        }
    }

    /* renamed from: com.tencent.bugly.proguard.at$c */
    public class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            List<CrashDetailBean> list;
            if (!C7783ap.m10662a(C7787at.this.f13817c, "local_crash_lock")) {
                C7779al.m10617c("Failed to lock file for uploading local crash.", new Object[0]);
                return;
            }
            C7774ag c7774ag = C7774ag.a.f13678a;
            List<C7774ag.b> listM10568a = C7774ag.m10568a();
            if (listM10568a == null || listM10568a.isEmpty()) {
                C7779al.m10617c("sla local data is null", new Object[0]);
            } else {
                C7779al.m10617c("sla load local data list size:%s", Integer.valueOf(listM10568a.size()));
                Iterator<C7774ag.b> it = listM10568a.iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    C7774ag.b next = it.next();
                    if (next.f13680b < C7783ap.m10668b() - 604800000) {
                        C7779al.m10617c("sla local data is expired:%s", next.f13681c);
                        arrayList.add(next);
                        it.remove();
                    }
                }
                C7774ag.m10571d(arrayList);
                c7774ag.m10575b(listM10568a);
            }
            List<CrashDetailBean> listM10698a = C7786as.m10698a();
            if (listM10698a == null || listM10698a.size() <= 0) {
                C7779al.m10617c("no crash need to be uploaded at this start", new Object[0]);
            } else {
                C7779al.m10617c("Size of crash list: %s", Integer.valueOf(listM10698a.size()));
                int size = listM10698a.size();
                if (size > 20) {
                    ArrayList arrayList2 = new ArrayList();
                    Collections.sort(listM10698a);
                    for (int i10 = 0; i10 < 20; i10++) {
                        arrayList2.add(listM10698a.get((size - 1) - i10));
                    }
                    list = arrayList2;
                } else {
                    list = listM10698a;
                }
                C7787at.this.f13818s.m10731a(list, 0L, false, false, false);
            }
            C7783ap.m10674b(C7787at.this.f13817c, "local_crash_lock");
        }
    }

    private C7787at(Context context, C7778ak c7778ak, boolean z10, BuglyStrategy.C7753a c7753a) {
        f13797a = 1004;
        Context contextM10643a = C7783ap.m10643a(context);
        this.f13817c = contextM10643a;
        C7770ac c7770acM10542a = C7770ac.m10542a();
        this.f13821v = c7770acM10542a;
        this.f13822w = c7778ak;
        this.f13824y = c7753a;
        this.f13825z = null;
        C7786as c7786as = new C7786as(contextM10643a, C7776ai.m10578a(), C7837w.m10986a(), c7770acM10542a, c7753a);
        this.f13818s = c7786as;
        C7768aa c7768aaM10478a = C7768aa.m10478a(contextM10643a);
        this.f13819t = new C7789av(contextM10643a, c7786as, c7770acM10542a, c7768aaM10478a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM10643a, c7768aaM10478a, c7786as, c7770acM10542a, c7778ak, z10, null);
        this.f13820u = nativeCrashHandler;
        c7768aaM10478a.f13598N = nativeCrashHandler;
        if (C7792ay.f13866f == null) {
            C7792ay.f13866f = new C7792ay(contextM10643a, c7770acM10542a, c7768aaM10478a, c7778ak, c7786as);
        }
        this.f13823x = C7792ay.f13866f;
    }

    /* renamed from: c */
    public final synchronized void m10744c() {
        this.f13819t.m10768b();
        m10745d();
        m10748g();
    }

    /* renamed from: d */
    public final void m10745d() {
        this.f13820u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m10746e() {
        this.f13820u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m10747f() {
        new Handler(Looper.getMainLooper()).post(new a());
        this.f13823x.m10790b(true);
    }

    /* renamed from: g */
    public final void m10748g() {
        new Handler(Looper.getMainLooper()).post(new b());
        this.f13823x.m10790b(false);
    }

    /* renamed from: h */
    public final synchronized void m10749h() {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 < 30) {
                try {
                    C7779al.m10613a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i11));
                    C7783ap.m10672b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i10 = i11;
                } catch (Throwable th) {
                    if (C7779al.m10614a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m10750i() {
        return this.f13823x.f13867a.get();
    }

    /* renamed from: j */
    public final boolean m10751j() {
        return (this.f13815B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m10752k() {
        return (this.f13815B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C7787at m10737a(Context context, boolean z10, BuglyStrategy.C7753a c7753a) {
        try {
            if (f13796D == null) {
                f13796D = new C7787at(context, C7778ak.m10604a(), z10, c7753a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f13796D;
    }

    /* renamed from: b */
    public final synchronized void m10743b() {
        this.f13819t.m10765a();
        m10746e();
        m10747f();
    }

    /* renamed from: a */
    public static synchronized C7787at m10736a() {
        return f13796D;
    }

    /* renamed from: a */
    public final synchronized void m10742a(boolean z10, boolean z11, boolean z12) {
        this.f13820u.testNativeCrash(z10, z11, z12);
    }

    /* renamed from: a */
    public final void m10741a(CrashDetailBean crashDetailBean) {
        this.f13818s.m10733b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m10740a(long j10) {
        C7778ak.m10604a().m10607a(new c(), j10);
    }
}
