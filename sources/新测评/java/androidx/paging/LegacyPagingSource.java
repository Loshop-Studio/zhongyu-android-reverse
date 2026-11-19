package androidx.paging;

import androidx.annotation.RestrictTo;
import androidx.paging.DataSource;
import androidx.paging.PagingSource;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001f*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\u00020\u0005:\u0001\u001fB!\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\nJ#\u0010\u0013\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0017\u001a\u00020\u00122\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002J(\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@¢\u0006\u0002\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0017R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, m13558d2 = {"Landroidx/paging/LegacyPagingSource;", "Key", "", "Value", "Landroidx/paging/PagingSource;", "Landroidx/paging/CompatLegacyPagingSource;", "fetchContext", "Lkotlin/coroutines/CoroutineContext;", "dataSource", "Landroidx/paging/DataSource;", "(Lkotlin/coroutines/CoroutineContext;Landroidx/paging/DataSource;)V", "getDataSource$paging_common_release", "()Landroidx/paging/DataSource;", "jumpingSupported", "", "getJumpingSupported", "()Z", "pageSize", "", "getRefreshKey", "state", "Landroidx/paging/PagingState;", "(Landroidx/paging/PagingState;)Ljava/lang/Object;", "guessPageSize", "params", "Landroidx/paging/PagingSource$LoadParams;", "load", "Landroidx/paging/PagingSource$LoadResult;", "(Landroidx/paging/PagingSource$LoadParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPageSize", "", "Companion", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nLegacyPagingSource.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n+ 2 PagingState.kt\nandroidx/paging/PagingState\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,148:1\n142#2,8:149\n1#3:157\n*S KotlinDebug\n*F\n+ 1 LegacyPagingSource.jvm.kt\nandroidx/paging/LegacyPagingSource\n*L\n128#1:149,8\n*E\n"})
/* loaded from: classes3.dex */
public final class LegacyPagingSource<Key, Value> extends PagingSource<Key, Value> implements CompatLegacyPagingSource {
    private static final Companion Companion = new Companion(null);
    private static final int PAGE_SIZE_NOT_SET = Integer.MIN_VALUE;
    private final DataSource<Key, Value> dataSource;
    private final CoroutineContext fetchContext;
    private int pageSize;

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    /* renamed from: androidx.paging.LegacyPagingSource$1 */
    public /* synthetic */ class C42241 implements DataSource.InvalidatedCallback, FunctionAdapter {
        final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

        public C42241(LegacyPagingSource<Key, Value> legacyPagingSource) {
            this.$tmp0 = legacyPagingSource;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        public final Function<?> getFunctionDelegate() {
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

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m13558d2 = {"Landroidx/paging/LegacyPagingSource$Companion;", "", "()V", "PAGE_SIZE_NOT_SET", "", "paging-common_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
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

    @Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "Key", "Value", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
    @DebugMetadata(m13595c = "androidx.paging.LegacyPagingSource$load$2", m13596f = "LegacyPagingSource.jvm.kt", m13597i = {}, m13598l = {110}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
    /* renamed from: androidx.paging.LegacyPagingSource$load$2 */
    public static final class C42262 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult.Page<Key, Value>>, Object> {
        final /* synthetic */ DataSource.Params<Key> $dataSourceParams;
        final /* synthetic */ PagingSource.LoadParams<Key> $params;
        int label;
        final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C42262(LegacyPagingSource<Key, Value> legacyPagingSource, DataSource.Params<Key> params, PagingSource.LoadParams<Key> loadParams, Continuation<? super C42262> continuation) {
            super(2, continuation);
            this.this$0 = legacyPagingSource;
            this.$dataSourceParams = params;
            this.$params = loadParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C42262(this.this$0, this.$dataSourceParams, this.$params, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.label;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DataSource<Key, Value> dataSource$paging_common_release = this.this$0.getDataSource$paging_common_release();
                DataSource.Params<Key> params = this.$dataSourceParams;
                this.label = 1;
                obj = dataSource$paging_common_release.load$paging_common_release(params, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PagingSource.LoadParams<Key> loadParams = this.$params;
            DataSource.BaseResult baseResult = (DataSource.BaseResult) obj;
            List<Value> list = baseResult.data;
            return new PagingSource.LoadResult.Page(list, (list.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Prepend)) ? null : baseResult.getPrevKey(), (baseResult.data.isEmpty() && (loadParams instanceof PagingSource.LoadParams.Append)) ? null : baseResult.getNextKey(), baseResult.getItemsBefore(), baseResult.getItemsAfter());
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PagingSource.LoadResult.Page<Key, Value>> continuation) {
            return ((C42262) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LegacyPagingSource(CoroutineContext fetchContext, DataSource<Key, Value> dataSource) {
        Intrinsics.checkNotNullParameter(fetchContext, "fetchContext");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.fetchContext = fetchContext;
        this.dataSource = dataSource;
        this.pageSize = Integer.MIN_VALUE;
        dataSource.addInvalidatedCallback(new C42241(this));
        registerInvalidatedCallback(new Function0<Unit>(this) { // from class: androidx.paging.LegacyPagingSource.2
            final /* synthetic */ LegacyPagingSource<Key, Value> this$0;

            @Metadata(m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
            /* renamed from: androidx.paging.LegacyPagingSource$2$1, reason: invalid class name */
            public /* synthetic */ class AnonymousClass1 implements DataSource.InvalidatedCallback, FunctionAdapter {
                final /* synthetic */ LegacyPagingSource<Key, Value> $tmp0;

                public AnonymousClass1(LegacyPagingSource<Key, Value> legacyPagingSource) {
                    this.$tmp0 = legacyPagingSource;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof DataSource.InvalidatedCallback) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
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

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getDataSource$paging_common_release().removeInvalidatedCallback(new AnonymousClass1(this.this$0));
                this.this$0.getDataSource$paging_common_release().invalidate();
            }
        });
    }

    private final int guessPageSize(PagingSource.LoadParams<Key> params) {
        return ((params instanceof PagingSource.LoadParams.Refresh) && params.getLoadSize() % 3 == 0) ? params.getLoadSize() / 3 : params.getLoadSize();
    }

    public final DataSource<Key, Value> getDataSource$paging_common_release() {
        return this.dataSource;
    }

    @Override // androidx.paging.PagingSource
    public boolean getJumpingSupported() {
        return this.dataSource.getType() == DataSource.KeyType.POSITIONAL;
    }

    @Override // androidx.paging.PagingSource
    /* renamed from: getRefreshKey */
    public Key getRefreshKey2(PagingState<Key, Value> state) {
        Object prevKey;
        Value valueClosestItemToPosition;
        Intrinsics.checkNotNullParameter(state, "state");
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.dataSource.getType().ordinal()];
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
        for (int i11 = 0; i11 < CollectionsKt.getLastIndex(state.getPages()) && size > CollectionsKt.getLastIndex(state.getPages().get(i11).getData()); i11++) {
            size -= state.getPages().get(i11).getData().size();
        }
        PagingSource.LoadResult.Page<Key, Value> pageClosestPageToPosition = state.closestPageToPosition(iIntValue);
        if (pageClosestPageToPosition == null || (prevKey = pageClosestPageToPosition.getPrevKey()) == null) {
            prevKey = 0;
        }
        Intrinsics.checkNotNull(prevKey, "null cannot be cast to non-null type kotlin.Int");
        return (Key) Integer.valueOf(((Integer) prevKey).intValue() + size);
    }

    @Override // androidx.paging.PagingSource
    public Object load(PagingSource.LoadParams<Key> loadParams, Continuation<? super PagingSource.LoadResult<Key, Value>> continuation) {
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
        return BuildersKt.withContext(this.fetchContext, new C42262(this, new DataSource.Params(loadType2, loadParams.getKey(), loadParams.getLoadSize(), loadParams.getPlaceholdersEnabled(), this.pageSize), loadParams, null), continuation);
    }

    @Override // androidx.paging.CompatLegacyPagingSource
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setPageSize(int pageSize) {
        int i10 = this.pageSize;
        if (i10 == Integer.MIN_VALUE || pageSize == i10) {
            this.pageSize = pageSize;
            return;
        }
        throw new IllegalStateException(("Page size is already set to " + this.pageSize + '.').toString());
    }
}
