package androidx.paging;

import androidx.annotation.VisibleForTesting;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.InterfaceC10045g;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class PageFetcher<Key, Value> {
    private final PagingConfig config;
    private final InterfaceC11594c flow;
    private final Key initialKey;
    private final ConflatedEventBus<LoadRequest> loadRequests;
    private final InterfaceC9540l pagingSourceFactory;
    private final ConflatedEventBus<C10786q> retryEvents;

    public static final class GenerationInfo<Key, Value> {
        private final PagingState<Key, Value> cachedInitialState;
        private final InterfaceC10045g job;
        private final PageFetcherSnapshot<Key, Value> snapshot;

        public GenerationInfo(PageFetcherSnapshot<Key, Value> snapshot, PagingState<Key, Value> pagingState, InterfaceC10045g job) {
            AbstractC9979u.m20294g(snapshot, "snapshot");
            AbstractC9979u.m20294g(job, "job");
            this.snapshot = snapshot;
            this.cachedInitialState = pagingState;
            this.job = job;
        }

        public final PagingState<Key, Value> getCachedInitialState() {
            return this.cachedInitialState;
        }

        public final InterfaceC10045g getJob() {
            return this.job;
        }

        public final PageFetcherSnapshot<Key, Value> getSnapshot() {
            return this.snapshot;
        }
    }

    public static abstract class LoadRequest {
        private final LoadType loadType;

        public static final class Append extends LoadRequest {
            public static final Append INSTANCE = new Append();

            private Append() {
                super(LoadType.APPEND, null);
            }
        }

        public static final class Prepend extends LoadRequest {
            public static final Prepend INSTANCE = new Prepend();

            private Prepend() {
                super(LoadType.PREPEND, null);
            }
        }

        public static final class Refresh extends LoadRequest {
            private final boolean triggerRemoteRefresh;
            private final RefreshType type;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Refresh(boolean z10, RefreshType type) {
                super(LoadType.REFRESH, null);
                AbstractC9979u.m20294g(type, "type");
                this.triggerRemoteRefresh = z10;
                this.type = type;
            }

            public final boolean getTriggerRemoteRefresh() {
                return this.triggerRemoteRefresh;
            }

            public final RefreshType getType() {
                return this.type;
            }
        }

        public /* synthetic */ LoadRequest(LoadType loadType, AbstractC9972n abstractC9972n) {
            this(loadType);
        }

        public final LoadType getLoadType() {
            return this.loadType;
        }

        private LoadRequest(LoadType loadType) {
            this.loadType = loadType;
        }
    }

    public final class PagerHintReceiver<Key, Value> implements HintReceiver {
        private final PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        public PagerHintReceiver(PageFetcher pageFetcher, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot) {
            AbstractC9979u.m20294g(pageFetcherSnapshot, "pageFetcherSnapshot");
            this.this$0 = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
        }

        @VisibleForTesting
        public final PageFetcherSnapshot<Key, Value> getPageFetcherSnapshot$paging_common() {
            return this.pageFetcherSnapshot;
        }

        @Override // androidx.paging.HintReceiver
        public void processHint(ViewportHint viewportHint) {
            AbstractC9979u.m20294g(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.processHint(viewportHint);
        }
    }

    public final class PagerUiReceiver implements UiReceiver {
        private final ConflatedEventBus<C10786q> retryEventBus;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        public PagerUiReceiver(PageFetcher pageFetcher, ConflatedEventBus<C10786q> retryEventBus) {
            AbstractC9979u.m20294g(retryEventBus, "retryEventBus");
            this.this$0 = pageFetcher;
            this.retryEventBus = retryEventBus;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            PageFetcher.refresh$default(this.this$0, null, 1, null);
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retryEventBus.send(C10786q.f26013a);
        }
    }

    public static abstract class RefreshType {

        public static final class All extends RefreshType {
            public static final All INSTANCE = new All();

            private All() {
                super(null);
            }
        }

        public static final class Anchor extends RefreshType {
            public static final Anchor INSTANCE = new Anchor();

            private Anchor() {
                super(null);
            }
        }

        public static final class Initial extends RefreshType {
            public static final Initial INSTANCE = new Initial();

            private Initial() {
                super(null);
            }
        }

        public static final class Item extends RefreshType {
            private final Object item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Item(Object item) {
                super(null);
                AbstractC9979u.m20294g(item, "item");
                this.item = item;
            }

            public static /* synthetic */ Item copy$default(Item item, Object obj, int i10, Object obj2) {
                if ((i10 & 1) != 0) {
                    obj = item.item;
                }
                return item.copy(obj);
            }

            public final Object component1() {
                return this.item;
            }

            public final Item copy(Object item) {
                AbstractC9979u.m20294g(item, "item");
                return new Item(item);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Item) && AbstractC9979u.m20289b(this.item, ((Item) obj).item);
            }

            public final Object getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "Item(item=" + this.item + ')';
            }
        }

        public /* synthetic */ RefreshType(AbstractC9972n abstractC9972n) {
            this();
        }

        private RefreshType() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.APPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.REFRESH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcher", m26211f = "PageFetcher.kt", m26212l = {322}, m26213m = "generateNewPagingSource", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$generateNewPagingSource$1 */
    public static final class C42421 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42421(PageFetcher<Key, Value> pageFetcher, InterfaceC11588c<? super C42421> interfaceC11588c) {
            super(interfaceC11588c);
            this.this$0 = pageFetcher;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.generateNewPagingSource(null, this);
        }
    }

    /* renamed from: androidx.paging.PageFetcher$generateNewPagingSource$3 */
    public static final /* synthetic */ class C42433 extends FunctionReferenceImpl implements InterfaceC9529a {
        public C42433(Object obj) {
            super(0, obj, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m33806invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33806invoke() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    /* renamed from: androidx.paging.PageFetcher$generateNewPagingSource$4 */
    public static final /* synthetic */ class C42444 extends FunctionReferenceImpl implements InterfaceC9529a {
        public C42444(Object obj) {
            super(0, obj, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p181hd.InterfaceC9529a
        public /* bridge */ /* synthetic */ Object invoke() {
            m33807invoke();
            return C10786q.f26013a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m33807invoke() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.PageFetcher$injectRemoteEvents$1", m26211f = "PageFetcher.kt", m26212l = {315}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1 */
    public static final class C42451 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $accessor;
        final /* synthetic */ MutableLoadStateCollection $sourceStates;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> $this_injectRemoteEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42451(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, MutableLoadStateCollection mutableLoadStateCollection, InterfaceC11588c<? super C42451> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$accessor = remoteMediatorAccessor;
            this.$this_injectRemoteEvents = pageFetcherSnapshot;
            this.$sourceStates = mutableLoadStateCollection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42451 c42451 = new C42451(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, interfaceC11588c);
            c42451.L$0 = obj;
            return c42451;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42451) create(simpleProducerScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                InterfaceC11594c interfaceC11594cSimpleChannelFlow = SimpleChannelFlowKt.simpleChannelFlow(new C4238x6423e720(this.$accessor.getState(), this.$this_injectRemoteEvents.getPageEventFlow(), null, this.$sourceStates));
                InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.paging.PageFetcher.injectRemoteEvents.1.2
                    public final Object emit(PageEvent<Value> pageEvent, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                        Object objSend = simpleProducerScope.send(pageEvent, interfaceC11588c);
                        return objSend == AbstractC11725a.m25952f() ? objSend : C10786q.f26013a;
                    }

                    @Override // p379vd.InterfaceC11595d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                        return emit((PageEvent) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                    }
                };
                this.label = 1;
                if (interfaceC11594cSimpleChannelFlow.collect(interfaceC11595d, this) == objM25952f) {
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
    }

    public PageFetcher(InterfaceC9540l pagingSourceFactory, Key key, PagingConfig config, RemoteMediator<Key, Value> remoteMediator) {
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9979u.m20294g(config, "config");
        this.pagingSourceFactory = pagingSourceFactory;
        this.initialKey = key;
        this.config = config;
        this.loadRequests = new ConflatedEventBus<>(null, 1, null);
        this.retryEvents = new ConflatedEventBus<>(null, 1, null);
        this.flow = SimpleChannelFlowKt.simpleChannelFlow(new PageFetcher$flow$1(remoteMediator, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object generateNewPagingSource(androidx.paging.PagingSource<Key, Value> r5, vc.InterfaceC11588c<? super androidx.paging.PagingSource<Key, Value>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcher.C42421
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher.C42421) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = p393wc.AbstractC11725a.m25952f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            kotlin.AbstractC9924b.m20071b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.AbstractC9924b.m20071b(r6)
            hd.l r6 = r4.pagingSourceFactory
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            boolean r0 = r6 instanceof androidx.paging.CompatLegacyPagingSource
            if (r0 == 0) goto L55
            r0 = r6
            androidx.paging.CompatLegacyPagingSource r0 = (androidx.paging.CompatLegacyPagingSource) r0
            androidx.paging.PagingConfig r1 = r4.config
            int r1 = r1.pageSize
            r0.setPageSize(r1)
        L55:
            if (r6 == r5) goto L8d
            androidx.paging.PageFetcher$generateNewPagingSource$3 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            r0.<init>(r4)
            r6.registerInvalidatedCallback(r0)
            if (r5 == 0) goto L69
            androidx.paging.PageFetcher$generateNewPagingSource$4 r0 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            r0.<init>(r4)
            r5.unregisterInvalidatedCallback(r0)
        L69:
            if (r5 == 0) goto L6e
            r5.invalidate()
        L6e:
            androidx.paging.PagingLogger r5 = androidx.paging.PagingLogger.INSTANCE
            r0 = 3
            boolean r1 = r5.isLoggable(r0)
            if (r1 == 0) goto L8c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated new PagingSource "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.log(r0, r1, r2)
        L8c:
            return r6
        L8d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.generateNewPagingSource(androidx.paging.PagingSource, vc.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC11594c injectRemoteEvents(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC10045g interfaceC10045g, RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor) {
        return remoteMediatorAccessor == null ? pageFetcherSnapshot.getPageEventFlow() : CancelableChannelFlowKt.cancelableChannelFlow(interfaceC10045g, new C42451(remoteMediatorAccessor, pageFetcherSnapshot, new MutableLoadStateCollection(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate() {
        this.loadRequests.send(new LoadRequest.Refresh(false, RefreshType.Anchor.INSTANCE));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void refresh$default(PageFetcher pageFetcher, Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        pageFetcher.refresh(obj);
    }

    public final InterfaceC11594c getFlow() {
        return this.flow;
    }

    public final void load(LoadType loadType) {
        LoadRequest loadRequest;
        AbstractC9979u.m20294g(loadType, "loadType");
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            loadRequest = LoadRequest.Append.INSTANCE;
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    throw new IllegalArgumentException("Load only applies to APPEND or PREPEND");
                }
                throw new NoWhenBranchMatchedException();
            }
            loadRequest = LoadRequest.Prepend.INSTANCE;
        }
        this.loadRequests.send(loadRequest);
    }

    public final void refresh(Value value) {
        this.loadRequests.send(new LoadRequest.Refresh(true, value == null ? RefreshType.Anchor.INSTANCE : new RefreshType.Item(value)));
    }

    public final void refreshAll() {
        this.loadRequests.send(new LoadRequest.Refresh(true, RefreshType.All.INSTANCE));
    }

    public final void retry() {
        this.retryEvents.send(C10786q.f26013a);
    }

    public /* synthetic */ PageFetcher(InterfaceC9540l interfaceC9540l, Object obj, PagingConfig pagingConfig, RemoteMediator remoteMediator, int i10, AbstractC9972n abstractC9972n) {
        this(interfaceC9540l, obj, pagingConfig, (i10 & 8) != 0 ? null : remoteMediator);
    }
}
