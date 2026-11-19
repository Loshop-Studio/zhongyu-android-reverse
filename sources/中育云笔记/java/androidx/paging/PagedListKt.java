package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.PagedList;
import androidx.paging.PagingSource;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

/* loaded from: classes3.dex */
public final class PagedListKt {
    @InterfaceC10770a
    public static final /* synthetic */ PagedList PagedList(DataSource dataSource, PagedList.Config config, Executor notifyExecutor, Executor fetchExecutor, PagedList.BoundaryCallback boundaryCallback, Object obj) {
        AbstractC9979u.m20294g(dataSource, "dataSource");
        AbstractC9979u.m20294g(config, "config");
        AbstractC9979u.m20294g(notifyExecutor, "notifyExecutor");
        AbstractC9979u.m20294g(fetchExecutor, "fetchExecutor");
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
        AbstractC9979u.m20294g(config, "<this>");
        return new PagingSource.LoadParams.Refresh(key, config.initialLoadSizeHint, config.enablePlaceholders);
    }
}
