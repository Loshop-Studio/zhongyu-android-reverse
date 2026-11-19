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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred(parameters = 0)
@Metadata(m13557d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J(\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0006\u0010$\u001a\u00020\u001dJ\u0016\u0010%\u001a\u00020\u001d2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002J\u0006\u0010'\u001a\u00020\u001dJ\u0006\u0010(\u001a\u00020\u001dJ\u0010\u0010)\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016J(\u0010+\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u0010,\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0002J(\u0010-\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002J(\u0010\u0017\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016J\u0010\u0010.\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016J\u0010\u0010\u001a\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\nH\u0016J\u0016\u0010/\u001a\u00020\u001d2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0016J\u0010\u00101\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020\u0012H\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00062"}, m13558d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "abandoning", "", "Landroidx/compose/runtime/RememberObserver;", "(Ljava/util/Set;)V", "afters", "Landroidx/collection/MutableIntList;", "currentRememberingList", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "leaving", "", "nestedRemembersLists", "Landroidx/compose/runtime/Stack;", "Ljava/util/ArrayList;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pending", "", "priorities", "releasing", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "remembering", "sideEffects", "Lkotlin/Function0;", "", "deactivating", "instance", "endRelativeOrder", "", "priority", "endRelativeAfter", "dispatchAbandons", "dispatchRememberList", "list", "dispatchRememberObservers", "dispatchSideEffects", "endResumingScope", "scope", "forgetting", "processPendingLeaving", "recordLeaving", "rememberPausingScope", "sideEffect", "effect", "startResumingScope", "runtime_release"}, m13559k = 1, m13560mv = {1, 9, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,309:1\n1101#2:310\n1083#2,2:311\n1101#2:313\n1083#2,2:314\n1101#2:316\n1083#2,2:317\n641#3,2:319\n519#3:322\n472#3:326\n519#3:328\n423#3,9:334\n519#3:343\n423#3,9:347\n136#3:363\n1#4:321\n45#5,3:323\n49#5:327\n45#5,5:329\n45#5,3:344\n49#5:356\n45#5,5:357\n65#6:362\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n*L\n61#1:310\n61#1:311,2\n63#1:313\n63#1:314,2\n64#1:316\n64#1:317,2\n88#1:319,2\n150#1:322\n154#1:326\n173#1:328\n179#1:334,9\n187#1:343\n189#1:347,9\n292#1:363\n151#1:323,3\n151#1:327\n174#1:329,5\n188#1:344,3\n188#1:356\n197#1:357,5\n232#1:362\n*E\n"})
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
    private final MutableVector<Function0<Unit>> sideEffects;

    public RememberEventDispatcher(Set<RememberObserver> set) {
        this.abandoning = set;
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new Function0[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> list) {
        RememberObserverHolder[] rememberObserverHolderArr = list.content;
        int size = list.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            RememberObserver wrapped = rememberObserverHolderArr[i10].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    private final void processPendingLeaving(int endRelativeOrder) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        List<? extends Object> listMutableListOf = null;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.afters;
            if (i11 >= mutableIntList3._size) {
                break;
            }
            if (endRelativeOrder <= mutableIntList3.get(i11)) {
                Object objRemove = this.pending.remove(i11);
                int iRemoveAt = this.afters.removeAt(i11);
                int iRemoveAt2 = this.priorities.removeAt(i11);
                if (listMutableListOf == null) {
                    listMutableListOf = CollectionsKt.mutableListOf(objRemove);
                    mutableIntList2 = new MutableIntList(0, 1, null);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList = new MutableIntList(0, 1, null);
                    mutableIntList.add(iRemoveAt2);
                } else {
                    Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    listMutableListOf.add(objRemove);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList.add(iRemoveAt2);
                }
            } else {
                i11++;
            }
        }
        if (listMutableListOf != null) {
            Intrinsics.checkNotNull(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            Intrinsics.checkNotNull(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = listMutableListOf.size() - 1;
            while (i10 < size) {
                int i12 = i10 + 1;
                int size2 = listMutableListOf.size();
                for (int i13 = i12; i13 < size2; i13++) {
                    int i14 = mutableIntList2.get(i10);
                    int i15 = mutableIntList2.get(i13);
                    if (i14 < i15 || (i15 == i14 && mutableIntList.get(i10) < mutableIntList.get(i13))) {
                        RememberEventDispatcherKt.swap(listMutableListOf, i10, i13);
                        RememberEventDispatcherKt.swap(mutableIntList, i10, i13);
                        RememberEventDispatcherKt.swap(mutableIntList2, i10, i13);
                    }
                }
                i10 = i12;
            }
            MutableVector<Object> mutableVector = this.leaving;
            mutableVector.addAll(mutableVector.getSize(), listMutableListOf);
        }
    }

    private final void recordLeaving(Object instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        processPendingLeaving(endRelativeOrder);
        if (endRelativeAfter < 0 || endRelativeAfter >= endRelativeOrder) {
            this.leaving.add(instance);
            return;
        }
        this.pending.add(instance);
        this.priorities.add(priority);
        this.afters.add(endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void deactivating(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
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
            Unit unit = Unit.INSTANCE;
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
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            objBeginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
                Unit unit2 = Unit.INSTANCE;
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
                MutableVector<Function0<Unit>> mutableVector = this.sideEffects;
                Function0<Unit>[] function0Arr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i10 = 0; i10 < size; i10++) {
                    function0Arr[i10].invoke();
                }
                this.sideEffects.clear();
                Unit unit = Unit.INSTANCE;
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(RecomposeScopeImpl scope) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(scope) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m20412popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(scope);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(RememberObserverHolder instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) instance);
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(RecomposeScopeImpl scope) {
        PausedCompositionRemembers pausedCompositionRemembers = new PausedCompositionRemembers(this.abandoning);
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMapMutableScatterMapOf = this.pausedPlaceholders;
        if (mutableScatterMapMutableScatterMapOf == null) {
            mutableScatterMapMutableScatterMapOf = ScatterMapKt.mutableScatterMapOf();
            this.pausedPlaceholders = mutableScatterMapMutableScatterMapOf;
        }
        mutableScatterMapMutableScatterMapOf.set(scope, pausedCompositionRemembers);
        this.currentRememberingList.add(new RememberObserverHolder(pausedCompositionRemembers, null));
    }

    @Override // androidx.compose.runtime.RememberManager
    public void remembering(RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(Function0<Unit> effect) {
        this.sideEffects.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(RecomposeScopeImpl scope) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(scope) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayListM20403constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM20403constructorimpl$default == null) {
                arrayListM20403constructorimpl$default = Stack.m20403constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM20403constructorimpl$default;
            }
            Stack.m20413pushimpl(arrayListM20403constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }
}
