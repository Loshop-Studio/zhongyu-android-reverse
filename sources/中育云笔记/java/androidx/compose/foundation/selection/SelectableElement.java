package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class SelectableElement extends ModifierNodeElement<SelectableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9529a onClick;
    private final Role role;
    private final boolean selected;

    public /* synthetic */ SelectableElement(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.selected == selectableElement.selected && AbstractC9979u.m20289b(this.interactionSource, selectableElement.interactionSource) && AbstractC9979u.m20289b(this.indicationNodeFactory, selectableElement.indicationNodeFactory) && this.enabled == selectableElement.enabled && AbstractC9979u.m20289b(this.role, selectableElement.role) && this.onClick == selectableElement.onClick;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.selected) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.m32725hashCodeimpl(role.m32727unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("selectable");
        inspectorInfo.getProperties().set("selected", Boolean.valueOf(this.selected));
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
    }

    private SelectableElement(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9529a interfaceC9529a) {
        this.selected = z10;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z11;
        this.role = role;
        this.onClick = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SelectableNode create() {
        return new SelectableNode(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SelectableNode selectableNode) {
        selectableNode.m27725updateQzZPfjk(this.selected, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }
}
