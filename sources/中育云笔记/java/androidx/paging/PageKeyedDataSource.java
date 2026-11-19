package androidx.paging;

import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
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
            AbstractC9979u.m20294g(key, "key");
            this.key = key;
            this.requestedLoadSize = i10;
        }
    }

    public PageKeyedDataSource() {
        super(DataSource.KeyType.PAGE_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LoadCallback<Key, Value> continuationAsCallback(final InterfaceC11125j interfaceC11125j, final boolean z10) {
        return new LoadCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource.continuationAsCallback.1
            @Override // androidx.paging.PageKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data, Key key) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j2 = interfaceC11125j;
                Result.C9921a c9921a = Result.f23263d;
                boolean z11 = z10;
                interfaceC11125j2.resumeWith(Result.m20054c(new DataSource.BaseResult(data, z11 ? null : key, z11 ? key : null, 0, 0, 24, null)));
            }
        };
    }

    public static /* synthetic */ void getSupportsPageDropping$paging_common$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadAfter(LoadParams<Key> loadParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadAfter(loadParams, continuationAsCallback(c9997c, true));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadBefore(LoadParams<Key> loadParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadBefore(loadParams, continuationAsCallback(c9997c, false));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadInitial(LoadInitialParams<Key> loadInitialParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadInitial(loadInitialParams, new LoadInitialCallback<Key, Value>() { // from class: androidx.paging.PageKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, int i10, int i11, Key key, Key key2) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(new DataSource.BaseResult(data, key, key2, i10, (i11 - data.size()) - i10)));
            }

            @Override // androidx.paging.PageKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, Key key, Key key2) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(new DataSource.BaseResult(data, key, key2, 0, 0, 24, null)));
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
        Iterator it = list2.iterator();
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
        Iterator it = list2.iterator();
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

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(Value item) {
        AbstractC9979u.m20294g(item, "item");
        throw new IllegalStateException("Cannot get key by item in pageKeyedDataSource");
    }

    @Override // androidx.paging.DataSource
    public boolean getSupportsPageDropping$paging_common() {
        return this.supportsPageDropping;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common(DataSource.Params<Key> params, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        if (params.getType$paging_common() == LoadType.REFRESH) {
            return loadInitial(new LoadInitialParams<>(params.getInitialLoadSize(), params.getPlaceholdersEnabled()), interfaceC11588c);
        }
        if (params.getKey() == null) {
            return DataSource.BaseResult.Companion.empty$paging_common();
        }
        if (params.getType$paging_common() == LoadType.PREPEND) {
            return loadBefore(new LoadParams<>(params.getKey(), params.getPageSize()), interfaceC11588c);
        }
        if (params.getType$paging_common() == LoadType.APPEND) {
            return loadAfter(new LoadParams<>(params.getKey(), params.getPageSize()), interfaceC11588c);
        }
        throw new IllegalArgumentException("Unsupported type " + params.getType$paging_common());
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Key, Value> loadCallback);

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Key, Value> loadInitialCallback);

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.f0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$0(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9979u.m20294g(function, "function");
        return new WrapperPageKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> map(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.h0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.map$lambda$1(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> PageKeyedDataSource<Key, ToValue> mapByPage(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.g0
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return PageKeyedDataSource.mapByPage$lambda$0(function, (List) obj);
            }
        });
    }
}
