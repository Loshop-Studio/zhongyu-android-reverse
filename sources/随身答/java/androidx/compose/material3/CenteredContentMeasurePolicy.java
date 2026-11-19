package androidx.compose.material3;

import androidx.compose.p012ui.layout.Measurable;
import androidx.compose.p012ui.layout.MeasurePolicy;
import androidx.compose.p012ui.layout.MeasureResult;
import androidx.compose.p012ui.layout.MeasureScope;
import androidx.compose.p012ui.layout.Placeable;
import androidx.compose.p012ui.unit.Constraints;
import androidx.compose.p012ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13413d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m13414k = 1, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n33#2,6:471\n151#2,3:477\n33#2,4:480\n154#2,2:484\n38#2:486\n156#2:487\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n364#1:460,3\n364#1:463,4\n364#1:467,2\n364#1:469\n364#1:470\n373#1:471,6\n380#1:477,3\n380#1:480,4\n380#1:484,2\n380#1:486\n380#1:487\n*E\n"})
/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p012ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo17421measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j9) {
        final ArrayList arrayList;
        int iCoerceAtMost;
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM23947getMaxWidthimpl, iM23948getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        int i9 = 0;
        if (Constraints.m23943getHasBoundedWidthimpl(j9)) {
            int i10 = iM23947getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM23947getMaxWidthimpl);
            intRef.element = iCalculateCenteredContentHorizontalPadding;
            int i11 = (iM23947getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int iMaxIntrinsicHeight = list.get(i12).maxIntrinsicHeight(i11);
                if (iM23948getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM23948getMinHeightimpl = RangesKt.coerceAtMost(iMaxIntrinsicHeight, Constraints.m23946getMaxHeightimpl(j9));
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i9 < size3) {
                Measurable measurable = list.get(i9);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m23948getMinHeightimpl(j9));
                if (i11 < iMaxIntrinsicWidth) {
                    iCoerceAtMost = RangesKt.coerceAtMost(iMaxIntrinsicWidth, i10);
                    intRef.element -= (iCoerceAtMost - i11) / 2;
                } else {
                    iCoerceAtMost = i11;
                }
                arrayList.add(measurable.mo22757measureBRTryo0(ConstraintsKt.m23962constrainN9IONVI(j9, Constraints.INSTANCE.m23957fixedJhjzzOo(iCoerceAtMost, iM23948getMinHeightimpl))));
                i9++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i9 < size4) {
                arrayList.add(list.get(i9).mo22757measureBRTryo0(ConstraintsKt.m23962constrainN9IONVI(j9, Constraints.INSTANCE.m23958fixedHeightOenEA2s(iM23948getMinHeightimpl))));
                i9++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM23947getMaxWidthimpl, iM23948getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                int i13 = intRef.element;
                List<Placeable> list2 = arrayList;
                int size5 = list2.size();
                int i14 = 0;
                int width = i13;
                while (i14 < size5) {
                    Placeable placeable = list2.get(i14);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i14++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
