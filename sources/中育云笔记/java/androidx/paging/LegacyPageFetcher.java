package androidx.paging;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public final class LegacyPageFetcher<K, V> {
    private final PagedList.Config config;
    private final AtomicBoolean detached;
    private final AbstractC11106e0 fetchDispatcher;
    private final KeyProvider<K> keyProvider;
    private PagedList.LoadStateManager loadStateManager;
    private final AbstractC11106e0 notifyDispatcher;
    private final PageConsumer<V> pageConsumer;
    private final InterfaceC11122i0 pagedListScope;
    private final PagingSource<K, V> source;

    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    public interface PageConsumer<V> {
        boolean onPageResult(LoadType loadType, PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(LoadType loadType, LoadState loadState);
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", m26211f = "LegacyPageFetcher.jvmAndAndroid.kt", m26212l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1 */
    public static final class C42321 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ PagingSource.LoadParams<K> $params;
        final /* synthetic */ LoadType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LegacyPageFetcher<K, V> this$0;

        @InterfaceC11829d(m26210c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", m26211f = "LegacyPageFetcher.jvmAndAndroid.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
        /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC9544p {
            final /* synthetic */ LoadType $type;
            final /* synthetic */ PagingSource.LoadResult<K, V> $value;
            int label;
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PagingSource.LoadResult<K, V> loadResult, LegacyPageFetcher<K, V> legacyPageFetcher, LoadType loadType, InterfaceC11588c<? super AnonymousClass1> interfaceC11588c) {
                super(2, interfaceC11588c);
                this.$value = loadResult;
                this.this$0 = legacyPageFetcher;
                this.$type = loadType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
                return new AnonymousClass1(this.$value, this.this$0, this.$type, interfaceC11588c);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC11725a.m25952f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
                PagingSource.LoadResult<K, V> loadResult = this.$value;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    this.this$0.onLoadSuccess(this.$type, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    this.this$0.onLoadError(this.$type, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                } else {
                    if (!(loadResult instanceof PagingSource.LoadResult.Invalid)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.onLoadInvalid();
                }
                return C10786q.f26013a;
            }

            @Override // p181hd.InterfaceC9544p
            public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                return ((AnonymousClass1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42321(LegacyPageFetcher<K, V> legacyPageFetcher, PagingSource.LoadParams<K> loadParams, LoadType loadType, InterfaceC11588c<? super C42321> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = legacyPageFetcher;
            this.$params = loadParams;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C42321 c42321 = new C42321(this.this$0, this.$params, this.$type, interfaceC11588c);
            c42321.L$0 = obj;
            return c42321;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC11122i0 interfaceC11122i0;
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                InterfaceC11122i0 interfaceC11122i02 = (InterfaceC11122i0) this.L$0;
                PagingSource<K, V> source = this.this$0.getSource();
                PagingSource.LoadParams<K> loadParams = this.$params;
                this.L$0 = interfaceC11122i02;
                this.label = 1;
                Object objLoad = source.load(loadParams, this);
                if (objLoad == objM25952f) {
                    return objM25952f;
                }
                interfaceC11122i0 = interfaceC11122i02;
                obj = objLoad;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
                AbstractC9924b.m20071b(obj);
            }
            PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
            if (this.this$0.getSource().getInvalid()) {
                this.this$0.detach();
                return C10786q.f26013a;
            }
            AbstractC11117h.m24726d(interfaceC11122i0, ((LegacyPageFetcher) this.this$0).notifyDispatcher, null, new AnonymousClass1(loadResult, this.this$0, this.$type, null), 2, null);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42321) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LegacyPageFetcher(InterfaceC11122i0 pagedListScope, PagedList.Config config, PagingSource<K, V> source, AbstractC11106e0 notifyDispatcher, AbstractC11106e0 fetchDispatcher, PageConsumer<V> pageConsumer, KeyProvider<K> keyProvider) {
        AbstractC9979u.m20294g(pagedListScope, "pagedListScope");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
        AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
        AbstractC9979u.m20294g(pageConsumer, "pageConsumer");
        AbstractC9979u.m20294g(keyProvider, "keyProvider");
        this.pagedListScope = pagedListScope;
        this.config = config;
        this.source = source;
        this.notifyDispatcher = notifyDispatcher;
        this.fetchDispatcher = fetchDispatcher;
        this.pageConsumer = pageConsumer;
        this.keyProvider = keyProvider;
        this.detached = new AtomicBoolean(false);
        this.loadStateManager = new PagedList.LoadStateManager(this) { // from class: androidx.paging.LegacyPageFetcher$loadStateManager$1
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PagedList.LoadStateManager
            public void onStateChanged(LoadType type, LoadState state) {
                AbstractC9979u.m20294g(type, "type");
                AbstractC9979u.m20294g(state, "state");
                this.this$0.getPageConsumer().onStateChanged(type, state);
            }
        };
    }

    public static /* synthetic */ void getLoadStateManager$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadError(LoadType loadType, Throwable th) {
        if (isDetached()) {
            return;
        }
        this.loadStateManager.setState(loadType, new LoadState.Error(th));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadInvalid() {
        this.source.invalidate();
        detach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadSuccess(LoadType loadType, PagingSource.LoadResult.Page<K, V> page) {
        if (isDetached()) {
            return;
        }
        if (!this.pageConsumer.onPageResult(loadType, page)) {
            this.loadStateManager.setState(loadType, page.getData().isEmpty() ? LoadState.NotLoading.Companion.getComplete$paging_common() : LoadState.NotLoading.Companion.getIncomplete$paging_common());
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
        if (i10 == 1) {
            schedulePrepend();
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("Can only fetch more during append/prepend");
            }
            scheduleAppend();
        }
    }

    private final void scheduleAppend() {
        K nextKey = this.keyProvider.getNextKey();
        if (nextKey == null) {
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config.pageSize, config.enablePlaceholders));
    }

    private final void scheduleLoad(LoadType loadType, PagingSource.LoadParams<K> loadParams) {
        AbstractC11117h.m24726d(this.pagedListScope, this.fetchDispatcher, null, new C42321(this, loadParams, loadType, null), 2, null);
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.PREPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Prepend(prevKey, config.pageSize, config.enablePlaceholders));
    }

    public final void detach() {
        this.detached.set(true);
    }

    public final PagedList.Config getConfig() {
        return this.config;
    }

    public final PagedList.LoadStateManager getLoadStateManager() {
        return this.loadStateManager;
    }

    public final PageConsumer<V> getPageConsumer() {
        return this.pageConsumer;
    }

    public final PagingSource<K, V> getSource() {
        return this.source;
    }

    public final boolean isDetached() {
        return this.detached.get();
    }

    public final void retry() {
        if (this.loadStateManager.getStartState() instanceof LoadState.Error) {
            schedulePrepend();
        }
        if (this.loadStateManager.getEndState() instanceof LoadState.Error) {
            scheduleAppend();
        }
    }

    public final void setLoadStateManager(PagedList.LoadStateManager loadStateManager) {
        AbstractC9979u.m20294g(loadStateManager, "<set-?>");
        this.loadStateManager = loadStateManager;
    }

    public final void tryScheduleAppend() {
        LoadState endState = this.loadStateManager.getEndState();
        if (!(endState instanceof LoadState.NotLoading) || endState.getEndOfPaginationReached()) {
            return;
        }
        scheduleAppend();
    }

    public final void trySchedulePrepend() {
        LoadState startState = this.loadStateManager.getStartState();
        if (!(startState instanceof LoadState.NotLoading) || startState.getEndOfPaginationReached()) {
            return;
        }
        schedulePrepend();
    }
}
