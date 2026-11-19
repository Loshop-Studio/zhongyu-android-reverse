package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.enums.AbstractC9953a;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;
import p325rc.AbstractC10978w;
import p325rc.AbstractC10980x;
import p425yc.InterfaceC11943a;
import sd.AbstractC11106e0;
import sd.C11157r0;
import vc.InterfaceC11588c;

/* loaded from: classes3.dex */
public abstract class DataSource<Key, Value> {
    public static final Companion Companion = new Companion(null);
    private final InvalidateCallbackTracker<InvalidatedCallback> invalidateCallbackTracker;
    private final boolean isContiguous;
    private final boolean supportsPageDropping;
    private final KeyType type;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <A, B> List<B> convert$paging_common(Function<List<A>, List<B>> function, List<? extends A> source) {
            AbstractC9979u.m20294g(function, "function");
            AbstractC9979u.m20294g(source, "source");
            List<B> listApply = function.apply(source);
            if (listApply.size() == source.size()) {
                AbstractC9979u.m20291d(listApply);
                return listApply;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }

        private Companion() {
        }
    }

    public static abstract class Factory<Key, Value> {
        public static /* synthetic */ InterfaceC9529a asPagingSourceFactory$default(Factory factory, AbstractC11106e0 abstractC11106e0, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if ((i10 & 1) != 0) {
                abstractC11106e0 = C11157r0.m24799b();
            }
            return factory.asPagingSourceFactory(abstractC11106e0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final PagingSource asPagingSourceFactory$lambda$0(AbstractC11106e0 abstractC11106e0, Factory factory) {
            return new LegacyPagingSource(abstractC11106e0, factory.create());
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

        public final InterfaceC9529a asPagingSourceFactory() {
            return asPagingSourceFactory$default(this, null, 1, null);
        }

        public abstract DataSource<Key, Value> create();

        public <ToValue> Factory<Key, ToValue> map(final Function<Value, ToValue> function) {
            AbstractC9979u.m20294g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.n
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.map$lambda$0(function, (List) obj);
                }
            });
        }

        public <ToValue> Factory<Key, ToValue> mapByPage(final Function<List<Value>, List<ToValue>> function) {
            AbstractC9979u.m20294g(function, "function");
            return new Factory<Key, ToValue>(this) { // from class: androidx.paging.DataSource$Factory$mapByPage$1
                final /* synthetic */ DataSource.Factory<Key, Value> this$0;

                {
                    this.this$0 = this;
                }

                @Override // androidx.paging.DataSource.Factory
                public DataSource<Key, ToValue> create() {
                    return this.this$0.create().mapByPage((Function) function);
                }
            };
        }

