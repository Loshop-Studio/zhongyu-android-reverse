package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FocusEventNode extends Modifier.Node implements FocusEventModifierNode {
    private InterfaceC10570l onFocusEvent;

    public FocusEventNode(InterfaceC10570l interfaceC10570l) {
        this.onFocusEvent = interfaceC10570l;
    }

    public final InterfaceC10570l getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        this.onFocusEvent.invoke(focusState);
    }

    public final void setOnFocusEvent(InterfaceC10570l interfaceC10570l) {
        this.onFocusEvent = interfaceC10570l;
    }
}
