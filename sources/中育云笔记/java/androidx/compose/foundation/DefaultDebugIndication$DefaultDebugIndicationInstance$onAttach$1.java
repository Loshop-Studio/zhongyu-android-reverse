package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p014ui.node.DrawModifierNodeKt;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p379vd.InterfaceC11594c;
import p379vd.InterfaceC11595d;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", m26211f = "Indication.kt", m26212l = {228}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements InterfaceC9544p {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, InterfaceC11588c<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            InterfaceC11594c interactions = this.this$0.interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            InterfaceC11595d interfaceC11595d = new InterfaceC11595d() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // p379vd.InterfaceC11595d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC11588c interfaceC11588c) {
                    return emit((Interaction) obj2, (InterfaceC11588c<? super C10786q>) interfaceC11588c);
                }

                public final Object emit(Interaction interaction, InterfaceC11588c<? super C10786q> interfaceC11588c) {
                    boolean z10 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        ref$IntRef.f23400c++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        Ref$IntRef ref$IntRef4 = ref$IntRef;
                        ref$IntRef4.f23400c--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        Ref$IntRef ref$IntRef5 = ref$IntRef;
                        ref$IntRef5.f23400c--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        ref$IntRef2.f23400c++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                        ref$IntRef6.f23400c--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        ref$IntRef3.f23400c++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        Ref$IntRef ref$IntRef7 = ref$IntRef3;
                        ref$IntRef7.f23400c--;
                    }
                    boolean z11 = false;
                    boolean z12 = ref$IntRef.f23400c > 0;
                    boolean z13 = ref$IntRef2.f23400c > 0;
                    boolean z14 = ref$IntRef3.f23400c > 0;
                    if (defaultDebugIndicationInstance.isPressed != z12) {
                        defaultDebugIndicationInstance.isPressed = z12;
                        z11 = true;
                    }
                    if (defaultDebugIndicationInstance.isHovered != z13) {
                        defaultDebugIndicationInstance.isHovered = z13;
                        z11 = true;
                    }
                    if (defaultDebugIndicationInstance.isFocused != z14) {
                        defaultDebugIndicationInstance.isFocused = z14;
                    } else {
                        z10 = z11;
                    }
                    if (z10) {
                        DrawModifierNodeKt.invalidateDraw(defaultDebugIndicationInstance);
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
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
