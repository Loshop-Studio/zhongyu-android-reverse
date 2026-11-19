package p191n8;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p077d8.AbstractC8323h;

/* renamed from: n8.y */
/* loaded from: classes5.dex */
public final class C9472y {
    private volatile AtomicReferenceArray<Object> array;

    public C9472y(int i10) {
        this.array = new AtomicReferenceArray<>(i10);
    }

    /* renamed from: a */
    public final int m17411a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m17412b(int i10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i10 < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i10);
        }
        return null;
    }

    /* renamed from: c */
    public final void m17413c(int i10, Object obj) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i10 < length) {
            atomicReferenceArray.set(i10, obj);
            return;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(AbstractC8323h.m13510e(i10 + 1, length * 2));
        for (int i11 = 0; i11 < length; i11++) {
            atomicReferenceArray2.set(i11, atomicReferenceArray.get(i11));
        }
        atomicReferenceArray2.set(i10, obj);
        this.array = atomicReferenceArray2;
    }
}
