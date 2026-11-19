package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Map;

@StabilityInferred(parameters = 4)
/* loaded from: classes2.dex */
public final class PersistentHashMapEntriesIterator<K, V> extends PersistentHashMapBaseIterator<K, V, Map.Entry<? extends K, ? extends V>> {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public PersistentHashMapEntriesIterator(TrieNode<K, V> trieNode) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i10 = 0; i10 < 8; i10++) {
            trieNodeBaseIteratorArr[i10] = new TrieNodeEntriesIterator();
        }
        super(trieNode, trieNodeBaseIteratorArr);
    }
}
