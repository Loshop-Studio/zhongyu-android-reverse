package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.paging.LegacyPageFetcher;
import androidx.paging.LoadState;
import androidx.paging.PagedList;
import androidx.paging.PagedStorage;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11106e0;
import sd.AbstractC11117h;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class ContiguousPagedList<K, V> extends PagedList<V> implements PagedStorage.Callback, LegacyPageFetcher.PageConsumer<V> {
    public static final Companion Companion = new Companion(null);
    private int appendItemsRequested;
    private final PagedList.BoundaryCallback<V> boundaryCallback;
    private boolean boundaryCallbackBeginDeferred;
    private boolean boundaryCallbackEndDeferred;
    private int highestIndexAccessed;
    private final K initialLastKey;
    private int lowestIndexAccessed;
    private final LegacyPageFetcher<K, V> pager;
    private final PagingSource<K, V> pagingSource;
    private int prependItemsRequested;
    private boolean replacePagesWithNulls;
    private final boolean shouldTrim;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final int getAppendItemsRequested$paging_common(int i10, int i11, int i12) {
            return ((i11 + i10) + 1) - i12;
        }

        public final int getPrependItemsRequested$paging_common(int i10, int i11, int i12) {
            return i10 - (i11 - i12);
        }

        private Companion() {
        }
    }

    @InterfaceC11829d(m26210c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", m26211f = "ContiguousPagedList.jvmAndAndroid.kt", m26212l = {}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1 */
    public static final class C42201 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ boolean $dispatchBegin;
        final /* synthetic */ boolean $dispatchEnd;
        int label;
        final /* synthetic */ ContiguousPagedList<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42201(ContiguousPagedList<K, V> contiguousPagedList, boolean z10, boolean z11, InterfaceC11588c<? super C42201> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = contiguousPagedList;
            this.$dispatchBegin = z10;
            this.$dispatchEnd = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42201(this.this$0, this.$dispatchBegin, this.$dispatchEnd, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC11725a.m25952f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            this.this$0.dispatchBoundaryCallbacks(this.$dispatchBegin, this.$dispatchEnd);
            return C10786q.f26013a;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C42201) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource<K, V> pagingSource, InterfaceC11122i0 coroutineScope, AbstractC11106e0 notifyDispatcher, AbstractC11106e0 backgroundDispatcher, PagedList.BoundaryCallback<V> boundaryCallback, PagedList.Config config, PagingSource.LoadResult.Page<K, V> initialPage, K k10) {
        super(pagingSource, coroutineScope, notifyDispatcher, new PagedStorage(), config);
        AbstractC9979u.m20294g(pagingSource, "pagingSource");
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
        AbstractC9979u.m20294g(backgroundDispatcher, "backgroundDispatcher");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(initialPage, "initialPage");
        this.pagingSource = pagingSource;
        this.boundaryCallback = boundaryCallback;
        this.initialLastKey = k10;
        this.lowestIndexAccessed = Integer.MAX_VALUE;
        this.highestIndexAccessed = Integer.MIN_VALUE;
        this.shouldTrim = config.maxSize != Integer.MAX_VALUE;
        PagedStorage<V> storage$paging_common = getStorage$paging_common();
        AbstractC9979u.m20292e(storage$paging_common, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.pager = new LegacyPageFetcher<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, storage$paging_common);
        if (config.enablePlaceholders) {
            getStorage$paging_common().init(initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, initialPage, initialPage.getItemsAfter() != Integer.MIN_VALUE ? initialPage.getItemsAfter() : 0, 0, this, (initialPage.getItemsBefore() == Integer.MIN_VALUE || initialPage.getItemsAfter() == Integer.MIN_VALUE) ? false : true);
        } else {
            getStorage$paging_common().init(0, initialPage, 0, initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, this, false);
        }
        triggerBoundaryCallback(LoadType.REFRESH, initialPage.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchBoundaryCallbacks(boolean z10, boolean z11) {
        if (z10) {
            PagedList.BoundaryCallback<V> boundaryCallback = this.boundaryCallback;
            AbstractC9979u.m20291d(boundaryCallback);
            boundaryCallback.onItemAtFrontLoaded(getStorage$paging_common().getFirstLoadedItem$paging_common());
        }
        if (z11) {
            PagedList.BoundaryCallback<V> boundaryCallback2 = this.boundaryCallback;
            AbstractC9979u.m20291d(boundaryCallback2);
            boundaryCallback2.onItemAtEndLoaded(getStorage$paging_common().getLastLoadedItem$paging_common());
        }
    }

    public static /* synthetic */ void getLastKey$annotations() {
    }

    private static /* synthetic */ void getPager$annotations() {
    }

    private final void triggerBoundaryCallback(LoadType loadType, List<? extends V> list) {
        if (this.boundaryCallback != null) {
            boolean z10 = false;
            boolean z11 = getStorage$paging_common().size() == 0;
            boolean z12 = !z11 && loadType == LoadType.PREPEND && list.isEmpty();
            if (!z11 && loadType == LoadType.APPEND && list.isEmpty()) {
                z10 = true;
            }
            deferBoundaryCallbacks$paging_common(z11, z12, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tryDispatchBoundaryCallbacks(boolean z10) {
        boolean z11 = this.boundaryCallbackBeginDeferred && this.lowestIndexAccessed <= getConfig().prefetchDistance;
        boolean z12 = this.boundaryCallbackEndDeferred && this.highestIndexAccessed >= (size() - 1) - getConfig().prefetchDistance;
        if (z11 || z12) {
            if (z11) {
                this.boundaryCallbackBeginDeferred = false;
            }
            if (z12) {
                this.boundaryCallbackEndDeferred = false;
            }
            if (z10) {
                AbstractC11117h.m24726d(getCoroutineScope$paging_common(), getNotifyDispatcher$paging_common(), null, new C42201(this, z11, z12, null), 2, null);
            } else {
                dispatchBoundaryCallbacks(z11, z12);
            }
        }
    }

    @AnyThread
    public final void deferBoundaryCallbacks$paging_common(boolean z10, boolean z11, boolean z12) {
        if (this.boundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
            this.lowestIndexAccessed = getStorage$paging_common().size();
        }
        if (this.highestIndexAccessed == Integer.MIN_VALUE) {
            this.highestIndexAccessed = 0;
        }
        if (z10 || z11 || z12) {
            AbstractC11117h.m24726d(getCoroutineScope$paging_common(), getNotifyDispatcher$paging_common(), null, new ContiguousPagedList$deferBoundaryCallbacks$1(z10, this, z11, z12, null), 2, null);
        }
    }

    @Override // androidx.paging.PagedList
    public void detach() {
        this.pager.detach();
    }

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(InterfaceC9544p callback) {
        AbstractC9979u.m20294g(callback, "callback");
        this.pager.getLoadStateManager().dispatchCurrentLoadState(callback);
    }

    public final PagedList.BoundaryCallback<V> getBoundaryCallback$paging_common() {
        return this.boundaryCallback;
    }

    @Override // androidx.paging.PagedList
    public K getLastKey() {
        K refreshKey;
        PagingState<?, V> refreshKeyInfo = getStorage$paging_common().getRefreshKeyInfo(getConfig());
        return (refreshKeyInfo == null || (refreshKey = this.pagingSource.getRefreshKey(refreshKeyInfo)) == null) ? this.initialLastKey : refreshKey;
    }

    @Override // androidx.paging.PagedList
    public final PagingSource<K, V> getPagingSource() {
        return this.pagingSource;
    }

    @Override // androidx.paging.PagedList
    public boolean isDetached() {
        return this.pager.isDetached();
    }

    @Override // androidx.paging.PagedList
    @MainThread
    public void loadAroundInternal(int i10) {
        Companion companion = Companion;
        int prependItemsRequested$paging_common = companion.getPrependItemsRequested$paging_common(getConfig().prefetchDistance, i10, getStorage$paging_common().getPlaceholdersBefore());
        int appendItemsRequested$paging_common = companion.getAppendItemsRequested$paging_common(getConfig().prefetchDistance, i10, getStorage$paging_common().getPlaceholdersBefore() + getStorage$paging_common().getDataCount());
        int iMax = Math.max(prependItemsRequested$paging_common, this.prependItemsRequested);
        this.prependItemsRequested = iMax;
        if (iMax > 0) {
            this.pager.trySchedulePrepend();
        }
        int iMax2 = Math.max(appendItemsRequested$paging_common, this.appendItemsRequested);
        this.appendItemsRequested = iMax2;
        if (iMax2 > 0) {
            this.pager.tryScheduleAppend();
        }
        this.lowestIndexAccessed = Math.min(this.lowestIndexAccessed, i10);
        this.highestIndexAccessed = Math.max(this.highestIndexAccessed, i10);
        tryDispatchBoundaryCallbacks(true);
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onInitialized(int i10) {
        notifyInserted$paging_common(0, i10);
        this.replacePagesWithNulls = getStorage$paging_common().getPlaceholdersBefore() > 0 || getStorage$paging_common().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPageAppended(int i10, int i11, int i12) {
        notifyChanged(i10, i11);
        notifyInserted$paging_common(i10 + i11, i12);
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPagePrepended(int i10, int i11, int i12) {
        notifyChanged(i10, i11);
        notifyInserted$paging_common(0, i12);
        this.lowestIndexAccessed += i12;
        this.highestIndexAccessed += i12;
    }

    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    public boolean onPageResult(LoadType type, PagingSource.LoadResult.Page<?, V> page) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(page, "page");
        List<? extends V> data = page.getData();
        boolean z10 = true;
        boolean z11 = lastLoad() > getStorage$paging_common().getMiddleOfLoadedRange();
        boolean z12 = this.shouldTrim && getStorage$paging_common().shouldPreTrimNewPage(getConfig().maxSize, getRequiredRemainder$paging_common(), data.size());
        LoadType loadType = LoadType.APPEND;
        if (type == loadType) {
            if (!z12 || z11) {
                getStorage$paging_common().appendPage$paging_common(page, this);
                int size = this.appendItemsRequested - data.size();
                this.appendItemsRequested = size;
                if (size <= 0 || data.isEmpty()) {
                }
            } else {
                this.appendItemsRequested = 0;
            }
            z10 = false;
        } else {
            if (type != LoadType.PREPEND) {
                throw new IllegalArgumentException("unexpected result type " + type);
            }
            if (z12 && z11) {
                this.prependItemsRequested = 0;
            } else {
                getStorage$paging_common().prependPage$paging_common(page, this);
                int size2 = this.prependItemsRequested - data.size();
                this.prependItemsRequested = size2;
                if (size2 <= 0 || data.isEmpty()) {
                }
            }
            z10 = false;
        }
        if (this.shouldTrim) {
            if (z11) {
                if (!(this.pager.getLoadStateManager().getStartState() instanceof LoadState.Loading) && getStorage$paging_common().trimFromFront$paging_common(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder$paging_common(), this)) {
                    this.pager.getLoadStateManager().setState(LoadType.PREPEND, LoadState.NotLoading.Companion.getIncomplete$paging_common());
                }
            } else if (!(this.pager.getLoadStateManager().getEndState() instanceof LoadState.Loading) && getStorage$paging_common().trimFromEnd$paging_common(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder$paging_common(), this)) {
                this.pager.getLoadStateManager().setState(loadType, LoadState.NotLoading.Companion.getIncomplete$paging_common());
            }
        }
        triggerBoundaryCallback(type, data);
        return z10;
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesRemoved(int i10, int i11) {
        notifyRemoved(i10, i11);
    }

    @Override // androidx.paging.PagedStorage.Callback
    public void onPagesSwappedToPlaceholder(int i10, int i11) {
        notifyChanged(i10, i11);
    }

    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    public void onStateChanged(LoadType type, LoadState state) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(state, "state");
        dispatchStateChangeAsync$paging_common(type, state);
    }

    @Override // androidx.paging.PagedList
    public void retry() {
        Runnable refreshRetryCallback$paging_common;
        super.retry();
        this.pager.retry();
        if (!(this.pager.getLoadStateManager().getRefreshState() instanceof LoadState.Error) || (refreshRetryCallback$paging_common = getRefreshRetryCallback$paging_common()) == null) {
            return;
        }
        refreshRetryCallback$paging_common.run();
    }

    @Override // androidx.paging.PagedList
    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(loadState, "loadState");
        this.pager.getLoadStateManager().setState(loadType, loadState);
    }
}
