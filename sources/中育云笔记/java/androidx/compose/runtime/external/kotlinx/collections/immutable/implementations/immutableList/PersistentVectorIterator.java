package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import androidx.compose.runtime.internal.StabilityInferred;
import p265nd.AbstractC10410o;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PersistentVectorIterator<T> extends AbstractListIterator<T> {
    public static final int $stable = 8;
    private final T[] tail;
    private final TrieIterator<T> trieIterator;

    public PersistentVectorIterator(Object[] objArr, T[] tArr, int i10, int i11, int i12) {
        super(i10, i11);
        this.tail = tArr;
        int iRootSize = UtilsKt.rootSize(i11);
        this.trieIterator = new TrieIterator<>(objArr, AbstractC10410o.m21756i(i10, iRootSize), iRootSize, i12);
    }

    @Override // androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.AbstractListIterator, java.util.ListIterator, java.util.Iterator
    public T next() {
        checkHasNext$runtime_release();
        if (this.trieIterator.hasNext()) {
            setIndex(getIndex() + 1);
            return this.trieIterator.next();
        }
        T[] tArr = this.tail;
        int index = getIndex();
        setIndex(index + 1);
        return tArr[index - this.trieIterator.getSize()];
    }

    @Override // java.util.ListIterator
    public T previous() {
        checkHasPrevious$runtime_release();
        if (getIndex() <= this.trieIterator.getSize()) {
            setIndex(getIndex() - 1);
            return this.trieIterator.previous();
        }
        T[] tArr = this.tail;
        setIndex(getIndex() - 1);
        return tArr[getIndex() - this.trieIterator.getSize()];
    }
}
