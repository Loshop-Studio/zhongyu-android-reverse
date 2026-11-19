package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import p045d6.C5434j;

/* renamed from: kotlin.collections.d */
/* loaded from: classes2.dex */
public final class C5782d extends C5434j implements ListIterator {

    /* renamed from: d */
    public final /* synthetic */ AbstractC5786f f9177d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5782d(AbstractC5786f abstractC5786f, int i) {
        super(abstractC5786f, 5);
        this.f9177d = abstractC5786f;
        C5780c c5780c = AbstractC5786f.Companion;
        int size = abstractC5786f.size();
        c5780c.getClass();
        C5780c.m5144c(i, size);
        this.f8395b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f8395b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f8395b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f8395b - 1;
        this.f8395b = i;
        return this.f9177d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f8395b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
