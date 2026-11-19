package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class AspectRatioElement extends ModifierNodeElement<AspectRatioNode> {
    private final float aspectRatio;
    private final InterfaceC9540l inspectorInfo;
    private final boolean matchHeightConstraintsFirst;

    public AspectRatioElement(float f10, boolean z10, InterfaceC9540l interfaceC9540l) {
        this.aspectRatio = f10;
        this.matchHeightConstraintsFirst = z10;
        this.inspectorInfo = interfaceC9540l;
        if (f10 > 0.0f) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("aspectRatio " + f10 + " must be > 0");
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        AspectRatioElement aspectRatioElement = obj instanceof AspectRatioElement ? (AspectRatioElement) obj : null;
        return aspectRatioElement != null && this.aspectRatio == aspectRatioElement.aspectRatio && this.matchHeightConstraintsFirst == ((AspectRatioElement) obj).matchHeightConstraintsFirst;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (Float.hashCode(this.aspectRatio) * 31) + Boolean.hashCode(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public AspectRatioNode create() {
        return new AspectRatioNode(this.aspectRatio, this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(AspectRatioNode aspectRatioNode) {
        aspectRatioNode.setAspectRatio(this.aspectRatio);
        aspectRatioNode.setMatchHeightConstraintsFirst(this.matchHeightConstraintsFirst);
    }
}
