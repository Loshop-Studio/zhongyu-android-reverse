package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p011ui.geometry.Offset;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6471c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Landroidx/compose/foundation/gestures/TransformScope;", "Ld6/s;", "<anonymous>", "(Landroidx/compose/foundation/gestures/TransformScope;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", m5303f = "TransformableState.kt", m5304i = {}, m5305l = {182}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref$LongRef ref$LongRef, long j7, AnimationSpec<Offset> animationSpec, InterfaceC5631c<? super TransformableStateKt$animatePanBy$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$previous = ref$LongRef;
        this.$offset = j7;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, interfaceC5631c);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(TransformScope transformScope, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), Offset.m10430boximpl(this.$previous.element), null, 0L, 0L, false, 60, null);
            Offset offsetM10430boximpl = Offset.m10430boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final Ref$LongRef ref$LongRef = this.$previous;
            InterfaceC6471c interfaceC6471c = new InterfaceC6471c() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Offset, AnimationVector2D>) obj2);
                    return C5443s.f8405a;
                }

                public final void invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    TransformScope.m7063transformByd4ec7I$default(transformScope, 0.0f, Offset.m10445minusMKHz9U(animationScope.getValue().m10451unboximpl(), ref$LongRef.element), 0.0f, 5, null);
                    ref$LongRef.element = animationScope.getValue().m10451unboximpl();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, offsetM10430boximpl, animationSpec, false, interfaceC6471c, this, 4, null) == coroutineSingletons) {
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
