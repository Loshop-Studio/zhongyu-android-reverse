package androidx.compose.foundation.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FillCrossAxisSizeElement extends ModifierNodeElement<FillCrossAxisSizeNode> {
    public static final int $stable = 0;
    private final float fraction;

    public FillCrossAxisSizeElement(float f10) {
        this.fraction = f10;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        FillCrossAxisSizeNode fillCrossAxisSizeNode = obj instanceof FillCrossAxisSizeNode ? (FillCrossAxisSizeNode) obj : null;
        return fillCrossAxisSizeNode != null && this.fraction == fillCrossAxisSizeNode.getFraction();
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return Float.hashCode(this.fraction) * 31;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("fraction");
        inspectorInfo.setValue(Float.valueOf(this.fraction));
        inspectorInfo.getProperties().set("fraction", Float.valueOf(this.fraction));
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public FillCrossAxisSizeNode create() {
        return new FillCrossAxisSizeNode(this.fraction);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(FillCrossAxisSizeNode fillCrossAxisSizeNode) {
        fillCrossAxisSizeNode.setFraction(this.fraction);
    }
}
