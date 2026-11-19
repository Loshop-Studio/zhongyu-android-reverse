package p206y5;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p192w5.InterfaceC6721b;

/* renamed from: y5.a */
/* loaded from: classes.dex */
public final class C6776a implements InterfaceC6721b {

    /* renamed from: i */
    public static final int f11450i = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: j */
    public static final Object f11451j = new Object();

    /* renamed from: a */
    public final AtomicLong f11452a;

    /* renamed from: b */
    public final int f11453b;

    /* renamed from: c */
    public long f11454c;

    /* renamed from: d */
    public final int f11455d;

    /* renamed from: e */
    public AtomicReferenceArray f11456e;

    /* renamed from: f */
    public final int f11457f;

    /* renamed from: g */
    public AtomicReferenceArray f11458g;

    /* renamed from: h */
    public final AtomicLong f11459h;

    public C6776a(int i) {
        AtomicLong atomicLong = new AtomicLong();
        this.f11452a = atomicLong;
        this.f11459h = new AtomicLong();
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(Math.max(8, i) - 1));
        int i8 = iNumberOfLeadingZeros - 1;
        AtomicReferenceArray atomicReferenceArray = new AtomicReferenceArray(iNumberOfLeadingZeros + 1);
        this.f11456e = atomicReferenceArray;
        this.f11455d = i8;
        this.f11453b = Math.min(iNumberOfLeadingZeros / 4, f11450i);
        this.f11458g = atomicReferenceArray;
        this.f11457f = i8;
        this.f11454c = iNumberOfLeadingZeros - 2;
        atomicLong.lazySet(0L);
    }

    @Override // p192w5.InterfaceC6721b
    public final void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // p192w5.InterfaceC6721b
    public final boolean isEmpty() {
        return this.f11452a.get() == this.f11459h.get();
    }

    @Override // p192w5.InterfaceC6721b
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicReferenceArray atomicReferenceArray = this.f11456e;
        AtomicLong atomicLong = this.f11452a;
        long j7 = atomicLong.get();
        int i = this.f11455d;
        int i8 = ((int) j7) & i;
        if (j7 < this.f11454c) {
            atomicReferenceArray.lazySet(i8, obj);
            atomicLong.lazySet(j7 + 1);
            return true;
        }
        long j8 = this.f11453b + j7;
        if (atomicReferenceArray.get(((int) j8) & i) == null) {
            this.f11454c = j8 - 1;
            atomicReferenceArray.lazySet(i8, obj);
            atomicLong.lazySet(j7 + 1);
            return true;
        }
        long j9 = j7 + 1;
        if (atomicReferenceArray.get(((int) j9) & i) == null) {
            atomicReferenceArray.lazySet(i8, obj);
            atomicLong.lazySet(j9);
            return true;
        }
        AtomicReferenceArray atomicReferenceArray2 = new AtomicReferenceArray(atomicReferenceArray.length());
        this.f11456e = atomicReferenceArray2;
        this.f11454c = (j7 + i) - 1;
        atomicReferenceArray2.lazySet(i8, obj);
        atomicReferenceArray.lazySet(atomicReferenceArray.length() - 1, atomicReferenceArray2);
        atomicReferenceArray.lazySet(i8, f11451j);
        atomicLong.lazySet(j9);
        return true;
    }

    @Override // p192w5.InterfaceC6721b
    public final Object poll() {
        AtomicReferenceArray atomicReferenceArray = this.f11458g;
        AtomicLong atomicLong = this.f11459h;
        long j7 = atomicLong.get();
        int i = this.f11457f;
        int i8 = ((int) j7) & i;
        Object obj = atomicReferenceArray.get(i8);
        boolean z8 = obj == f11451j;
        if (obj != null && !z8) {
            atomicReferenceArray.lazySet(i8, null);
            atomicLong.lazySet(j7 + 1);
            return obj;
        }
        if (!z8) {
            return null;
        }
        int i9 = i + 1;
        AtomicReferenceArray atomicReferenceArray2 = (AtomicReferenceArray) atomicReferenceArray.get(i9);
        atomicReferenceArray.lazySet(i9, null);
        this.f11458g = atomicReferenceArray2;
        Object obj2 = atomicReferenceArray2.get(i8);
        if (obj2 != null) {
            atomicReferenceArray2.lazySet(i8, null);
            atomicLong.lazySet(j7 + 1);
        }
        return obj2;
    }
}
