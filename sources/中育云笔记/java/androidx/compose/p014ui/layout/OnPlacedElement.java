package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes2.dex */
final class OnPlacedElement extends ModifierNodeElement<OnPlacedNode> {
    private final InterfaceC9540l onPlaced;

    public OnPlacedElement(InterfaceC9540l interfaceC9540l) {
        this.onPlaced = interfaceC9540l;
    }

    public static /* synthetic */ OnPlacedElement copy$default(OnPlacedElement onPlacedElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = onPlacedElement.onPlaced;
        }
        return onPlacedElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.onPlaced;
    }

    public final OnPlacedElement copy(InterfaceC9540l interfaceC9540l) {
        return new OnPlacedElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnPlacedElement) && AbstractC9979u.m20289b(this.onPlaced, ((OnPlacedElement) obj).onPlaced);
    }

    public final InterfaceC9540l getOnPlaced() {
        return this.onPlaced;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.onPlaced.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("onPlaced");
        inspectorInfo.getProperties().set("onPlaced", this.onPlaced);
    }

    public String toString() {
        return "OnPlacedElement(onPlaced=" + this.onPlaced + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OnPlacedNode create() {
        return new OnPlacedNode(this.onPlaced);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OnPlacedNode onPlacedNode) {
        onPlacedNode.setCallback(this.onPlaced);
    }
}
