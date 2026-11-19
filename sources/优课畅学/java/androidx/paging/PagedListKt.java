package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.InterfaceC8721a;

/* loaded from: classes3.dex */
public final class PagedListKt {
    @InterfaceC8721a
    public static final /* synthetic */ PagedList PagedList(DataSource dataSource, PagedList.Config config, Executor notifyExecutor, Executor fetchExecutor, PagedList.BoundaryCallback boundaryCallback, Object obj) {
        AbstractC9133u.m16133g(dataSource, "dataSource");
        AbstractC9133u.m16133g(config, "config");
        AbstractC9133u.m16133g(notifyExecutor, "notifyExecutor");
        AbstractC9133u.m16133g(fetchExecutor, "fetchExecutor");
        return new PagedList.Builder(dataSource, config).setNotifyExecutor(notifyExecutor).setFetchExecutor(fetchExecutor).setBoundaryCallback(boundaryCallback).setInitialKey(obj).build();
    }

    public static /* synthetic */ PagedList PagedList$default(DataSource dataSource, PagedList.Config config, Executor executor, Executor executor2, PagedList.BoundaryCallback boundaryCallback, Object obj, int i10, Object obj2) {
        if ((i10 & 16) != 0) {
            boundaryCallback = null;
        }
        if ((i10 & 32) != 0) {
            obj = null;
        }
        return PagedList(dataSource, config, executor, executor2, boundaryCallback, obj);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <Key> PagingSource.LoadParams<Key> toRefreshLoadParams(PagedList.Config config, Key key) {
        AbstractC9133u.m16133g(config, "<this>");
        return new PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders);
    }
}
