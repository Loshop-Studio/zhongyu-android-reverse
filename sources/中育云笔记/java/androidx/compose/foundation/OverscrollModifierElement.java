package androidx.compose.foundation;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class OverscrollModifierElement extends ModifierNodeElement<OverscrollModifierNode> {
    private final OverscrollEffect overscrollEffect;

    public OverscrollModifierElement(OverscrollEffect overscrollEffect) {
        this.overscrollEffect = overscrollEffect;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OverscrollModifierElement) && AbstractC9979u.m20289b(this.overscrollEffect, ((OverscrollModifierElement) obj).overscrollEffect);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        if (overscrollEffect != null) {
            return overscrollEffect.hashCode();
        }
        return 0;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("overscroll");
        inspectorInfo.getProperties().set("overscrollEffect", this.overscrollEffect);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OverscrollModifierNode create() {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        return new OverscrollModifierNode(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OverscrollModifierNode overscrollModifierNode) {
        OverscrollEffect overscrollEffect = this.overscrollEffect;
        overscrollModifierNode.update(overscrollEffect != null ? overscrollEffect.getNode() : null);
    }
}
