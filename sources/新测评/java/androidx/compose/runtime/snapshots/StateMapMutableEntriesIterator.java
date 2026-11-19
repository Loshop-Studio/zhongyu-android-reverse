package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.jvm.internal.markers.KMutableMap;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00050\u0004B3\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n0\t¢\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0096\u0002¨\u0006\r"}, m13558d2 = {"Landroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/snapshots/StateMapMutableIterator;", "", "", "map", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "iterator", "", "", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;Ljava/util/Iterator;)V", "next", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
/* loaded from: classes2.dex */
final class StateMapMutableEntriesIterator<K, V> extends StateMapMutableIterator<K, V> implements Iterator<Map.Entry<K, V>>, KMutableIterator {

    @Metadata(m13557d1 = {"\u0000\r\n\u0000\n\u0002\u0010'\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\b\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0002\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0006\u001a\u00028\u0001X\u0096\u000e¢\u0006\u0010\n\u0002\u0010\u0005\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\t¨\u0006\f"}, m13558d2 = {"androidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1", "", "key", "getKey", "()Ljava/lang/Object;", "Ljava/lang/Object;", "value", "getValue", "setValue", "(Ljava/lang/Object;)V", "newValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableIterator\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n360#2,4:417\n1#3:421\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/StateMapMutableEntriesIterator$next$1\n*L\n378#1:417,4\n378#1:421\n*E\n"})
    /* renamed from: androidx.compose.runtime.snapshots.StateMapMutableEntriesIterator$next$1 */
    public static final class C25711 implements Map.Entry<K, V>, KMutableMap.Entry {
        private final K key;
        final /* synthetic */ StateMapMutableEntriesIterator<K, V> this$0;
        private V value;

        public C25711(StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator) {
            this.this$0 = stateMapMutableEntriesIterator;
            Map.Entry<K, V> current = stateMapMutableEntriesIterator.getCurrent();
            Intrinsics.checkNotNull(current);
            this.key = current.getKey();
            Map.Entry<K, V> current2 = stateMapMutableEntriesIterator.getCurrent();
            Intrinsics.checkNotNull(current2);
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
        public void setValue(V v9) {
            this.value = v9;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            StateMapMutableEntriesIterator<K, V> stateMapMutableEntriesIterator = this.this$0;
            if (stateMapMutableEntriesIterator.getMap().getModification$runtime_release() != ((StateMapMutableIterator) stateMapMutableEntriesIterator).modification) {
                throw new ConcurrentModificationException();
            }
            V v9 = (V) getValue();
            stateMapMutableEntriesIterator.getMap().put(getKey(), newValue);
            setValue((C25711) newValue);
            return v9;
        }
    }

    public StateMapMutableEntriesIterator(SnapshotStateMap<K, V> snapshotStateMap, Iterator<? extends Map.Entry<? extends K, ? extends V>> it) {
        super(snapshotStateMap, it);
    }

    @Override // java.util.Iterator
    public Map.Entry<K, V> next() {
        advance();
        if (getCurrent() != null) {
            return new C25711(this);
        }
        throw new IllegalStateException();
    }
}
