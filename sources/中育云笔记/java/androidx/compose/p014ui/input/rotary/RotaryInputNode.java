package androidx.compose.p014ui.input.rotary;

import androidx.compose.p014ui.Modifier;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class RotaryInputNode extends Modifier.Node implements RotaryInputModifierNode {
    private InterfaceC9540l onEvent;
    private InterfaceC9540l onPreEvent;

    public RotaryInputNode(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.onEvent = interfaceC9540l;
        this.onPreEvent = interfaceC9540l2;
    }

    public final InterfaceC9540l getOnEvent() {
        return this.onEvent;
    }

    public final InterfaceC9540l getOnPreEvent() {
        return this.onPreEvent;
    }

    @Override // androidx.compose.p014ui.input.rotary.RotaryInputModifierNode
    public boolean onPreRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        InterfaceC9540l interfaceC9540l = this.onPreEvent;
        if (interfaceC9540l != null) {
            return ((Boolean) interfaceC9540l.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.p014ui.input.rotary.RotaryInputModifierNode
    public boolean onRotaryScrollEvent(RotaryScrollEvent rotaryScrollEvent) {
        InterfaceC9540l interfaceC9540l = this.onEvent;
        if (interfaceC9540l != null) {
            return ((Boolean) interfaceC9540l.invoke(rotaryScrollEvent)).booleanValue();
        }
        return false;
    }

    public final void setOnEvent(InterfaceC9540l interfaceC9540l) {
        this.onEvent = interfaceC9540l;
    }

    public final void setOnPreEvent(InterfaceC9540l interfaceC9540l) {
        this.onPreEvent = interfaceC9540l;
    }
}
