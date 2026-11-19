package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.ItemKeyedDataSource;
import java.util.IdentityHashMap;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.C10786q;

/* loaded from: classes3.dex */
public final class WrapperItemKeyedDataSource<K, A, B> extends ItemKeyedDataSource<K, B> {
    private final IdentityHashMap<B, K> keyMap;
    private final Function<List<A>, List<B>> listFunction;
    private final ItemKeyedDataSource<K, A> source;

    public WrapperItemKeyedDataSource(ItemKeyedDataSource<K, A> source, Function<List<A>, List<B>> listFunction) {
        AbstractC9979u.m20294g(source, "source");
        AbstractC9979u.m20294g(listFunction, "listFunction");
        this.source = source;
        this.listFunction = listFunction;
        this.keyMap = new IdentityHashMap<>();
    }

    @Override // androidx.paging.DataSource
    public void addInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.addInvalidatedCallback(onInvalidatedCallback);
    }

    public final List<B> convertWithStashedKeys(List<? extends A> source) {
        AbstractC9979u.m20294g(source, "source");
        List<B> listConvert$paging_common = DataSource.Companion.convert$paging_common(this.listFunction, source);
        synchronized (this.keyMap) {
            try {
                int size = listConvert$paging_common.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.keyMap.put(listConvert$paging_common.get(i10), this.source.getKey(source.get(i10)));
                }
                C10786q c10786q = C10786q.f26013a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return listConvert$paging_common;
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public K getKey(B item) {
        K k10;
        AbstractC9979u.m20294g(item, "item");
        synchronized (this.keyMap) {
            k10 = this.keyMap.get(item);
            AbstractC9979u.m20291d(k10);
        }
        return k10;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadAfter(ItemKeyedDataSource.LoadParams<K> params, final ItemKeyedDataSource.LoadCallback<B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadAfter(params, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadAfter.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends A> data) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadBefore(ItemKeyedDataSource.LoadParams<K> params, final ItemKeyedDataSource.LoadCallback<B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadBefore(params, new ItemKeyedDataSource.LoadCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadBefore.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends A> data) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.ItemKeyedDataSource
    public void loadInitial(ItemKeyedDataSource.LoadInitialParams<K> params, final ItemKeyedDataSource.LoadInitialCallback<B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadInitial(params, new ItemKeyedDataSource.LoadInitialCallback<A>() { // from class: androidx.paging.WrapperItemKeyedDataSource.loadInitial.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends A> data, int i10, int i11) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(this.convertWithStashedKeys(data), i10, i11);
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends A> data) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(this.convertWithStashedKeys(data));
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }
}
