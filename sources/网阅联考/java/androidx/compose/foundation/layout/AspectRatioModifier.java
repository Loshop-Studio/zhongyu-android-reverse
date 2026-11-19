package androidx.compose.foundation.layout;

import androidx.compose.foundation.AbstractC0431c;
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
import androidx.compose.p006ui.unit.Constraints;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.IntSize;
import androidx.compose.p006ui.unit.IntSizeKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;

@Metadata(m5174d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B.\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b¢\u0006\u0002\u0010\fJ\u0013\u0010\u0011\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0019\u0010\u0018\u001a\u00020\u0019*\u00020\u001aH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010\"\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J)\u0010$\u001a\u00020%*\u00020&2\u0006\u0010\u001f\u001a\u00020'2\u0006\u0010(\u001a\u00020\u001aH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u001c\u0010+\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015H\u0016J\u001c\u0010,\u001a\u00020\u0015*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u0015H\u0016J#\u0010-\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b/\u00100J#\u00101\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b2\u00100J#\u00103\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00100J#\u00105\u001a\u00020\u0019*\u00020\u001a2\b\b\u0002\u0010.\u001a\u00020\u0006H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00100R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00067"}, m5175d2 = {"Landroidx/compose/foundation/layout/AspectRatioModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "aspectRatio", "", "matchHeightConstraintsFirst", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FZLkotlin/jvm/functions/Function1;)V", "getAspectRatio", "()F", "getMatchHeightConstraintsFirst", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "findSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/Constraints;", "findSize-ToXhtMw", "(J)J", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "tryMaxHeight", "enforceConstraints", "tryMaxHeight-JN-0ABg", "(JZ)J", "tryMaxWidth", "tryMaxWidth-JN-0ABg", "tryMinHeight", "tryMinHeight-JN-0ABg", "tryMinWidth", "tryMinWidth-JN-0ABg", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1#2:219\n*E\n"})
/* loaded from: classes.dex */
final class AspectRatioModifier extends InspectorValueInfo implements LayoutModifier {
    private final float aspectRatio;
    private final boolean matchHeightConstraintsFirst;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectRatioModifier(float f4, boolean z3, Function1<? super InspectorInfo, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.aspectRatio = f4;
        this.matchHeightConstraintsFirst = z3;
        if (f4 > 0.0f) {
            return;
        }
        throw new IllegalArgumentException(("aspectRatio " + f4 + " must be > 0").toString());
    }

    /* renamed from: findSize-ToXhtMw, reason: not valid java name */
    private final long m7277findSizeToXhtMw(long j4) {
        if (this.matchHeightConstraintsFirst) {
            long jM7279tryMaxHeightJN0ABg$default = m7279tryMaxHeightJN0ABg$default(this, j4, false, 1, null);
            IntSize.Companion companion = IntSize.INSTANCE;
            if (!IntSize.m11683equalsimpl0(jM7279tryMaxHeightJN0ABg$default, companion.m11690getZeroYbymL2g())) {
                return jM7279tryMaxHeightJN0ABg$default;
            }
            long jM7281tryMaxWidthJN0ABg$default = m7281tryMaxWidthJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7281tryMaxWidthJN0ABg$default, companion.m11690getZeroYbymL2g())) {
                return jM7281tryMaxWidthJN0ABg$default;
            }
            long jM7283tryMinHeightJN0ABg$default = m7283tryMinHeightJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7283tryMinHeightJN0ABg$default, companion.m11690getZeroYbymL2g())) {
                return jM7283tryMinHeightJN0ABg$default;
            }
            long jM7285tryMinWidthJN0ABg$default = m7285tryMinWidthJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7285tryMinWidthJN0ABg$default, companion.m11690getZeroYbymL2g())) {
                return jM7285tryMinWidthJN0ABg$default;
            }
            long jM7278tryMaxHeightJN0ABg = m7278tryMaxHeightJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7278tryMaxHeightJN0ABg, companion.m11690getZeroYbymL2g())) {
                return jM7278tryMaxHeightJN0ABg;
            }
            long jM7280tryMaxWidthJN0ABg = m7280tryMaxWidthJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7280tryMaxWidthJN0ABg, companion.m11690getZeroYbymL2g())) {
                return jM7280tryMaxWidthJN0ABg;
            }
            long jM7282tryMinHeightJN0ABg = m7282tryMinHeightJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7282tryMinHeightJN0ABg, companion.m11690getZeroYbymL2g())) {
                return jM7282tryMinHeightJN0ABg;
            }
            long jM7284tryMinWidthJN0ABg = m7284tryMinWidthJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7284tryMinWidthJN0ABg, companion.m11690getZeroYbymL2g())) {
                return jM7284tryMinWidthJN0ABg;
            }
        } else {
            long jM7281tryMaxWidthJN0ABg$default2 = m7281tryMaxWidthJN0ABg$default(this, j4, false, 1, null);
            IntSize.Companion companion2 = IntSize.INSTANCE;
            if (!IntSize.m11683equalsimpl0(jM7281tryMaxWidthJN0ABg$default2, companion2.m11690getZeroYbymL2g())) {
                return jM7281tryMaxWidthJN0ABg$default2;
            }
            long jM7279tryMaxHeightJN0ABg$default2 = m7279tryMaxHeightJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7279tryMaxHeightJN0ABg$default2, companion2.m11690getZeroYbymL2g())) {
                return jM7279tryMaxHeightJN0ABg$default2;
            }
            long jM7285tryMinWidthJN0ABg$default2 = m7285tryMinWidthJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7285tryMinWidthJN0ABg$default2, companion2.m11690getZeroYbymL2g())) {
                return jM7285tryMinWidthJN0ABg$default2;
            }
            long jM7283tryMinHeightJN0ABg$default2 = m7283tryMinHeightJN0ABg$default(this, j4, false, 1, null);
            if (!IntSize.m11683equalsimpl0(jM7283tryMinHeightJN0ABg$default2, companion2.m11690getZeroYbymL2g())) {
                return jM7283tryMinHeightJN0ABg$default2;
            }
            long jM7280tryMaxWidthJN0ABg2 = m7280tryMaxWidthJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7280tryMaxWidthJN0ABg2, companion2.m11690getZeroYbymL2g())) {
                return jM7280tryMaxWidthJN0ABg2;
            }
            long jM7278tryMaxHeightJN0ABg2 = m7278tryMaxHeightJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7278tryMaxHeightJN0ABg2, companion2.m11690getZeroYbymL2g())) {
                return jM7278tryMaxHeightJN0ABg2;
            }
            long jM7284tryMinWidthJN0ABg2 = m7284tryMinWidthJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7284tryMinWidthJN0ABg2, companion2.m11690getZeroYbymL2g())) {
                return jM7284tryMinWidthJN0ABg2;
            }
            long jM7282tryMinHeightJN0ABg2 = m7282tryMinHeightJN0ABg(j4, false);
            if (!IntSize.m11683equalsimpl0(jM7282tryMinHeightJN0ABg2, companion2.m11690getZeroYbymL2g())) {
                return jM7282tryMinHeightJN0ABg2;
            }
        }
        return IntSize.INSTANCE.m11690getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg, reason: not valid java name */
    private final long m7278tryMaxHeightJN0ABg(long j4, boolean z3) {
        int iRoundToInt;
        int iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
        if (iM11492getMaxHeightimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt__MathJVMKt.roundToInt(iM11492getMaxHeightimpl * this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM11492getMaxHeightimpl);
            if (!z3 || ConstraintsKt.m11508isSatisfiedBy4WqzIAM(j4, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m11690getZeroYbymL2g();
    }

    /* renamed from: tryMaxHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m7279tryMaxHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j4, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return aspectRatioModifier.m7278tryMaxHeightJN0ABg(j4, z3);
    }

    /* renamed from: tryMaxWidth-JN-0ABg, reason: not valid java name */
    private final long m7280tryMaxWidthJN0ABg(long j4, boolean z3) {
        int iRoundToInt;
        int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
        if (iM11493getMaxWidthimpl != Integer.MAX_VALUE && (iRoundToInt = MathKt__MathJVMKt.roundToInt(iM11493getMaxWidthimpl / this.aspectRatio)) > 0) {
            long jIntSize = IntSizeKt.IntSize(iM11493getMaxWidthimpl, iRoundToInt);
            if (!z3 || ConstraintsKt.m11508isSatisfiedBy4WqzIAM(j4, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m11690getZeroYbymL2g();
    }

    /* renamed from: tryMaxWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m7281tryMaxWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j4, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return aspectRatioModifier.m7280tryMaxWidthJN0ABg(j4, z3);
    }

    /* renamed from: tryMinHeight-JN-0ABg, reason: not valid java name */
    private final long m7282tryMinHeightJN0ABg(long j4, boolean z3) {
        int iM11494getMinHeightimpl = Constraints.m11494getMinHeightimpl(j4);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(iM11494getMinHeightimpl * this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iRoundToInt, iM11494getMinHeightimpl);
            if (!z3 || ConstraintsKt.m11508isSatisfiedBy4WqzIAM(j4, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m11690getZeroYbymL2g();
    }

    /* renamed from: tryMinHeight-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m7283tryMinHeightJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j4, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return aspectRatioModifier.m7282tryMinHeightJN0ABg(j4, z3);
    }

    /* renamed from: tryMinWidth-JN-0ABg, reason: not valid java name */
    private final long m7284tryMinWidthJN0ABg(long j4, boolean z3) {
        int iM11495getMinWidthimpl = Constraints.m11495getMinWidthimpl(j4);
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(iM11495getMinWidthimpl / this.aspectRatio);
        if (iRoundToInt > 0) {
            long jIntSize = IntSizeKt.IntSize(iM11495getMinWidthimpl, iRoundToInt);
            if (!z3 || ConstraintsKt.m11508isSatisfiedBy4WqzIAM(j4, jIntSize)) {
                return jIntSize;
            }
        }
        return IntSize.INSTANCE.m11690getZeroYbymL2g();
    }

    /* renamed from: tryMinWidth-JN-0ABg$default, reason: not valid java name */
    public static /* synthetic */ long m7285tryMinWidthJN0ABg$default(AspectRatioModifier aspectRatioModifier, long j4, boolean z3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z3 = true;
        }
        return aspectRatioModifier.m7284tryMinWidthJN0ABg(j4, z3);
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
        if (this == other) {
            return true;
        }
        AspectRatioModifier aspectRatioModifier = other instanceof AspectRatioModifier ? (AspectRatioModifier) other : null;
        if (aspectRatioModifier == null) {
            return false;
        }
        return ((this.aspectRatio > aspectRatioModifier.aspectRatio ? 1 : (this.aspectRatio == aspectRatioModifier.aspectRatio ? 0 : -1)) == 0) && this.matchHeightConstraintsFirst == ((AspectRatioModifier) other).matchHeightConstraintsFirst;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final boolean getMatchHeightConstraintsFirst() {
        return this.matchHeightConstraintsFirst;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.aspectRatio) * 31) + AbstractC0431c.m162a(this.matchHeightConstraintsFirst);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i4 != Integer.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(i4 / this.aspectRatio) : measurable.maxIntrinsicHeight(i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i4 != Integer.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(i4 * this.aspectRatio) : measurable.maxIntrinsicWidth(i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6941measure3p2s80s(MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        long jM7277findSizeToXhtMw = m7277findSizeToXhtMw(j4);
        if (!IntSize.m11683equalsimpl0(jM7277findSizeToXhtMw, IntSize.INSTANCE.m11690getZeroYbymL2g())) {
            j4 = Constraints.INSTANCE.m11501fixedJhjzzOo(IntSize.m11685getWidthimpl(jM7277findSizeToXhtMw), IntSize.m11684getHeightimpl(jM7277findSizeToXhtMw));
        }
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(j4);
        return MeasureScope.CC.m634p(measure, placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.AspectRatioModifier$measure$1
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
        return i4 != Integer.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(i4 / this.aspectRatio) : measurable.minIntrinsicHeight(i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return i4 != Integer.MAX_VALUE ? MathKt__MathJVMKt.roundToInt(i4 * this.aspectRatio) : measurable.minIntrinsicWidth(i4);
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    public String toString() {
        return "AspectRatioModifier(aspectRatio=" + this.aspectRatio + ')';
    }
}
