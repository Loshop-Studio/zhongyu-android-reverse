package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2", m13596f = "LazyLayoutScrollDeltaBetweenPasses.kt", m13597i = {}, m13598l = {77}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2 */
/* loaded from: classes.dex */
public final class C1535x63fe01d5 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LazyLayoutScrollDeltaBetweenPasses this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535x63fe01d5(LazyLayoutScrollDeltaBetweenPasses lazyLayoutScrollDeltaBetweenPasses, Continuation<? super C1535x63fe01d5> continuation) {
        super(2, continuation);
        this.this$0 = lazyLayoutScrollDeltaBetweenPasses;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1535x63fe01d5(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            AnimationState animationState = this.this$0._scrollDeltaBetweenPasses;
            Float fBoxFloat = Boxing.boxFloat(0.0f);
            SpringSpec springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 400.0f, Boxing.boxFloat(0.5f), 1, null);
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, fBoxFloat, springSpecSpring$default, true, null, this, 8, null) == coroutine_suspended) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C1535x63fe01d5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
