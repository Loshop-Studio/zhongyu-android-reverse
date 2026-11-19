package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p013ui.unit.C3127Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m13559k = 3, m13560mv = {1, 8, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", m13596f = "TabRow.kt", m13597i = {}, m13598l = {917}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode$measure$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ float $indicatorOffset;
    final /* synthetic */ Animatable<C3127Dp, AnimationVector1D> $offsetAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$3(Animatable<C3127Dp, AnimationVector1D> animatable, float f10, Continuation<? super TabIndicatorOffsetNode$measure$3> continuation) {
        super(2, continuation);
        this.$offsetAnim = animatable;
        this.$indicatorOffset = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TabIndicatorOffsetNode$measure$3(this.$offsetAnim, this.$indicatorOffset, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Animatable<C3127Dp, AnimationVector1D> animatable = this.$offsetAnim;
            C3127Dp c3127DpM23559boximpl = C3127Dp.m23559boximpl(this.$indicatorOffset);
            AnimationSpec animationSpec = TabRowKt.TabRowIndicatorSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, c3127DpM23559boximpl, animationSpec, null, null, this, 12, null) == coroutine_suspended) {
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
        return ((TabIndicatorOffsetNode$measure$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
