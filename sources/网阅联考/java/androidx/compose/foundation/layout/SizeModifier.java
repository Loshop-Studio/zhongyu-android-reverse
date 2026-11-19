package androidx.compose.foundation.layout;

import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutModifier;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.platform.InspectorInfo;
import androidx.compose.p006ui.platform.InspectorValueInfo;
import androidx.compose.p006ui.unit.C1700Dp;
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.Density;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0016\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u001c\u0010\u001b\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010 \u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016J)\u0010\"\u001a\u00020#*\u00020$2\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0012H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\u001c\u0010*\u001a\u00020\u001a*\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u001aH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0019\u0010\u0007\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0005\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R\u0019\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0010R!\u0010\u0011\u001a\u00020\u0012*\u00020\u00138BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m5175d2 = {"Landroidx/compose/foundation/layout/SizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "F", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "equals", "other", "", "hashCode", "", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1024:1\n155#2:1025\n155#2:1026\n*S KotlinDebug\n*F\n+ 1 Size.kt\nandroidx/compose/foundation/layout/SizeModifier\n*L\n714#1:1025\n719#1:1026\n*E\n"})
/* loaded from: classes.dex */
final class SizeModifier extends InspectorValueInfo implements LayoutModifier {
    private final boolean enforceIncoming;
    private final float maxHeight;
    private final float maxWidth;
    private final float minHeight;
    private final float minWidth;

