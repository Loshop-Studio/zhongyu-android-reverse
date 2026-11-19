package androidx.compose.runtime;

import androidx.collection.MutableObjectList;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ObjectList;
import androidx.collection.ObjectListKt;
import androidx.collection.ScatterMapKt;
import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MultiValueMap;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Utils_androidKt;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.CompositionRegistrationObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC9924b;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9977s;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.AbstractC10771b;
import p309qc.AbstractC10776g;
import p309qc.C10786q;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10978w;
import p379vd.AbstractC11596e;
import p379vd.AbstractC11613v;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11603l;
import p379vd.InterfaceC11612u;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.AbstractC11831f;
import p409xc.InterfaceC11829d;
import p425yc.InterfaceC11943a;
import sd.AbstractC11099c1;
import sd.AbstractC11109f;
import sd.AbstractC11147o1;
import sd.InterfaceC11122i0;
import sd.InterfaceC11125j;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final InterfaceC11603l _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final InterfaceC9945d effectCoroutineContext;
    private final InterfaceC11168v effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final List<MovableContentStateReference> movableContentAwaitingInsert;
    private final MutableScatterMap<Object, Object> movableContentNestedExtractionsPending;
    private final NestedContentMap movableContentNestedStatesAvailable;
    private final MutableScatterMap<Object, Object> movableContentRemoved;
    private final MutableScatterMap<MovableContentStateReference, MovableContentState> movableContentStatesAvailable;
    private final SnapshotThreadLocal<MutableScatterSet<RecomposeScopeImpl>> pausedScopes;
    private final RecomposerInfoImpl recomposerInfo;
    private MutableObjectList<CompositionRegistrationObserver> registrationObservers;
    private InterfaceC10045g runnerJob;
    private MutableScatterSet<Object> snapshotInvalidations;
    private final Object stateLock;
    private InterfaceC11125j workContinuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC11603l _runningRecomposers = AbstractC11613v.m25602a(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add((PersistentSet) recomposerInfoImpl);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.mo20870e(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl recomposerInfoImpl) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove((PersistentSet) recomposerInfoImpl);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.mo20870e(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        public final Set<RecomposerInfo> currentRunningRecomposers$runtime_release() {
            return (Set) Recomposer._runningRecomposers.getValue();
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final InterfaceC11612u getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int i10) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(i10);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object obj) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            AbstractC9979u.m20292e(obj, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) obj;
            List list2 = list;
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                ((HotReloadable) list.get(i10)).resetContent();
            }
            int size2 = list2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                ((HotReloadable) list.get(i11)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                AbstractC10937b0.m23857B(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean z10) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(z10));
        }

        private Companion() {
        }
    }

    public static final class HotReloadable {
        private InterfaceC9544p composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.isRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m30234getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.isRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    public static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Throwable cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z10, Throwable th) {
            this.recoverable = z10;
            this.cause = th;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Throwable getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public InterfaceC11594c getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int i10) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i11 = 0; i11 < size; i11++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i11);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((CompositionImpl) arrayList.get(i12)).invalidateGroupsWithKey(i10);
            }
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i10 = 0; i10 < size; i10++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i10);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i11));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ShutDown = new State("ShutDown", 0);
        public static final State ShuttingDown = new State("ShuttingDown", 1);
        public static final State Inactive = new State("Inactive", 2);
        public static final State InactivePendingWork = new State("InactivePendingWork", 3);
        public static final State Idle = new State("Idle", 4);
        public static final State PendingWork = new State("PendingWork", 5);

        private static final /* synthetic */ State[] $values() {
            return new State[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = AbstractC9953a.m20230a(stateArr$values);
        }

        private State(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$awaitIdle$2", m26211f = "Recomposer.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2 */
    public static final class C25632 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ Object L$0;
        int label;

        public C25632(InterfaceC11588c<? super C25632> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C25632 c25632 = new C25632(interfaceC11588c);
            c25632.L$0 = obj;
            return c25632;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(State state, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C25632) create(state, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$join$2", m26211f = "Recomposer.kt", m26212l = {}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$join$2 */
    public static final class C25642 extends SuspendLambda implements InterfaceC9544p {
        /* synthetic */ Object L$0;
        int label;

        public C25642(InterfaceC11588c<? super C25642> interfaceC11588c) {
            super(2, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C25642 c25642 = new C25642(interfaceC11588c);
            c25642.L$0 = obj;
            return c25642;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(State state, InterfaceC11588c<? super Boolean> interfaceC11588c) {
            return ((C25642) create(state, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            return AbstractC11826a.m26206a(((State) this.L$0) == State.ShutDown);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", m26211f = "Recomposer.kt", m26212l = {1072}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2 */
    public static final class C25662 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ InterfaceC9545q $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", m26211f = "Recomposer.kt", m26212l = {1072}, m26213m = "invokeSuspend")
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ InterfaceC9545q $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(InterfaceC9545q interfaceC9545q, MonotonicFrameClock monotonicFrameClock, InterfaceC11588c<? super AnonymousClass3> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$block = interfaceC9545q;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, interfaceC11588c);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objM25952f = AbstractC11725a.m25952f();
                int i10 = this.label;
                if (i10 == 0) {
                    AbstractC9924b.m20071b(obj);
                    InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                    InterfaceC9545q interfaceC9545q = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (interfaceC9545q.invoke(interfaceC11122i0, monotonicFrameClock, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC9924b.m20071b(obj);
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25662(InterfaceC9545q interfaceC9545q, MonotonicFrameClock monotonicFrameClock, InterfaceC11588c<? super C25662> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$block = interfaceC9545q;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C25662 c25662 = Recomposer.this.new C25662(this.$block, this.$parentFrameClock, interfaceC11588c);
            c25662.L$0 = obj;
            return c25662;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x009c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 233
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C25662.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C25662) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer", m26211f = "Recomposer.kt", m26212l = {942, 949}, m26213m = "runFrameLoop")
    /* renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1 */
    public static final class C25671 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C25671(InterfaceC11588c<? super C25671> interfaceC11588c) {
            super(interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", m26211f = "Recomposer.kt", m26212l = {580, 591}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2 */
    public static final class C25692 extends SuspendLambda implements InterfaceC9545q {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        public C25692(InterfaceC11588c<? super C25692> interfaceC11588c) {
            super(3, interfaceC11588c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0100  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.ControlledComposition> r23, java.util.List<androidx.compose.runtime.MovableContentStateReference> r24, java.util.List<androidx.compose.runtime.ControlledComposition> r25, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r26, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r27, androidx.collection.MutableScatterSet<java.lang.Object> r28, androidx.collection.MutableScatterSet<androidx.compose.runtime.ControlledComposition> r29) {
            /*
                Method dump skipped, instructions count: 270
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C25692.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet, androidx.collection.MutableScatterSet):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.add((MovableContentStateReference) list2.get(i10));
                    }
                    recomposer.movableContentAwaitingInsert.clear();
                    C10786q c10786q = C10786q.f26013a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0118  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010f -> B:12:0x00ac). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C25692.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, MonotonicFrameClock monotonicFrameClock, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C25692 c25692 = Recomposer.this.new C25692(interfaceC11588c);
            c25692.L$0 = monotonicFrameClock;
            return c25692.invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", m26211f = "Recomposer.kt", m26212l = {911, 931, 932}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 */
    public static final class C25702 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ InterfaceC9945d $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25702(InterfaceC9945d interfaceC9945d, Recomposer recomposer, InterfaceC11588c<? super C25702> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$recomposeCoroutineContext = interfaceC9945d;
            this.this$0 = recomposer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00bc, code lost:
        
            if (r10.awaitWorkAvailable(r18) == r0) goto L83;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x01b0, code lost:
        
            if (sd.AbstractC11147o1.m24773g(r2, r18) != r0) goto L84;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0191  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bc -> B:25:0x00c0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C25702.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, MonotonicFrameClock monotonicFrameClock, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            C25702 c25702 = new C25702(this.$recomposeCoroutineContext, this.this$0, interfaceC11588c);
            c25702.L$0 = interfaceC11122i0;
            c25702.L$1 = monotonicFrameClock;
            return c25702.invokeSuspend(C10786q.f26013a);
        }
    }

    public Recomposer(InterfaceC9945d interfaceC9945d) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new InterfaceC9529a() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
            {
                super(0);
            }

            @Override // p181hd.InterfaceC9529a
            public /* bridge */ /* synthetic */ Object invoke() {
                m30272invoke();
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30272invoke() {
                InterfaceC11125j interfaceC11125jDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    interfaceC11125jDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw AbstractC11099c1.m24692a("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (interfaceC11125jDeriveStateLocked != null) {
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new MutableScatterSet<>(0, 1, null);
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = MultiValueMap.m30384constructorimpl$default(null, 1, null);
        this.movableContentNestedStatesAvailable = new NestedContentMap();
        this.movableContentStatesAvailable = ScatterMapKt.mutableScatterMapOf();
        this.movableContentNestedExtractionsPending = MultiValueMap.m30384constructorimpl$default(null, 1, null);
        this._state = AbstractC11613v.m25602a(State.Inactive);
        this.pausedScopes = new SnapshotThreadLocal<>();
        InterfaceC11168v interfaceC11168vM24767a = AbstractC11147o1.m24767a((InterfaceC10045g) interfaceC9945d.get(InterfaceC10045g.f23976b0));
        interfaceC11168vM24767a.mo20404A(new InterfaceC9540l() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return C10786q.f26013a;
            }

            public final void invoke(final Throwable th) {
                InterfaceC11125j interfaceC11125j;
                InterfaceC11125j interfaceC11125j2;
                CancellationException cancellationExceptionM24692a = AbstractC11099c1.m24692a("Recomposer effect job completed", th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        InterfaceC10045g interfaceC10045g = recomposer.runnerJob;
                        interfaceC11125j = null;
                        if (interfaceC10045g != null) {
                            recomposer._state.setValue(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    interfaceC11125j2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                interfaceC10045g.mo20404A(new InterfaceC9540l() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // p181hd.InterfaceC9540l
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        invoke((Throwable) obj2);
                                        return C10786q.f26013a;
                                    }

                                    public final void invoke(Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        AbstractC10771b.m22973a(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            recomposer2._state.setValue(Recomposer.State.ShutDown);
                                            C10786q c10786q = C10786q.f26013a;
                                        }
                                    }
                                });
                                interfaceC11125j = interfaceC11125j2;
                            } else {
                                interfaceC10045g.cancel(cancellationExceptionM24692a);
                            }
                            interfaceC11125j2 = null;
                            recomposer.workContinuation = null;
                            interfaceC10045g.mo20404A(new InterfaceC9540l() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // p181hd.InterfaceC9540l
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    invoke((Throwable) obj2);
                                    return C10786q.f26013a;
                                }

                                public final void invoke(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    AbstractC10771b.m22973a(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        C10786q c10786q = C10786q.f26013a;
                                    }
                                }
                            });
                            interfaceC11125j = interfaceC11125j2;
                        } else {
                            recomposer.closeCause = cancellationExceptionM24692a;
                            recomposer._state.setValue(Recomposer.State.ShutDown);
                            C10786q c10786q = C10786q.f26013a;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (interfaceC11125j != null) {
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11125j.resumeWith(Result.m20054c(C10786q.f26013a));
                }
            }
        });
        this.effectJob = interfaceC11168vM24767a;
        this.effectCoroutineContext = interfaceC9945d.plus(broadcastFrameClock).plus(interfaceC11168vM24767a);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition controlledComposition) {
        this._knownCompositions.add(controlledComposition);
        this._knownCompositionsCache = null;
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i10 = mutableObjectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                ((CompositionRegistrationObserver) objArr[i11]).onCompositionRegistered(this, controlledComposition);
            }
        }
    }

    private final void applyAndCheck(MutableSnapshot mutableSnapshot) {
        try {
            if (mutableSnapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            mutableSnapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        C9997c c9997c;
        if (getHasSchedulingWork()) {
            return C10786q.f26013a;
        }
        C9997c c9997c2 = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c2.m20503F();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                c9997c = c9997c2;
            } else {
                this.workContinuation = c9997c2;
                c9997c = null;
            }
        }
        if (c9997c != null) {
            Result.C9921a c9921a = Result.f23263d;
            c9997c.resumeWith(Result.m20054c(C10786q.f26013a));
        }
        Object objM20538x = c9997c2.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x == AbstractC11725a.m25952f() ? objM20538x : C10786q.f26013a;
    }

    private final void clearKnownCompositionsLocked() {
        MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
        if (mutableObjectList != null) {
            Object[] objArr = mutableObjectList.content;
            int i10 = mutableObjectList._size;
            for (int i11 = 0; i11 < i10; i11++) {
                CompositionRegistrationObserver compositionRegistrationObserver = (CompositionRegistrationObserver) objArr[i11];
                Iterator<T> it = getKnownCompositions().iterator();
                while (it.hasNext()) {
                    compositionRegistrationObserver.onCompositionUnregistered(this, (ControlledComposition) it.next());
                }
            }
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = AbstractC10978w.m24136n();
    }

    private final <T> T composing(ControlledComposition controlledComposition, MutableScatterSet<Object> mutableScatterSet, InterfaceC9529a interfaceC9529a) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return (T) interfaceC9529a.invoke();
            } finally {
                AbstractC9977s.m20286b(1);
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                AbstractC9977s.m20285a(1);
            }
        } finally {
            AbstractC9977s.m20286b(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            AbstractC9977s.m20285a(1);
        }
    }

    private static final void deletedMovableContent$lambda$73$recordNestedStatesOf(Recomposer recomposer, MovableContentStateReference movableContentStateReference, MovableContentStateReference movableContentStateReference2) {
        List<MovableContentStateReference> nestedReferences$runtime_release = movableContentStateReference2.getNestedReferences$runtime_release();
        if (nestedReferences$runtime_release != null) {
            int size = nestedReferences$runtime_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                MovableContentStateReference movableContentStateReference3 = nestedReferences$runtime_release.get(i10);
                recomposer.movableContentNestedStatesAvailable.add(movableContentStateReference3.getContent$runtime_release(), new NestedMovableContent(movableContentStateReference3, movableContentStateReference));
                deletedMovableContent$lambda$73$recordNestedStatesOf(recomposer, movableContentStateReference, movableContentStateReference3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC11125j deriveStateLocked() {
        State state;
        int i10 = 0;
        int i11 = 1;
        AbstractC9972n abstractC9972n = null;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new MutableScatterSet<>(i10, i11, abstractC9972n);
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            InterfaceC11125j interfaceC11125j = this.workContinuation;
            if (interfaceC11125j != null) {
                InterfaceC11125j.a.m24737a(interfaceC11125j, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new MutableScatterSet<>(i10, i11, abstractC9972n);
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.isNotEmpty() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !getHasBroadcastFrameClockAwaitersLocked()) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        InterfaceC11125j interfaceC11125j2 = this.workContinuation;
        this.workContinuation = null;
        return interfaceC11125j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedMovableContentState() {
        int i10;
        ObjectList objectListEmptyObjectList;
        synchronized (this.stateLock) {
            try {
                if (MultiValueMap.m30392isNotEmptyimpl(this.movableContentRemoved)) {
                    ObjectList objectListM30397valuesimpl = MultiValueMap.m30397valuesimpl(this.movableContentRemoved);
                    MultiValueMap.m30382clearimpl(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.clear();
                    MultiValueMap.m30382clearimpl(this.movableContentNestedExtractionsPending);
                    MutableObjectList mutableObjectList = new MutableObjectList(objectListM30397valuesimpl.getSize());
                    Object[] objArr = objectListM30397valuesimpl.content;
                    int i11 = objectListM30397valuesimpl._size;
                    for (int i12 = 0; i12 < i11; i12++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) objArr[i12];
                        mutableObjectList.add(AbstractC10776g.m22975a(movableContentStateReference, this.movableContentStatesAvailable.get(movableContentStateReference)));
                    }
                    this.movableContentStatesAvailable.clear();
                    objectListEmptyObjectList = mutableObjectList;
                } else {
                    objectListEmptyObjectList = ObjectListKt.emptyObjectList();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListEmptyObjectList.content;
        int i13 = objectListEmptyObjectList._size;
        for (i10 = 0; i10 < i13; i10++) {
            Pair pair = (Pair) objArr2[i10];
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.m20048a();
            MovableContentState movableContentState = (MovableContentState) pair.m20049c();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition$runtime_release().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.getSize() != 0 || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            androidx.collection.MutableScatterSet<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L1f
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L14
            goto L1f
        L14:
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            goto L1f
        L1b:
            r1 = 0
            goto L20
        L1d:
            r1 = move-exception
            goto L22
        L1f:
            r1 = 1
        L20:
            monitor-exit(r0)
            return r1
        L22:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            List listM24136n = list3.isEmpty() ? AbstractC10978w.m24136n() : new ArrayList(list3);
            this._knownCompositionsCache = listM24136n;
            list2 = listM24136n;
        }
        return list2;
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getRegistrationObservers$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z10;
        synchronized (this.stateLock) {
            z10 = this.isClosed;
        }
        if (!z10) {
            return true;
        }
        Iterator it = this.effectJob.mo20436f().iterator();
        while (it.hasNext()) {
            if (((InterfaceC10045g) it.next()).isActive()) {
                return true;
            }
        }
        return false;
    }

    @InterfaceC10770a
    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC9979u.m20289b(list.get(i10).getComposition$runtime_release(), controlledComposition)) {
                    C10786q c10786q = C10786q.f26013a;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, controlledComposition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (AbstractC9979u.m20289b(next.getComposition$runtime_release(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0146, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014b, code lost:
    
        if (r4 >= r3) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0157, code lost:
    
        if (((kotlin.Pair) r10.get(r4)).m20052g() == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0159, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x016c, code lost:
    
        r11 = (kotlin.Pair) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0176, code lost:
    
        if (r11.m20052g() != null) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0178, code lost:
    
        r11 = (androidx.compose.runtime.MovableContentStateReference) r11.m20051f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0182, code lost:
    
        if (r11 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0184, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0187, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x018a, code lost:
    
        r4 = r16.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018c, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018d, code lost:
    
        p325rc.AbstractC10937b0.m23857B(r16.movableContentAwaitingInsert, r3);
        r3 = p309qc.C10786q.f26013a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0196, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0197, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01a5, code lost:
    
        if (r9 >= r4) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01a7, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01b2, code lost:
    
        if (((kotlin.Pair) r11).m20052g() == null) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b4, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b7, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ba, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r17, androidx.collection.MutableScatterSet<java.lang.Object> r18) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, androidx.collection.MutableScatterSet):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        Set<ControlledComposition> set;
        if (controlledComposition.isComposing() || controlledComposition.isDisposed() || ((set = this.compositionsRemoved) != null && set.contains(controlledComposition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.Companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, mutableScatterSet));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (mutableScatterSet != null) {
                try {
                    if (mutableScatterSet.isNotEmpty()) {
                        controlledComposition.prepareCompose(new InterfaceC9529a() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // p181hd.InterfaceC9529a
                            public /* bridge */ /* synthetic */ Object invoke() {
                                m30273invoke();
                                return C10786q.f26013a;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m30273invoke() {
                                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                                ControlledComposition controlledComposition2 = controlledComposition;
                                Object[] objArr = mutableScatterSet2.elements;
                                long[] jArr = mutableScatterSet2.metadata;
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
                                                controlledComposition2.recordWriteOf(objArr[(i10 << 3) + i12]);
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
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = controlledComposition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return controlledComposition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private final void processCompositionError(Throwable th, ControlledComposition controlledComposition, boolean z10) throws Throwable {
        int i10 = 0;
        if (!_hotReloadEnabled.get().booleanValue() || (th instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, th);
                C10786q c10786q = C10786q.f26013a;
            }
            throw th;
        }
        synchronized (this.stateLock) {
            try {
                Utils_androidKt.logError("Error was captured in composition while live edit was enabled.", th);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new MutableScatterSet<>(i10, 1, null);
                this.movableContentAwaitingInsert.clear();
                MultiValueMap.m30382clearimpl(this.movableContentRemoved);
                this.movableContentStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(z10, th);
                if (controlledComposition != null) {
                    recordFailedCompositionLocked(controlledComposition);
                }
                deriveStateLocked();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Throwable th, ControlledComposition controlledComposition, boolean z10, int i10, Object obj) throws Throwable {
        if ((i10 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        recomposer.processCompositionError(th, controlledComposition, z10);
    }

    private final InterfaceC9540l readObserverOf(final ControlledComposition controlledComposition) {
        return new InterfaceC9540l() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30274invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30274invoke(Object obj) {
                controlledComposition.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(InterfaceC9545q interfaceC9545q, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM24709g = AbstractC11109f.m24709g(this.broadcastFrameClock, new C25662(interfaceC9545q, MonotonicFrameClockKt.getMonotonicFrameClock(interfaceC11588c.getContext()), null), interfaceC11588c);
        return objM24709g == AbstractC11725a.m25952f() ? objM24709g : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.isEmpty()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            AbstractC9972n abstractC9972n = null;
            int i10 = 1;
            int i11 = 0;
            this.snapshotInvalidations = new MutableScatterSet<>(i11, i10, abstractC9972n);
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i12 = 0; i12 < size; i12++) {
                    knownCompositions.get(i12).recordModificationsOf(setWrapIntoSet);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new MutableScatterSet<>(i11, i10, abstractC9972n);
                    C10786q c10786q = C10786q.f26013a;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.addAll(setWrapIntoSet);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition controlledComposition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(controlledComposition)) {
            arrayList.add(controlledComposition);
        }
        removeKnownCompositionLocked(controlledComposition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(InterfaceC10045g interfaceC10045g) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = interfaceC10045g;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition controlledComposition) {
        if (this._knownCompositions.remove(controlledComposition)) {
            this._knownCompositionsCache = null;
            MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
            if (mutableObjectList != null) {
                Object[] objArr = mutableObjectList.content;
                int i10 = mutableObjectList._size;
                for (int i11 = 0; i11 < i10; i11++) {
                    ((CompositionRegistrationObserver) objArr[i11]).onCompositionUnregistered(this, controlledComposition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i10;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i10 = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) AbstractC10937b0.m23870O(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            int size = list.size();
                            while (i10 < size) {
                                recordFailedCompositionLocked(list.get(i10));
                                i10++;
                            }
                            C10786q c10786q = C10786q.f26013a;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            try {
                int size2 = list.size();
                while (i10 < size2) {
                    recordFailedCompositionLocked(list.get(i10));
                    i10++;
                }
                C10786q c10786q2 = C10786q.f26013a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r5.withFrameNanos(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, vc.InterfaceC11588c<? super p309qc.C10786q> r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer.C25671
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.C25671) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.AbstractC9924b.m20071b(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.AbstractC9924b.m20071b(r10)
            goto L8d
        L65:
            kotlin.AbstractC9924b.m20071b(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            goto La4
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, vc.c):java.lang.Object");
    }

    private final InterfaceC9540l writeObserverOf(final ControlledComposition controlledComposition, final MutableScatterSet<Object> mutableScatterSet) {
        return new InterfaceC9540l() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m30275invoke(obj);
                return C10786q.f26013a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m30275invoke(Object obj) {
                controlledComposition.recordWriteOf(obj);
                MutableScatterSet<Object> mutableScatterSet2 = mutableScatterSet;
                if (mutableScatterSet2 != null) {
                    mutableScatterSet2.add(obj);
                }
            }
        };
    }

    @ExperimentalComposeRuntimeApi
    public final CompositionObserverHandle addCompositionRegistrationObserver$runtime_release(final CompositionRegistrationObserver compositionRegistrationObserver) {
        synchronized (this.stateLock) {
            try {
                MutableObjectList<CompositionRegistrationObserver> mutableObjectList = this.registrationObservers;
                int i10 = 0;
                if (mutableObjectList == null) {
                    mutableObjectList = new MutableObjectList<>(i10, 1, null);
                    this.registrationObservers = mutableObjectList;
                }
                mutableObjectList.add(compositionRegistrationObserver);
                List<ControlledComposition> list = this._knownCompositions;
                int size = list.size();
                while (i10 < size) {
                    compositionRegistrationObserver.onCompositionRegistered(this, list.get(i10));
                    i10++;
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.Recomposer$addCompositionRegistrationObserver$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                CompositionRegistrationObserver compositionRegistrationObserver2 = compositionRegistrationObserver;
                synchronized (obj) {
                    MutableObjectList mutableObjectList2 = recomposer.registrationObservers;
                    if (mutableObjectList2 != null) {
                        mutableObjectList2.remove(compositionRegistrationObserver2);
                    }
                }
            }
        };
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM25558h = AbstractC11596e.m25558h(AbstractC11596e.m25548S(getCurrentState(), new C25632(null)), interfaceC11588c);
        return objM25558h == AbstractC11725a.m25952f() ? objM25558h : C10786q.f26013a;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        InterfaceC10045g.a.m20900a(this.effectJob, null, 1, null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                C10786q c10786q = C10786q.f26013a;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public void composeInitial$runtime_release(ControlledComposition controlledComposition, InterfaceC9544p interfaceC9544p) throws Throwable {
        Throwable th;
        boolean zIsComposing = controlledComposition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.Companion;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(controlledComposition), writeObserverOf(controlledComposition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    controlledComposition.composeContent(interfaceC9544p);
                    C10786q c10786q = C10786q.f26013a;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!getKnownCompositions().contains(controlledComposition)) {
                                        addKnownCompositionLocked(controlledComposition);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(controlledComposition);
                                try {
                                    controlledComposition.applyChanges();
                                    controlledComposition.applyLateChanges();
                                    if (zIsComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Throwable th3) {
                                    processCompositionError$default(this, th3, null, false, 6, null);
                                }
                            } catch (Throwable th4) {
                                processCompositionError(th4, controlledComposition, true);
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } catch (Throwable th6) {
                    try {
                        mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th6;
                    } catch (Throwable th7) {
                        th = th7;
                        Throwable th8 = th;
                        try {
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            throw th8;
                        } catch (Throwable th9) {
                            th = th9;
                            processCompositionError(th, controlledComposition, true);
                        }
                    }
                }
            } catch (Throwable th10) {
                th = th10;
            }
        } catch (Throwable th11) {
            th = th11;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    @ComposableInferredTarget(scheme = "[0[0]]")
    public ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, InterfaceC9544p interfaceC9544p) {
        try {
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                composeInitial$runtime_release(controlledComposition, interfaceC9544p);
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        synchronized (this.stateLock) {
            try {
                MultiValueMap.m30380addimpl(this.movableContentRemoved, movableContentStateReference.getContent$runtime_release(), movableContentStateReference);
                if (movableContentStateReference.getNestedReferences$runtime_release() != null) {
                    deletedMovableContent$lambda$73$recordNestedStatesOf(this, movableContentStateReference, movableContentStateReference);
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public Composition getComposition$runtime_release() {
        return null;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    public final InterfaceC11612u getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public InterfaceC9945d getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            androidx.collection.MutableScatterSet<java.lang.Object> r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2d
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L2b
            int r1 = r1.getSize()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L14
            goto L2d
        L14:
            int r1 = r2.concurrentCompositionsOutstanding     // Catch: java.lang.Throwable -> L2b
            if (r1 > 0) goto L2d
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionsAwaitingApply     // Catch: java.lang.Throwable -> L2b
            java.util.Collection r1 = (java.util.Collection) r1     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L2d
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L2b
            if (r1 == 0) goto L29
            goto L2d
        L29:
            r1 = 0
            goto L2e
        L2b:
            r1 = move-exception
            goto L30
        L2d:
            r1 = 1
        L2e:
            monitor-exit(r0)
            return r1
        L30:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasPendingWork():boolean");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public InterfaceC9945d getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.f23351c;
    }

    public final InterfaceC11594c getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference) {
        InterfaceC11125j interfaceC11125jDeriveStateLocked;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(movableContentStateReference);
            interfaceC11125jDeriveStateLocked = deriveStateLocked();
        }
        if (interfaceC11125jDeriveStateLocked != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition controlledComposition) {
        InterfaceC11125j interfaceC11125jDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(controlledComposition)) {
                interfaceC11125jDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(controlledComposition);
                interfaceC11125jDeriveStateLocked = deriveStateLocked();
            }
        }
        if (interfaceC11125jDeriveStateLocked != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
        InterfaceC11125j interfaceC11125jDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.add(recomposeScopeImpl);
            interfaceC11125jDeriveStateLocked = deriveStateLocked();
        }
        if (interfaceC11125jDeriveStateLocked != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    public final Object join(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objM25573w = AbstractC11596e.m25573w(getCurrentState(), new C25642(null), interfaceC11588c);
        return objM25573w == AbstractC11725a.m25952f() ? objM25573w : C10786q.f26013a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    @Override // androidx.compose.runtime.CompositionContext
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void movableContentStateReleased$runtime_release(androidx.compose.runtime.MovableContentStateReference r18, androidx.compose.runtime.MovableContentState r19, androidx.compose.runtime.Applier<?> r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.Object r3 = r1.stateLock
            monitor-enter(r3)
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r4 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r4.set(r0, r2)     // Catch: java.lang.Throwable -> L63
            androidx.collection.MutableScatterMap<java.lang.Object, java.lang.Object> r4 = r1.movableContentNestedExtractionsPending     // Catch: java.lang.Throwable -> L63
            androidx.collection.ObjectList r0 = androidx.compose.runtime.collection.MultiValueMap.m30389getimpl(r4, r0)     // Catch: java.lang.Throwable -> L63
            boolean r4 = r0.isNotEmpty()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L70
            r4 = r20
            androidx.collection.ScatterMap r0 = r2.extractNestedStates$runtime_release(r4, r0)     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r2 = r0.keys     // Catch: java.lang.Throwable -> L63
            java.lang.Object[] r4 = r0.values     // Catch: java.lang.Throwable -> L63
            long[] r0 = r0.metadata     // Catch: java.lang.Throwable -> L63
            int r5 = r0.length     // Catch: java.lang.Throwable -> L63
            int r5 = r5 + (-2)
            if (r5 < 0) goto L70
            r6 = 0
            r7 = r6
        L2d:
            r8 = r0[r7]     // Catch: java.lang.Throwable -> L63
            long r10 = ~r8     // Catch: java.lang.Throwable -> L63
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L6b
            int r10 = r7 - r5
            int r10 = ~r10     // Catch: java.lang.Throwable -> L63
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L47:
            if (r12 >= r10) goto L69
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L65
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]     // Catch: java.lang.Throwable -> L63
            r13 = r4[r13]     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.MovableContentState r13 = (androidx.compose.runtime.MovableContentState) r13     // Catch: java.lang.Throwable -> L63
            androidx.compose.runtime.MovableContentStateReference r14 = (androidx.compose.runtime.MovableContentStateReference) r14     // Catch: java.lang.Throwable -> L63
            androidx.collection.MutableScatterMap<androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState> r15 = r1.movableContentStatesAvailable     // Catch: java.lang.Throwable -> L63
            r15.set(r14, r13)     // Catch: java.lang.Throwable -> L63
            goto L65
        L63:
            r0 = move-exception
            goto L74
        L65:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L47
        L69:
            if (r10 != r11) goto L70
        L6b:
            if (r7 == r5) goto L70
            int r7 = r7 + 1
            goto L2d
        L70:
            qc.q r0 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L63
            monitor-exit(r3)
            return
        L74:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.movableContentStateReleased$runtime_release(androidx.compose.runtime.MovableContentStateReference, androidx.compose.runtime.MovableContentState, androidx.compose.runtime.Applier):void");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.movableContentStatesAvailable.remove(movableContentStateReference);
        }
        return movableContentStateRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            C10786q c10786q = C10786q.f26013a;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(ControlledComposition controlledComposition, ShouldPauseCallback shouldPauseCallback, ScatterSet<RecomposeScopeImpl> scatterSet) {
        try {
            recordComposerModifications();
            controlledComposition.recordModificationsOf(ScatterSetWrapperKt.wrapIntoSet(scatterSet));
            ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
            try {
                ControlledComposition controlledCompositionPerformRecompose = performRecompose(controlledComposition, null);
                if (controlledCompositionPerformRecompose != null) {
                    performInitialMovableContentInserts(controlledComposition);
                    controlledCompositionPerformRecompose.applyChanges();
                    controlledCompositionPerformRecompose.applyLateChanges();
                }
                ScatterSet<RecomposeScopeImpl> scatterSetEmptyScatterSet = (MutableScatterSet) this.pausedScopes.get();
                if (scatterSetEmptyScatterSet == null) {
                    scatterSetEmptyScatterSet = ScatterSetKt.emptyScatterSet();
                }
                return scatterSetEmptyScatterSet;
            } finally {
                controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            }
        } finally {
            this.pausedScopes.set(null);
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition controlledComposition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportPausedScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl) {
        MutableScatterSet<RecomposeScopeImpl> mutableScatterSetMutableScatterSetOf = this.pausedScopes.get();
        if (mutableScatterSetMutableScatterSetOf == null) {
            mutableScatterSetMutableScatterSetOf = ScatterSetKt.mutableScatterSetOf();
            this.pausedScopes.set(mutableScatterSetMutableScatterSetOf);
        }
        mutableScatterSetMutableScatterSetOf.add(recomposeScopeImpl);
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(controlledComposition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        InterfaceC11125j interfaceC11125jDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                interfaceC11125jDeriveStateLocked = deriveStateLocked();
            } else {
                interfaceC11125jDeriveStateLocked = null;
            }
        }
        if (interfaceC11125jDeriveStateLocked != null) {
            Result.C9921a c9921a = Result.f23263d;
            interfaceC11125jDeriveStateLocked.resumeWith(Result.m20054c(C10786q.f26013a));
        }
    }

    public final Object runRecomposeAndApplyChanges(InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objRecompositionRunner = recompositionRunner(new C25692(null), interfaceC11588c);
        return objRecompositionRunner == AbstractC11725a.m25952f() ? objRecompositionRunner : C10786q.f26013a;
    }

    @ExperimentalComposeApi
    public final Object runRecomposeConcurrentlyAndApplyChanges(InterfaceC9945d interfaceC9945d, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objRecompositionRunner = recompositionRunner(new C25702(interfaceC9945d, this, null), interfaceC11588c);
        return objRecompositionRunner == AbstractC11725a.m25952f() ? objRecompositionRunner : C10786q.f26013a;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition controlledComposition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(controlledComposition);
            this.compositionInvalidations.remove(controlledComposition);
            this.compositionsAwaitingApply.remove(controlledComposition);
            C10786q c10786q = C10786q.f26013a;
        }
    }

    private final void recordComposerModifications(InterfaceC9540l interfaceC9540l) {
        MutableScatterSet mutableScatterSet;
        int i10;
        synchronized (this.stateLock) {
            int i11 = 1;
            try {
                mutableScatterSet = this.snapshotInvalidations;
                i10 = 0;
                if (mutableScatterSet.isNotEmpty()) {
                    this.snapshotInvalidations = new MutableScatterSet(i10, i11, null);
                }
                AbstractC9977s.m20286b(1);
            } catch (Throwable th) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th;
            }
        }
        AbstractC9977s.m20285a(1);
        Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(mutableScatterSet);
        if (!setWrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i12 = 0; i12 < size; i12++) {
                ((ControlledComposition) knownCompositions.get(i12)).recordModificationsOf(setWrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        Object[] objArr = mutableVector.content;
        int size2 = mutableVector.getSize();
        while (i10 < size2) {
            interfaceC9540l.invoke(objArr[i10]);
            i10++;
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            try {
                if (deriveStateLocked() == null) {
                    C10786q c10786q = C10786q.f26013a;
                    AbstractC9977s.m20286b(1);
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th2) {
                AbstractC9977s.m20286b(1);
                AbstractC9977s.m20285a(1);
                throw th2;
            }
        }
        AbstractC9977s.m20285a(1);
    }
}
