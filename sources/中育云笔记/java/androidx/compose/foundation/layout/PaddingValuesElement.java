package androidx.compose.foundation.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class PaddingValuesElement extends ModifierNodeElement<PaddingValuesModifier> {
    private final InterfaceC9540l inspectorInfo;
    private final PaddingValues paddingValues;

    public PaddingValuesElement(PaddingValues paddingValues, InterfaceC9540l interfaceC9540l) {
        this.paddingValues = paddingValues;
        this.inspectorInfo = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingValuesElement paddingValuesElement = obj instanceof PaddingValuesElement ? (PaddingValuesElement) obj : null;
        if (paddingValuesElement == null) {
            return false;
        }
        return AbstractC9979u.m20289b(this.paddingValues, paddingValuesElement.paddingValues);
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final PaddingValues getPaddingValues() {
        return this.paddingValues;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.paddingValues.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public PaddingValuesModifier create() {
        return new PaddingValuesModifier(this.paddingValues);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(PaddingValuesModifier paddingValuesModifier) {
        paddingValuesModifier.setPaddingValues(this.paddingValues);
    }
}
