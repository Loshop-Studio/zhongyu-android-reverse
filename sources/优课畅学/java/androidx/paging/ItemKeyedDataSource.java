package androidx.paging;

import androidx.annotation.VisibleForTesting;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.C9155c;
import p123h7.InterfaceC8721a;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8811w;
import p135i8.InterfaceC8845j;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.AbstractC9541f;
import p300x7.InterfaceC10570l;

@InterfaceC8721a
/* loaded from: classes3.dex */
public abstract class ItemKeyedDataSource<Key, Value> extends DataSource<Key, Value> {

    public static abstract class LoadCallback<Value> {
        public abstract void onResult(List<? extends Value> list);
    }

    public static abstract class LoadInitialCallback<Value> extends LoadCallback<Value> {
        public abstract void onResult(List<? extends Value> list, int i10, int i11);
    }

    public static class LoadInitialParams<Key> {
        public final boolean placeholdersEnabled;
        public final Key requestedInitialKey;
        public final int requestedLoadSize;

        public LoadInitialParams(Key key, int i10, boolean z10) {
            this.requestedInitialKey = key;
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

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoadType.values().length];
            try {
                iArr[LoadType.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoadType.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoadType.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ItemKeyedDataSource() {
        super(DataSource.KeyType.ITEM_KEYED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C43081 asCallback(final InterfaceC8845j interfaceC8845j) {
        return new LoadCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource.asCallback.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j2 = interfaceC8845j;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j2.resumeWith(Result.m15909b(new DataSource.BaseResult(data, this.getPrevKey$paging_common_release(data), this.getNextKey$paging_common_release(data), 0, 0, 24, null)));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$7(Function function, List list) {
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
    public static final List map$lambda$8(InterfaceC10570l function, List list) {
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
    public static final List mapByPage$lambda$5(InterfaceC10570l function, List it) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(it, "it");
        return (List) function.invoke(it);
    }

    public abstract Key getKey(Value value);

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common_release(Value item) {
        AbstractC9133u.m16133g(item, "item");
        return getKey(item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getNextKey$paging_common_release(List<? extends Value> list) {
        AbstractC9133u.m16133g(list, "<this>");
        Object objM14579y0 = AbstractC8778f0.m14579y0(list);
        if (objM14579y0 != null) {
            return (Key) getKey(objM14579y0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getPrevKey$paging_common_release(List<? extends Value> list) {
        AbstractC9133u.m16133g(list, "<this>");
        Object objM14568n0 = AbstractC8778f0.m14568n0(list);
        if (objM14568n0 != null) {
            return (Key) getKey(objM14568n0);
        }
        return null;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common_release(DataSource.Params<Key> params, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[params.getType$paging_common_release().ordinal()];
        if (i10 == 1) {
            return loadInitial$paging_common_release(new LoadInitialParams<>(params.getKey(), params.getInitialLoadSize(), params.getPlaceholdersEnabled()), interfaceC9324c);
        }
        if (i10 == 2) {
            Key key = params.getKey();
            AbstractC9133u.m16130d(key);
            return loadBefore$paging_common_release(new LoadParams<>(key, params.getPageSize()), interfaceC9324c);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Key key2 = params.getKey();
        AbstractC9133u.m16130d(key2);
        return loadAfter$paging_common_release(new LoadParams<>(key2, params.getPageSize()), interfaceC9324c);
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadAfter$paging_common_release(LoadParams<Key> loadParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadAfter(loadParams, asCallback(c9155c));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadBefore$paging_common_release(LoadParams<Key> loadParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadBefore(loadParams, asCallback(c9155c));
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Value> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common_release(LoadInitialParams<Key> loadInitialParams, InterfaceC9324c<? super DataSource.BaseResult<Value>> interfaceC9324c) {
        final C9155c c9155c = new C9155c(IntrinsicsKt__IntrinsicsJvmKt.m16079d(interfaceC9324c), 1);
        c9155c.m16343D();
        loadInitial(loadInitialParams, new LoadInitialCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, int i10, int i11) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(new DataSource.BaseResult(data, this.getPrevKey$paging_common_release(data), this.getNextKey$paging_common_release(data), i10, (i11 - data.size()) - i10)));
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data) {
                AbstractC9133u.m16133g(data, "data");
                InterfaceC8845j interfaceC8845j = c9155c;
                Result.C9076a c9076a = Result.f17350b;
                interfaceC8845j.resumeWith(Result.m15909b(new DataSource.BaseResult(data, this.getPrevKey$paging_common_release(data), this.getNextKey$paging_common_release(data), 0, 0, 24, null)));
            }
        });
        Object objM16372x = c9155c.m16372x();
        if (objM16372x == AbstractC9434a.m17291f()) {
            AbstractC9541f.m17811c(interfaceC9324c);
        }
        return objM16372x;
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.j
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.map$lambda$7(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9133u.m16133g(function, "function");
        return new WrapperItemKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.h
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.map$lambda$8(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.i
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.mapByPage$lambda$5(function, (List) obj);
            }
        });
    }
}
