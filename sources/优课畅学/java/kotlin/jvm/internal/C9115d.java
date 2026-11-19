package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p311y7.InterfaceC10668a;

/* renamed from: kotlin.jvm.internal.d */
/* loaded from: classes5.dex */
public final class C9115d implements Iterator, InterfaceC10668a {

    /* renamed from: a */
    public final Object[] f17483a;

    /* renamed from: b */
    public int f17484b;

    public C9115d(Object[] array) {
        AbstractC9133u.m16133g(array, "array");
        this.f17483a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f17484b < this.f17483a.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f17483a;
            int i10 = this.f17484b;
            this.f17484b = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f17484b--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
