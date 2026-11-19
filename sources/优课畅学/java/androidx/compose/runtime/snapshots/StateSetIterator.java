package androidx.compose.runtime.snapshots;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p311y7.InterfaceC10668a;

/* loaded from: classes2.dex */
final class StateSetIterator<T> implements Iterator<T>, InterfaceC10668a {
    private T current;
    private final Iterator<T> iterator;
    private int modification;
    private T next;
    private final SnapshotStateSet<T> set;

    /* JADX WARN: Multi-variable type inference failed */
    public StateSetIterator(SnapshotStateSet<T> snapshotStateSet, Iterator<? extends T> it) {
        this.set = snapshotStateSet;
        this.iterator = it;
        this.modification = snapshotStateSet.getModification$runtime_release();
        advance();
    }

    private final void advance() {
        this.current = this.next;
        this.next = this.iterator.hasNext() ? this.iterator.next() : null;
    }

    public static /* synthetic */ void getNext$annotations() {
    }

    private final <T> T modify(InterfaceC10559a interfaceC10559a) {
        validateModification();
        T t10 = (T) interfaceC10559a.invoke();
        this.modification = this.set.getModification$runtime_release();
        return t10;
    }

    private final void validateModification() {
        if (this.set.getModification$runtime_release() != this.modification) {
            throw new ConcurrentModificationException();
        }
    }

    public final T getCurrent() {
        return this.current;
    }

    public final Iterator<T> getIterator() {
        return this.iterator;
    }

    public final int getModification() {
        return this.modification;
    }

    public final T getNext() {
        return this.next;
    }

    public final SnapshotStateSet<T> getSet() {
        return this.set;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.next != null;
    }

    @Override // java.util.Iterator
    public T next() {
        validateModification();
        advance();
        T t10 = this.current;
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Iterator
    public void remove() {
        validateModification();
        T t10 = this.current;
        if (t10 == null) {
            throw new IllegalStateException();
        }
        this.set.remove(t10);
        this.current = null;
        C8736p c8736p = C8736p.f16368a;
        this.modification = this.set.getModification$runtime_release();
    }

    public final void setCurrent(T t10) {
        this.current = t10;
    }

    public final void setModification(int i10) {
        this.modification = i10;
    }

    public final void setNext(T t10) {
        this.next = t10;
    }
}
