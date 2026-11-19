package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private final boolean mergeParentObservers;
    private final boolean ownsParentSnapshot;
    private final MutableSnapshot parentSnapshot;
    private InterfaceC9540l readObserver;
    private final long threadId;
    private InterfaceC9540l writeObserver;

    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, boolean z10, boolean z11) {
        InterfaceC9540l writeObserver$runtime_release;
        InterfaceC9540l readObserver;
        super(SnapshotKt.INVALID_SNAPSHOT, SnapshotIdSet.Companion.getEMPTY(), SnapshotKt.mergedReadObserver(interfaceC9540l, (mutableSnapshot == null || (readObserver = mutableSnapshot.getReadObserver()) == null) ? SnapshotKt.globalSnapshot.getReadObserver() : readObserver, z10), SnapshotKt.mergedWriteObserver(interfaceC9540l2, (mutableSnapshot == null || (writeObserver$runtime_release = mutableSnapshot.getWriteObserver$runtime_release()) == null) ? SnapshotKt.globalSnapshot.getWriteObserver$runtime_release() : writeObserver$runtime_release));
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z10;
        this.ownsParentSnapshot = z11;
        this.readObserver = super.getReadObserver();
        this.writeObserver = super.getWriteObserver$runtime_release();
        this.threadId = Thread_jvmKt.currentThreadId();
    }

    private final MutableSnapshot getCurrentSnapshot() {
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        return mutableSnapshot == null ? SnapshotKt.globalSnapshot : mutableSnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() {
        return getCurrentSnapshot().apply();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        MutableSnapshot mutableSnapshot;
        setDisposed$runtime_release(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.dispose();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public SnapshotIdSet getInvalid$runtime_release() {
        return getCurrentSnapshot().getInvalid$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public MutableScatterSet<StateObject> getModified$runtime_release() {
        return getCurrentSnapshot().getModified$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: getReadObserver$runtime_release, reason: merged with bridge method [inline-methods] */
    public InterfaceC9540l getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean getReadOnly() {
        return getCurrentSnapshot().getReadOnly();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public long getSnapshotId() {
        return getCurrentSnapshot().getSnapshotId();
    }

    public final long getThreadId$runtime_release() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public int getWriteCount$runtime_release() {
        return getCurrentSnapshot().getWriteCount$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public InterfaceC9540l getWriteObserver$runtime_release() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean hasPendingChanges() {
        return getCurrentSnapshot().hasPendingChanges();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void notifyObjectsInitialized$runtime_release() {
        getCurrentSnapshot().notifyObjectsInitialized$runtime_release();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* renamed from: recordModified$runtime_release */
    public void mo30425recordModified$runtime_release(StateObject stateObject) {
        getCurrentSnapshot().mo30425recordModified$runtime_release(stateObject);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void setInvalid$runtime_release(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.unsupported();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
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

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void setWriteCount$runtime_release(int i10) {
        getCurrentSnapshot().setWriteCount$runtime_release(i10);
    }

    public void setWriteObserver(InterfaceC9540l interfaceC9540l) {
        this.writeObserver = interfaceC9540l;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot takeNestedMutableSnapshot(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        InterfaceC9540l interfaceC9540lMergedReadObserver$default = SnapshotKt.mergedReadObserver$default(interfaceC9540l, getReadObserver(), false, 4, null);
        InterfaceC9540l interfaceC9540lMergedWriteObserver = SnapshotKt.mergedWriteObserver(interfaceC9540l2, getWriteObserver$runtime_release());
        return !this.mergeParentObservers ? new TransparentObserverMutableSnapshot(getCurrentSnapshot().takeNestedMutableSnapshot(null, interfaceC9540lMergedWriteObserver), interfaceC9540lMergedReadObserver$default, interfaceC9540lMergedWriteObserver, false, true) : getCurrentSnapshot().takeNestedMutableSnapshot(interfaceC9540lMergedReadObserver$default, interfaceC9540lMergedWriteObserver);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot takeNestedSnapshot(InterfaceC9540l interfaceC9540l) {
        InterfaceC9540l interfaceC9540lMergedReadObserver$default = SnapshotKt.mergedReadObserver$default(interfaceC9540l, getReadObserver(), false, 4, null);
        return !this.mergeParentObservers ? SnapshotKt.createTransparentSnapshotWithNoParentReadObserver(getCurrentSnapshot().takeNestedSnapshot(null), interfaceC9540lMergedReadObserver$default, true) : getCurrentSnapshot().takeNestedSnapshot(interfaceC9540lMergedReadObserver$default);
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
