package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10673f;

@Stable
/* loaded from: classes2.dex */
public final class SnapshotStateSet<T> implements StateObject, Set<T>, RandomAccess, InterfaceC10673f {
    public static final int $stable = 0;
    private StateRecord firstStateRecord = stateRecordWith(ExtensionsKt.persistentSetOf());

    @StabilityInferred(parameters = 0)
    public static final class StateSetStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private int modification;
        private PersistentSet<? extends T> set;

        public StateSetStateRecord(long j10, PersistentSet<? extends T> persistentSet) {
            super(j10);
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            synchronized (SnapshotStateSetKt.sync) {
                AbstractC9133u.m16131e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord>");
                this.set = ((StateSetStateRecord) stateRecord).set;
                this.modification = ((StateSetStateRecord) stateRecord).modification;
                C8736p c8736p = C8736p.f16368a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), this.set);
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final PersistentSet<T> getSet$runtime_release() {
            return this.set;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }

        public final void setSet$runtime_release(PersistentSet<? extends T> persistentSet) {
            this.set = persistentSet;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j10) {
            return new StateSetStateRecord(j10, this.set);
        }
    }

    private final boolean attemptUpdate(StateSetStateRecord<T> stateSetStateRecord, int i10, PersistentSet<? extends T> persistentSet) {
        boolean z10;
        synchronized (SnapshotStateSetKt.sync) {
            if (stateSetStateRecord.getModification$runtime_release() == i10) {
                stateSetStateRecord.setSet$runtime_release(persistentSet);
                z10 = true;
                stateSetStateRecord.setModification$runtime_release(stateSetStateRecord.getModification$runtime_release() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private final boolean conditionalUpdate(InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(set$runtime_release);
            PersistentSet<? extends T> persistentSet = (PersistentSet) interfaceC10570l.invoke(set$runtime_release);
            if (AbstractC9133u.m16128b(persistentSet, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSet);
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th2) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th2;
                }
            }
            AbstractC9131s.m16124a(1);
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        R r10;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                    StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                    modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                    set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                r10 = (R) interfaceC10570l.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (AbstractC9133u.m16128b(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    try {
                        current = Snapshot.Companion.getCurrent();
                        zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetBuild);
                        AbstractC9131s.m16125b(1);
                    } catch (Throwable th2) {
                        AbstractC9131s.m16125b(1);
                        AbstractC9131s.m16124a(1);
                        throw th2;
                    }
                }
                AbstractC9131s.m16124a(1);
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return r10;
    }

    private final boolean mutateBoolean(InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        PersistentSet.Builder<T> builder;
        Object objInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            if (set$runtime_release != null && (builder = set$runtime_release.builder()) != null) {
                objInvoke = interfaceC10570l.invoke(builder);
                PersistentSet<? extends T> persistentSetBuild = builder.build();
                if (AbstractC9133u.m16128b(persistentSetBuild, set$runtime_release)) {
                    break;
                }
                StateRecord firstStateRecord2 = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.getLock()) {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetBuild);
                }
                SnapshotKt.notifyWrite(current, this);
            } else {
                throw new IllegalStateException("No set to mutate");
            }
        } while (!zAttemptUpdate);
        return ((Boolean) objInvoke).booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentSet<? extends T> persistentSet) {
        StateSetStateRecord stateSetStateRecord = new StateSetStateRecord(SnapshotKt.currentSnapshot().getSnapshotId(), persistentSet);
        if (Snapshot.Companion.isInSnapshot()) {
            stateSetStateRecord.setNext$runtime_release(new StateSetStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentSet));
        }
        return stateSetStateRecord;
    }

    private final <R> R withCurrent(InterfaceC10570l interfaceC10570l) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (R) interfaceC10570l.invoke(SnapshotKt.current((StateSetStateRecord) firstStateRecord));
    }

    private final <R> R writable(InterfaceC10570l interfaceC10570l) {
        Snapshot current;
        R r10;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r10 = (R) interfaceC10570l.invoke(SnapshotKt.writableRecord(stateSetStateRecord, this, current));
                AbstractC9131s.m16125b(1);
            } catch (Throwable th) {
                AbstractC9131s.m16125b(1);
                AbstractC9131s.m16124a(1);
                throw th;
            }
        }
        AbstractC9131s.m16124a(1);
        SnapshotKt.notifyWrite(current, this);
        return r10;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(T t10) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(set$runtime_release);
            PersistentSet<? extends T> persistentSetAdd = set$runtime_release.add((PersistentSet<T>) t10);
            if (AbstractC9133u.m16128b(persistentSetAdd, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetAdd);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(set$runtime_release);
            PersistentSet<? extends T> persistentSetAddAll = set$runtime_release.addAll(collection);
            if (AbstractC9133u.m16128b(persistentSetAddAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetAddAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord, this, current);
            synchronized (SnapshotStateSetKt.sync) {
                stateSetStateRecord2.setSet$runtime_release(ExtensionsKt.persistentSetOf());
                stateSetStateRecord2.setModification$runtime_release(stateSetStateRecord2.getModification$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getSet$runtime_release().contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return getReadable$runtime_release().getSet$runtime_release().containsAll(collection);
    }

    public final Set<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final int getModification$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getModification$runtime_release();
    }

    public final StateSetStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return (StateSetStateRecord) SnapshotKt.readable((StateSetStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getSet$runtime_release().size();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getSet$runtime_release().isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return new StateSetIterator(this, getReadable$runtime_release().getSet$runtime_release().iterator());
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        AbstractC9133u.m16131e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        this.firstStateRecord = (StateSetStateRecord) stateRecord;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemove = set$runtime_release.remove((PersistentSet<T>) obj);
            if (AbstractC9133u.m16128b(persistentSetRemove, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetRemove);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        int modification$runtime_release;
        PersistentSet<T> set$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateSetKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
                StateSetStateRecord stateSetStateRecord = (StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord);
                modification$runtime_release = stateSetStateRecord.getModification$runtime_release();
                set$runtime_release = stateSetStateRecord.getSet$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(set$runtime_release);
            PersistentSet<? extends T> persistentSetRemoveAll = set$runtime_release.removeAll((Collection<? extends T>) collection);
            if (AbstractC9133u.m16128b(persistentSetRemoveAll, set$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
            StateSetStateRecord stateSetStateRecord2 = (StateSetStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateSetStateRecord) SnapshotKt.writableRecord(stateSetStateRecord2, this, current), modification$runtime_release, persistentSetRemoveAll);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> collection) {
        return mutateBoolean(new InterfaceC10570l() { // from class: androidx.compose.runtime.snapshots.SnapshotStateSet.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(Set<T> set) {
                return Boolean.valueOf(set.retainAll(AbstractC8778f0.m14549Z0(collection)));
            }
        });
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    public final Set<T> toSet() {
        return getReadable$runtime_release().getSet$runtime_release();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateSet.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((StateSetStateRecord) SnapshotKt.current((StateSetStateRecord) firstStateRecord)).getSet$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9125m.m16123b(this, tArr);
    }
}
