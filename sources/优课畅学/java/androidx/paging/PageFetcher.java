package androidx.paging;

import androidx.annotation.VisibleForTesting;
import com.tencent.smtt.sdk.TbsListener;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.InterfaceC9212n;
import p123h7.C8736p;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class PageFetcher<Key, Value> {
    private final PagingConfig config;
    private final InterfaceC9266c flow;
    private final Key initialKey;
    private final InterfaceC10570l pagingSourceFactory;
    private final ConflatedEventBus<Boolean> refreshEvents;
    private final ConflatedEventBus<C8736p> retryEvents;

    public static final class GenerationInfo<Key, Value> {
        private final InterfaceC9212n job;
        private final PageFetcherSnapshot<Key, Value> snapshot;
        private final PagingState<Key, Value> state;

        public GenerationInfo(PageFetcherSnapshot<Key, Value> snapshot, PagingState<Key, Value> pagingState, InterfaceC9212n job) {
            AbstractC9133u.m16133g(snapshot, "snapshot");
            AbstractC9133u.m16133g(job, "job");
            this.snapshot = snapshot;
            this.state = pagingState;
            this.job = job;
        }

        public final InterfaceC9212n getJob() {
            return this.job;
        }

        public final PageFetcherSnapshot<Key, Value> getSnapshot() {
            return this.snapshot;
        }

        public final PagingState<Key, Value> getState() {
            return this.state;
        }
    }

    public final class PagerHintReceiver<Key, Value> implements HintReceiver {
        private final PageFetcherSnapshot<Key, Value> pageFetcherSnapshot;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        public PagerHintReceiver(PageFetcher pageFetcher, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot) {
            AbstractC9133u.m16133g(pageFetcherSnapshot, "pageFetcherSnapshot");
            this.this$0 = pageFetcher;
            this.pageFetcherSnapshot = pageFetcherSnapshot;
        }

        @Override // androidx.paging.HintReceiver
        public void accessHint(ViewportHint viewportHint) {
            AbstractC9133u.m16133g(viewportHint, "viewportHint");
            this.pageFetcherSnapshot.accessHint(viewportHint);
        }

        @VisibleForTesting
        public final PageFetcherSnapshot<Key, Value> getPageFetcherSnapshot$paging_common_release() {
            return this.pageFetcherSnapshot;
        }
    }

    public final class PagerUiReceiver implements UiReceiver {
        private final ConflatedEventBus<C8736p> retryEventBus;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        public PagerUiReceiver(PageFetcher pageFetcher, ConflatedEventBus<C8736p> retryEventBus) {
            AbstractC9133u.m16133g(retryEventBus, "retryEventBus");
            this.this$0 = pageFetcher;
            this.retryEventBus = retryEventBus;
        }

        @Override // androidx.paging.UiReceiver
        public void refresh() {
            this.this$0.refresh();
        }

        @Override // androidx.paging.UiReceiver
        public void retry() {
            this.retryEventBus.send(C8736p.f16368a);
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcher", m17801f = "PageFetcher.kt", m17802l = {TbsListener.ErrorCode.ROM_NOT_ENOUGH}, m17803m = "generateNewPagingSource")
    /* renamed from: androidx.paging.PageFetcher$generateNewPagingSource$1 */
    public static final class C43231 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ PageFetcher<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43231(PageFetcher<Key, Value> pageFetcher, InterfaceC9324c<? super C43231> interfaceC9324c) {
            super(interfaceC9324c);
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
    public /* synthetic */ class C43243 extends FunctionReferenceImpl implements InterfaceC10559a {
        public C43243(Object obj) {
            super(0, obj, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27209invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27209invoke() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    /* renamed from: androidx.paging.PageFetcher$generateNewPagingSource$4 */
    public /* synthetic */ class C43254 extends FunctionReferenceImpl implements InterfaceC10559a {
        public C43254(Object obj) {
            super(0, obj, PageFetcher.class, "invalidate", "invalidate()V", 0);
        }

        @Override // p300x7.InterfaceC10559a
        public /* bridge */ /* synthetic */ Object invoke() {
            m27210invoke();
            return C8736p.f16368a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m27210invoke() {
            ((PageFetcher) this.receiver).invalidate();
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.PageFetcher$injectRemoteEvents$1", m17801f = "PageFetcher.kt", m17802l = {203}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1 */
    public static final class C43261 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ RemoteMediatorAccessor<Key, Value> $accessor;
        final /* synthetic */ MutableLoadStateCollection $sourceStates;
        final /* synthetic */ PageFetcherSnapshot<Key, Value> $this_injectRemoteEvents;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43261(RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor, PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, MutableLoadStateCollection mutableLoadStateCollection, InterfaceC9324c<? super C43261> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.$accessor = remoteMediatorAccessor;
            this.$this_injectRemoteEvents = pageFetcherSnapshot;
            this.$sourceStates = mutableLoadStateCollection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43261 c43261 = new C43261(this.$accessor, this.$this_injectRemoteEvents, this.$sourceStates, interfaceC9324c);
            c43261.L$0 = obj;
            return c43261;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(SimpleProducerScope<PageEvent<Value>> simpleProducerScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43261) create(simpleProducerScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                final SimpleProducerScope simpleProducerScope = (SimpleProducerScope) this.L$0;
                InterfaceC9266c interfaceC9266cSimpleChannelFlow = SimpleChannelFlowKt.simpleChannelFlow(new C4319x6423e720(this.$accessor.getState(), this.$this_injectRemoteEvents.getPageEventFlow(), null, this.$sourceStates));
                InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.paging.PageFetcher.injectRemoteEvents.1.2
                    public final Object emit(PageEvent<Value> pageEvent, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                        Object objSend = simpleProducerScope.send(pageEvent, interfaceC9324c);
                        return objSend == AbstractC9434a.m17291f() ? objSend : C8736p.f16368a;
                    }

                    @Override // p169l8.InterfaceC9267d
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                        return emit((PageEvent) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                    }
                };
                this.label = 1;
                if (interfaceC9266cSimpleChannelFlow.collect(interfaceC9267d, this) == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            return C8736p.f16368a;
        }
    }

    public PageFetcher(InterfaceC10570l pagingSourceFactory, Key key, PagingConfig config, RemoteMediator<Key, Value> remoteMediator) {
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9133u.m16133g(config, "config");
        this.pagingSourceFactory = pagingSourceFactory;
        this.initialKey = key;
        this.config = config;
        this.refreshEvents = new ConflatedEventBus<>(null, 1, null);
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
    public final java.lang.Object generateNewPagingSource(androidx.paging.PagingSource<Key, Value> r5, p179m7.InterfaceC9324c<? super androidx.paging.PagingSource<Key, Value>> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.paging.PageFetcher.C43231
            if (r0 == 0) goto L13
            r0 = r6
            androidx.paging.PageFetcher$generateNewPagingSource$1 r0 = (androidx.paging.PageFetcher.C43231) r0
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
            java.lang.Object r1 = p190n7.AbstractC9434a.m17291f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            androidx.paging.PagingSource r5 = (androidx.paging.PagingSource) r5
            java.lang.Object r0 = r0.L$0
            androidx.paging.PageFetcher r0 = (androidx.paging.PageFetcher) r0
            kotlin.AbstractC9079b.m15926b(r6)
            goto L4c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.AbstractC9079b.m15926b(r6)
            x7.l r6 = r4.pagingSourceFactory
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            r0 = r4
        L4c:
            androidx.paging.PagingSource r6 = (androidx.paging.PagingSource) r6
            boolean r1 = r6 instanceof androidx.paging.CompatLegacyPagingSource
            if (r1 == 0) goto L5c
            r1 = r6
            androidx.paging.CompatLegacyPagingSource r1 = (androidx.paging.CompatLegacyPagingSource) r1
            androidx.paging.PagingConfig r2 = r0.config
            int r2 = r2.pageSize
            r1.setPageSize(r2)
        L5c:
            if (r6 == r5) goto L94
            androidx.paging.PageFetcher$generateNewPagingSource$3 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$3
            r1.<init>(r0)
            r6.registerInvalidatedCallback(r1)
            if (r5 == 0) goto L70
            androidx.paging.PageFetcher$generateNewPagingSource$4 r1 = new androidx.paging.PageFetcher$generateNewPagingSource$4
            r1.<init>(r0)
            r5.unregisterInvalidatedCallback(r1)
        L70:
            if (r5 == 0) goto L75
            r5.invalidate()
        L75:
            androidx.paging.PagingLogger r5 = androidx.paging.PagingLogger.INSTANCE
            r0 = 3
            boolean r1 = r5.isLoggable(r0)
            if (r1 == 0) goto L93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Generated new PagingSource "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r5.log(r0, r1, r2)
        L93:
            return r6
        L94:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "An instance of PagingSource was re-used when Pager expected to create a new\ninstance. Ensure that the pagingSourceFactory passed to Pager always returns a\nnew instance of PagingSource."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcher.generateNewPagingSource(androidx.paging.PagingSource, m7.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC9266c injectRemoteEvents(PageFetcherSnapshot<Key, Value> pageFetcherSnapshot, InterfaceC9212n interfaceC9212n, RemoteMediatorAccessor<Key, Value> remoteMediatorAccessor) {
        return remoteMediatorAccessor == null ? pageFetcherSnapshot.getPageEventFlow() : CancelableChannelFlowKt.cancelableChannelFlow(interfaceC9212n, new C43261(remoteMediatorAccessor, pageFetcherSnapshot, new MutableLoadStateCollection(), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidate() {
        this.refreshEvents.send(Boolean.FALSE);
    }

    public final InterfaceC9266c getFlow() {
        return this.flow;
    }

    public final void refresh() {
        this.refreshEvents.send(Boolean.TRUE);
    }

    public /* synthetic */ PageFetcher(InterfaceC10570l interfaceC10570l, Object obj, PagingConfig pagingConfig, RemoteMediator remoteMediator, int i10, AbstractC9126n abstractC9126n) {
        this(interfaceC10570l, obj, pagingConfig, (i10 & 8) != 0 ? null : remoteMediator);
    }
}
