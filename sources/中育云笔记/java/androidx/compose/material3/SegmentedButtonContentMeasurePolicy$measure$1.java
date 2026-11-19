package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SegmentedButtonContentMeasurePolicy$measure$1", m26211f = "SegmentedButton.kt", m26212l = {378}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SegmentedButtonContentMeasurePolicy$measure$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ Animatable<Integer, AnimationVector1D> $anim;
    final /* synthetic */ int $offsetX;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonContentMeasurePolicy$measure$1(Animatable<Integer, AnimationVector1D> animatable, int i10, InterfaceC11588c<? super SegmentedButtonContentMeasurePolicy$measure$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$anim = animatable;
        this.$offsetX = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SegmentedButtonContentMeasurePolicy$measure$1(this.$anim, this.$offsetX, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Animatable<Integer, AnimationVector1D> animatable = this.$anim;
            Integer numM26208c = AbstractC11826a.m26208c(this.$offsetX);
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(350, 0, null, 6, null);
            this.label = 1;
            if (Animatable.animateTo$default(animatable, numM26208c, tweenSpecTween$default, null, null, this, 12, null) == objM25952f) {
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

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((SegmentedButtonContentMeasurePolicy$measure$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
