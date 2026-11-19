package p325rc;

import id.InterfaceC9624a;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: rc.i0 */
/* loaded from: classes6.dex */
public final class C10951i0 implements ListIterator, InterfaceC9624a {

    /* renamed from: c */
    public static final C10951i0 f26455c = new C10951i0();

    @Override // java.util.ListIterator, java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return false;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return 0;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return -1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
