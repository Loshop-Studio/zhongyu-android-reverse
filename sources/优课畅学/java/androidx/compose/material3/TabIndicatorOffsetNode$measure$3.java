package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.material3.TabIndicatorOffsetNode$measure$3", m17801f = "TabRow.kt", m17802l = {917}, m17803m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class TabIndicatorOffsetNode$measure$3 extends SuspendLambda implements InterfaceC10574p {
    final /* synthetic */ float $indicatorOffset;
    final /* synthetic */ Animatable<C3156Dp, AnimationVector1D> $offsetAnim;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabIndicatorOffsetNode$measure$3(Animatable<C3156Dp, AnimationVector1D> animatable, float f10, InterfaceC9324c<? super TabIndicatorOffsetNode$measure$3> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.$offsetAnim = animatable;
        this.$indicatorOffset = f10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new TabIndicatorOffsetNode$measure$3(this.$offsetAnim, this.$indicatorOffset, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((TabIndicatorOffsetNode$measure$3) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            Animatable<C3156Dp, AnimationVector1D> animatable = this.$offsetAnim;
            C3156Dp c3156DpM26897boximpl = C3156Dp.m26897boximpl(this.$indicatorOffset);
            AnimationSpec animationSpec = TabRowKt.TabRowIndicatorSpec;
            this.label = 1;
            if (Animatable.animateTo$default(animatable, c3156DpM26897boximpl, animationSpec, null, null, this, 12, null) == objM17291f) {
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
