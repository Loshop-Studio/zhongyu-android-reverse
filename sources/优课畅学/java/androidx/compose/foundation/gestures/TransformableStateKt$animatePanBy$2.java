package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p013ui.geometry.Offset;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p123h7.C8736p;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10570l;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", m17801f = "TransformableState.kt", m17802l = {182}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref$LongRef ref$LongRef, long j10, AnimationSpec<Offset> animationSpec, InterfaceC9324c<? super TransformableStateKt$animatePanBy$2> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$previous = ref$LongRef;
        this.$offset = j10;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, interfaceC9324c);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(TransformScope transformScope, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m24024boximpl(this.$previous.f17472a), null, 0L, 0L, false, 60, null);
            Offset offsetM24024boximpl = Offset.m24024boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final Ref$LongRef ref$LongRef = this.$previous;
            InterfaceC10570l interfaceC10570l = new InterfaceC10570l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Offset, AnimationVector2D>) obj2);
                    return C8736p.f16368a;
                }

                public final void invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    TransformScope.m20657transformByd4ec7I$default(transformScope, 0.0f, Offset.m24039minusMKHz9U(animationScope.getValue().m24045unboximpl(), ref$LongRef.f17472a), 0.0f, 5, null);
                    ref$LongRef.f17472a = animationScope.getValue().m24045unboximpl();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, offsetM24024boximpl, animationSpec, false, interfaceC10570l, this, 4, null) == objM17291f) {
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
