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
import kotlin.jvm.internal.Ref$IntRef;
import p181hd.InterfaceC9540l;
import p265nd.AbstractC10410o;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        int iM21756i;
        int iM33454getMaxWidthimpl = Constraints.m33454getMaxWidthimpl(j10);
        int iM33455getMinHeightimpl = Constraints.m33455getMinHeightimpl(j10);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        int i10 = 0;
        if (Constraints.m33450getHasBoundedWidthimpl(j10)) {
            int i11 = iM33454getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM33454getMaxWidthimpl);
            ref$IntRef.f23400c = iCalculateCenteredContentHorizontalPadding;
            int i12 = (iM33454getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                int iMaxIntrinsicHeight = list.get(i13).maxIntrinsicHeight(i12);
                if (iM33455getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM33455getMinHeightimpl = AbstractC10410o.m21756i(iMaxIntrinsicHeight, Constraints.m33453getMaxHeightimpl(j10));
                }
            }
            arrayList = new ArrayList(list.size());
            int size3 = list.size();
            while (i10 < size3) {
                Measurable measurable = list.get(i10);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m33455getMinHeightimpl(j10));
                if (i12 < iMaxIntrinsicWidth) {
                    iM21756i = AbstractC10410o.m21756i(iMaxIntrinsicWidth, i11);
                    ref$IntRef.f23400c -= (iM21756i - i12) / 2;
                } else {
                    iM21756i = i12;
                }
                arrayList.add(measurable.mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(j10, Constraints.Companion.m33464fixedJhjzzOo(iM21756i, iM33455getMinHeightimpl))));
                i10++;
            }
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            while (i10 < size4) {
                arrayList.add(list.get(i10).mo32229measureBRTryo0(ConstraintsKt.m33469constrainN9IONVI(j10, Constraints.Companion.m33465fixedHeightOenEA2s(iM33455getMinHeightimpl))));
                i10++;
            }
        }
        return MeasureScope.layout$default(measureScope, iM33454getMaxWidthimpl, iM33455getMinHeightimpl, null, new InterfaceC9540l() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
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
                int i14 = ref$IntRef.f23400c;
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
