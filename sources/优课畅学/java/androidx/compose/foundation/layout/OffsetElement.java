package androidx.compose.foundation.layout;

import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final InterfaceC10570l inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x */
    private final float f1152x;

    /* renamed from: y */
    private final float f1153y;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(f10, f11, z10, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && C3156Dp.m26904equalsimpl0(this.f1152x, offsetElement.f1152x) && C3156Dp.m26904equalsimpl0(this.f1153y, offsetElement.f1153y) && this.rtlAware == offsetElement.rtlAware;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m20811getXD9Ej5fM() {
        return this.f1152x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m20812getYD9Ej5fM() {
        return this.f1153y;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((C3156Dp.m26905hashCodeimpl(this.f1152x) * 31) + C3156Dp.m26905hashCodeimpl(this.f1153y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) C3156Dp.m26910toStringimpl(this.f1152x)) + ", y=" + ((Object) C3156Dp.m26910toStringimpl(this.f1153y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetElement(float f10, float f11, boolean z10, InterfaceC10570l interfaceC10570l) {
        this.f1152x = f10;
        this.f1153y = f11;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC10570l;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.f1152x, this.f1153y, this.rtlAware, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m20821updateMdfbLM(this.f1152x, this.f1153y, this.rtlAware);
    }
}
