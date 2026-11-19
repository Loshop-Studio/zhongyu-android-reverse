package androidx.collection;

import androidx.collection.internal.RuntimeHelpersKt;
import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class IndexBasedArrayIterator<T> implements Iterator<T>, InterfaceC9624a {
    private boolean canRemove;
    private int index;
    private int size;

    public IndexBasedArrayIterator(int i10) {
        this.size = i10;
    }

    public abstract T elementAt(int i10);

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index < this.size;
    }

    @Override // java.util.Iterator
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        T tElementAt = elementAt(this.index);
        this.index++;
        this.canRemove = true;
        return tElementAt;
    }

    @Override // java.util.Iterator
    public void remove() {
        if (!this.canRemove) {
            RuntimeHelpersKt.throwIllegalStateException("Call next() before removing an element.");
        }
        int i10 = this.index - 1;
        this.index = i10;
        removeAt(i10);
        this.size--;
        this.canRemove = false;
    }

    public abstract void removeAt(int i10);
}
