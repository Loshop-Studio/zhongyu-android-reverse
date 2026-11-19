package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class OffsetPxElement extends ModifierNodeElement<OffsetPxNode> {
    private final InterfaceC10570l inspectorInfo;
    private final InterfaceC10570l offset;
    private final boolean rtlAware;

    public OffsetPxElement(InterfaceC10570l interfaceC10570l, boolean z10, InterfaceC10570l interfaceC10570l2) {
        this.offset = interfaceC10570l;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC10570l2;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetPxElement offsetPxElement = obj instanceof OffsetPxElement ? (OffsetPxElement) obj : null;
        return offsetPxElement != null && this.offset == offsetPxElement.offset && this.rtlAware == offsetPxElement.rtlAware;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final InterfaceC10570l getOffset() {
        return this.offset;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.offset.hashCode() * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.offset + ", rtlAware=" + this.rtlAware + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public OffsetPxNode create() {
        return new OffsetPxNode(this.offset, this.rtlAware);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(OffsetPxNode offsetPxNode) {
        offsetPxNode.update(this.offset, this.rtlAware);
    }
}
