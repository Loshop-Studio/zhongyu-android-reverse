package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p011ui.node.DrawModifierNodeKt;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC6009v;
import kotlinx.coroutines.flow.InterfaceC5910f;
import kotlinx.coroutines.flow.InterfaceC5912g;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", m5303f = "Indication.kt", m5304i = {}, m5305l = {228}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements InterfaceC6473e {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, InterfaceC5631c<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            InterfaceC5910f interactions = this.this$0.interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            InterfaceC5912g interfaceC5912g = new InterfaceC5912g() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // kotlinx.coroutines.flow.InterfaceC5912g
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC5631c interfaceC5631c) {
                    return emit((Interaction) obj2, (InterfaceC5631c<? super C5443s>) interfaceC5631c);
                }

                public final Object emit(Interaction interaction, InterfaceC5631c<? super C5443s> interfaceC5631c) {
                    boolean z8 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        ref$IntRef.element++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        Ref$IntRef ref$IntRef4 = ref$IntRef;
                        ref$IntRef4.element--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        Ref$IntRef ref$IntRef5 = ref$IntRef;
                        ref$IntRef5.element--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        ref$IntRef2.element++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                        ref$IntRef6.element--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        ref$IntRef3.element++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        Ref$IntRef ref$IntRef7 = ref$IntRef3;
                        ref$IntRef7.element--;
                    }
                    boolean z9 = false;
                    boolean z10 = ref$IntRef.element > 0;
                    boolean z11 = ref$IntRef2.element > 0;
                    boolean z12 = ref$IntRef3.element > 0;
                    if (defaultDebugIndicationInstance.isPressed != z10) {
                        defaultDebugIndicationInstance.isPressed = z10;
                        z9 = true;
                    }
                    if (defaultDebugIndicationInstance.isHovered != z11) {
                        defaultDebugIndicationInstance.isHovered = z11;
                        z9 = true;
                    }
                    if (defaultDebugIndicationInstance.isFocused != z12) {
                        defaultDebugIndicationInstance.isFocused = z12;
                    } else {
                        z8 = z9;
                    }
                    if (z8) {
                        DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
                    }
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
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
