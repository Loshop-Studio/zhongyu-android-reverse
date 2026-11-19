package androidx.paging.compose;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagingData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(m7879d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, m7880d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "it", "Landroidx/paging/PagingData;"}, m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", m7918f = "LazyPagingItems.kt", m7919i = {}, m7920l = {179}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* loaded from: classes3.dex */
public final class LazyPagingItems$collectPagingData$2<T> extends SuspendLambda implements Function2<PagingData<T>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyPagingItems<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPagingItems$collectPagingData$2(LazyPagingItems<T> lazyPagingItems, Continuation<? super LazyPagingItems$collectPagingData$2> continuation) {
        super(2, continuation);
        this.this$0 = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyPagingItems$collectPagingData$2 lazyPagingItems$collectPagingData$2 = new LazyPagingItems$collectPagingData$2(this.this$0, continuation);
        lazyPagingItems$collectPagingData$2.L$0 = obj;
        return lazyPagingItems$collectPagingData$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PagingData<T> pagingData, Continuation<? super Unit> continuation) {
        return ((LazyPagingItems$collectPagingData$2) create(pagingData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = this.label;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            PagingData<T> pagingData = (PagingData) this.L$0;
            LazyPagingItems$pagingDataPresenter$1 lazyPagingItems$pagingDataPresenter$1 = ((LazyPagingItems) this.this$0).pagingDataPresenter;
            this.label = 1;
            if (lazyPagingItems$pagingDataPresenter$1.collectFrom(pagingData, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
