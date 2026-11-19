package androidx.compose.foundation.layout;

import androidx.compose.foundation.AbstractC0431c;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.AbstractC1419c;
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
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m5174d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J)\u0010\u001d\u001a\u00020\u001e*\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0007\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u001c\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m5175d2 = {"Landroidx/compose/foundation/layout/PaddingModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "start", "Landroidx/compose/ui/unit/Dp;", "top", "end", "bottom", "rtlAware", "", "inspectorInfo", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/InspectorInfo;", "", "Lkotlin/ExtensionFunctionType;", "(FFFFZLkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getBottom-D9Ej5fM", "()F", "F", "getEnd-D9Ej5fM", "getRtlAware", "()Z", "getStart-D9Ej5fM", "getTop-D9Ej5fM", "equals", "other", "", "hashCode", "", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,436:1\n155#2:437\n155#2:438\n155#2:439\n155#2:440\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingModifier\n*L\n338#1:437\n339#1:438\n340#1:439\n341#1:440\n*E\n"})
/* loaded from: classes.dex */
final class PaddingModifier extends InspectorValueInfo implements LayoutModifier {
    private final float bottom;
    private final float end;
    private final boolean rtlAware;
    private final float start;
    private final float top;

    public /* synthetic */ PaddingModifier(float f4, float f5, float f6, float f7, boolean z3, Function1 function1, DefaultConstructorMarker defaultConstructorMarker) {
        this(f4, f5, f6, f7, z3, function1);
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
        PaddingModifier paddingModifier = other instanceof PaddingModifier ? (PaddingModifier) other : null;
        return paddingModifier != null && C1700Dp.m11530equalsimpl0(this.start, paddingModifier.start) && C1700Dp.m11530equalsimpl0(this.top, paddingModifier.top) && C1700Dp.m11530equalsimpl0(this.end, paddingModifier.end) && C1700Dp.m11530equalsimpl0(this.bottom, paddingModifier.bottom) && this.rtlAware == paddingModifier.rtlAware;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    /* renamed from: getBottom-D9Ej5fM, reason: not valid java name and from getter */
    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getEnd-D9Ej5fM, reason: not valid java name and from getter */
    public final float getEnd() {
        return this.end;
    }

    public final boolean getRtlAware() {
        return this.rtlAware;
    }

    /* renamed from: getStart-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStart() {
        return this.start;
    }

    /* renamed from: getTop-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((C1700Dp.m11531hashCodeimpl(this.start) * 31) + C1700Dp.m11531hashCodeimpl(this.top)) * 31) + C1700Dp.m11531hashCodeimpl(this.end)) * 31) + C1700Dp.m11531hashCodeimpl(this.bottom)) * 31) + AbstractC0431c.m162a(this.rtlAware);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m640a(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m641b(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6941measure3p2s80s(final MeasureScope measure, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        int iMo7200roundToPx0680j_4 = measure.mo7200roundToPx0680j_4(this.start) + measure.mo7200roundToPx0680j_4(this.end);
        int iMo7200roundToPx0680j_42 = measure.mo7200roundToPx0680j_4(this.top) + measure.mo7200roundToPx0680j_4(this.bottom);
        final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(ConstraintsKt.m11509offsetNN6EwU(j4, -iMo7200roundToPx0680j_4, -iMo7200roundToPx0680j_42));
        return MeasureScope.CC.m634p(measure, ConstraintsKt.m11507constrainWidthK40F9xA(j4, placeableMo10585measureBRTryo0.getWidth() + iMo7200roundToPx0680j_4), ConstraintsKt.m11506constrainHeightK40F9xA(j4, placeableMo10585measureBRTryo0.getHeight() + iMo7200roundToPx0680j_42), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                if (this.this$0.getRtlAware()) {
                    Placeable.PlacementScope.placeRelative$default(layout, placeableMo10585measureBRTryo0, measure.mo7200roundToPx0680j_4(this.this$0.getStart()), measure.mo7200roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                } else {
                    Placeable.PlacementScope.place$default(layout, placeableMo10585measureBRTryo0, measure.mo7200roundToPx0680j_4(this.this$0.getStart()), measure.mo7200roundToPx0680j_4(this.this$0.getTop()), 0.0f, 4, null);
                }
            }
        }, 4, null);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m642c(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return AbstractC1419c.m643d(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }

    private PaddingModifier(float f4, float f5, float f6, float f7, boolean z3, Function1<? super InspectorInfo, Unit> function1) {
        super(function1);
        this.start = f4;
        this.top = f5;
        this.end = f6;
        this.bottom = f7;
        this.rtlAware = z3;
        if (!((f4 >= 0.0f || C1700Dp.m11530equalsimpl0(f4, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM())) && (f5 >= 0.0f || C1700Dp.m11530equalsimpl0(f5, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM())) && ((f6 >= 0.0f || C1700Dp.m11530equalsimpl0(f6, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM())) && (f7 >= 0.0f || C1700Dp.m11530equalsimpl0(f7, C1700Dp.INSTANCE.m11545getUnspecifiedD9Ej5fM()))))) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    public /* synthetic */ PaddingModifier(float f4, float f5, float f6, float f7, boolean z3, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? C1700Dp.m11525constructorimpl(0) : f4, (i4 & 2) != 0 ? C1700Dp.m11525constructorimpl(0) : f5, (i4 & 4) != 0 ? C1700Dp.m11525constructorimpl(0) : f6, (i4 & 8) != 0 ? C1700Dp.m11525constructorimpl(0) : f7, z3, function1, null);
    }
}
