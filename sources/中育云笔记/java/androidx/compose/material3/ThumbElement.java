package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes2.dex */
final class ThumbElement extends ModifierNodeElement<ThumbNode> {
    private final boolean checked;
    private final InteractionSource interactionSource;

    public ThumbElement(InteractionSource interactionSource, boolean z10) {
        this.interactionSource = interactionSource;
        this.checked = z10;
    }

    public static /* synthetic */ ThumbElement copy$default(ThumbElement thumbElement, InteractionSource interactionSource, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interactionSource = thumbElement.interactionSource;
        }
        if ((i10 & 2) != 0) {
            z10 = thumbElement.checked;
        }
        return thumbElement.copy(interactionSource, z10);
    }

    public final InteractionSource component1() {
        return this.interactionSource;
    }

    public final boolean component2() {
        return this.checked;
    }

    public final ThumbElement copy(InteractionSource interactionSource, boolean z10) {
        return new ThumbElement(interactionSource, z10);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThumbElement)) {
            return false;
        }
        ThumbElement thumbElement = (ThumbElement) obj;
        return AbstractC9979u.m20289b(this.interactionSource, thumbElement.interactionSource) && this.checked == thumbElement.checked;
    }

    public final boolean getChecked() {
        return this.checked;
    }

    public final InteractionSource getInteractionSource() {
        return this.interactionSource;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (this.interactionSource.hashCode() * 31) + Boolean.hashCode(this.checked);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("switchThumb");
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("checked", Boolean.valueOf(this.checked));
    }

    public String toString() {
        return "ThumbElement(interactionSource=" + this.interactionSource + ", checked=" + this.checked + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ThumbNode create() {
        return new ThumbNode(this.interactionSource, this.checked);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ThumbNode thumbNode) {
        thumbNode.setInteractionSource(this.interactionSource);
        if (thumbNode.getChecked() != this.checked) {
            LayoutModifierNodeKt.invalidateMeasurement(thumbNode);
        }
        thumbNode.setChecked(this.checked);
        thumbNode.update();
    }
}
