package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class GlobalSnapshot extends MutableSnapshot {
    public static final int $stable = 0;

    public GlobalSnapshot(long j10, SnapshotIdSet snapshotIdSet) {
        super(j10, snapshotIdSet, null, new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot.1
            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30424invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30424invoke(Object obj) {
                synchronized (SnapshotKt.getLock()) {
                    try {
                        List list = SnapshotKt.globalWriteObservers;
                        int size = list.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            ((InterfaceC9540l) list.get(i10)).invoke(obj);
                        }
                        C10786q c10786q = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        });
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        synchronized (SnapshotKt.getLock()) {
            releasePinnedSnapshotLocked$runtime_release();
            C10786q c10786q = C10786q.f26013a;
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        SnapshotKt.advanceGlobalSnapshot();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(final InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        final InterfaceC9540l interfaceC9540l3;
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, false, interfaceC9540l, interfaceC9540l2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairMergeObservers.m20051f();
            InterfaceC9540l readObserver = snapshotInstanceObservers.getReadObserver();
            InterfaceC9540l writeObserver = snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairMergeObservers.m20052g();
            interfaceC9540l = readObserver;
            interfaceC9540l3 = writeObserver;
        } else {
            interfaceC9540l3 = interfaceC9540l2;
            map = null;
        }
        MutableSnapshot mutableSnapshot = (MutableSnapshot) SnapshotKt.takeNewSnapshot(new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedMutableSnapshot$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final MutableSnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j10;
                synchronized (SnapshotKt.getLock()) {
                    j10 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId++;
                }
                return new MutableSnapshot(j10, snapshotIdSet, interfaceC9540l, interfaceC9540l3);
            }
        });
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, mutableSnapshot, map);
        }
        return mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(final InterfaceC9540l interfaceC9540l) {
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, null, true, interfaceC9540l, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairMergeObservers.m20051f();
            InterfaceC9540l readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairMergeObservers.m20052g();
            interfaceC9540l = readObserver;
        } else {
            map = null;
        }
        ReadonlySnapshot readonlySnapshot = (ReadonlySnapshot) SnapshotKt.takeNewSnapshot(new InterfaceC9540l() { // from class: androidx.compose.runtime.snapshots.GlobalSnapshot$takeNestedSnapshot$1$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public final ReadonlySnapshot invoke(SnapshotIdSet snapshotIdSet) {
                long j10;
                synchronized (SnapshotKt.getLock()) {
                    j10 = SnapshotKt.nextSnapshotId;
                    SnapshotKt.nextSnapshotId++;
                }
                return new ReadonlySnapshot(j10, snapshotIdSet, interfaceC9540l);
            }
        });
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, null, readonlySnapshot, map);
        }
        return readonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo30422nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo30423nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }
}
