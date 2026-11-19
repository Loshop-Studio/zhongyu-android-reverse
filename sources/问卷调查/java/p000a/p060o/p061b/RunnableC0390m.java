package p000a.p060o.p061b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
import p000a.p031h.p039f.C0218b;

/* renamed from: a.o.b.m */
/* loaded from: classes.dex */
public final class RunnableC0390m implements Runnable {

    /* renamed from: f */
    public static final ThreadLocal<RunnableC0390m> f2303f = new ThreadLocal<>();

    /* renamed from: g */
    public static Comparator<c> f2304g = new a();

    /* renamed from: c */
    public long f2306c;

    /* renamed from: d */
    public long f2307d;

    /* renamed from: b */
    public ArrayList<RecyclerView> f2305b = new ArrayList<>();

    /* renamed from: e */
    public ArrayList<c> f2308e = new ArrayList<>();

    /* renamed from: a.o.b.m$a */
    public static class a implements Comparator<c> {
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0017, code lost:
        
            if (r0 == null) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
        
            if (r0 != false) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
        
            return 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        
            return -1;
         */
        @Override // java.util.Comparator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int compare(p000a.p060o.p061b.RunnableC0390m.c r7, p000a.p060o.p061b.RunnableC0390m.c r8) {
            /*
                r6 = this;
                a.o.b.m$c r7 = (p000a.p060o.p061b.RunnableC0390m.c) r7
                a.o.b.m$c r8 = (p000a.p060o.p061b.RunnableC0390m.c) r8
                androidx.recyclerview.widget.RecyclerView r0 = r7.f2316d
                r1 = 0
                r2 = 1
                if (r0 != 0) goto Lc
                r3 = r2
                goto Ld
            Lc:
                r3 = r1
            Ld:
                androidx.recyclerview.widget.RecyclerView r4 = r8.f2316d
                if (r4 != 0) goto L13
                r4 = r2
                goto L14
            L13:
                r4 = r1
            L14:
                r5 = -1
                if (r3 == r4) goto L1d
                if (r0 != 0) goto L1b
            L19:
                r1 = r2
                goto L37
            L1b:
                r1 = r5
                goto L37
            L1d:
                boolean r0 = r7.f2313a
                boolean r3 = r8.f2313a
                if (r0 == r3) goto L26
                if (r0 == 0) goto L19
                goto L1b
            L26:
                int r0 = r8.f2314b
                int r2 = r7.f2314b
                int r0 = r0 - r2
                if (r0 == 0) goto L2f
                r1 = r0
                goto L37
            L2f:
                int r7 = r7.f2315c
                int r8 = r8.f2315c
                int r7 = r7 - r8
                if (r7 == 0) goto L37
                r1 = r7
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p000a.p060o.p061b.RunnableC0390m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: a.o.b.m$b */
    public static class b implements RecyclerView.AbstractC0538l.c {

        /* renamed from: a */
        public int f2309a;

        /* renamed from: b */
        public int f2310b;

        /* renamed from: c */
        public int[] f2311c;

        /* renamed from: d */
        public int f2312d;

        /* renamed from: a */
        public void m1377a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f2312d * 2;
            int[] iArr = this.f2311c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2311c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f2311c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2311c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f2312d++;
        }

        /* renamed from: b */
        public void m1378b(RecyclerView recyclerView, boolean z) {
            this.f2312d = 0;
            int[] iArr = this.f2311c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.AbstractC0538l abstractC0538l = recyclerView.f3311m;
            if (recyclerView.f3309l == null || abstractC0538l == null || !abstractC0538l.f3358k) {
                return;
            }
            if (z) {
                if (!recyclerView.f3295e.m1308g()) {
                    abstractC0538l.mo1792j(recyclerView.f3309l.mo1891a(), this);
                }
            } else if (!recyclerView.m1837M()) {
                abstractC0538l.mo1790i(this.f2309a, this.f2310b, recyclerView.f3298f0, this);
            }
            int i = this.f2312d;
            if (i > abstractC0538l.f3359l) {
                abstractC0538l.f3359l = i;
                abstractC0538l.f3360m = z;
                recyclerView.f3291c.m1987m();
            }
        }

