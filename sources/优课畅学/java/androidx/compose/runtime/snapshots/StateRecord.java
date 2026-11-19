package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import p123h7.InterfaceC8721a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public StateRecord(long j10) {
        this.snapshotId = j10;
    }

    public abstract void assign(StateRecord stateRecord);

    public abstract StateRecord create();

    @InterfaceC8721a
    public /* synthetic */ StateRecord create(int i10) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = SnapshotId_jvmKt.toSnapshotId(i10);
        return stateRecordCreate;
    }

    public final StateRecord getNext$runtime_release() {
        return this.next;
    }

    public final long getSnapshotId$runtime_release() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(long j10) {
        this.snapshotId = j10;
    }

    public StateRecord create(long j10) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = j10;
        return stateRecordCreate;
    }

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @InterfaceC8721a
    public StateRecord(int i10) {
        this(SnapshotId_jvmKt.toSnapshotId(i10));
    }
}
