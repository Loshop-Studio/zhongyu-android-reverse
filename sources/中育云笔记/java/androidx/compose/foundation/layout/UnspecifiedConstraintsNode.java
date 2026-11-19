package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.IntrinsicMeasurable;
import androidx.compose.p014ui.layout.IntrinsicMeasureScope;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.C3186Dp;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import kotlin.jvm.internal.AbstractC9972n;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, AbstractC9972n abstractC9972n) {
        this(f10, f11);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m27524getMinHeightD9Ej5fM() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m27525getMinWidthD9Ej5fM() {
        return this.minWidth;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i10);
        int iMo27093roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo27093roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < iMo27093roundToPx0680j_4 ? iMo27093roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i10);
        int iMo27093roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo27093roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < iMo27093roundToPx0680j_4 ? iMo27093roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM33456getMinWidthimpl;
        int iM33455getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m33456getMinWidthimpl(j10) != 0) {
            iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
        } else {
            int iMo27093roundToPx0680j_4 = measureScope.mo27093roundToPx0680j_4(this.minWidth);
            iM33456getMinWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
            if (iMo27093roundToPx0680j_4 < 0) {
                iMo27093roundToPx0680j_4 = 0;
            }
            if (iMo27093roundToPx0680j_4 <= iM33456getMinWidthimpl) {
                iM33456getMinWidthimpl = iMo27093roundToPx0680j_4;
            }
        }
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        if (Float.isNaN(this.minHeight) || Constraints.m33455getMinHeightimpl(j10) != 0) {
            iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
        } else {
            int iMo27093roundToPx0680j_42 = measureScope.mo27093roundToPx0680j_4(this.minHeight);
            iM33455getMinHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
            int i10 = iMo27093roundToPx0680j_42 >= 0 ? iMo27093roundToPx0680j_42 : 0;
            if (i10 <= iM33455getMinHeightimpl) {
                iM33455getMinHeightimpl = i10;
            }
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.Constraints(iM33456getMinWidthimpl, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, Constraints.m33453getMaxHeightimpl(j10)));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i10);
        int iMo27093roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo27093roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < iMo27093roundToPx0680j_4 ? iMo27093roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i10) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i10);
        int iMo27093roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo27093roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < iMo27093roundToPx0680j_4 ? iMo27093roundToPx0680j_4 : iMinIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m27526setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m27527setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, int i10, AbstractC9972n abstractC9972n) {
        this((i10 & 1) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f10, (i10 & 2) != 0 ? C3186Dp.Companion.m33521getUnspecifiedD9Ej5fM() : f11, null);
    }

    private UnspecifiedConstraintsNode(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
