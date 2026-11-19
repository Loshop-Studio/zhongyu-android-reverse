package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.p013ui.focus.FocusDirection;
import androidx.compose.p013ui.focus.FocusManager;
import androidx.compose.p013ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p013ui.platform.CompositionLocalsKt;
import androidx.compose.p013ui.text.input.ImeAction;

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
    public void mo21202defaultKeyboardActionKlQnJC8(int i10) {
        ImeAction.Companion companion = ImeAction.Companion;
        if (ImeAction.m26530equalsimpl0(i10, companion.m26546getNexteUduSuo())) {
            getFocusManager().mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23920getNextdhqQ8s());
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26548getPreviouseUduSuo())) {
            getFocusManager().mo23927moveFocus3ESFkO8(FocusDirection.Companion.m23921getPreviousdhqQ8s());
        } else if (ImeAction.m26530equalsimpl0(i10, companion.m26544getDoneeUduSuo())) {
            this.this$0.requireKeyboardController().hide();
        }
    }
}
