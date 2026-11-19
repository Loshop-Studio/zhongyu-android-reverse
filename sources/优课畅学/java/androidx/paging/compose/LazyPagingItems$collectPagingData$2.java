package androidx.paging.compose;

import androidx.paging.PagingData;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", m17801f = "LazyPagingItems.kt", m17802l = {179}, m17803m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class LazyPagingItems$collectPagingData$2 extends SuspendLambda implements InterfaceC10574p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyPagingItems<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItems$collectPagingData$2(LazyPagingItems<T> lazyPagingItems, InterfaceC9324c<? super LazyPagingItems$collectPagingData$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(this.this$0, interfaceC9324c);
        lazyPagingItems$collectPagingData$2.L$0 = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(PagingData<T> pagingData, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((LazyPagingItems$collectPagingData$2) create(pagingData, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            PagingData pagingData = (PagingData) this.L$0;
            LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = ((LazyPagingItems) this.this$0).pagingDataPresenter;
            this.label = 1;
            if (lazyPagingItems$pagingDataPresenter$1.collectFrom(pagingData, this) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
