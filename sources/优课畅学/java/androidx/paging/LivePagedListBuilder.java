package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.InterfaceC8721a;
import p135i8.AbstractC8873s0;
import p135i8.C8876t0;
import p135i8.InterfaceC8822b0;
import p300x7.InterfaceC10559a;

@InterfaceC8721a
/* loaded from: classes3.dex */
public final class LivePagedListBuilder<Key, Value> {
    private PagedList.BoundaryCallback<Value> boundaryCallback;
    private final PagedList.Config config;
    private InterfaceC8822b0 coroutineScope;
    private final DataSource.Factory<Key, Value> dataSourceFactory;
    private CoroutineDispatcher fetchDispatcher;
    private Key initialLoadKey;
    private final InterfaceC10559a pagingSourceFactory;

    @InterfaceC8721a
    public LivePagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, PagedList.Config config) {
        AbstractC9133u.m16133g(dataSourceFactory, "dataSourceFactory");
        AbstractC9133u.m16133g(config, "config");
        this.coroutineScope = C8876t0.f16535a;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        AbstractC9133u.m16132f(iOThreadExecutor, "getIOThreadExecutor()");
        this.fetchDispatcher = AbstractC8873s0.m14908b(iOThreadExecutor);
        this.pagingSourceFactory = null;
        this.dataSourceFactory = dataSourceFactory;
        this.config = config;
    }

    private static /* synthetic */ void getBoundaryCallback$annotations() {
    }

    private static /* synthetic */ void getConfig$annotations() {
    }

    private static /* synthetic */ void getCoroutineScope$annotations() {
    }

    public final LiveData<PagedList<Value>> build() {
        InterfaceC10559a interfaceC10559aAsPagingSourceFactory = this.pagingSourceFactory;
        if (interfaceC10559aAsPagingSourceFactory == null) {
            DataSource.Factory<Key, Value> factory = this.dataSourceFactory;
            interfaceC10559aAsPagingSourceFactory = factory != null ? factory.asPagingSourceFactory(this.fetchDispatcher) : null;
        }
        InterfaceC10559a interfaceC10559a = interfaceC10559aAsPagingSourceFactory;
        if (interfaceC10559a == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        InterfaceC8822b0 interfaceC8822b0 = this.coroutineScope;
        Key key = this.initialLoadKey;
        PagedList.Config config = this.config;
        PagedList.BoundaryCallback<Value> boundaryCallback = this.boundaryCallback;
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "getMainThreadExecutor()");
        return new LivePagedList(interfaceC8822b0, key, config, boundaryCallback, interfaceC10559a, AbstractC8873s0.m14908b(mainThreadExecutor), this.fetchDispatcher);
    }

    public final LivePagedListBuilder<Key, Value> setBoundaryCallback(PagedList.BoundaryCallback<Value> boundaryCallback) {
        this.boundaryCallback = boundaryCallback;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setCoroutineScope(InterfaceC8822b0 coroutineScope) {
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setFetchExecutor(Executor fetchExecutor) {
        AbstractC9133u.m16133g(fetchExecutor, "fetchExecutor");
        this.fetchDispatcher = AbstractC8873s0.m14908b(fetchExecutor);
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setInitialLoadKey(Key key) {
        this.initialLoadKey = key;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public LivePagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, int i10) {
        this(dataSourceFactory, new PagedList.Config.Builder().setPageSize(i10).build());
        AbstractC9133u.m16133g(dataSourceFactory, "dataSourceFactory");
    }

    @InterfaceC8721a
    public LivePagedListBuilder(InterfaceC10559a pagingSourceFactory, PagedList.Config config) {
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9133u.m16133g(config, "config");
        this.coroutineScope = C8876t0.f16535a;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        AbstractC9133u.m16132f(iOThreadExecutor, "getIOThreadExecutor()");
        this.fetchDispatcher = AbstractC8873s0.m14908b(iOThreadExecutor);
        this.pagingSourceFactory = pagingSourceFactory;
        this.dataSourceFactory = null;
        this.config = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC8721a
    public LivePagedListBuilder(InterfaceC10559a pagingSourceFactory, int i10) {
        this(pagingSourceFactory, new PagedList.Config.Builder().setPageSize(i10).build());
        AbstractC9133u.m16133g(pagingSourceFactory, "pagingSourceFactory");
    }
}
