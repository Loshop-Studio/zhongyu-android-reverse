package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifierNode;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.p014ui.unit.IntSize;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", m26211f = "AnimationModifier.kt", m26212l = {230}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifierNode.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(SizeAnimationModifierNode.AnimData animData, long j10, SizeAnimationModifierNode sizeAnimationModifierNode, InterfaceC11588c<? super SizeAnimationModifierNode$animateTo$data$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_apply = animData;
        this.$targetSize = j10;
        this.this$0 = sizeAnimationModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        SizeAnimationModifierNode$animateTo$data$1$1 sizeAnimationModifierNode$animateTo$data$1$1;
        InterfaceC9544p listener;
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize intSizeM33664boximpl = IntSize.m33664boximpl(this.$targetSize);
            AnimationSpec<IntSize> animationSpec = this.this$0.getAnimationSpec();
            this.label = 1;
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
            obj = Animatable.animateTo$default(anim, intSizeM33664boximpl, animationSpec, null, null, sizeAnimationModifierNode$animateTo$data$1$1, 12, null);
            if (obj == objM25952f) {
                return objM25952f;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9924b.m20071b(obj);
            sizeAnimationModifierNode$animateTo$data$1$1 = this;
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = sizeAnimationModifierNode$animateTo$data$1$1.this$0.getListener()) != null) {
            listener.invoke(IntSize.m33664boximpl(sizeAnimationModifierNode$animateTo$data$1$1.$this_apply.m26830getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return C10786q.f26013a;
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
