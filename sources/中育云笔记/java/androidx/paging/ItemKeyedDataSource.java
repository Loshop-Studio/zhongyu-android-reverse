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
import kotlin.jvm.internal.AbstractC9979u;
import kotlinx.coroutines.C9997c;
import p181hd.InterfaceC9540l;
import p309qc.InterfaceC10770a;
import p325rc.AbstractC10947g0;
import p325rc.AbstractC10980x;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11831f;
import sd.InterfaceC11125j;
import vc.InterfaceC11588c;

@InterfaceC10770a
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
            AbstractC9979u.m20294g(key, "key");
            this.key = key;
            this.requestedLoadSize = i10;
        }
    }

    public static final /* synthetic */ class WhenMappings {
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
    public final C42301 asCallback(final InterfaceC11125j interfaceC11125j) {
        return new LoadCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource.asCallback.1
            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j2 = interfaceC11125j;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j2.resumeWith(Result.m20054c(new DataSource.BaseResult(data, this.getPrevKey$paging_common(data), this.getNextKey$paging_common(data), 0, 0, 24, null)));
            }
        };
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

    public abstract Key getKey(Value value);

    @Override // androidx.paging.DataSource
    public Key getKeyInternal$paging_common(Value item) {
        AbstractC9979u.m20294g(item, "item");
        return getKey(item);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getNextKey$paging_common(List<? extends Value> list) {
        AbstractC9979u.m20294g(list, "<this>");
        Object objM23957z0 = AbstractC10947g0.m23957z0(list);
        if (objM23957z0 != null) {
            return (Key) getKey(objM23957z0);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Key getPrevKey$paging_common(List<? extends Value> list) {
        AbstractC9979u.m20294g(list, "<this>");
        Object objM23946o0 = AbstractC10947g0.m23946o0(list);
        if (objM23946o0 != null) {
            return (Key) getKey(objM23946o0);
        }
        return null;
    }

    @Override // androidx.paging.DataSource
    public final Object load$paging_common(DataSource.Params<Key> params, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[params.getType$paging_common().ordinal()];
        if (i10 == 1) {
            return loadInitial$paging_common(new LoadInitialParams<>(params.getKey(), params.getInitialLoadSize(), params.getPlaceholdersEnabled()), interfaceC11588c);
        }
        if (i10 == 2) {
            Key key = params.getKey();
            AbstractC9979u.m20291d(key);
            return loadBefore$paging_common(new LoadParams<>(key, params.getPageSize()), interfaceC11588c);
        }
        if (i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Key key2 = params.getKey();
        AbstractC9979u.m20291d(key2);
        return loadAfter$paging_common(new LoadParams<>(key2, params.getPageSize()), interfaceC11588c);
    }

    public abstract void loadAfter(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadAfter$paging_common(LoadParams<Key> loadParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadAfter(loadParams, asCallback(c9997c));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public abstract void loadBefore(LoadParams<Key> loadParams, LoadCallback<Value> loadCallback);

    @VisibleForTesting
    public final Object loadBefore$paging_common(LoadParams<Key> loadParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadBefore(loadParams, asCallback(c9997c));
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    public abstract void loadInitial(LoadInitialParams<Key> loadInitialParams, LoadInitialCallback<Value> loadInitialCallback);

    @VisibleForTesting
    public final Object loadInitial$paging_common(LoadInitialParams<Key> loadInitialParams, InterfaceC11588c<? super DataSource.BaseResult<Value>> interfaceC11588c) {
        final C9997c c9997c = new C9997c(IntrinsicsKt__IntrinsicsJvmKt.m20224d(interfaceC11588c), 1);
        c9997c.m20503F();
        loadInitial(loadInitialParams, new LoadInitialCallback<Value>() { // from class: androidx.paging.ItemKeyedDataSource$loadInitial$2$1
            @Override // androidx.paging.ItemKeyedDataSource.LoadInitialCallback
            public void onResult(List<? extends Value> data, int i10, int i11) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(new DataSource.BaseResult(data, this.getPrevKey$paging_common(data), this.getNextKey$paging_common(data), i10, (i11 - data.size()) - i10)));
            }

            @Override // androidx.paging.ItemKeyedDataSource.LoadCallback
            public void onResult(List<? extends Value> data) {
                AbstractC9979u.m20294g(data, "data");
                InterfaceC11125j interfaceC11125j = c9997c;
                Result.C9921a c9921a = Result.f23263d;
                interfaceC11125j.resumeWith(Result.m20054c(new DataSource.BaseResult(data, this.getPrevKey$paging_common(data), this.getNextKey$paging_common(data), 0, 0, 24, null)));
            }
        });
        Object objM20538x = c9997c.m20538x();
        if (objM20538x == AbstractC11725a.m25952f()) {
            AbstractC11831f.m26221c(interfaceC11588c);
        }
        return objM20538x;
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.v
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.map$lambda$0(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9979u.m20294g(function, "function");
        return new WrapperItemKeyedDataSource(this, function);
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> map(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.t
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.map$lambda$1(function, (List) obj);
            }
        });
    }

    @Override // androidx.paging.DataSource
    public final <ToValue> ItemKeyedDataSource<Key, ToValue> mapByPage(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage((Function) new Function() { // from class: androidx.paging.u
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return ItemKeyedDataSource.mapByPage$lambda$0(function, (List) obj);
            }
        });
    }
}
