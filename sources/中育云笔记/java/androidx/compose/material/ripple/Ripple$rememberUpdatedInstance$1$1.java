package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.ComposerKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", m26211f = "Ripple.kt", m26212l = {ComposerKt.reuseKey}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Ripple$rememberUpdatedInstance$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ RippleIndicationInstance $instance;
    final /* synthetic */ InteractionSource $interactionSource;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, InterfaceC11588c<? super Ripple$rememberUpdatedInstance$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$interactionSource = interactionSource;
        this.$instance = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.$interactionSource, this.$instance, interfaceC11588c);
        ripple$rememberUpdatedInstance$1$1.L$0 = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final InterfaceC11122i0 interfaceC11122i0 = (InterfaceC11122i0) this.L$0;
            InterfaceC11594c interactions = this.$interactionSource.getInteractions();
            final RippleIndicationInstance rippleIndicationInstance = this.$instance;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if (interaction instanceof PressInteraction.Press) {
                        rippleIndicationInstance.addRipple((PressInteraction.Press) interaction, interfaceC11122i0);
                    } else if (interaction instanceof PressInteraction.Release) {
                        rippleIndicationInstance.removeRipple(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        rippleIndicationInstance.removeRipple(((PressInteraction.Cancel) interaction).getPress());
                    } else {
                        rippleIndicationInstance.updateStateLayer$material_ripple_release(interaction, interfaceC11122i0);
                    }
                    return C10786q.f26013a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC11595d, this) == objM25952f) {
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
        return ((Ripple$rememberUpdatedInstance$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
