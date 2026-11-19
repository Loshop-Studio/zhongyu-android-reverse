package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import androidx.paging.PositionalDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

@InterfaceC8721a
/* loaded from: classes3.dex */
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {
    public static final Companion Companion = new Companion(null);
    private final boolean isContiguous;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final int computeInitialLoadPosition(LoadInitialParams params, int i10) {
            AbstractC9133u.m16133g(params, "params");
            int i11 = params.requestedStartPosition;
            int i12 = params.requestedLoadSize;
            int i13 = params.pageSize;
            return Math.max(0, Math.min(((((i10 - i12) + i13) - 1) / i13) * i13, (i11 / i13) * i13));
        }

        public final int computeInitialLoadSize(LoadInitialParams params, int i10, int i11) {
            AbstractC9133u.m16133g(params, "params");
            return Math.min(i11 - i10, params.requestedLoadSize);
        }

        private Companion() {
        }
    }

    public static abstract class LoadInitialCallback<T> {
        public abstract void onResult(List<? extends T> list, int i10);

        public abstract void onResult(List<? extends T> list, int i10, int i11);
    }

    public static class LoadInitialParams {
        public final int pageSize;
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;
        public final int requestedStartPosition;

        public LoadInitialParams(int i10, int i11, int i12, boolean z10) {
            this.requestedStartPosition = i10;
            this.requestedLoadSize = i11;
            this.pageSize = i12;
            this.placeholdersEnabled = z10;
            if (i10 < 0) {
                throw new IllegalStateException(("invalid start position: " + i10).toString());
            }
            if (i11 < 0) {
                throw new IllegalStateException(("invalid load size: " + i11).toString());
            }
            if (i12 >= 0) {
                return;
            }
            throw new IllegalStateException(("invalid page size: " + i12).toString());
        }
    }

    public static abstract class LoadRangeCallback<T> {
        public abstract void onResult(List<? extends T> list);
    }

    public static class LoadRangeParams {
        public final int loadSize;
        public final int startPosition;

        public LoadRangeParams(int i10, int i11) {
            this.startPosition = i10;
            this.loadSize = i11;
        }
    }

    public PositionalDataSource() {
        super(DataSource.KeyType.POSITIONAL);
    }

    public static final int computeInitialLoadPosition(LoadInitialParams loadInitialParams, int i10) {
        return Companion.computeInitialLoadPosition(loadInitialParams, i10);
    }

    public static final int computeInitialLoadSize(LoadInitialParams loadInitialParams, int i10, int i11) {
        return Companion.computeInitialLoadSize(loadInitialParams, i10, i11);
    }

    public static /* synthetic */ void isContiguous$paging_common_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadRange(final LoadRangeParams loadRangeParams, InterfaceC9324c<? super DataSource.BaseResult<T>> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadRange(loadRangeParams, new LoadRangeCallback<T>() { // from class: androidx.paging.PositionalDataSource$loadRange$2$1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public void onResult(List<? extends T> data) {
                AbstractC9133u.m16133g(data, "data");
                int i10 = loadRangeParams.startPosition;
                Integer numValueOf = i10 == 0 ? null : Integer.valueOf(i10);
                if (this.isInvalid()) {
                    InterfaceC8845j interfaceC8845j = c9155c;
                    Result.C9076a c9076a = Result.f17350b;
                    interfaceC8845j.resumeWith(Result.m15909b(DataSource.BaseResult.Companion.empty$paging_common_release()));
                } else {
                    InterfaceC8845j interfaceC8845j2 = c9155c;
                    Result.C9076a c9076a2 = Result.f17350b;
                    interfaceC8845j2.resumeWith(Result.m15909b(new DataSource.BaseResult(data, numValueOf, Integer.valueOf(loadRangeParams.startPosition + data.size()), 0, 0, 24, null)));
                }
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$4(Function function, List list) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(list, "list");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$5(InterfaceC10570l function, List list) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(list, "list");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$2(InterfaceC10570l function, List it) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(it, "it");
        return (List) function.invoke(it);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.DataSource
    public /* bridge */ /* synthetic */ Integer getKeyInternal$paging_common_release(Object obj) {
        return getKeyInternal$paging_common_release((PositionalDataSource<T>) obj);
    }

    @Override // androidx.paging.DataSource
    public boolean isContiguous$paging_common_release() {
        return this.isContiguous;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common_release(DataSource.Params<Integer> params, InterfaceC9324c<? super DataSource.BaseResult<T>> interfaceC9324c) {
        if (params.getType$paging_common_release() != LoadType.REFRESH) {
            Integer key = params.getKey();
            AbstractC9133u.m16130d(key);
            int iIntValue = key.intValue();
            int pageSize = params.getPageSize();
            if (params.getType$paging_common_release() == LoadType.PREPEND) {
                pageSize = Math.min(pageSize, iIntValue);
                iIntValue -= pageSize;
            }
            return loadRange(new LoadRangeParams(iIntValue, pageSize), interfaceC9324c);
        }
        int initialLoadSize = params.getInitialLoadSize();
        int iMax = 0;
        if (params.getKey() != null) {
            int iIntValue2 = params.getKey().intValue();
            if (params.getPlaceholdersEnabled()) {
                initialLoadSize = Math.max(initialLoadSize / params.getPageSize(), 2) * params.getPageSize();
                iMax = Math.max(0, ((iIntValue2 - (initialLoadSize / 2)) / params.getPageSize()) * params.getPageSize());
            } else {
                iMax = Math.max(0, iIntValue2 - (initialLoadSize / 2));
            }
        }
        return loadInitial$paging_common_release(new LoadInitialParams(iMax, initialLoadSize, params.getPageSize(), params.getPlaceholdersEnabled()), interfaceC9324c);
    }

    @WorkerThread
    public abstract void loadInitial(LoadInitialParams loadInitialParams, LoadInitialCallback<T> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common_release(final LoadInitialParams loadInitialParams, InterfaceC9324c<? super DataSource.BaseResult<T>> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadInitial(loadInitialParams, new LoadInitialCallback<T>(this) { // from class: androidx.paging.PositionalDataSource$loadInitial$2$1
            final /* synthetic */ PositionalDataSource<T> this$0;

            {
                this.this$0 = this;
            }

            private final void resume(PositionalDataSource.LoadInitialParams loadInitialParams2, DataSource.BaseResult<T> baseResult) {
                if (loadInitialParams2.placeholdersEnabled) {
                    baseResult.validateForInitialTiling$paging_common_release(loadInitialParams2.pageSize);
                }
                c9155c.resumeWith(Result.m15909b(baseResult));
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends T> data, int i10, int i11) {
                AbstractC9133u.m16133g(data, "data");
                if (!this.this$0.isInvalid()) {
                    int size = data.size() + i10;
                    resume(loadInitialParams, new DataSource.BaseResult<>(data, i10 == 0 ? null : Integer.valueOf(i10), size != i11 ? Integer.valueOf(size) : null, i10, (i11 - data.size()) - i10));
                } else {
                    InterfaceC8845j interfaceC8845j = c9155c;
                    Result.C9076a c9076a = Result.f17350b;
                    interfaceC8845j.resumeWith(Result.m15909b(DataSource.BaseResult.Companion.empty$paging_common_release()));
                }
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends T> data, int i10) {
                AbstractC9133u.m16133g(data, "data");
                if (this.this$0.isInvalid()) {
                    InterfaceC8845j interfaceC8845j = c9155c;
                    Result.C9076a c9076a = Result.f17350b;
                    interfaceC8845j.resumeWith(Result.m15909b(DataSource.BaseResult.Companion.empty$paging_common_release()));
                    return;
                }
                resume(loadInitialParams, new DataSource.BaseResult<>(data, i10 == 0 ? null : Integer.valueOf(i10), Integer.valueOf(data.size() + i10), i10, Integer.MIN_VALUE));
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    @WorkerThread
    public abstract void loadRange(LoadRangeParams loadRangeParams, LoadRangeCallback<T> loadRangeCallback);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.DataSource
    public final Integer getKeyInternal$paging_common_release(T item) {
        AbstractC9133u.m16133g(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> map(final Function<T, V> function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.p
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$4(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> mapByPage(Function<List<T>, List<V>> function) {
        AbstractC9133u.m16133g(function, "function");
        return new WrapperPositionalDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> map(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.q
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$5(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> mapByPage(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.o
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.mapByPage$lambda$2(function, (List) obj);
            }
        });
    }
}
