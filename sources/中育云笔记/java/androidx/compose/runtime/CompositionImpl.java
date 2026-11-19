package androidx.compose.runtime;

import androidx.camera.view.AbstractC0979q;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectIntMap;
import androidx.compose.runtime.DerivedState;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.collection.ScopeMap;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Trace;
import androidx.compose.runtime.snapshots.ReaderKind;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.tooling.CompositionObserver;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10964p;
import p325rc.AbstractC10968r;
import p325rc.AbstractC10983y0;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class CompositionImpl implements ControlledComposition, ReusableComposition, RecomposeScopeOwner, CompositionServices, PausableComposition {
    public static final int $stable = 8;
    private final InterfaceC9945d _recomposeContext;
    private final Set<RememberObserver> abandonSet;
    private final Applier<?> applier;
    private final ChangeList changes;
    private InterfaceC9544p composable;
    private final ComposerImpl composer;
    private final MutableScatterSet<RecomposeScopeImpl> conditionallyInvalidatedScopes;
    private final MutableScatterMap<Object, Object> derivedStates;
    private boolean disposed;
    private final MutableScatterSet<RecomposeScopeImpl> invalidatedScopes;
    private CompositionImpl invalidationDelegate;
    private int invalidationDelegateGroup;
    private MutableScatterMap<Object, Object> invalidations;
    private final boolean isRoot;
    private final ChangeList lateChanges;
    private final Object lock;
    private final MutableScatterMap<Object, Object> observations;
    private final MutableScatterMap<Object, Object> observationsProcessed;
    private final CompositionObserverHolder observerHolder;
    private final CompositionContext parent;
    private boolean pendingInvalidScopes;
    private final AtomicReference<Object> pendingModifications;
    private PausedCompositionImpl pendingPausedComposition;
    private ShouldPauseCallback shouldPause;
    private final SlotTable slotTable;

    public CompositionImpl(CompositionContext compositionContext, Applier<?> applier, InterfaceC9945d interfaceC9945d) {
        this.parent = compositionContext;
        this.applier = applier;
        this.pendingModifications = new AtomicReference<>(null);
        this.lock = new Object();
        Set<RememberObserver> setAsMutableSet = new MutableScatterSet(0, 1, null).asMutableSet();
        this.abandonSet = setAsMutableSet;
        SlotTable slotTable = new SlotTable();
        if (compositionContext.getCollectingCallByInformation$runtime_release()) {
            slotTable.collectCalledByInformation();
        }
        if (compositionContext.getCollectingSourceInformation$runtime_release()) {
            slotTable.collectSourceInformation();
        }
        this.slotTable = slotTable;
        this.observations = ScopeMap.m30405constructorimpl$default(null, 1, null);
        this.invalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.conditionallyInvalidatedScopes = new MutableScatterSet<>(0, 1, null);
        this.derivedStates = ScopeMap.m30405constructorimpl$default(null, 1, null);
        ChangeList changeList = new ChangeList();
        this.changes = changeList;
        ChangeList changeList2 = new ChangeList();
        this.lateChanges = changeList2;
        this.observationsProcessed = ScopeMap.m30405constructorimpl$default(null, 1, null);
        this.invalidations = ScopeMap.m30405constructorimpl$default(null, 1, null);
        this.observerHolder = new CompositionObserverHolder(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, compositionContext, slotTable, setAsMutableSet, changeList, changeList2, this);
        compositionContext.registerComposer$runtime_release(composerImpl);
        this.composer = composerImpl;
        this._recomposeContext = interfaceC9945d;
        this.isRoot = compositionContext instanceof Recomposer;
        this.composable = ComposableSingletons$CompositionKt.INSTANCE.m30232getLambda1$runtime_release();
    }

    private final void addPendingInvalidationsLocked(Object obj, boolean z10) {
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (ScopeMap.m30412removeimpl(this.observationsProcessed, obj, recomposeScopeImpl) || recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IGNORED) {
                return;
            }
            if (!recomposeScopeImpl.isConditional() || z10) {
                this.invalidatedScopes.add(recomposeScopeImpl);
                return;
            } else {
                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl);
                return;
            }
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i10 << 3) + i12];
                        if (!ScopeMap.m30412removeimpl(this.observationsProcessed, obj, recomposeScopeImpl2) && recomposeScopeImpl2.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                            if (!recomposeScopeImpl2.isConditional() || z10) {
                                this.invalidatedScopes.add(recomposeScopeImpl2);
                            } else {
                                this.conditionallyInvalidatedScopes.add(recomposeScopeImpl2);
                            }
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.applyChangesInLocked(androidx.compose.runtime.changelist.ChangeList):void");
    }

    private final void cleanUpDerivedStateObservations() {
        char c10;
        long j10;
        long j11;
        long j12;
        long[] jArr;
        long[] jArr2;
        long j13;
        int i10;
        char c11;
        long j14;
        long j15;
        int i11;
        boolean zIsEmpty;
        long[] jArr3;
        int i12;
        int i13;
        MutableScatterMap<Object, Object> mutableScatterMap = this.derivedStates;
        long[] jArr4 = mutableScatterMap.metadata;
        int length = jArr4.length - 2;
        char c12 = 7;
        long j16 = -9187201950435737472L;
        int i14 = 8;
        if (length >= 0) {
            int i15 = 0;
            long j17 = 128;
            while (true) {
                long j18 = jArr4[i15];
                j11 = 255;
                if ((((~j18) << c12) & j18 & j16) != j16) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j18 & 255) < j17) {
                            c11 = c12;
                            int i18 = (i15 << 3) + i17;
                            j14 = j16;
                            Object obj = mutableScatterMap.keys[i18];
                            Object obj2 = mutableScatterMap.values[i18];
                            if (obj2 instanceof MutableScatterSet) {
                                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
                                Object[] objArr = mutableScatterSet.elements;
                                long[] jArr5 = mutableScatterSet.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j15 = j17;
                                    int i19 = 0;
                                    int i20 = i14;
                                    while (true) {
                                        int i21 = length2;
                                        long j19 = jArr5[i19];
                                        j13 = j18;
                                        if ((((~j19) << c11) & j19 & j14) != j14) {
                                            int i22 = 8 - ((~(i19 - i21)) >>> 31);
                                            int i23 = 0;
                                            while (i23 < i22) {
                                                if ((j19 & 255) < j15) {
                                                    jArr3 = jArr4;
                                                    int i24 = (i19 << 3) + i23;
                                                    i12 = i23;
                                                    i13 = i17;
                                                    if (!ScopeMap.m30406containsimpl(this.observations, (DerivedState) objArr[i24])) {
                                                        mutableScatterSet.removeElementAt(i24);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i12 = i23;
                                                    i13 = i17;
                                                }
                                                j19 >>= i20;
                                                i23 = i12 + 1;
                                                i17 = i13;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i10 = i17;
                                            if (i22 != i20) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i10 = i17;
                                        }
                                        length2 = i21;
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        j18 = j13;
                                        i17 = i10;
                                        jArr4 = jArr2;
                                        i20 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j13 = j18;
                                    i10 = i17;
                                    j15 = j17;
                                }
                                zIsEmpty = mutableScatterSet.isEmpty();
                            } else {
                                jArr2 = jArr4;
                                j13 = j18;
                                i10 = i17;
                                j15 = j17;
                                AbstractC9979u.m20292e(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zIsEmpty = !ScopeMap.m30406containsimpl(this.observations, (DerivedState) obj2);
                            }
                            if (zIsEmpty) {
                                mutableScatterMap.removeValueAt(i18);
                            }
                            i11 = 8;
                        } else {
                            jArr2 = jArr4;
                            j13 = j18;
                            i10 = i17;
                            c11 = c12;
                            j14 = j16;
                            j15 = j17;
                            i11 = i14;
                        }
                        j18 = j13 >> i11;
                        i17 = i10 + 1;
                        i14 = i11;
                        c12 = c11;
                        j16 = j14;
                        j17 = j15;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                    if (i16 != i14) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c10 = c12;
                    j10 = j16;
                    j12 = j17;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                c12 = c10;
                j16 = j10;
                j17 = j12;
                jArr4 = jArr;
                i14 = 8;
            }
        } else {
            c10 = 7;
            j10 = -9187201950435737472L;
            j11 = 255;
            j12 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.isNotEmpty()) {
            return;
        }
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSet2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = mutableScatterSet2.elements;
        long[] jArr6 = mutableScatterSet2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j20 = jArr6[i25];
            if ((((~j20) << c10) & j20 & j10) != j10) {
                int i26 = 8 - ((~(i25 - length3)) >>> 31);
                for (int i27 = 0; i27 < i26; i27++) {
                    if ((j20 & j11) < j12) {
                        int i28 = (i25 << 3) + i27;
                        if (!((RecomposeScopeImpl) objArr2[i28]).isConditional()) {
                            mutableScatterSet2.removeElementAt(i28);
                        }
                    }
                    j20 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length3) {
                return;
            } else {
                i25++;
            }
        }
    }

    private final void composeInitial(InterfaceC9544p interfaceC9544p) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        this.composable = interfaceC9544p;
        this.parent.composeInitial$runtime_release(this, interfaceC9544p);
    }

    private final void drainPendingModificationsForCompositionLocked() {
        Object andSet = this.pendingModifications.getAndSet(CompositionKt.PendingApplyNoModifications);
        if (andSet != null) {
            if (AbstractC9979u.m20289b(andSet, CompositionKt.PendingApplyNoModifications)) {
                ComposerKt.composeRuntimeError("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                addPendingInvalidationsLocked((Set<? extends Object>) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, true);
            }
        }
    }

    private final void drainPendingModificationsLocked() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (AbstractC9979u.m20289b(andSet, CompositionKt.PendingApplyNoModifications)) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                addPendingInvalidationsLocked(set, false);
            }
            return;
        }
        if (andSet == null) {
            ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
        throw new KotlinNothingValueException();
    }

    private final void drainPendingModificationsOutOfBandLocked() {
        Object andSet = this.pendingModifications.getAndSet(AbstractC10983y0.m24160f());
        if (AbstractC9979u.m20289b(andSet, CompositionKt.PendingApplyNoModifications) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            addPendingInvalidationsLocked((Set<? extends Object>) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            addPendingInvalidationsLocked(set, false);
        }
    }

    private static /* synthetic */ void getAbandonSet$annotations() {
    }

    private final boolean getAreChildrenComposing() {
        return this.composer.getAreChildrenComposing$runtime_release();
    }

    public static /* synthetic */ void getPendingInvalidScopes$runtime_release$annotations() {
    }

    public static /* synthetic */ void getSlotTable$runtime_release$annotations() {
    }

    private final <T> T guardChanges(InterfaceC9529a interfaceC9529a) throws Exception {
        try {
            try {
                T t10 = (T) interfaceC9529a.invoke();
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                return t10;
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                AbstractC9977s.m20285a(1);
                throw th;
            }
        } catch (Exception e10) {
            abandonChanges();
            throw e10;
        }
    }

    private final <T> T guardInvalidationsLocked(InterfaceC9540l interfaceC9540l) throws Exception {
        MutableScatterMap<Object, Object> mutableScatterMapM30242takeInvalidationsafanTW4 = m30242takeInvalidationsafanTW4();
        try {
            return (T) interfaceC9540l.invoke(ScopeMap.m30402boximpl(mutableScatterMapM30242takeInvalidationsafanTW4));
        } catch (Exception e10) {
            this.invalidations = mutableScatterMapM30242takeInvalidationsafanTW4;
            throw e10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac A[Catch: all -> 0x001e, EDGE_INSN: B:66:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], EDGE_INSN: B:67:0x00ac->B:51:0x00ac BREAK  A[LOOP:0: B:33:0x0063->B:47:0x00a4], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:19:0x002d, B:21:0x0033, B:23:0x003e, B:25:0x0042, B:26:0x004b, B:28:0x0053, B:30:0x0057, B:33:0x0063, B:35:0x0073, B:37:0x007f, B:39:0x0089, B:43:0x0098, B:47:0x00a4, B:48:0x00a7, B:51:0x00ac), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final androidx.compose.runtime.InvalidationResult invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl r21, androidx.compose.runtime.Anchor r22, java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.invalidateChecked(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.Anchor, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    private final void invalidateScopeOfLocked(Object obj) {
        Object obj2 = this.observations.get(obj);
        if (obj2 == null) {
            return;
        }
        if (!(obj2 instanceof MutableScatterSet)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
            if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                ScopeMap.m30399addimpl(this.observationsProcessed, obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj2;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i10 << 3) + i12];
                        if (recomposeScopeImpl2.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                            ScopeMap.m30399addimpl(this.observationsProcessed, obj, recomposeScopeImpl2);
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final CompositionObserver observer() {
        CompositionObserverHolder compositionObserverHolder = this.observerHolder;
        if (compositionObserverHolder.getRoot()) {
            return compositionObserverHolder.getObserver();
        }
        CompositionObserverHolder observerHolder$runtime_release = this.parent.getObserverHolder$runtime_release();
        CompositionObserver observer = observerHolder$runtime_release != null ? observerHolder$runtime_release.getObserver() : null;
        if (!AbstractC9979u.m20289b(observer, compositionObserverHolder.getObserver())) {
            compositionObserverHolder.setObserver(observer);
        }
        return observer;
    }

    /* renamed from: takeInvalidations-afanTW4, reason: not valid java name */
    private final MutableScatterMap<Object, Object> m30242takeInvalidationsafanTW4() {
        MutableScatterMap<Object, Object> mutableScatterMap = this.invalidations;
        this.invalidations = ScopeMap.m30405constructorimpl$default(null, 1, null);
        return mutableScatterMap;
    }

    private final <T> T trackAbandonedValues(InterfaceC9529a interfaceC9529a) {
        try {
            T t10 = (T) interfaceC9529a.invoke();
            AbstractC9977s.m20286b(1);
            AbstractC9977s.m20285a(1);
            return t10;
        } catch (Throwable th) {
            AbstractC9977s.m20286b(1);
            if (!this.abandonSet.isEmpty()) {
                new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
            }
            AbstractC9977s.m20285a(1);
            throw th;
        }
    }

    private final boolean tryImminentInvalidation(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return isComposing() && this.composer.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj);
    }

    private final void validateRecomposeScopeAnchors(SlotTable slotTable) {
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i10);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                PreconditionsKt.throwIllegalStateException("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + AbstractC10968r.m24048G0(slotTable.getSlots(), recomposeScopeImpl2));
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void abandonChanges() {
        this.pendingModifications.set(null);
        this.changes.clear();
        this.lateChanges.clear();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.lock) {
            try {
                applyChangesInLocked(this.changes);
                drainPendingModificationsLocked();
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e10) {
                        abandonChanges();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.isNotEmpty()) {
                    applyChangesInLocked(this.lateChanges);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e10) {
                        abandonChanges();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.lock) {
            try {
                this.composer.changesApplied$runtime_release();
                if (!this.abandonSet.isEmpty()) {
                    new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.abandonSet.isEmpty()) {
                            new RememberEventDispatcher(this.abandonSet).dispatchAbandons();
                        }
                        throw th;
                    } catch (Exception e10) {
                        abandonChanges();
                        throw e10;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(InterfaceC9544p interfaceC9544p) {
        MutableScatterMap<Object, Object> mutableScatterMapM30242takeInvalidationsafanTW4;
        try {
            synchronized (this.lock) {
                try {
                    drainPendingModificationsForCompositionLocked();
                    mutableScatterMapM30242takeInvalidationsafanTW4 = m30242takeInvalidationsafanTW4();
                    CompositionObserver compositionObserverObserver = observer();
                    if (compositionObserverObserver != null) {
                        Map<RecomposeScope, ? extends Set<? extends Object>> mapM30401asMapimpl = ScopeMap.m30401asMapimpl(mutableScatterMapM30242takeInvalidationsafanTW4);
                        AbstractC9979u.m20292e(mapM30401asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                        compositionObserverObserver.onBeginComposition(this, mapM30401asMapimpl);
                    }
                    this.composer.m30237composeContentZbOJvo$runtime_release(mutableScatterMapM30242takeInvalidationsafanTW4, interfaceC9544p, this.shouldPause);
                    if (compositionObserverObserver != null) {
                        compositionObserverObserver.onEndComposition(this);
                        C10786q c10786q = C10786q.f26013a;
                    }
                } catch (Exception e10) {
                    this.invalidations = mutableScatterMapM30242takeInvalidationsafanTW4;
                    throw e10;
                } finally {
                }
            }
        } finally {
        }
    }

    public final int composerStacksSizes$runtime_release() {
        return this.composer.stacksSize$runtime_release();
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void deactivate() {
        synchronized (this.lock) {
            try {
                boolean z10 = this.slotTable.getGroupsSize() > 0;
                if (z10 || !this.abandonSet.isEmpty()) {
                    Trace trace = Trace.INSTANCE;
                    Object objBeginSection = trace.beginSection("Compose:deactivate");
                    try {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z10) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.deactivateCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                C10786q c10786q = C10786q.f26013a;
                                slotWriterOpenWriter.close(true);
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                        C10786q c10786q2 = C10786q.f26013a;
                        trace.endSection(objBeginSection);
                    } catch (Throwable th2) {
                        Trace.INSTANCE.endSection(objBeginSection);
                        throw th2;
                    }
                }
                ScopeMap.m30403clearimpl(this.observations);
                ScopeMap.m30403clearimpl(this.derivedStates);
                ScopeMap.m30403clearimpl(this.invalidations);
                this.changes.clear();
                this.lateChanges.clear();
                this.composer.deactivate$runtime_release();
                C10786q c10786q3 = C10786q.f26013a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(ControlledComposition controlledComposition, int i10, InterfaceC9529a interfaceC9529a) {
        if (controlledComposition == null || AbstractC9979u.m20289b(controlledComposition, this) || i10 < 0) {
            return (R) interfaceC9529a.invoke();
        }
        this.invalidationDelegate = (CompositionImpl) controlledComposition;
        this.invalidationDelegateGroup = i10;
        try {
            return (R) interfaceC9529a.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.isComposing$runtime_release()) {
                    PreconditionsKt.throwIllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.disposed) {
                    this.disposed = true;
                    this.composable = ComposableSingletons$CompositionKt.INSTANCE.m30233getLambda2$runtime_release();
                    ChangeList deferredChanges$runtime_release = this.composer.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        applyChangesInLocked(deferredChanges$runtime_release);
                    }
                    boolean z10 = this.slotTable.getGroupsSize() > 0;
                    if (z10 || !this.abandonSet.isEmpty()) {
                        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
                        if (z10) {
                            this.applier.onBeginChanges();
                            SlotWriter slotWriterOpenWriter = this.slotTable.openWriter();
                            try {
                                ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
                                C10786q c10786q = C10786q.f26013a;
                                slotWriterOpenWriter.close(true);
                                this.applier.clear();
                                this.applier.onEndChanges();
                                rememberEventDispatcher.dispatchRememberObservers();
                            } catch (Throwable th) {
                                slotWriterOpenWriter.close(false);
                                throw th;
                            }
                        }
                        rememberEventDispatcher.dispatchAbandons();
                    }
                    this.composer.dispose$runtime_release();
                }
                C10786q c10786q2 = C10786q.f26013a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(MovableContentState movableContentState) {
        RememberEventDispatcher rememberEventDispatcher = new RememberEventDispatcher(this.abandonSet);
        SlotWriter slotWriterOpenWriter = movableContentState.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(slotWriterOpenWriter, rememberEventDispatcher);
            C10786q c10786q = C10786q.f26013a;
            slotWriterOpenWriter.close(true);
            rememberEventDispatcher.dispatchRememberObservers();
        } catch (Throwable th) {
            slotWriterOpenWriter.close(false);
            throw th;
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public ShouldPauseCallback getAndSetShouldPauseCallback(ShouldPauseCallback shouldPauseCallback) {
        ShouldPauseCallback shouldPauseCallback2 = this.shouldPause;
        this.shouldPause = shouldPauseCallback;
        return shouldPauseCallback2;
    }

    public final InterfaceC9544p getComposable() {
        return this.composable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionServices
    public <T> T getCompositionService(CompositionServiceKey<T> compositionServiceKey) {
        if (AbstractC9979u.m20289b(compositionServiceKey, CompositionKt.getCompositionImplServiceKey())) {
            return this;
        }
        return null;
    }

    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return AbstractC10947g0.m23922X0(this.conditionallyInvalidatedScopes.asSet());
    }

    public final Set<Object> getDerivedStateDependencies$runtime_release() {
        return this.derivedStates.asMap().keySet();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z10;
        synchronized (this.lock) {
            z10 = ScopeMap.m30410getSizeimpl(this.invalidations) > 0;
        }
        return z10;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.lock) {
            hasPendingChanges$runtime_release = this.composer.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    public final Set<Object> getObservedObjects$runtime_release() {
        return this.observations.asMap().keySet();
    }

    public final CompositionObserverHolder getObserverHolder$runtime_release() {
        return this.observerHolder;
    }

    public final CompositionContext getParent() {
        return this.parent;
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.pendingInvalidScopes;
    }

    public final InterfaceC9945d getRecomposeContext() {
        InterfaceC9945d interfaceC9945d = this._recomposeContext;
        return interfaceC9945d == null ? this.parent.getRecomposeCoroutineContext$runtime_release() : interfaceC9945d;
    }

    public final SlotTable getSlotTable$runtime_release() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(List<Pair<MovableContentStateReference, MovableContentStateReference>> list) {
        int size = list.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!AbstractC9979u.m20289b(((MovableContentStateReference) list.get(i10).m20051f()).getComposition$runtime_release(), this)) {
                break;
            } else {
                i10++;
            }
        }
        if (!z10) {
            ComposerKt.composeImmediateRuntimeError("Check failed");
        }
        try {
            this.composer.insertMovableContentReferences(list);
            C10786q c10786q = C10786q.f26013a;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public InvalidationResult invalidate(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        CompositionImpl compositionImpl;
        if (recomposeScopeImpl.getDefaultsInScope()) {
            recomposeScopeImpl.setDefaultsInvalid(true);
        }
        Anchor anchor = recomposeScopeImpl.getAnchor();
        if (anchor == null || !anchor.getValid()) {
            return InvalidationResult.IGNORED;
        }
        if (this.slotTable.ownsAnchor(anchor)) {
            return !recomposeScopeImpl.getCanRecompose() ? InvalidationResult.IGNORED : invalidateChecked(recomposeScopeImpl, anchor, obj);
        }
        synchronized (this.lock) {
            compositionImpl = this.invalidationDelegate;
        }
        return (compositionImpl == null || !compositionImpl.tryImminentInvalidation(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        synchronized (this.lock) {
            try {
                for (Object obj : this.slotTable.getSlots()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i10) {
        List<RecomposeScopeImpl> listInvalidateGroupsWithKey$runtime_release;
        synchronized (this.lock) {
            listInvalidateGroupsWithKey$runtime_release = this.slotTable.invalidateGroupsWithKey$runtime_release(i10);
        }
        if (listInvalidateGroupsWithKey$runtime_release != null) {
            int size = listInvalidateGroupsWithKey$runtime_release.size();
            for (int i11 = 0; i11 < size; i11++) {
                if (listInvalidateGroupsWithKey$runtime_release.get(i11).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.composer.forceRecomposeScopes$runtime_release()) {
            this.parent.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.composer.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.disposed;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final CompositionObserverHandle observe$runtime_release(final CompositionObserver compositionObserver) {
        synchronized (this.lock) {
            this.observerHolder.setObserver(compositionObserver);
            this.observerHolder.setRoot(true);
            C10786q c10786q = C10786q.f26013a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.CompositionImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.lock;
                CompositionImpl compositionImpl = this.this$0;
                CompositionObserver compositionObserver2 = compositionObserver;
                synchronized (obj) {
                    try {
                        if (AbstractC9979u.m20289b(compositionImpl.getObserverHolder$runtime_release().getObserver(), compositionObserver2)) {
                            compositionImpl.getObserverHolder$runtime_release().setObserver(null);
                            compositionImpl.getObserverHolder$runtime_release().setRoot(false);
                        }
                        C10786q c10786q2 = C10786q.f26013a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return true;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean observesAnyOf(java.util.Set<? extends java.lang.Object> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof androidx.compose.runtime.collection.ScatterSetWrapper
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L5c
            androidx.compose.runtime.collection.ScatterSetWrapper r15 = (androidx.compose.runtime.collection.ScatterSetWrapper) r15
            androidx.collection.ScatterSet r15 = r15.getSet$runtime_release()
            java.lang.Object[] r0 = r15.elements
            long[] r15 = r15.metadata
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L7d
            r4 = r1
        L16:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r1
        L30:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.observations
            boolean r11 = androidx.compose.runtime.collection.ScopeMap.m30406containsimpl(r11, r10)
            if (r11 != 0) goto L50
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r11 = r14.derivedStates
            boolean r10 = androidx.compose.runtime.collection.ScopeMap.m30406containsimpl(r11, r10)
            if (r10 == 0) goto L51
        L50:
            return r2
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L30
        L55:
            if (r7 != r8) goto L7d
        L57:
            if (r4 == r3) goto L7d
            int r4 = r4 + 1
            goto L16
        L5c:
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L62:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r15.next()
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.observations
            boolean r3 = androidx.compose.runtime.collection.ScopeMap.m30406containsimpl(r3, r0)
            if (r3 != 0) goto L7c
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r3 = r14.derivedStates
            boolean r0 = androidx.compose.runtime.collection.ScopeMap.m30406containsimpl(r3, r0)
            if (r0 == 0) goto L62
        L7c:
            return r2
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    public final void pausedCompositionFinished$runtime_release() {
        this.pendingPausedComposition = null;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(InterfaceC9529a interfaceC9529a) {
        this.composer.prepareCompose$runtime_release(interfaceC9529a);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean zM30238recomposeaFTiNEg$runtime_release;
        synchronized (this.lock) {
            try {
                drainPendingModificationsForCompositionLocked();
                try {
                    MutableScatterMap<Object, Object> mutableScatterMapM30242takeInvalidationsafanTW4 = m30242takeInvalidationsafanTW4();
                    try {
                        CompositionObserver compositionObserverObserver = observer();
                        if (compositionObserverObserver != null) {
                            Map<RecomposeScope, ? extends Set<? extends Object>> mapM30401asMapimpl = ScopeMap.m30401asMapimpl(mutableScatterMapM30242takeInvalidationsafanTW4);
                            AbstractC9979u.m20292e(mapM30401asMapimpl, "null cannot be cast to non-null type kotlin.collections.Map<androidx.compose.runtime.RecomposeScope, kotlin.collections.Set<kotlin.Any>>");
                            compositionObserverObserver.onBeginComposition(this, mapM30401asMapimpl);
                        }
                        zM30238recomposeaFTiNEg$runtime_release = this.composer.m30238recomposeaFTiNEg$runtime_release(mutableScatterMapM30242takeInvalidationsafanTW4, this.shouldPause);
                        if (!zM30238recomposeaFTiNEg$runtime_release) {
                            drainPendingModificationsLocked();
                        }
                        if (compositionObserverObserver != null) {
                            compositionObserverObserver.onEndComposition(this);
                        }
                    } catch (Exception e10) {
                        this.invalidations = mutableScatterMapM30242takeInvalidationsafanTW4;
                        throw e10;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zM30238recomposeaFTiNEg$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(RecomposeScopeImpl recomposeScopeImpl) {
        this.pendingInvalidScopes = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(Set<? extends Object> set) {
        Object obj;
        Set<? extends Object> setM23998M;
        do {
            obj = this.pendingModifications.get();
            if (obj == null ? true : AbstractC9979u.m20289b(obj, CompositionKt.PendingApplyNoModifications)) {
                setM23998M = set;
            } else if (obj instanceof Set) {
                setM23998M = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                setM23998M = AbstractC10964p.m23998M((Set[]) obj, set);
            }
        } while (!AbstractC0979q.m884a(this.pendingModifications, obj, setM23998M));
        if (obj == null) {
            synchronized (this.lock) {
                drainPendingModificationsLocked();
                C10786q c10786q = C10786q.f26013a;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(Object obj) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        int i10;
        int i11;
        int i12;
        if (getAreChildrenComposing() || (currentRecomposeScope$runtime_release = this.composer.getCurrentRecomposeScope$runtime_release()) == null) {
            return;
        }
        int i13 = 1;
        currentRecomposeScope$runtime_release.setUsed(true);
        if (currentRecomposeScope$runtime_release.recordRead(obj)) {
            return;
        }
        if (obj instanceof StateObjectImpl) {
            ((StateObjectImpl) obj).m30444recordReadInh_f27i8$runtime_release(ReaderKind.m30427constructorimpl(1));
        }
        ScopeMap.m30399addimpl(this.observations, obj, currentRecomposeScope$runtime_release);
        if (obj instanceof DerivedState) {
            DerivedState<?> derivedState = (DerivedState) obj;
            DerivedState.Record<?> currentRecord = derivedState.getCurrentRecord();
            ScopeMap.m30413removeScopeimpl(this.derivedStates, obj);
            ObjectIntMap<StateObject> dependencies = currentRecord.getDependencies();
            Object[] objArr = dependencies.keys;
            long[] jArr = dependencies.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i14 = 0;
                while (true) {
                    long j10 = jArr[i14];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i15 = 8;
                        int i16 = 8 - ((~(i14 - length)) >>> 31);
                        int i17 = 0;
                        while (i17 < i16) {
                            if ((j10 & 255) < 128) {
                                i11 = i13;
                                StateObject stateObject = (StateObject) objArr[(i14 << 3) + i17];
                                if (stateObject instanceof StateObjectImpl) {
                                    i12 = i15;
                                    ((StateObjectImpl) stateObject).m30444recordReadInh_f27i8$runtime_release(ReaderKind.m30427constructorimpl(i11));
                                } else {
                                    i12 = i15;
                                }
                                ScopeMap.m30399addimpl(this.derivedStates, stateObject, obj);
                            } else {
                                i11 = i13;
                                i12 = i15;
                            }
                            j10 >>= i12;
                            i17++;
                            i13 = i11;
                            i15 = i12;
                        }
                        i10 = i13;
                        if (i16 != i15) {
                            break;
                        }
                    } else {
                        i10 = i13;
                    }
                    if (i14 == length) {
                        break;
                    }
                    i14++;
                    i13 = i10;
                }
            }
            currentRecomposeScope$runtime_release.recordDerivedStateValue(derivedState, currentRecord.getCurrentValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void recordWriteOf(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.lock
            monitor-enter(r0)
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r1 = r14.derivedStates     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r15 = r1.get(r15)     // Catch: java.lang.Throwable -> L4f
            if (r15 == 0) goto L61
            boolean r1 = r15 instanceof androidx.collection.MutableScatterSet     // Catch: java.lang.Throwable -> L4f
            if (r1 == 0) goto L5c
            androidx.collection.MutableScatterSet r15 = (androidx.collection.MutableScatterSet) r15     // Catch: java.lang.Throwable -> L4f
            java.lang.Object[] r1 = r15.elements     // Catch: java.lang.Throwable -> L4f
            long[] r15 = r15.metadata     // Catch: java.lang.Throwable -> L4f
            int r2 = r15.length     // Catch: java.lang.Throwable -> L4f
            int r2 = r2 + (-2)
            if (r2 < 0) goto L61
            r3 = 0
            r4 = r3
        L1f:
            r5 = r15[r4]     // Catch: java.lang.Throwable -> L4f
            long r7 = ~r5     // Catch: java.lang.Throwable -> L4f
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L57
            int r7 = r4 - r2
            int r7 = ~r7     // Catch: java.lang.Throwable -> L4f
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L39:
            if (r9 >= r7) goto L55
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L51
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]     // Catch: java.lang.Throwable -> L4f
            androidx.compose.runtime.DerivedState r10 = (androidx.compose.runtime.DerivedState) r10     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r10)     // Catch: java.lang.Throwable -> L4f
            goto L51
        L4f:
            r15 = move-exception
            goto L65
        L51:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L39
        L55:
            if (r7 != r8) goto L61
        L57:
            if (r4 == r2) goto L61
            int r4 = r4 + 1
            goto L1f
        L5c:
            androidx.compose.runtime.DerivedState r15 = (androidx.compose.runtime.DerivedState) r15     // Catch: java.lang.Throwable -> L4f
            r14.invalidateScopeOfLocked(r15)     // Catch: java.lang.Throwable -> L4f
        L61:
            qc.q r15 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r0)
            return
        L65:
            monitor-exit(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.recordWriteOf(java.lang.Object):void");
    }

    public final void removeDerivedStateObservation$runtime_release(DerivedState<?> derivedState) {
        if (ScopeMap.m30406containsimpl(this.observations, derivedState)) {
            return;
        }
        ScopeMap.m30413removeScopeimpl(this.derivedStates, derivedState);
    }

    public final void removeObservation$runtime_release(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        ScopeMap.m30412removeimpl(this.observations, obj, recomposeScopeImpl);
    }

    public final void setComposable(InterfaceC9544p interfaceC9544p) {
        this.composable = interfaceC9544p;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(InterfaceC9544p interfaceC9544p) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        composeInitial(interfaceC9544p);
    }

    @Override // androidx.compose.runtime.ReusableComposition
    public void setContentWithReuse(InterfaceC9544p interfaceC9544p) {
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        this.composer.startReuseFromRoot();
        composeInitial(interfaceC9544p);
        this.composer.endReuseFromRoot();
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContent(InterfaceC9544p interfaceC9544p) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, interfaceC9544p, false, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    @Override // androidx.compose.runtime.PausableComposition
    public PausedComposition setPausableContentWithReuse(InterfaceC9544p interfaceC9544p) {
        if (this.disposed) {
            PreconditionsKt.throwIllegalStateException("The composition is disposed");
        }
        if (!(this.pendingPausedComposition == null)) {
            PreconditionsKt.throwIllegalStateException("A pausable composition is in progress");
        }
        PausedCompositionImpl pausedCompositionImpl = new PausedCompositionImpl(this, this.parent, this.composer, this.abandonSet, interfaceC9544p, true, this.applier, this.lock);
        this.pendingPausedComposition = pausedCompositionImpl;
        return pausedCompositionImpl;
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z10) {
        this.pendingInvalidScopes = z10;
    }

    public final void updateMovingInvalidations$runtime_release() {
        synchronized (this.lock) {
            drainPendingModificationsOutOfBandLocked();
            MutableScatterMap<Object, Object> mutableScatterMapM30242takeInvalidationsafanTW4 = m30242takeInvalidationsafanTW4();
            try {
                this.composer.m30239updateComposerInvalidationsRY85e9Y(mutableScatterMapM30242takeInvalidationsafanTW4);
                C10786q c10786q = C10786q.f26013a;
            } catch (Exception e10) {
                this.invalidations = mutableScatterMapM30242takeInvalidationsafanTW4;
                throw e10;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.lock) {
            try {
                if (!isComposing()) {
                    this.composer.verifyConsistent$runtime_release();
                    this.slotTable.verifyWellFormed();
                    validateRecomposeScopeAnchors(this.slotTable);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0176 A[EDGE_INSN: B:70:0x0176->B:219:0x0113 BREAK  A[LOOP:13: B:60:0x0144->B:71:0x0178]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void addPendingInvalidationsLocked(java.util.Set<? extends java.lang.Object> r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.addPendingInvalidationsLocked(java.util.Set, boolean):void");
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, InterfaceC9945d interfaceC9945d, int i10, AbstractC9972n abstractC9972n) {
        this(compositionContext, applier, (i10 & 4) != 0 ? null : interfaceC9945d);
    }
}
