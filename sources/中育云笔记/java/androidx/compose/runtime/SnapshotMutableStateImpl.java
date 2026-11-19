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

@StabilityInferred(parameters = 2)
/* loaded from: classes2.dex */
public class SnapshotMutableStateImpl<T> extends StateObjectImpl implements SnapshotMutableState<T> {
    public static final int $stable = 0;
    private StateStateRecord<T> next;
    private final SnapshotMutationPolicy<T> policy;

    public SnapshotMutableStateImpl(T t10, SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        this.policy = snapshotMutationPolicy;
        Snapshot snapshotCurrentSnapshot = SnapshotKt.currentSnapshot();
        StateStateRecord<T> stateStateRecord = new StateStateRecord<>(snapshotCurrentSnapshot.getSnapshotId(), t10);
        if (!(snapshotCurrentSnapshot instanceof GlobalSnapshot)) {
            stateStateRecord.setNext$runtime_release(new StateStateRecord(SnapshotId_jvmKt.toSnapshotId(1), t10));
        }
        this.next = stateStateRecord;
    }

    public static /* synthetic */ void getDebuggerDisplayValue$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    @Override // androidx.compose.runtime.MutableState
    public T component1() {
        return getValue();
    }

    @Override // androidx.compose.runtime.MutableState
    public InterfaceC9540l component2() {
        return new InterfaceC9540l(this) { // from class: androidx.compose.runtime.SnapshotMutableStateImpl.component2.1
            final /* synthetic */ SnapshotMutableStateImpl<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30285invoke((C25781) obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30285invoke(T t10) {
                this.this$0.setValue(t10);
            }
        };
    }

    public final T getDebuggerDisplayValue() {
        return (T) ((StateStateRecord) SnapshotKt.current(this.next)).getValue();
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    public SnapshotMutationPolicy<T> getPolicy() {
        return this.policy;
    }

    @Override // androidx.compose.runtime.MutableState, androidx.compose.runtime.State
    public T getValue() {
        return (T) ((StateStateRecord) SnapshotKt.readable(this.next, this)).getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord mergeRecords(StateRecord stateRecord, StateRecord stateRecord2, StateRecord stateRecord3) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord = (StateStateRecord) stateRecord;
        AbstractC9979u.m20292e(stateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord2 = (StateStateRecord) stateRecord2;
        AbstractC9979u.m20292e(stateRecord3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        StateStateRecord stateStateRecord3 = (StateStateRecord) stateRecord3;
        if (getPolicy().equivalent(stateStateRecord2.getValue(), stateStateRecord3.getValue())) {
            return stateRecord2;
        }
        Object objMerge = getPolicy().merge(stateStateRecord.getValue(), stateStateRecord2.getValue(), stateStateRecord3.getValue());
        if (objMerge == null) {
            return null;
        }
        StateStateRecord stateStateRecordCreate = stateStateRecord3.create(stateStateRecord3.getSnapshotId$runtime_release());
        stateStateRecordCreate.setValue(objMerge);
        return stateStateRecordCreate;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void prependStateRecord(StateRecord stateRecord) {
        AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.next = (StateStateRecord) stateRecord;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.MutableState
    public void setValue(T t10) {
        Snapshot current;
        StateStateRecord stateStateRecord = (StateStateRecord) SnapshotKt.current(this.next);
        if (getPolicy().equivalent(stateStateRecord.getValue(), t10)) {
            return;
        }
        StateStateRecord<T> stateStateRecord2 = this.next;
        synchronized (SnapshotKt.getLock()) {
            current = Snapshot.Companion.getCurrent();
            ((StateStateRecord) SnapshotKt.overwritableRecord(stateStateRecord2, this, current, stateStateRecord)).setValue(t10);
            C10786q c10786q = C10786q.f26013a;
        }
        SnapshotKt.notifyWrite(current, this);
    }

    public String toString() {
        return "MutableState(value=" + ((StateStateRecord) SnapshotKt.current(this.next)).getValue() + ")@" + hashCode();
    }

    public static final class StateStateRecord<T> extends StateRecord {
        private T value;

        public StateStateRecord(long j10, T t10) {
            super(j10);
            this.value = t10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void assign(StateRecord stateRecord) {
            AbstractC9979u.m20292e(stateRecord, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.value = ((StateStateRecord) stateRecord).value;
        }

        public final T getValue() {
            return this.value;
        }

        public final void setValue(T t10) {
            this.value = t10;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateStateRecord<T> create() {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateStateRecord<T> create(long j10) {
            return new StateStateRecord<>(SnapshotKt.currentSnapshot().getSnapshotId(), this.value);
        }
    }
}
