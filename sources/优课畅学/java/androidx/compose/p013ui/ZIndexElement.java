package androidx.compose.p013ui;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ZIndexElement extends ModifierNodeElement<ZIndexNode> {
    public static final int $stable = 0;
    private final float zIndex;

    public ZIndexElement(float f10) {
        this.zIndex = f10;
    }

    public static /* synthetic */ ZIndexElement copy$default(ZIndexElement zIndexElement, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = zIndexElement.zIndex;
        }
        return zIndexElement.copy(f10);
    }

    public final float component1() {
        return this.zIndex;
    }

    public final ZIndexElement copy(float f10) {
        return new ZIndexElement(f10);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.zIndex, ((ZIndexElement) obj).zIndex) == 0;
    }

    public final float getZIndex() {
        return this.zIndex;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.zIndex);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("zIndex");
        inspectorInfo.getProperties().set("zIndex", Float.valueOf(this.zIndex));
    }

    public String toString() {
        return "ZIndexElement(zIndex=" + this.zIndex + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public ZIndexNode create() {
        return new ZIndexNode(this.zIndex);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(ZIndexNode zIndexNode) {
        zIndexNode.setZIndex(this.zIndex);
    }
}
