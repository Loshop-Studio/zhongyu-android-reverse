package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p011ui.geometry.Offset;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {230}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref$ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref$ObjectRef<AnimationData> ref$ObjectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, InterfaceC5631c<? super TransformableStateKt$animateBy$3> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$previousState = ref$ObjectRef;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, interfaceC5631c);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.element, TransformableStateKt.ZeroAnimationVelocity, 0L, 0L, false, 56, null);
            AnimationData animationData = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final Ref$ObjectRef<AnimationData> ref$ObjectRef = this.$previousState;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<AnimationData, AnimationVector4D>) obj2);
                    return C5443s.f8405a;
                }

                /* JADX WARN: Type inference failed for: r7v1, types: [T, java.lang.Object] */
                public final void invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    float zoom = ref$ObjectRef.element.getZoom() == 0.0f ? 1.0f : animationScope.getValue().getZoom() / ref$ObjectRef.element.getZoom();
                    transformScope.mo6940transformByd4ec7I(zoom, Offset.m10445minusMKHz9U(animationScope.getValue().m6929getOffsetF1C5BW0(), ref$ObjectRef.element.m6929getOffsetF1C5BW0()), animationScope.getValue().getDegrees() - ref$ObjectRef.element.getDegrees());
                    ref$ObjectRef.element = animationScope.getValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, animationData, delegatingAnimationSpec, false, interfaceC6471c, this, 4, null) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }
}
