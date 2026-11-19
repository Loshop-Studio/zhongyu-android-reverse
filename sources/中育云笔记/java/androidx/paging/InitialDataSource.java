package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import kotlin.jvm.internal.AbstractC9979u;
import p325rc.AbstractC10978w;

/* loaded from: classes3.dex */
public final class InitialDataSource<K, V> extends PageKeyedDataSource<K, V> {
    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(PageKeyedDataSource.LoadParams<K> params, PageKeyedDataSource.LoadCallback<K, V> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        callback.onResult(AbstractC10978w.m24136n(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(PageKeyedDataSource.LoadParams<K> params, PageKeyedDataSource.LoadCallback<K, V> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        callback.onResult(AbstractC10978w.m24136n(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(PageKeyedDataSource.LoadInitialParams<K> params, PageKeyedDataSource.LoadInitialCallback<K, V> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        callback.onResult(AbstractC10978w.m24136n(), 0, 0, null, null);
    }
}
