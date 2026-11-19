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
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6469a;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001d\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010 \u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b \u0010!J/\u0010\"\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\"\u0010!J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b(\u0010&J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\n¢\u0006\u0004\b+\u0010*J\r\u0010,\u001a\u00020\n¢\u0006\u0004\b,\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010-R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\r0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010.R \u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u001b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010.R\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00103R$\u00106\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u000205\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\r088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R*\u0010@\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010?8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, m5110d2 = {"Landroidx/compose/runtime/internal/RememberEventDispatcher;", "Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/RememberObserver;", "abandoning", "<init>", "(Ljava/util/Set;)V", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/RememberObserverHolder;", "list", "Ld6/s;", "dispatchRememberList", "(Landroidx/compose/runtime/collection/MutableVector;)V", "", "instance", "", "endRelativeOrder", "priority", "endRelativeAfter", "recordLeaving", "(Ljava/lang/Object;III)V", "processPendingLeaving", "(I)V", "remembering", "(Landroidx/compose/runtime/RememberObserverHolder;)V", "forgetting", "(Landroidx/compose/runtime/RememberObserverHolder;III)V", "Lkotlin/Function0;", "effect", "sideEffect", "(Lr6/a;)V", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "deactivating", "(Landroidx/compose/runtime/ComposeNodeLifecycleCallback;III)V", "releasing", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "rememberPausingScope", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "startResumingScope", "endResumingScope", "dispatchRememberObservers", "()V", "dispatchSideEffects", "dispatchAbandons", "Ljava/util/Set;", "Landroidx/compose/runtime/collection/MutableVector;", "currentRememberingList", "leaving", "sideEffects", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterSet;", "Landroidx/collection/MutableScatterMap;", "Landroidx/compose/runtime/internal/PausedCompositionRemembers;", "pausedPlaceholders", "Landroidx/collection/MutableScatterMap;", "", "pending", "Ljava/util/List;", "Landroidx/collection/MutableIntList;", "priorities", "Landroidx/collection/MutableIntList;", "afters", "Landroidx/compose/runtime/Stack;", "nestedRemembersLists", "Ljava/util/ArrayList;", "runtime_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Trace.kt\nandroidx/compose/runtime/internal/TraceKt\n+ 6 IntList.kt\nandroidx/collection/IntList\n*L\n1#1,309:1\n1101#2:310\n1083#2,2:311\n1101#2:313\n1083#2,2:314\n1101#2:316\n1083#2,2:317\n641#3,2:319\n519#3:322\n472#3:326\n519#3:328\n423#3,9:334\n519#3:343\n423#3,9:347\n136#3:363\n1#4:321\n45#5,3:323\n49#5:327\n45#5,5:329\n45#5,3:344\n49#5:356\n45#5,5:357\n65#6:362\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/RememberEventDispatcher\n*L\n61#1:310\n61#1:311,2\n63#1:313\n63#1:314,2\n64#1:316\n64#1:317,2\n88#1:319,2\n150#1:322\n154#1:326\n173#1:328\n179#1:334,9\n187#1:343\n189#1:347,9\n292#1:363\n151#1:323,3\n151#1:327\n174#1:329,5\n188#1:344,3\n188#1:356\n197#1:357,5\n232#1:362\n*E\n"})
/* loaded from: classes.dex */
public final class RememberEventDispatcher implements RememberManager {
    public static final int $stable = 8;

    @NotNull
    private final Set<RememberObserver> abandoning;

    @NotNull
    private final MutableIntList afters;

    @NotNull
    private MutableVector<RememberObserverHolder> currentRememberingList;

    @NotNull
    private final MutableVector<Object> leaving;

    @Nullable
    private ArrayList nestedRemembersLists;

    @Nullable
    private MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> pausedPlaceholders;

    @NotNull
    private final List<Object> pending;

    @NotNull
    private final MutableIntList priorities;

    @Nullable
    private MutableScatterSet<ComposeNodeLifecycleCallback> releasing;

    @NotNull
    private final MutableVector<RememberObserverHolder> remembering;

    @NotNull
    private final MutableVector<InterfaceC6469a> sideEffects;

    public RememberEventDispatcher(@NotNull Set<RememberObserver> set) {
        this.abandoning = set;
        MutableVector<RememberObserverHolder> mutableVector = new MutableVector<>(new RememberObserverHolder[16], 0);
        this.remembering = mutableVector;
        this.currentRememberingList = mutableVector;
        this.leaving = new MutableVector<>(new Object[16], 0);
        this.sideEffects = new MutableVector<>(new InterfaceC6469a[16], 0);
        this.pending = new ArrayList();
        this.priorities = new MutableIntList(0, 1, null);
        this.afters = new MutableIntList(0, 1, null);
    }

