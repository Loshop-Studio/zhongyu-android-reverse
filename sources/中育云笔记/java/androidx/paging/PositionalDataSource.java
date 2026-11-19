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
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@InterfaceC10770a
/* loaded from: classes3.dex */
public abstract class PositionalDataSource<T> extends DataSource<Integer, T> {
    public static final Companion Companion = new Companion(null);
    private final boolean isContiguous;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        public final int computeInitialLoadPosition(LoadInitialParams params, int i10) {
            AbstractC9979u.m20294g(params, "params");
            int i11 = params.requestedStartPosition;
            int i12 = params.requestedLoadSize;
            int i13 = params.pageSize;
            return Math.max(0, Math.min(((((i10 - i12) + i13) - 1) / i13) * i13, (i11 / i13) * i13));
        }

        public final int computeInitialLoadSize(LoadInitialParams params, int i10, int i11) {
            AbstractC9979u.m20294g(params, "params");
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

    public static /* synthetic */ void isContiguous$paging_common$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadRange(final LoadRangeParams loadRangeParams, InterfaceC11588c<? super DataSource.BaseResult<T>> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadRange(loadRangeParams, new LoadRangeCallback<T>() { // from class: androidx.paging.PositionalDataSource$loadRange$2$1
            @Override // androidx.paging.PositionalDataSource.LoadRangeCallback
            public void onResult(List<? extends T> data) {
                AbstractC9979u.m20294g(data, "data");
                int i10 = loadRangeParams.startPosition;
                Integer numValueOf = i10 == 0 ? null : Integer.valueOf(i10);
                if (this.isInvalid()) {
                    InterfaceC11125j interfaceC11125j = c9997c;
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11125j.resumeWith(Result.m20054c(DataSource.BaseResult.Companion.empty$paging_common()));
                } else {
                    InterfaceC11125j interfaceC11125j2 = c9997c;
                    Result.C9921a c9921a2 = Result.f23263d;
                    interfaceC11125j2.resumeWith(Result.m20054c(new DataSource.BaseResult(data, numValueOf, Integer.valueOf(loadRangeParams.startPosition + data.size()), 0, 0, 24, null)));
                }
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$0(Function function, List list) {
        AbstractC9979u.m20291d(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$1(InterfaceC9540l interfaceC9540l, List list) {
        AbstractC9979u.m20291d(list);
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(interfaceC9540l.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$0(InterfaceC9540l interfaceC9540l, List list) {
        AbstractC9979u.m20291d(list);
        return (List) interfaceC9540l.invoke(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.paging.DataSource
    public /* bridge */ /* synthetic */ Integer getKeyInternal$paging_common(Object obj) {
        return getKeyInternal$paging_common((PositionalDataSource<T>) obj);
    }

    @Override // androidx.paging.DataSource
    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common(DataSource.Params<Integer> params, InterfaceC11588c<? super DataSource.BaseResult<T>> interfaceC11588c) {
        if (params.getType$paging_common() != LoadType.REFRESH) {
            Integer key = params.getKey();
            AbstractC9979u.m20291d(key);
            int iIntValue = key.intValue();
            int pageSize = params.getPageSize();
            if (params.getType$paging_common() == LoadType.PREPEND) {
                pageSize = Math.min(pageSize, iIntValue);
                iIntValue -= pageSize;
            }
            return loadRange(new LoadRangeParams(iIntValue, pageSize), interfaceC11588c);
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
        return loadInitial$paging_common(new LoadInitialParams(iMax, initialLoadSize, params.getPageSize(), params.getPlaceholdersEnabled()), interfaceC11588c);
    }

    @WorkerThread
    public abstract void loadInitial(LoadInitialParams loadInitialParams, LoadInitialCallback<T> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common(final LoadInitialParams loadInitialParams, InterfaceC11588c<? super DataSource.BaseResult<T>> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadInitial(loadInitialParams, new LoadInitialCallback<T>(this) { // from class: androidx.paging.PositionalDataSource$loadInitial$2$1
            final /* synthetic */ PositionalDataSource<T> this$0;

            {
                this.this$0 = this;
            }

            private final void resume(PositionalDataSource.LoadInitialParams loadInitialParams2, DataSource.BaseResult<T> baseResult) {
                if (loadInitialParams2.placeholdersEnabled) {
                    baseResult.validateForInitialTiling$paging_common(loadInitialParams2.pageSize);
                }
                c9997c.resumeWith(Result.m20054c(baseResult));
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends T> data, int i10, int i11) {
                AbstractC9979u.m20294g(data, "data");
                if (!this.this$0.isInvalid()) {
                    int size = data.size() + i10;
                    resume(loadInitialParams, new DataSource.BaseResult<>(data, i10 == 0 ? null : Integer.valueOf(i10), size != i11 ? Integer.valueOf(size) : null, i10, (i11 - data.size()) - i10));
                } else {
                    InterfaceC11125j interfaceC11125j = c9997c;
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11125j.resumeWith(Result.m20054c(DataSource.BaseResult.Companion.empty$paging_common()));
                }
            }

            @Override // androidx.paging.PositionalDataSource.LoadInitialCallback
            public void onResult(List<? extends T> data, int i10) {
                AbstractC9979u.m20294g(data, "data");
                if (this.this$0.isInvalid()) {
                    InterfaceC11125j interfaceC11125j = c9997c;
                    Result.C9921a c9921a = Result.f23263d;
                    interfaceC11125j.resumeWith(Result.m20054c(DataSource.BaseResult.Companion.empty$paging_common()));
                    return;
                }
                resume(loadInitialParams, new DataSource.BaseResult<>(data, i10 == 0 ? null : Integer.valueOf(i10), Integer.valueOf(data.size() + i10), i10, Integer.MIN_VALUE));
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    @WorkerThread
    public abstract void loadRange(LoadRangeParams loadRangeParams, LoadRangeCallback<T> loadRangeCallback);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.paging.DataSource
    public final Integer getKeyInternal$paging_common(T item) {
        AbstractC9979u.m20294g(item, "item");
        throw new IllegalStateException("Cannot get key by item in positionalDataSource");
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> map(final Function<T, V> function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.b1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$0(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> mapByPage(Function<List<T>, List<V>> function) {
        AbstractC9979u.m20294g(function, "function");
        return new WrapperPositionalDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> map(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.c1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.map$lambda$1(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <V> PositionalDataSource<V> mapByPage(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.a1
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PositionalDataSource.mapByPage$lambda$0(function, (List) obj);
            }
        });
    }
}
