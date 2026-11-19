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

/* loaded from: classes3.dex */
public final class LivePagedListKt {
    @InterfaceC10770a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor fetchExecutor) {
        AbstractC9979u.m20294g(factory, "<this>");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(fetchExecutor, "fetchExecutor");
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
            AbstractC9979u.m20293f(executor, "getIOThreadExecutor(...)");
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
            AbstractC9979u.m20293f(executor, "getIOThreadExecutor(...)");
        }
        return toLiveData((DataSource.Factory<Object, Value>) factory, i10, obj, boundaryCallback, executor);
    }

    public static /* synthetic */ LiveData toLiveData$default(InterfaceC9529a interfaceC9529a, PagedList.Config config, Object obj, PagedList.BoundaryCallback boundaryCallback, InterfaceC11122i0 interfaceC11122i0, AbstractC11106e0 abstractC11106e0, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i10 & 8) != 0) {
            interfaceC11122i0 = C11119h1.f26784c;
        }
        if ((i10 & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9979u.m20293f(iOThreadExecutor, "getIOThreadExecutor(...)");
            abstractC11106e0 = AbstractC11115g1.m24721b(iOThreadExecutor);
        }
        return toLiveData(interfaceC9529a, config, obj, boundaryCallback, interfaceC11122i0, abstractC11106e0);
    }

    @InterfaceC10770a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(DataSource.Factory<Key, Value> factory, int i10, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, Executor fetchExecutor) {
        AbstractC9979u.m20294g(factory, "<this>");
        AbstractC9979u.m20294g(fetchExecutor, "fetchExecutor");
        return new LivePagedListBuilder(factory, PagedListConfigKt.Config$default(i10, 0, false, 0, 0, 30, null)).setInitialLoadKey(key).setBoundaryCallback(boundaryCallback).setFetchExecutor(fetchExecutor).build();
    }

    public static /* synthetic */ LiveData toLiveData$default(InterfaceC9529a interfaceC9529a, int i10, Object obj, PagedList.BoundaryCallback boundaryCallback, InterfaceC11122i0 interfaceC11122i0, AbstractC11106e0 abstractC11106e0, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            obj = null;
        }
        if ((i11 & 4) != 0) {
            boundaryCallback = null;
        }
        if ((i11 & 8) != 0) {
            interfaceC11122i0 = C11119h1.f26784c;
        }
        if ((i11 & 16) != 0) {
            Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
            AbstractC9979u.m20293f(iOThreadExecutor, "getIOThreadExecutor(...)");
            abstractC11106e0 = AbstractC11115g1.m24721b(iOThreadExecutor);
        }
        return toLiveData(interfaceC9529a, i10, obj, boundaryCallback, interfaceC11122i0, abstractC11106e0);
    }

    @InterfaceC10770a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(InterfaceC9529a interfaceC9529a, PagedList.Config config, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC11122i0 coroutineScope, AbstractC11106e0 fetchDispatcher) {
        AbstractC9979u.m20294g(interfaceC9529a, "<this>");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "getMainThreadExecutor(...)");
        return new LivePagedList(coroutineScope, key, config, boundaryCallback, interfaceC9529a, AbstractC11115g1.m24721b(mainThreadExecutor), fetchDispatcher);
    }

    @InterfaceC10770a
    public static final <Key, Value> LiveData<PagedList<Value>> toLiveData(InterfaceC9529a interfaceC9529a, int i10, Key key, PagedList.BoundaryCallback<Value> boundaryCallback, InterfaceC11122i0 coroutineScope, AbstractC11106e0 fetchDispatcher) {
        AbstractC9979u.m20294g(interfaceC9529a, "<this>");
        AbstractC9979u.m20294g(coroutineScope, "coroutineScope");
        AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
        PagedList.Config configBuild = new PagedList.Config.Builder().setPageSize(i10).build();
        Executor mainThreadExecutor = ArchTaskExecutor.getMainThreadExecutor();
        AbstractC9979u.m20293f(mainThreadExecutor, "getMainThreadExecutor(...)");
        return new LivePagedList(coroutineScope, key, configBuild, boundaryCallback, interfaceC9529a, AbstractC11115g1.m24721b(mainThreadExecutor), fetchDispatcher);
    }
}
