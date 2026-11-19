package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {
    private final InterfaceC10570l onPlaced;

    public OnPlacedElement(InterfaceC10570l interfaceC10570l) {
        this.onPlaced = interfaceC10570l;
    }

    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10570l = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(interfaceC10570l);
    }

    public final InterfaceC10570l component1() {
        return this.onPlaced;
    }

    public final OnPlacedElement copy(InterfaceC10570l interfaceC10570l) {
        return new OnPlacedElement(interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && AbstractC9133u.m16128b(this.onPlaced, ((OnPlacedElement) obj).onPlaced);
    }

    public final InterfaceC10570l getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public OnPlacedNode create() {
        return new OnPlacedNode(this.onPlaced);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(OnPlacedNode onPlacedNode) {
        onPlacedNode.setCallback(this.onPlaced);
    }
}
