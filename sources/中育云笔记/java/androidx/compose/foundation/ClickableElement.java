package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class ClickableElement extends ModifierNodeElement<ClickableNode> {
    private final boolean enabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9529a onClick;
    private final String onClickLabel;
    private final Role role;

    public /* synthetic */ ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return AbstractC9979u.m20289b(this.interactionSource, clickableElement.interactionSource) && AbstractC9979u.m20289b(this.indicationNodeFactory, clickableElement.indicationNodeFactory) && this.enabled == clickableElement.enabled && AbstractC9979u.m20289b(this.onClickLabel, clickableElement.onClickLabel) && AbstractC9979u.m20289b(this.role, clickableElement.role) && this.onClick == clickableElement.onClick;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        return ((iHashCode3 + (role != null ? Role.m32725hashCodeimpl(role.m32727unboximpl()) : 0)) * 31) + this.onClick.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clickable");
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
    }

    private ClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public ClickableNode create() {
        return new ClickableNode(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(ClickableNode clickableNode) {
        clickableNode.m26998updateQzZPfjk(this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, this.onClick);
    }
}
