package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC9125m;
import kotlin.jvm.internal.AbstractC9131s;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10671d;

@Stable
/* loaded from: classes2.dex */
public final class SnapshotStateList<T> implements StateObject, List<T>, RandomAccess, InterfaceC10671d {
    public static final int $stable = 0;
    private StateRecord firstStateRecord;

    @StabilityInferred(parameters = 0)
    public static final class StateListStateRecord<T> extends StateRecord {
        public static final int $stable = 8;
        private PersistentList<? extends T> list;
        private int modification;
        private int structuralChange;

        public StateListStateRecord(long j10, PersistentList<? extends T> persistentList) {
            super(j10);
            this.list = persistentList;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            synchronized (SnapshotStateListKt.sync) {
                AbstractC9133u.m16131e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord>");
                this.list = ((StateListStateRecord) stateRecord).list;
                this.modification = ((StateListStateRecord) stateRecord).modification;
                this.structuralChange = ((StateListStateRecord) stateRecord).structuralChange;
                C8736p c8736p = C8736p.f16368a;
            }
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final PersistentList<T> getList$runtime_release() {
            return this.list;
        }

        public final int getModification$runtime_release() {
            return this.modification;
        }

        public final int getStructuralChange$runtime_release() {
            return this.structuralChange;
        }

        public final void setList$runtime_release(PersistentList<? extends T> persistentList) {
            this.list = persistentList;
        }

        public final void setModification$runtime_release(int i10) {
            this.modification = i10;
        }

        public final void setStructuralChange$runtime_release(int i10) {
            this.structuralChange = i10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j10) {
            return new StateListStateRecord(j10, this.list);
        }
    }

