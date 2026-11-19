package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import kotlin.AbstractC5774b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6009v;
import p045d6.C5443s;
import p075h6.InterfaceC5631c;
import p152r6.InterfaceC6469a;
import p152r6.InterfaceC6473e;

@Metadata(m5109d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m5110d2 = {"Lkotlinx/coroutines/v;", "Ld6/s;", "<anonymous>", "(Lkotlinx/coroutines/v;)V"}, m5111k = 3, m5112mv = {1, 9, 0})
@DebugMetadata(m5302c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", m5303f = "TextFieldDecoratorModifier.kt", m5304i = {}, m5305l = {220}, m5306m = "invokeSuspend", m5307n = {}, m5308s = {})
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends SuspendLambda implements InterfaceC6473e {
    final /* synthetic */ InterfaceC6469a $requestFocus;
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC6469a interfaceC6469a, InterfaceC5631c<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> interfaceC5631c) {
        super(2, interfaceC5631c);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$requestFocus = interfaceC6469a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5631c<C5443s> create(Object obj, InterfaceC5631c<?> interfaceC5631c) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.this$0, this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, interfaceC5631c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5774b.m5119b(obj);
            MutableInteractionSource interactionSource = this.this$0.getInteractionSource();
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            InterfaceC6469a interfaceC6469a = this.$requestFocus;
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            InterfaceC6469a interfaceC6469a2 = new InterfaceC6469a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2.1
                {
                    super(0);
                }

                @Override // p152r6.InterfaceC6469a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m7854invoke();
                    return C5443s.f8405a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m7854invoke() {
                    if (textFieldDecoratorModifierNode.inputSessionJob != null) {
                        textFieldDecoratorModifierNode.requireKeyboardController().show();
                    } else {
                        textFieldDecoratorModifierNode.startInputSession(true);
                    }
                }
            };
            this.label = 1;
            if (textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, interactionSource, interfaceC6469a, interfaceC6469a2, this) == coroutineSingletons) {
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
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(interfaceC6009v, interfaceC5631c)).invokeSuspend(C5443s.f8405a);
    }
}
