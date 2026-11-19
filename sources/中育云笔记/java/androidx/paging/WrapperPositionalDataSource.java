package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes3.dex */
public final class WrapperPositionalDataSource<A, B> extends PositionalDataSource<B> {
    private final Function<List<A>, List<B>> listFunction;
    private final PositionalDataSource<A> source;

    public WrapperPositionalDataSource(PositionalDataSource<A> source, Function<List<A>, List<B>> listFunction) {
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

    public final Function<List<A>, List<B>> getListFunction() {
        return this.listFunction;
    }

    @Override // androidx.paging.DataSource
    public void invalidate() {
        this.source.invalidate();
    }

    @Override // androidx.paging.DataSource
    public boolean isInvalid() {
        return this.source.isInvalid();
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadInitial(PositionalDataSource.LoadInitialParams params, final PositionalDataSource.LoadInitialCallback<B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadInitial(params, new PositionalDataSource.LoadInitialCallback<A>() { // from class: androidx.paging.WrapperPositionalDataSource.loadInitial.1
            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends A> data, int i10, int i11) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(this.getListFunction(), data), i10, i11);
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends A> data, int i10) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(this.getListFunction(), data), i10);
            }
        });
    }

    @Override // androidx.paging.PositionalDataSource
    public void loadRange(PositionalDataSource.LoadRangeParams params, final PositionalDataSource.LoadRangeCallback<B> callback) {
        AbstractC9979u.m20294g(params, "params");
        AbstractC9979u.m20294g(callback, "callback");
        this.source.loadRange(params, new PositionalDataSource.LoadRangeCallback<A>() { // from class: androidx.paging.WrapperPositionalDataSource.loadRange.1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public void onResult(List<? extends A> data) {
                AbstractC9979u.m20294g(data, "data");
                callback.onResult(DataSource.Companion.convert$paging_common(this.getListFunction(), data));
            }
        });
    }

    @Override // androidx.paging.DataSource
    public void removeInvalidatedCallback(DataSource.InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.source.removeInvalidatedCallback(onInvalidatedCallback);
    }
}
