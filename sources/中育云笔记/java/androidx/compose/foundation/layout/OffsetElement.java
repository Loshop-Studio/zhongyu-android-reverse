package androidx.compose.foundation.layout;

import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class OffsetElement extends ModifierNodeElement<OffsetNode> {
    private final InterfaceC9540l inspectorInfo;
    private final boolean rtlAware;

    /* renamed from: x */
    private final float f1082x;

    /* renamed from: y */
    private final float f1083y;

    public /* synthetic */ OffsetElement(float f10, float f11, boolean z10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(f10, f11, z10, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        OffsetElement offsetElement = obj instanceof OffsetElement ? (OffsetElement) obj : null;
        return offsetElement != null && C3186Dp.m33506equalsimpl0(this.f1082x, offsetElement.f1082x) && C3186Dp.m33506equalsimpl0(this.f1083y, offsetElement.f1083y) && this.rtlAware == offsetElement.rtlAware;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m27413getXD9Ej5fM() {
        return this.f1082x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m27414getYD9Ej5fM() {
        return this.f1083y;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((C3186Dp.m33507hashCodeimpl(this.f1082x) * 31) + C3186Dp.m33507hashCodeimpl(this.f1083y)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    public String toString() {
        return "OffsetModifierElement(x=" + ((Object) C3186Dp.m33512toStringimpl(this.f1082x)) + ", y=" + ((Object) C3186Dp.m33512toStringimpl(this.f1083y)) + ", rtlAware=" + this.rtlAware + ')';
    }

    private OffsetElement(float f10, float f11, boolean z10, InterfaceC9540l interfaceC9540l) {
        this.f1082x = f10;
        this.f1083y = f11;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC9540l;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public OffsetNode create() {
        return new OffsetNode(this.f1082x, this.f1083y, this.rtlAware, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(OffsetNode offsetNode) {
        offsetNode.m27423updateMdfbLM(this.f1082x, this.f1083y, this.rtlAware);
    }
}
