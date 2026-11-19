package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagingSource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: Add missing generic type declarations: [T, K] */
@Metadata(m13557d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u0004\"\b\b\u0002\u0010\u0003*\u00020\u0004*\u00020\u0005H\u008a@"}, m13558d2 = {"<anonymous>", "Landroidx/paging/PagingSource$LoadResult$Page;", "K", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", m13596f = "PagedList.kt", m13597i = {}, m13598l = {178}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class PagedList$Companion$create$resolvedInitialPage$1<K, T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PagingSource.LoadResult.Page<K, T>>, Object> {
    final /* synthetic */ PagingSource<K, T> $pagingSource;
    final /* synthetic */ PagingSource.LoadParams.Refresh<K> $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedList$Companion$create$resolvedInitialPage$1(PagingSource<K, T> pagingSource, PagingSource.LoadParams.Refresh<K> refresh, Continuation<? super PagedList$Companion$create$resolvedInitialPage$1> continuation) {
        super(2, continuation);
        this.$pagingSource = pagingSource;
        this.$params = refresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PagedList$Companion$create$resolvedInitialPage$1(this.$pagingSource, this.$params, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            PagingSource<K, T> pagingSource = this.$pagingSource;
            PagingSource.LoadParams.Refresh<K> refresh = this.$params;
            this.label = 1;
            obj = pagingSource.load(refresh, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        PagingSource.LoadResult loadResult = (PagingSource.LoadResult) obj;
        if (loadResult instanceof PagingSource.LoadResult.Page) {
            return (PagingSource.LoadResult.Page) loadResult;
        }
        if (loadResult instanceof PagingSource.LoadResult.Error) {
            throw ((PagingSource.LoadResult.Error) loadResult).getThrowable();
        }
        if (loadResult instanceof PagingSource.LoadResult.Invalid) {
            throw new IllegalStateException("Failed to create PagedList. The provided PagingSource returned LoadResult.Invalid, but a LoadResult.Page was expected. To use a PagingSource which supports invalidation, use a PagedList builder that accepts a factory method for PagingSource or DataSource.Factory, such as LivePagedList.");
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PagingSource.LoadResult.Page<K, T>> continuation) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
