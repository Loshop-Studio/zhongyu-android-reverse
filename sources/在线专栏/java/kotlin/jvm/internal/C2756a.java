package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.jvm.internal.a */
/* loaded from: classes.dex */
final class C2756a<T> implements Iterator<T>, InterfaceC3498a {

    /* renamed from: a */
    @NotNull
    private final T[] f10718a;

    /* renamed from: b */
    private int f10719b;

    public C2756a(@NotNull T[] array) {
        C2769l.m9241e(array, "array");
        this.f10718a = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f10719b < this.f10718a.length;
    }

    @Override // java.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f10718a;
            int i4 = this.f10719b;
            this.f10719b = i4 + 1;
            return tArr[i4];
        } catch (ArrayIndexOutOfBoundsException e4) {
            this.f10719b--;
            throw new NoSuchElementException(e4.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
