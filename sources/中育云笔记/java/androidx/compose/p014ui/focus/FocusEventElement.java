package androidx.compose.p014ui.focus;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class FocusEventElement extends ModifierNodeElement<FocusEventNode> {
    private final InterfaceC9540l onFocusEvent;

    public FocusEventElement(InterfaceC9540l interfaceC9540l) {
        this.onFocusEvent = interfaceC9540l;
    }

    public static /* synthetic */ FocusEventElement copy$default(FocusEventElement focusEventElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = focusEventElement.onFocusEvent;
        }
        return focusEventElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onFocusEvent;
    }

    public final FocusEventElement copy(InterfaceC9540l interfaceC9540l) {
        return new FocusEventElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusEventElement) && AbstractC9979u.m20289b(this.onFocusEvent, ((FocusEventElement) obj).onFocusEvent);
    }

    public final InterfaceC9540l getOnFocusEvent() {
        return this.onFocusEvent;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onFocusEvent.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onFocusEvent");
        inspectorInfo.getProperties().set("onFocusEvent", this.onFocusEvent);
    }

    public String toString() {
        return "FocusEventElement(onFocusEvent=" + this.onFocusEvent + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FocusEventNode create() {
        return new FocusEventNode(this.onFocusEvent);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FocusEventNode focusEventNode) {
        focusEventNode.setOnFocusEvent(this.onFocusEvent);
    }
}
