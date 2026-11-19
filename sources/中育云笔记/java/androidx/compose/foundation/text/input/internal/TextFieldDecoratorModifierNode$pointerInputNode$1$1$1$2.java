package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.p014ui.input.pointer.PointerInputScope;
import kotlin.AbstractC9924b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9544p;
import p309qc.C10786q;
import p393wc.AbstractC11725a;
import p409xc.InterfaceC11829d;
import sd.InterfaceC11122i0;
import vc.InterfaceC11588c;

@InterfaceC11829d(m26210c = "androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2", m26211f = "TextFieldDecoratorModifier.kt", m26212l = {220}, m26213m = "invokeSuspend")
/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2 extends SuspendLambda implements InterfaceC9544p {
    final /* synthetic */ InterfaceC9529a $requestFocus;
    final /* synthetic */ PointerInputScope $this_SuspendingPointerInputModifierNode;
    final /* synthetic */ TextFieldSelectionState $this_with;
    int label;
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode, TextFieldSelectionState textFieldSelectionState, PointerInputScope pointerInputScope, InterfaceC9529a interfaceC9529a, InterfaceC11588c<? super TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2> interfaceC11588c) {
        super(2, interfaceC11588c);
        this.this$0 = textFieldDecoratorModifierNode;
        this.$this_with = textFieldSelectionState;
        this.$this_SuspendingPointerInputModifierNode = pointerInputScope;
        this.$requestFocus = interfaceC9529a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC11588c<C10786q> create(Object obj, InterfaceC11588c<?> interfaceC11588c) {
        return new TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2(this.this$0, this.$this_with, this.$this_SuspendingPointerInputModifierNode, this.$requestFocus, interfaceC11588c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM25952f = AbstractC11725a.m25952f();
        int i10 = this.label;
        if (i10 == 0) {
            AbstractC9924b.m20071b(obj);
            MutableInteractionSource interactionSource = this.this$0.getInteractionSource();
            TextFieldSelectionState textFieldSelectionState = this.$this_with;
            PointerInputScope pointerInputScope = this.$this_SuspendingPointerInputModifierNode;
            InterfaceC9529a interfaceC9529a = this.$requestFocus;
            final TextFieldDecoratorModifierNode textFieldDecoratorModifierNode = this.this$0;
            InterfaceC9529a interfaceC9529a2 = new InterfaceC9529a() { // from class: androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2.1
                {
                    super(0);
                }

                @Override // p181hd.InterfaceC9529a
                public /* bridge */ /* synthetic */ Object invoke() {
                    m28050invoke();
                    return C10786q.f26013a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m28050invoke() {
                    if (textFieldDecoratorModifierNode.inputSessionJob != null) {
                        textFieldDecoratorModifierNode.requireKeyboardController().show();
                    } else {
                        textFieldDecoratorModifierNode.startInputSession(true);
                    }
                }
            };
            this.label = 1;
            if (textFieldSelectionState.detectTextFieldTapGestures(pointerInputScope, interactionSource, interfaceC9529a, interfaceC9529a2, this) == objM25952f) {
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
        return ((TextFieldDecoratorModifierNode$pointerInputNode$1$1$1$2) create(interfaceC11122i0, interfaceC11588c)).invokeSuspend(C10786q.f26013a);
    }
}
