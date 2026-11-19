package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p014ui.geometry.Offset;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", m26211f = "TransformableState.kt", m26212l = {230}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref$ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref$ObjectRef<AnimationData> ref$ObjectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, InterfaceC11588c<? super TransformableStateKt$animateBy$3> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$previousState = ref$ObjectRef;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, interfaceC11588c);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.f23402c, TransformableStateKt.ZeroAnimationVelocity, 0L, 0L, false, 56, null);
            AnimationData animationData = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final Ref$ObjectRef<AnimationData> ref$ObjectRef = this.$previousState;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<AnimationData, AnimationVector4D>) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    float zoom = ((AnimationData) ref$ObjectRef.f23402c).getZoom() == 0.0f ? 1.0f : animationScope.getValue().getZoom() / ((AnimationData) ref$ObjectRef.f23402c).getZoom();
                    transformScope.mo27136transformByd4ec7I(zoom, Offset.m30641minusMKHz9U(animationScope.getValue().m27125getOffsetF1C5BW0(), ((AnimationData) ref$ObjectRef.f23402c).m27125getOffsetF1C5BW0()), animationScope.getValue().getDegrees() - ((AnimationData) ref$ObjectRef.f23402c).getDegrees());
                    ref$ObjectRef.f23402c = animationScope.getValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, animationData, delegatingAnimationSpec, false, interfaceC9540l, this, 4, null) == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
        }
        return C10786q.f26013a;
    }
}
