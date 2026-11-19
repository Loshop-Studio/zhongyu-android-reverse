package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", m26211f = "TabRow.kt", m26212l = {917}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode$measure$3 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ float $indicatorOffset;
    final /* synthetic */ Animatable<C3186Dp, AnimationVector1D> $offsetAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$3(Animatable<C3186Dp, AnimationVector1D> animatable, float f10, InterfaceC11588c<? super TabIndicatorOffsetNode$measure$3> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$offsetAnim = animatable;
        this.$indicatorOffset = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TabIndicatorOffsetNode$measure$3(this.$offsetAnim, this.$indicatorOffset, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Animatable<C3186Dp, AnimationVector1D> animatable = this.$offsetAnim;
            C3186Dp c3186DpM33499boximpl = C3186Dp.m33499boximpl(this.$indicatorOffset);
            AnimationSpec animationSpec = TabRowKt.TabRowIndicatorSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, c3186DpM33499boximpl, animationSpec, null, null, this, 12, null) == objM25952f) {
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
        return ((TabIndicatorOffsetNode$measure$3) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
