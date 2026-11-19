package androidx.paging;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(m7879d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0004J1\u0010\u0011\u001a\u0002H\u0012\"\u0004\b\u0002\u0010\u00122\u001e\u0010\u0013\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0004\u0012\u0002H\u00120\u0014¢\u0006\u0002\u0010\u0015R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7880d2 = {"Landroidx/paging/AccessorStateHolder;", "Key", "", "Value", "()V", "_loadStates", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/LoadStates;", "internalState", "Landroidx/paging/AccessorState;", "loadStates", "Lkotlinx/coroutines/flow/StateFlow;", "getLoadStates", "()Lkotlinx/coroutines/flow/StateFlow;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/paging/internal/ReentrantLock;", "use", "R", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "paging-common_release"}, m7881k = 1, m7882mv = {1, 8, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nRemoteMediatorAccessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorStateHolder\n+ 2 Atomics.kt\nandroidx/paging/internal/AtomicsKt\n*L\n1#1,460:1\n54#2,6:461\n*S KotlinDebug\n*F\n+ 1 RemoteMediatorAccessor.kt\nandroidx/paging/AccessorStateHolder\n*L\n79#1:461,6\n*E\n"})
/* loaded from: classes3.dex */
final class AccessorStateHolder<Key, Value> {
    private final ReentrantLock lock = new ReentrantLock();
    private final MutableStateFlow<LoadStates> _loadStates = StateFlowKt.MutableStateFlow(LoadStates.INSTANCE.getIDLE());
    private final AccessorState<Key, Value> internalState = new AccessorState<>();

    public final StateFlow<LoadStates> getLoadStates() {
        return this._loadStates;
    }

    public final <R> R use(Function1<? super AccessorState<Key, Value>, ? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ReentrantLock reentrantLock = this.lock;
        try {
            reentrantLock.lock();
            R rInvoke = block.invoke(this.internalState);
            this._loadStates.setValue(this.internalState.computeLoadStates());
            return rInvoke;
        } finally {
            reentrantLock.unlock();
        }
    }
}
