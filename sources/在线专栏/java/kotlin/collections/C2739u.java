package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;
import p175y2.InterfaceC3498a;

/* renamed from: kotlin.collections.u */
/* loaded from: classes.dex */
public final class C2739u implements ListIterator, InterfaceC3498a {

    /* renamed from: a */
    @NotNull
    public static final C2739u f10706a = new C2739u();

    private C2739u() {
    }

    @Override // java.util.ListIterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    @NotNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    @NotNull
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void previous() {
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void set(Void r22) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
}
