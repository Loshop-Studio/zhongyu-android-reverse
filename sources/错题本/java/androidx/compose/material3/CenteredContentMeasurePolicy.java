package androidx.compose.material3;

import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.p011ui.unit.ConstraintsKt;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, m5110d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, m5111k = 1, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nExpressiveNavigationBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,459:1\n151#2,3:460\n33#2,4:463\n154#2,2:467\n38#2:469\n156#2:470\n33#2,6:471\n151#2,3:477\n33#2,4:480\n154#2,2:484\n38#2:486\n156#2:487\n*S KotlinDebug\n*F\n+ 1 ExpressiveNavigationBar.kt\nandroidx/compose/material3/CenteredContentMeasurePolicy\n*L\n364#1:460,3\n364#1:463,4\n364#1:467,2\n364#1:469\n364#1:470\n373#1:471,6\n380#1:477,3\n380#1:480,4\n380#1:484,2\n380#1:486\n380#1:487\n*E\n"})
/* loaded from: classes.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    @NotNull
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo6545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends Measurable> list, long j7) {
        final ArrayList arrayList;
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iM13259getMinHeightimpl, null, new InterfaceC6471c() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C5443s.f8405a;
                }
            }, 4, null);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i = 0;
        if (Constraints.m13254getHasBoundedWidthimpl(j7)) {
            int i8 = iM13258getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM13258getMaxWidthimpl);
            ref$IntRef.element = iCalculateCenteredContentHorizontalPadding;
            int i9 = (iM13258getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i10 = 0; i10 < size2; i10++) {
                int iMaxIntrinsicHeight = list.get(i10).maxIntrinsicHeight(i9);
                if (iM13259getMinHeightimpl < iMaxIntrinsicHeight) {
                    int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
                    if (iMaxIntrinsicHeight > iM13257getMaxHeightimpl) {
                        iMaxIntrinsicHeight = iM13257getMaxHeightimpl;
                    }
                    iM13259getMinHeightimpl = iMaxIntrinsicHeight;
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i < size3) {
                Measurable measurable = list.get(i);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m13259getMinHeightimpl(j7));
                if (i9 < iMaxIntrinsicWidth) {
                    if (iMaxIntrinsicWidth > i8) {
                        iMaxIntrinsicWidth = i8;
                    }
                    ref$IntRef.element -= (iMaxIntrinsicWidth - i9) / 2;
                } else {
                    iMaxIntrinsicWidth = i9;
                }
                arrayList.add(measurable.mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(j7, Constraints.INSTANCE.m13268fixedJhjzzOo(iMaxIntrinsicWidth, iM13259getMinHeightimpl))));
                i++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i < size4) {
                arrayList.add(list.get(i).mo12033measureBRTryo0(ConstraintsKt.m13273constrainN9IONVI(j7, Constraints.INSTANCE.m13269fixedHeightOenEA2s(iM13259getMinHeightimpl))));
                i++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM13258getMaxWidthimpl, iM13259getMinHeightimpl, null, new InterfaceC6471c() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p152r6.InterfaceC6471c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C5443s.f8405a;
            }

            public final void invoke(@NotNull Placeable.PlacementScope placementScope) {
                int i11 = ref$IntRef.element;
                List<Placeable> list2 = arrayList;
                int size5 = list2.size();
                int i12 = 0;
                int width = i11;
                while (i12 < size5) {
                    Placeable placeable = list2.get(i12);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i12++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
