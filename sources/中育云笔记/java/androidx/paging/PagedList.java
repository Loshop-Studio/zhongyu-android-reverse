package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.RestrictTo;
import androidx.paging.LoadState;
import androidx.paging.PagingSource;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10937b0;
import p325rc.AbstractC10947g0;
import sd.AbstractC11106e0;
import sd.AbstractC11113g;
import sd.AbstractC11115g1;
import sd.AbstractC11117h;
import sd.C11119h1;
import sd.C11157r0;
import sd.InterfaceC11122i0;

@InterfaceC10770a
/* loaded from: classes3.dex */
public abstract class PagedList<T> extends AbstractList<T> {
    public static final Companion Companion = new Companion(null);
    private final List<WeakReference<Callback>> callbacks;
    private final Config config;
    private final InterfaceC11122i0 coroutineScope;
    private final List<WeakReference<InterfaceC9544p>> loadStateListeners;
    private final AbstractC11106e0 notifyDispatcher;
    private final PagingSource<?, T> pagingSource;
    private Runnable refreshRetryCallback;
    private final int requiredRemainder;
    private final PagedStorage<T> storage;

    @MainThread
    public static abstract class BoundaryCallback<T> {
        public void onItemAtEndLoaded(T itemAtEnd) {
            AbstractC9979u.m20294g(itemAtEnd, "itemAtEnd");
        }

        public void onItemAtFrontLoaded(T itemAtFront) {
            AbstractC9979u.m20294g(itemAtFront, "itemAtFront");
        }

        public void onZeroItemsLoaded() {
        }
    }

    public static abstract class Callback {
        public abstract void onChanged(int i10, int i11);

        public abstract void onInserted(int i10, int i11);

        public abstract void onRemoved(int i10, int i11);
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <K, T> PagedList<T> create(PagingSource<K, T> pagingSource, PagingSource.LoadResult.Page<K, T> page, InterfaceC11122i0 coroutineScope, AbstractC11106e0 notifyDispatcher, AbstractC11106e0 fetchDispatcher, BoundaryCallback<T> boundaryCallback, Config config, K k10) {
            K k11;
            AbstractC9979u.m20294g(pagingSource, "pagingSource");
            AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
            AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
            AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
            AbstractC9979u.m20294g(config, "config");
            if (page == null) {
                k11 = k10;
                page = (PagingSource.LoadResult.Page) AbstractC11113g.m24717b(null, new PagedList$Companion$create$resolvedInitialPage$1(pagingSource, new PagingSource.LoadParams.Refresh(k11, config.initialLoadSizeHint, config.enablePlaceholders), null), 1, null);
            } else {
                k11 = k10;
            }
            return new ContiguousPagedList(pagingSource, coroutineScope, notifyDispatcher, fetchDispatcher, boundaryCallback, config, page, k11);
        }

        public final void dispatchNaiveUpdatesSinceSnapshot$paging_common(int i10, int i11, Callback callback) {
            AbstractC9979u.m20294g(callback, "callback");
            if (i11 < i10) {
                if (i11 > 0) {
                    callback.onChanged(0, i11);
                }
                int i12 = i10 - i11;
                if (i12 > 0) {
                    callback.onInserted(i11, i12);
                    return;
                }
                return;
            }
            if (i10 > 0) {
                callback.onChanged(0, i10);
            }
            int i13 = i11 - i10;
            if (i13 != 0) {
                callback.onRemoved(i10, i13);
            }
        }

        private Companion() {
        }
    }

    public static final class Config {
        public static final Companion Companion = new Companion(null);
        public static final int MAX_SIZE_UNBOUNDED = Integer.MAX_VALUE;
        public final boolean enablePlaceholders;
        public final int initialLoadSizeHint;
        public final int maxSize;
        public final int pageSize;
        public final int prefetchDistance;

        public static final class Builder {
            public static final Companion Companion = new Companion(null);
            public static final int DEFAULT_INITIAL_PAGE_MULTIPLIER = 3;
            private int pageSize = -1;
            private int prefetchDistance = -1;
            private int initialLoadSizeHint = -1;
            private boolean enablePlaceholders = true;
            private int maxSize = Integer.MAX_VALUE;

            public static final class Companion {
                public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                    this();
                }

                private Companion() {
                }
            }

