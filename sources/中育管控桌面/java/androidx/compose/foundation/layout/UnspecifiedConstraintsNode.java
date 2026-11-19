package androidx.compose.foundation.layout;

import androidx.compose.p009ui.Modifier;
import androidx.compose.p009ui.layout.IntrinsicMeasurable;
import androidx.compose.p009ui.layout.IntrinsicMeasureScope;
import androidx.compose.p009ui.layout.Measurable;
import androidx.compose.p009ui.layout.MeasureResult;
import androidx.compose.p009ui.layout.MeasureScope;
import androidx.compose.p009ui.layout.Placeable;
import androidx.compose.p009ui.node.LayoutModifierNode;
import androidx.compose.p009ui.unit.C2452Dp;
import androidx.compose.p009ui.unit.Constraints;
import androidx.compose.p009ui.unit.ConstraintsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m7879d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u0014\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J&\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016J\u001c\u0010\u001f\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000fH\u0016R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 "}, m7880d2 = {"Landroidx/compose/foundation/layout/UnspecifiedConstraintsNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getMinHeight-D9Ej5fM", "()F", "setMinHeight-0680j_4", "(F)V", "F", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m7881k = 1, m7882mv = {1, 9, 0}, m7884xi = 48)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,1134:1\n97#2:1135\n97#2:1146\n97#2:1157\n97#2:1159\n97#2:1161\n97#2:1163\n101#3,10:1136\n101#3,10:1147\n105#3:1158\n105#3:1160\n105#3:1162\n105#3:1164\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/UnspecifiedConstraintsNode\n*L\n1079#1:1135\n1085#1:1146\n1102#1:1157\n1110#1:1159\n1118#1:1161\n1126#1:1163\n1080#1:1136,10\n1086#1:1147,10\n1102#1:1158\n1110#1:1160\n1118#1:1162\n1126#1:1164\n*E\n"})
/* loaded from: classes.dex */
final class UnspecifiedConstraintsNode extends Modifier.Node implements LayoutModifierNode {
    private float minHeight;
    private float minWidth;

    public /* synthetic */ UnspecifiedConstraintsNode(float f6, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(f6, f7);
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i6);
        int iMo10249roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo10249roundToPx0680j_4(this.minHeight) : 0;
        return iMaxIntrinsicHeight < iMo10249roundToPx0680j_4 ? iMo10249roundToPx0680j_4 : iMaxIntrinsicHeight;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i6);
        int iMo10249roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo10249roundToPx0680j_4(this.minWidth) : 0;
        return iMaxIntrinsicWidth < iMo10249roundToPx0680j_4 ? iMo10249roundToPx0680j_4 : iMaxIntrinsicWidth;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo9939measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j6) {
        int iM16439getMinWidthimpl;
        int iM16438getMinHeightimpl;
        if (Float.isNaN(this.minWidth) || Constraints.m16439getMinWidthimpl(j6) != 0) {
            iM16439getMinWidthimpl = Constraints.m16439getMinWidthimpl(j6);
        } else {
            int iMo10249roundToPx0680j_4 = measureScope.mo10249roundToPx0680j_4(this.minWidth);
            iM16439getMinWidthimpl = Constraints.m16437getMaxWidthimpl(j6);
            if (iMo10249roundToPx0680j_4 < 0) {
                iMo10249roundToPx0680j_4 = 0;
            }
            if (iMo10249roundToPx0680j_4 <= iM16439getMinWidthimpl) {
                iM16439getMinWidthimpl = iMo10249roundToPx0680j_4;
            }
        }
        int iM16437getMaxWidthimpl = Constraints.m16437getMaxWidthimpl(j6);
        if (Float.isNaN(this.minHeight) || Constraints.m16438getMinHeightimpl(j6) != 0) {
            iM16438getMinHeightimpl = Constraints.m16438getMinHeightimpl(j6);
        } else {
            int iMo10249roundToPx0680j_42 = measureScope.mo10249roundToPx0680j_4(this.minHeight);
            iM16438getMinHeightimpl = Constraints.m16436getMaxHeightimpl(j6);
            int i6 = iMo10249roundToPx0680j_42 >= 0 ? iMo10249roundToPx0680j_42 : 0;
            if (i6 <= iM16438getMinHeightimpl) {
                iM16438getMinHeightimpl = i6;
            }
        }
        final Placeable placeableMo15247measureBRTryo0 = measurable.mo15247measureBRTryo0(ConstraintsKt.Constraints(iM16439getMinWidthimpl, iM16437getMaxWidthimpl, iM16438getMinHeightimpl, Constraints.m16436getMaxHeightimpl(j6)));
        return MeasureScope.layout$default(measureScope, placeableMo15247measureBRTryo0.getWidth(), placeableMo15247measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsNode$measure$1
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
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo15247measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        int iMinIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(i6);
        int iMo10249roundToPx0680j_4 = !Float.isNaN(this.minHeight) ? intrinsicMeasureScope.mo10249roundToPx0680j_4(this.minHeight) : 0;
        return iMinIntrinsicHeight < iMo10249roundToPx0680j_4 ? iMo10249roundToPx0680j_4 : iMinIntrinsicHeight;
    }

    @Override // androidx.compose.p009ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i6) {
        int iMinIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(i6);
        int iMo10249roundToPx0680j_4 = !Float.isNaN(this.minWidth) ? intrinsicMeasureScope.mo10249roundToPx0680j_4(this.minWidth) : 0;
        return iMinIntrinsicWidth < iMo10249roundToPx0680j_4 ? iMo10249roundToPx0680j_4 : iMinIntrinsicWidth;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m10672setMinHeight0680j_4(float f6) {
        this.minHeight = f6;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m10673setMinWidth0680j_4(float f6) {
        this.minWidth = f6;
    }

    public /* synthetic */ UnspecifiedConstraintsNode(float f6, float f7, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f6, (i6 & 2) != 0 ? C2452Dp.INSTANCE.m16504getUnspecifiedD9Ej5fM() : f7, null);
    }

    private UnspecifiedConstraintsNode(float f6, float f7) {
        this.minWidth = f6;
        this.minHeight = f7;
    }
}
