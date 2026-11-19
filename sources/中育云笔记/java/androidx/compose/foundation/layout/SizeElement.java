package androidx.compose.foundation.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class SizeElement extends ModifierNodeElement<SizeNode> {
    private final boolean enforceIncoming;
    private final InterfaceC9540l inspectorInfo;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13, z10, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return C3186Dp.m33506equalsimpl0(this.minWidth, sizeElement.minWidth) && C3186Dp.m33506equalsimpl0(this.minHeight, sizeElement.minHeight) && C3186Dp.m33506equalsimpl0(this.maxWidth, sizeElement.maxWidth) && C3186Dp.m33506equalsimpl0(this.maxHeight, sizeElement.maxHeight) && this.enforceIncoming == sizeElement.enforceIncoming;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3186Dp.m33507hashCodeimpl(this.minWidth) * 31) + C3186Dp.m33507hashCodeimpl(this.minHeight)) * 31) + C3186Dp.m33507hashCodeimpl(this.maxWidth)) * 31) + C3186Dp.m33507hashCodeimpl(this.maxHeight)) * 31) + Boolean.hashCode(this.enforceIncoming);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public /* synthetic */ SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f11, (i10 & 4) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f12, (i10 & 8) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f13, z10, interfaceC9540l, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public SizeNode create() {
        return new SizeNode(this.minWidth, this.minHeight, this.maxWidth, this.maxHeight, this.enforceIncoming, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(SizeNode sizeNode) {
        sizeNode.m27521setMinWidth0680j_4(this.minWidth);
        sizeNode.m27520setMinHeight0680j_4(this.minHeight);
        sizeNode.m27519setMaxWidth0680j_4(this.maxWidth);
        sizeNode.m27518setMaxHeight0680j_4(this.maxHeight);
        sizeNode.setEnforceIncoming(this.enforceIncoming);
    }

    private SizeElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l) {
        this.minWidth = f10;
        this.minHeight = f11;
        this.maxWidth = f12;
        this.maxHeight = f13;
        this.enforceIncoming = z10;
        this.inspectorInfo = interfaceC9540l;
    }
}
