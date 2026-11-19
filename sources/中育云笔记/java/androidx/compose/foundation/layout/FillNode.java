package androidx.compose.foundation.layout;

import androidx.compose.p014ui.Modifier;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutModifierNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {
    private Direction direction;
    private float fraction;

    public FillNode(Direction direction, float f10) {
        this.direction = direction;
        this.fraction = f10;
    }

    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.p014ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26769measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM33456getMinWidthimpl;
        int iM33454getMaxWidthimpl;
        int iM33453getMaxHeightimpl;
        int iM33453getMaxHeightimpl2;
        if (!Constraints.m33450getHasBoundedWidthimpl(j10) || this.direction == Direction.Vertical) {
            iM33456getMinWidthimpl = Constraints.m33456getMinWidthimpl(j10);
            iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        } else {
            int iRound = Math.round(Constraints.m33454getMaxWidthimpl(j10) * this.fraction);
            int iM33456getMinWidthimpl2 = Constraints.m33456getMinWidthimpl(j10);
            iM33456getMinWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
            if (iRound < iM33456getMinWidthimpl2) {
                iRound = iM33456getMinWidthimpl2;
            }
            if (iRound <= iM33456getMinWidthimpl) {
                iM33456getMinWidthimpl = iRound;
            }
            iM33454getMaxWidthimpl = iM33456getMinWidthimpl;
        }
        if (!Constraints.m33449getHasBoundedHeightimpl(j10) || this.direction == Direction.Horizontal) {
            int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
            iM33453getMaxHeightimpl = Constraints.m33453getMaxHeightimpl(j10);
            iM33453getMaxHeightimpl2 = iM33455getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m33453getMaxHeightimpl(j10) * this.fraction);
            int iM33455getMinHeightimpl2 = Constraints.m33455getMinHeightimpl(j10);
            iM33453getMaxHeightimpl2 = Constraints.m33453getMaxHeightimpl(j10);
            if (iRound2 < iM33455getMinHeightimpl2) {
                iRound2 = iM33455getMinHeightimpl2;
            }
            if (iRound2 <= iM33453getMaxHeightimpl2) {
                iM33453getMaxHeightimpl2 = iRound2;
            }
            iM33453getMaxHeightimpl = iM33453getMaxHeightimpl2;
        }
        final Placeable placeableMo32229measureBRTryo0 = measurable.mo32229measureBRTryo0(ConstraintsKt.Constraints(iM33456getMinWidthimpl, iM33454getMaxWidthimpl, iM33453getMaxHeightimpl2, iM33453getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo32229measureBRTryo0.getWidth(), placeableMo32229measureBRTryo0.getHeight(), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f10) {
        this.fraction = f10;
    }
}
