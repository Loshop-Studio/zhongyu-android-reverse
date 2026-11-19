package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import kotlin.jvm.internal.AbstractC9979u;
import p181hd.InterfaceC9545q;

/* loaded from: classes2.dex */
final class LayoutElement extends ModifierNodeElement<LayoutModifierImpl> {
    private final InterfaceC9545q measure;

    public LayoutElement(InterfaceC9545q interfaceC9545q) {
        this.measure = interfaceC9545q;
    }

    public static /* synthetic */ LayoutElement copy$default(LayoutElement layoutElement, InterfaceC9545q interfaceC9545q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC9545q = layoutElement.measure;
        }
        return layoutElement.copy(interfaceC9545q);
    }

    public final InterfaceC9545q component1() {
        return this.measure;
    }

    public final LayoutElement copy(InterfaceC9545q interfaceC9545q) {
        return new LayoutElement(interfaceC9545q);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutElement) && AbstractC9979u.m20289b(this.measure, ((LayoutElement) obj).measure);
    }

    public final InterfaceC9545q getMeasure() {
        return this.measure;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return this.measure.hashCode();
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        inspectorInfo.setName("layout");
        inspectorInfo.getProperties().set("measure", this.measure);
    }

    public String toString() {
        return "LayoutElement(measure=" + this.measure + ')';
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public LayoutModifierImpl create() {
        return new LayoutModifierImpl(this.measure);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(LayoutModifierImpl layoutModifierImpl) {
        layoutModifierImpl.setMeasureBlock(this.measure);
    }
}
