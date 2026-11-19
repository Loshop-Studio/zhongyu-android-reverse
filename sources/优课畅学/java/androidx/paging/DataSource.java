package androidx.paging;

import androidx.annotation.AnyThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.util.Function;
import androidx.paging.DataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlinx.coroutines.CoroutineDispatcher;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p135i8.C8843i0;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public abstract class DataSource<Key, Value> {
    public static final Companion Companion = new Companion(null);
    private final InvalidateCallbackTracker<InvalidatedCallback> invalidateCallbackTracker;
    private final boolean isContiguous;
    private final boolean supportsPageDropping;
    private final KeyType type;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <A, B> List<B> convert$paging_common_release(Function<List<A>, List<B>> function, List<? extends A> source) {
            AbstractC9133u.m16133g(function, "function");
            AbstractC9133u.m16133g(source, "source");
            List<B> dest = function.apply(source);
            if (dest.size() == source.size()) {
                AbstractC9133u.m16132f(dest, "dest");
                return dest;
            }
            throw new IllegalStateException("Invalid Function " + function + " changed return size. This is not supported.");
        }

        private Companion() {
        }
    }

    public static abstract class Factory<Key, Value> {
        public static /* synthetic */ InterfaceC10559a asPagingSourceFactory$default(Factory factory, CoroutineDispatcher coroutineDispatcher, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asPagingSourceFactory");
            }
            if ((i10 & 1) != 0) {
                coroutineDispatcher = C8843i0.m14867b();
            }
            return factory.asPagingSourceFactory(coroutineDispatcher);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List map$lambda$1(Function function, List list) {
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
        public static final List map$lambda$2(InterfaceC10570l function, List list) {
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

        public final InterfaceC10559a asPagingSourceFactory() {
            return asPagingSourceFactory$default(this, null, 1, null);
        }

        public abstract DataSource<Key, Value> create();

        public <ToValue> Factory<Key, ToValue> map(final Function<Value, ToValue> function) {
            AbstractC9133u.m16133g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.e
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.map$lambda$1(function, (List) obj);
                }
            });
        }

        public <ToValue> Factory<Key, ToValue> mapByPage(final Function<List<Value>, List<ToValue>> function) {
            AbstractC9133u.m16133g(function, "function");
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

        public final InterfaceC10559a asPagingSourceFactory(final CoroutineDispatcher fetchDispatcher) {
            AbstractC9133u.m16133g(fetchDispatcher, "fetchDispatcher");
            return new SuspendingPagingSourceFactory(fetchDispatcher, new InterfaceC10559a() { // from class: androidx.paging.DataSource$Factory$asPagingSourceFactory$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p300x7.InterfaceC10559a
                public final PagingSource<Key, Value> invoke() {
                    return new LegacyPagingSource(fetchDispatcher, this.create());
                }
            });
        }

        public /* synthetic */ Factory map(final InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.f
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.map$lambda$2(function, (List) obj);
                }
            });
        }

        public /* synthetic */ Factory mapByPage(final InterfaceC10570l function) {
            AbstractC9133u.m16133g(function, "function");
            return mapByPage(new Function() { // from class: androidx.paging.g
                @Override // androidx.arch.core.util.Function
                public final Object apply(Object obj) {
                    return DataSource.Factory.mapByPage$lambda$3(function, (List) obj);
                }
            });
        }
    }

    public interface InvalidatedCallback {
        @AnyThread
        void onInvalidated();
    }

    public enum KeyType {
        POSITIONAL,
        PAGE_KEYED,
        ITEM_KEYED
    }

    public static final class Params<K> {
        private final int initialLoadSize;
        private final K key;
        private final int pageSize;
        private final boolean placeholdersEnabled;
        private final LoadType type;

        public Params(LoadType type, K k10, int i10, boolean z10, int i11) {
            AbstractC9133u.m16133g(type, "type");
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

        public final LoadType getType$paging_common_release() {
            return this.type;
        }
    }

    public DataSource(KeyType type) {
        AbstractC9133u.m16133g(type, "type");
        this.type = type;
        this.invalidateCallbackTracker = new InvalidateCallbackTracker<>(new InterfaceC10570l() { // from class: androidx.paging.DataSource$invalidateCallbackTracker$1
            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((DataSource.InvalidatedCallback) obj);
                return C8736p.f16368a;
            }

            public final void invoke(DataSource.InvalidatedCallback it) {
                AbstractC9133u.m16133g(it, "it");
                it.onInvalidated();
            }
        }, new InterfaceC10559a(this) { // from class: androidx.paging.DataSource$invalidateCallbackTracker$2
            final /* synthetic */ DataSource<Key, Value> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public final Boolean invoke() {
                return Boolean.valueOf(this.this$0.isInvalid());
            }
        });
        this.isContiguous = true;
        this.supportsPageDropping = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object map$lambda$1(InterfaceC10570l function, Object it) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(it, "it");
        return function.invoke(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List mapByPage$lambda$0(InterfaceC10570l function, List it) {
        AbstractC9133u.m16133g(function, "$function");
        AbstractC9133u.m16132f(it, "it");
        return (List) function.invoke(it);
    }

    @AnyThread
    public void addInvalidatedCallback(InvalidatedCallback onInvalidatedCallback) {
        AbstractC9133u.m16133g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.registerInvalidatedCallback$paging_common_release(onInvalidatedCallback);
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.callbackCount$paging_common_release();
    }

    public abstract Key getKeyInternal$paging_common_release(Value value);

    public boolean getSupportsPageDropping$paging_common_release() {
        return this.supportsPageDropping;
    }

    public final KeyType getType$paging_common_release() {
        return this.type;
    }

    @AnyThread
    public void invalidate() {
        this.invalidateCallbackTracker.invalidate$paging_common_release();
    }

    public boolean isContiguous$paging_common_release() {
        return this.isContiguous;
    }

    @WorkerThread
    public boolean isInvalid() {
        return this.invalidateCallbackTracker.getInvalid$paging_common_release();
    }

    public abstract Object load$paging_common_release(Params<Key> params, InterfaceC9324c<? super BaseResult<Value>> interfaceC9324c);

    public <ToValue> DataSource<Key, ToValue> map(final Function<Value, ToValue> function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage(new InterfaceC10570l() { // from class: androidx.paging.DataSource.map.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p300x7.InterfaceC10570l
            public final List<ToValue> invoke(List<? extends Value> list) {
                AbstractC9133u.m16133g(list, "list");
                Function<Value, ToValue> function2 = function;
                ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(function2.apply(it.next()));
                }
                return arrayList;
            }
        });
    }

    public <ToValue> DataSource<Key, ToValue> mapByPage(Function<List<Value>, List<ToValue>> function) {
        AbstractC9133u.m16133g(function, "function");
        return new WrapperDataSource(this, function);
    }

    @AnyThread
    public void removeInvalidatedCallback(InvalidatedCallback onInvalidatedCallback) {
        AbstractC9133u.m16133g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.unregisterInvalidatedCallback$paging_common_release(onInvalidatedCallback);
    }

    public /* synthetic */ DataSource map(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return map(new Function() { // from class: androidx.paging.c
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return DataSource.map$lambda$1(function, obj);
            }
        });
    }

    public /* synthetic */ DataSource mapByPage(final InterfaceC10570l function) {
        AbstractC9133u.m16133g(function, "function");
        return mapByPage(new Function() { // from class: androidx.paging.d
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
            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public final <ToValue, Value> BaseResult<Value> convert$paging_common_release(BaseResult<ToValue> result, Function<List<ToValue>, List<Value>> function) {
                AbstractC9133u.m16133g(result, "result");
                AbstractC9133u.m16133g(function, "function");
                return new BaseResult<>(DataSource.Companion.convert$paging_common_release(function, result.data), result.getPrevKey(), result.getNextKey(), result.getItemsBefore(), result.getItemsAfter());
            }

            public final <T> BaseResult<T> empty$paging_common_release() {
                return new BaseResult<>(AbstractC8809v.m14771n(), null, null, 0, 0);
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public BaseResult(List<? extends Value> data, Object obj, Object obj2, int i10, int i11) {
            AbstractC9133u.m16133g(data, "data");
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
                if (AbstractC9133u.m16128b(this.data, baseResult.data) && AbstractC9133u.m16128b(this.prevKey, baseResult.prevKey) && AbstractC9133u.m16128b(this.nextKey, baseResult.nextKey) && this.itemsBefore == baseResult.itemsBefore && this.itemsAfter == baseResult.itemsAfter) {
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

        public final void validateForInitialTiling$paging_common_release(int i10) {
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

        public /* synthetic */ BaseResult(List list, Object obj, Object obj2, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
            this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
        }
    }
}
