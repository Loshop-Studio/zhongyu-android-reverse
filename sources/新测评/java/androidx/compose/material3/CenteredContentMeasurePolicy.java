package androidx.compose.material3;

import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(m13557d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m13558d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m13559k = 1, m13560mv = {1, 8, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n33#2,6:471\n151#2,3:477\n33#2,4:480\n154#2,2:484\n38#2:486\n156#2:487\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n364#1:460,3\n364#1:463,4\n364#1:467,2\n364#1:469\n364#1:470\n373#1:471,6\n380#1:477,3\n380#1:480,4\n380#1:484,2\n380#1:486\n380#1:487\n*E\n"})
/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo16988measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        int iCoerceAtMost;
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM23514getMaxWidthimpl, iM23515getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
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
        int i10 = 0;
        if (Constraints.m23510getHasBoundedWidthimpl(j10)) {
            int i11 = iM23514getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM23514getMaxWidthimpl);
            intRef.element = iCalculateCenteredContentHorizontalPadding;
            int i12 = (iM23514getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                int iMaxIntrinsicHeight = list.get(i13).maxIntrinsicHeight(i12);
                if (iM23515getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM23515getMinHeightimpl = RangesKt.coerceAtMost(iMaxIntrinsicHeight, Constraints.m23513getMaxHeightimpl(j10));
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i10 < size3) {
                Measurable measurable = list.get(i10);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m23515getMinHeightimpl(j10));
                if (i12 < iMaxIntrinsicWidth) {
                    iCoerceAtMost = RangesKt.coerceAtMost(iMaxIntrinsicWidth, i11);
                    intRef.element -= (iCoerceAtMost - i12) / 2;
                } else {
                    iCoerceAtMost = i12;
                }
                arrayList.add(measurable.mo22324measureBRTryo0(ConstraintsKt.m23529constrainN9IONVI(j10, Constraints.INSTANCE.m23524fixedJhjzzOo(iCoerceAtMost, iM23515getMinHeightimpl))));
                i10++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).mo22324measureBRTryo0(ConstraintsKt.m23529constrainN9IONVI(j10, Constraints.INSTANCE.m23525fixedHeightOenEA2s(iM23515getMinHeightimpl))));
                i10++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM23514getMaxWidthimpl, iM23515getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
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
                int i14 = intRef.element;
                List<Placeable> list2 = arrayList;
                int size5 = list2.size();
                int i15 = 0;
                int width = i14;
                while (i15 < size5) {
                    Placeable placeable = list2.get(i15);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i15++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
