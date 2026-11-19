package androidx.compose.foundation.layout;

import androidx.compose.p012ui.Modifier;
import androidx.compose.p012ui.layout.IntrinsicMeasurable;
import androidx.compose.p012ui.layout.IntrinsicMeasureScope;
import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.node.LayoutModifierNode;
import androidx.compose.p012ui.unit.C3115Dp;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m13413d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "setMinHeight-0680j_4", "(F)V", "F", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m13414k = 1, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1146\n97#2:1157\n97#2:1159\n97#2:1161\n97#2:1163\n101#3,10:1136\n101#3,10:1147\n105#3:1158\n105#3:1160\n105#3:1162\n105#3:1164\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n*L\n1079#1:1135\n1085#1:1146\n1102#1:1157\n1110#1:1159\n1118#1:1161\n1126#1:1163\n1080#1:1136,10\n1086#1:1147,10\n1102#1:1158\n1110#1:1160\n1118#1:1162\n1126#1:1164\n*E\n"})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i9);
        int iMo17759roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo17759roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < iMo17759roundToPx0680j_4 ? iMo17759roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i9);
        int iMo17759roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo17759roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < iMo17759roundToPx0680j_4 ? iMo17759roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17449measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j9) {
        int iM23949getMinWidthimpl;
        int iM23948getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m23949getMinWidthimpl(j9) != 0) {
            iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        } else {
            int iMo17759roundToPx0680j_4 = measureScope.mo17759roundToPx0680j_4(this.minWidth);
            iM23949getMinWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
            if (iMo17759roundToPx0680j_4 < 0) {
                iMo17759roundToPx0680j_4 = 0;
            }
            if (iMo17759roundToPx0680j_4 <= iM23949getMinWidthimpl) {
                iM23949getMinWidthimpl = iMo17759roundToPx0680j_4;
            }
        }
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        if (Float.isNaN(this.minHeight) || Constraints.m23948getMinHeightimpl(j9) != 0) {
            iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        } else {
            int iMo17759roundToPx0680j_42 = measureScope.mo17759roundToPx0680j_4(this.minHeight);
            iM23948getMinHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
            int i9 = iMo17759roundToPx0680j_42 >= 0 ? iMo17759roundToPx0680j_42 : 0;
            if (i9 <= iM23948getMinHeightimpl) {
                iM23948getMinHeightimpl = i9;
            }
        }
        final Placeable placeableMo22757measureBRTryo0 = measurable.mo22757measureBRTryo0(ConstraintsKt.Constraints(iM23949getMinWidthimpl, iM23947getMaxWidthimpl, iM23948getMinHeightimpl, Constraints.m23946getMaxHeightimpl(j9)));
        return MeasureScope.layout$default(measureScope, placeableMo22757measureBRTryo0.getWidth(), placeableMo22757measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
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

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i9);
        int iMo17759roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo17759roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < iMo17759roundToPx0680j_4 ? iMo17759roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p012ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i9) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i9);
        int iMo17759roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo17759roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < iMo17759roundToPx0680j_4 ? iMo17759roundToPx0680j_4 : iMinIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m18182setMinHeight0680j_4(float f10) {
        this.minHeight = f10;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m18183setMinWidth0680j_4(float f10) {
        this.minWidth = f10;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f10, float f11, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM() : f10, (i9 & 2) != 0 ? C3115Dp.INSTANCE.m24014getUnspecifiedD9Ej5fM() : f11, null);
    }

    private UnspecifiedConstraintsNode(float f10, float f11) {
        this.minWidth = f10;
        this.minHeight = f11;
    }
}
