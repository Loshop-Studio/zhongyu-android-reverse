package androidx.compose.runtime.snapshots;

import id.InterfaceC9624a;
import id.InterfaceC9628e;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC9624a {

    /* renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1 */
    public static final class C26301 implements Map.Entry<K, V>, InterfaceC9628e.a {
        private final K key;
        final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
        private V value;

        public C26301(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
            this.this$0 = stateMapMutableEntriesIterator;
            Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
            AbstractC9979u.m20291d(current);
            this.key = current.getKey();
            Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
            AbstractC9979u.m20291d(current2);
            this.value = current2.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public void setValue(V v10) {
            this.value = v10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
            if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() != ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
                throw new ConcurrentModificationException();
            }
            V v11 = (V) getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), v10);
            setValue((C26301) v10);
            return v11;
        }
    }

    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new C26301(this);
        }
        throw new IllegalStateException();
    }
}
