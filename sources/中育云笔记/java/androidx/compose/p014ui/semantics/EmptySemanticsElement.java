package androidx.compose.p014ui.semantics;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class EmptySemanticsElement extends ModifierNodeElement<EmptySemanticsModifier> {
    public static final int $stable = 0;
    private final EmptySemanticsModifier node;

    public EmptySemanticsElement(EmptySemanticsModifier emptySemanticsModifier) {
        this.node = emptySemanticsModifier;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(EmptySemanticsModifier emptySemanticsModifier) {
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public EmptySemanticsModifier create() {
        return this.node;
    }
}
