package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.node.LayoutModifierNodeKt;
import androidx.compose.p014ui.unit.C3186Dp;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    /* renamed from: x */
    private float f1088x;

    /* renamed from: y */
    private float f1089y;

    public /* synthetic */ OffsetNode(float f10, float f11, boolean z10, AbstractC9972n abstractC9972n) {
        this(f10, f11, z10);
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public final float m27419getXD9Ej5fM() {
        return this.f1088x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m27420getYD9Ej5fM() {
        return this.f1089y;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
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
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, measureScope.mo27093roundToPx0680j_4(this.this$0.m27419getXD9Ej5fM()), measureScope.mo27093roundToPx0680j_4(this.this$0.m27420getYD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo32229measureBRTryo0, measureScope.mo27093roundToPx0680j_4(this.this$0.m27419getXD9Ej5fM()), measureScope.mo27093roundToPx0680j_4(this.this$0.m27420getYD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m27421setX0680j_4(float f10) {
        this.f1088x = f10;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m27422setY0680j_4(float f10) {
        this.f1089y = f10;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m27423updateMdfbLM(float f10, float f11, boolean z10) {
        if (!C3186Dp.m33506equalsimpl0(this.f1088x, f10) || !C3186Dp.m33506equalsimpl0(this.f1089y, f11) || this.rtlAware != z10) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.f1088x = f10;
        this.f1089y = f11;
        this.rtlAware = z10;
    }

    private OffsetNode(float f10, float f11, boolean z10) {
        this.f1088x = f10;
        this.f1089y = f11;
        this.rtlAware = z10;
    }
}
