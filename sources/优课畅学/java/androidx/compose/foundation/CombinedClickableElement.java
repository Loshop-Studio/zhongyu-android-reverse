package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.semantics.Role;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10559a;

/* loaded from: classes.dex */
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC10559a onClick;
    private final String onClickLabel;
    private final InterfaceC10559a onDoubleClick;
    private final InterfaceC10559a onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC10559a interfaceC10559a, String str2, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z11, AbstractC9126n abstractC9126n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC10559a, str2, interfaceC10559a2, interfaceC10559a3, z11);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC9133u.m16128b(this.interactionSource, combinedClickableElement.interactionSource) && AbstractC9133u.m16128b(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.enabled == combinedClickableElement.enabled && AbstractC9133u.m16128b(this.onClickLabel, combinedClickableElement.onClickLabel) && AbstractC9133u.m16128b(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && AbstractC9133u.m16128b(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.interactionSource;
        int iHashCode = (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0) * 31;
        IndicationNodeFactory indicationNodeFactory = this.indicationNodeFactory;
        int iHashCode2 = (((iHashCode + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        String str = this.onClickLabel;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Role role = this.role;
        int iM26123hashCodeimpl = (((iHashCode3 + (role != null ? Role.m26123hashCodeimpl(role.m26125unboximpl()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iM26123hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC10559a interfaceC10559a = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (interfaceC10559a != null ? interfaceC10559a.hashCode() : 0)) * 31;
        InterfaceC10559a interfaceC10559a2 = this.onDoubleClick;
        return ((iHashCode5 + (interfaceC10559a2 != null ? interfaceC10559a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("combinedClickable");
        inspectorInfo.getProperties().set("indicationNodeFactory", this.indicationNodeFactory);
        inspectorInfo.getProperties().set("interactionSource", this.interactionSource);
        inspectorInfo.getProperties().set("enabled", Boolean.valueOf(this.enabled));
        inspectorInfo.getProperties().set("onClickLabel", this.onClickLabel);
        inspectorInfo.getProperties().set("role", this.role);
        inspectorInfo.getProperties().set("onClick", this.onClick);
        inspectorInfo.getProperties().set("onDoubleClick", this.onDoubleClick);
        inspectorInfo.getProperties().set("onLongClick", this.onLongClick);
        inspectorInfo.getProperties().set("onLongClickLabel", this.onLongClickLabel);
        inspectorInfo.getProperties().set("hapticFeedbackEnabled", Boolean.valueOf(this.hapticFeedbackEnabled));
    }

    private CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC10559a interfaceC10559a, String str2, InterfaceC10559a interfaceC10559a2, InterfaceC10559a interfaceC10559a3, boolean z11) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = interfaceC10559a;
        this.onLongClickLabel = str2;
        this.onLongClick = interfaceC10559a2;
        this.onDoubleClick = interfaceC10559a3;
        this.hapticFeedbackEnabled = z11;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        combinedClickableNode.m20399updatenSzSaCc(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }
}
