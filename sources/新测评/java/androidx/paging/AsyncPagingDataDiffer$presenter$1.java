package androidx.paging;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m13557d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m13558d2 = {"androidx/paging/AsyncPagingDataDiffer$presenter$1", "Landroidx/paging/PagingDataPresenter;", "presentPagingDataEvent", "", NotificationCompat.CATEGORY_EVENT, "Landroidx/paging/PagingDataEvent;", "(Landroidx/paging/PagingDataEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "paging-runtime_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$presenter$1<T> extends PagingDataPresenter<T> {
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncPagingDataDiffer$presenter$1(AsyncPagingDataDiffer<T> asyncPagingDataDiffer, CoroutineContext coroutineContext) {
        super(coroutineContext, null, 2, 0 == true ? 1 : 0);
        this.this$0 = asyncPagingDataDiffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.paging.PagingDataPresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object presentPagingDataEvent(androidx.paging.PagingDataEvent<T> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.AsyncPagingDataDiffer$presenter$1.presentPagingDataEvent(androidx.paging.PagingDataEvent, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
