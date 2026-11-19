package p000a.p031h.p040g;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.p021e.C0134f;
import p000a.p021e.C0136h;
import p000a.p031h.p042i.InterfaceC0239a;

/* renamed from: a.h.g.j */
/* loaded from: classes.dex */
public class C0228j {

    /* renamed from: a */
    public static final C0134f<String, Typeface> f1506a = new C0134f<>(16);

    /* renamed from: b */
    public static final ExecutorService f1507b;

    /* renamed from: c */
    public static final Object f1508c;

    /* renamed from: d */
    public static final C0136h<String, ArrayList<InterfaceC0239a<a>>> f1509d;

    /* renamed from: a.h.g.j$a */
    public static final class a {

        /* renamed from: a */
        public final Typeface f1510a;

        /* renamed from: b */
        public final int f1511b;

        public a(int i) {
            this.f1510a = null;
            this.f1511b = i;
        }

        @SuppressLint({"WrongConstant"})
        public a(Typeface typeface) {
            this.f1510a = typeface;
            this.f1511b = 0;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0232n("fonts-androidx", 10));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1507b = threadPoolExecutor;
        f1508c = new Object();
        f1509d = new C0136h<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static p000a.p031h.p040g.C0228j.a m795a(java.lang.String r7, android.content.Context r8, p000a.p031h.p040g.C0223e r9, int r10) throws android.content.res.Resources.NotFoundException {
        /*
            a.e.f<java.lang.String, android.graphics.Typeface> r0 = p000a.p031h.p040g.C0228j.f1506a
            java.lang.Object r0 = r0.m500a(r7)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L10
            a.h.g.j$a r7 = new a.h.g.j$a
            r7.<init>(r0)
            return r7
        L10:
            r0 = 0
            a.h.g.k r9 = p000a.p031h.p040g.C0222d.m792a(r8, r9, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            int r1 = r9.f1512a
            r2 = -3
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1e
            goto L35
        L1e:
            r1 = -2
            goto L3e
        L20:
            a.h.g.l[] r1 = r9.f1513b
            if (r1 == 0) goto L3d
            int r4 = r1.length
            if (r4 != 0) goto L28
            goto L3d
        L28:
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L2b:
            if (r5 >= r3) goto L3c
            r6 = r1[r5]
            int r6 = r6.f1518e
            if (r6 == 0) goto L39
            if (r6 >= 0) goto L37
        L35:
            r1 = r2
            goto L3e
        L37:
            r1 = r6
            goto L3e
        L39:
            int r5 = r5 + 1
            goto L2b
        L3c:
            r3 = r4
        L3d:
            r1 = r3
        L3e:
            if (r1 == 0) goto L46
            a.h.g.j$a r7 = new a.h.g.j$a
            r7.<init>(r1)
            return r7
        L46:
            a.h.g.l[] r9 = r9.f1513b
            a.h.d.k r1 = p000a.p031h.p035d.C0205d.f1460a
            android.graphics.Typeface r8 = r1.mo769b(r8, r0, r9, r10)
            if (r8 == 0) goto L5b
            a.e.f<java.lang.String, android.graphics.Typeface> r9 = p000a.p031h.p040g.C0228j.f1506a
            r9.m501b(r7, r8)
            a.h.g.j$a r7 = new a.h.g.j$a
            r7.<init>(r8)
            return r7
        L5b:
            a.h.g.j$a r7 = new a.h.g.j$a
            r7.<init>(r2)
            return r7
        L61:
            a.h.g.j$a r7 = new a.h.g.j$a
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p031h.p040g.C0228j.m795a(java.lang.String, android.content.Context, a.h.g.e, int):a.h.g.j$a");
    }
}
