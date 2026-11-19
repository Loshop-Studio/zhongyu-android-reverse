package androidx.compose.p014ui;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;

/* loaded from: classes2.dex */
final class SensitiveNodeElement extends ModifierNodeElement<SensitiveContentNode> {
    private final boolean isContentSensitive;

    public SensitiveNodeElement(boolean z10) {
        this.isContentSensitive = z10;
    }

    public static /* synthetic */ SensitiveNodeElement copy$default(SensitiveNodeElement sensitiveNodeElement, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = sensitiveNodeElement.isContentSensitive;
        }
        return sensitiveNodeElement.copy(z10);
    }

    public final boolean component1() {
        return this.isContentSensitive;
    }

    public final SensitiveNodeElement copy(boolean z10) {
        return new SensitiveNodeElement(z10);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SensitiveNodeElement) && this.isContentSensitive == ((SensitiveNodeElement) obj).isContentSensitive;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return Boolean.hashCode(this.isContentSensitive);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("sensitiveContent");
        inspectorInfo.getProperties().set("isContentSensitive", Boolean.valueOf(this.isContentSensitive));
    }

    public final boolean isContentSensitive() {
        return this.isContentSensitive;
    }

    public String toString() {
        return "SensitiveNodeElement(isContentSensitive=" + this.isContentSensitive + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SensitiveContentNode create() {
        return new SensitiveContentNode(this.isContentSensitive);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SensitiveContentNode sensitiveContentNode) {
        sensitiveContentNode.setContentSensitive(this.isContentSensitive);
    }
}