        /* renamed from: c */
        public boolean m1379c(int i) {
            if (this.f2311c != null) {
                int i2 = this.f2312d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2311c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a.o.b.m$c */
    public static class c {

        /* renamed from: a */
        public boolean f2313a;

        /* renamed from: b */
        public int f2314b;

        /* renamed from: c */
        public int f2315c;

        /* renamed from: d */
        public RecyclerView f2316d;

        /* renamed from: e */
        public int f2317e;
    }

    /* renamed from: a */
    public void m1374a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2306c == 0) {
            this.f2306c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.f3296e0;
        bVar.f2309a = i;
        bVar.f2310b = i2;
    }

    /* renamed from: b */
    public void m1375b(long j) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        int size = this.f2305b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f2305b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.f3296e0.m1378b(recyclerView3, false);
                i += recyclerView3.f3296e0.f2312d;
            }
        }
        this.f2308e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f2305b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar = recyclerView4.f3296e0;
                int iAbs = Math.abs(bVar.f2310b) + Math.abs(bVar.f2309a);
                for (int i5 = 0; i5 < bVar.f2312d * 2; i5 += 2) {
                    if (i3 >= this.f2308e.size()) {
                        cVar2 = new c();
                        this.f2308e.add(cVar2);
                    } else {
                        cVar2 = this.f2308e.get(i3);
                    }
                    int[] iArr = bVar.f2311c;
                    int i6 = iArr[i5 + 1];
                    cVar2.f2313a = i6 <= iAbs;
                    cVar2.f2314b = iAbs;
                    cVar2.f2315c = i6;
                    cVar2.f2316d = recyclerView4;
                    cVar2.f2317e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f2308e, f2304g);
        for (int i7 = 0; i7 < this.f2308e.size() && (recyclerView = (cVar = this.f2308e.get(i7)).f2316d) != null; i7++) {
            RecyclerView.AbstractC0552z abstractC0552zM1376c = m1376c(recyclerView, cVar.f2317e, cVar.f2313a ? Long.MAX_VALUE : j);
            if (abstractC0552zM1376c != null && abstractC0552zM1376c.f3429b != null && abstractC0552zM1376c.m2007i() && !abstractC0552zM1376c.m2008j() && (recyclerView2 = abstractC0552zM1376c.f3429b.get()) != null) {
                if (recyclerView2.f3266B && recyclerView2.f3297f.m1331h() != 0) {
                    recyclerView2.m1854d0();
                }
                b bVar2 = recyclerView2.f3296e0;
                bVar2.m1378b(recyclerView2, true);
                if (bVar2.f2312d != 0) {
                    try {
                        int i8 = C0218b.f1483a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.C0549w c0549w = recyclerView2.f3298f0;
                        RecyclerView.AbstractC0530d abstractC0530d = recyclerView2.f3309l;
                        c0549w.f3409d = 1;
                        c0549w.f3410e = abstractC0530d.mo1891a();
                        c0549w.f3412g = false;
                        c0549w.f3413h = false;
                        c0549w.f3414i = false;
                        for (int i9 = 0; i9 < bVar2.f2312d * 2; i9 += 2) {
                            m1376c(recyclerView2, bVar2.f2311c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = C0218b.f1483a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            cVar.f2313a = false;
            cVar.f2314b = 0;
            cVar.f2315c = 0;
            cVar.f2316d = null;
            cVar.f2317e = 0;
        }
    }

    /* renamed from: c */
    public final RecyclerView.AbstractC0552z m1376c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int iM1331h = recyclerView.f3297f.m1331h();
        int i2 = 0;
        while (true) {
            if (i2 >= iM1331h) {
                z = false;
                break;
            }
            RecyclerView.AbstractC0552z abstractC0552zM1821K = RecyclerView.m1821K(recyclerView.f3297f.m1330g(i2));
            if (abstractC0552zM1821K.f3430c == i && !abstractC0552zM1821K.m2008j()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.C0544r c0544r = recyclerView.f3291c;
        try {
            recyclerView.m1845U();
            RecyclerView.AbstractC0552z abstractC0552zM1985k = c0544r.m1985k(i, false, j);
            if (abstractC0552zM1985k != null) {
                if (!abstractC0552zM1985k.m2007i() || abstractC0552zM1985k.m2008j()) {
                    c0544r.m1975a(abstractC0552zM1985k, false);
                } else {
                    c0544r.m1982h(abstractC0552zM1985k.f3428a);
                }
            }
            return abstractC0552zM1985k;
        } finally {
            recyclerView.m1846V(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i = C0218b.f1483a;
            Trace.beginSection("RV Prefetch");
            if (this.f2305b.isEmpty()) {
                this.f2306c = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f2305b.size();
            long jMax = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f2305b.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                }
            }
            if (jMax == 0) {
                this.f2306c = 0L;
                Trace.endSection();
            } else {
                m1375b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2307d);
                this.f2306c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f2306c = 0L;
            int i3 = C0218b.f1483a;
            Trace.endSection();
            throw th;
        }
    }
}
