package androidx.compose.p014ui.input.rotary;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class RotaryInputElement extends ModifierNodeElement<RotaryInputNode> {
    private final InterfaceC9540l onPreRotaryScrollEvent;
    private final InterfaceC9540l onRotaryScrollEvent;

    public RotaryInputElement(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        this.onRotaryScrollEvent = interfaceC9540l;
        this.onPreRotaryScrollEvent = interfaceC9540l2;
    }

    public static /* synthetic */ RotaryInputElement copy$default(RotaryInputElement rotaryInputElement, InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = rotaryInputElement.onRotaryScrollEvent;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l2 = rotaryInputElement.onPreRotaryScrollEvent;
        }
        return rotaryInputElement.copy(interfaceC9540l, interfaceC9540l2);
    }

    public final InterfaceC9540l component1() {
        return this.onRotaryScrollEvent;
    }

    public final InterfaceC9540l component2() {
        return this.onPreRotaryScrollEvent;
    }

    public final RotaryInputElement copy(InterfaceC9540l interfaceC9540l, InterfaceC9540l interfaceC9540l2) {
        return new RotaryInputElement(interfaceC9540l, interfaceC9540l2);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RotaryInputElement)) {
            return false;
        }
        RotaryInputElement rotaryInputElement = (RotaryInputElement) obj;
        return AbstractC9979u.m20289b(this.onRotaryScrollEvent, rotaryInputElement.onRotaryScrollEvent) && AbstractC9979u.m20289b(this.onPreRotaryScrollEvent, rotaryInputElement.onPreRotaryScrollEvent);
    }

    public final InterfaceC9540l getOnPreRotaryScrollEvent() {
        return this.onPreRotaryScrollEvent;
    }

    public final InterfaceC9540l getOnRotaryScrollEvent() {
        return this.onRotaryScrollEvent;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        InterfaceC9540l interfaceC9540l = this.onRotaryScrollEvent;
        int iHashCode = (interfaceC9540l == null ? 0 : interfaceC9540l.hashCode()) * 31;
        InterfaceC9540l interfaceC9540l2 = this.onPreRotaryScrollEvent;
        return iHashCode + (interfaceC9540l2 != null ? interfaceC9540l2.hashCode() : 0);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        InterfaceC9540l interfaceC9540l = this.onRotaryScrollEvent;
        if (interfaceC9540l != null) {
            inspectorInfo.setName("onRotaryScrollEvent");
            inspectorInfo.getProperties().set("onRotaryScrollEvent", interfaceC9540l);
        }
        InterfaceC9540l interfaceC9540l2 = this.onPreRotaryScrollEvent;
        if (interfaceC9540l2 != null) {
            inspectorInfo.setName("onPreRotaryScrollEvent");
            inspectorInfo.getProperties().set("onPreRotaryScrollEvent", interfaceC9540l2);
        }
    }

    public String toString() {
        return "RotaryInputElement(onRotaryScrollEvent=" + this.onRotaryScrollEvent + ", onPreRotaryScrollEvent=" + this.onPreRotaryScrollEvent + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public RotaryInputNode create() {
        return new RotaryInputNode(this.onRotaryScrollEvent, this.onPreRotaryScrollEvent);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(RotaryInputNode rotaryInputNode) {
        rotaryInputNode.setOnEvent(this.onRotaryScrollEvent);
        rotaryInputNode.setOnPreEvent(this.onPreRotaryScrollEvent);
    }
}
