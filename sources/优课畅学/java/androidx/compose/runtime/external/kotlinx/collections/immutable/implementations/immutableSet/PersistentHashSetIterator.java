package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p134i7.AbstractC8809v;
import p311y7.InterfaceC10668a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public class PersistentHashSetIterator<E> implements Iterator<E>, InterfaceC10668a {
    public static final int $stable = 8;
    private boolean hasNext;
    private final List<TrieNodeIterator<E>> path;
    private int pathLastIndex;

    public PersistentHashSetIterator(TrieNode<E> trieNode) {
        List<TrieNodeIterator<E>> listM14776s = AbstractC8809v.m14776s(new TrieNodeIterator());
        this.path = listM14776s;
        this.hasNext = true;
        TrieNodeIterator.reset$default(listM14776s.get(0), trieNode.getBuffer(), 0, 2, null);
        this.pathLastIndex = 0;
        ensureNextElementIsReady();
    }

    private final void ensureNextElementIsReady() {
        if (this.path.get(this.pathLastIndex).hasNextElement()) {
            return;
        }
        for (int i10 = this.pathLastIndex; -1 < i10; i10--) {
            int iMoveToNextNodeWithData = moveToNextNodeWithData(i10);
            if (iMoveToNextNodeWithData == -1 && this.path.get(i10).hasNextCell()) {
                this.path.get(i10).moveToNextCell();
                iMoveToNextNodeWithData = moveToNextNodeWithData(i10);
            }
            if (iMoveToNextNodeWithData != -1) {
                this.pathLastIndex = iMoveToNextNodeWithData;
                return;
            }
            if (i10 > 0) {
                this.path.get(i10 - 1).moveToNextCell();
            }
            this.path.get(i10).reset(TrieNode.Companion.getEMPTY$runtime_release().getBuffer(), 0);
        }
        this.hasNext = false;
    }

    private static /* synthetic */ void getHasNext$annotations() {
    }

    private final int moveToNextNodeWithData(int i10) {
        if (this.path.get(i10).hasNextElement()) {
            return i10;
        }
        if (!this.path.get(i10).hasNextNode()) {
            return -1;
        }
        TrieNode<? extends E> trieNodeCurrentNode = this.path.get(i10).currentNode();
        int i11 = i10 + 1;
        if (i11 == this.path.size()) {
            this.path.add(new TrieNodeIterator<>());
        }
        TrieNodeIterator.reset$default(this.path.get(i11), trieNodeCurrentNode.getBuffer(), 0, 2, null);
        return moveToNextNodeWithData(i11);
    }

    public final E currentElement() {
        CommonFunctionsKt.m23816assert(hasNext());
        return this.path.get(this.pathLastIndex).currentElement();
    }

    public final List<TrieNodeIterator<E>> getPath() {
        return this.path;
    }

    public final int getPathLastIndex() {
        return this.pathLastIndex;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        if (!this.hasNext) {
            throw new NoSuchElementException();
        }
        E eNextElement = this.path.get(this.pathLastIndex).nextElement();
        ensureNextElementIsReady();
        return eNextElement;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPathLastIndex(int i10) {
        this.pathLastIndex = i10;
    }
}
