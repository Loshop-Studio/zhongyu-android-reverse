package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import com.taobao.sophix.PatchStatus;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material.ripple.CommonRippleNode$addRipple$2", m26211f = "CommonRipple.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_CLASS}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CommonRippleNode$addRipple$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ PressInteraction.Press $interaction;
    final /* synthetic */ RippleAnimation $rippleAnimation;
    int label;
    final /* synthetic */ CommonRippleNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommonRippleNode$addRipple$2(RippleAnimation rippleAnimation, CommonRippleNode commonRippleNode, PressInteraction.Press press, InterfaceC11588c<? super CommonRippleNode$addRipple$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$rippleAnimation = rippleAnimation;
        this.this$0 = commonRippleNode;
        this.$interaction = press;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new CommonRippleNode$addRipple$2(this.$rippleAnimation, this.this$0, this.$interaction, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                RippleAnimation rippleAnimation = this.$rippleAnimation;
                this.label = 1;
                if (rippleAnimation.animate(this) == objM25952f) {
                    return objM25952f;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC9924b.m20071b(obj);
            }
            this.this$0.ripples.remove(this.$interaction);
            DrawModifierNodeKt.invalidateDraw(this.this$0);
            return C10786q.f26013a;
        } catch (Throwable th) {
            this.this$0.ripples.remove(this.$interaction);
            DrawModifierNodeKt.invalidateDraw(this.this$0);
            throw th;
        }
    }

    @Override // p181hd.InterfaceC9544p
    public final Object invoke(InterfaceC11122i0 interfaceC11122i0, InterfaceC11588c<? super C10786q> interfaceC11588c) {
        return ((CommonRippleNode$addRipple$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
