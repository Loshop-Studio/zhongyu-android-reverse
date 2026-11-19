package androidx.paging;

import androidx.paging.LoadState;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC9133u;
import p169l8.AbstractC9268e;
import p169l8.AbstractC9281r;
import p169l8.InterfaceC9271h;
import p169l8.InterfaceC9280q;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public final class MutableCombinedLoadStateCollection {
    private final InterfaceC9271h _stateFlow;
    private final CopyOnWriteArrayList<InterfaceC10570l> listeners = new CopyOnWriteArrayList<>();
    private final InterfaceC9280q stateFlow;

    public MutableCombinedLoadStateCollection() {
        InterfaceC9271h interfaceC9271hM17054a = AbstractC9281r.m17054a(null);
        this._stateFlow = interfaceC9271hM17054a;
        this.stateFlow = AbstractC9268e.m17012b(interfaceC9271hM17054a);
    }

    private final LoadState computeHelperState(LoadState loadState, LoadState loadState2, LoadState loadState3, LoadState loadState4) {
        return loadState4 == null ? loadState3 : loadState instanceof LoadState.Loading ? (((loadState2 instanceof LoadState.NotLoading) && (loadState4 instanceof LoadState.NotLoading)) || (loadState4 instanceof LoadState.Error)) ? loadState4 : loadState : loadState4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CombinedLoadStates computeNewState(CombinedLoadStates combinedLoadStates, LoadStates loadStates, LoadStates loadStates2) {
        LoadState incomplete$paging_common_release;
        LoadState incomplete$paging_common_release2;
        LoadState incomplete$paging_common_release3;
        if (combinedLoadStates == null || (incomplete$paging_common_release = combinedLoadStates.getRefresh()) == null) {
            incomplete$paging_common_release = LoadState.NotLoading.Companion.getIncomplete$paging_common_release();
        }
        LoadState loadStateComputeHelperState = computeHelperState(incomplete$paging_common_release, loadStates.getRefresh(), loadStates.getRefresh(), loadStates2 != null ? loadStates2.getRefresh() : null);
        if (combinedLoadStates == null || (incomplete$paging_common_release2 = combinedLoadStates.getPrepend()) == null) {
            incomplete$paging_common_release2 = LoadState.NotLoading.Companion.getIncomplete$paging_common_release();
        }
        LoadState loadStateComputeHelperState2 = computeHelperState(incomplete$paging_common_release2, loadStates.getRefresh(), loadStates.getPrepend(), loadStates2 != null ? loadStates2.getPrepend() : null);
        if (combinedLoadStates == null || (incomplete$paging_common_release3 = combinedLoadStates.getAppend()) == null) {
            incomplete$paging_common_release3 = LoadState.NotLoading.Companion.getIncomplete$paging_common_release();
        }
        return new CombinedLoadStates(loadStateComputeHelperState, loadStateComputeHelperState2, computeHelperState(incomplete$paging_common_release3, loadStates.getRefresh(), loadStates.getAppend(), loadStates2 != null ? loadStates2.getAppend() : null), loadStates, loadStates2);
    }

    private final void dispatchNewState(InterfaceC10570l interfaceC10570l) {
        Object value;
        CombinedLoadStates combinedLoadStates;
        InterfaceC9271h interfaceC9271h = this._stateFlow;
        do {
            value = interfaceC9271h.getValue();
            CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) value;
            combinedLoadStates = (CombinedLoadStates) interfaceC10570l.invoke(combinedLoadStates2);
            if (AbstractC9133u.m16128b(combinedLoadStates2, combinedLoadStates)) {
                return;
            }
        } while (!interfaceC9271h.mo16686e(value, combinedLoadStates));
        if (combinedLoadStates != null) {
            Iterator<T> it = this.listeners.iterator();
            while (it.hasNext()) {
                ((InterfaceC10570l) it.next()).invoke(combinedLoadStates);
            }
        }
    }

    public final void addListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.add(listener);
        CombinedLoadStates combinedLoadStates = (CombinedLoadStates) this._stateFlow.getValue();
        if (combinedLoadStates != null) {
            listener.invoke(combinedLoadStates);
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
            kotlin.jvm.internal.AbstractC9133u.m16133g(r3, r0)
            l8.h r0 = r2._stateFlow
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

    public final InterfaceC9280q getStateFlow() {
        return this.stateFlow;
    }

    public final void removeListener(InterfaceC10570l listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void set(final LoadStates sourceLoadStates, final LoadStates loadStates) {
        AbstractC9133u.m16133g(sourceLoadStates, "sourceLoadStates");
        dispatchNewState(new InterfaceC10570l() { // from class: androidx.paging.MutableCombinedLoadStateCollection.set.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final CombinedLoadStates invoke(CombinedLoadStates combinedLoadStates) {
                return MutableCombinedLoadStateCollection.this.computeNewState(combinedLoadStates, sourceLoadStates, loadStates);
            }
        });
    }

    public final void set(final LoadType type, final boolean z10, final LoadState state) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(state, "state");
        dispatchNewState(new InterfaceC10570l() { // from class: androidx.paging.MutableCombinedLoadStateCollection.set.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public final CombinedLoadStates invoke(CombinedLoadStates combinedLoadStates) {
                LoadStates idle;
                if (combinedLoadStates == null || (idle = combinedLoadStates.getSource()) == null) {
                    idle = LoadStates.Companion.getIDLE();
                }
                LoadStates mediator = combinedLoadStates != null ? combinedLoadStates.getMediator() : null;
                if (z10) {
                    mediator = LoadStates.Companion.getIDLE().modifyState$paging_common_release(type, state);
                } else {
                    idle = idle.modifyState$paging_common_release(type, state);
                }
                return this.computeNewState(combinedLoadStates, idle, mediator);
            }
        });
    }
}
