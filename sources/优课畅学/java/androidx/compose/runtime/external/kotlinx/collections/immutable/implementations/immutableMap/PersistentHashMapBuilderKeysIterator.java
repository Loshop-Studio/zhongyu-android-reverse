package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 4)
/* loaded from: classes2.dex */
public final class PersistentHashMapBuilderKeysIterator<K, V> extends PersistentHashMapBuilderBaseIterator<K, V, K> {
    public static final int $stable = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    public PersistentHashMapBuilderKeysIterator(PersistentHashMapBuilder<K, V> persistentHashMapBuilder) {
        TrieNodeBaseIterator[] trieNodeBaseIteratorArr = new TrieNodeBaseIterator[8];
        for (int i10 = 0; i10 < 8; i10++) {
            trieNodeBaseIteratorArr[i10] = new TrieNodeKeysIterator();
        }
        super(persistentHashMapBuilder, trieNodeBaseIteratorArr);
    }
}
