package androidx.paging;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.paging.LoadState;
import androidx.paging.PageEvent;
import androidx.paging.PageFetcherSnapshotState;
import androidx.paging.PagingSource;
import com.tencent.smtt.sdk.TbsListener;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.InterfaceC9212n;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.AbstractC9159b;
import kotlinx.coroutines.channels.InterfaceC9158a;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p135i8.InterfaceC8878u;
import p169l8.AbstractC9268e;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;
import p300x7.InterfaceC10575q;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot<Key, Value> {
    private final PagingConfig config;
    private final HintHandler hintHandler;
    private final Key initialKey;
    private final InterfaceC10559a jumpCallback;
    private final InterfaceC9158a pageEventCh;
    private final AtomicBoolean pageEventChCollected;
    private final InterfaceC8878u pageEventChannelFlowJob;
    private final InterfaceC9266c pageEventFlow;
    private final PagingSource<Key, Value> pagingSource;
    private final PagingState<Key, Value> previousPagingState;
    private final RemoteMediatorConnection<Key, Value> remoteMediatorConnection;
    private final InterfaceC9266c retryFlow;
    private final PageFetcherSnapshotState.Holder<Key, Value> stateHolder;

    public /* synthetic */ class WhenMappings {
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

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3", m17801f = "PageFetcherSnapshot.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$collectAsGenerationalViewportHints$3 */
    public static final class C43303 extends SuspendLambda implements InterfaceC10575q {
        final /* synthetic */ LoadType $loadType;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43303(LoadType loadType, InterfaceC9324c<? super C43303> interfaceC9324c) {
            super(3, interfaceC9324c);
            this.$loadType = loadType;
        }

        @Override // p300x7.InterfaceC10575q
        public final Object invoke(GenerationalViewportHint generationalViewportHint, GenerationalViewportHint generationalViewportHint2, InterfaceC9324c<? super GenerationalViewportHint> interfaceC9324c) {
            C43303 c43303 = new C43303(this.$loadType, interfaceC9324c);
            c43303.L$0 = generationalViewportHint;
            c43303.L$1 = generationalViewportHint2;
            return c43303.invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            GenerationalViewportHint generationalViewportHint = (GenerationalViewportHint) this.L$0;
            GenerationalViewportHint generationalViewportHint2 = (GenerationalViewportHint) this.L$1;
            return PageFetcherSnapshotKt.shouldPrioritizeOver(generationalViewportHint2, generationalViewportHint, this.$loadType) ? generationalViewportHint2 : generationalViewportHint;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot", m17801f = "PageFetcherSnapshot.kt", m17802l = {646}, m17803m = "currentPagingState")
    /* renamed from: androidx.paging.PageFetcherSnapshot$currentPagingState$1 */
    public static final class C43321 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43321(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43321> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.currentPagingState(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot", m17801f = "PageFetcherSnapshot.kt", m17802l = {646, 284, 290, 667, 688, TbsListener.ErrorCode.TEST_THROWABLE_IS_NULL, 709, 730, 354}, m17803m = "doInitialLoad")
    /* renamed from: androidx.paging.PageFetcherSnapshot$doInitialLoad$1 */
    public static final class C43331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43331(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43331> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doInitialLoad(this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot", m17801f = "PageFetcherSnapshot.kt", m17802l = {647, 658, TbsListener.ErrorCode.INFO_INITX5_FALSE_DEFAULT, TypedValues.CycleType.TYPE_WAVE_OFFSET, 679, 720, 472, 741, 495, 521, 752}, m17803m = "doLoad")
    /* renamed from: androidx.paging.PageFetcherSnapshot$doLoad$1 */
    public static final class C43341 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
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
        public C43341(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43341> interfaceC9324c) {
            super(interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.doLoad(null, null, this);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$1", m17801f = "PageFetcherSnapshot.kt", m17802l = {TbsListener.ErrorCode.COPY_INSTALL_SUCCESS}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$1 */
    public static final class C43381 extends SuspendLambda implements InterfaceC10574p {
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43381(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43381> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43381(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43381) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC9266c interfaceC9266cM16998J = AbstractC9268e.m16998J(((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.APPEND), ((PageFetcherSnapshot) this.this$0).hintHandler.hintFor(LoadType.PREPEND));
                PageFetcherSnapshot$startConsumingHints$1$jumpHint$1 pageFetcherSnapshot$startConsumingHints$1$jumpHint$1 = new PageFetcherSnapshot$startConsumingHints$1$jumpHint$1(this.this$0, null);
                this.label = 1;
                obj = AbstractC9268e.m16989A(interfaceC9266cM16998J, pageFetcherSnapshot$startConsumingHints$1$jumpHint$1, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            ViewportHint viewportHint = (ViewportHint) obj;
            if (viewportHint != null) {
                PageFetcherSnapshot<Key, Value> pageFetcherSnapshot = this.this$0;
                PagingLogger pagingLogger = PagingLogger.INSTANCE;
                if (pagingLogger.isLoggable(3)) {
                    pagingLogger.log(3, "Jump triggered on PagingSource " + pageFetcherSnapshot.getPagingSource$paging_common_release() + " by " + viewportHint, null);
                }
                ((PageFetcherSnapshot) this.this$0).jumpCallback.invoke();
            }
            return C8736p.f16368a;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", m17801f = "PageFetcherSnapshot.kt", m17802l = {646, 233}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$2 */
    public static final class C43392 extends SuspendLambda implements InterfaceC10574p {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43392(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43392> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43392(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43392) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9079b.m15926b(r7)
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
                r8.a r3 = (p235r8.InterfaceC9942a) r3
                java.lang.Object r5 = r6.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
                kotlin.AbstractC9079b.m15926b(r7)
                goto L48
            L2b:
                kotlin.AbstractC9079b.m15926b(r7)
                androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r6.this$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r1)
                r8.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
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
                l8.c r7 = r7.consumePrependGenerationIdAsFlow()     // Catch: java.lang.Throwable -> L67
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
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            L67:
                r7 = move-exception
                r3.unlock(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.C43392.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", m17801f = "PageFetcherSnapshot.kt", m17802l = {646, 238}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcherSnapshot$startConsumingHints$3 */
    public static final class C43403 extends SuspendLambda implements InterfaceC10574p {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43403(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9324c<? super C43403> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = pageFetcherSnapshot;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43403(this.this$0, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43403) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
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
                java.lang.Object r0 = p190n7.AbstractC9434a.m17291f()
                int r1 = r6.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L2b
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                kotlin.AbstractC9079b.m15926b(r7)
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
                r8.a r3 = (p235r8.InterfaceC9942a) r3
                java.lang.Object r5 = r6.L$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = (androidx.paging.PageFetcherSnapshotState.Holder) r5
                kotlin.AbstractC9079b.m15926b(r7)
                goto L48
            L2b:
                kotlin.AbstractC9079b.m15926b(r7)
                androidx.paging.PageFetcherSnapshot<Key, Value> r1 = r6.this$0
                androidx.paging.PageFetcherSnapshotState$Holder r5 = androidx.paging.PageFetcherSnapshot.access$getStateHolder$p(r1)
                r8.a r7 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r5)
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
                l8.c r7 = r7.consumeAppendGenerationIdAsFlow()     // Catch: java.lang.Throwable -> L67
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
                h7.p r7 = p123h7.C8736p.f16368a
                return r7
            L67:
                r7 = move-exception
                r3.unlock(r4)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.C43403.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public PageFetcherSnapshot(Key key, PagingSource<Key, Value> pagingSource, PagingConfig config, InterfaceC9266c retryFlow, RemoteMediatorConnection<Key, Value> remoteMediatorConnection, PagingState<Key, Value> pagingState, InterfaceC10559a jumpCallback) {
        AbstractC9133u.m16133g(pagingSource, "pagingSource");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(retryFlow, "retryFlow");
        AbstractC9133u.m16133g(jumpCallback, "jumpCallback");
        this.initialKey = key;
        this.pagingSource = pagingSource;
        this.config = config;
        this.retryFlow = retryFlow;
        this.remoteMediatorConnection = remoteMediatorConnection;
        this.previousPagingState = pagingState;
        this.jumpCallback = jumpCallback;
        if (config.jumpThreshold != Integer.MIN_VALUE && !pagingSource.getJumpingSupported()) {
            throw new IllegalArgumentException("PagingConfig.jumpThreshold was set, but the associated PagingSource has not marked support for jumps by overriding PagingSource.jumpingSupported to true.");
        }
        this.hintHandler = new HintHandler();
        this.pageEventChCollected = new AtomicBoolean(false);
        this.pageEventCh = AbstractC9159b.m16529b(-2, null, null, 6, null);
        this.stateHolder = new PageFetcherSnapshotState.Holder<>(config);
        InterfaceC8878u interfaceC8878uM16233b = JobKt__JobKt.m16233b(null, 1, null);
        this.pageEventChannelFlowJob = interfaceC8878uM16233b;
        this.pageEventFlow = AbstractC9268e.m17001M(CancelableChannelFlowKt.cancelableChannelFlow(interfaceC8878uM16233b, new PageFetcherSnapshot$pageEventFlow$1(this, null)), new PageFetcherSnapshot$pageEventFlow$2(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object collectAsGenerationalViewportHints(InterfaceC9266c interfaceC9266c, final LoadType loadType, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        Object objCollect = AbstractC9268e.m17022l(FlowExtKt.simpleRunningReduce(FlowExtKt.simpleTransformLatest(interfaceC9266c, new C4327xe29ec4fd(null, this, loadType)), new C43303(loadType, null))).collect(new InterfaceC9267d(this) { // from class: androidx.paging.PageFetcherSnapshot.collectAsGenerationalViewportHints.4
            final /* synthetic */ PageFetcherSnapshot<Key, Value> this$0;

            {
                this.this$0 = this;
            }

            @Override // p169l8.InterfaceC9267d
            public /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC9324c interfaceC9324c2) {
                return emit((GenerationalViewportHint) obj, (InterfaceC9324c<? super C8736p>) interfaceC9324c2);
            }

            public final Object emit(GenerationalViewportHint generationalViewportHint, InterfaceC9324c<? super C8736p> interfaceC9324c2) throws Throwable {
                Object objDoLoad = this.this$0.doLoad(loadType, generationalViewportHint, interfaceC9324c2);
                return objDoLoad == AbstractC9434a.m17291f() ? objDoLoad : C8736p.f16368a;
            }
        }, interfaceC9324c);
        return objCollect == AbstractC9434a.m17291f() ? objCollect : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143 A[PHI: r6 r15
      0x0143: PHI (r6v9 androidx.paging.PageFetcherSnapshot) = (r6v6 androidx.paging.PageFetcherSnapshot), (r6v11 androidx.paging.PageFetcherSnapshot) binds: [B:46:0x013f, B:26:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0143: PHI (r15v11 java.lang.Object) = (r15v10 java.lang.Object), (r15v1 java.lang.Object) binds: [B:46:0x013f, B:26:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018a A[Catch: all -> 0x0198, TryCatch #4 {all -> 0x0198, blocks: (B:54:0x0166, B:56:0x018a, B:59:0x019b, B:61:0x01a4), top: B:142:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a4 A[Catch: all -> 0x0198, TRY_LEAVE, TryCatch #4 {all -> 0x0198, blocks: (B:54:0x0166, B:56:0x018a, B:59:0x019b, B:61:0x01a4), top: B:142:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [r8.a] */
    /* JADX WARN: Type inference failed for: r2v2, types: [r8.a] */
    /* JADX WARN: Type inference failed for: r2v41, types: [r8.a] */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v9, types: [r8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInitialLoad(p179m7.InterfaceC9324c<? super p123h7.C8736p> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doInitialLoad(m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0357, code lost:
    
        r0 = r8;
        r8 = r9;
        r9 = r12;
        r12 = r14;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:209:0x0663, B:212:0x066e], limit reached: 255 */
    /* JADX WARN: Path cross not found for [B:215:0x0673, B:218:0x067d], limit reached: 255 */
    /* JADX WARN: Removed duplicated region for block: B:123:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05b4 A[Catch: all -> 0x05e7, TRY_LEAVE, TryCatch #4 {all -> 0x05e7, blocks: (B:182:0x05a6, B:184:0x05b4), top: B:257:0x05a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0604 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e0, B:193:0x05ed, B:195:0x0604, B:197:0x0610, B:199:0x0618, B:201:0x0625, B:200:0x061f, B:202:0x0628, B:206:0x0659, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0618 A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e0, B:193:0x05ed, B:195:0x0604, B:197:0x0610, B:199:0x0618, B:201:0x0625, B:200:0x061f, B:202:0x0628, B:206:0x0659, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x061f A[Catch: all -> 0x008f, TryCatch #8 {all -> 0x008f, blocks: (B:188:0x05e0, B:193:0x05ed, B:195:0x0604, B:197:0x0610, B:199:0x0618, B:201:0x0625, B:200:0x061f, B:202:0x0628, B:206:0x0659, B:14:0x0087, B:19:0x00bb), top: B:265:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06f7 A[Catch: all -> 0x0255, TRY_ENTER, TryCatch #2 {all -> 0x0255, blocks: (B:43:0x0221, B:68:0x02d4, B:50:0x0238, B:52:0x0248, B:55:0x0259, B:57:0x0263, B:59:0x027c, B:60:0x027f, B:62:0x029a, B:65:0x02b8, B:67:0x02d1, B:244:0x06f7, B:245:0x06fc), top: B:254:0x0221 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0323 A[Catch: all -> 0x0347, TRY_LEAVE, TryCatch #3 {all -> 0x0347, blocks: (B:73:0x030a, B:75:0x0323), top: B:255:0x030a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03c0  */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v40 */
    /* JADX WARN: Type inference failed for: r12v49, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v51, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v57 */
    /* JADX WARN: Type inference failed for: r12v58 */
    /* JADX WARN: Type inference failed for: r14v30, types: [androidx.paging.PageFetcherSnapshot] */
    /* JADX WARN: Type inference failed for: r14v35 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [r8.a] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v80 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v58, types: [androidx.paging.PageFetcherSnapshot, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v62 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x06ae -> B:263:0x06b5). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doLoad(androidx.paging.LoadType r20, androidx.paging.GenerationalViewportHint r21, p179m7.InterfaceC9324c<? super p123h7.C8736p> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.doLoad(androidx.paging.LoadType, androidx.paging.GenerationalViewportHint, m7.c):java.lang.Object");
    }

    private final PagingSource.LoadParams<Key> loadParams(LoadType loadType, Key key) {
        return PagingSource.LoadParams.Companion.create(loadType, key, loadType == LoadType.REFRESH ? this.config.initialLoadSize : this.config.pageSize, this.config.enablePlaceholders);
    }

    private final String loadResultLog(LoadType loadType, Key key, PagingSource.LoadResult<Key, Value> loadResult) {
        if (loadResult == null) {
            return "End " + loadType + " with loadkey " + key + ". Load CANCELLED.";
        }
        return "End " + loadType + " with loadKey " + key + ". Returned " + loadResult;
    }

    private final Key nextLoadKeyOrNull(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, int i10, int i11) {
        if (i10 == pageFetcherSnapshotState.generationId$paging_common_release(loadType) && !(pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().get(loadType) instanceof LoadState.Error) && i11 < this.config.prefetchDistance) {
            return loadType == LoadType.PREPEND ? (Key) ((PagingSource.LoadResult.Page) AbstractC8778f0.m14566l0(pageFetcherSnapshotState.getPages$paging_common_release())).getPrevKey() : (Key) ((PagingSource.LoadResult.Page) AbstractC8778f0.m14578x0(pageFetcherSnapshotState.getPages$paging_common_release())).getNextKey();
        }
        return null;
    }

    private final void onInvalidLoad() {
        close();
        this.pagingSource.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object retryLoadError(LoadType loadType, ViewportHint viewportHint, InterfaceC9324c<? super C8736p> interfaceC9324c) throws Throwable {
        if (WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()] == 1) {
            Object objDoInitialLoad = doInitialLoad(interfaceC9324c);
            return objDoInitialLoad == AbstractC9434a.m17291f() ? objDoInitialLoad : C8736p.f16368a;
        }
        if (viewportHint == null) {
            throw new IllegalStateException("Cannot retry APPEND / PREPEND load on PagingSource without ViewportHint");
        }
        this.hintHandler.forceSetHint(loadType, viewportHint);
        return C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setError(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, LoadState.Error error, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        if (AbstractC9133u.m16128b(pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().get(loadType), error)) {
            return C8736p.f16368a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().set(loadType, error);
        Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().snapshot(), null), interfaceC9324c);
        return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object setLoading(PageFetcherSnapshotState<Key, Value> pageFetcherSnapshotState, LoadType loadType, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        LoadState loadState = pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().get(loadType);
        LoadState.Loading loading = LoadState.Loading.INSTANCE;
        if (AbstractC9133u.m16128b(loadState, loading)) {
            return C8736p.f16368a;
        }
        pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().set(loadType, loading);
        Object objSend = this.pageEventCh.send(new PageEvent.LoadStateUpdate(pageFetcherSnapshotState.getSourceLoadStates$paging_common_release().snapshot(), null), interfaceC9324c);
        return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startConsumingHints(InterfaceC8822b0 interfaceC8822b0) {
        if (this.config.jumpThreshold != Integer.MIN_VALUE) {
            AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C43381(this, null), 3, null);
        }
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C43392(this, null), 3, null);
        AbstractC8839h.m14861d(interfaceC8822b0, null, null, new C43403(this, null), 3, null);
    }

    public final void accessHint(ViewportHint viewportHint) {
        AbstractC9133u.m16133g(viewportHint, "viewportHint");
        this.hintHandler.processHint(viewportHint);
    }

    public final void close() {
        InterfaceC9212n.a.m16777a(this.pageEventChannelFlowJob, null, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object currentPagingState(p179m7.InterfaceC9324c<? super androidx.paging.PagingState<Key, Value>> r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcherSnapshot.C43321
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcherSnapshot$currentPagingState$1 r0 = (androidx.paging.PageFetcherSnapshot.C43321) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r1 = r0.L$2
            r8.a r1 = (p235r8.InterfaceC9942a) r1
            java.lang.Object r2 = r0.L$1
            androidx.paging.PageFetcherSnapshotState$Holder r2 = (androidx.paging.PageFetcherSnapshotState.Holder) r2
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcherSnapshot r0 = (androidx.paging.PageFetcherSnapshot) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L58
        L36:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3e:
            kotlin.AbstractC9079b.m15926b(r6)
            androidx.paging.PageFetcherSnapshotState$Holder<Key, Value> r2 = r5.stateHolder
            r8.a r6 = androidx.paging.PageFetcherSnapshotState.Holder.access$getLock$p(r2)
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r6
            r0.label = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L56
            return r1
        L56:
            r0 = r5
            r1 = r6
        L58:
            androidx.paging.PageFetcherSnapshotState r6 = androidx.paging.PageFetcherSnapshotState.Holder.access$getState$p(r2)     // Catch: java.lang.Throwable -> L6a
            androidx.paging.HintHandler r0 = r0.hintHandler     // Catch: java.lang.Throwable -> L6a
            androidx.paging.ViewportHint$Access r0 = r0.getLastAccessHint()     // Catch: java.lang.Throwable -> L6a
            androidx.paging.PagingState r6 = r6.currentPagingState$paging_common_release(r0)     // Catch: java.lang.Throwable -> L6a
            r1.unlock(r4)
            return r6
        L6a:
            r6 = move-exception
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot.currentPagingState(m7.c):java.lang.Object");
    }

    public final Key getInitialKey$paging_common_release() {
        return this.initialKey;
    }

    public final InterfaceC9266c getPageEventFlow() {
        return this.pageEventFlow;
    }

    public final PagingSource<Key, Value> getPagingSource$paging_common_release() {
        return this.pagingSource;
    }

    public final RemoteMediatorConnection<Key, Value> getRemoteMediatorConnection() {
        return this.remoteMediatorConnection;
    }

    public /* synthetic */ PageFetcherSnapshot(Object obj, PagingSource pagingSource, PagingConfig pagingConfig, InterfaceC9266c interfaceC9266c, RemoteMediatorConnection remoteMediatorConnection, PagingState pagingState, InterfaceC10559a interfaceC10559a, int i10, AbstractC9126n abstractC9126n) {
        this(obj, pagingSource, pagingConfig, interfaceC9266c, (i10 & 16) != 0 ? null : remoteMediatorConnection, (i10 & 32) != 0 ? null : pagingState, (i10 & 64) != 0 ? new InterfaceC10559a() { // from class: androidx.paging.PageFetcherSnapshot.1
            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27211invoke() {
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27211invoke();
                return C8736p.f16368a;
            }
        } : interfaceC10559a);
    }
}
