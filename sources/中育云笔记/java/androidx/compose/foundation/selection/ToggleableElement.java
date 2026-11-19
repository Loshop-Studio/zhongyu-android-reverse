package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9540l onValueChange;
    private final Role role;
    private final boolean value;

    public /* synthetic */ ToggleableElement(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(z10, mutableInteractionSource, indicationNodeFactory, z11, role, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.value == toggleableElement.value && AbstractC9979u.m20289b(this.interactionSource, toggleableElement.interactionSource) && AbstractC9979u.m20289b(this.indicationNodeFactory, toggleableElement.indicationNodeFactory) && this.enabled == toggleableElement.enabled && AbstractC9979u.m20289b(this.role, toggleableElement.role) && this.onValueChange == toggleableElement.onValueChange;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.value) * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.m32725hashCodeimpl(role.m32727unboximpl()) : 0)) * 31) + this.onValueChange.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("toggleable");
        inspectorInfo.getProperties().set("value", inspectorInfo.getValue());
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onValueChange", this.onValueChange);
    }

    private ToggleableElement(boolean z10, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z11, Role role, InterfaceC9540l interfaceC9540l) {
        this.value = z10;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z11;
        this.role = role;
        this.onValueChange = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ToggleableNode create() {
        return new ToggleableNode(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ToggleableNode toggleableNode) {
        toggleableNode.m27734updateQzZPfjk(this.value, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onValueChange);
    }
}
