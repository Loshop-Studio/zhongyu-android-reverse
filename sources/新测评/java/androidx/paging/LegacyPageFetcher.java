package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002:\u00029:BU\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010&\u001a\u00020'J\u0018\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020'H\u0002J$\u0010.\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0002J\u0006\u00101\u001a\u00020'J\b\u00102\u001a\u00020'H\u0002J\u001e\u00103\u001a\u00020'2\u0006\u0010)\u001a\u00020*2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0002J\b\u00106\u001a\u00020'H\u0002J\u0006\u00107\u001a\u00020'J\u0006\u00108\u001a\u00020'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0012\u0010\u0014\u001a\u00060\u0015j\u0002`\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0019R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006;"}, m13558d2 = {"Landroidx/paging/LegacyPageFetcher;", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "pagedListScope", "Lkotlinx/coroutines/CoroutineScope;", "config", "Landroidx/paging/PagedList$Config;", "source", "Landroidx/paging/PagingSource;", "notifyDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetchDispatcher", "pageConsumer", "Landroidx/paging/LegacyPageFetcher$PageConsumer;", "keyProvider", "Landroidx/paging/LegacyPageFetcher$KeyProvider;", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/paging/PagedList$Config;Landroidx/paging/PagingSource;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/paging/LegacyPageFetcher$PageConsumer;Landroidx/paging/LegacyPageFetcher$KeyProvider;)V", "getConfig", "()Landroidx/paging/PagedList$Config;", "detached", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/paging/internal/AtomicBoolean;", "isDetached", "", "()Z", "loadStateManager", "Landroidx/paging/PagedList$LoadStateManager;", "getLoadStateManager$annotations", "()V", "getLoadStateManager", "()Landroidx/paging/PagedList$LoadStateManager;", "setLoadStateManager", "(Landroidx/paging/PagedList$LoadStateManager;)V", "getPageConsumer", "()Landroidx/paging/LegacyPageFetcher$PageConsumer;", "getSource", "()Landroidx/paging/PagingSource;", "detach", "", "onLoadError", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/paging/LoadType;", "throwable", "", "onLoadInvalid", "onLoadSuccess", "value", "Landroidx/paging/PagingSource$LoadResult$Page;", "retry", "scheduleAppend", "scheduleLoad", "params", "Landroidx/paging/PagingSource$LoadParams;", "schedulePrepend", "tryScheduleAppend", "trySchedulePrepend", "KeyProvider", "PageConsumer", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class LegacyPageFetcher<K, V> {
    private final PagedList.Config config;
    private final AtomicBoolean detached;
    private final CoroutineDispatcher fetchDispatcher;
    private final KeyProvider<K> keyProvider;
    private PagedList.LoadStateManager loadStateManager;
    private final CoroutineDispatcher notifyDispatcher;
    private final PageConsumer<V> pageConsumer;
    private final CoroutineScope pagedListScope;
    private final PagingSource<K, V> source;

    @Metadata(m13557d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002R\u0014\u0010\u0003\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00018\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m13558d2 = {"Landroidx/paging/LegacyPageFetcher$KeyProvider;", "K", "", "nextKey", "getNextKey", "()Ljava/lang/Object;", "prevKey", "getPrevKey", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public interface KeyProvider<K> {
        K getNextKey();

        K getPrevKey();
    }

    @Metadata(m13557d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u0000*\b\b\u0002\u0010\u0001*\u00020\u00022\u00020\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00028\u00020\bH&J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, m13558d2 = {"Landroidx/paging/LegacyPageFetcher$PageConsumer;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "onPageResult", "", ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY, "Landroidx/paging/LoadType;", "page", "Landroidx/paging/PagingSource$LoadResult$Page;", "onStateChanged", "", "state", "Landroidx/paging/LoadState;", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public interface PageConsumer<V> {
        boolean onPageResult(LoadType type, PagingSource.LoadResult.Page<?, V> page);

        void onStateChanged(LoadType type, LoadState state);
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
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

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", m13596f = "LegacyPageFetcher.jvm.kt", m13597i = {0}, m13598l = {53}, m13599m = "invokeSuspend", m13600n = {"$this$launch"}, m13601s = {"L$0"})
    /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1 */
    public static final class C42231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PagingSource.LoadParams<K> $params;
        final /* synthetic */ LoadType $type;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ LegacyPageFetcher<K, V> this$0;

        @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "", "K", "", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
        @DebugMetadata(m13595c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", m13596f = "LegacyPageFetcher.jvm.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
        /* renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LoadType $type;
            final /* synthetic */ PagingSource.LoadResult<K, V> $value;
            int label;
            final /* synthetic */ LegacyPageFetcher<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PagingSource.LoadResult<K, V> loadResult, LegacyPageFetcher<K, V> legacyPageFetcher, LoadType loadType, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$value = loadResult;
                this.this$0 = legacyPageFetcher;
                this.$type = loadType;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$value, this.this$0, this.$type, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PagingSource.LoadResult<K, V> loadResult = this.$value;
                if (loadResult instanceof PagingSource.LoadResult.Page) {
                    this.this$0.onLoadSuccess(this.$type, (PagingSource.LoadResult.Page) loadResult);
                } else if (loadResult instanceof PagingSource.LoadResult.Error) {
                    this.this$0.onLoadError(this.$type, ((PagingSource.LoadResult.Error) loadResult).getThrowable());
                } else if (loadResult instanceof PagingSource.LoadResult.Invalid) {
                    this.this$0.onLoadInvalid();
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42231(LegacyPageFetcher<K, V> legacyPageFetcher, PagingSource.LoadParams<K> loadParams, LoadType loadType, Continuation<? super C42231> continuation) {
            super(2, continuation);
            this.this$0 = legacyPageFetcher;
            this.$params = loadParams;
            this.$type = loadType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C42231 c42231 = new C42231(this.this$0, this.$params, this.$type, continuation);
            c42231.L$0 = obj;
            return c42231;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                PagingSource<K, V> source = this.this$0.getSource();
                PagingSource.LoadParams<K> loadParams = this.$params;
                this.L$0 = coroutineScope2;
                this.label = 1;
                Object objLoad = source.load(loadParams, this);
                if (objLoad == coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope = coroutineScope2;
                obj = objLoad;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
            if (this.this$0.getSource().getInvalid()) {
                this.this$0.detach();
                return Unit.INSTANCE;
            }
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, ((LegacyPageFetcher) this.this$0).notifyDispatcher, null, new AnonymousClass1(loadResult, this.this$0, this.$type, null), 2, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C42231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LegacyPageFetcher(CoroutineScope pagedListScope, PagedList.Config config, PagingSource<K, V> source, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher fetchDispatcher, PageConsumer<V> pageConsumer, KeyProvider<K> keyProvider) {
        Intrinsics.checkNotNullParameter(pagedListScope, "pagedListScope");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(notifyDispatcher, "notifyDispatcher");
        Intrinsics.checkNotNullParameter(fetchDispatcher, "fetchDispatcher");
        Intrinsics.checkNotNullParameter(pageConsumer, "pageConsumer");
        Intrinsics.checkNotNullParameter(keyProvider, "keyProvider");
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
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(state, "state");
                this.this$0.getPageConsumer().onStateChanged(type, state);
            }
        };
    }

    public static /* synthetic */ void getLoadStateManager$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadError(LoadType type, Throwable throwable) {
        if (isDetached()) {
            return;
        }
        this.loadStateManager.setState(type, new LoadState.Error(throwable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadInvalid() {
        this.source.invalidate();
        detach();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadSuccess(LoadType type, PagingSource.LoadResult.Page<K, V> value) {
        if (isDetached()) {
            return;
        }
        if (!this.pageConsumer.onPageResult(type, value)) {
            this.loadStateManager.setState(type, value.getData().isEmpty() ? LoadState.NotLoading.INSTANCE.getComplete$paging_common_release() : LoadState.NotLoading.INSTANCE.getIncomplete$paging_common_release());
            return;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
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
            onLoadSuccess(LoadType.APPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common_release());
            return;
        }
        PagedList.LoadStateManager loadStateManager = this.loadStateManager;
        LoadType loadType = LoadType.APPEND;
        loadStateManager.setState(loadType, LoadState.Loading.INSTANCE);
        PagedList.Config config = this.config;
        scheduleLoad(loadType, new PagingSource.LoadParams.Append(nextKey, config.pageSize, config.enablePlaceholders));
    }

    private final void scheduleLoad(LoadType type, PagingSource.LoadParams<K> params) {
        BuildersKt__Builders_commonKt.launch$default(this.pagedListScope, this.fetchDispatcher, null, new C42231(this, params, type, null), 2, null);
    }

    private final void schedulePrepend() {
        K prevKey = this.keyProvider.getPrevKey();
        if (prevKey == null) {
            onLoadSuccess(LoadType.PREPEND, PagingSource.LoadResult.Page.INSTANCE.empty$paging_common_release());
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
        Intrinsics.checkNotNullParameter(loadStateManager, "<set-?>");
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
