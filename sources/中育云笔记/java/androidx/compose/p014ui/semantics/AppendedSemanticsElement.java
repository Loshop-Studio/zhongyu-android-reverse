package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {
    public static final int $stable = 0;
    private final boolean mergeDescendants;
    private final InterfaceC9540l properties;

    public AppendedSemanticsElement(boolean z10, InterfaceC9540l interfaceC9540l) {
        this.mergeDescendants = z10;
        this.properties = interfaceC9540l;
    }

    public static /* synthetic */ AppendedSemanticsElement copy$default(AppendedSemanticsElement appendedSemanticsElement, boolean z10, InterfaceC9540l interfaceC9540l, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = appendedSemanticsElement.mergeDescendants;
        }
        if ((i10 & 2) != 0) {
            interfaceC9540l = appendedSemanticsElement.properties;
        }
        return appendedSemanticsElement.copy(z10, interfaceC9540l);
    }

    public final boolean component1() {
        return this.mergeDescendants;
    }

    public final InterfaceC9540l component2() {
        return this.properties;
    }

    public final AppendedSemanticsElement copy(boolean z10, InterfaceC9540l interfaceC9540l) {
        return new AppendedSemanticsElement(z10, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.mergeDescendants == appendedSemanticsElement.mergeDescendants && AbstractC9979u.m20289b(this.properties, appendedSemanticsElement.properties);
    }

    public final boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    public final InterfaceC9540l getProperties() {
        return this.properties;
    }

    @Override // androidx.compose.p014ui.semantics.SemanticsModifier
    public SemanticsConfiguration getSemanticsConfiguration() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.setMergingSemanticsOfDescendants(this.mergeDescendants);
        this.properties.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (Boolean.hashCode(this.mergeDescendants) * 31) + this.properties.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("semantics");
        inspectorInfo.getProperties().set("mergeDescendants", Boolean.valueOf(this.mergeDescendants));
        SemanticsModifierKt.addSemanticsPropertiesFrom(inspectorInfo, getSemanticsConfiguration());
    }

    public String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.mergeDescendants + ", properties=" + this.properties + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public CoreSemanticsModifierNode create() {
        return new CoreSemanticsModifierNode(this.mergeDescendants, false, this.properties);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(CoreSemanticsModifierNode coreSemanticsModifierNode) {
        coreSemanticsModifierNode.setMergeDescendants(this.mergeDescendants);
        coreSemanticsModifierNode.setProperties(this.properties);
    }
}
