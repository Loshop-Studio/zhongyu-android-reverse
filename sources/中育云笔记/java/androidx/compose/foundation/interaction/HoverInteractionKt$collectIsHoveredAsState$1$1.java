package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.AbstractC11826a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", m26211f = "HoverInteraction.kt", m26212l = {68}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, InterfaceC11588c<? super HoverInteractionKt$collectIsHoveredAsState$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final ArrayList arrayList = new ArrayList();
            InterfaceC11594c interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(AbstractC11826a.m26206a(!arrayList.isEmpty()));
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
