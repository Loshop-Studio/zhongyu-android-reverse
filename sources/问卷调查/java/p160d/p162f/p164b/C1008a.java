package p160d.p162f.p164b;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* renamed from: d.f.b.a */
/* loaded from: classes.dex */
public final class C1008a<T> implements Iterator<T> {

    /* renamed from: b */
    public int f5481b;

    /* renamed from: c */
    public final T[] f5482c;

    public C1008a(T[] tArr) {
        C1011d.m2809e(tArr, "array");
        this.f5482c = tArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5481b < this.f5482c.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f5482c;
            int i = this.f5481b;
            this.f5481b = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f5481b--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
