package androidx.paging;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(m13557d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u008a@"}, m13558d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "", "isGettingItem"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.paging.AsyncPagingDataDiffer$loadStateFlow$1$1", m13596f = "AsyncPagingDataDiffer.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes3.dex */
public final class AsyncPagingDataDiffer$loadStateFlow$1$1 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    public AsyncPagingDataDiffer$loadStateFlow$1$1(Continuation<? super AsyncPagingDataDiffer$loadStateFlow$1$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AsyncPagingDataDiffer$loadStateFlow$1$1 asyncPagingDataDiffer$loadStateFlow$1$1 = new AsyncPagingDataDiffer$loadStateFlow$1$1(continuation);
        asyncPagingDataDiffer$loadStateFlow$1$1.Z$0 = ((Boolean) obj).booleanValue();
        return asyncPagingDataDiffer$loadStateFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!this.Z$0);
    }

    public final Object invoke(boolean z9, Continuation<? super Boolean> continuation) {
        return ((AsyncPagingDataDiffer$loadStateFlow$1$1) create(Boolean.valueOf(z9), continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
