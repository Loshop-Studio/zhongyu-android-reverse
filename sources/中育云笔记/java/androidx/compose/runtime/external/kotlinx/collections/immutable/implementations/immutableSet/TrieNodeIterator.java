package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TrieNodeIterator<E> {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer();
    private int index;

    public static /* synthetic */ void reset$default(TrieNodeIterator trieNodeIterator, Object[] objArr, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        trieNodeIterator.reset(objArr, i10);
    }

    public final E currentElement() {
        CommonFunctionsKt.m30418assert(hasNextElement());
        return (E) this.buffer[this.index];
    }

    public final TrieNode<? extends E> currentNode() {
        CommonFunctionsKt.m30418assert(hasNextNode());
        Object obj = this.buffer[this.index];
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNodeIterator>");
        return (TrieNode) obj;
    }

    public final boolean hasNextCell() {
        return this.index < this.buffer.length;
    }

    public final boolean hasNextElement() {
        return hasNextCell() && !(this.buffer[this.index] instanceof TrieNode);
    }

    public final boolean hasNextNode() {
        return hasNextCell() && (this.buffer[this.index] instanceof TrieNode);
    }

    public final void moveToNextCell() {
        CommonFunctionsKt.m30418assert(hasNextCell());
        this.index++;
    }

    public final E nextElement() {
        CommonFunctionsKt.m30418assert(hasNextElement());
        Object[] objArr = this.buffer;
        int i10 = this.index;
        this.index = i10 + 1;
        return (E) objArr[i10];
    }

    public final void reset(Object[] objArr, int i10) {
        this.buffer = objArr;
        this.index = i10;
    }
}
