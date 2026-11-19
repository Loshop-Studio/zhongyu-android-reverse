package androidx.paging;

import androidx.paging.PagingSource;
import kotlin.AbstractC9924b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.paging.PagedList$Companion$create$resolvedInitialPage$1", m26211f = "PagedList.kt", m26212l = {173}, m26213m = "invokeSuspend", m26214v = 1)
/* loaded from: classes3.dex */
public final class PagedList$Companion$create$resolvedInitialPage$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PagingSource<K, T> $pagingSource;
    final /* synthetic */ PagingSource.LoadParams.Refresh<K> $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagedList$Companion$create$resolvedInitialPage$1(PagingSource<K, T> pagingSource, PagingSource.LoadParams.Refresh<K> refresh, InterfaceC11588c<? super PagedList$Companion$create$resolvedInitialPage$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$pagingSource = pagingSource;
        this.$params = refresh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new PagedList$Companion$create$resolvedInitialPage$1(this.$pagingSource, this.$params, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            PagingSource<K, T> pagingSource = this.$pagingSource;
            Object obj2 = this.$params;
            this.label = 1;
            obj = pagingSource.load(obj2, this);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super PagingSource.LoadResult.Page<K, T>> interfaceC11588c) {
        return ((PagedList$Companion$create$resolvedInitialPage$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
