package p178f;

import java.util.concurrent.atomic.AtomicReference;
import p160d.p162f.p164b.C1011d;

/* renamed from: f.e */
/* loaded from: classes.dex */
public final class C1081e {

    /* renamed from: b */
    public static final int f5661b;

    /* renamed from: c */
    public static final AtomicReference<C1080d>[] f5662c;

    /* renamed from: d */
    public static final C1081e f5663d = new C1081e();

    /* renamed from: a */
    public static final C1080d f5660a = new C1080d(new byte[0], 0, 0, false, false);

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f5661b = iHighestOneBit;
        AtomicReference<C1080d>[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f5662c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m2877a(C1080d c1080d) {
        C1011d.m2809e(c1080d, "segment");
        if (!(c1080d.f5658f == null && c1080d.f5659g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c1080d.f5656d) {
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        C1011d.m2808d(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<C1080d> atomicReference = f5662c[(int) (threadCurrentThread.getId() & (f5661b - 1))];
        C1080d c1080d2 = atomicReference.get();
        if (c1080d2 == f5660a) {
            return;
        }
        int i = c1080d2 != null ? c1080d2.f5655c : 0;
        if (i >= 65536) {
            return;
        }
        c1080d.f5658f = c1080d2;
        c1080d.f5654b = 0;
        c1080d.f5655c = i + 8192;
        if (atomicReference.compareAndSet(c1080d2, c1080d)) {
            return;
        }
        c1080d.f5658f = null;
    }

    /* renamed from: b */
    public static final C1080d m2878b() {
        Thread threadCurrentThread = Thread.currentThread();
        C1011d.m2808d(threadCurrentThread, "Thread.currentThread()");
        AtomicReference<C1080d> atomicReference = f5662c[(int) (threadCurrentThread.getId() & (f5661b - 1))];
        C1080d c1080d = f5660a;
        C1080d andSet = atomicReference.getAndSet(c1080d);
        if (andSet == c1080d) {
            return new C1080d();
        }
        if (andSet == null) {
            atomicReference.set(null);
            return new C1080d();
        }
        atomicReference.set(andSet.f5658f);
        andSet.f5658f = null;
        andSet.f5655c = 0;
        return andSet;
    }
}
