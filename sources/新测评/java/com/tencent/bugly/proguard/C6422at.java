package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler;
import com.tencent.bugly.proguard.C6409ag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.tencent.bugly.proguard.at */
/* loaded from: classes4.dex */
public final class C6422at {

    /* renamed from: D */
    private static C6422at f5354D = null;

    /* renamed from: a */
    public static int f5355a = 0;

    /* renamed from: b */
    public static boolean f5356b = false;

    /* renamed from: d */
    public static int f5357d = 2;

    /* renamed from: e */
    public static boolean f5358e = false;

    /* renamed from: f */
    public static int f5359f = 20480;

    /* renamed from: g */
    public static int f5360g = 3000;

    /* renamed from: h */
    public static int f5361h = 20480;

    /* renamed from: i */
    public static long f5362i = 209715200;

    /* renamed from: j */
    public static long f5363j = 604800000;

    /* renamed from: k */
    public static String f5364k = null;

    /* renamed from: l */
    public static boolean f5365l = false;

    /* renamed from: m */
    public static String f5366m = null;

    /* renamed from: n */
    public static int f5367n = 5000;

    /* renamed from: o */
    public static boolean f5368o = true;

    /* renamed from: p */
    public static boolean f5369p = false;

    /* renamed from: q */
    public static String f5370q;

    /* renamed from: r */
    public static String f5371r;

    /* renamed from: A */
    public Boolean f5372A;

    /* renamed from: B */
    public int f5373B = 31;

    /* renamed from: C */
    public boolean f5374C = false;

    /* renamed from: c */
    public final Context f5375c;

    /* renamed from: s */
    public final C6421as f5376s;

    /* renamed from: t */
    public final C6424av f5377t;

    /* renamed from: u */
    public final NativeCrashHandler f5378u;

    /* renamed from: v */
    public final C6405ac f5379v;

    /* renamed from: w */
    public final C6413ak f5380w;

    /* renamed from: x */
    public final C6427ay f5381x;

    /* renamed from: y */
    public BuglyStrategy.C6388a f5382y;

    /* renamed from: z */
    public InterfaceC6425aw f5383z;

    private C6422at(Context context, C6413ak c6413ak, boolean z9, BuglyStrategy.C6388a c6388a) {
        f5355a = 1004;
        Context contextM4953a = C6418ap.m4953a(context);
        this.f5375c = contextM4953a;
        C6405ac c6405acM4852a = C6405ac.m4852a();
        this.f5379v = c6405acM4852a;
        this.f5380w = c6413ak;
        this.f5382y = c6388a;
        this.f5383z = null;
        C6421as c6421as = new C6421as(contextM4953a, C6411ai.m4888a(), C6472w.m5296a(), c6405acM4852a, c6388a);
        this.f5376s = c6421as;
        C6403aa c6403aaM4788a = C6403aa.m4788a(contextM4953a);
        this.f5377t = new C6424av(contextM4953a, c6421as, c6405acM4852a, c6403aaM4788a);
        NativeCrashHandler nativeCrashHandler = NativeCrashHandler.getInstance(contextM4953a, c6403aaM4788a, c6421as, c6405acM4852a, c6413ak, z9, null);
        this.f5378u = nativeCrashHandler;
        c6403aaM4788a.f5156N = nativeCrashHandler;
        if (C6427ay.f5424f == null) {
            C6427ay.f5424f = new C6427ay(contextM4953a, c6405acM4852a, c6403aaM4788a, c6413ak, c6421as);
        }
        this.f5381x = C6427ay.f5424f;
    }

    /* renamed from: c */
    public final synchronized void m5054c() {
        this.f5377t.m5078b();
        m5055d();
        m5058g();
    }

    /* renamed from: d */
    public final void m5055d() {
        this.f5378u.setUserOpened(false);
    }

    /* renamed from: e */
    public final void m5056e() {
        this.f5378u.setUserOpened(true);
    }

