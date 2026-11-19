package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p013ui.node.ModifierNodeElement;
import androidx.compose.p013ui.platform.InspectorInfo;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final InterfaceC10570l inspectorInfo;
    private boolean rtlAware;
    private float start;

    /* renamed from: top, reason: collision with root package name */
    private float f21442top;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC10570l interfaceC10570l, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, z10, interfaceC10570l);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && C3156Dp.m26904equalsimpl0(this.start, paddingElement.start) && C3156Dp.m26904equalsimpl0(this.f21442top, paddingElement.f21442top) && C3156Dp.m26904equalsimpl0(this.end, paddingElement.end) && C3156Dp.m26904equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m20841getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m20842getEndD9Ej5fM() {
        return this.end;
    }

    public final InterfaceC10570l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m20843getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m20844getTopD9Ej5fM() {
        return this.f21442top;
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3156Dp.m26905hashCodeimpl(this.start) * 31) + C3156Dp.m26905hashCodeimpl(this.f21442top)) * 31) + C3156Dp.m26905hashCodeimpl(this.end)) * 31) + C3156Dp.m26905hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m20845setBottom0680j_4(float f10) {
        this.bottom = f10;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m20846setEnd0680j_4(float f10) {
        this.end = f10;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m20847setStart0680j_4(float f10) {
        this.start = f10;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m20848setTop0680j_4(float f10) {
        this.f21442top = f10;
    }

    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC10570l interfaceC10570l) {
        this.start = f10;
        this.f21442top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC10570l;
        boolean z11 = true;
        boolean z12 = f10 >= 0.0f || Float.isNaN(f10);
        float f14 = this.f21442top;
        boolean z13 = z12 & (f14 >= 0.0f || Float.isNaN(f14));
        float f15 = this.end;
        boolean z14 = z13 & (f15 >= 0.0f || Float.isNaN(f15));
        float f16 = this.bottom;
        if (f16 < 0.0f && !Float.isNaN(f16)) {
            z11 = false;
        }
        if (!z14 || !z11) {
            InlineClassHelperKt.throwIllegalArgumentException("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.f21442top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.p013ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m20867setStart0680j_4(this.start);
        paddingNode.m20868setTop0680j_4(this.f21442top);
        paddingNode.m20866setEnd0680j_4(this.end);
        paddingNode.m20865setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC10570l interfaceC10570l, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.m26899constructorimpl(0) : f10, (i10 & 2) != 0 ? C3156Dp.m26899constructorimpl(0) : f11, (i10 & 4) != 0 ? C3156Dp.m26899constructorimpl(0) : f12, (i10 & 8) != 0 ? C3156Dp.m26899constructorimpl(0) : f13, z10, interfaceC10570l, null);
    }
}
