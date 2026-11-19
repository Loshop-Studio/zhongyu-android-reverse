package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0011\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0000H&J\b\u0010\u0015\u001a\u00020\u0000H&J\u0014\u0010\u0015\u001a\u00020\u00002\n\u0010\u0006\u001a\u00060\u0007j\u0002`\bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004H\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0000X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00060\u0007j\u0002`\bX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\t¨\u0006\u0016"}, m13413d2 = {"Landroidx/compose/runtime/snapshots/StateRecord;", "", "()V", "id", "", "(I)V", "snapshotId", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "(J)V", "next", "getNext$runtime_release", "()Landroidx/compose/runtime/snapshots/StateRecord;", "setNext$runtime_release", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "getSnapshotId$runtime_release", "()J", "setSnapshotId$runtime_release", "assign", "", "value", "create", "runtime_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/StateRecord\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1#2:2488\n*E\n"})
/* loaded from: classes2.dex */
public abstract class StateRecord {
    public static final int $stable = 8;
    private StateRecord next;
    private long snapshotId;

    public StateRecord(long j9) {
        this.snapshotId = j9;
    }

    public abstract void assign(StateRecord value);

    public abstract StateRecord create();

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use snapshotId: Long version instead")
    public /* synthetic */ StateRecord create(int snapshotId) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = SnapshotId_jvmKt.toSnapshotId(snapshotId);
        return stateRecordCreate;
    }

    /* renamed from: getNext$runtime_release, reason: from getter */
    public final StateRecord getNext() {
        return this.next;
    }

    /* renamed from: getSnapshotId$runtime_release, reason: from getter */
    public final long getSnapshotId() {
        return this.snapshotId;
    }

    public final void setNext$runtime_release(StateRecord stateRecord) {
        this.next = stateRecord;
    }

    public final void setSnapshotId$runtime_release(long j9) {
        this.snapshotId = j9;
    }

    public StateRecord create(long snapshotId) {
        StateRecord stateRecordCreate = create();
        stateRecordCreate.snapshotId = snapshotId;
        return stateRecordCreate;
    }

    public StateRecord() {
        this(SnapshotKt.currentSnapshot().getSnapshotId());
    }

    @Deprecated(message = "Use snapshotId: Long constructor instead")
    public StateRecord(int i9) {
        this(SnapshotId_jvmKt.toSnapshotId(i9));
    }
}