        public final InterfaceC9529a asPagingSourceFactory(final AbstractC11106e0 fetchDispatcher) {
            AbstractC9979u.m20294g(fetchDispatcher, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(fetchDispatcher, new InterfaceC9529a() { // from class: androidx.paging.o
                @Override // p181hd.InterfaceC9529a
                public final Object invoke() {
                    return DataSource.Factory.asPagingSourceFactory$lambda$0(fetchDispatcher, this);
                }
            });
        }

        public /* synthetic */ Factory map(final InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.p
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.map$lambda$1(function, (List) obj);
                }
            });
        }

        public /* synthetic */ Factory mapByPage(final InterfaceC9540l function) {
            AbstractC9979u.m20294g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.q
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.mapByPage$lambda$0(function, (List) obj);
                }
            });
        }
    }

    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class KeyType {
        private static final /* synthetic */ InterfaceC11943a $ENTRIES;
        private static final /* synthetic */ KeyType[] $VALUES;
        public static final KeyType POSITIONAL = new KeyType("POSITIONAL", 0);
        public static final KeyType PAGE_KEYED = new KeyType("PAGE_KEYED", 1);
        public static final KeyType ITEM_KEYED = new KeyType("ITEM_KEYED", 2);

        private static final /* synthetic */ KeyType[] $values() {
            return new KeyType[]{POSITIONAL, PAGE_KEYED, ITEM_KEYED};
        }

        static {
            KeyType[] keyTypeArr$values = $values();
            $VALUES = keyTypeArr$values;
            $ENTRIES = AbstractC9953a.m20230a(keyTypeArr$values);
        }

        private KeyType(String str, int i10) {
        }

        public static InterfaceC11943a getEntries() {
            return $ENTRIES;
        }

        public static KeyType valueOf(String str) {
            return (KeyType) Enum.valueOf(KeyType.class, str);
        }

        public static KeyType[] values() {
            return (KeyType[]) $VALUES.clone();
        }
    }

    public static final class Params<K> {
        private final int initialLoadSize;
        private final K key;
        private final int pageSize;
        private final boolean placeholdersEnabled;
        private final LoadType type;

        public Params(LoadType type, K k10, int i10, boolean z10, int i11) {
            AbstractC9979u.m20294g(type, "type");
            this.type = type;
            this.key = k10;
            this.initialLoadSize = i10;
            this.placeholdersEnabled = z10;
            this.pageSize = i11;
            if (type != LoadType.REFRESH && k10 == null) {
                throw new IllegalArgumentException("Key must be non-null for prepend/append");
            }
        }

        public final int getInitialLoadSize() {
            return this.initialLoadSize;
        }

        public final K getKey() {
            return this.key;
        }

        public final int getPageSize() {
            return this.pageSize;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        public final LoadType getType$paging_common() {
            return this.type;
        }
    }

    public DataSource(KeyType type) {
        AbstractC9979u.m20294g(type, "type");
        this.type = type;
        this.invalidateCallbackTracker = new InvalidateCallbackTracker<>(new InterfaceC9540l() { // from class: androidx.paging.l
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DataSource.invalidateCallbackTracker$lambda$0((DataSource.InvalidatedCallback) obj);
            }
        }, new InterfaceC9529a() { // from class: androidx.paging.m
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return Boolean.valueOf(this.f1936c.isInvalid());
            }
        });
        this.isContiguous = true;
        this.supportsPageDropping = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q invalidateCallbackTracker$lambda$0(InvalidatedCallback it) {
        AbstractC9979u.m20294g(it, "it");
        it.onInvalidated();
        return C10786q.f26013a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List map$lambda$0(Function function, List list) {
        AbstractC9979u.m20294g(list, "list");
        List list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC10980x.m24153x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(function.apply(it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object map$lambda$1(InterfaceC9540l interfaceC9540l, Object obj) {
        AbstractC9979u.m20291d(obj);
        return interfaceC9540l.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$0(InterfaceC9540l interfaceC9540l, List list) {
        AbstractC9979u.m20291d(list);
        return (List) interfaceC9540l.invoke(list);
    }

    @AnyThread
    public void addInvalidatedCallback(InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.registerInvalidatedCallback$paging_common(onInvalidatedCallback);
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common() {
        return this.invalidateCallbackTracker.callbackCount$paging_common();
    }

    public abstract Key getKeyInternal$paging_common(Value value);

    public boolean getSupportsPageDropping$paging_common() {
        return this.supportsPageDropping;
    }

    public final KeyType getType$paging_common() {
        return this.type;
    }

    @AnyThread
    public void invalidate() {
        this.invalidateCallbackTracker.invalidate$paging_common();
    }

    public boolean isContiguous$paging_common() {
        return this.isContiguous;
    }

    @WorkerThread
    public boolean isInvalid() {
        return this.invalidateCallbackTracker.getInvalid$paging_common();
    }

    public abstract Object load$paging_common(Params<Key> params, InterfaceC11588c<? super BaseResult<Value>> interfaceC11588c);

    public <ToValue> DataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage(new InterfaceC9540l() { // from class: androidx.paging.i
            @Override // p181hd.InterfaceC9540l
            public final Object invoke(Object obj) {
                return DataSource.map$lambda$0(function, (List) obj);
            }
        });
    }

    public <ToValue> DataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9979u.m20294g(function, "function");
        return new WrapperDataSource(this, function);
    }

    @AnyThread
    public void removeInvalidatedCallback(InvalidatedCallback onInvalidatedCallback) {
        AbstractC9979u.m20294g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.unregisterInvalidatedCallback$paging_common(onInvalidatedCallback);
    }

    public /* synthetic */ DataSource map(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return map(new Function() { // from class: androidx.paging.j
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return DataSource.map$lambda$1(function, obj);
            }
        });
    }

    public /* synthetic */ DataSource mapByPage(final InterfaceC9540l function) {
        AbstractC9979u.m20294g(function, "function");
        return mapByPage(new Function() { // from class: androidx.paging.k
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return DataSource.mapByPage$lambda$0(function, (List) obj);
            }
        });
    }

    public static final class BaseResult<Value> {
        public static final Companion Companion = new Companion(null);
        public final List<Value> data;
        private final int itemsAfter;
        private final int itemsBefore;
        private final Object nextKey;
        private final Object prevKey;

        public static final class Companion {
            public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
                this();
            }

            public final <ToValue, Value> BaseResult<Value> convert$paging_common(BaseResult<ToValue> result, Function<List<ToValue>, List<Value>> function) {
                AbstractC9979u.m20294g(result, "result");
                AbstractC9979u.m20294g(function, "function");
                return new BaseResult<>(DataSource.Companion.convert$paging_common(function, result.data), result.getPrevKey(), result.getNextKey(), result.getItemsBefore(), result.getItemsAfter());
            }

            public final <T> BaseResult<T> empty$paging_common() {
                return new BaseResult<>(AbstractC10978w.m24136n(), null, null, 0, 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BaseResult(List<? extends Value> data, Object obj, Object obj2, int i10, int i11) {
            AbstractC9979u.m20294g(data, "data");
            this.data = data;
            this.prevKey = obj;
            this.nextKey = obj2;
            this.itemsBefore = i10;
            this.itemsAfter = i11;
            if (i10 < 0 && i10 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Position must be non-negative");
            }
            if (data.isEmpty() && (i10 > 0 || i11 > 0)) {
                throw new IllegalArgumentException("Initial result cannot be empty if items are present in data set.");
            }
            if (i11 < 0 && i11 != Integer.MIN_VALUE) {
                throw new IllegalArgumentException("List size + position too large, last item in list beyond totalCount.");
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof BaseResult) {
                BaseResult baseResult = (BaseResult) obj;
                if (AbstractC9979u.m20289b(this.data, baseResult.data) && AbstractC9979u.m20289b(this.prevKey, baseResult.prevKey) && AbstractC9979u.m20289b(this.nextKey, baseResult.nextKey) && this.itemsBefore == baseResult.itemsBefore && this.itemsAfter == baseResult.itemsAfter) {
                    return true;
                }
            }
            return false;
        }

        public final int getItemsAfter() {
            return this.itemsAfter;
        }

        public final int getItemsBefore() {
            return this.itemsBefore;
        }

        public final Object getNextKey() {
            return this.nextKey;
        }

        public final Object getPrevKey() {
            return this.prevKey;
        }

        public final void validateForInitialTiling$paging_common(int i10) {
            int i11;
            if (this.itemsBefore == Integer.MIN_VALUE || (i11 = this.itemsAfter) == Integer.MIN_VALUE) {
                throw new IllegalStateException("Placeholders requested, but totalCount not provided. Please call the three-parameter onResult method, or disable placeholders in the PagedList.Config");
            }
            if (i11 <= 0 || this.data.size() % i10 == 0) {
                if (this.itemsBefore % i10 == 0) {
                    return;
                }
                throw new IllegalArgumentException("Initial load must be pageSize aligned.Position = " + this.itemsBefore + ", pageSize = " + i10);
            }
            throw new IllegalArgumentException("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize " + this.data.size() + ", position " + this.itemsBefore + ", totalCount " + (this.itemsBefore + this.data.size() + this.itemsAfter) + ", pageSize " + i10);
        }

        public /* synthetic */ BaseResult(List list, Object obj, Object obj2, int i10, int i11, int i12, AbstractC9972n abstractC9972n) {
            this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
        }
    }
}
