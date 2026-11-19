package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.p014ui.geometry.Offset;
import com.alibaba.fastjson.asm.Opcodes;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p181hd.InterfaceC9540l;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", m26211f = "TransformableState.kt", m26212l = {Opcodes.INVOKEVIRTUAL}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ Ref$LongRef $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableStateKt$animatePanBy$2(Ref$LongRef ref$LongRef, long j10, AnimationSpec<Offset> animationSpec, InterfaceC11588c<? super TransformableStateKt$animatePanBy$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$previous = ref$LongRef;
        this.$offset = j10;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, interfaceC11588c);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(TransformScope transformScope, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.Companion), Offset.m30626boximpl(this.$previous.f23401c), null, 0L, 0L, false, 60, null);
            Offset offsetM30626boximpl = Offset.m30626boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final Ref$LongRef ref$LongRef = this.$previous;
            InterfaceC9540l interfaceC9540l = new InterfaceC9540l() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((AnimationScope<Offset, AnimationVector2D>) obj2);
                    return C10786q.f26013a;
                }

                public final void invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    TransformScope.m27259transformByd4ec7I$default(transformScope, 0.0f, Offset.m30641minusMKHz9U(animationScope.getValue().m30647unboximpl(), ref$LongRef.f23401c), 0.0f, 5, null);
                    ref$LongRef.f23401c = animationScope.getValue().m30647unboximpl();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, offsetM30626boximpl, animationSpec, false, interfaceC9540l, this, 4, null) == objM25952f) {
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
