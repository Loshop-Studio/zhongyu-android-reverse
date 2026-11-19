package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.p014ui.focus.FocusDirection;
import androidx.compose.p014ui.focus.FocusManager;
import androidx.compose.p014ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p014ui.platform.CompositionLocalsKt;
import androidx.compose.p014ui.text.input.ImeAction;

/* loaded from: classes.dex */
public final class TextFieldDecoratorModifierNode$keyboardActionScope$1 implements KeyboardActionScope {
    final /* synthetic */ TextFieldDecoratorModifierNode this$0;

    public TextFieldDecoratorModifierNode$keyboardActionScope$1(TextFieldDecoratorModifierNode textFieldDecoratorModifierNode) {
        this.this$0 = textFieldDecoratorModifierNode;
    }

    private final FocusManager getFocusManager() {
        return (FocusManager) CompositionLocalConsumerModifierNodeKt.currentValueOf(this.this$0, CompositionLocalsKt.getLocalFocusManager());
    }

    @Override // androidx.compose.foundation.text.KeyboardActionScope
    /* renamed from: defaultKeyboardAction-KlQnJC8 */
    public void mo27804defaultKeyboardActionKlQnJC8(int i10) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m33132equalsimpl0(i10, companion.m33148getNexteUduSuo())) {
            getFocusManager().mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30522getNextdhqQ8s());
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33150getPreviouseUduSuo())) {
            getFocusManager().mo30529moveFocus3ESFkO8(FocusDirection.Companion.m30523getPreviousdhqQ8s());
        } else if (ImeAction.m33132equalsimpl0(i10, companion.m33146getDoneeUduSuo())) {
            this.this$0.requireKeyboardController().hide();
        }
    }
}
