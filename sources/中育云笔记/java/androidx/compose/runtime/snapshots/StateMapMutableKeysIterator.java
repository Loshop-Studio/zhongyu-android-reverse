package androidx.compose.runtime.snapshots;

import id.InterfaceC9624a;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class StateMapMutableKeysIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<K>, InterfaceC9624a {
    public StateMapMutableKeysIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public K next() {
        Map.Entry<K, V> next = getNext();
        if (next == null) {
            throw new IllegalStateException();
        }
        advance();
        return next.getKey();
    }
}
