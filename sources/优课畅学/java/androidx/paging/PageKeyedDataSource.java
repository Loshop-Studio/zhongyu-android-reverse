package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
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
public abstract class PageKeyedDataSource<Key, Value> extends DataSource<Key, Value> {
    private final boolean supportsPageDropping;

    public static abstract class LoadCallback<Key, Value> {
        public abstract void onResult(List<? extends Value> list, Key key);
    }

    public static abstract class LoadInitialCallback<Key, Value> {
        public abstract void onResult(List<? extends Value> list, int i10, int i11, Key key, Key key2);

        public abstract void onResult(List<? extends Value> list, Key key, Key key2);
    }

    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final int requestedLoadSize;

        public LoadInitialParams(int i10, boolean z10) {
            this.requestedLoadSize = i10;
            this.placeholdersEnabled = z10;
        }
    }

    public static class LoadParams<Key> {
        public final Key key;
        public final int requestedLoadSize;

        public LoadParams(Key key, int i10) {
            AbstractC9133u.m16133g(key, "key");
            this.key = key;
            this.requestedLoadSize = i10;
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadCallback<Key, Value> continuationAsCallback(final InterfaceC8845j interfaceC8845j, final boolean z10) {
        return new LoadCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource.continuationAsCallback.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data, Key key) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j2 = interfaceC8845j;
                Result.C9076a c9076a = Result.f17350b;
                boolean z11 = z10;
                interfaceC8845j2.resumeWith(Result.m15909b(new DataSource.BaseResult(data, z11 ? null : key, z11 ? key : null, 0, 0, 24, null)));
            }
        };
    }

    public static /* synthetic */ void getSupportsPageDropping$paging_common_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAfter(LoadParams<Key> loadParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadAfter(loadParams, continuationAsCallback(c9155c, true));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadBefore(LoadParams<Key> loadParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadBefore(loadParams, continuationAsCallback(c9155c, false));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadInitial(LoadInitialParams<Key> loadInitialParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadInitial(loadInitialParams, new LoadInitialCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, int i10, int i11, Key key, Key key2) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(new DataSource.BaseResult(data, key, key2, i10, (i11 - data.size()) - i10)));
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, Key key, Key key2) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(new DataSource.BaseResult(data, key, key2, 0, 0, 24, null)));
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$5(Function function, List list) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(list, "list");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$6(InterfaceC10570l function, List list) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(list, "list");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(function.invoke(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$3(InterfaceC10570l function, List it) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(it, "it");
        return (List) function.invoke(it);
    }

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common_release(Value item) {
        AbstractC9133u.m16133g(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    public boolean getSupportsPageDropping$paging_common_release() {
        return this.supportsPageDropping;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common_release(DataSource.Params<Key> params, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        if (params.getType$paging_common_release() == LoadType.REFRESH) {
            return loadInitial(new LoadInitialParams<>(params.getInitialLoadSize(), params.getPlaceholdersEnabled()), interfaceC9324c);
        }
        if (params.getKey() == null) {
            return DataSource.BaseResult.Companion.empty$paging_common_release();
        }
        if (params.getType$paging_common_release() == LoadType.PREPEND) {
            return loadBefore(new LoadParams<>(params.getKey(), params.getPageSize()), interfaceC9324c);
        }
        if (params.getType$paging_common_release() == LoadType.APPEND) {
            return loadAfter(new LoadParams<>(params.getKey(), params.getPageSize()), interfaceC9324c);
        }
        throw new IllegalArgumentException("Unsupported type " + params.getType$paging_common_release());
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Key, Value> loadInitialCallback);

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.l
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$5(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9133u.m16133g(function, "function");
        return new WrapperPageKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.n
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$6(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.m
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.mapByPage$lambda$3(function, (List) obj);
            }
        });
    }
}