            public final Config build() {
                if (this.prefetchDistance < 0) {
                    this.prefetchDistance = this.pageSize;
                }
                if (this.initialLoadSizeHint < 0) {
                    this.initialLoadSizeHint = this.pageSize * 3;
                }
                if (!this.enablePlaceholders && this.prefetchDistance == 0) {
                    throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
                }
                int i10 = this.maxSize;
                if (i10 == Integer.MAX_VALUE || i10 >= this.pageSize + (this.prefetchDistance * 2)) {
                    return new Config(this.pageSize, this.prefetchDistance, this.enablePlaceholders, this.initialLoadSizeHint, this.maxSize);
                }
                throw new IllegalArgumentException("Maximum size must be at least pageSize + 2*prefetchDist, pageSize=" + this.pageSize + ", prefetchDist=" + this.prefetchDistance + ", maxSize=" + this.maxSize);
            }

            public final Builder setEnablePlaceholders(boolean z10) {
                this.enablePlaceholders = z10;
                return this;
            }

            public final Builder setInitialLoadSizeHint(@IntRange(from = 1) int i10) {
                this.initialLoadSizeHint = i10;
                return this;
            }

            public final Builder setMaxSize(@IntRange(from = 2) int i10) {
                this.maxSize = i10;
                return this;
            }

            public final Builder setPageSize(@IntRange(from = 1) int i10) {
                if (i10 < 1) {
                    throw new IllegalArgumentException("Page size must be a positive number");
                }
                this.pageSize = i10;
                return this;
            }

            public final Builder setPrefetchDistance(@IntRange(from = 0) int i10) {
                this.prefetchDistance = i10;
                return this;
            }
        }

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public static /* synthetic */ void getMAX_SIZE_UNBOUNDED$annotations() {
            }

