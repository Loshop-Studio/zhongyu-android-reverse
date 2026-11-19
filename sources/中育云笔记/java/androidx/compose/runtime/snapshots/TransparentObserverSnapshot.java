package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TransparentObserverSnapshot extends Snapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsPreviousSnapshot;
    private final Snapshot previousSnapshot;
    private InterfaceC9540l readObserver;
    private final Snapshot root;
    private final long threadId;
    private final InterfaceC9540l writeObserver;

    public TransparentObserverSnapshot(Snapshot snapshot, InterfaceC9540l interfaceC9540l, boolean z10, boolean z11) {
        InterfaceC9540l readObserver;
        super(SnapshotKt.INVALID_SNAPSHOT, SnapshotIdSet.Companion.getEMPTY(), (AbstractC9972n) null);
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z10;
        this.ownsPreviousSnapshot = z11;
        this.readObserver = SnapshotKt.mergedReadObserver(interfaceC9540l, (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) ? SnapshotKt.globalSnapshot.getReadObserver() : readObserver, z10);
        this.threadId = Thread_jvmKt.currentThreadId();
        this.root = this;
    }

    private final Snapshot getCurrentSnapshot() {
        Snapshot snapshot = this.previousSnapshot;
        return snapshot == null ? SnapshotKt.globalSnapshot : snapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        Snapshot snapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public InterfaceC9540l getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.root;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public InterfaceC9540l getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo30425recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo30425recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setModified(MutableScatterSet<StateObject> mutableScatterSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    public void setReadObserver(InterfaceC9540l interfaceC9540l) {
        this.readObserver = interfaceC9540l;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setSnapshotId$runtime_release(long j10) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(InterfaceC9540l interfaceC9540l) {
        InterfaceC9540l interfaceC9540lMergedReadObserver$default = SnapshotKt.mergedReadObserver$default(interfaceC9540l, getReadObserver(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), interfaceC9540lMergedReadObserver$default, true) : getCurrentSnapshot().takeNestedSnapshot(interfaceC9540lMergedReadObserver$default);
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
}
