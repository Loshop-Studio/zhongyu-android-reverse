package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class PaddingNode extends Modifier.Node implements LayoutModifierNode {
    private float bottom;
    private float end;
    private boolean rtlAware;
    private float start;

    /* renamed from: top, reason: collision with root package name */
    private float f21443top;

    public /* synthetic */ PaddingNode(float f10, float f11, float f12, float f13, boolean z10, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, z10);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name */
    public final float m20861getBottomD9Ej5fM() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name */
    public final float m20862getEndD9Ej5fM() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name */
    public final float m20863getStartD9Ej5fM() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name */
    public final float m20864getTopD9Ej5fM() {
        return this.f21443top;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        int iMo20491roundToPx0680j_4 = measureScope.mo20491roundToPx0680j_4(this.start) + measureScope.mo20491roundToPx0680j_4(this.end);
        int iMo20491roundToPx0680j_42 = measureScope.mo20491roundToPx0680j_4(this.f21443top) + measureScope.mo20491roundToPx0680j_4(this.bottom);
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.m26871offsetNN6EwU(j10, -iMo20491roundToPx0680j_4, -iMo20491roundToPx0680j_42));
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m26869constrainWidthK40F9xA(j10, placeableMo25627measureBRTryo0.getWidth() + iMo20491roundToPx0680j_4), ConstraintsKt.m26868constrainHeightK40F9xA(j10, placeableMo25627measureBRTryo0.getHeight() + iMo20491roundToPx0680j_42), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.PaddingNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, measureScope.mo20491roundToPx0680j_4(this.this$0.m20863getStartD9Ej5fM()), measureScope.mo20491roundToPx0680j_4(this.this$0.m20864getTopD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, measureScope.mo20491roundToPx0680j_4(this.this$0.m20863getStartD9Ej5fM()), measureScope.mo20491roundToPx0680j_4(this.this$0.m20864getTopD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    /* renamed from: setBottom-0680j_4, reason: not valid java name */
    public final void m20865setBottom0680j_4(float f10) {
        this.bottom = f10;
    }

    /* renamed from: setEnd-0680j_4, reason: not valid java name */
    public final void m20866setEnd0680j_4(float f10) {
        this.end = f10;
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setStart-0680j_4, reason: not valid java name */
    public final void m20867setStart0680j_4(float f10) {
        this.start = f10;
    }

    /* renamed from: setTop-0680j_4, reason: not valid java name */
    public final void m20868setTop0680j_4(float f10) {
        this.f21443top = f10;
    }

    private PaddingNode(float f10, float f11, float f12, float f13, boolean z10) {
        this.start = f10;
        this.f21443top = f11;
        this.end = f12;
        this.bottom = f13;
        this.rtlAware = z10;
    }

    public /* synthetic */ PaddingNode(float f10, float f11, float f12, float f13, boolean z10, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.m26899constructorimpl(0) : f10, (i10 & 2) != 0 ? C3156Dp.m26899constructorimpl(0) : f11, (i10 & 4) != 0 ? C3156Dp.m26899constructorimpl(0) : f12, (i10 & 8) != 0 ? C3156Dp.m26899constructorimpl(0) : f13, z10, null);
    }
}