            private Companion() {
            }
        }

        public Config(int i10, int i11, boolean z10, int i12, int i13) {
            this.pageSize = i10;
            this.prefetchDistance = i11;
            this.enablePlaceholders = z10;
            this.initialLoadSizeHint = i12;
            this.maxSize = i13;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static abstract class LoadStateManager {
        private LoadState endState;
        private LoadState refreshState;
        private LoadState startState;

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

        public LoadStateManager() {
            LoadState.NotLoading.Companion companion = LoadState.NotLoading.Companion;
            this.refreshState = companion.getIncomplete$paging_common();
            this.startState = companion.getIncomplete$paging_common();
            this.endState = companion.getIncomplete$paging_common();
        }

        public final void dispatchCurrentLoadState(InterfaceC9544p callback) {
            AbstractC9979u.m20294g(callback, "callback");
            callback.invoke(LoadType.REFRESH, this.refreshState);
            callback.invoke(LoadType.PREPEND, this.startState);
            callback.invoke(LoadType.APPEND, this.endState);
        }

        public final LoadState getEndState() {
            return this.endState;
        }

        public final LoadState getRefreshState() {
            return this.refreshState;
        }

        public final LoadState getStartState() {
            return this.startState;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract void onStateChanged(LoadType loadType, LoadState loadState);

        public final void setEndState(LoadState loadState) {
            AbstractC9979u.m20294g(loadState, "<set-?>");
            this.endState = loadState;
        }

        public final void setRefreshState(LoadState loadState) {
            AbstractC9979u.m20294g(loadState, "<set-?>");
            this.refreshState = loadState;
        }

        public final void setStartState(LoadState loadState) {
            AbstractC9979u.m20294g(loadState, "<set-?>");
            this.startState = loadState;
        }

        public final void setState(LoadType type, LoadState state) {
            AbstractC9979u.m20294g(type, "type");
            AbstractC9979u.m20294g(state, "state");
            int i10 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (AbstractC9979u.m20289b(this.endState, state)) {
                        return;
                    } else {
                        this.endState = state;
                    }
                } else if (AbstractC9979u.m20289b(this.startState, state)) {
                    return;
                } else {
                    this.startState = state;
                }
            } else if (AbstractC9979u.m20289b(this.refreshState, state)) {
                return;
            } else {
                this.refreshState = state;
            }
            onStateChanged(type, state);
        }
    }

    public PagedList(PagingSource<?, T> pagingSource, InterfaceC11122i0 coroutineScope, AbstractC11106e0 notifyDispatcher, PagedStorage<T> storage, Config config) {
        AbstractC9979u.m20294g(pagingSource, "pagingSource");
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
        AbstractC9979u.m20294g(storage, "storage");
        AbstractC9979u.m20294g(config, "config");
        this.pagingSource = pagingSource;
        this.coroutineScope = coroutineScope;
        this.notifyDispatcher = notifyDispatcher;
        this.storage = storage;
        this.config = config;
        this.requiredRemainder = (config.prefetchDistance * 2) + config.pageSize;
        this.callbacks = new ArrayList();
        this.loadStateListeners = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addWeakCallback$lambda$0(WeakReference it) {
        AbstractC9979u.m20294g(it, "it");
        return it.get() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addWeakLoadStateListener$lambda$0(WeakReference it) {
        AbstractC9979u.m20294g(it, "it");
        return it.get() == null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <K, T> PagedList<T> create(PagingSource<K, T> pagingSource, PagingSource.LoadResult.Page<K, T> page, InterfaceC11122i0 interfaceC11122i0, AbstractC11106e0 abstractC11106e0, AbstractC11106e0 abstractC11106e02, BoundaryCallback<T> boundaryCallback, Config config, K k10) {
        return Companion.create(pagingSource, page, interfaceC11122i0, abstractC11106e0, abstractC11106e02, boundaryCallback, config, k10);
    }

    @InterfaceC10770a
    public static /* synthetic */ void getDataSource$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeWeakCallback$lambda$0(Callback callback, WeakReference it) {
        AbstractC9979u.m20294g(it, "it");
        return it.get() == null || it.get() == callback;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeWeakLoadStateListener$lambda$0(InterfaceC9544p interfaceC9544p, WeakReference it) {
        AbstractC9979u.m20294g(it, "it");
        return it.get() == null || it.get() == interfaceC9544p;
    }

    @InterfaceC10770a
    public final void addWeakCallback(List<? extends T> list, Callback callback) {
        AbstractC9979u.m20294g(callback, "callback");
        if (list != null && list != this) {
            Companion.dispatchNaiveUpdatesSinceSnapshot$paging_common(size(), list.size(), callback);
        }
        addWeakCallback(callback);
    }

    public final void addWeakLoadStateListener(InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        AbstractC10937b0.m23867L(this.loadStateListeners, new InterfaceC9540l() { // from class: androidx.paging.i0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PagedList.addWeakLoadStateListener$lambda$0((WeakReference) obj));
            }
        });
        this.loadStateListeners.add(new WeakReference<>(listener));
        dispatchCurrentLoadState(listener);
    }

    public abstract void detach();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void dispatchCurrentLoadState(InterfaceC9544p interfaceC9544p);

    public final void dispatchStateChangeAsync$paging_common(LoadType type, LoadState state) {
        AbstractC9979u.m20294g(type, "type");
        AbstractC9979u.m20294g(state, "state");
        AbstractC11117h.m24726d(this.coroutineScope, this.notifyDispatcher, null, new PagedList$dispatchStateChangeAsync$1(this, type, state, null), 2, null);
    }

    @Override // java.util.AbstractList, java.util.List
    public T get(int i10) {
        return this.storage.get(i10);
    }

    public final Config getConfig() {
        return this.config;
    }

    public final InterfaceC11122i0 getCoroutineScope$paging_common() {
        return this.coroutineScope;
    }

    public final DataSource<?, T> getDataSource() {
        PagingSource<?, T> pagingSource = getPagingSource();
        if (pagingSource instanceof LegacyPagingSource) {
            DataSource<?, T> dataSource$paging_common = ((LegacyPagingSource) pagingSource).getDataSource$paging_common();
            AbstractC9979u.m20292e(dataSource$paging_common, "null cannot be cast to non-null type androidx.paging.DataSource<*, T of androidx.paging.PagedList>");
            return dataSource$paging_common;
        }
        throw new IllegalStateException("Attempt to access dataSource on a PagedList that was instantiated with a " + pagingSource.getClass().getSimpleName() + " instead of a DataSource");
    }

    public abstract Object getLastKey();

    public final int getLoadedCount() {
        return this.storage.getDataCount();
    }

    public final AbstractC11106e0 getNotifyDispatcher$paging_common() {
        return this.notifyDispatcher;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PagingSource<?, T> getPagingSource() {
        return this.pagingSource;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final PlaceholderPaddedList<T> getPlaceholderPaddedList() {
        return this.storage;
    }

    public final int getPositionOffset() {
        return this.storage.getPositionOffset();
    }

    public final Runnable getRefreshRetryCallback$paging_common() {
        return this.refreshRetryCallback;
    }

    public final int getRequiredRemainder$paging_common() {
        return this.requiredRemainder;
    }

    public int getSize() {
        return this.storage.size();
    }

    public final PagedStorage<T> getStorage$paging_common() {
        return this.storage;
    }

    public abstract boolean isDetached();

    public boolean isImmutable() {
        return isDetached();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int lastLoad() {
        return this.storage.getLastLoadAroundIndex();
    }

    public final void loadAround(int i10) {
        if (i10 >= 0 && i10 < size()) {
            this.storage.setLastLoadAroundIndex(i10);
            loadAroundInternal(i10);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + size());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public abstract void loadAroundInternal(int i10);

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyChanged(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = AbstractC10947g0.m23908J0(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onChanged(i10, i11);
            }
        }
    }

    public final void notifyInserted$paging_common(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = AbstractC10947g0.m23908J0(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onInserted(i10, i11);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void notifyRemoved(int i10, int i11) {
        if (i11 == 0) {
            return;
        }
        Iterator<T> it = AbstractC10947g0.m23908J0(this.callbacks).iterator();
        while (it.hasNext()) {
            Callback callback = (Callback) ((WeakReference) it.next()).get();
            if (callback != null) {
                callback.onRemoved(i10, i11);
            }
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ T remove(int i10) {
        return (T) removeAt(i10);
    }

    public /* bridge */ Object removeAt(int i10) {
        return super.remove(i10);
    }

    public final void removeWeakCallback(final Callback callback) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC10937b0.m23867L(this.callbacks, new InterfaceC9540l() { // from class: androidx.paging.k0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PagedList.removeWeakCallback$lambda$0(callback, (WeakReference) obj));
            }
        });
    }

    public final void removeWeakLoadStateListener(final InterfaceC9544p listener) {
        AbstractC9979u.m20294g(listener, "listener");
        AbstractC10937b0.m23867L(this.loadStateListeners, new InterfaceC9540l() { // from class: androidx.paging.j0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PagedList.removeWeakLoadStateListener$lambda$0(listener, (WeakReference) obj));
            }
        });
    }

    public void retry() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setInitialLoadState(LoadType loadType, LoadState loadState) {
        AbstractC9979u.m20294g(loadType, "loadType");
        AbstractC9979u.m20294g(loadState, "loadState");
    }

    public final void setRefreshRetryCallback$paging_common(Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final void setRetryCallback(Runnable runnable) {
        this.refreshRetryCallback = runnable;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public final List<T> snapshot() {
        return isImmutable() ? this : new SnapshotPagedList(this);
    }

    public final void addWeakCallback(Callback callback) {
        AbstractC9979u.m20294g(callback, "callback");
        AbstractC10937b0.m23867L(this.callbacks, new InterfaceC9540l() { // from class: androidx.paging.l0
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PagedList.addWeakCallback$lambda$0((WeakReference) obj));
            }
        });
        this.callbacks.add(new WeakReference<>(callback));
    }

    @InterfaceC10770a
    public static final class Builder<Key, Value> {
        private BoundaryCallback<Value> boundaryCallback;
        private final Config config;
        private InterfaceC11122i0 coroutineScope;
        private DataSource<Key, Value> dataSource;
        private AbstractC11106e0 fetchDispatcher;
        private Key initialKey;
        private final PagingSource.LoadResult.Page<Key, Value> initialPage;
        private AbstractC11106e0 notifyDispatcher;
        private final PagingSource<Key, Value> pagingSource;

        public Builder(DataSource<Key, Value> dataSource, Config config) {
            AbstractC9979u.m20294g(dataSource, "dataSource");
            AbstractC9979u.m20294g(config, "config");
            this.coroutineScope = C11119h1.f26784c;
            this.pagingSource = null;
            this.dataSource = dataSource;
            this.initialPage = null;
            this.config = config;
        }

        private static /* synthetic */ void getCoroutineScope$annotations() {
        }

        public final PagedList<Value> build() {
            AbstractC11106e0 abstractC11106e0M24799b = this.fetchDispatcher;
            if (abstractC11106e0M24799b == null) {
                abstractC11106e0M24799b = C11157r0.m24799b();
            }
            AbstractC11106e0 abstractC11106e0 = abstractC11106e0M24799b;
            PagingSource<Key, Value> legacyPagingSource = this.pagingSource;
            if (legacyPagingSource == null) {
                DataSource<Key, Value> dataSource = this.dataSource;
                legacyPagingSource = dataSource != null ? new LegacyPagingSource(abstractC11106e0, dataSource) : null;
            }
            PagingSource<Key, Value> pagingSource = legacyPagingSource;
            if (pagingSource instanceof LegacyPagingSource) {
                ((LegacyPagingSource) pagingSource).setPageSize(this.config.pageSize);
            }
            if (pagingSource == null) {
                throw new IllegalStateException("PagedList cannot be built without a PagingSource or DataSource");
            }
            Companion companion = PagedList.Companion;
            PagingSource.LoadResult.Page<Key, Value> page = this.initialPage;
            InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
            AbstractC11106e0 abstractC11106e0Mo25209k = this.notifyDispatcher;
            if (abstractC11106e0Mo25209k == null) {
                abstractC11106e0Mo25209k = C11157r0.m24800c().mo25209k();
            }
            return companion.create(pagingSource, page, interfaceC11122i0, abstractC11106e0Mo25209k, abstractC11106e0, this.boundaryCallback, this.config, this.initialKey);
        }

        public final Builder<Key, Value> setBoundaryCallback(BoundaryCallback<Value> boundaryCallback) {
            this.boundaryCallback = boundaryCallback;
            return this;
        }

        public final Builder<Key, Value> setCoroutineScope(InterfaceC11122i0 coroutineScope) {
            AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
            this.coroutineScope = coroutineScope;
            return this;
        }

        public final Builder<Key, Value> setFetchDispatcher(AbstractC11106e0 fetchDispatcher) {
            AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
            this.fetchDispatcher = fetchDispatcher;
            return this;
        }

        @InterfaceC10770a
        public final Builder<Key, Value> setFetchExecutor(Executor fetchExecutor) {
            AbstractC9979u.m20294g(fetchExecutor, "fetchExecutor");
            this.fetchDispatcher = AbstractC11115g1.m24721b(fetchExecutor);
            return this;
        }

        public final Builder<Key, Value> setInitialKey(Key key) {
            this.initialKey = key;
            return this;
        }

        public final Builder<Key, Value> setNotifyDispatcher(AbstractC11106e0 notifyDispatcher) {
            AbstractC9979u.m20294g(notifyDispatcher, "notifyDispatcher");
            this.notifyDispatcher = notifyDispatcher;
            return this;
        }

        @InterfaceC10770a
        public final Builder<Key, Value> setNotifyExecutor(Executor notifyExecutor) {
            AbstractC9979u.m20294g(notifyExecutor, "notifyExecutor");
            this.notifyDispatcher = AbstractC11115g1.m24721b(notifyExecutor);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(DataSource<Key, Value> dataSource, int i10) {
            this(dataSource, PagedListConfigKt.Config$default(i10, 0, false, 0, 0, 30, null));
            AbstractC9979u.m20294g(dataSource, "dataSource");
        }

        public Builder(PagingSource<Key, Value> pagingSource, PagingSource.LoadResult.Page<Key, Value> initialPage, Config config) {
            AbstractC9979u.m20294g(pagingSource, "pagingSource");
            AbstractC9979u.m20294g(initialPage, "initialPage");
            AbstractC9979u.m20294g(config, "config");
            this.coroutineScope = C11119h1.f26784c;
            this.pagingSource = pagingSource;
            this.dataSource = null;
            this.initialPage = initialPage;
            this.config = config;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(PagingSource<Key, Value> pagingSource, PagingSource.LoadResult.Page<Key, Value> initialPage, int i10) {
            this(pagingSource, initialPage, PagedListConfigKt.Config$default(i10, 0, false, 0, 0, 30, null));
            AbstractC9979u.m20294g(pagingSource, "pagingSource");
            AbstractC9979u.m20294g(initialPage, "initialPage");
        }
    }
}
