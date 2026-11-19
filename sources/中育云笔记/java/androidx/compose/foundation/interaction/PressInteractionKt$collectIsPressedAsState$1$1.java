package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import com.taobao.sophix.PatchStatus;
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

@InterfaceC11829d(m26210c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", m26211f = "PressInteraction.kt", m26212l = {PatchStatus.CODE_LOAD_FIND_FIELD}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ MutableState<Boolean> $isPressed;
    final /* synthetic */ InteractionSource $this_collectIsPressedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, InterfaceC11588c<? super PressInteractionKt$collectIsPressedAsState$1$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.$this_collectIsPressedAsState = interactionSource;
        this.$isPressed = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.$this_collectIsPressedAsState, this.$isPressed, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final ArrayList arrayList = new ArrayList();
            InterfaceC11594c interactions = this.$this_collectIsPressedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isPressed;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
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
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
