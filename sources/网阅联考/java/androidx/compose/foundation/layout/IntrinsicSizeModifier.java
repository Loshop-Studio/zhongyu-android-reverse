package androidx.compose.foundation.layout;

import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.LayoutModifier;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.layout.Placeable;
import androidx.compose.p006ui.unit.ConstraintsKt;
import androidx.compose.p006ui.unit.IntOffset;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J)\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, m5175d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
interface IntrinsicSizeModifier extends LayoutModifier {

    /* renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        /* renamed from: a */
        public static boolean m184a(IntrinsicSizeModifier intrinsicSizeModifier) {
            return true;
        }

        /* renamed from: b */
        public static int m185b(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicHeight(i4);
        }

        /* renamed from: c */
        public static int m186c(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicWidth(i4);
        }

        /* renamed from: d */
        public static MeasureResult m187d(IntrinsicSizeModifier intrinsicSizeModifier, MeasureScope measure, Measurable measurable, long j4) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            long jMo7300calculateContentConstraintsl58MMJ0 = intrinsicSizeModifier.mo7300calculateContentConstraintsl58MMJ0(measure, measurable, j4);
            if (intrinsicSizeModifier.getEnforceIncoming()) {
                jMo7300calculateContentConstraintsl58MMJ0 = ConstraintsKt.m11505constrainN9IONVI(j4, jMo7300calculateContentConstraintsl58MMJ0);
            }
            final Placeable placeableMo10585measureBRTryo0 = measurable.mo10585measureBRTryo0(jMo7300calculateContentConstraintsl58MMJ0);
            return MeasureScope.CC.m634p(measure, placeableMo10585measureBRTryo0.getWidth(), placeableMo10585measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
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
                    Placeable.PlacementScope.m10621placeRelative70tqf50$default(layout, placeableMo10585measureBRTryo0, IntOffset.INSTANCE.m11653getZeronOccac(), 0.0f, 2, null);
                }
            }, 4, null);
        }

        /* renamed from: e */
        public static int m188e(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicHeight(i4);
        }

        /* renamed from: f */
        public static int m189f(IntrinsicSizeModifier intrinsicSizeModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicWidth(i4);
        }
    }

    /* renamed from: calculateContentConstraints-l58MMJ0, reason: not valid java name */
    long mo7300calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j4);

    boolean getEnforceIncoming();

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4);

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4);

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    MeasureResult mo6941measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j4);

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4);

    @Override // androidx.compose.p006ui.layout.LayoutModifier
    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4);
}
