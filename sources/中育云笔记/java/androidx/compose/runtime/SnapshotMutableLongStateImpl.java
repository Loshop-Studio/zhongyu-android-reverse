package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public class SnapshotMutableLongStateImpl extends StateObjectImpl implements MutableLongState, SnapshotMutableState<Long> {
    public static final int $stable = 0;
    private LongStateStateRecord next;

    public static final class LongStateStateRecord extends StateRecord {
        private long value;

        public LongStateStateRecord(long j10, long j11) {
            super(j10);
            this.value = j11;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final long getValue() {
            return this.value;
        }

        public final void setValue(long j10) {
            this.value = j10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j10) {
            return new LongStateStateRecord(j10, this.value);
        }
    }

    public SnapshotMutableLongStateImpl(long j10) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(snapshotCurrentSnapshot.getSnapshotId(), j10);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            longStateStateRecord.setNext$runtime_release(new LongStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), j10));
        }
        this.next = longStateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    public InterfaceC9540l component2() {
        return new InterfaceC9540l() { // from class: androidx.compose.runtime.SnapshotMutableLongStateImpl.component2.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).longValue());
                return C10786q.f26013a;
            }

            public final void invoke(long j10) {
                SnapshotMutableLongStateImpl.this.setLongValue(j10);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long getLongValue() {
        return ((LongStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Long> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC9979u.m20292e(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        AbstractC9979u.m20292e(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) stateRecord2).getValue() == ((LongStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void setLongValue(long j10) {
        Snapshot current;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.current(this.next);
        if (longStateStateRecord.getValue() != j10) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            synchronized (SnapshotKt.getLock()) {
                current = Snapshot.Companion.getCurrent();
                ((LongStateStateRecord) SnapshotKt.overwritableRecord(longStateStateRecord2, this, current, longStateStateRecord)).setValue(j10);
                C10786q c10786q = C10786q.f26013a;
            }
            SnapshotKt.notifyWrite(current, this);
        }
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Long component1() {
        return Long.valueOf(getLongValue());
    }
}
