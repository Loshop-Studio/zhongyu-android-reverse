package androidx.paging;

import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.collection.SieveCacheKt;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8680s;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p179m7.InterfaceC9324c;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;
import p311y7.InterfaceC10668a;

/* loaded from: classes3.dex */
public abstract class PagingSource<Key, Value> {
    private final InvalidateCallbackTracker<InterfaceC10559a> invalidateCallbackTracker = new InvalidateCallbackTracker<>(new InterfaceC10570l() { // from class: androidx.paging.PagingSource$invalidateCallbackTracker$1
        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((InterfaceC10559a) obj);
            return C8736p.f16368a;
        }

        public final void invoke(InterfaceC10559a it) {
            AbstractC9133u.m16133g(it, "it");
            it.invoke();
        }
    }, null, 2, 0 == true ? 1 : 0);

    public static abstract class LoadParams<Key> {
        public static final Companion Companion = new Companion(null);
        private final int loadSize;
        private final boolean placeholdersEnabled;

        public static final class Append<Key> extends LoadParams<Key> {
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Append(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                AbstractC9133u.m16133g(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public Key getKey() {
                return this.key;
            }
        }

        public static final class Companion {

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

            public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                this();
            }

            public final <Key> LoadParams<Key> create(LoadType loadType, Key key, int i10, boolean z10) {
                AbstractC9133u.m16133g(loadType, "loadType");
                int i11 = WhenMappings.$EnumSwitchMapping$0[loadType.ordinal()];
                if (i11 == 1) {
                    return new Refresh(key, i10, z10);
                }
                if (i11 == 2) {
                    if (key != null) {
                        return new Prepend(key, i10, z10);
                    }
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (key != null) {
                    return new Append(key, i10, z10);
                }
                throw new IllegalArgumentException("key cannot be null for append");
            }

            private Companion() {
            }
        }

        public static final class Prepend<Key> extends LoadParams<Key> {
            private final Key key;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Prepend(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                AbstractC9133u.m16133g(key, "key");
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public Key getKey() {
                return this.key;
            }
        }

        public static final class Refresh<Key> extends LoadParams<Key> {
            private final Key key;

            public Refresh(Key key, int i10, boolean z10) {
                super(i10, z10, null);
                this.key = key;
            }

            @Override // androidx.paging.PagingSource.LoadParams
            public Key getKey() {
                return this.key;
            }
        }

        public /* synthetic */ LoadParams(int i10, boolean z10, AbstractC9126n abstractC9126n) {
            this(i10, z10);
        }

        public abstract Key getKey();

        public final int getLoadSize() {
            return this.loadSize;
        }

        public final boolean getPlaceholdersEnabled() {
            return this.placeholdersEnabled;
        }

        private LoadParams(int i10, boolean z10) {
            this.loadSize = i10;
            this.placeholdersEnabled = z10;
        }
    }

    public static abstract class LoadResult<Key, Value> {

        public static final class Error<Key, Value> extends LoadResult<Key, Value> {
            private final Throwable throwable;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(Throwable throwable) {
                super(null);
                AbstractC9133u.m16133g(throwable, "throwable");
                this.throwable = throwable;
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            public final Throwable component1() {
                return this.throwable;
            }

            public final Error<Key, Value> copy(Throwable throwable) {
                AbstractC9133u.m16133g(throwable, "throwable");
                return new Error<>(throwable);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && AbstractC9133u.m16128b(this.throwable, ((Error) obj).throwable);
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return AbstractC8680s.m14088p("LoadResult.Error(\n                    |   throwable: " + this.throwable + "\n                    |) ", null, 1, null);
            }
        }

        public static final class Invalid<Key, Value> extends LoadResult<Key, Value> {
            public Invalid() {
                super(null);
            }

            public String toString() {
                return "LoadResult.Invalid";
            }
        }

        public static final class Page<Key, Value> extends LoadResult<Key, Value> implements Iterable<Value>, InterfaceC10668a {
            public static final int COUNT_UNDEFINED = Integer.MIN_VALUE;
            public static final Companion Companion = new Companion(null);
            private static final Page EMPTY = new Page(AbstractC8809v.m14771n(), null, null, 0, 0);
            private final List<Value> data;
            private final int itemsAfter;
            private final int itemsBefore;
            private final Key nextKey;
            private final Key prevKey;

            public static final class Companion {
                public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
                    this();
                }

                public static /* synthetic */ void getEMPTY$paging_common_release$annotations() {
                }

                public final <Key, Value> Page<Key, Value> empty$paging_common_release() {
                    Page<Key, Value> eMPTY$paging_common_release = getEMPTY$paging_common_release();
                    AbstractC9133u.m16131e(eMPTY$paging_common_release, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return eMPTY$paging_common_release;
                }

                public final Page getEMPTY$paging_common_release() {
                    return Page.EMPTY;
                }

                private Companion() {
                }
            }

            public /* synthetic */ Page(List list, Object obj, Object obj2, int i10, int i11, int i12, AbstractC9126n abstractC9126n) {
                this(list, obj, obj2, (i12 & 8) != 0 ? Integer.MIN_VALUE : i10, (i12 & 16) != 0 ? Integer.MIN_VALUE : i11);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Page copy$default(Page page, List list, Object obj, Object obj2, int i10, int i11, int i12, Object obj3) {
                if ((i12 & 1) != 0) {
                    list = page.data;
                }
                Key key = obj;
                if ((i12 & 2) != 0) {
                    key = page.prevKey;
                }
                Key key2 = obj2;
                if ((i12 & 4) != 0) {
                    key2 = page.nextKey;
                }
                if ((i12 & 8) != 0) {
                    i10 = page.itemsBefore;
                }
                if ((i12 & 16) != 0) {
                    i11 = page.itemsAfter;
                }
                int i13 = i11;
                Key key3 = key2;
                return page.copy(list, key, key3, i10, i13);
            }

            public final List<Value> component1() {
                return this.data;
            }

            public final Key component2() {
                return this.prevKey;
            }

            public final Key component3() {
                return this.nextKey;
            }

            public final int component4() {
                return this.itemsBefore;
            }

            public final int component5() {
                return this.itemsAfter;
            }

            public final Page<Key, Value> copy(List<? extends Value> data, Key key, Key key2, @IntRange(from = SieveCacheKt.NodeMetaAndPreviousMask) int i10, @IntRange(from = SieveCacheKt.NodeMetaAndPreviousMask) int i11) {
                AbstractC9133u.m16133g(data, "data");
                return new Page<>(data, key, key2, i10, i11);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Page)) {
                    return false;
                }
                Page page = (Page) obj;
                return AbstractC9133u.m16128b(this.data, page.data) && AbstractC9133u.m16128b(this.prevKey, page.prevKey) && AbstractC9133u.m16128b(this.nextKey, page.nextKey) && this.itemsBefore == page.itemsBefore && this.itemsAfter == page.itemsAfter;
            }

            public final List<Value> getData() {
                return this.data;
            }

            public final int getItemsAfter() {
                return this.itemsAfter;
            }

            public final int getItemsBefore() {
                return this.itemsBefore;
            }

            public final Key getNextKey() {
                return this.nextKey;
            }

            public final Key getPrevKey() {
                return this.prevKey;
            }

            public int hashCode() {
                int iHashCode = this.data.hashCode() * 31;
                Key key = this.prevKey;
                int iHashCode2 = (iHashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.nextKey;
                return ((((iHashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + Integer.hashCode(this.itemsBefore)) * 31) + Integer.hashCode(this.itemsAfter);
            }

            @Override // java.lang.Iterable
            public Iterator<Value> iterator() {
                return this.data.listIterator();
            }

            public String toString() {
                return AbstractC8680s.m14088p("LoadResult.Page(\n                    |   data size: " + this.data.size() + "\n                    |   first Item: " + AbstractC8778f0.m14568n0(this.data) + "\n                    |   last Item: " + AbstractC8778f0.m14579y0(this.data) + "\n                    |   nextKey: " + this.nextKey + "\n                    |   prevKey: " + this.prevKey + "\n                    |   itemsBefore: " + this.itemsBefore + "\n                    |   itemsAfter: " + this.itemsAfter + "\n                    |) ", null, 1, null);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Page(List<? extends Value> data, Key key, Key key2, @IntRange(from = SieveCacheKt.NodeMetaAndPreviousMask) int i10, @IntRange(from = SieveCacheKt.NodeMetaAndPreviousMask) int i11) {
                super(null);
                AbstractC9133u.m16133g(data, "data");
                this.data = data;
                this.prevKey = key;
                this.nextKey = key2;
                this.itemsBefore = i10;
                this.itemsAfter = i11;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                }
                if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public Page(List<? extends Value> data, Key key, Key key2) {
                this(data, key, key2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                AbstractC9133u.m16133g(data, "data");
            }
        }

        public /* synthetic */ LoadResult(AbstractC9126n abstractC9126n) {
            this();
        }

        private LoadResult() {
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.getInvalid$paging_common_release();
    }

    @VisibleForTesting
    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.callbackCount$paging_common_release();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Key getRefreshKey(PagingState<Key, Value> pagingState);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.invalidate$paging_common_release()) {
            PagingLogger pagingLogger = PagingLogger.INSTANCE;
            if (pagingLogger.isLoggable(3)) {
                pagingLogger.log(3, "Invalidated PagingSource " + this, null);
            }
        }
    }

    public abstract Object load(LoadParams<Key> loadParams, InterfaceC9324c<? super LoadResult<Key, Value>> interfaceC9324c);

    public final void registerInvalidatedCallback(InterfaceC10559a onInvalidatedCallback) {
        AbstractC9133u.m16133g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.registerInvalidatedCallback$paging_common_release(onInvalidatedCallback);
    }

    public final void unregisterInvalidatedCallback(InterfaceC10559a onInvalidatedCallback) {
        AbstractC9133u.m16133g(onInvalidatedCallback, "onInvalidatedCallback");
        this.invalidateCallbackTracker.unregisterInvalidatedCallback$paging_common_release(onInvalidatedCallback);
    }
}
