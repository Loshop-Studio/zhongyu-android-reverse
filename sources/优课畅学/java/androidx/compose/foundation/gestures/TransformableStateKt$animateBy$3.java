package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector4D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", m17801f = "TransformableState.kt", m17802l = {230}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$animateBy$3 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ DelegatingAnimationSpec $animationSpec;
    final /* synthetic */ Ref$ObjectRef<AnimationData> $previousState;
    final /* synthetic */ AnimationData $targetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animateBy$3(Ref$ObjectRef<AnimationData> ref$ObjectRef, AnimationData animationData, DelegatingAnimationSpec delegatingAnimationSpec, InterfaceC9324c<? super TransformableStateKt$animateBy$3> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$previousState = ref$ObjectRef;
        this.$targetState = animationData;
        this.$animationSpec = delegatingAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new TransformableStateKt$animateBy$3(this.$previousState, this.$targetState, this.$animationSpec, interfaceC9324c);
        transformableStateKt$animateBy$3.L$0 = obj;
        return transformableStateKt$animateBy$3;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TransformableStateKt$animateBy$3) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(AnimationDataConverter.INSTANCE, this.$previousState.f17473a, TransformableStateKt.ZeroAnimationVelocity, 0L, 0L, false, 56, null);
            AnimationData animationData = this.$targetState;
            DelegatingAnimationSpec delegatingAnimationSpec = this.$animationSpec;
            final Ref$ObjectRef<AnimationData> ref$ObjectRef = this.$previousState;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<AnimationData, AnimationVector4D>) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(AnimationScope<AnimationData, AnimationVector4D> animationScope) {
                    float zoom = ((AnimationData) ref$ObjectRef.f17473a).getZoom() == 0.0f ? 1.0f : animationScope.getValue().getZoom() / ((AnimationData) ref$ObjectRef.f17473a).getZoom();
                    transformScope.mo20534transformByd4ec7I(zoom, Offset.m24039minusMKHz9U(animationScope.getValue().m20523getOffsetF1C5BW0(), ((AnimationData) ref$ObjectRef.f17473a).m20523getOffsetF1C5BW0()), animationScope.getValue().getDegrees() - ((AnimationData) ref$ObjectRef.f17473a).getDegrees());
                    ref$ObjectRef.f17473a = animationScope.getValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationStateAnimationState$default, animationData, delegatingAnimationSpec, false, interfaceC10570l, this, 4, null) == objM17291f) {
                return objM17291f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9079b.m15926b(obj);
        }
        return C8736p.f16368a;
    }
}
