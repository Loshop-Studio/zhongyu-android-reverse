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
public class SnapshotMutableFloatStateImpl extends StateObjectImpl implements MutableFloatState, SnapshotMutableState<Float> {
    public static final int $stable = 0;
    private FloatStateStateRecord next;

    public static final class FloatStateStateRecord extends StateRecord {
        private float value;

        public FloatStateStateRecord(long j10, float f10) {
            super(j10);
            this.value = f10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
            this.value = ((FloatStateStateRecord) stateRecord).value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create() {
            return create(SnapshotKt.currentSnapshot().getSnapshotId());
        }

        public final float getValue() {
            return this.value;
        }

        public final void setValue(float f10) {
            this.value = f10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord create(long j10) {
            return new FloatStateStateRecord(j10, this.value);
        }
    }

    public SnapshotMutableFloatStateImpl(float f10) {
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        FloatStateStateRecord floatStateStateRecord = new FloatStateStateRecord(snapshotCurrentSnapshot.getSnapshotId(), f10);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            floatStateStateRecord.setNext$runtime_release(new FloatStateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), f10));
        }
        this.next = floatStateStateRecord;
    }

    @Override // androidx.compose.runtime.MutableState
    public InterfaceC9540l component2() {
        return new InterfaceC9540l() { // from class: androidx.compose.runtime.SnapshotMutableFloatStateImpl.component2.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Number) obj).floatValue());
                return C10786q.f26013a;
            }

            public final void invoke(float f10) {
                SnapshotMutableFloatStateImpl.this.setFloatValue(f10);
            }
        };
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableFloatState, androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return ((FloatStateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<Float> getPolicy() {
        return SnapshotStateKt.structuralEqualityPolicy();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC9979u.m20292e(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        AbstractC9979u.m20292e(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        if (((FloatStateStateRecord) stateRecord2).getValue() == ((FloatStateStateRecord) stateRecord3).getValue()) {
            return stateRecord2;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableFloatStateImpl.FloatStateStateRecord");
        this.next = (FloatStateStateRecord) stateRecord;
    }

    @Override // androidx.compose.runtime.MutableFloatState
    public void setFloatValue(float f10) {
        Snapshot current;
        FloatStateStateRecord floatStateStateRecord = (FloatStateStateRecord) SnapshotKt.current(this.next);
        if (floatStateStateRecord.getValue() == f10) {
            return;
        }
        FloatStateStateRecord floatStateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((FloatStateStateRecord) SnapshotKt.overwritableRecord(floatStateStateRecord2, this, current, floatStateStateRecord)).setValue(f10);
            C10786q c10786q = C10786q.f26013a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    public String toString() {
        return "MutableFloatState(value=" + ((FloatStateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.MutableState
    public Float component1() {
        return Float.valueOf(getFloatValue());
    }
}
