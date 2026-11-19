package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.IntrinsicSizeModifier;
import androidx.compose.p006ui.AbstractC1266a;
import androidx.compose.p006ui.AbstractC1267b;
import androidx.compose.p006ui.Modifier;
import androidx.compose.p006ui.layout.IntrinsicMeasurable;
import androidx.compose.p006ui.layout.IntrinsicMeasureScope;
import androidx.compose.p006ui.layout.Measurable;
import androidx.compose.p006ui.layout.MeasureResult;
import androidx.compose.p006ui.layout.MeasureScope;
import androidx.compose.p006ui.unit.Constraints;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m5174d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\fH\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0010"}, m5175d2 = {"Landroidx/compose/foundation/layout/MinIntrinsicHeightModifier;", "Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "()V", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "foundation-layout_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class MinIntrinsicHeightModifier implements IntrinsicSizeModifier {
    public static final MinIntrinsicHeightModifier INSTANCE = new MinIntrinsicHeightModifier();

    private MinIntrinsicHeightModifier() {
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC1267b.m309a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC1267b.m310b(this, function1);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    public long mo7300calculateContentConstraintsl58MMJ0(MeasureScope calculateContentConstraints, Measurable measurable, long j4) {
        Intrinsics.checkNotNullParameter(calculateContentConstraints, "$this$calculateContentConstraints");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return Constraints.INSTANCE.m11502fixedHeightOenEA2s(measurable.minIntrinsicHeight(Constraints.m11493getMaxWidthimpl(j4)));
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC1267b.m311c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.p006ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC1267b.m312d(this, obj, function2);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier
    public /* synthetic */ boolean getEnforceIncoming() {
        return IntrinsicSizeModifier.CC.m184a(this);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p006ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return measurable.minIntrinsicHeight(i4);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return IntrinsicSizeModifier.CC.m186c(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p006ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public /* synthetic */ MeasureResult mo6941measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j4) {
        return IntrinsicSizeModifier.CC.m187d(this, measureScope, measurable, j4);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return IntrinsicSizeModifier.CC.m188e(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.foundation.layout.IntrinsicSizeModifier, androidx.compose.p006ui.layout.LayoutModifier
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i4) {
        return IntrinsicSizeModifier.CC.m189f(this, intrinsicMeasureScope, intrinsicMeasurable, i4);
    }

    @Override // androidx.compose.p006ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC1266a.m307a(this, modifier);
    }
}
