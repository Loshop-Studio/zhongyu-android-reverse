package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {
    private final InterfaceC10570l inspectorInfo;
    private final PaddingValues paddingValues;

    public PaddingValuesElement(PaddingValues paddingValues, InterfaceC10570l interfaceC10570l) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC9133u.m16128b(this.paddingValues, paddingValuesElement.paddingValues);
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public PaddingValuesModifier create() {
        return new PaddingValuesModifier(this.paddingValues);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.setPaddingValues(this.paddingValues);
    }
}
