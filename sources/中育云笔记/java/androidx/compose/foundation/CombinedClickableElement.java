package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.semantics.Role;
import kotlin.jvm.internal.AbstractC9972n;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9529a;

/* loaded from: classes.dex */
final class CombinedClickableElement extends ModifierNodeElement<CombinedClickableNode> {
    private final boolean enabled;
    private final boolean hapticFeedbackEnabled;
    private final IndicationNodeFactory indicationNodeFactory;
    private final MutableInteractionSource interactionSource;
    private final InterfaceC9529a onClick;
    private final String onClickLabel;
    private final InterfaceC9529a onDoubleClick;
    private final InterfaceC9529a onLongClick;
    private final String onLongClickLabel;
    private final Role role;

    public /* synthetic */ CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, String str2, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, boolean z11, AbstractC9972n abstractC9972n) {
        this(mutableInteractionSource, indicationNodeFactory, z10, str, role, interfaceC9529a, str2, interfaceC9529a2, interfaceC9529a3, z11);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CombinedClickableElement.class != obj.getClass()) {
            return false;
        }
        CombinedClickableElement combinedClickableElement = (CombinedClickableElement) obj;
        return AbstractC9979u.m20289b(this.interactionSource, combinedClickableElement.interactionSource) && AbstractC9979u.m20289b(this.indicationNodeFactory, combinedClickableElement.indicationNodeFactory) && this.enabled == combinedClickableElement.enabled && AbstractC9979u.m20289b(this.onClickLabel, combinedClickableElement.onClickLabel) && AbstractC9979u.m20289b(this.role, combinedClickableElement.role) && this.onClick == combinedClickableElement.onClick && AbstractC9979u.m20289b(this.onLongClickLabel, combinedClickableElement.onLongClickLabel) && this.onLongClick == combinedClickableElement.onLongClick && this.onDoubleClick == combinedClickableElement.onDoubleClick && this.hapticFeedbackEnabled == combinedClickableElement.hapticFeedbackEnabled;
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
        int iM32725hashCodeimpl = (((iHashCode3 + (role != null ? Role.m32725hashCodeimpl(role.m32727unboximpl()) : 0)) * 31) + this.onClick.hashCode()) * 31;
        String str2 = this.onLongClickLabel;
        int iHashCode4 = (iM32725hashCodeimpl + (str2 != null ? str2.hashCode() : 0)) * 31;
        InterfaceC9529a interfaceC9529a = this.onLongClick;
        int iHashCode5 = (iHashCode4 + (interfaceC9529a != null ? interfaceC9529a.hashCode() : 0)) * 31;
        InterfaceC9529a interfaceC9529a2 = this.onDoubleClick;
        return ((iHashCode5 + (interfaceC9529a2 != null ? interfaceC9529a2.hashCode() : 0)) * 31) + Boolean.hashCode(this.hapticFeedbackEnabled);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
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

    private CombinedClickableElement(MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z10, String str, Role role, InterfaceC9529a interfaceC9529a, String str2, InterfaceC9529a interfaceC9529a2, InterfaceC9529a interfaceC9529a3, boolean z11) {
        this.interactionSource = mutableInteractionSource;
        this.indicationNodeFactory = indicationNodeFactory;
        this.enabled = z10;
        this.onClickLabel = str;
        this.role = role;
        this.onClick = interfaceC9529a;
        this.onLongClickLabel = str2;
        this.onLongClick = interfaceC9529a2;
        this.onDoubleClick = interfaceC9529a3;
        this.hapticFeedbackEnabled = z11;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public CombinedClickableNode create() {
        return new CombinedClickableNode(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.hapticFeedbackEnabled, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(CombinedClickableNode combinedClickableNode) {
        combinedClickableNode.setHapticFeedbackEnabled(this.hapticFeedbackEnabled);
        combinedClickableNode.m27001updatenSzSaCc(this.onClick, this.onLongClickLabel, this.onLongClick, this.onDoubleClick, this.interactionSource, this.indicationNodeFactory, this.enabled, this.onClickLabel, this.role);
    }
}
