package androidx.compose.material3.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;

@Metadata(m13557d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, m13558d2 = {"<anonymous>", ""}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.internal.BasicTooltipStateImpl$show$cancellableShow$1", m13596f = "BasicTooltip.kt", m13597i = {}, m13598l = {189}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
@SourceDebugExtension({"SMAP\nBasicTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,188:1\n314#2,11:189\n*S KotlinDebug\n*F\n+ 1 BasicTooltip.kt\nandroidx/compose/material3/internal/BasicTooltipStateImpl$show$cancellableShow$1\n*L\n141#1:189,11\n*E\n"})
/* loaded from: classes2.dex */
public final class BasicTooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BasicTooltipStateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipStateImpl$show$cancellableShow$1(BasicTooltipStateImpl basicTooltipStateImpl, Continuation<? super BasicTooltipStateImpl$show$cancellableShow$1> continuation) {
        super(1, continuation);
        this.this$0 = basicTooltipStateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BasicTooltipStateImpl$show$cancellableShow$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            BasicTooltipStateImpl basicTooltipStateImpl = this.this$0;
            this.L$0 = basicTooltipStateImpl;
            this.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
            cancellableContinuationImpl.initCancellability();
            basicTooltipStateImpl.setVisible(true);
            basicTooltipStateImpl.job = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (result == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((BasicTooltipStateImpl$show$cancellableShow$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
