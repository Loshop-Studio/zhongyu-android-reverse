package androidx.paging;

import androidx.paging.internal.CopyOnWriteArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;

/* loaded from: classes3.dex */
public final class MutableCombinedLoadStateCollection {
    private final InterfaceC11603l _stateFlow;
    private final CopyOnWriteArrayList<InterfaceC9540l> listeners = new CopyOnWriteArrayList<>();
    private final InterfaceC11612u stateFlow;

    public MutableCombinedLoadStateCollection() {
        InterfaceC11603l interfaceC11603lM25602a = AbstractC11613v.m25602a(null);
        this._stateFlow = interfaceC11603lM25602a;
        this.stateFlow = AbstractC11596e.m25552b(interfaceC11603lM25602a);
    }

    private final void dispatchNewState(InterfaceC9540l interfaceC9540l) {
        Object value;
        CombinedLoadStates combinedLoadStates;
        InterfaceC11603l interfaceC11603l = this._stateFlow;
        do {
            value = interfaceC11603l.getValue();
            CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) value;
            combinedLoadStates = (CombinedLoadStates) interfaceC9540l.invoke(combinedLoadStates2);
            if (AbstractC9979u.m20289b(combinedLoadStates2, combinedLoadStates)) {
                return;
            }
        } while (!interfaceC11603l.mo20870e(value, combinedLoadStates));
        if (combinedLoadStates != null) {
            Iterator<InterfaceC9540l> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().invoke(combinedLoadStates);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CombinedLoadStates set$lambda$0(LoadStates loadStates, LoadStates loadStates2, CombinedLoadStates combinedLoadStates) {
        return MutableCombinedLoadStateCollectionKt.computeNewState(combinedLoadStates, loadStates, loadStates2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CombinedLoadStates set$lambda$1(boolean z10, LoadType loadType, LoadState loadState, CombinedLoadStates combinedLoadStates) {
        LoadStates idle;
        if (combinedLoadStates == null || (idle = combinedLoadStates.getSource()) == null) {
            idle = LoadStates.Companion.getIDLE();
        }
        LoadStates mediator = combinedLoadStates != null ? combinedLoadStates.getMediator() : null;
        if (z10) {
            mediator = LoadStates.Companion.getIDLE().modifyState$paging_common(loadType, loadState);
        } else {
            idle = idle.modifyState$paging_common(loadType, loadState);
        }
        return MutableCombinedLoadStateCollectionKt.computeNewState(combinedLoadStates, idle, mediator);
    }

    public final void addListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
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
            kotlin.jvm.internal.AbstractC9979u.m20294g(r3, r0)
            vd.l r0 = r2._stateFlow
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
            androidx.paging.LoadState r3 = r4.get$paging_common(r3)
            return r3
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.MutableCombinedLoadStateCollection.get(androidx.paging.LoadType, boolean):androidx.paging.LoadState");
    }

    public final InterfaceC11612u getStateFlow() {
        return this.stateFlow;
    }

    public final void removeListener(InterfaceC9540l listener) {
        AbstractC9979u.m20294g(listener, "listener");
        this.listeners.remove(listener);
    }

    public final void set(final LoadStates sourceLoadStates, final LoadStates loadStates) {
        AbstractC9979u.m20294g(sourceLoadStates, "sourceLoadStates");
        dispatchNewState(new InterfaceC9540l() { // from class: androidx.paging.d0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return MutableCombinedLoadStateCollection.set$lambda$0(sourceLoadStates, loadStates, (CombinedLoadStates) obj);
            }
        });
    }

    public final void set(final LoadType type, final boolean z10, final LoadState state) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(state, "state");
        dispatchNewState(new InterfaceC9540l() { // from class: androidx.paging.c0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return MutableCombinedLoadStateCollection.set$lambda$1(z10, type, state, (CombinedLoadStates) obj);
            }
        });
    }
}
