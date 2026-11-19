package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;

    /* renamed from: top, reason: collision with root package name */
    private float f28511top;

    public /* synthetic */ PaddingNode(float f10, float f11, float f12, float f13, boolean z10, AbstractC9972n abstractC9972n) {
        this(f10, f11, f12, f13, z10);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m27463getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m27464getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m27465getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m27466getTopD9Ej5fM() {
        return this.f28511top;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(this.start) + measureScope.mo27093roundToPx0680j_4(this.end);
        int iMo27093roundToPx0680j_42 = measureScope.mo27093roundToPx0680j_4(this.f28511top) + measureScope.mo27093roundToPx0680j_4(this.bottom);
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.m33473offsetNN6EwU(j10, -iMo27093roundToPx0680j_4, -iMo27093roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeableMo32229measureBRTryo0.getWidth() + iMo27093roundToPx0680j_4), ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeableMo32229measureBRTryo0.getHeight() + iMo27093roundToPx0680j_42), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, measureScope.mo27093roundToPx0680j_4(this.this$0.m27465getStartD9Ej5fM()), measureScope.mo27093roundToPx0680j_4(this.this$0.m27466getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, measureScope.mo27093roundToPx0680j_4(this.this$0.m27465getStartD9Ej5fM()), measureScope.mo27093roundToPx0680j_4(this.this$0.m27466getTopD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m27467setBottom0680j_4(float f10) {
        this.bottom = f10;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m27468setEnd0680j_4(float f10) {
        this.end = f10;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m27469setStart0680j_4(float f10) {
        this.start = f10;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m27470setTop0680j_4(float f10) {
        this.f28511top = f10;
    }

    private PaddingNode(float f10, float f11, float f12, float f13, boolean z10) {
        this.start = f10;
        this.f28511top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
    }

    public /* synthetic */ PaddingNode(float f10, float f11, float f12, float f13, boolean z10, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.m33501constructorimpl(0) : f10, (i10 & 2) != 0 ? C3186Dp.m33501constructorimpl(0) : f11, (i10 & 4) != 0 ? C3186Dp.m33501constructorimpl(0) : f12, (i10 & 8) != 0 ? C3186Dp.m33501constructorimpl(0) : f13, z10, null);
    }
}
