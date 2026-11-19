package androidx.compose.foundation.layout;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m13413d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "direction", "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "(Landroidx/compose/foundation/layout/Direction;F)V", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "getFraction", "()F", "setFraction", "(F)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n26#2:1135\n26#2:1146\n101#3,10:1136\n101#3,10:1147\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n*L\n700#1:1135\n713#1:1146\n701#1:1136,10\n714#1:1147,10\n*E\n"})
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

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        int iM23949getMinWidthimpl;
        int iM23947getMaxWidthimpl;
        int iM23946getMaxHeightimpl;
        int iM23946getMaxHeightimpl2;
        if (!Constraints.m23943getHasBoundedWidthimpl(j9) || this.direction == Direction.Vertical) {
            iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
            iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        } else {
            int iRound = Math.round(Constraints.m23947getMaxWidthimpl(j9) * this.fraction);
            int iM23949getMinWidthimpl2 = Constraints.m23949getMinWidthimpl(j9);
            iM23949getMinWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
            if (iRound < iM23949getMinWidthimpl2) {
                iRound = iM23949getMinWidthimpl2;
            }
            if (iRound <= iM23949getMinWidthimpl) {
                iM23949getMinWidthimpl = iRound;
            }
            iM23947getMaxWidthimpl = iM23949getMinWidthimpl;
        }
        if (!Constraints.m23942getHasBoundedHeightimpl(j9) || this.direction == Direction.Horizontal) {
            int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
            iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
            iM23946getMaxHeightimpl2 = iM23948getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m23946getMaxHeightimpl(j9) * this.fraction);
            int iM23948getMinHeightimpl2 = Constraints.m23948getMinHeightimpl(j9);
            iM23946getMaxHeightimpl2 = Constraints.m23946getMaxHeightimpl(j9);
            if (iRound2 < iM23948getMinHeightimpl2) {
                iRound2 = iM23948getMinHeightimpl2;
            }
            if (iRound2 <= iM23946getMaxHeightimpl2) {
                iM23946getMaxHeightimpl2 = iRound2;
            }
            iM23946getMaxHeightimpl = iM23946getMaxHeightimpl2;
        }
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(ConstraintsKt.Constraints(iM23949getMinWidthimpl, iM23947getMaxWidthimpl, iM23946getMaxHeightimpl2, iM23946getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo22757measureBRTryo0, 0, 0, 0.0f, 4, null);
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
