package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(m13557d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0001\u0010\u0000\u001a\u00020\u0001H\n"}, m13558d2 = {"<anonymous>", ""}, m13559k = 3, m13560mv = {2, 1, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", m13596f = "Delay.kt", m13597i = {}, m13598l = {}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes5.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements Function1<Continuation<?>, Object> {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j10, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$2> continuation) {
        super(1, continuation);
        this.$timeout = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) Duration.m25663toStringimpl(this.$timeout)));
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<?> continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
