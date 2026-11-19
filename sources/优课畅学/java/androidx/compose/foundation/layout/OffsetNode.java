package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.node.LayoutModifierNodeKt;
import androidx.compose.p013ui.unit.C3156Dp;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class OffsetNode extends Modifier.Node implements LayoutModifierNode {
    private boolean rtlAware;
    private final boolean shouldAutoInvalidate;

    /* renamed from: x */
    private float f1158x;

    /* renamed from: y */
    private float f1159y;

    public /* synthetic */ OffsetNode(float f10, float f11, boolean z10, AbstractC9126n abstractC9126n) {
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
    public final float m20817getXD9Ej5fM() {
        return this.f1158x;
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public final float m20818getYD9Ej5fM() {
        return this.f1159y;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(final MeasureScope measureScope, Measurable measurable, long j10) {
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(j10);
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.OffsetNode$measure$1
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
                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, measureScope.mo20491roundToPx0680j_4(this.this$0.m20817getXD9Ej5fM()), measureScope.mo20491roundToPx0680j_4(this.this$0.m20818getYD9Ej5fM()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(placementScope, placeableMo25627measureBRTryo0, measureScope.mo20491roundToPx0680j_4(this.this$0.m20817getXD9Ej5fM()), measureScope.mo20491roundToPx0680j_4(this.this$0.m20818getYD9Ej5fM()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    public final void setRtlAware(boolean z10) {
        this.rtlAware = z10;
    }

    /* renamed from: setX-0680j_4, reason: not valid java name */
    public final void m20819setX0680j_4(float f10) {
        this.f1158x = f10;
    }

    /* renamed from: setY-0680j_4, reason: not valid java name */
    public final void m20820setY0680j_4(float f10) {
        this.f1159y = f10;
    }

    /* renamed from: update-Md-fbLM, reason: not valid java name */
    public final void m20821updateMdfbLM(float f10, float f11, boolean z10) {
        if (!C3156Dp.m26904equalsimpl0(this.f1158x, f10) || !C3156Dp.m26904equalsimpl0(this.f1159y, f11) || this.rtlAware != z10) {
            LayoutModifierNodeKt.invalidatePlacement(this);
        }
        this.f1158x = f10;
        this.f1159y = f11;
        this.rtlAware = z10;
    }

    private OffsetNode(float f10, float f11, boolean z10) {
        this.f1158x = f10;
        this.f1159y = f11;
        this.rtlAware = z10;
    }
}