    public /* synthetic */ SizeModifier(float f4, float f5, float f6, float f7, boolean z3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, z3, function1);
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m7370getTargetConstraintsOenEA2s(Density density) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        float f4 = this.maxWidth;
        C1700Dp.Companion companion = C1700Dp.INSTANCE;
        int i4 = 0;
        int iMo7200roundToPx0680j_4 = !C1700Dp.m11530equalsimpl0(f4, companion.m11545getUnspecifiedD9Ej5fM()) ? density.mo7200roundToPx0680j_4(((C1700Dp) RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11523boximpl(this.maxWidth), C1700Dp.m11523boximpl(C1700Dp.m11525constructorimpl(0)))).m11539unboximpl()) : Integer.MAX_VALUE;
        int iMo7200roundToPx0680j_42 = !C1700Dp.m11530equalsimpl0(this.maxHeight, companion.m11545getUnspecifiedD9Ej5fM()) ? density.mo7200roundToPx0680j_4(((C1700Dp) RangesKt___RangesKt.coerceAtLeast(C1700Dp.m11523boximpl(this.maxHeight), C1700Dp.m11523boximpl(C1700Dp.m11525constructorimpl(0)))).m11539unboximpl()) : Integer.MAX_VALUE;
        if (C1700Dp.m11530equalsimpl0(this.minWidth, companion.m11545getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(density.mo7200roundToPx0680j_4(this.minWidth), iMo7200roundToPx0680j_4), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!C1700Dp.m11530equalsimpl0(this.minHeight, companion.m11545getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = RangesKt___RangesKt.coerceAtLeast(RangesKt___RangesKt.coerceAtMost(density.mo7200roundToPx0680j_4(this.minHeight), iMo7200roundToPx0680j_42), 0)) != Integer.MAX_VALUE) {
            i4 = iCoerceAtLeast2;
        }
        return ConstraintsKt.Constraints(iCoerceAtLeast, iMo7200roundToPx0680j_4, i4, iMo7200roundToPx0680j_42);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    public boolean equals(Object other) {
        if (!(other instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) other;
        return C1700Dp.m11530equalsimpl0(this.minWidth, sizeModifier.minWidth) && C1700Dp.m11530equalsimpl0(this.minHeight, sizeModifier.minHeight) && C1700Dp.m11530equalsimpl0(this.maxWidth, sizeModifier.maxWidth) && C1700Dp.m11530equalsimpl0(this.maxHeight, sizeModifier.maxHeight) && this.enforceIncoming == sizeModifier.enforceIncoming;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    public int hashCode() {
        return ((((((C1700Dp.m11531hashCodeimpl(this.minWidth) * 31) + C1700Dp.m11531hashCodeimpl(this.minHeight)) * 31) + C1700Dp.m11531hashCodeimpl(this.maxWidth)) * 31) + C1700Dp.m11531hashCodeimpl(this.maxHeight)) * 31;
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7370getTargetConstraintsOenEA2s = m7370getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m11490getHasFixedHeightimpl(jM7370getTargetConstraintsOenEA2s) ? Constraints.m11492getMaxHeightimpl(jM7370getTargetConstraintsOenEA2s) : ConstraintsKt.m11506constrainHeightK40F9xA(jM7370getTargetConstraintsOenEA2s, measurable.maxIntrinsicHeight(i4));
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7370getTargetConstraintsOenEA2s = m7370getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m11491getHasFixedWidthimpl(jM7370getTargetConstraintsOenEA2s) ? Constraints.m11493getMaxWidthimpl(jM7370getTargetConstraintsOenEA2s) : ConstraintsKt.m11507constrainWidthK40F9xA(jM7370getTargetConstraintsOenEA2s, measurable.maxIntrinsicWidth(i4));
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6941measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        long jConstraints;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7370getTargetConstraintsOenEA2s = m7370getTargetConstraintsOenEA2s(measure);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m11505constrainN9IONVI(j4, jM7370getTargetConstraintsOenEA2s);
        } else {
            float f4 = this.minWidth;
            C1700Dp.Companion companion = C1700Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!C1700Dp.m11530equalsimpl0(f4, companion.m11545getUnspecifiedD9Ej5fM()) ? Constraints.m11495getMinWidthimpl(jM7370getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtMost(Constraints.m11495getMinWidthimpl(j4), Constraints.m11493getMaxWidthimpl(jM7370getTargetConstraintsOenEA2s)), !C1700Dp.m11530equalsimpl0(this.maxWidth, companion.m11545getUnspecifiedD9Ej5fM()) ? Constraints.m11493getMaxWidthimpl(jM7370getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtLeast(Constraints.m11493getMaxWidthimpl(j4), Constraints.m11495getMinWidthimpl(jM7370getTargetConstraintsOenEA2s)), !C1700Dp.m11530equalsimpl0(this.minHeight, companion.m11545getUnspecifiedD9Ej5fM()) ? Constraints.m11494getMinHeightimpl(jM7370getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtMost(Constraints.m11494getMinHeightimpl(j4), Constraints.m11492getMaxHeightimpl(jM7370getTargetConstraintsOenEA2s)), !C1700Dp.m11530equalsimpl0(this.maxHeight, companion.m11545getUnspecifiedD9Ej5fM()) ? Constraints.m11492getMaxHeightimpl(jM7370getTargetConstraintsOenEA2s) : RangesKt___RangesKt.coerceAtLeast(Constraints.m11492getMaxHeightimpl(j4), Constraints.m11494getMinHeightimpl(jM7370getTargetConstraintsOenEA2s)));
        }
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(jConstraints);
        return MeasureScope.CC.m634p(measure, placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope layout) {
                Intrinsics.checkNotNullParameter(layout, "$this$layout");
                Placeable.PlacementScope.placeRelative$default(layout, placeableMo10585measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7370getTargetConstraintsOenEA2s = m7370getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m11490getHasFixedHeightimpl(jM7370getTargetConstraintsOenEA2s) ? Constraints.m11492getMaxHeightimpl(jM7370getTargetConstraintsOenEA2s) : ConstraintsKt.m11506constrainHeightK40F9xA(jM7370getTargetConstraintsOenEA2s, measurable.minIntrinsicHeight(i4));
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7370getTargetConstraintsOenEA2s = m7370getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m11491getHasFixedWidthimpl(jM7370getTargetConstraintsOenEA2s) ? Constraints.m11493getMaxWidthimpl(jM7370getTargetConstraintsOenEA2s) : ConstraintsKt.m11507constrainWidthK40F9xA(jM7370getTargetConstraintsOenEA2s, measurable.minIntrinsicWidth(i4));
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    public /* synthetic */ SizeModifier(float f4, float f5, float f6, float f7, boolean z3, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM() : f4, (i4 & 2) != 0 ? C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM() : f5, (i4 & 4) != 0 ? C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM() : f6, (i4 & 8) != 0 ? C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM() : f7, z3, function1, null);
    }

    private SizeModifier(float f4, float f5, float f6, float f7, boolean z3, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.minWidth = f4;
        this.minHeight = f5;
        this.maxWidth = f6;
        this.maxHeight = f7;
        this.enforceIncoming = z3;
    }
}
