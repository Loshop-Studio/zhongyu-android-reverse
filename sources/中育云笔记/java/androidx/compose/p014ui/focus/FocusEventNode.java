package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private InterfaceC9540l onFocusEvent;

    public FocusEventNode(InterfaceC9540l interfaceC9540l) {
        this.onFocusEvent = interfaceC9540l;
    }

    public final InterfaceC9540l getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(InterfaceC9540l interfaceC9540l) {
        this.onFocusEvent = interfaceC9540l;
    }
}
