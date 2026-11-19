package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import id.InterfaceC9628e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@Stable
/* loaded from: classes2.dex */
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, InterfaceC9628e {
    public static final int $stable = 0;
    private final Set<Map.Entry<K, V>> entries;
    private StateRecord firstStateRecord;
    private final Set<K> keys;
    private final Collection<V> values;

    @StabilityInferred(parameters = 0)
    public static final class StateMapStateRecord<K, V> extends StateRecord {
        public static final int $stable = 8;
        private PersistentMap<K, ? extends V> map;
        private int modification;

        public StateMapStateRecord(long j10, PersistentMap<K, ? extends V> persistentMap) {
            super(j10);
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) stateRecord;
            synchronized (SnapshotStateMapKt.sync) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                C10786q c10786q = C10786q.f26013a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateMapStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.map);
        }

        public final PersistentMap<K, V> getMap$runtime_release() {
            return this.map;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final void setMap$runtime_release(PersistentMap<K, ? extends V> persistentMap) {
            this.map = persistentMap;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j10) {
            return new StateMapStateRecord(j10, this.map);
        }
    }

    public SnapshotStateMap() {
        PersistentMap persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(snapshotCurrentSnapshot.getSnapshotId(), persistentMapPersistentHashMapOf);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            stateMapStateRecord.setNext$runtime_release(new StateMapStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentMapPersistentHashMapOf));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateMapStateRecord<K, V> stateMapStateRecord, int i10, PersistentMap<K, ? extends V> persistentMap) {
        boolean z10;
        synchronized (SnapshotStateMapKt.sync) {
            if (stateMapStateRecord.getModification$runtime_release() == i10) {
                stateMapStateRecord.setMap$runtime_release(persistentMap);
                z10 = true;
                stateMapStateRecord.setModification$runtime_release(stateMapStateRecord.getModification$runtime_release() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private final int commitUpdate(StateMapStateRecord<K, V> stateMapStateRecord, PersistentMap<K, ? extends V> persistentMap) {
        int modification$runtime_release;
        synchronized (SnapshotStateMapKt.sync) {
            stateMapStateRecord.setMap$runtime_release(persistentMap);
            modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
            stateMapStateRecord.setModification$runtime_release(modification$runtime_release + 1);
        }
        return modification$runtime_release;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(InterfaceC9540l interfaceC9540l) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        R r10;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC9977s.m20286b(1);
                } catch (Throwable th) {
                    AbstractC9977s.m20286b(1);
                    AbstractC9977s.m20285a(1);
                    throw th;
                }
            }
            AbstractC9977s.m20285a(1);
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            r10 = (R) interfaceC9540l.invoke(builder);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (AbstractC9979u.m20289b(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, persistentMapBuild);
                    AbstractC9977s.m20286b(1);
                } catch (Throwable th2) {
                    AbstractC9977s.m20286b(1);
                    AbstractC9977s.m20285a(1);
                    throw th2;
                }
            }
            AbstractC9977s.m20285a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return r10;
    }

    private final void update(InterfaceC9540l interfaceC9540l) {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        PersistentMap<K, ? extends V> persistentMap = (PersistentMap) interfaceC9540l.invoke(stateMapStateRecord.getMap$runtime_release());
        if (persistentMap != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentMap);
                    AbstractC9977s.m20286b(1);
                } catch (Throwable th) {
                    AbstractC9977s.m20286b(1);
                    AbstractC9977s.m20285a(1);
                    throw th;
                }
            }
            AbstractC9977s.m20285a(1);
            SnapshotKt.notifyWrite(current, this);
        }
    }

    private final <R> R withCurrent(InterfaceC9540l interfaceC9540l) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (R) interfaceC9540l.invoke(SnapshotKt.current((StateMapStateRecord) firstStateRecord));
    }

    private final <R> R writable(InterfaceC9540l interfaceC9540l) {
        Snapshot current;
        R r10;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r10 = (R) interfaceC9540l.invoke(SnapshotKt.writableRecord(stateMapStateRecord, this, current));
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        SnapshotKt.notifyWrite(current, this);
        return r10;
    }

    public final boolean all$runtime_release(InterfaceC9540l interfaceC9540l) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (!((Boolean) interfaceC9540l.invoke((Map.Entry) it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean any$runtime_release(InterfaceC9540l interfaceC9540l) {
        Iterator<E> it = ((ImmutableSet) getReadable$runtime_release().getMap$runtime_release().entrySet()).iterator();
        while (it.hasNext()) {
            if (((Boolean) interfaceC9540l.invoke((Map.Entry) it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap$runtime_release();
        PersistentMap<K, ? extends V> persistentMapPersistentHashMapOf = ExtensionsKt.persistentHashMapOf();
        if (persistentMapPersistentHashMapOf != stateMapStateRecord.getMap$runtime_release()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                commitUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), persistentMapPersistentHashMapOf);
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return getReadable$runtime_release().getMap$runtime_release().get(obj);
    }

    public final Map<K, V> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release();
    }

    public Set<Map.Entry<K, V>> getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public Set<K> getKeys() {
        return this.keys;
    }

    public final int getModification$runtime_release() {
        return getReadable$runtime_release().getModification$runtime_release();
    }

    public final StateMapStateRecord<K, V> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.readable((StateMapStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getMap$runtime_release().size();
    }

    public Collection<V> getValues() {
        return this.values;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return getReadable$runtime_release().getMap$runtime_release().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return getKeys();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) stateRecord;
    }

    @Override // java.util.Map
    public V put(K k10, V v10) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V vPut;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            }
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vPut = builder.put(k10, v10);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (AbstractC9979u.m20289b(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, persistentMapBuild);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            }
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            builder.putAll(map);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (AbstractC9979u.m20289b(persistentMapBuild, map$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, persistentMapBuild);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        V vRemove;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                C10786q c10786q = C10786q.f26013a;
            }
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            vRemove = builder.remove(obj);
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (AbstractC9979u.m20289b(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, persistentMapBuild);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return vRemove;
    }

    public final boolean removeIf$runtime_release(InterfaceC9540l interfaceC9540l) {
        PersistentMap<K, V> map$runtime_release;
        int modification$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        boolean z10 = false;
        do {
            synchronized (SnapshotStateMapKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                    StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord);
                    map$runtime_release = stateMapStateRecord.getMap$runtime_release();
                    modification$runtime_release = stateMapStateRecord.getModification$runtime_release();
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC9977s.m20286b(1);
                } catch (Throwable th) {
                    AbstractC9977s.m20286b(1);
                    AbstractC9977s.m20285a(1);
                    throw th;
                }
            }
            AbstractC9977s.m20285a(1);
            AbstractC9979u.m20291d(map$runtime_release);
            PersistentMap.Builder<K, V> builder = map$runtime_release.builder();
            for (Map.Entry<K, V> entry : entrySet()) {
                if (((Boolean) interfaceC9540l.invoke(entry)).booleanValue()) {
                    builder.remove(entry.getKey());
                    z10 = true;
                }
            }
            C10786q c10786q2 = C10786q.f26013a;
            PersistentMap<K, V> persistentMapBuild = builder.build();
            if (AbstractC9979u.m20289b(persistentMapBuild, map$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9979u.m20292e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateMapStateRecord) SnapshotKt.writableRecord(stateMapStateRecord2, this, current), modification$runtime_release, persistentMapBuild);
                    AbstractC9977s.m20286b(1);
                } catch (Throwable th2) {
                    AbstractC9977s.m20286b(1);
                    AbstractC9977s.m20285a(1);
                    throw th2;
                }
            }
            AbstractC9977s.m20285a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return z10;
    }

    public final boolean removeValue$runtime_release(V v10) {
        Object next;
        Iterator<T> it = entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (AbstractC9979u.m20289b(((Map.Entry) next).getValue(), v10)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public final Map<K, V> toMap() {
        return getReadable$runtime_release().getMap$runtime_release();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9979u.m20292e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.current((StateMapStateRecord) firstStateRecord)).getMap$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return getValues();
    }
}
