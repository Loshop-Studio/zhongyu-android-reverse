package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;

/* loaded from: classes2.dex */
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    public SnapshotMapValueSet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((SnapshotMapValueSet<K, V>) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getMap().containsValue(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        return getMap().removeValue$runtime_release(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        Set setM23929c1 = AbstractC10947g0.m23929c1(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z10 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            }
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builderBuilder2 = map$runtime_release.builder2();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (setM23929c1.contains(entry.getValue())) {
                    builderBuilder2.remove(entry.getKey());
                    z10 = true;
                }
            }
            C10786q c10786q2 = C10786q.f26013a;
            PersistentMap<K, V> persistentMapBuild2 = builderBuilder2.build2();
            if (AbstractC9979u.m20289b(persistentMapBuild2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = map.attemptUpdate((SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current), modification$runtime_release, persistentMapBuild2);
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!zAttemptUpdate);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        Set setM23929c1 = AbstractC10947g0.m23929c1(collection);
        SnapshotStateMap<K, V> map = getMap();
        boolean z10 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = map.getFirstStateRecord();
                AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.current((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            }
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builderBuilder2 = map$runtime_release.builder2();
            for (Map.Entry<K, V> entry : map.entrySet()) {
                if (!setM23929c1.contains(entry.getValue())) {
                    builderBuilder2.remove(entry.getKey());
                    z10 = true;
                }
            }
            C10786q c10786q2 = C10786q.f26013a;
            PersistentMap<K, V> persistentMapBuild2 = builderBuilder2.build2();
            if (AbstractC9979u.m20289b(persistentMapBuild2, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = map.getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = map.attemptUpdate((SnapshotStateMap.StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, map, current), modification$runtime_release, persistentMapBuild2);
            }
            SnapshotKt.notifyWrite(current, map);
        } while (!zAttemptUpdate);
        return z10;
    }

    @Override // java.util.Set, java.util.Collection
    public Void add(V v10) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends V> collection) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public StateMapMutableValuesIterator<K, V> iterator() {
        return new StateMapMutableValuesIterator<>(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }
}
