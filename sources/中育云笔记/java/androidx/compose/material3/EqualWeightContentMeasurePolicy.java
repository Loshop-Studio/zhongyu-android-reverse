package androidx.compose.material3;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class EqualWeightContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        int i10 = 0;
        if (Constraints.m33450getHasBoundedWidthimpl(j10)) {
            int i11 = iM33454getMaxWidthimpl / size;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                int iMaxIntrinsicHeight = list.get(i12).maxIntrinsicHeight(i11);
                if (iM33455getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM33455getMinHeightimpl = AbstractC10410o.m21756i(iMaxIntrinsicHeight, Constraints.m33453getMaxHeightimpl(j10));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            while (i10 < size3) {
                arrayList2.add(list.get(i10).mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(j10, Constraints.Companion.m33464fixedJhjzzOo(i11, iM33455getMinHeightimpl))));
                i10++;
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(j10, Constraints.Companion.m33465fixedHeightOenEA2s(iM33455getMinHeightimpl))));
                i10++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.EqualWeightContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
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
