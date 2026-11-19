package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.PageKeyedDataSource;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WrapperPageKeyedDataSource<K, A, B> extends PageKeyedDataSource<K, B> {
    private final Function<List<A>, List<B>> listFunction;
    private final PageKeyedDataSource<K, A> source;

    public WrapperPageKeyedDataSource(PageKeyedDataSource<K, A> source, Function<List<A>, List<B>> listFunction) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadAfter(PageKeyedDataSource.LoadParams<K> params, final PageKeyedDataSource.LoadCallback<K, B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadAfter(params, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.loadAfter.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(List<? extends A> data, K k10) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(((WrapperPageKeyedDataSource) this).listFunction, data), k10);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadBefore(PageKeyedDataSource.LoadParams<K> params, final PageKeyedDataSource.LoadCallback<K, B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadBefore(params, new PageKeyedDataSource.LoadCallback<K, A>() { // from class: androidx.paging.WrapperPageKeyedDataSource.loadBefore.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(List<? extends A> data, K k10) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(((WrapperPageKeyedDataSource) this).listFunction, data), k10);
            }
        });
    }

    @Override // androidx.paging.PageKeyedDataSource
    public void loadInitial(PageKeyedDataSource.LoadInitialParams<K> params, final PageKeyedDataSource.LoadInitialCallback<K, B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadInitial(params, new PageKeyedDataSource.LoadInitialCallback<K, A>(this) { // from class: androidx.paging.WrapperPageKeyedDataSource.loadInitial.1
            final /* synthetic */ WrapperPageKeyedDataSource<K, A, B> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends A> data, int i10, int i11, K k10, K k11) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(((WrapperPageKeyedDataSource) this.this$0).listFunction, data), i10, i11, k10, k11);
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends A> data, K k10, K k11) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(((WrapperPageKeyedDataSource) this.this$0).listFunction, data), k10, k11);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }
}
