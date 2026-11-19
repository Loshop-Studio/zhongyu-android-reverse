package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.InterfaceC10045g;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.AbstractC10001b;
import kotlinx.coroutines.channels.InterfaceC10000a;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p181hd.InterfaceC9545q;
import p309qc.C10786q;
import p325rc.AbstractC10947g0;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import sd.InterfaceC11168v;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingState<Key, Value> cachedInitialState;
    private final PagingConfig config;
    private final HintHandler hintHandler;
    private final Key initialKey;
    private final int initialLoadSize;
    private final InterfaceC9529a jumpCallback;
    private final InterfaceC10000a pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final InterfaceC11168v pageEventChannelFlowJob;
    private final InterfaceC11594c pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final InterfaceC11594c retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", m26211f = "PageFetcherSnapshot.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3 */
    public static final class C42483 extends SuspendLambda implements InterfaceC9545q {
        final /* synthetic */ LoadType $loadType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42483(LoadType loadType, InterfaceC11588c<? super C42483> interfaceC11588c) {
            super(3, interfaceC11588c);
            this.$loadType = loadType;
        }

        @Override // p181hd.InterfaceC9545q
        public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, InterfaceC11588c<? super GenerationalViewportHint> interfaceC11588c) {
            C42483 c42483 = new C42483(this.$loadType, interfaceC11588c);
            c42483.L$0 = generationalViewportHint;
            c42483.L$1 = generationalViewportHint2;
            return c42483.invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
            return PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.$loadType) ? generationalViewportHint2 : generationalViewportHint;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot", m26211f = "PageFetcherSnapshot.kt", m26212l = {694}, m26213m = "currentPagingState", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$currentPagingState$1 */
    public static final class C42501 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42501(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42501> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.currentPagingState(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, 302, 308, 716, 738, 335, 760, 782, 363}, m26213m = "doInitialLoad", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$doInitialLoad$1 */
    public static final class C42511 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42511(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42511> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doInitialLoad(this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot", m26211f = "PageFetcherSnapshot.kt", m26212l = {695, TypedValues.TransitionType.TYPE_TRANSITION_FLAGS, TypedValues.CycleType.TYPE_WAVE_OFFSET, 433, 729, 771, 486, 793, TypedValues.PositionType.TYPE_POSITION_TYPE, 536, 805}, m26213m = "doLoad", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$doLoad$1 */
    public static final class C42521 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42521(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42521> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doLoad(null, null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot", m26211f = "PageFetcherSnapshot.kt", m26212l = {694}, m26213m = "forceSetHint", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$forceSetHint$1 */
    public static final class C42531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42531(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42531> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.forceSetHint(null, this);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", m26211f = "PageFetcherSnapshot.kt", m26212l = {233}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1 */
    public static final class C42571 extends SuspendLambda implements InterfaceC9544p {
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42571(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42571> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42571(this.this$0, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11594c interfaceC11594cM25538I = AbstractC11596e.m25538I(((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.APPEND), ((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.PREPEND));
                PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, null);
                this.label = 1;
                obj = AbstractC11596e.m25575y(interfaceC11594cM25538I, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            ViewportHint viewportHint = (ViewportHint) obj;
            if (viewportHint != null) {
                PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.this$0;
                PagingLogger pagingLogger = PagingLogger.INSTANCE;
                if (pagingLogger.isLoggable(3)) {
                    pagingLogger.log(3, "Jump triggered on PagingSource " + pageFetcherSnapshot.getPagingSource$paging_common() + " by " + viewportHint, null);
                }
                ((PageFetcherSnapshot) this.this$0).jumpCallback.invoke();
            }
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42571) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, 248}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$2 */
    public static final class C42582 extends SuspendLambda implements InterfaceC9544p {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42582(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42582> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42582(this.this$0, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.collectAsGenerationalViewportHints(r7, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9924b.m20071b(r7)
                goto L64
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.L$2
                androidx.paging.PageFetcherSnapshot r1 = (androidx.paging.PageFetcherSnapshot) r1
                java.lang.Object r3 = r6.L$1
                be.a r3 = (be.InterfaceC5189a) r3
                java.lang.Object r5 = r6.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
                kotlin.AbstractC9924b.m20071b(r7)
                goto L48
            L2b:
                kotlin.AbstractC9924b.m20071b(r7)
                androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r6.this$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r1)
                be.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
                r6.L$0 = r5
                r6.L$1 = r7
                r6.L$2 = r1
                r6.label = r3
                java.lang.Object r3 = r7.lock(r4, r6)
                if (r3 != r0) goto L47
                goto L63
            L47:
                r3 = r7
            L48:
                androidx.paging.PageFetcherSnapshotState r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5)     // Catch: java.lang.Throwable -> L67
                vd.c r7 = r7.consumePrependGenerationIdAsFlow()     // Catch: java.lang.Throwable -> L67
                r3.unlock(r4)
                androidx.paging.LoadType r3 = androidx.paging.LoadType.PREPEND
                r6.L$0 = r4
                r6.L$1 = r4
                r6.L$2 = r4
                r6.label = r2
                java.lang.Object r7 = androidx.paging.PageFetcherSnapshot.access$collectAsGenerationalViewportHints(r1, r7, r3, r6)
                if (r7 != r0) goto L64
            L63:
                return r0
            L64:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            L67:
                r7 = move-exception
                r3.unlock(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.C42582.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42582) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", m26211f = "PageFetcherSnapshot.kt", m26212l = {694, 254}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$3 */
    public static final class C42593 extends SuspendLambda implements InterfaceC9544p {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42593(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC11588c<? super C42593> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42593(this.this$0, interfaceC11588c);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
        
            if (r1.collectAsGenerationalViewportHints(r7, r3, r6) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = p393wc.AbstractC11725a.m25952f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9924b.m20071b(r7)
                goto L64
            L13:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1b:
                java.lang.Object r1 = r6.L$2
                androidx.paging.PageFetcherSnapshot r1 = (androidx.paging.PageFetcherSnapshot) r1
                java.lang.Object r3 = r6.L$1
                be.a r3 = (be.InterfaceC5189a) r3
                java.lang.Object r5 = r6.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
                kotlin.AbstractC9924b.m20071b(r7)
                goto L48
            L2b:
                kotlin.AbstractC9924b.m20071b(r7)
                androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r6.this$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r1)
                be.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
                r6.L$0 = r5
                r6.L$1 = r7
                r6.L$2 = r1
                r6.label = r3
                java.lang.Object r3 = r7.lock(r4, r6)
                if (r3 != r0) goto L47
                goto L63
            L47:
                r3 = r7
            L48:
                androidx.paging.PageFetcherSnapshotState r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r5)     // Catch: java.lang.Throwable -> L67
                vd.c r7 = r7.consumeAppendGenerationIdAsFlow()     // Catch: java.lang.Throwable -> L67
                r3.unlock(r4)
                androidx.paging.LoadType r3 = androidx.paging.LoadType.APPEND
                r6.L$0 = r4
                r6.L$1 = r4
                r6.L$2 = r4
                r6.label = r2
                java.lang.Object r7 = androidx.paging.PageFetcherSnapshot.access$collectAsGenerationalViewportHints(r1, r7, r3, r6)
                if (r7 != r0) goto L64
            L63:
                return r0
            L64:
                qc.q r7 = p309qc.C10786q.f26013a
                return r7
            L67:
                r7 = move-exception
                r3.unlock(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.C42593.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42593) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource, PagingConfig config, InterfaceC11594c retryFlow, int i10, RemoteMediatorConnection<Key, Value> remoteMediatorConnection, PagingState<Key, Value> pagingState, InterfaceC9529a jumpCallback) {
        AbstractC9979u.m20294g(pagingSource, "pagingSource");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(retryFlow, "retryFlow");
        AbstractC9979u.m20294g(jumpCallback, "jumpCallback");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.initialLoadSize = i10;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.cachedInitialState = pagingState;
        this.jumpCallback = jumpCallback;
        if (config.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.hintHandler = new HintHandler();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = AbstractC10001b.m20722b(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        InterfaceC11168v interfaceC11168vM20385b = JobKt__JobKt.m20385b(null, 1, null);
        this.pageEventChannelFlowJob = interfaceC11168vM20385b;
        this.pageEventFlow = AbstractC11596e.m25541L(CancelableChannelFlowKt.cancelableChannelFlow(interfaceC11168vM20385b, new PageFetcherSnapshot$pageEventFlow$1(this, null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(InterfaceC11594c interfaceC11594c, final LoadType loadType, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        Object objCollect = AbstractC11596e.m25561k(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(interfaceC11594c, new C4246xe29ec4fd(null, this, loadType)), new C42483(loadType, null))).collect(new InterfaceC11595d(this) { // from class: androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.4
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            {
                this.this$0 = this;
            }

            public final Object emit(GenerationalViewportHint generationalViewportHint, InterfaceC11588c<? super C10786q> interfaceC11588c2) throws Throwable {
                Object objDoLoad = this.this$0.doLoad(loadType, generationalViewportHint, interfaceC11588c2);
                return objDoLoad == AbstractC11725a.m25952f() ? objDoLoad : C10786q.f26013a;
            }

            @Override // p379vd.InterfaceC11595d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC11588c interfaceC11588c2) {
                return emit((GenerationalViewportHint) obj, (InterfaceC11588c<? super C10786q>) interfaceC11588c2);
            }
        }, interfaceC11588c);
        return objCollect == AbstractC11725a.m25952f() ? objCollect : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d7 A[Catch: all -> 0x009b, PHI: r2
      0x00d7: PHI (r2v9 ??) = (r2v53 ??), (r2v54 ??) binds: [B:38:0x00d3, B:28:0x0097] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {all -> 0x009b, blocks: (B:28:0x0097, B:40:0x00d7, B:37:0x00c3), top: B:138:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011a A[PHI: r14
      0x011a: PHI (r14v11 java.lang.Object) = (r14v10 java.lang.Object), (r14v1 java.lang.Object) binds: [B:45:0x0116, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015e A[Catch: all -> 0x016c, TryCatch #3 {all -> 0x016c, blocks: (B:53:0x0138, B:55:0x015e, B:58:0x016f, B:60:0x0178), top: B:141:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178 A[Catch: all -> 0x016c, TRY_LEAVE, TryCatch #3 {all -> 0x016c, blocks: (B:53:0x0138, B:55:0x015e, B:58:0x016f, B:60:0x0178), top: B:141:0x0138 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0243  */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.paging.PageFetcherSnapshot, androidx.paging.PageFetcherSnapshot<Key, Value>] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [be.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [be.a] */
    /* JADX WARN: Type inference failed for: r2v38, types: [be.a] */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v9, types: [be.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInitialLoad(vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doInitialLoad(vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05cc, code lost:
    
        if (r2.lock(null, r3) != r4) goto L251;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:175:0x0586, B:178:0x0591], limit reached: 250 */
    /* JADX WARN: Path cross not found for [B:181:0x0596, B:184:0x05a0], limit reached: 250 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d2 A[Catch: all -> 0x050a, TRY_LEAVE, TryCatch #6 {all -> 0x050a, blocks: (B:149:0x04c4, B:151:0x04d2), top: B:257:0x04c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0528 A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:155:0x0501, B:159:0x0511, B:161:0x0528, B:163:0x0534, B:165:0x053c, B:167:0x0549, B:166:0x0543, B:168:0x054c, B:172:0x057c, B:14:0x0080, B:19:0x00b2), top: B:255:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x053c A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:155:0x0501, B:159:0x0511, B:161:0x0528, B:163:0x0534, B:165:0x053c, B:167:0x0549, B:166:0x0543, B:168:0x054c, B:172:0x057c, B:14:0x0080, B:19:0x00b2), top: B:255:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0543 A[Catch: all -> 0x008a, TryCatch #5 {all -> 0x008a, blocks: (B:155:0x0501, B:159:0x0511, B:161:0x0528, B:163:0x0534, B:165:0x053c, B:167:0x0549, B:166:0x0543, B:168:0x054c, B:172:0x057c, B:14:0x0080, B:19:0x00b2), top: B:255:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0663  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x06ab A[Catch: all -> 0x0224, TRY_ENTER, TryCatch #1 {all -> 0x0224, blocks: (B:42:0x01f3, B:48:0x0207, B:50:0x0217, B:53:0x0228, B:55:0x0232, B:57:0x024b, B:68:0x02a6, B:58:0x024e, B:59:0x0253, B:60:0x0254, B:62:0x026c, B:65:0x028a, B:67:0x02a3, B:240:0x06ab, B:241:0x06b0), top: B:248:0x01f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02f2 A[Catch: all -> 0x0314, TRY_LEAVE, TryCatch #2 {all -> 0x0314, blocks: (B:73:0x02d9, B:75:0x02f2), top: B:249:0x02d9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x038c  */
    /* JADX WARN: Type inference failed for: r0v65, types: [androidx.paging.PageFetcherSnapshotState] */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.paging.PageFetcherSnapshot, androidx.paging.PageFetcherSnapshot<Key, Value>] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [be.a] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:186:0x05a3 -> B:198:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:188:0x05a7 -> B:198:0x05f4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x05cc -> B:251:0x05d0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doLoad(androidx.paging.LoadType r18, androidx.paging.GenerationalViewportHint r19, vc.InterfaceC11588c<? super p309qc.C10786q> r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1752
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doLoad(androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, vc.c):java.lang.Object");
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.Companion.create(loadType, key, loadType == LoadType.REFRESH ? this.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final String loadResultLog(LoadType loadType, Key key, PagingSource.LoadResult<Key, Value> loadResult) {
        if (loadResult == null) {
            return "End " + loadType + " with loadkey " + key + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + key + ". Returned " + loadResult;
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i10, int i11) {
        if (i10 == pageFetcherSnapshotState.generationId$paging_common(loadType) && !(pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType) instanceof LoadState.Error) && i11 < this.config.prefetchDistance) {
            return loadType == LoadType.PREPEND ? (Key) ((PagingSource.LoadResult.Page) AbstractC10947g0.m23944m0(pageFetcherSnapshotState.getPages$paging_common())).getPrevKey() : (Key) ((PagingSource.LoadResult.Page) AbstractC10947g0.m23956y0(pageFetcherSnapshotState.getPages$paging_common())).getNextKey();
        }
        return null;
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, InterfaceC11588c<? super C10786q> interfaceC11588c) throws Throwable {
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object objDoInitialLoad = doInitialLoad(interfaceC11588c);
            return objDoInitialLoad == AbstractC11725a.m25952f() ? objDoInitialLoad : C10786q.f26013a;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.hintHandler.forceSetHint(loadType, viewportHint);
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        if (AbstractC9979u.m20289b(pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType), error)) {
            return C10786q.f26013a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common().set(loadType, error);
        Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common().snapshot(), null), interfaceC11588c);
        return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        LoadState loadState = pageFetcherSnapshotState.getSourceLoadStates$paging_common().get(loadType);
        LoadState.Loading loading = LoadState.Loading.INSTANCE;
        if (AbstractC9979u.m20289b(loadState, loading)) {
            return C10786q.f26013a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common().set(loadType, loading);
        Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common().snapshot(), null), interfaceC11588c);
        return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(InterfaceC11122i0 interfaceC11122i0) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C42571(this, null), 3, null);
        }
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C42582(this, null), 3, null);
        AbstractC11117h.m24726d(interfaceC11122i0, null, null, new C42593(this, null), 3, null);
    }

    public final void close() {
        InterfaceC10045g.a.m20900a(this.pageEventChannelFlowJob, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object currentPagingState(vc.InterfaceC11588c<? super androidx.paging.PagingState<Key, Value>> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot.C42501
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot.C42501) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = new androidx.paging.PageFetcherSnapshot$currentPagingState$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            be.a r1 = (be.InterfaceC5189a) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshotState$Holder r0 = (androidx.paging.PageFetcherSnapshotState.Holder) r0
            kotlin.AbstractC9924b.m20071b(r6)
            goto L52
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.AbstractC9924b.m20071b(r6)
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r6 = r5.stateHolder
            be.a r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r6)
            r0.L$0 = r6
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r0 = r2.lock(r4, r0)
            if (r0 != r1) goto L50
            return r1
        L50:
            r0 = r6
            r1 = r2
        L52:
            androidx.paging.PageFetcherSnapshotState r6 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r0)     // Catch: java.lang.Throwable -> L64
            androidx.paging.HintHandler r0 = r5.hintHandler     // Catch: java.lang.Throwable -> L64
            androidx.paging.ViewportHint$Access r0 = r0.getLastAccessHint()     // Catch: java.lang.Throwable -> L64
            androidx.paging.PagingState r6 = r6.currentPagingState$paging_common(r0)     // Catch: java.lang.Throwable -> L64
            r1.unlock(r4)
            return r6
        L64:
            r6 = move-exception
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.currentPagingState(vc.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object forceSetHint(androidx.paging.LoadType r13, vc.InterfaceC11588c<? super p309qc.C10786q> r14) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof androidx.paging.PageFetcherSnapshot.C42531
            if (r0 == 0) goto L13
            r0 = r14
            androidx.paging.PageFetcherSnapshot$forceSetHint$1 r0 = (androidx.paging.PageFetcherSnapshot.C42531) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$forceSetHint$1 r0 = new androidx.paging.PageFetcherSnapshot$forceSetHint$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r13 = r0.L$2
            be.a r13 = (be.InterfaceC5189a) r13
            java.lang.Object r1 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState.Holder) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.LoadType r0 = (androidx.paging.LoadType) r0
            kotlin.AbstractC9924b.m20071b(r14)
            r2 = r13
            r13 = r0
            goto L5d
        L38:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L40:
            kotlin.AbstractC9924b.m20071b(r14)
            androidx.paging.LoadType r14 = androidx.paging.LoadType.REFRESH
            if (r13 == r14) goto Lbf
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r14 = r12.stateHolder
            be.a r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r14)
            r0.L$0 = r13
            r0.L$1 = r14
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r0 = r2.lock(r4, r0)
            if (r0 != r1) goto L5c
            return r1
        L5c:
            r1 = r14
        L5d:
            androidx.paging.PageFetcherSnapshotState r14 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r1)     // Catch: java.lang.Throwable -> L9b
            int r0 = r14.getInitialPageIndex$paging_common()     // Catch: java.lang.Throwable -> L9b
            int r6 = -r0
            java.util.List r0 = r14.getPages$paging_common()     // Catch: java.lang.Throwable -> L9b
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L9b
            int r1 = r14.getInitialPageIndex$paging_common()     // Catch: java.lang.Throwable -> L9b
            int r0 = r0 - r1
            int r11 = r0 + (-1)
            androidx.paging.LoadType r0 = androidx.paging.LoadType.APPEND     // Catch: java.lang.Throwable -> L9b
            if (r13 != r0) goto L9e
            androidx.paging.ViewportHint$Access r5 = new androidx.paging.ViewportHint$Access     // Catch: java.lang.Throwable -> L9b
            java.util.List r0 = r14.getPages$paging_common()     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r0 = p325rc.AbstractC10947g0.m23956y0(r0)     // Catch: java.lang.Throwable -> L9b
            androidx.paging.PagingSource$LoadResult$Page r0 = (androidx.paging.PagingSource.LoadResult.Page) r0     // Catch: java.lang.Throwable -> L9b
            java.util.List r0 = r0.getData()     // Catch: java.lang.Throwable -> L9b
            int r7 = p325rc.AbstractC10978w.m24138p(r0)     // Catch: java.lang.Throwable -> L9b
            int r14 = r14.getStorageCount$paging_common()     // Catch: java.lang.Throwable -> L9b
            int r8 = r14 + (-1)
            r9 = 0
            r0 = r11
            r10 = r6
            r6 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9b
            goto Lae
        L9b:
            r0 = move-exception
            r13 = r0
            goto Lbb
        L9e:
            r0 = r11
            androidx.paging.ViewportHint$Access r5 = new androidx.paging.ViewportHint$Access     // Catch: java.lang.Throwable -> L9b
            int r14 = r14.getStorageCount$paging_common()     // Catch: java.lang.Throwable -> L9b
            int r9 = r14 + (-1)
            r7 = 0
            r8 = 0
            r10 = r6
            r11 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9b
        Lae:
            androidx.paging.HintHandler r14 = r12.hintHandler     // Catch: java.lang.Throwable -> L9b
            r14.forceSetHint(r13, r5)     // Catch: java.lang.Throwable -> L9b
            qc.q r13 = p309qc.C10786q.f26013a     // Catch: java.lang.Throwable -> L9b
            r2.unlock(r4)
            qc.q r13 = p309qc.C10786q.f26013a
            return r13
        Lbb:
            r2.unlock(r4)
            throw r13
        Lbf:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Called for REFRESH but this should only be called for either APPEND or PREPEND loads. This error indicates a bug in the Paging library. Please file a bug report in Buganizer."
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.forceSetHint(androidx.paging.LoadType, vc.c):java.lang.Object");
    }

    public final Key getInitialKey$paging_common() {
        return this.initialKey;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLoadKey$paging_common(androidx.paging.PagingSource.LoadResult.Page<Key, Value> r6, vc.InterfaceC11588c<? super Key> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.paging.PageFetcherSnapshot$getLoadKey$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.paging.PageFetcherSnapshot$getLoadKey$1 r0 = (androidx.paging.PageFetcherSnapshot$getLoadKey$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcherSnapshot$getLoadKey$1 r0 = new androidx.paging.PageFetcherSnapshot$getLoadKey$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.L$2
            be.a r6 = (be.InterfaceC5189a) r6
            java.lang.Object r1 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r1 = (androidx.paging.PageFetcherSnapshotState.Holder) r1
            java.lang.Object r0 = r0.L$0
            androidx.paging.PagingSource$LoadResult$Page r0 = (androidx.paging.PagingSource.LoadResult.Page) r0
            kotlin.AbstractC9924b.m20071b(r7)
            r2 = r6
            r6 = r0
            goto L59
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.AbstractC9924b.m20071b(r7)
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r7 = r5.stateHolder
            be.a r2 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r0 = r2.lock(r4, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r1 = r7
        L59:
            androidx.paging.PageFetcherSnapshotState r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r1)     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r7.getLoadKey(r6)     // Catch: java.lang.Throwable -> L65
            r2.unlock(r4)
            return r6
        L65:
            r6 = move-exception
            r2.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.getLoadKey$paging_common(androidx.paging.PagingSource$LoadResult$Page, vc.c):java.lang.Object");
    }

    public final InterfaceC11594c getPageEventFlow() {
        return this.pageEventFlow;
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public final void processHint(ViewportHint viewportHint) {
        AbstractC9979u.m20294g(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, InterfaceC11594c interfaceC11594c, int i10, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, InterfaceC9529a interfaceC9529a, int i11, AbstractC9972n abstractC9972n) {
        this(obj, pagingSource, pagingConfig, interfaceC11594c, (i11 & 16) != 0 ? pagingConfig.initialLoadSize : i10, (i11 & 32) != 0 ? null : remoteMediatorConnection, (i11 & 64) != 0 ? null : pagingState, (i11 & 128) != 0 ? new InterfaceC9529a() { // from class: androidx.paging.e0
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return C10786q.f26013a;
            }
        } : interfaceC9529a);
    }
}
