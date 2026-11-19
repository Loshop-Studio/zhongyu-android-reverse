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
import p077d8.AbstractC8323h;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes2.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        int i10 = 0;
        if (Constraints.m26848getHasBoundedWidthimpl(j10)) {
            int i11 = iM26852getMaxWidthimpl / size;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int iMaxIntrinsicHeight = list.get(i12).maxIntrinsicHeight(i11);
                if (iM26853getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM26853getMinHeightimpl = AbstractC8323h.m13513h(iMaxIntrinsicHeight, Constraints.m26851getMaxHeightimpl(j10));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            while (i10 < size3) {
                arrayList2.add(list.get(i10).mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(j10, Constraints.Companion.m26862fixedJhjzzOo(i11, iM26853getMinHeightimpl))));
                i10++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).mo25627measureBRTryo0(ConstraintsKt.m26867constrainN9IONVI(j10, Constraints.Companion.m26863fixedHeightOenEA2s(iM26853getMinHeightimpl))));
                i10++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, null, new InterfaceC10570l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$measure$5
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
                List<Placeable> list2 = arrayList;
                int size5 = list2.size();
                int i13 = 0;
                int width = 0;
                while (i13 < size5) {
                    Placeable placeable = list2.get(i13);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i13++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
