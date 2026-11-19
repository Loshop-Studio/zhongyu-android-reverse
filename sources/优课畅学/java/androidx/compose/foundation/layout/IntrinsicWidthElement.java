package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class IntrinsicWidthElement extends ModifierNodeElement<IntrinsicWidthNode> {
    private final boolean enforceIncoming;
    private final InterfaceC10570l inspectorInfo;
    private final IntrinsicSize width;

    public IntrinsicWidthElement(IntrinsicSize intrinsicSize, boolean z10, InterfaceC10570l interfaceC10570l) {
        this.width = intrinsicSize;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicWidthElement intrinsicWidthElement = obj instanceof IntrinsicWidthElement ? (IntrinsicWidthElement) obj : null;
        return intrinsicWidthElement != null && this.width == intrinsicWidthElement.width && this.enforceIncoming == intrinsicWidthElement.enforceIncoming;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final IntrinsicSize getWidth() {
        return this.width;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.width.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public IntrinsicWidthNode create() {
        return new IntrinsicWidthNode(this.width, this.enforceIncoming);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(IntrinsicWidthNode intrinsicWidthNode) {
        intrinsicWidthNode.setWidth(this.width);
        intrinsicWidthNode.setEnforceIncoming(this.enforceIncoming);
    }
}
