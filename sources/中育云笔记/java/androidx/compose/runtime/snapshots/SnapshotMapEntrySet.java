package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9962d0;
import kotlin.jvm.internal.AbstractC9979u;
import p265nd.AbstractC10410o;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p325rc.AbstractC10967q0;
import p325rc.AbstractC10980x;

/* loaded from: classes2.dex */
final class SnapshotMapEntrySet<K, V> extends SnapshotMapSet<K, V, Map.Entry<K, V>> {
    public SnapshotMapEntrySet(SnapshotStateMap<K, V> snapshotStateMap) {
        super(snapshotStateMap);
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) add((Map.Entry) obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) addAll(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (AbstractC9962d0.m20262m(obj)) {
            return contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        Collection<? extends Object> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new StateMapMutableEntriesIterator(getMap(), ((ImmutableSet) getMap().getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (AbstractC9962d0.m20262m(obj)) {
            return remove((Map.Entry) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (getMap().remove(((Map.Entry) it.next()).getKey()) != null || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        Collection<? extends Object> collection2 = collection;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC10410o.m21752e(AbstractC10967q0.m24038e(AbstractC10980x.m24153x(collection2, 10)), 16));
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Pair pairM22975a = AbstractC10776g.m22975a(entry.getKey(), entry.getValue());
            linkedHashMap.put(pairM22975a.m20051f(), pairM22975a.m20052g());
        }
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
            for (Map.Entry<K, V> entry2 : map.entrySet()) {
                if (!linkedHashMap.containsKey(entry2.getKey()) || !AbstractC9979u.m20289b(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    builderBuilder2.remove(entry2.getKey());
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

    public Void add(Map.Entry<K, V> entry) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public Void addAll(Collection<? extends Map.Entry<K, V>> collection) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public boolean contains(Map.Entry<K, V> entry) {
        return AbstractC9979u.m20289b(getMap().get(entry.getKey()), entry.getValue());
    }

    public boolean remove(Map.Entry<K, V> entry) {
        return getMap().remove(entry.getKey()) != null;
    }
}
