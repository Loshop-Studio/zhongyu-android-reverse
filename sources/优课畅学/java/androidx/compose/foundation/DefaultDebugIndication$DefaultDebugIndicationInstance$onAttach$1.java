package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p013ui.node.DrawModifierNodeKt;
import kotlin.AbstractC9079b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import p123h7.C8736p;
import p135i8.InterfaceC8822b0;
import p169l8.InterfaceC9266c;
import p169l8.InterfaceC9267d;
import p179m7.InterfaceC9324c;
import p190n7.AbstractC9434a;
import p201o7.InterfaceC9539d;
import p300x7.InterfaceC10574p;

@InterfaceC9539d(m17800c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", m17801f = "Indication.kt", m17802l = {228}, m17803m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements InterfaceC10574p {
    int label;
    final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, InterfaceC9324c<? super DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1> interfaceC9324c) {
        super(2, interfaceC9324c);
        this.this$0 = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC9324c<C8736p> create(Object obj, InterfaceC9324c<?> interfaceC9324c) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.this$0, interfaceC9324c);
    }

    @Override // p300x7.InterfaceC10574p
    public final Object invoke(InterfaceC8822b0 interfaceC8822b0, InterfaceC9324c<? super C8736p> interfaceC9324c) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create(interfaceC8822b0, interfaceC9324c)).invokeSuspend(C8736p.f16368a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM17291f = AbstractC9434a.m17291f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9079b.m15926b(obj);
            final Ref$IntRef ref$IntRef = new Ref$IntRef();
            final Ref$IntRef ref$IntRef2 = new Ref$IntRef();
            final Ref$IntRef ref$IntRef3 = new Ref$IntRef();
            InterfaceC9266c interactions = this.this$0.interactionSource.getInteractions();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.this$0;
            InterfaceC9267d interfaceC9267d = new InterfaceC9267d() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // p169l8.InterfaceC9267d
                public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC9324c interfaceC9324c) {
                    return emit((Interaction) obj2, (InterfaceC9324c<? super C8736p>) interfaceC9324c);
                }

                public final Object emit(Interaction interaction, InterfaceC9324c<? super C8736p> interfaceC9324c) {
                    boolean z10 = true;
                    if (interaction instanceof PressInteraction.Press) {
                        ref$IntRef.f17471a++;
                    } else if (interaction instanceof PressInteraction.Release) {
                        Ref$IntRef ref$IntRef4 = ref$IntRef;
                        ref$IntRef4.f17471a--;
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        Ref$IntRef ref$IntRef5 = ref$IntRef;
                        ref$IntRef5.f17471a--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        ref$IntRef2.f17471a++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        Ref$IntRef ref$IntRef6 = ref$IntRef2;
                        ref$IntRef6.f17471a--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        ref$IntRef3.f17471a++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        Ref$IntRef ref$IntRef7 = ref$IntRef3;
                        ref$IntRef7.f17471a--;
                    }
                    boolean z11 = false;
                    boolean z12 = ref$IntRef.f17471a > 0;
                    boolean z13 = ref$IntRef2.f17471a > 0;
                    boolean z14 = ref$IntRef3.f17471a > 0;
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
                    return C8736p.f16368a;
                }
            };
            this.label = 1;
            if (interactions.collect(interfaceC9267d, this) == objM17291f) {
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
