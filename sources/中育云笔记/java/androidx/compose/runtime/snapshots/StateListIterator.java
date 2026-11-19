package androidx.compose.runtime.snapshots;

import id.InterfaceC9624a;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
final class StateListIterator<T> implements ListIterator<T>, InterfaceC9624a {
    private int index;
    private int lastRequested = -1;
    private final SnapshotStateList<T> list;
    private int structure;

    public StateListIterator(SnapshotStateList<T> snapshotStateList, int i10) {
        this.list = snapshotStateList;
        this.index = i10 - 1;
        this.structure = snapshotStateList.getStructure$runtime_release();
    }

    private final void validateModification() {
        if (this.list.getStructure$runtime_release() != this.structure) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public void add(T t10) {
        validateModification();
        this.list.add(this.index + 1, t10);
        this.lastRequested = -1;
        this.index++;
        this.structure = this.list.getStructure$runtime_release();
    }

    public final SnapshotStateList<T> getList() {
        return this.list;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.index < this.list.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.index >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public T next() {
        validateModification();
        int i10 = this.index + 1;
        this.lastRequested = i10;
        SnapshotStateListKt.validateRange(i10, this.list.size());
        T t10 = this.list.get(i10);
        this.index = i10;
        return t10;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.index + 1;
    }

    @Override // java.util.ListIterator
    public T previous() {
        validateModification();
        SnapshotStateListKt.validateRange(this.index, this.list.size());
        int i10 = this.index;
        this.lastRequested = i10;
        this.index--;
        return this.list.get(i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.index;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        validateModification();
        this.list.remove(this.index);
        this.index--;
        this.lastRequested = -1;
        this.structure = this.list.getStructure$runtime_release();
    }

    @Override // java.util.ListIterator
    public void set(T t10) {
        validateModification();
        int i10 = this.lastRequested;
        if (i10 < 0) {
            SnapshotStateListKt.invalidIteratorSet();
            throw new KotlinNothingValueException();
        }
        this.list.set(i10, t10);
        this.structure = this.list.getStructure$runtime_release();
    }
}
