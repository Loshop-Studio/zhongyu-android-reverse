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

/* loaded from: classes3.dex */
public final class LivePagedListKt {
    @InterfaceC8721a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor fetchExecutor) {
        AbstractC9133u.m16133g(factory, "<this>");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(fetchExecutor, "fetchExecutor");
        return new LivePagedListBuilder(factory, config).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(fetchExecutor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i10 & 8) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9133u.m16132f(executor, "getIOThreadExecutor()");
        }
        return toLiveData((DataSource.Factory<Object, Value>) factory, config, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(DataSource.Factory factory, int i10, Object obj, PagedList.BoundaryCallback boundaryCallback, Executor executor, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i11 & 8) != 0) {
            executor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9133u.m16132f(executor, "getIOThreadExecutor()");
        }
        return toLiveData((DataSource.Factory<Object, Value>) factory, i10, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(InterfaceC10559a interfaceC10559a, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, InterfaceC8822b0 interfaceC8822b0, CoroutineDispatcher coroutineDispatcher, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC8822b0 = C8876t0.f16535a;
        }
        if ((i10 & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9133u.m16132f(iOThreadExecutor, "getIOThreadExecutor()");
            coroutineDispatcher = AbstractC8873s0.m14908b(iOThreadExecutor);
        }
        return toLiveData(interfaceC10559a, config, obj, boundaryCallback, interfaceC8822b0, coroutineDispatcher);
    }

    @InterfaceC8721a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, int i10, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor fetchExecutor) {
        AbstractC9133u.m16133g(factory, "<this>");
        AbstractC9133u.m16133g(fetchExecutor, "fetchExecutor");
        return new LivePagedListBuilder(factory, PagedListConfigKt.Config$default(i10, 0, false, 0, 0, 30, null)).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(fetchExecutor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(InterfaceC10559a interfaceC10559a, int i10, Object obj, PagedList.BoundaryCallback boundaryCallback, InterfaceC8822b0 interfaceC8822b0, CoroutineDispatcher coroutineDispatcher, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC8822b0 = C8876t0.f16535a;
        }
        if ((i11 & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9133u.m16132f(iOThreadExecutor, "getIOThreadExecutor()");
            coroutineDispatcher = AbstractC8873s0.m14908b(iOThreadExecutor);
        }
        return toLiveData(interfaceC10559a, i10, obj, boundaryCallback, interfaceC8822b0, coroutineDispatcher);
    }

    @InterfaceC8721a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(InterfaceC10559a interfaceC10559a, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC8822b0 coroutineScope, CoroutineDispatcher fetchDispatcher) {
        AbstractC9133u.m16133g(interfaceC10559a, "<this>");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        AbstractC9133u.m16133g(fetchDispatcher, "fetchDispatcher");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, config, boundaryCallback, interfaceC10559a, AbstractC8873s0.m14908b(mainThreadExecutor), fetchDispatcher);
    }

    @InterfaceC8721a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(InterfaceC10559a interfaceC10559a, int i10, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC8822b0 coroutineScope, CoroutineDispatcher fetchDispatcher) {
        AbstractC9133u.m16133g(interfaceC10559a, "<this>");
        AbstractC9133u.m16133g(coroutineScope, "coroutineScope");
        AbstractC9133u.m16133g(fetchDispatcher, "fetchDispatcher");
        PagedList.Config configBuild = new PagedList.Config.Builder().setPageSize(i10).build();
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9133u.m16132f(mainThreadExecutor, "getMainThreadExecutor()");
        return new LivePagedList(coroutineScope, key, configBuild, boundaryCallback, interfaceC10559a, AbstractC8873s0.m14908b(mainThreadExecutor), fetchDispatcher);
    }
}
