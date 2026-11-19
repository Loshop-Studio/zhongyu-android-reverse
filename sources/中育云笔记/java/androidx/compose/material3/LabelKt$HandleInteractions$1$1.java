package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.AbstractC11596e;
import p379vd.InterfaceC11594c;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1", m26211f = "Label.kt", m26212l = {112}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LabelKt$HandleInteractions$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ TooltipState $state;
    int label;

    @InterfaceC11829d(m26210c = "androidx.compose.material3.LabelKt$HandleInteractions$1$1$1", m26211f = "Label.kt", m26212l = {117}, m26213m = "invokeSuspend")
    /* renamed from: androidx.compose.material3.LabelKt$HandleInteractions$1$1$1 */
    public static final class C22131 extends SuspendLambda implements InterfaceC9544p {
        final /* synthetic */ TooltipState $state;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22131(TooltipState tooltipState, InterfaceC11588c<? super C22131> interfaceC11588c) {
            super(2, interfaceC11588c);
            this.$state = tooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
            C22131 c22131 = new C22131(this.$state, interfaceC11588c);
            c22131.L$0 = obj;
            return c22131;
        }

        @Override // p181hd.InterfaceC9544p
        public final Object invoke(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
            return ((C22131) create(interaction, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objM25952f = AbstractC11725a.m25952f();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC9924b.m20071b(obj);
                Interaction interaction = (Interaction) this.L$0;
                if (interaction instanceof PressInteraction.Press ? true : interaction instanceof DragInteraction.Start ? true : interaction instanceof HoverInteraction.Enter) {
                    TooltipState tooltipState = this.$state;
                    MutatePriority mutatePriority = MutatePriority.UserInput;
                    this.label = 1;
                    if (tooltipState.show(mutatePriority, this) == objM25952f) {
                        return objM25952f;
                    }
                } else {
                    if (interaction instanceof PressInteraction.Release ? true : interaction instanceof DragInteraction.Stop ? true : interaction instanceof HoverInteraction.Exit) {
                        this.$state.dismiss();
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelKt$HandleInteractions$1$1(MutableInteractionSource mutableInteractionSource, TooltipState tooltipState, InterfaceC11588c<? super LabelKt$HandleInteractions$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$interactionSource = mutableInteractionSource;
        this.$state = tooltipState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new LabelKt$HandleInteractions$1$1(this.$interactionSource, this.$state, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interactions = this.$interactionSource.getInteractions();
            C22131 c22131 = new C22131(this.$state, null);
            this.label = 1;
            if (AbstractC11596e.m25559i(interactions, c22131, this) == objM25952f) {
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
        return ((LabelKt$HandleInteractions$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
