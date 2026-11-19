package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final InterfaceC9540l properties;

    public ClearAndSetSemanticsElement(InterfaceC9540l interfaceC9540l) {
        this.properties = interfaceC9540l;
    }

    public static /* synthetic */ ClearAndSetSemanticsElement copy$default(ClearAndSetSemanticsElement clearAndSetSemanticsElement, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9540l = clearAndSetSemanticsElement.properties;
        }
        return clearAndSetSemanticsElement.copy(interfaceC9540l);
    }

    public final InterfaceC9540l component1() {
        return this.properties;
    }

    public final ClearAndSetSemanticsElement copy(InterfaceC9540l interfaceC9540l) {
        return new ClearAndSetSemanticsElement(interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && AbstractC9979u.m20289b(this.properties, ((ClearAndSetSemanticsElement) obj).properties);
    }

    public final InterfaceC9540l getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(false);
        semanticsConfiguration.setClearingSemantics(true);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.properties.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("clearAndSetSemantics");
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    public String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.properties + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(false, true, this.properties);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
