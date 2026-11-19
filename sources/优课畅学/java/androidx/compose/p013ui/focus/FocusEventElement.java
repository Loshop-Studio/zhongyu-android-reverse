package androidx.compose.p013ui.focus;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {
    private final InterfaceC10570l onFocusEvent;

    public FocusEventElement(InterfaceC10570l interfaceC10570l) {
        this.onFocusEvent = interfaceC10570l;
    }

    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.onFocusEvent;
    }

    public final FocusEventElement copy(InterfaceC10570l interfaceC10570l) {
        return new FocusEventElement(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && AbstractC9133u.m16128b(this.onFocusEvent, ((FocusEventElement) obj).onFocusEvent);
    }

    public final InterfaceC10570l getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.onFocusEvent + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public FocusEventNode create() {
        return new FocusEventNode(this.onFocusEvent);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(FocusEventNode focusEventNode) {
        focusEventNode.setOnFocusEvent(this.onFocusEvent);
    }
}
