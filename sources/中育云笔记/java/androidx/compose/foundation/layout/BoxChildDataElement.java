package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Alignment;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class BoxChildDataElement extends ModifierNodeElement<BoxChildDataNode> {
    private final Alignment alignment;
    private final InterfaceC9540l inspectorInfo;
    private final boolean matchParentSize;

    public BoxChildDataElement(Alignment alignment, boolean z10, InterfaceC9540l interfaceC9540l) {
        this.alignment = alignment;
        this.matchParentSize = z10;
        this.inspectorInfo = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        BoxChildDataElement boxChildDataElement = obj instanceof BoxChildDataElement ? (BoxChildDataElement) obj : null;
        return boxChildDataElement != null && AbstractC9979u.m20289b(this.alignment, boxChildDataElement.alignment) && this.matchParentSize == boxChildDataElement.matchParentSize;
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchParentSize() {
        return this.matchParentSize;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.matchParentSize);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public BoxChildDataNode create() {
        return new BoxChildDataNode(this.alignment, this.matchParentSize);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(BoxChildDataNode boxChildDataNode) {
        boxChildDataNode.setAlignment(this.alignment);
        boxChildDataNode.setMatchParentSize(this.matchParentSize);
    }
}
