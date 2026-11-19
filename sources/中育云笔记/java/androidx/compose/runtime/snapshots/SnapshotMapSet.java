package androidx.compose.runtime.snapshots;

import id.InterfaceC9629f;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9971m;

/* loaded from: classes2.dex */
abstract class SnapshotMapSet<K, V, E> implements Set<E>, InterfaceC9629f {
    private final SnapshotStateMap<K, V> map;

    public SnapshotMapSet(SnapshotStateMap<K, V> snapshotStateMap) {
        this.map = snapshotStateMap;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.map.clear();
    }

    public final SnapshotStateMap<K, V> getMap() {
        return this.map;
    }

    public int getSize() {
        return this.map.size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC9971m.m20283a(this);
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9971m.m20284b(this, tArr);
    }
}
