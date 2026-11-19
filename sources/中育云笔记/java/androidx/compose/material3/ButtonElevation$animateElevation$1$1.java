package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.snapshots.SnapshotStateList;
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

@InterfaceC11829d(m26210c = "androidx.compose.material3.ButtonElevation$animateElevation$1$1", m26211f = "Button.kt", m26212l = {942}, m26213m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ButtonElevation$animateElevation$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ SnapshotStateList<Interaction> $interactions;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonElevation$animateElevation$1$1(InteractionSource interactionSource, SnapshotStateList<Interaction> snapshotStateList, InterfaceC11588c<? super ButtonElevation$animateElevation$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$interactionSource = interactionSource;
        this.$interactions = snapshotStateList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new ButtonElevation$animateElevation$1$1(this.$interactionSource, this.$interactions, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            InterfaceC11594c interactions = this.$interactionSource.getInteractions();
            final SnapshotStateList<Interaction> snapshotStateList = this.$interactions;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.material3.ButtonElevation$animateElevation$1$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        snapshotStateList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        snapshotStateList.remove(((FocusInteraction.Unfocus) interaction).getFocus());
                    } else if (interaction instanceof PressInteraction.Press) {
                        snapshotStateList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        snapshotStateList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        snapshotStateList.remove(((PressInteraction.Cancel) interaction).getPress());
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
        return ((ButtonElevation$animateElevation$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
