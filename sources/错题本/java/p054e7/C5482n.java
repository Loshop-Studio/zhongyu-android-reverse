package p054e7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import org.jetbrains.annotations.NotNull;
import p068g7.C5606b;

/* renamed from: e7.n */
/* loaded from: classes4.dex */
public final class C5482n {

    @NotNull
    private volatile AtomicReferenceArray<Object> array;

    public C5482n(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m4855a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m4856b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m4857c(int i, C5606b c5606b) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c5606b);
            return;
        }
        int i8 = i + 1;
        int i9 = length * 2;
        if (i8 < i9) {
            i8 = i9;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i8);
        for (int i10 = 0; i10 < length; i10++) {
            atomicReferenceArray2.set(i10, atomicReferenceArray.get(i10));
        }
        atomicReferenceArray2.set(i, c5606b);
        this.array = atomicReferenceArray2;
    }
}
