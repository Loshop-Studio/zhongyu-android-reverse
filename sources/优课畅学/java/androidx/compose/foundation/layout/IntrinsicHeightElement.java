package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class IntrinsicHeightElement extends ModifierNodeElement<IntrinsicHeightNode> {
    private final boolean enforceIncoming;
    private final IntrinsicSize height;
    private final InterfaceC10570l inspectorInfo;

    public IntrinsicHeightElement(IntrinsicSize intrinsicSize, boolean z10, InterfaceC10570l interfaceC10570l) {
        this.height = intrinsicSize;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        IntrinsicHeightElement intrinsicHeightElement = obj instanceof IntrinsicHeightElement ? (IntrinsicHeightElement) obj : null;
        return intrinsicHeightElement != null && this.height == intrinsicHeightElement.height && this.enforceIncoming == intrinsicHeightElement.enforceIncoming;
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    public final IntrinsicSize getHeight() {
        return this.height;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.height.hashCode() * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public IntrinsicHeightNode create() {
        return new IntrinsicHeightNode(this.height, this.enforceIncoming);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(IntrinsicHeightNode intrinsicHeightNode) {
        intrinsicHeightNode.setHeight(this.height);
        intrinsicHeightNode.setEnforceIncoming(this.enforceIncoming);
    }
}