    /* renamed from: f */
    public final void m5057f() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.1
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(true);
            }
        });
        this.f5381x.m5100b(true);
    }

    /* renamed from: g */
    public final void m5058g() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.tencent.bugly.proguard.at.2
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandler.getInstance().unBlockSigquit(false);
            }
        });
        this.f5381x.m5100b(false);
    }

    /* renamed from: h */
    public final synchronized void m5059h() {
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i10 < 30) {
                try {
                    C6414al.m4923a("try main sleep for make a test anr! try:%d/30 , kill it if you don't want to wait!", Integer.valueOf(i11));
                    C6418ap.m4982b(CoroutineLiveDataKt.DEFAULT_TIMEOUT);
                    i10 = i11;
                } catch (Throwable th) {
                    if (C6414al.m4924a(th)) {
                        return;
                    }
                    th.printStackTrace();
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m5060i() {
        return this.f5381x.f5425a.get();
    }

    /* renamed from: j */
    public final boolean m5061j() {
        return (this.f5373B & 16) > 0;
    }

    /* renamed from: k */
    public final boolean m5062k() {
        return (this.f5373B & 8) > 0;
    }

    /* renamed from: a */
    public static synchronized C6422at m5047a(Context context, boolean z9, BuglyStrategy.C6388a c6388a) {
        try {
            if (f5354D == null) {
                f5354D = new C6422at(context, C6413ak.m4914a(), z9, c6388a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f5354D;
    }

    /* renamed from: b */
    public final synchronized void m5053b() {
        this.f5377t.m5075a();
        m5056e();
        m5057f();
    }

    /* renamed from: a */
    public static synchronized C6422at m5046a() {
        return f5354D;
    }

    /* renamed from: a */
    public final synchronized void m5052a(boolean z9, boolean z10, boolean z11) {
        this.f5378u.testNativeCrash(z9, z10, z11);
    }

    /* renamed from: a */
    public final void m5051a(CrashDetailBean crashDetailBean) {
        this.f5376s.m5043b(crashDetailBean);
    }

    /* renamed from: a */
    public final void m5050a(long j10) {
        C6413ak.m4914a().m4917a(new Thread() { // from class: com.tencent.bugly.proguard.at.4
            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() {
                List<CrashDetailBean> list;
                if (!C6418ap.m4972a(C6422at.this.f5375c, "local_crash_lock")) {
                    C6414al.m4927c("Failed to lock file for uploading local crash.", new Object[0]);
                    return;
                }
                C6409ag c6409ag = C6409ag.a.f5238a;
                List<C6409ag.b> listM4878a = C6409ag.m4878a();
                if (listM4878a == null || listM4878a.isEmpty()) {
                    C6414al.m4927c("sla local data is null", new Object[0]);
                } else {
                    C6414al.m4927c("sla load local data list size:%s", Integer.valueOf(listM4878a.size()));
                    Iterator<C6409ag.b> it = listM4878a.iterator();
                    ArrayList arrayList = new ArrayList();
                    while (it.hasNext()) {
                        C6409ag.b next = it.next();
                        if (next.f5240b < C6418ap.m4978b() - 604800000) {
                            C6414al.m4927c("sla local data is expired:%s", next.f5241c);
                            arrayList.add(next);
                            it.remove();
                        }
                    }
                    C6409ag.m4881d(arrayList);
                    c6409ag.m4885b(listM4878a);
                }
                List<CrashDetailBean> listM5008a = C6421as.m5008a();
                if (listM5008a == null || listM5008a.size() <= 0) {
                    C6414al.m4927c("no crash need to be uploaded at this start", new Object[0]);
                } else {
                    C6414al.m4927c("Size of crash list: %s", Integer.valueOf(listM5008a.size()));
                    int size = listM5008a.size();
                    if (size > 20) {
                        ArrayList arrayList2 = new ArrayList();
                        Collections.sort(listM5008a);
                        for (int i10 = 0; i10 < 20; i10++) {
                            arrayList2.add(listM5008a.get((size - 1) - i10));
                        }
                        list = arrayList2;
                    } else {
                        list = listM5008a;
                    }
                    C6422at.this.f5376s.m5041a(list, 0L, false, false, false);
                }
                C6418ap.m4984b(C6422at.this.f5375c, "local_crash_lock");
            }
        }, j10);
    }
}
