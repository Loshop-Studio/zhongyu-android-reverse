package kotlin.jvm.internal;

import java.util.NoSuchElementException;
import p134i7.AbstractC8794n0;

/* renamed from: kotlin.jvm.internal.g */
/* loaded from: classes5.dex */
public final class C9119g extends AbstractC8794n0 {

    /* renamed from: a */
    public final long[] f17485a;

    /* renamed from: b */
    public int f17486b;

    public C9119g(long[] array) {
        AbstractC9133u.m16133g(array, "array");
        this.f17485a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17486b < this.f17485a.length;
    }

    @Override // p134i7.AbstractC8794n0
    public long nextLong() {
        try {
            long[] jArr = this.f17485a;
            int i10 = this.f17486b;
            this.f17486b = i10 + 1;
            return jArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17486b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}
