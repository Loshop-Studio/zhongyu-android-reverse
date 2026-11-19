package androidx.compose.runtime.internal;

import androidx.collection.MutableIntList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.Stack;
import androidx.compose.runtime.collection.MutableVector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;
    private final Set<RememberObserver> abandoning;
    private final MutableIntList afters;
    private MutableVector<RememberObserverHolder> currentRememberingList;
    private final MutableVector<Object> leaving;
    private ArrayList nestedRemembersLists;
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;
    private final List<Object> pending;
    private final MutableIntList priorities;
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;
    private final MutableVector<RememberObserverHolder> remembering;
    private final MutableVector<InterfaceC10559a> sideEffects;

    public RememberEventDispatcher(Set<RememberObserver> set) {
        this.abandoning = set;
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new InterfaceC10559a[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> mutableVector) {
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            RememberObserver wrapped = rememberObserverHolderArr[i10].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    private final void processPendingLeaving(int i10) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i11 = 0;
        int i12 = 0;
        List<? extends Object> listM14776s = null;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.afters;
            if (i12 >= mutableIntList3._size) {
                break;
            }
            if (i10 <= mutableIntList3.get(i12)) {
                Object objRemove = this.pending.remove(i12);
                int iRemoveAt = this.afters.removeAt(i12);
                int iRemoveAt2 = this.priorities.removeAt(i12);
                if (listM14776s == null) {
                    listM14776s = AbstractC8809v.m14776s(objRemove);
                    mutableIntList2 = new MutableIntList(0, 1, null);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList = new MutableIntList(0, 1, null);
                    mutableIntList.add(iRemoveAt2);
                } else {
                    AbstractC9133u.m16131e(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC9133u.m16131e(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    listM14776s.add(objRemove);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList.add(iRemoveAt2);
                }
            } else {
                i12++;
            }
        }
        if (listM14776s != null) {
            AbstractC9133u.m16131e(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC9133u.m16131e(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = listM14776s.size() - 1;
            while (i11 < size) {
                int i13 = i11 + 1;
                int size2 = listM14776s.size();
                for (int i14 = i13; i14 < size2; i14++) {
                    int i15 = mutableIntList2.get(i11);
                    int i16 = mutableIntList2.get(i14);
                    if (i15 < i16 || (i16 == i15 && mutableIntList.get(i11) < mutableIntList.get(i14))) {
                        RememberEventDispatcherKt.swap(listM14776s, i11, i14);
                        RememberEventDispatcherKt.swap(mutableIntList, i11, i14);
                        RememberEventDispatcherKt.swap(mutableIntList2, i11, i14);
                    }
                }
                i11 = i13;
            }
            MutableVector<Object> mutableVector = this.leaving;
            mutableVector.addAll(mutableVector.getSize(), listM14776s);
        }
    }

    private final void recordLeaving(Object obj, int i10, int i11, int i12) {
        processPendingLeaving(i10);
        if (i12 < 0 || i12 >= i10) {
            this.leaving.add(obj);
            return;
        }
        this.pending.add(obj);
        this.priorities.add(i11);
        this.afters.add(i12);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12) {
        recordLeaving(composeNodeLifecycleCallback, i10, i11, i12);
    }

    public final void dispatchAbandons() {
        if (this.abandoning.isEmpty()) {
            return;
        }
        Object objBeginSection = Trace.INSTANCE.beginSection("Compose:abandons");
        try {
            Iterator<RememberObserver> it = this.abandoning.iterator();
            while (it.hasNext()) {
                RememberObserver next = it.next();
                it.remove();
                next.onAbandoned();
            }
            C8736p c8736p = C8736p.f16368a;
            Trace.INSTANCE.endSection(objBeginSection);
        } catch (Throwable th) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th;
        }
    }

    public final void dispatchRememberObservers() {
        Object objBeginSection;
        processPendingLeaving(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                ScatterSet scatterSet = this.releasing;
                for (int size = this.leaving.getSize() - 1; -1 < size; size--) {
                    Object obj = this.leaving.content[size];
                    if (obj instanceof RememberObserverHolder) {
                        RememberObserver wrapped = ((RememberObserverHolder) obj).getWrapped();
                        this.abandoning.remove(wrapped);
                        wrapped.onForgotten();
                    }
                    if (obj instanceof ComposeNodeLifecycleCallback) {
                        if (scatterSet == null || !scatterSet.contains(obj)) {
                            ((ComposeNodeLifecycleCallback) obj).onDeactivate();
                        } else {
                            ((ComposeNodeLifecycleCallback) obj).onRelease();
                        }
                    }
                }
                C8736p c8736p = C8736p.f16368a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            objBeginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                C8736p c8736p2 = C8736p.f16368a;
                trace.endSection(objBeginSection);
            } finally {
                Trace.INSTANCE.endSection(objBeginSection);
            }
        }
    }

    public final void dispatchSideEffects() {
        if (this.sideEffects.getSize() != 0) {
            Object objBeginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
            try {
                MutableVector<InterfaceC10559a> mutableVector = this.sideEffects;
                InterfaceC10559a[] interfaceC10559aArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    interfaceC10559aArr[i10].invoke();
                }
                this.sideEffects.clear();
                C8736p c8736p = C8736p.f16368a;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(recomposeScopeImpl) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m23697popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(RememberObserverHolder rememberObserverHolder, int i10, int i11, int i12) {
        recordLeaving(rememberObserverHolder, i10, i11, i12);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(ComposeNodeLifecycleCallback composeNodeLifecycleCallback, int i10, int i11, int i12) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) composeNodeLifecycleCallback);
        recordLeaving(composeNodeLifecycleCallback, i10, i11, i12);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl recomposeScopeImpl) {
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(this.abandoning);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMapMutableScatterMapOf = this.pausedPlaceholders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMapMutableScatterMapOf;
        }
        mutableScatterMapMutableScatterMapOf.set(recomposeScopeImpl, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(RememberObserverHolder rememberObserverHolder) {
        this.currentRememberingList.add(rememberObserverHolder);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(InterfaceC10559a interfaceC10559a) {
        this.sideEffects.add(interfaceC10559a);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(recomposeScopeImpl) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayListM23688constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM23688constructorimpl$default == null) {
                arrayListM23688constructorimpl$default = Stack.m23688constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM23688constructorimpl$default;
            }
            Stack.m23698pushimpl(arrayListM23688constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }
}
