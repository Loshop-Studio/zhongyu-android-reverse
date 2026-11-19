package androidx.compose.foundation.layout;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.LayoutModifierNode;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, m5110d2 = {"Landroidx/compose/foundation/layout/FillNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "direction", "Landroidx/compose/foundation/layout/Direction;", "fraction", "", "(Landroidx/compose/foundation/layout/Direction;F)V", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "setDirection", "(Landroidx/compose/foundation/layout/Direction;)V", "getFraction", "()F", "setFraction", "(F)V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m5111k = 1, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n26#2:1135\n26#2:1146\n101#3,10:1136\n101#3,10:1147\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/FillNode\n*L\n700#1:1135\n713#1:1146\n701#1:1136,10\n714#1:1147,10\n*E\n"})
/* loaded from: classes.dex */
final class FillNode extends Modifier.Node implements LayoutModifierNode {

    @NotNull
    private Direction direction;
    private float fraction;

    public FillNode(@NotNull Direction direction, float f) {
        this.direction = direction;
        this.fraction = f;
    }

    @NotNull
    public final Direction getDirection() {
        return this.direction;
    }

    public final float getFraction() {
        return this.fraction;
    }

    @Override // androidx.compose.p011ui.node.LayoutModifierNode
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6573measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j7) {
        int iM13260getMinWidthimpl;
        int iM13258getMaxWidthimpl;
        int iM13257getMaxHeightimpl;
        int iM13257getMaxHeightimpl2;
        if (!Constraints.m13254getHasBoundedWidthimpl(j7) || this.direction == Direction.Vertical) {
            iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
            iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        } else {
            int iRound = Math.round(Constraints.m13258getMaxWidthimpl(j7) * this.fraction);
            int iM13260getMinWidthimpl2 = Constraints.m13260getMinWidthimpl(j7);
            iM13260getMinWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
            if (iRound < iM13260getMinWidthimpl2) {
                iRound = iM13260getMinWidthimpl2;
            }
            if (iRound <= iM13260getMinWidthimpl) {
                iM13260getMinWidthimpl = iRound;
            }
            iM13258getMaxWidthimpl = iM13260getMinWidthimpl;
        }
        if (!Constraints.m13253getHasBoundedHeightimpl(j7) || this.direction == Direction.Horizontal) {
            int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
            iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
            iM13257getMaxHeightimpl2 = iM13259getMinHeightimpl;
        } else {
            int iRound2 = Math.round(Constraints.m13257getMaxHeightimpl(j7) * this.fraction);
            int iM13259getMinHeightimpl2 = Constraints.m13259getMinHeightimpl(j7);
            iM13257getMaxHeightimpl2 = Constraints.m13257getMaxHeightimpl(j7);
            if (iRound2 < iM13259getMinHeightimpl2) {
                iRound2 = iM13259getMinHeightimpl2;
            }
            if (iRound2 <= iM13257getMaxHeightimpl2) {
                iM13257getMaxHeightimpl2 = iRound2;
            }
            iM13257getMaxHeightimpl = iM13257getMaxHeightimpl2;
        }
        final Placeable placeableMo12033measureBRTryo0 = measurable.mo12033measureBRTryo0(ConstraintsKt.Constraints(iM13260getMinWidthimpl, iM13258getMaxWidthimpl, iM13257getMaxHeightimpl2, iM13257getMaxHeightimpl));
        return MeasureScope.layout$default(measureScope, placeableMo12033measureBRTryo0.getWidth(), placeableMo12033measureBRTryo0.getHeight(), null, new InterfaceC6471c() { // from class: androidx.compose.foundation.layout.FillNode$measure$1
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12033measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    public final void setDirection(@NotNull Direction direction) {
        this.direction = direction;
    }

    public final void setFraction(float f) {
        this.fraction = f;
    }
}
