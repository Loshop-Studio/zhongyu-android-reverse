package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.AbstractC9079b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.InterfaceC9100d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9129q;
import p123h7.C8736p;
import p123h7.InterfaceC8723c;
import p134i7.AbstractC8809v;
import p135i8.AbstractC8833f;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10574p;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> implements CompatLegacyPagingSource {
    private static final Companion Companion = new Companion(null);
    private static final int PAGE_SIZE_NOT_SET = Integer.MIN_VALUE;
    private final DataSource<Key, Value> dataSource;
    private final InterfaceC9100d fetchContext;
    private int pageSize;

    /* renamed from: androidx.paging.LegacyPagingSource$1 */
    public /* synthetic */ class C43101 implements DataSource.InvalidatedCallback, InterfaceC9129q {
        final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

        public C43101(LegacyPagingSource<Key, Value> legacyPagingSource) {
            this.$tmp0 = legacyPagingSource;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof InterfaceC9129q)) {
                return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9129q
        public final InterfaceC8723c getFunctionDelegate() {
            return new FunctionReferenceImpl(0, this.$tmp0, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.paging.DataSource.InvalidatedCallback
        public final void onInvalidated() {
            this.$tmp0.invalidate();
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DataSource.KeyType.values().length];
            try {
                iArr[DataSource.KeyType.POSITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataSource.KeyType.PAGE_KEYED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DataSource.KeyType.ITEM_KEYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @InterfaceC9539d(m17800c = "androidx.paging.LegacyPagingSource$load$2", m17801f = "LegacyPagingSource.jvm.kt", m17802l = {110}, m17803m = "invokeSuspend")
    /* renamed from: androidx.paging.LegacyPagingSource$load$2 */
    public static final class C43122 extends SuspendLambda implements InterfaceC10574p {
        final /* synthetic */ DataSource.Params<Key> $dataSourceParams;
        final /* synthetic */ PagingSource.LoadParams<Key> $params;
        int label;
        final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43122(LegacyPagingSource<Key, Value> legacyPagingSource, DataSource.Params<Key> params, PagingSource.LoadParams<Key> loadParams, InterfaceC9324c<? super C43122> interfaceC9324c) {
            super(2, interfaceC9324c);
            this.this$0 = legacyPagingSource;
            this.$dataSourceParams = params;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
            return new C43122(this.this$0, this.$dataSourceParams, this.$params, interfaceC9324c);
        }

        @Override // p300x7.InterfaceC10574p
        public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super PagingSource.LoadResult.Page<Key, Value>> interfaceC9324c) {
            return ((C43122) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM17291f = AbstractC9434a.m17291f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9079b.m15926b(obj);
                DataSource<Key, Value> dataSource$paging_common_release = this.this$0.getDataSource$paging_common_release();
                DataSource.Params<Key> params = this.$dataSourceParams;
                this.label = 1;
                obj = dataSource$paging_common_release.load$paging_common_release(params, this);
                if (obj == objM17291f) {
                    return objM17291f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9079b.m15926b(obj);
            }
            PagingSource.LoadParams<Key> loadParams = this.$params;
            DataSource.BaseResult baseResult = (DataSource.BaseResult) obj;
            List<Value> list = baseResult.data;
            return new PagingSource.LoadResult.Page(list, (list.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Prepend)) ? null : baseResult.getPrevKey(), (baseResult.data.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Append)) ? null : baseResult.getNextKey(), baseResult.getItemsBefore(), baseResult.getItemsAfter());
        }
    }

    public LegacyPagingSource(InterfaceC9100d fetchContext, DataSource<Key, Value> dataSource) {
        AbstractC9133u.m16133g(fetchContext, "fetchContext");
        AbstractC9133u.m16133g(dataSource, "dataSource");
        this.fetchContext = fetchContext;
        this.dataSource = dataSource;
        this.pageSize = Integer.MIN_VALUE;
        dataSource.addInvalidatedCallback(new C43101(this));
        registerInvalidatedCallback(new InterfaceC10559a(this) { // from class: androidx.paging.LegacyPagingSource.2
            final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

            /* renamed from: androidx.paging.LegacyPagingSource$2$1, reason: invalid class name */
            public /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, InterfaceC9129q {
                final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

                public AnonymousClass1(LegacyPagingSource<Key, Value> legacyPagingSource) {
                    this.$tmp0 = legacyPagingSource;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof InterfaceC9129q)) {
                        return AbstractC9133u.m16128b(getFunctionDelegate(), ((InterfaceC9129q) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.InterfaceC9129q
                public final InterfaceC8723c getFunctionDelegate() {
                    return new FunctionReferenceImpl(0, this.$tmp0, LegacyPagingSource.class, "invalidate", "invalidate()V", 0);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                @Override // androidx.paging.DataSource.InvalidatedCallback
                public final void onInvalidated() {
                    this.$tmp0.invalidate();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27205invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27205invoke() {
                this.this$0.getDataSource$paging_common_release().removeInvalidatedCallback(new AnonymousClass1(this.this$0));
                this.this$0.getDataSource$paging_common_release().invalidate();
            }
        });
    }

    private final int guessPageSize(PagingSource.LoadParams<Key> loadParams) {
        return ((loadParams instanceof PagingSource.LoadParams.Refresh) && loadParams.getLoadSize() % 3 == 0) ? loadParams.getLoadSize() / 3 : loadParams.getLoadSize();
    }

    public final DataSource<Key, Value> getDataSource$paging_common_release() {
        return this.dataSource;
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return this.dataSource.getType$paging_common_release() == DataSource.KeyType.POSITIONAL;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Key getRefreshKey2(PagingState<Key, Value> state) {
        Object prevKey;
        Value valueClosestItemToPosition;
        AbstractC9133u.m16133g(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.dataSource.getType$paging_common_release().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return null;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Integer anchorPosition = state.getAnchorPosition();
            if (anchorPosition == null || (valueClosestItemToPosition = state.closestItemToPosition(anchorPosition.intValue())) == null) {
                return null;
            }
            return this.dataSource.getKeyInternal$paging_common_release(valueClosestItemToPosition);
        }
        Integer anchorPosition2 = state.getAnchorPosition();
        if (anchorPosition2 == null) {
            return null;
        }
        int iIntValue = anchorPosition2.intValue();
        int size = iIntValue - ((PagingState) state).leadingPlaceholderCount;
        for (int i11 = 0; i11 < AbstractC8809v.m14773p(state.getPages()) && size > AbstractC8809v.m14773p(state.getPages().get(i11).getData()); i11++) {
            size -= state.getPages().get(i11).getData().size();
        }
        PagingSource.LoadResult.Page<Key, Value> pageClosestPageToPosition = state.closestPageToPosition(iIntValue);
        if (pageClosestPageToPosition == null || (prevKey = pageClosestPageToPosition.getPrevKey()) == null) {
            prevKey = 0;
        }
        AbstractC9133u.m16131e(prevKey, "null cannot be cast to non-null type kotlin.Int");
        return (Key) Integer.valueOf(((Integer) prevKey).intValue() + size);
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Key> loadParams, InterfaceC9324c<? super PagingSource.LoadResult<Key, Value>> interfaceC9324c) {
        LoadType loadType;
        if (loadParams instanceof PagingSource.LoadParams.Refresh) {
            loadType = LoadType.REFRESH;
        } else if (loadParams instanceof PagingSource.LoadParams.Append) {
            loadType = LoadType.APPEND;
        } else {
            if (!(loadParams instanceof PagingSource.LoadParams.Prepend)) {
                throw new NoWhenBranchMatchedException();
            }
            loadType = LoadType.PREPEND;
        }
        LoadType loadType2 = loadType;
        if (this.pageSize == Integer.MIN_VALUE) {
            System.out.println((Object) "WARNING: pageSize on the LegacyPagingSource is not set.\nWhen using legacy DataSource / DataSourceFactory with Paging3, page size\nshould've been set by the paging library but it is not set yet.\n\nIf you are seeing this message in tests where you are testing DataSource\nin isolation (without a Pager), it is expected and page size will be estimated\nbased on parameters.\n\nIf you are seeing this message despite using a Pager, please file a bug:\nhttps://issuetracker.google.com/issues/new?component=413106");
            this.pageSize = guessPageSize(loadParams);
        }
        return AbstractC8833f.m14848g(this.fetchContext, new C43122(this, new DataSource.Params(loadType2, loadParams.getKey(), loadParams.getLoadSize(), loadParams.getPlaceholdersEnabled(), this.pageSize), loadParams, null), interfaceC9324c);
    }

    @Override // androidx.paging.CompatLegacyPagingSource
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPageSize(int i10) {
        int i11 = this.pageSize;
        if (i11 == Integer.MIN_VALUE || i10 == i11) {
            this.pageSize = i10;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.pageSize + '.').toString());
    }
}
