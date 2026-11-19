package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.InterfaceC9945d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.InterfaceC9975q;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p309qc.InterfaceC10772c;
import p325rc.AbstractC10978w;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.AbstractC11109f;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> implements CompatLegacyPagingSource {
    private static final Companion Companion = new Companion(null);
    private static final int PAGE_SIZE_NOT_SET = Integer.MIN_VALUE;
    private final DataSource<Key, Value> dataSource;
    private final InterfaceC9945d fetchContext;
    private int pageSize;

    /* renamed from: androidx.paging.LegacyPagingSource$1 */
    public static final /* synthetic */ class C42331 implements DataSource.InvalidatedCallback, InterfaceC9975q {
        final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

        public C42331(LegacyPagingSource<Key, Value> legacyPagingSource) {
            this.$tmp0 = legacyPagingSource;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof InterfaceC9975q)) {
                return AbstractC9979u.m20289b(getFunctionDelegate(), ((InterfaceC9975q) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.InterfaceC9975q
        public final InterfaceC10772c getFunctionDelegate() {
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
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        private Companion() {
        }
    }

    public static final /* synthetic */ class WhenMappings {
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

    @InterfaceC11829d(m26210c = "androidx.paging.LegacyPagingSource$load$2", m26211f = "LegacyPagingSource.jvmAndAndroid.kt", m26212l = {103}, m26213m = "invokeSuspend", m26214v = 1)
    /* renamed from: androidx.paging.LegacyPagingSource$load$2 */
    public static final class C42342 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ DataSource.Params<Key> $dataSourceParams;
        final /* synthetic */ PagingSource.LoadParams<Key> $params;
        int label;
        final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42342(LegacyPagingSource<Key, Value> legacyPagingSource, DataSource.Params<Key> params, PagingSource.LoadParams<Key> loadParams, InterfaceC11588c<? super C42342> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.this$0 = legacyPagingSource;
            this.$dataSourceParams = params;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            return new C42342(this.this$0, this.$dataSourceParams, this.$params, interfaceC11588c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                DataSource<Key, Value> dataSource$paging_common = this.this$0.getDataSource$paging_common();
                DataSource.Params<Key> params = this.$dataSourceParams;
                this.label = 1;
                obj = dataSource$paging_common.load$paging_common(params, this);
                if (obj == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            PagingSource.LoadParams<Key> loadParams = this.$params;
            DataSource.BaseResult baseResult = (DataSource.BaseResult) obj;
            List<Value> list = baseResult.data;
            return new PagingSource.LoadResult.Page(list, (list.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Prepend)) ? null : baseResult.getPrevKey(), (baseResult.data.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Append)) ? null : baseResult.getNextKey(), baseResult.getItemsBefore(), baseResult.getItemsAfter());
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super PagingSource.LoadResult.Page<Key, Value>> interfaceC11588c) {
            return ((C42342) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }
    }

    public LegacyPagingSource(InterfaceC9945d fetchContext, DataSource<Key, Value> dataSource) {
        AbstractC9979u.m20294g(fetchContext, "fetchContext");
        AbstractC9979u.m20294g(dataSource, "dataSource");
        this.fetchContext = fetchContext;
        this.dataSource = dataSource;
        this.pageSize = Integer.MIN_VALUE;
        dataSource.addInvalidatedCallback(new C42331(this));
        registerInvalidatedCallback(new InterfaceC9529a() { // from class: androidx.paging.y
            @Override // p181hd.InterfaceC9529a
            public final Object invoke() {
                return LegacyPagingSource._init_$lambda$0(this.f1970c);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C10786q _init_$lambda$0(LegacyPagingSource legacyPagingSource) {
        legacyPagingSource.dataSource.removeInvalidatedCallback(new LegacyPagingSource$2$1(legacyPagingSource));
        legacyPagingSource.dataSource.invalidate();
        return C10786q.f26013a;
    }

    private final int guessPageSize(PagingSource.LoadParams<Key> loadParams) {
        if (loadParams instanceof PagingSource.LoadParams.Refresh) {
            PagingSource.LoadParams.Refresh refresh = (PagingSource.LoadParams.Refresh) loadParams;
            if (refresh.getLoadSize() % 3 == 0) {
                return refresh.getLoadSize() / 3;
            }
        }
        return loadParams.getLoadSize();
    }

    public final DataSource<Key, Value> getDataSource$paging_common() {
        return this.dataSource;
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return this.dataSource.getType$paging_common() == DataSource.KeyType.POSITIONAL;
    }

    @Override // androidx.paging.PagingSource
    public Key getRefreshKey(PagingState<Key, Value> state) {
        Object prevKey;
        Value valueClosestItemToPosition;
        AbstractC9979u.m20294g(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.dataSource.getType$paging_common().ordinal()];
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
            return this.dataSource.getKeyInternal$paging_common(valueClosestItemToPosition);
        }
        Integer anchorPosition2 = state.getAnchorPosition();
        if (anchorPosition2 == null) {
            return null;
        }
        int iIntValue = anchorPosition2.intValue();
        int size = iIntValue - ((PagingState) state).leadingPlaceholderCount;
        for (int i11 = 0; i11 < AbstractC10978w.m24138p(state.getPages()) && size > AbstractC10978w.m24138p(state.getPages().get(i11).getData()); i11++) {
            size -= state.getPages().get(i11).getData().size();
        }
        PagingSource.LoadResult.Page<Key, Value> pageClosestPageToPosition = state.closestPageToPosition(iIntValue);
        if (pageClosestPageToPosition == null || (prevKey = pageClosestPageToPosition.getPrevKey()) == null) {
            prevKey = 0;
        }
        AbstractC9979u.m20292e(prevKey, "null cannot be cast to non-null type kotlin.Int");
        return (Key) Integer.valueOf(((Integer) prevKey).intValue() + size);
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Key> loadParams, InterfaceC11588c<? super PagingSource.LoadResult<Key, Value>> interfaceC11588c) {
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
        return AbstractC11109f.m24709g(this.fetchContext, new C42342(this, new DataSource.Params(loadType2, loadParams.getKey(), loadParams.getLoadSize(), loadParams.getPlaceholdersEnabled(), this.pageSize), loadParams, null), interfaceC11588c);
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