    public SnapshotStateList(PersistentList<? extends T> persistentList) {
        this.firstStateRecord = stateRecordWith(persistentList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean attemptUpdate(StateListStateRecord<T> stateListStateRecord, int i10, PersistentList<? extends T> persistentList, boolean z10) {
        boolean z11;
        synchronized (SnapshotStateListKt.sync) {
            try {
                if (stateListStateRecord.getModification$runtime_release() == i10) {
                    stateListStateRecord.setList$runtime_release(persistentList);
                    z11 = true;
                    if (z10) {
                        stateListStateRecord.setStructuralChange$runtime_release(stateListStateRecord.getStructuralChange$runtime_release() + 1);
                    }
                    stateListStateRecord.setModification$runtime_release(stateListStateRecord.getModification$runtime_release() + 1);
                } else {
                    z11 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z11;
    }

    private final boolean conditionalUpdate(boolean z10, InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC10570l.invoke(list$runtime_release);
            if (AbstractC9133u.m16128b(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentList, z10);
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

    public static /* synthetic */ boolean conditionalUpdate$default(SnapshotStateList snapshotStateList, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC10570l.invoke(list$runtime_release);
            if (AbstractC9133u.m16128b(persistentList, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime_release, persistentList, z10);
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th2) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th2;
                }
            }
            AbstractC9131s.m16124a(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
        return true;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getReadable$runtime_release$annotations() {
    }

    private final <R> R mutate(InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        R r10;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            r10 = (R) interfaceC10570l.invoke(builder);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC9133u.m16128b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListBuild, true);
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
        return r10;
    }

    private final boolean mutateBoolean(InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Object objInvoke;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            objInvoke = interfaceC10570l.invoke(builder);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC9133u.m16128b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return ((Boolean) objInvoke).booleanValue();
    }

    private final StateRecord stateRecordWith(PersistentList<? extends T> persistentList) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        StateListStateRecord stateListStateRecord = new StateListStateRecord(snapshotCurrentSnapshot.getSnapshotId(), persistentList);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            stateListStateRecord.setNext$runtime_release(new StateListStateRecord(SnapshotId_jvmKt.toSnapshotId(1), persistentList));
        }
        return stateListStateRecord;
    }

    private final void update(boolean z10, InterfaceC10570l interfaceC10570l) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC10570l.invoke(list$runtime_release);
            if (AbstractC9133u.m16128b(persistentList, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentList, z10);
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
    }

    public static /* synthetic */ void update$default(SnapshotStateList snapshotStateList, boolean z10, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        do {
            synchronized (SnapshotStateListKt.sync) {
                try {
                    StateRecord firstStateRecord = snapshotStateList.getFirstStateRecord();
                    AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                    StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                    modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                    list$runtime_release = stateListStateRecord.getList$runtime_release();
                    C8736p c8736p = C8736p.f16368a;
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th;
                }
            }
            AbstractC9131s.m16124a(1);
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList persistentList = (PersistentList) interfaceC10570l.invoke(list$runtime_release);
            if (AbstractC9133u.m16128b(persistentList, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = snapshotStateList.getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                try {
                    current = Snapshot.Companion.getCurrent();
                    zAttemptUpdate = snapshotStateList.attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, snapshotStateList, current), modification$runtime_release, persistentList, z10);
                    AbstractC9131s.m16125b(1);
                } catch (Throwable th2) {
                    AbstractC9131s.m16125b(1);
                    AbstractC9131s.m16124a(1);
                    throw th2;
                }
            }
            AbstractC9131s.m16124a(1);
            SnapshotKt.notifyWrite(current, snapshotStateList);
        } while (!zAttemptUpdate);
    }

    private final <R> R withCurrent(InterfaceC10570l interfaceC10570l) {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (R) interfaceC10570l.invoke(SnapshotKt.current((StateListStateRecord) firstStateRecord));
    }

    private final <R> R writable(InterfaceC10570l interfaceC10570l) {
        Snapshot current;
        R r10;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            try {
                current = Snapshot.Companion.getCurrent();
                r10 = (R) interfaceC10570l.invoke(SnapshotKt.writableRecord(stateListStateRecord, this, current));
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

    @Override // java.util.List, java.util.Collection
    public boolean add(T t10) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add((PersistentList<T>) t10);
            if (AbstractC9133u.m16128b(persistentListAdd, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListAdd, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(final int i10, final Collection<? extends T> collection) {
        return mutateBoolean(new InterfaceC10570l() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.addAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.addAll(i10, collection));
            }
        });
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        Snapshot current;
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        StateListStateRecord stateListStateRecord = (StateListStateRecord) firstStateRecord;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord, this, current);
            synchronized (SnapshotStateListKt.sync) {
                stateListStateRecord2.setList$runtime_release(ExtensionsKt.persistentListOf());
                stateListStateRecord2.setModification$runtime_release(stateListStateRecord2.getModification$runtime_release() + 1);
                stateListStateRecord2.setStructuralChange$runtime_release(stateListStateRecord2.getStructuralChange$runtime_release() + 1);
            }
        }
        SnapshotKt.notifyWrite(current, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        return getReadable$runtime_release().getList$runtime_release().containsAll(collection);
    }

    @Override // java.util.List
    public T get(int i10) {
        return getReadable$runtime_release().getList$runtime_release().get(i10);
    }

    public final List<T> getDebuggerDisplayValue() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    public final StateListStateRecord<T> getReadable$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (StateListStateRecord) SnapshotKt.readable((StateListStateRecord) firstStateRecord, this);
    }

    public int getSize() {
        return getReadable$runtime_release().getList$runtime_release().size();
    }

    public final int getStructure$runtime_release() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getStructuralChange$runtime_release();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return getReadable$runtime_release().getList$runtime_release().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return getReadable$runtime_release().getList$runtime_release().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new StateListIterator(this, 0);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        stateRecord.setNext$runtime_release(getFirstStateRecord());
        AbstractC9133u.m16131e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.firstStateRecord = (StateListStateRecord) stateRecord;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i10) {
        return removeAt(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListRemoveAll = list$runtime_release.removeAll((Collection<? extends T>) collection);
            if (AbstractC9133u.m16128b(persistentListRemoveAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListRemoveAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    public T removeAt(int i10) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        T t10 = get(i10);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListRemoveAt = list$runtime_release.removeAt(i10);
            if (AbstractC9133u.m16128b(persistentListRemoveAt, list$runtime_release)) {
                return t10;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListRemoveAt, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t10;
    }

    public final void removeRange(int i10, int i11) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i10, i11).clear();
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC9133u.m16128b(persistentListBuild, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(final Collection<? extends Object> collection) {
        return mutateBoolean(new InterfaceC10570l() { // from class: androidx.compose.runtime.snapshots.SnapshotStateList.retainAll.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final Boolean invoke(List<T> list) {
                return Boolean.valueOf(list.retainAll(collection));
            }
        });
    }

    public final int retainAllInRange$runtime_release(Collection<? extends T> collection, int i10, int i11) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        int size = size();
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList.Builder<T> builder = list$runtime_release.builder();
            builder.subList(i10, i11).retainAll(collection);
            PersistentList<? extends T> persistentListBuild = builder.build();
            if (AbstractC9133u.m16128b(persistentListBuild, list$runtime_release)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListBuild, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return size - size();
    }

    @Override // java.util.List
    public T set(int i10, T t10) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        T t11 = get(i10);
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentList = list$runtime_release.set(i10, (int) t10);
            if (AbstractC9133u.m16128b(persistentList, list$runtime_release)) {
                return t11;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentList, false);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return t11;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.List
    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex or toIndex are out of bounds");
        }
        return new SubList(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC9125m.m16122a(this);
    }

    public final List<T> toList() {
        return getReadable$runtime_release().getList$runtime_release();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord)).getList$runtime_release() + ")@" + hashCode();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListAddAll = list$runtime_release.addAll(collection);
            if (AbstractC9133u.m16128b(persistentListAddAll, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListAddAll, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i10) {
        return new StateListIterator(this, i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListRemove = list$runtime_release.remove((PersistentList<T>) obj);
            if (AbstractC9133u.m16128b(persistentListRemove, list$runtime_release)) {
                return false;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListRemove, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) AbstractC9125m.m16123b(this, tArr);
    }

    public SnapshotStateList() {
        this(ExtensionsKt.persistentListOf());
    }

    @Override // java.util.List
    public void add(int i10, T t10) {
        int modification$runtime_release;
        PersistentList<T> list$runtime_release;
        Snapshot current;
        boolean zAttemptUpdate;
        do {
            synchronized (SnapshotStateListKt.sync) {
                StateRecord firstStateRecord = getFirstStateRecord();
                AbstractC9133u.m16131e(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                StateListStateRecord stateListStateRecord = (StateListStateRecord) SnapshotKt.current((StateListStateRecord) firstStateRecord);
                modification$runtime_release = stateListStateRecord.getModification$runtime_release();
                list$runtime_release = stateListStateRecord.getList$runtime_release();
                C8736p c8736p = C8736p.f16368a;
            }
            AbstractC9133u.m16130d(list$runtime_release);
            PersistentList<T> persistentListAdd = list$runtime_release.add(i10, (int) t10);
            if (AbstractC9133u.m16128b(persistentListAdd, list$runtime_release)) {
                return;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            AbstractC9133u.m16131e(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            StateListStateRecord stateListStateRecord2 = (StateListStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                zAttemptUpdate = attemptUpdate((StateListStateRecord) SnapshotKt.writableRecord(stateListStateRecord2, this, current), modification$runtime_release, persistentListAdd, true);
            }
            SnapshotKt.notifyWrite(current, this);
        } while (!zAttemptUpdate);
    }
}
