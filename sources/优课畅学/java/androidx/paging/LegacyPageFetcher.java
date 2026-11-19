package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

/* loaded from: classes3.dex */
public final class LegacyPageFetcher<K, V> {
    private final PagedList.Config config;
    private final AtomicBoolean detached;
    private final CoroutineDispatcher fetchDispatcher;
    private final KeyProvider<K> keyProvider;
    private PagedList.LoadStateManager loadStateManager;
    private final CoroutineDispatcher notifyDispatcher;
    private final PageConsumer<V> pageConsumer;
    private final InterfaceC8822b0 pagedListScope;
    private final PagingSource<K, V> source;

    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    public interface PageConsumer<V> {
        boolean onPageResult(LoadType loadType, PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(LoadType loadType, LoadState loadState);
    }

    public /* synthetic */ class WhenMappings {
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

    @InterfaceC9539d(m17800c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", m17801f = "LegacyPageFetcher.jvm.kt", m17802l = {53}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1 */
    public static final class C43091 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ PagingSource.LoadParams<K> $params;
        final /* synthetic */ LoadType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LegacyPageFetcher<K, V> this$0;

        @InterfaceC9539d(m17800c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", m17801f = "LegacyPageFetcher.jvm.kt", m17802l = {}, m17803m = "invokeSuspend")
        /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC10574p {
            final /* synthetic */ LoadType $type;
            final /* synthetic */ PagingSource.LoadResult<K, V> $value;
            int label;
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PagingSource.LoadResult<K, V> loadResult, LegacyPageFetcher<K, V> legacyPageFetcher, LoadType loadType, InterfaceC9324c<? super AnonymousClass1> interfaceC9324c) {
                super(2, interfaceC9324c);
                this.$value = loadResult;
                this.this$0 = legacyPageFetcher;
                this.$type = loadType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
                return new AnonymousClass1(this.$value, this.this$0, this.$type, interfaceC9324c);
            }

            @Override // p300x7.InterfaceC10574p
            public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                return ((AnonymousClass1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                AbstractC9434a.m17291f();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
                PagingSource.LoadResult<K, V> loadResult = this.$value;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    this.this$0.onLoadSuccess(this.$type, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    this.this$0.onLoadError(this.$type, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                    this.this$0.onLoadInvalid();
                }
                return C8736p.f16368a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43091(LegacyPageFetcher<K, V> legacyPageFetcher, PagingSource.LoadParams<K> loadParams, LoadType loadType, InterfaceC9324c<? super C43091> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = legacyPageFetcher;
            this.$params = loadParams;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            C43091 c43091 = new C43091(this.this$0, this.$params, this.$type, interfaceC9324c);
            c43091.L$0 = obj;
            return c43091;
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C43091) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC8822b0 interfaceC8822b0;
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                InterfaceC8822b0 interfaceC8822b02 = (InterfaceC8822b0) this.L$0;
                PagingSource<K, V> source = this.this$0.getSource();
                PagingSource.LoadParams<K> loadParams = this.$params;
                this.L$0 = interfaceC8822b02;
                this.label = 1;
                Object objLoad = source.load(loadParams, this);
                if (objLoad == objM17291f) {
                    return objM17291f;
                }
                interfaceC8822b0 = interfaceC8822b02;
                obj = objLoad;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC8822b0 = (InterfaceC8822b0) this.L$0;
                AbstractC9079b.m15926b(obj);
            }
            PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
            if (this.this$0.getSource().getInvalid()) {
                this.this$0.detach();
                return C8736p.f16368a;
            }
            AbstractC8839h.m14861d(interfaceC8822b0, ((LegacyPageFetcher) this.this$0).notifyDispatcher, null, new AnonymousClass1(loadResult, this.this$0, this.$type, null), 2, null);
            return C8736p.f16368a;
        }
    }

    public LegacyPageFetcher(InterfaceC8822b0 pagedListScope, PagedList.Config config, PagingSource<K, V> source, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher, PageConsumer<V> pageConsumer, KeyProvider<K> keyProvider) {
        AbstractC9133u.m16133g(pagedListScope, "pagedListScope");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(source, "source");
        AbstractC9133u.m16133g(notifyDispatcher, "notifyDispatcher");
        AbstractC9133u.m16133g(fetchDispatcher, "fetchDispatcher");
        AbstractC9133u.m16133g(pageConsumer, "pageConsumer");
        AbstractC9133u.m16133g(keyProvider, "keyProvider");
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
                AbstractC9133u.m16133g(type, "type");
                AbstractC9133u.m16133g(state, "state");
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
            this.loadStateManager.setState(loadType, page.getData().isEmpty() ? LoadState.NotLoading.Companion.getComplete$paging_common_release() : LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
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
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common_release());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config.pageSize, config.enablePlaceholders));
    }

    private final void scheduleLoad(LoadType loadType, PagingSource.LoadParams<K> loadParams) {
        AbstractC8839h.m14861d(this.pagedListScope, this.fetchDispatcher, null, new C43091(this, loadParams, loadType, null), 2, null);
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.Companion.empty$paging_common_release());
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
        AbstractC9133u.m16133g(loadStateManager, "<set-?>");
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
