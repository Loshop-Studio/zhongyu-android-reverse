package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class NestedMutableSnapshot extends MutableSnapshot {
    public static final int $stable = 8;
    private boolean deactivated;
    private final MutableSnapshot parent;

    public NestedMutableSnapshot(long j10, SnapshotIdSet snapshotIdSet, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, MutableSnapshot mutableSnapshot) {
        super(j10, snapshotIdSet, interfaceC9540l, interfaceC9540l2);
        this.parent = mutableSnapshot;
        mutableSnapshot.mo30422nestedActivated$runtime_release(this);
    }

    private final void deactivate() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.mo30423nestedDeactivated$runtime_release(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult apply() throws Throwable {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.parent.getApplied$runtime_release() || this.parent.getDisposed$runtime_release()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet<StateObject> modified$runtime_release = getModified$runtime_release();
        long snapshotId = getSnapshotId();
        Map<StateRecord, ? extends StateRecord> mapOptimisticMerges = modified$runtime_release != null ? SnapshotKt.optimisticMerges(this.parent.getSnapshotId(), this, this.parent.getInvalid$runtime_release()) : null;
        synchronized (SnapshotKt.getLock()) {
            try {
                SnapshotKt.validateOpen(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (modified$runtime_release == null || modified$runtime_release.getSize() == 0) {
                    nestedMutableSnapshot = this;
                    closeAndReleasePinning$runtime_release();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult snapshotApplyResultInnerApplyLocked$runtime_release = nestedMutableSnapshot.innerApplyLocked$runtime_release(this.parent.getSnapshotId(), modified$runtime_release, mapOptimisticMerges, this.parent.getInvalid$runtime_release());
                    if (!AbstractC9979u.m20289b(snapshotApplyResultInnerApplyLocked$runtime_release, SnapshotApplyResult.Success.INSTANCE)) {
                        return snapshotApplyResultInnerApplyLocked$runtime_release;
                    }
                    MutableScatterSet<StateObject> modified$runtime_release2 = nestedMutableSnapshot.parent.getModified$runtime_release();
                    if (modified$runtime_release2 != null) {
                        modified$runtime_release2.addAll(modified$runtime_release);
                    } else {
                        nestedMutableSnapshot.parent.setModified(modified$runtime_release);
                        setModified(null);
                    }
                }
                if (nestedMutableSnapshot.parent.getSnapshotId() < snapshotId) {
                    nestedMutableSnapshot.parent.advance$runtime_release();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.setInvalid$runtime_release(mutableSnapshot.getInvalid$runtime_release().clear(snapshotId).andNot(getPreviousIds$runtime_release()));
                nestedMutableSnapshot.parent.recordPrevious$runtime_release(snapshotId);
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshot$runtime_release(takeoverPinnedSnapshot$runtime_release());
                nestedMutableSnapshot.parent.recordPreviousList$runtime_release(getPreviousIds$runtime_release());
                nestedMutableSnapshot.parent.recordPreviousPinnedSnapshots$runtime_release(getPreviousPinnedSnapshots$runtime_release());
                C10786q c10786q = C10786q.f26013a;
                setApplied$runtime_release(true);
                deactivate();
                SnapshotObserverKt.dispatchObserverOnApplied(this, modified$runtime_release);
                return SnapshotApplyResult.Success.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void dispose() {
        if (getDisposed$runtime_release()) {
            return;
        }
        super.dispose();
        deactivate();
    }

    public final MutableSnapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot getRoot() {
        return this.parent.getRoot();
    }
}
