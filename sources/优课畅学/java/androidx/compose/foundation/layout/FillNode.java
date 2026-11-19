package androidx.compose.foundation.layout;

import androidx.compose.p013ui.Modifier;
import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutModifierNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

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

    @Override // androidx.compose.p013ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20167measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j10) {
        int iM26854getMinWidthimpl;
        int iM26852getMaxWidthimpl;
        int iM26851getMaxHeightimpl;
        int iM26851getMaxHeightimpl2;
        if (!Constraints.m26848getHasBoundedWidthimpl(j10) || this.direction == Direction.Vertical) {
            iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
            iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        } else {
            int iRound = Math.round(Constraints.m26852getMaxWidthimpl(j10) * this.fraction);
            int iM26854getMinWidthimpl2 = Constraints.m26854getMinWidthimpl(j10);
            iM26854getMinWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
            if (iRound < iM26854getMinWidthimpl2) {
                iRound = iM26854getMinWidthimpl2;
            }
            if (iRound <= iM26854getMinWidthimpl) {
                iM26854getMinWidthimpl = iRound;
            }
            iM26852getMaxWidthimpl = iM26854getMinWidthimpl;
        }
        if (!Constraints.m26847getHasBoundedHeightimpl(j10) || this.direction == Direction.Horizontal) {
            int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
            iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
            iM26851getMaxHeightimpl2 = iM26853getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m26851getMaxHeightimpl(j10) * this.fraction);
            int iM26853getMinHeightimpl2 = Constraints.m26853getMinHeightimpl(j10);
            iM26851getMaxHeightimpl2 = Constraints.m26851getMaxHeightimpl(j10);
            if (iRound2 < iM26853getMinHeightimpl2) {
                iRound2 = iM26853getMinHeightimpl2;
            }
            if (iRound2 <= iM26851getMaxHeightimpl2) {
                iM26851getMaxHeightimpl2 = iRound2;
            }
            iM26851getMaxHeightimpl = iM26851getMaxHeightimpl2;
        }
        final Placeable placeableMo25627measureBRTryo0 = measurable.mo25627measureBRTryo0(ConstraintsKt.Constraints(iM26854getMinWidthimpl, iM26852getMaxWidthimpl, iM26851getMaxHeightimpl2, iM26851getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo25627measureBRTryo0.getWidth(), placeableMo25627measureBRTryo0.getHeight(), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
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

    public final void setDirection(Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f10) {
        this.fraction = f10;
    }
}
