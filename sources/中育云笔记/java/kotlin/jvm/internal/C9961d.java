package kotlin.jvm.internal;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: kotlin.jvm.internal.d */
/* loaded from: classes6.dex */
public final class C9961d implements Iterator, InterfaceC9624a {

    /* renamed from: c */
    public final Object[] f23412c;

    /* renamed from: d */
    public int f23413d;

    public C9961d(Object[] array) {
        AbstractC9979u.m20294g(array, "array");
        this.f23412c = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23413d < this.f23412c.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f23412c;
            int i10 = this.f23413d;
            this.f23413d = i10 + 1;
            return objArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f23413d--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
