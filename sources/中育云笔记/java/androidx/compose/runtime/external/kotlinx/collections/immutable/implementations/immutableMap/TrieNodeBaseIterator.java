package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9624a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class TrieNodeBaseIterator<K, V, T> implements Iterator<T>, InterfaceC9624a {
    public static final int $stable = 8;
    private Object[] buffer = TrieNode.Companion.getEMPTY$runtime_release().getBuffer$runtime_release();
    private int dataSize;
    private int index;

    public final K currentKey() {
        CommonFunctionsKt.m30418assert(hasNextKey());
        return (K) this.buffer[this.index];
    }

    public final TrieNode<? extends K, ? extends V> currentNode() {
        CommonFunctionsKt.m30418assert(hasNextNode());
        Object obj = this.buffer[this.index];
        AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        return (TrieNode) obj;
    }

    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return hasNextKey();
    }

    public final boolean hasNextKey() {
        return this.index < this.dataSize;
    }

    public final boolean hasNextNode() {
        CommonFunctionsKt.m30418assert(this.index >= this.dataSize);
        return this.index < this.buffer.length;
    }

    public final void moveToNextKey() {
        CommonFunctionsKt.m30418assert(hasNextKey());
        this.index += 2;
    }

    public final void moveToNextNode() {
        CommonFunctionsKt.m30418assert(hasNextNode());
        this.index++;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void reset(Object[] objArr, int i10, int i11) {
        this.buffer = objArr;
        this.dataSize = i10;
        this.index = i11;
    }

    public final void setIndex(int i10) {
        this.index = i10;
    }

    public final void reset(Object[] objArr, int i10) {
        reset(objArr, i10, 0);
    }
}
