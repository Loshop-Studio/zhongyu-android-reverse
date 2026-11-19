package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9133u;
import p300x7.InterfaceC10575q;

/* loaded from: classes2.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final InterfaceC10575q measure;

    public LayoutElement(InterfaceC10575q interfaceC10575q) {
        this.measure = interfaceC10575q;
    }

    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, InterfaceC10575q interfaceC10575q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC10575q = layoutElement.measure;
        }
        return layoutElement.copy(interfaceC10575q);
    }

    public final InterfaceC10575q component1() {
        return this.measure;
    }

    public final LayoutElement copy(InterfaceC10575q interfaceC10575q) {
        return new LayoutElement(interfaceC10575q);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC9133u.m16128b(this.measure, ((LayoutElement) obj).measure);
    }

    public final InterfaceC10575q getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
