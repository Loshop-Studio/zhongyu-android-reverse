package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.Modifier;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private InterfaceC10570l onEvent;
    private InterfaceC10570l onPreEvent;

    public RotaryInputNode(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.onEvent = interfaceC10570l;
        this.onPreEvent = interfaceC10570l2;
    }

    public final InterfaceC10570l getOnEvent() {
        return this.onEvent;
    }

    public final InterfaceC10570l getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.p013ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        InterfaceC10570l interfaceC10570l = this.onPreEvent;
        if (interfaceC10570l != null) {
            return ((Boolean) interfaceC10570l.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p013ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        InterfaceC10570l interfaceC10570l = this.onEvent;
        if (interfaceC10570l != null) {
            return ((Boolean) interfaceC10570l.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(InterfaceC10570l interfaceC10570l) {
        this.onEvent = interfaceC10570l;
    }

    public final void setOnPreEvent(InterfaceC10570l interfaceC10570l) {
        this.onPreEvent = interfaceC10570l;
    }
}
