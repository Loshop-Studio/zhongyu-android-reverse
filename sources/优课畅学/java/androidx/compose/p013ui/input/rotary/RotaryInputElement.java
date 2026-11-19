package androidx.compose.p013ui.input.rotary;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final InterfaceC10570l onPreRotaryScrollEvent;
    private final InterfaceC10570l onRotaryScrollEvent;

    public RotaryInputElement(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        this.onRotaryScrollEvent = interfaceC10570l;
        this.onPreRotaryScrollEvent = interfaceC10570l2;
    }

    public static /* synthetic */ RotaryInputElement copy$default(RotaryInputElement rotaryInputElement, InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i10 & 2) != 0) {
            interfaceC10570l2 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(interfaceC10570l, interfaceC10570l2);
    }

    public final InterfaceC10570l component1() {
        return this.onRotaryScrollEvent;
    }

    public final InterfaceC10570l component2() {
        return this.onPreRotaryScrollEvent;
    }

    public final RotaryInputElement copy(InterfaceC10570l interfaceC10570l, InterfaceC10570l interfaceC10570l2) {
        return new RotaryInputElement(interfaceC10570l, interfaceC10570l2);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return AbstractC9133u.m16128b(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && AbstractC9133u.m16128b(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    public final InterfaceC10570l getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final InterfaceC10570l getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC10570l interfaceC10570l = this.onRotaryScrollEvent;
        int iHashCode = (interfaceC10570l == null ? 0 : interfaceC10570l.hashCode()) * 31;
        InterfaceC10570l interfaceC10570l2 = this.onPreRotaryScrollEvent;
        return iHashCode + (interfaceC10570l2 != null ? interfaceC10570l2.hashCode() : 0);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC10570l interfaceC10570l = this.onRotaryScrollEvent;
        if (interfaceC10570l != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", interfaceC10570l);
        }
        InterfaceC10570l interfaceC10570l2 = this.onPreRotaryScrollEvent;
        if (interfaceC10570l2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", interfaceC10570l2);
        }
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