    private final void dispatchRememberList(MutableVector<RememberObserverHolder> list) {
        RememberObserverHolder[] rememberObserverHolderArr = list.content;
        int size = list.getSize();
        for (int i = 0; i < size; i++) {
            RememberObserver wrapped = rememberObserverHolderArr[i].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    private final void processPendingLeaving(int endRelativeOrder) {
        if (this.pending.isEmpty()) {
            return;
        }
        int i = 0;
        int i8 = 0;
        ArrayList arrayListM5247A = null;
        MutableIntList mutableIntList = null;
        MutableIntList mutableIntList2 = null;
        while (true) {
            MutableIntList mutableIntList3 = this.afters;
            if (i8 >= mutableIntList3._size) {
                break;
            }
            if (endRelativeOrder <= mutableIntList3.get(i8)) {
                Object objRemove = this.pending.remove(i8);
                int iRemoveAt = this.afters.removeAt(i8);
                int iRemoveAt2 = this.priorities.removeAt(i8);
                if (arrayListM5247A == null) {
                    arrayListM5247A = AbstractC5806u.m5247A(objRemove);
                    mutableIntList2 = new MutableIntList(0, 1, null);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList = new MutableIntList(0, 1, null);
                    mutableIntList.add(iRemoveAt2);
                } else {
                    AbstractC5830k.m5328e(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    AbstractC5830k.m5328e(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
                    arrayListM5247A.add(objRemove);
                    mutableIntList2.add(iRemoveAt);
                    mutableIntList.add(iRemoveAt2);
                }
            } else {
                i8++;
            }
        }
        if (arrayListM5247A != null) {
            AbstractC5830k.m5328e(mutableIntList, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            AbstractC5830k.m5328e(mutableIntList2, "null cannot be cast to non-null type androidx.collection.MutableIntList");
            int size = arrayListM5247A.size() - 1;
            while (i < size) {
                int i9 = i + 1;
                int size2 = arrayListM5247A.size();
                for (int i10 = i9; i10 < size2; i10++) {
                    int i11 = mutableIntList2.get(i);
                    int i12 = mutableIntList2.get(i10);
                    if (i11 < i12 || (i12 == i11 && mutableIntList.get(i) < mutableIntList.get(i10))) {
                        RememberEventDispatcherKt.swap(arrayListM5247A, i, i10);
                        RememberEventDispatcherKt.swap(mutableIntList, i, i10);
                        RememberEventDispatcherKt.swap(mutableIntList2, i, i10);
                    }
                }
                i = i9;
            }
            MutableVector<Object> mutableVector = this.leaving;
            mutableVector.addAll(mutableVector.getSize(), (List<? extends Object>) arrayListM5247A);
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
    public void deactivating(@NotNull ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
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
        } finally {
            Trace.INSTANCE.endSection(objBeginSection);
        }
    }

    public final void dispatchRememberObservers() {
        Object objBeginSection;
        processPendingLeaving(Integer.MIN_VALUE);
        if (this.leaving.getSize() != 0) {
            objBeginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
            try {
                ScatterSet scatterSet = this.releasing;
                int size = this.leaving.getSize();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
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
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.remembering.getSize() != 0) {
            Trace trace = Trace.INSTANCE;
            objBeginSection = trace.beginSection("Compose:onRemembered");
            try {
                dispatchRememberList(this.remembering);
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
                MutableVector<InterfaceC6469a> mutableVector = this.sideEffects;
                InterfaceC6469a[] interfaceC6469aArr = mutableVector.content;
                int size = mutableVector.getSize();
                for (int i = 0; i < size; i++) {
                    interfaceC6469aArr[i].invoke();
                }
                this.sideEffects.clear();
                Trace.INSTANCE.endSection(objBeginSection);
            } catch (Throwable th) {
                Trace.INSTANCE.endSection(objBeginSection);
                throw th;
            }
        }
    }

    @Override // androidx.compose.runtime.RememberManager
    public void endResumingScope(@NotNull RecomposeScopeImpl scope) {
        MutableVector<RememberObserverHolder> mutableVector;
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        if (mutableScatterMap == null || mutableScatterMap.get(scope) == null) {
            return;
        }
        ArrayList arrayList = this.nestedRemembersLists;
        if (arrayList != null && (mutableVector = (MutableVector) Stack.m10103popimpl(arrayList)) != null) {
            this.currentRememberingList = mutableVector;
        }
        mutableScatterMap.remove(scope);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void forgetting(@NotNull RememberObserverHolder instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void releasing(@NotNull ComposeNodeLifecycleCallback instance, int endRelativeOrder, int priority, int endRelativeAfter) {
        MutableScatterSet<ComposeNodeLifecycleCallback> mutableScatterSetMutableScatterSetOf = this.releasing;
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.releasing = mutableScatterSetMutableScatterSetOf;
        }
        mutableScatterSetMutableScatterSetOf.plusAssign((MutableScatterSet<ComposeNodeLifecycleCallback>) instance);
        recordLeaving(instance, endRelativeOrder, priority, endRelativeAfter);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void rememberPausingScope(@NotNull RecomposeScopeImpl scope) {
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
    public void remembering(@NotNull RememberObserverHolder instance) {
        this.currentRememberingList.add(instance);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void sideEffect(@NotNull InterfaceC6469a effect) {
        this.sideEffects.add(effect);
    }

    @Override // androidx.compose.runtime.RememberManager
    public void startResumingScope(@NotNull RecomposeScopeImpl scope) {
        MutableScatterMap<RecomposeScopeImpl, PausedCompositionRemembers> mutableScatterMap = this.pausedPlaceholders;
        PausedCompositionRemembers pausedCompositionRemembers = mutableScatterMap != null ? mutableScatterMap.get(scope) : null;
        if (pausedCompositionRemembers != null) {
            ArrayList arrayListM10094constructorimpl$default = this.nestedRemembersLists;
            if (arrayListM10094constructorimpl$default == null) {
                arrayListM10094constructorimpl$default = Stack.m10094constructorimpl$default(null, 1, null);
                this.nestedRemembersLists = arrayListM10094constructorimpl$default;
            }
            Stack.m10104pushimpl(arrayListM10094constructorimpl$default, this.currentRememberingList);
            this.currentRememberingList = pausedCompositionRemembers.getPausedRemembers();
        }
    }
}
