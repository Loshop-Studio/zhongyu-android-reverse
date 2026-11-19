package androidx.compose.foundation.selection;

import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import androidx.compose.p014ui.state.ToggleableState;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class TriStateToggleableElement extends ModifierNodeElement<TriStateToggleableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9529a onClick;
    private final Role role;
    private final ToggleableState state;

    public /* synthetic */ TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(toggleableState, mutableInteractionSource, indicationNodeFactory, z10, role, interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.state == triStateToggleableElement.state && AbstractC9979u.m20289b(this.interactionSource, triStateToggleableElement.interactionSource) && AbstractC9979u.m20289b(this.indicationNodeFactory, triStateToggleableElement.indicationNodeFactory) && this.enabled == triStateToggleableElement.enabled && AbstractC9979u.m20289b(this.role, triStateToggleableElement.role) && this.onClick == triStateToggleableElement.onClick;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode2 = (iHashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode3 = (((iHashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.m32725hashCodeimpl(role.m32727unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("triStateToggleable");
        inspectorInfo.getProperties().set("state", this.state);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
    }

    private TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, Role role, InterfaceC9529a interfaceC9529a) {
        this.state = toggleableState;
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z10;
        this.role = role;
        this.onClick = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public TriStateToggleableNode create() {
        return new TriStateToggleableNode(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(TriStateToggleableNode triStateToggleableNode) {
        triStateToggleableNode.m27737updateQzZPfjk(this.state, this.interactionSource, this.indicationNodeFactory, this.enabled, this.role, this.onClick);
    }
}
