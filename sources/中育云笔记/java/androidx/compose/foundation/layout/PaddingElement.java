package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.p014ui.node.ModifierNodeElement;
import androidx.compose.p014ui.platform.InspectorInfo;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;

/* loaded from: classes.dex */
final class PaddingElement extends ModifierNodeElement<PaddingNode> {
    private float bottom;
    private float end;
    private final InterfaceC9540l inspectorInfo;
    private boolean rtlAware;
    private float start;

    /* renamed from: top, reason: collision with root package name */
    private float f28510top;

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13, z10, interfaceC9540l);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public boolean equals(Object obj) {
        PaddingElement paddingElement = obj instanceof PaddingElement ? (PaddingElement) obj : null;
        return paddingElement != null && C3186Dp.m33506equalsimpl0(this.start, paddingElement.start) && C3186Dp.m33506equalsimpl0(this.f28510top, paddingElement.f28510top) && C3186Dp.m33506equalsimpl0(this.end, paddingElement.end) && C3186Dp.m33506equalsimpl0(this.bottom, paddingElement.bottom) && this.rtlAware == paddingElement.rtlAware;
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m27443getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m27444getEndD9Ej5fM() {
        return this.end;
    }

    public final InterfaceC9540l getInspectorInfo() {
        return this.inspectorInfo;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m27445getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m27446getTopD9Ej5fM() {
        return this.f28510top;
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public int hashCode() {
        return (((((((C3186Dp.m33507hashCodeimpl(this.start) * 31) + C3186Dp.m33507hashCodeimpl(this.f28510top)) * 31) + C3186Dp.m33507hashCodeimpl(this.end)) * 31) + C3186Dp.m33507hashCodeimpl(this.bottom)) * 31) + Boolean.hashCode(this.rtlAware);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void inspectableProperties(InspectorInfo inspectorInfo) {
        this.inspectorInfo.invoke(inspectorInfo);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m27447setBottom0680j_4(float f10) {
        this.bottom = f10;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m27448setEnd0680j_4(float f10) {
        this.end = f10;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m27449setStart0680j_4(float f10) {
        this.start = f10;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m27450setTop0680j_4(float f10) {
        this.f28510top = f10;
    }

    private PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l) {
        this.start = f10;
        this.f28510top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
        this.inspectorInfo = interfaceC9540l;
        boolean z11 = true;
        boolean z12 = f10 >= 0.0f || Float.isNaN(f10);
        float f14 = this.f28510top;
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

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public PaddingNode create() {
        return new PaddingNode(this.start, this.f28510top, this.end, this.bottom, this.rtlAware, null);
    }

    @Override // androidx.compose.p014ui.node.ModifierNodeElement
    public void update(PaddingNode paddingNode) {
        paddingNode.m27469setStart0680j_4(this.start);
        paddingNode.m27470setTop0680j_4(this.f28510top);
        paddingNode.m27468setEnd0680j_4(this.end);
        paddingNode.m27467setBottom0680j_4(this.bottom);
        paddingNode.setRtlAware(this.rtlAware);
    }

    public /* synthetic */ PaddingElement(float f10, float f11, float f12, float f13, boolean z10, InterfaceC9540l interfaceC9540l, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.m33501constructorimpl(0) : f10, (i10 & 2) != 0 ? C3186Dp.m33501constructorimpl(0) : f11, (i10 & 4) != 0 ? C3186Dp.m33501constructorimpl(0) : f12, (i10 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f13, z10, interfaceC9540l, null);
    }
}
