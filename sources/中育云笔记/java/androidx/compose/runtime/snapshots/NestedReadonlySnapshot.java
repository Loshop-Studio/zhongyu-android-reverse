package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserver;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NestedReadonlySnapshot extends Snapshot {
    public static final int $stable = 8;
    private final Snapshot parent;
    private final InterfaceC9540l readObserver;

    public NestedReadonlySnapshot(long j10, SnapshotIdSet snapshotIdSet, InterfaceC9540l interfaceC9540l, Snapshot snapshot) {
        super(j10, snapshotIdSet, (AbstractC9972n) null);
        this.readObserver = interfaceC9540l;
        this.parent = snapshot;
        snapshot.mo30422nestedActivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        if (getSnapshotId() != this.parent.getSnapshotId()) {
            closeAndReleasePinning$runtime_release();
        }
        this.parent.mo30423nestedDeactivated$runtime_release(this);
        super.dispose();
        SnapshotObserverKt.dispatchObserverOnPreDispose(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return null;
    }

    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public InterfaceC9540l getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public InterfaceC9540l getWriteObserver$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedActivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo30422nestedActivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: nestedDeactivated$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo30423nestedDeactivated$runtime_release(Snapshot snapshot) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release, reason: merged with bridge method [inline-methods] */
    public Void mo30425recordModified$runtime_release(StateObject stateObject) {
        SnapshotKt.reportReadonlySnapshotWrite();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public NestedReadonlySnapshot takeNestedSnapshot(InterfaceC9540l interfaceC9540l) {
        Map map;
        PersistentList persistentList = SnapshotObserverKt.observers;
        if (persistentList != null) {
            Pair<SnapshotInstanceObservers, Map<SnapshotObserver, SnapshotInstanceObservers>> pairMergeObservers = SnapshotObserverKt.mergeObservers(persistentList, this, true, interfaceC9540l, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairMergeObservers.m20051f();
            InterfaceC9540l readObserver = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairMergeObservers.m20052g();
            interfaceC9540l = readObserver;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid$runtime_release(), SnapshotKt.mergedReadObserver$default(interfaceC9540l, getReadObserver(), false, 4, null), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.dispatchCreatedObservers(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }
}
