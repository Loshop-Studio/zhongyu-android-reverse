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
import kotlin.jvm.internal.Ref$IntRef;
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        int iM13513h;
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i10 = 0;
        if (Constraints.m26848getHasBoundedWidthimpl(j10)) {
            int i11 = iM26852getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM26852getMaxWidthimpl);
            ref$IntRef.f17471a = iCalculateCenteredContentHorizontalPadding;
            int i12 = (iM26852getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                int iMaxIntrinsicHeight = list.get(i13).maxIntrinsicHeight(i12);
                if (iM26853getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM26853getMinHeightimpl = AbstractC8323h.m13513h(iMaxIntrinsicHeight, Constraints.m26851getMaxHeightimpl(j10));
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i10 < size3) {
                Measurable measurable = list.get(i10);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m26853getMinHeightimpl(j10));
                if (i12 < iMaxIntrinsicWidth) {
                    iM13513h = AbstractC8323h.m13513h(iMaxIntrinsicWidth, i11);
                    ref$IntRef.f17471a -= (iM13513h - i12) / 2;
                } else {
                    iM13513h = i12;
                }
                arrayList.add(measurable.mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(j10, Constraints.Companion.m26862fixedJhjzzOo(iM13513h, iM26853getMinHeightimpl))));
                i10++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(j10, Constraints.Companion.m26863fixedHeightOenEA2s(iM26853getMinHeightimpl))));
                i10++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p300x7.InterfaceC10570l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C8736p.f16368a;
            }

            public final void invoke(Placeable.PlacementScope placementScope) {
                int i14 = ref$IntRef.f17471a;
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
