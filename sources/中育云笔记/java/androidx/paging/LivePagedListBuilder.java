package androidx.paging;

import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.lifecycle.LiveData;
import androidx.paging.DataSource;
import androidx.paging.PagedList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p309qc.InterfaceC10770a;
import sd.AbstractC11106e0;
import sd.AbstractC11115g1;
import sd.C11119h1;
import sd.InterfaceC11122i0;

@InterfaceC10770a
/* loaded from: classes3.dex */
public final class LivePagedListBuilder<Key, Value> {
    private PagedList.BoundaryCallback<Value> boundaryCallback;
    private final PagedList.Config config;
    private InterfaceC11122i0 coroutineScope;
    private final DataSource.Factory<Key, Value> dataSourceFactory;
    private AbstractC11106e0 fetchDispatcher;
    private Key initialLoadKey;
    private final InterfaceC9529a pagingSourceFactory;

    @InterfaceC10770a
    public LivePagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, PagedList.Config config) {
        AbstractC9979u.m20294g(dataSourceFactory, "dataSourceFactory");
        AbstractC9979u.m20294g(config, "config");
        this.coroutineScope = C11119h1.f26784c;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        AbstractC9979u.m20293f(iOThreadExecutor, "getIOThreadExecutor(...)");
        this.fetchDispatcher = AbstractC11115g1.m24721b(iOThreadExecutor);
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
        InterfaceC9529a interfaceC9529aAsPagingSourceFactory = this.pagingSourceFactory;
        if (interfaceC9529aAsPagingSourceFactory == null) {
            DataSource.Factory<Key, Value> factory = this.dataSourceFactory;
            interfaceC9529aAsPagingSourceFactory = factory != null ? factory.asPagingSourceFactory(this.fetchDispatcher) : null;
        }
        InterfaceC9529a interfaceC9529a = interfaceC9529aAsPagingSourceFactory;
        if (interfaceC9529a == null) {
            throw new IllegalStateException("LivePagedList cannot be built without a PagingSourceFactory or DataSource.Factory");
        }
        InterfaceC11122i0 interfaceC11122i0 = this.coroutineScope;
        Key key = this.initialLoadKey;
        PagedList.Config config = this.config;
        PagedList.BoundaryCallback<Value> boundaryCallback = this.boundaryCallback;
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "getMainThreadExecutor(...)");
        return new LivePagedList(interfaceC11122i0, key, config, boundaryCallback, interfaceC9529a, AbstractC11115g1.m24721b(mainThreadExecutor), this.fetchDispatcher);
    }

    public final LivePagedListBuilder<Key, Value> setBoundaryCallback(PagedList.BoundaryCallback<Value> boundaryCallback) {
        this.boundaryCallback = boundaryCallback;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setCoroutineScope(InterfaceC11122i0 coroutineScope) {
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setFetchExecutor(Executor fetchExecutor) {
        AbstractC9979u.m20294g(fetchExecutor, "fetchExecutor");
        this.fetchDispatcher = AbstractC11115g1.m24721b(fetchExecutor);
        return this;
    }

    public final LivePagedListBuilder<Key, Value> setInitialLoadKey(Key key) {
        this.initialLoadKey = key;
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public LivePagedListBuilder(DataSource.Factory<Key, Value> dataSourceFactory, int i10) {
        this(dataSourceFactory, new PagedList.Config.Builder().setPageSize(i10).build());
        AbstractC9979u.m20294g(dataSourceFactory, "dataSourceFactory");
    }

    @InterfaceC10770a
    public LivePagedListBuilder(InterfaceC9529a pagingSourceFactory, PagedList.Config config) {
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
        AbstractC9979u.m20294g(config, "config");
        this.coroutineScope = C11119h1.f26784c;
        Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
        AbstractC9979u.m20293f(iOThreadExecutor, "getIOThreadExecutor(...)");
        this.fetchDispatcher = AbstractC11115g1.m24721b(iOThreadExecutor);
        this.pagingSourceFactory = pagingSourceFactory;
        this.dataSourceFactory = null;
        this.config = config;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC10770a
    public LivePagedListBuilder(InterfaceC9529a pagingSourceFactory, int i10) {
        this(pagingSourceFactory, new PagedList.Config.Builder().setPageSize(i10).build());
        AbstractC9979u.m20294g(pagingSourceFactory, "pagingSourceFactory");
    }
}
