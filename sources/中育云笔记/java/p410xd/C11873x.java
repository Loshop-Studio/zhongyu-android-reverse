package p410xd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p265nd.AbstractC10410o;

/* renamed from: xd.x */
/* loaded from: classes6.dex */
public final class C11873x {
    private volatile AtomicReferenceArray<Object> array;

    public C11873x(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m26352a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m26353b(int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m26354c(int i10, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC10410o.m21752e(i10 + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, obj);
        this.array = atomicReferenceArray2;
    }
}
