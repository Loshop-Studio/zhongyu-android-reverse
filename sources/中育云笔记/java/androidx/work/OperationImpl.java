package androidx.work;

import androidx.lifecycle.LiveData;
import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
final class OperationImpl implements Operation {
    private final ListenableFuture<Operation.State.SUCCESS> future;
    private final LiveData<Operation.State> state;

    public OperationImpl(LiveData<Operation.State> state, ListenableFuture<Operation.State.SUCCESS> future) {
        AbstractC9979u.m20294g(state, "state");
        AbstractC9979u.m20294g(future, "future");
        this.state = state;
        this.future = future;
    }

    @Override // androidx.work.Operation
    public ListenableFuture<Operation.State.SUCCESS> getResult() {
        return this.future;
    }

    @Override // androidx.work.Operation
    public LiveData<Operation.State> getState() {
        return this.state;
    }
}
