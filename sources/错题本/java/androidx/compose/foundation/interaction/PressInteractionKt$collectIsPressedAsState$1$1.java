package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1", m5303f = "PressInteraction.kt", m5304i = {}, m5305l = {85}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class PressInteractionKt$collectIsPressedAsState$1$1 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ MutableState<Boolean> $isPressed;
    final /* synthetic */ InteractionSource $this_collectIsPressedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PressInteractionKt$collectIsPressedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, InterfaceC5631c<? super PressInteractionKt$collectIsPressedAsState$1$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.$this_collectIsPressedAsState = interactionSource;
        this.$isPressed = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new PressInteractionKt$collectIsPressedAsState$1$1(this.$this_collectIsPressedAsState, this.$isPressed, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final ArrayList arrayList = new ArrayList();
            InterfaceC5910f interactions = this.$this_collectIsPressedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isPressed;
            InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1$1.1
                @Override // kotlinx.coroutines.flow.InterfaceC5912g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                    return emit((Interaction) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                }

                public final Object emit(Interaction interaction, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    if (interaction instanceof PressInteraction.Press) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList.remove(((PressInteraction.Release) interaction).getPress());
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList.remove(((PressInteraction.Cancel) interaction).getPress());
                    }
                    mutableState.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                    return C5443s.f8405a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC5912g, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5774b.m5119b(obj);
        }
        return C5443s.f8405a;
    }

    @Override // p152r6.InterfaceC6473e
    public final Object invoke(InterfaceC6009v interfaceC6009v, InterfaceC5631c<? super C5443s> interfaceC5631c) {
        return ((PressInteractionKt$collectIsPressedAsState$1$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
