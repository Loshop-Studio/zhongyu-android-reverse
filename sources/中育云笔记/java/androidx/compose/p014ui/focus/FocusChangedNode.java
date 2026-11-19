package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.Modifier;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class FocusChangedNode extends Modifier.Node implements FocusEventModifierNode {
    private FocusState focusState;
    private InterfaceC9540l onFocusChanged;

    public FocusChangedNode(InterfaceC9540l interfaceC9540l) {
        this.onFocusChanged = interfaceC9540l;
    }

    public final InterfaceC9540l getOnFocusChanged() {
        return this.onFocusChanged;
    }

    @Override // androidx.compose.p014ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        if (AbstractC9979u.m20289b(this.focusState, focusState)) {
            return;
        }
        this.focusState = focusState;
        this.onFocusChanged.invoke(focusState);
    }

    public final void setOnFocusChanged(InterfaceC9540l interfaceC9540l) {
        this.onFocusChanged = interfaceC9540l;
    }
}
