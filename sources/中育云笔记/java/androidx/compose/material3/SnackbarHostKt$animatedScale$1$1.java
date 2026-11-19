package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", m26211f = "SnackbarHost.kt", m26212l = {432}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SnackbarHostKt$animatedScale$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ AnimationSpec<Float> $animation;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $scale;
    final /* synthetic */ boolean $visible;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$animatedScale$1$1(Animatable<Float, AnimationVector1D> animatable, boolean z10, AnimationSpec<Float> animationSpec, InterfaceC11588c<? super SnackbarHostKt$animatedScale$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$scale = animatable;
        this.$visible = z10;
        this.$animation = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new SnackbarHostKt$animatedScale$1$1(this.$scale, this.$visible, this.$animation, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            Animatable<Float, AnimationVector1D> animatable = this.$scale;
            Float fM26207b = AbstractC11826a.m26207b(this.$visible ? 1.0f : 0.8f);
            AnimationSpec<Float> animationSpec = this.$animation;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, fM26207b, animationSpec, null, null, this, 12, null) == objM25952f) {
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
        return ((SnackbarHostKt$animatedScale$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
