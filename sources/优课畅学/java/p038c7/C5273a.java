package p038c7;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p008a7.InterfaceC0044c;
import p088e7.AbstractC8372e;

/* renamed from: c7.a */
/* loaded from: classes5.dex */
public final class C5273a implements InterfaceC0044c {

    /* renamed from: i */
    public static final int f2394i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f2395j = new Object();

    /* renamed from: b */
    public int f2397b;

    /* renamed from: c */
    public long f2398c;

    /* renamed from: d */
    public final int f2399d;

    /* renamed from: e */
    public AtomicReferenceArray f2400e;

    /* renamed from: f */
    public final int f2401f;

    /* renamed from: g */
    public AtomicReferenceArray f2402g;

    /* renamed from: a */
    public final AtomicLong f2396a = new AtomicLong();

    /* renamed from: h */
    public final AtomicLong f2403h = new AtomicLong();

    public C5273a(int i10) {
        int iM13669a = AbstractC8372e.m13669a(Math.max(8, i10));
        int i11 = iM13669a - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iM13669a + 1);
        this.f2400e = atomicReferenceArray;
        this.f2399d = i11;
        m2188b(iM13669a);
        this.f2402g = atomicReferenceArray;
        this.f2401f = i11;
        this.f2398c = iM13669a - 2;
        m2187p(0L);
    }

    /* renamed from: d */
    public static int m2183d(long j10, int i10) {
        return m2182c(((int) j10) & i10);
    }

    /* renamed from: h */
    public static Object m2184h(AtomicReferenceArray atomicReferenceArray, int i10) {
        return atomicReferenceArray.get(i10);
    }

    /* renamed from: m */
    private void m2185m(long j10) {
        this.f2403h.lazySet(j10);
    }

    /* renamed from: n */
    public static void m2186n(AtomicReferenceArray atomicReferenceArray, int i10, Object obj) {
        atomicReferenceArray.lazySet(i10, obj);
    }

    /* renamed from: p */
    private void m2187p(long j10) {
        this.f2396a.lazySet(j10);
    }

    /* renamed from: b */
    public final void m2188b(int i10) {
        this.f2397b = Math.min(i10 / 4, f2394i);
    }

    @Override // p008a7.InterfaceC0044c
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    /* renamed from: e */
    public final long m2189e() {
        return this.f2403h.get();
    }

    /* renamed from: f */
    public final long m2190f() {
        return this.f2396a.get();
    }

    /* renamed from: g */
    public final long m2191g() {
        return this.f2403h.get();
    }

    /* renamed from: i */
    public final AtomicReferenceArray m2192i(AtomicReferenceArray atomicReferenceArray, int i10) {
        int iM2182c = m2182c(i10);
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) m2184h(atomicReferenceArray, iM2182c);
        m2186n(atomicReferenceArray, iM2182c, null);
        return atomicReferenceArray2;
    }

    @Override // p008a7.InterfaceC0044c
    public boolean isEmpty() {
        return m2193j() == m2191g();
    }

    /* renamed from: j */
    public final long m2193j() {
        return this.f2396a.get();
    }

    /* renamed from: k */
    public final Object m2194k(AtomicReferenceArray atomicReferenceArray, long j10, int i10) {
        this.f2402g = atomicReferenceArray;
        int iM2183d = m2183d(j10, i10);
        Object objM2184h = m2184h(atomicReferenceArray, iM2183d);
        if (objM2184h != null) {
            m2186n(atomicReferenceArray, iM2183d, null);
            m2185m(j10 + 1);
        }
        return objM2184h;
    }

    /* renamed from: l */
    public final void m2195l(AtomicReferenceArray atomicReferenceArray, long j10, int i10, Object obj, long j11) {
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f2400e = atomicReferenceArray2;
        this.f2398c = (j11 + j10) - 1;
        m2186n(atomicReferenceArray2, i10, obj);
        m2196o(atomicReferenceArray, atomicReferenceArray2);
        m2186n(atomicReferenceArray, i10, f2395j);
        m2187p(j10 + 1);
    }

    /* renamed from: o */
    public final void m2196o(AtomicReferenceArray atomicReferenceArray, AtomicReferenceArray atomicReferenceArray2) {
        m2186n(atomicReferenceArray, m2182c(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    @Override // p008a7.InterfaceC0044c
    public boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f2400e;
        long jM2190f = m2190f();
        int i10 = this.f2399d;
        int iM2183d = m2183d(jM2190f, i10);
        if (jM2190f < this.f2398c) {
            return m2197q(atomicReferenceArray, obj, jM2190f, iM2183d);
        }
        long j10 = this.f2397b + jM2190f;
        if (m2184h(atomicReferenceArray, m2183d(j10, i10)) == null) {
            this.f2398c = j10 - 1;
            return m2197q(atomicReferenceArray, obj, jM2190f, iM2183d);
        }
        if (m2184h(atomicReferenceArray, m2183d(jM2190f + 1, i10)) == null) {
            return m2197q(atomicReferenceArray, obj, jM2190f, iM2183d);
        }
        m2195l(atomicReferenceArray, jM2190f, iM2183d, obj, i10);
        return true;
    }

    @Override // p008a7.InterfaceC0044c
    public Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f2402g;
        long jM2189e = m2189e();
        int i10 = this.f2401f;
        int iM2183d = m2183d(jM2189e, i10);
        Object objM2184h = m2184h(atomicReferenceArray, iM2183d);
        boolean z10 = objM2184h == f2395j;
        if (objM2184h == null || z10) {
            if (z10) {
                return m2194k(m2192i(atomicReferenceArray, i10 + 1), jM2189e, i10);
            }
            return null;
        }
        m2186n(atomicReferenceArray, iM2183d, null);
        m2185m(jM2189e + 1);
        return objM2184h;
    }

    /* renamed from: q */
    public final boolean m2197q(AtomicReferenceArray atomicReferenceArray, Object obj, long j10, int i10) {
        m2186n(atomicReferenceArray, i10, obj);
        m2187p(j10 + 1);
        return true;
    }

    /* renamed from: c */
    public static int m2182c(int i10) {
        return i10;
    }
}
