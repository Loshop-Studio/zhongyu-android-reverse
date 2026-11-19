package androidx.paging;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.LoadState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(m13412d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bJ*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H\u0002J$\u0010\u0017\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J-\u0010\u001b\u001a\u00020\t2#\u0010\u0017\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0005¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u00050\bH\u0002J\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u00020\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bJ\u0018\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\u00192\b\u0010'\u001a\u0004\u0018\u00010\u0019J\u001e\u0010%\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010(\u001a\u00020\u0012R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R6\u0010\u0006\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b0\u0007j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006)"}, m13413d2 = {"Landroidx/paging/MutableCombinedLoadStateCollection;", "", "()V", "_stateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/paging/CombinedLoadStates;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "", "Landroidx/paging/internal/CopyOnWriteArrayList;", "stateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "addListener", "listener", "computeHelperState", "Landroidx/paging/LoadState;", "previousState", "sourceRefreshState", "sourceState", "remoteState", "computeNewState", "newSource", "Landroidx/paging/LoadStates;", "newRemote", "dispatchNewState", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "currState", "get", "type", "Landroidx/paging/LoadType;", "remote", "", "removeListener", "set", "sourceLoadStates", "remoteLoadStates", "state", "paging-common_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMutableCombinedLoadStateCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,170:1\n1#2:171\n230#3,5:172\n1855#4,2:177\n*S KotlinDebug\n*F\n+ 1 MutableCombinedLoadStateCollection.kt\nandroidx/paging/MutableCombinedLoadStateCollection\n*L\n98#1:172,5\n108#1:177,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MutableCombinedLoadStateCollection {
    private final MutableStateFlow<CombinedLoadStates> _stateFlow;
    private final CopyOnWriteArrayList<Function1<CombinedLoadStates, Unit>> listeners = new CopyOnWriteArrayList<>();
    private final StateFlow<CombinedLoadStates> stateFlow;

    public MutableCombinedLoadStateCollection() {
        MutableStateFlow<CombinedLoadStates> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._stateFlow = MutableStateFlow;
        this.stateFlow = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final LoadState computeHelperState(LoadState previousState, LoadState sourceRefreshState, LoadState sourceState, LoadState remoteState) {
        return remoteState == null ? sourceState : previousState instanceof LoadState.Loading ? (((sourceRefreshState instanceof LoadState.NotLoading) && (remoteState instanceof LoadState.NotLoading)) || (remoteState instanceof LoadState.Error)) ? remoteState : previousState : remoteState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CombinedLoadStates computeNewState(CombinedLoadStates previousState, LoadStates newSource, LoadStates newRemote) {
        LoadState incomplete$paging_common_release;
        LoadState incomplete$paging_common_release2;
        LoadState incomplete$paging_common_release3;
        if (previousState == null || (incomplete$paging_common_release = previousState.getRefresh()) == null) {
            incomplete$paging_common_release = LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release();
        }
        LoadState loadStateComputeHelperState = computeHelperState(incomplete$paging_common_release, newSource.getRefresh(), newSource.getRefresh(), newRemote != null ? newRemote.getRefresh() : null);
        if (previousState == null || (incomplete$paging_common_release2 = previousState.getPrepend()) == null) {
            incomplete$paging_common_release2 = LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release();
        }
        LoadState loadStateComputeHelperState2 = computeHelperState(incomplete$paging_common_release2, newSource.getRefresh(), newSource.getPrepend(), newRemote != null ? newRemote.getPrepend() : null);
        if (previousState == null || (incomplete$paging_common_release3 = previousState.getAppend()) == null) {
            incomplete$paging_common_release3 = LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release();
        }
        return new CombinedLoadStates(loadStateComputeHelperState, loadStateComputeHelperState2, computeHelperState(incomplete$paging_common_release3, newSource.getRefresh(), newSource.getAppend(), newRemote != null ? newRemote.getAppend() : null), newSource, newRemote);
    }

    private final void dispatchNewState(Function1<? super CombinedLoadStates, CombinedLoadStates> computeNewState) {
        CombinedLoadStates value;
        CombinedLoadStates combinedLoadStatesInvoke;
        MutableStateFlow<CombinedLoadStates> mutableStateFlow = this._stateFlow;
        do {
            value = mutableStateFlow.getValue();
            CombinedLoadStates combinedLoadStates = value;
            combinedLoadStatesInvoke = computeNewState.invoke(combinedLoadStates);
            if (Intrinsics.areEqual(combinedLoadStates, combinedLoadStatesInvoke)) {
                return;
            }
        } while (!mutableStateFlow.compareAndSet(value, combinedLoadStatesInvoke));
        if (combinedLoadStatesInvoke != null) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(combinedLoadStatesInvoke);
            }
        }
    }

    public final void addListener(Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.add(listener);
        CombinedLoadStates value = this._stateFlow.getValue();
        if (value != null) {
            listener.invoke(value);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.paging.LoadState get(androidx.paging.LoadType r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlinx.coroutines.flow.MutableStateFlow<androidx.paging.CombinedLoadStates> r0 = r2._stateFlow
            java.lang.Object r0 = r0.getValue()
            androidx.paging.CombinedLoadStates r0 = (androidx.paging.CombinedLoadStates) r0
            r1 = 0
            if (r4 == 0) goto L19
            if (r0 == 0) goto L17
            androidx.paging.LoadStates r4 = r0.getMediator()
            goto L1f
        L17:
            r4 = r1
            goto L1f
        L19:
            if (r0 == 0) goto L17
            androidx.paging.LoadStates r4 = r0.getSource()
        L1f:
            if (r4 == 0) goto L26
            androidx.paging.LoadState r3 = r4.get$paging_common_release(r3)
            return r3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.MutableCombinedLoadStateCollection.get(androidx.paging.LoadType, boolean):androidx.paging.LoadState");
    }

    public final StateFlow<CombinedLoadStates> getStateFlow() {
        return this.stateFlow;
    }

    public final void removeListener(Function1<? super CombinedLoadStates, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void set(final LoadStates sourceLoadStates, final LoadStates remoteLoadStates) {
        Intrinsics.checkNotNullParameter(sourceLoadStates, "sourceLoadStates");
        dispatchNewState(new Function1<CombinedLoadStates, CombinedLoadStates>() { // from class: androidx.paging.MutableCombinedLoadStateCollection.set.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CombinedLoadStates invoke(CombinedLoadStates combinedLoadStates) {
                return MutableCombinedLoadStateCollection.this.computeNewState(combinedLoadStates, sourceLoadStates, remoteLoadStates);
            }
        });
    }

    public final void set(final LoadType type, final boolean remote, final LoadState state) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        dispatchNewState(new Function1<CombinedLoadStates, CombinedLoadStates>() { // from class: androidx.paging.MutableCombinedLoadStateCollection.set.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final CombinedLoadStates invoke(CombinedLoadStates combinedLoadStates) {
                LoadStates idle;
                if (combinedLoadStates == null || (idle = combinedLoadStates.getSource()) == null) {
                    idle = LoadStates.INSTANCE.getIDLE();
                }
                LoadStates mediator = combinedLoadStates != null ? combinedLoadStates.getMediator() : null;
                if (remote) {
                    mediator = LoadStates.INSTANCE.getIDLE().modifyState$paging_common_release(type, state);
                } else {
                    idle = idle.modifyState$paging_common_release(type, state);
                }
                return this.computeNewState(combinedLoadStates, idle, mediator);
            }
        });
    }
}
