package androidx.paging;

import androidx.paging.PageKeyedDataSource;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8809v;

/* loaded from: classes3.dex */
public final class InitialDataSource<K, V> extends PageKeyedDataSource<K, V> {
    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(PageKeyedDataSource.LoadParams<K> params, PageKeyedDataSource.LoadCallback<K, V> callback) {
        AbstractC9133u.m16133g(params, "params");
        AbstractC9133u.m16133g(callback, "callback");
        callback.onResult(AbstractC8809v.m14771n(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(PageKeyedDataSource.LoadParams<K> params, PageKeyedDataSource.LoadCallback<K, V> callback) {
        AbstractC9133u.m16133g(params, "params");
        AbstractC9133u.m16133g(callback, "callback");
        callback.onResult(AbstractC8809v.m14771n(), null);
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(PageKeyedDataSource.LoadInitialParams<K> params, PageKeyedDataSource.LoadInitialCallback<K, V> callback) {
        AbstractC9133u.m16133g(params, "params");
        AbstractC9133u.m16133g(callback, "callback");
        callback.onResult(AbstractC8809v.m14771n(), 0, 0, null, null);
    }
}
