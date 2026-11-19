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
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p135i8.AbstractC8839h;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

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
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final int getAppendItemsRequested$paging_common_release(int i10, int i11, int i12) {
            return ((i11 + i10) + 1) - i12;
        }

        public final int getPrependItemsRequested$paging_common_release(int i10, int i11, int i12) {
            return i10 - (i11 - i12);
        }

        private Companion() {
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1", m17801f = "ContiguousPagedList.jvm.kt", m17802l = {}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.ContiguousPagedList$tryDispatchBoundaryCallbacks$1 */
    public static final class C42951 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ boolean $dispatchBegin;
        final /* synthetic */ boolean $dispatchEnd;
        int label;
        final /* synthetic */ ContiguousPagedList<K, V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42951(ContiguousPagedList<K, V> contiguousPagedList, boolean z10, boolean z11, InterfaceC9324c<? super C42951> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = contiguousPagedList;
            this.$dispatchBegin = z10;
            this.$dispatchEnd = z11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C42951(this.this$0, this.$dispatchBegin, this.$dispatchEnd, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
            return ((C42951) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            AbstractC9434a.m17291f();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
            this.this$0.dispatchBoundaryCallbacks(this.$dispatchBegin, this.$dispatchEnd);
            return C8736p.f16368a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContiguousPagedList(PagingSource<K, V> pagingSource, InterfaceC8822b0 coroutineScope, CoroutineDispatcher notifyDispatcher, CoroutineDispatcher backgroundDispatcher, PagedList.BoundaryCallback<V> boundaryCallback, PagedList.Config config, PagingSource.LoadResult.Page<K, V> initialPage, K k10) {
        super(pagingSource, coroutineScope, notifyDispatcher, new PagedStorage(), config);
        AbstractC9133u.m16133g(pagingSource, "pagingSource");
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        AbstractC9133u.m16133g(notifyDispatcher, "notifyDispatcher");
        AbstractC9133u.m16133g(backgroundDispatcher, "backgroundDispatcher");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(initialPage, "initialPage");
        this.pagingSource = pagingSource;
        this.boundaryCallback = boundaryCallback;
        this.initialLastKey = k10;
        this.lowestIndexAccessed = Integer.MAX_VALUE;
        this.highestIndexAccessed = Integer.MIN_VALUE;
        this.shouldTrim = config.maxSize != Integer.MAX_VALUE;
        PagedStorage<V> storage$paging_common_release = getStorage$paging_common_release();
        AbstractC9133u.m16131e(storage$paging_common_release, "null cannot be cast to non-null type androidx.paging.LegacyPageFetcher.KeyProvider<K of androidx.paging.ContiguousPagedList>");
        this.pager = new LegacyPageFetcher<>(coroutineScope, config, pagingSource, notifyDispatcher, backgroundDispatcher, this, storage$paging_common_release);
        if (config.enablePlaceholders) {
            getStorage$paging_common_release().init(initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, initialPage, initialPage.getItemsAfter() != Integer.MIN_VALUE ? initialPage.getItemsAfter() : 0, 0, this, (initialPage.getItemsBefore() == Integer.MIN_VALUE || initialPage.getItemsAfter() == Integer.MIN_VALUE) ? false : true);
        } else {
            getStorage$paging_common_release().init(0, initialPage, 0, initialPage.getItemsBefore() != Integer.MIN_VALUE ? initialPage.getItemsBefore() : 0, this, false);
        }
        triggerBoundaryCallback(LoadType.REFRESH, initialPage.getData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchBoundaryCallbacks(boolean z10, boolean z11) {
        if (z10) {
            PagedList.BoundaryCallback<V> boundaryCallback = this.boundaryCallback;
            AbstractC9133u.m16130d(boundaryCallback);
            boundaryCallback.onItemAtFrontLoaded(getStorage$paging_common_release().getFirstLoadedItem$paging_common_release());
        }
        if (z11) {
            PagedList.BoundaryCallback<V> boundaryCallback2 = this.boundaryCallback;
            AbstractC9133u.m16130d(boundaryCallback2);
            boundaryCallback2.onItemAtEndLoaded(getStorage$paging_common_release().getLastLoadedItem$paging_common_release());
        }
    }

    public static /* synthetic */ void getLastKey$annotations() {
    }

    private static /* synthetic */ void getPager$annotations() {
    }

    private final void triggerBoundaryCallback(LoadType loadType, List<? extends V> list) {
        if (this.boundaryCallback != null) {
            boolean z10 = false;
            boolean z11 = getStorage$paging_common_release().size() == 0;
            boolean z12 = !z11 && loadType == LoadType.PREPEND && list.isEmpty();
            if (!z11 && loadType == LoadType.APPEND && list.isEmpty()) {
                z10 = true;
            }
            deferBoundaryCallbacks$paging_common_release(z11, z12, z10);
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
                AbstractC8839h.m14861d(getCoroutineScope$paging_common_release(), getNotifyDispatcher$paging_common_release(), null, new C42951(this, z11, z12, null), 2, null);
            } else {
                dispatchBoundaryCallbacks(z11, z12);
            }
        }
    }

    @AnyThread
    public final void deferBoundaryCallbacks$paging_common_release(boolean z10, boolean z11, boolean z12) {
        if (this.boundaryCallback == null) {
            throw new IllegalStateException("Can't defer BoundaryCallback, no instance");
        }
        if (this.lowestIndexAccessed == Integer.MAX_VALUE) {
            this.lowestIndexAccessed = getStorage$paging_common_release().size();
        }
        if (this.highestIndexAccessed == Integer.MIN_VALUE) {
            this.highestIndexAccessed = 0;
        }
        if (z10 || z11 || z12) {
            AbstractC8839h.m14861d(getCoroutineScope$paging_common_release(), getNotifyDispatcher$paging_common_release(), null, new ContiguousPagedList$deferBoundaryCallbacks$1(z10, this, z11, z12, null), 2, null);
        }
    }

    @Override // androidx.paging.PagedList
    public void detach() {
        this.pager.detach();
    }

    @Override // androidx.paging.PagedList
    public void dispatchCurrentLoadState(InterfaceC10574p callback) {
        AbstractC9133u.m16133g(callback, "callback");
        this.pager.getLoadStateManager().dispatchCurrentLoadState(callback);
    }

    public final PagedList.BoundaryCallback<V> getBoundaryCallback$paging_common_release() {
        return this.boundaryCallback;
    }

    @Override // androidx.paging.PagedList
    public K getLastKey() {
        K refreshKey2;
        PagingState<?, V> refreshKeyInfo = getStorage$paging_common_release().getRefreshKeyInfo(getConfig());
        return (refreshKeyInfo == null || (refreshKey2 = this.pagingSource.getRefreshKey2(refreshKeyInfo)) == null) ? this.initialLastKey : refreshKey2;
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
        int prependItemsRequested$paging_common_release = companion.getPrependItemsRequested$paging_common_release(getConfig().prefetchDistance, i10, getStorage$paging_common_release().getPlaceholdersBefore());
        int appendItemsRequested$paging_common_release = companion.getAppendItemsRequested$paging_common_release(getConfig().prefetchDistance, i10, getStorage$paging_common_release().getPlaceholdersBefore() + getStorage$paging_common_release().getDataCount());
        int iMax = Math.max(prependItemsRequested$paging_common_release, this.prependItemsRequested);
        this.prependItemsRequested = iMax;
        if (iMax > 0) {
            this.pager.trySchedulePrepend();
        }
        int iMax2 = Math.max(appendItemsRequested$paging_common_release, this.appendItemsRequested);
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
        notifyInserted$paging_common_release(0, i10);
        this.replacePagesWithNulls = getStorage$paging_common_release().getPlaceholdersBefore() > 0 || getStorage$paging_common_release().getPlaceholdersAfter() > 0;
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPageAppended(int i10, int i11, int i12) {
        notifyChanged(i10, i11);
        notifyInserted$paging_common_release(i10 + i11, i12);
    }

    @Override // androidx.paging.PagedStorage.Callback
    @MainThread
    public void onPagePrepended(int i10, int i11, int i12) {
        notifyChanged(i10, i11);
        notifyInserted$paging_common_release(0, i12);
        this.lowestIndexAccessed += i12;
        this.highestIndexAccessed += i12;
    }

    @Override // androidx.paging.LegacyPageFetcher.PageConsumer
    public boolean onPageResult(LoadType type, PagingSource.LoadResult.Page<?, V> page) {
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(page, "page");
        List<? extends V> data = page.getData();
        boolean z10 = true;
        boolean z11 = lastLoad() > getStorage$paging_common_release().getMiddleOfLoadedRange();
        boolean z12 = this.shouldTrim && getStorage$paging_common_release().shouldPreTrimNewPage(getConfig().maxSize, getRequiredRemainder$paging_common_release(), data.size());
        LoadType loadType = LoadType.APPEND;
        if (type == loadType) {
            if (!z12 || z11) {
                getStorage$paging_common_release().appendPage$paging_common_release(page, this);
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
                getStorage$paging_common_release().prependPage$paging_common_release(page, this);
                int size2 = this.prependItemsRequested - data.size();
                this.prependItemsRequested = size2;
                if (size2 <= 0 || data.isEmpty()) {
                }
            }
            z10 = false;
        }
        if (this.shouldTrim) {
            if (z11) {
                if (!(this.pager.getLoadStateManager().getStartState() instanceof LoadState.Loading) && getStorage$paging_common_release().trimFromFront$paging_common_release(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder$paging_common_release(), this)) {
                    this.pager.getLoadStateManager().setState(LoadType.PREPEND, LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
                }
            } else if (!(this.pager.getLoadStateManager().getEndState() instanceof LoadState.Loading) && getStorage$paging_common_release().trimFromEnd$paging_common_release(this.replacePagesWithNulls, getConfig().maxSize, getRequiredRemainder$paging_common_release(), this)) {
                this.pager.getLoadStateManager().setState(loadType, LoadState.NotLoading.Companion.getIncomplete$paging_common_release());
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
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(state, "state");
        dispatchStateChangeAsync$paging_common_release(type, state);
    }

    @Override // androidx.paging.PagedList
    public void retry() {
        Runnable refreshRetryCallback$paging_common_release;
        super.retry();
        this.pager.retry();
        if (!(this.pager.getLoadStateManager().getRefreshState() instanceof LoadState.Error) || (refreshRetryCallback$paging_common_release = getRefreshRetryCallback$paging_common_release()) == null) {
            return;
        }
        refreshRetryCallback$paging_common_release.run();
    }

    @Override // androidx.paging.PagedList
    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        AbstractC9133u.m16133g(loadType, "loadType");
        AbstractC9133u.m16133g(loadState, "loadState");
        this.pager.getLoadStateManager().setState(loadType, loadState);
    }
}
