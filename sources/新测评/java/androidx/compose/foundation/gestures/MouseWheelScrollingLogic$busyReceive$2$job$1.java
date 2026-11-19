package androidx.compose.foundation.gestures;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1", m13596f = "MouseWheelScrollable.kt", m13597i = {0}, m13598l = {166}, m13599m = "invokeSuspend", m13600n = {"$this$launch"}, m13601s = {"L$0"})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$busyReceive$2$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    public MouseWheelScrollingLogic$busyReceive$2$job$1(Continuation<? super MouseWheelScrollingLogic$busyReceive$2$job$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MouseWheelScrollingLogic$busyReceive$2$job$1 mouseWheelScrollingLogic$busyReceive$2$job$1 = new MouseWheelScrollingLogic$busyReceive$2$job$1(continuation);
        mouseWheelScrollingLogic$busyReceive$2$job$1.L$0 = obj;
        return mouseWheelScrollingLogic$busyReceive$2$job$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        while (JobKt.isActive(coroutineScope.getCoroutineContext())) {
            C12621 c12621 = new Function1<Long, Unit>() { // from class: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2$job$1.1
                public final void invoke(long j10) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                    invoke(l10.longValue());
                    return Unit.INSTANCE;
                }
            };
            this.L$0 = coroutineScope;
            this.label = 1;
            if (MonotonicFrameClockKt.withFrameNanos(c12621, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MouseWheelScrollingLogic$busyReceive$2$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
