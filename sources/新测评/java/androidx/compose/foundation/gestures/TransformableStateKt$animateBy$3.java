package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(m13557d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m13558d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, m13559k = 3, m13560mv = {1, 9, 0}, m13562xi = 48)
@DebugMetadata(m13595c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", m13596f = "TransformableState.kt", m13597i = {}, m13598l = {230}, m13599m = "invokeSuspend", m13600n = {}, m13601s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref.ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref.ObjectRef<AnimationData> objectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, Continuation<? super TransformableStateKt$animateBy$3> continuation) {
        super(2, continuation);
        this.$previousState = objectRef;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, continuation);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.element, TransformableStateKt.ZeroAnimationVelocity, 0L, 0L, false, 56, null);
            AnimationData animationData = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final Ref.ObjectRef<AnimationData> objectRef = this.$previousState;
            Function1<AnimationScope<AnimationData, AnimationVector4D>, Unit> function1 = new Function1<AnimationScope<AnimationData, AnimationVector4D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    invoke2(animationScope);
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    float zoom = objectRef.element.getZoom() == 0.0f ? 1.0f : animationScope.getValue().getZoom() / objectRef.element.getZoom();
                    transformScope.mo17368transformByd4ec7I(zoom, Offset.m20739minusMKHz9U(animationScope.getValue().m17358getOffsetF1C5BW0(), objectRef.element.m17358getOffsetF1C5BW0()), animationScope.getValue().getDegrees() - objectRef.element.getDegrees());
                    objectRef.element = animationScope.getValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, animationData, delegatingAnimationSpec, false, function1, this, 4, null) == coroutine_suspended) {
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
}
