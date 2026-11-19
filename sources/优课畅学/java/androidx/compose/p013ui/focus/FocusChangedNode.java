package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.Modifier;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private InterfaceC10570l onFocusChanged;

    public FocusChangedNode(InterfaceC10570l interfaceC10570l) {
        this.onFocusChanged = interfaceC10570l;
    }

    public final InterfaceC10570l getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.p013ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (AbstractC9133u.m16128b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(InterfaceC10570l interfaceC10570l) {
        this.onFocusChanged = interfaceC10570l;
    }
}
