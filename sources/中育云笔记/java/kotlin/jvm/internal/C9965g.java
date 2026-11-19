package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p325rc.AbstractC10963o0;

/* renamed from: kotlin.jvm.internal.g */
/* loaded from: classes6.dex */
public final class C9965g extends AbstractC10963o0 {

    /* renamed from: c */
    public final long[] f23414c;

    /* renamed from: d */
    public int f23415d;

    public C9965g(long[] array) {
        AbstractC9979u.m20294g(array, "array");
        this.f23414c = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23415d < this.f23414c.length;
    }

    @Override // p325rc.AbstractC10963o0
    public long nextLong() {
        try {
            long[] jArr = this.f23414c;
            int i10 = this.f23415d;
            this.f23415d = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23415d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
