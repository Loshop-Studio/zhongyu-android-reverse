package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import androidx.paging.PagingDataEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m7879d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\u008a@"}, m7880d2 = {"<anonymous>", "Landroidx/paging/PlaceholderPaddedDiffResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlinx/coroutines/CoroutineScope;"}, m7881k = 3, m7882mv = {1, 8, 0}, m7884xi = 48)
@DebugMetadata(m7917c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", m7918f = "AsyncPagingDataDiffer.kt", m7919i = {}, m7920l = {}, m7921m = "invokeSuspend", m7922n = {}, m7923s = {})
/* renamed from: androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1 */
/* loaded from: classes3.dex */
public final class C3682xf113672d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlaceholderPaddedDiffResult>, Object> {
    final /* synthetic */ PagingDataEvent.Refresh<T> $this_apply;
    int label;
    final /* synthetic */ AsyncPagingDataDiffer<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3682xf113672d(PagingDataEvent.Refresh<T> refresh, AsyncPagingDataDiffer<T> asyncPagingDataDiffer, Continuation<? super C3682xf113672d> continuation) {
        super(2, continuation);
        this.$this_apply = refresh;
        this.this$0 = asyncPagingDataDiffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C3682xf113672d(this.$this_apply, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return PlaceholderPaddedListDiffHelperKt.computeDiff(this.$this_apply.getPreviousList(), this.$this_apply.getNewList(), ((AsyncPagingDataDiffer) this.this$0).diffCallback);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlaceholderPaddedDiffResult> continuation) {
        return ((C3682xf113672d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
