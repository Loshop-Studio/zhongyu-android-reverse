package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes.dex */
final class IndicationModifierElement extends ModifierNodeElement<IndicationModifierNode> {
    private final IndicationNodeFactory indication;
    private final InteractionSource interactionSource;

    public IndicationModifierElement(InteractionSource interactionSource, IndicationNodeFactory indicationNodeFactory) {
        this.interactionSource = interactionSource;
        this.indication = indicationNodeFactory;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return AbstractC9979u.m20289b(this.interactionSource, indicationModifierElement.interactionSource) && AbstractC9979u.m20289b(this.indication, indicationModifierElement.indication);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + this.indication.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("indication");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indication", this.indication);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public IndicationModifierNode create() {
        return new IndicationModifierNode(this.indication.create(this.interactionSource));
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(IndicationModifierNode indicationModifierNode) {
        indicationModifierNode.update(this.indication.create(this.interactionSource));
    }
}
