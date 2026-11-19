package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.IntrinsicMeasurable;
import androidx.compose.p013ui.layout.IntrinsicMeasureScope;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.C3156Dp;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9126n;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, AbstractC9126n abstractC9126n) {
        this(f10, f11);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m20922getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m20923getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i10);
        int iMo20491roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo20491roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < iMo20491roundToPx0680j_4 ? iMo20491roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i10);
        int iMo20491roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo20491roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < iMo20491roundToPx0680j_4 ? iMo20491roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM26854getMinWidthimpl;
        int iM26853getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m26854getMinWidthimpl(j10) != 0) {
            iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        } else {
            int iMo20491roundToPx0680j_4 = measureScope.mo20491roundToPx0680j_4(this.minWidth);
            iM26854getMinWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
            if (iMo20491roundToPx0680j_4 < 0) {
                iMo20491roundToPx0680j_4 = 0;
            }
            if (iMo20491roundToPx0680j_4 <= iM26854getMinWidthimpl) {
                iM26854getMinWidthimpl = iMo20491roundToPx0680j_4;
            }
        }
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        if (Float.isNaN(this.minHeight) || Constraints.m26853getMinHeightimpl(j10) != 0) {
            iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        } else {
            int iMo20491roundToPx0680j_42 = measureScope.mo20491roundToPx0680j_4(this.minHeight);
            iM26853getMinHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
            int i10 = iMo20491roundToPx0680j_42 >= 0 ? iMo20491roundToPx0680j_42 : 0;
            if (i10 <= iM26853getMinHeightimpl) {
                iM26853getMinHeightimpl = i10;
            }
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.Constraints(iM26854getMinWidthimpl, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, Constraints.m26851getMaxHeightimpl(j10)));
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i10);
        int iMo20491roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo20491roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < iMo20491roundToPx0680j_4 ? iMo20491roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i10);
        int iMo20491roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo20491roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < iMo20491roundToPx0680j_4 ? iMo20491roundToPx0680j_4 : iMinIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m20924setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m20925setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, int i10, AbstractC9126n abstractC9126n) {
        this((i10 & 1) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3156Dp.Companion.m26919getUnspecifiedD9Ej5fM() : f11, null);
    }

    private UnspecifiedConstraintsNode(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
