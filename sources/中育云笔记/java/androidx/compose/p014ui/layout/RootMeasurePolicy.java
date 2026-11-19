package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.node.LayoutNode;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m33456getMinWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }
            }, 4, null);
        }
        if (size == 1) {
            final Placeable placeableMo32229measureBRTryo0 = list.get(0).mo32229measureBRTryo0(j10);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m33471constrainWidthK40F9xA(j10, placeableMo32229measureBRTryo0.getWidth()), ConstraintsKt.m33470constrainHeightK40F9xA(j10, placeableMo32229measureBRTryo0.getHeight()), null, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p181hd.InterfaceC9540l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C10786q.f26013a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo32229measureBRTryo0, 0, 0, 0.0f, (InterfaceC9540l) null, 12, (Object) null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            Placeable placeableMo32229measureBRTryo02 = list.get(i10).mo32229measureBRTryo0(j10);
            iMax = Math.max(placeableMo32229measureBRTryo02.getWidth(), iMax);
            iMax2 = Math.max(placeableMo32229measureBRTryo02.getHeight(), iMax2);
            arrayList.add(placeableMo32229measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m33471constrainWidthK40F9xA(j10, iMax), ConstraintsKt.m33470constrainHeightK40F9xA(j10, iMax2), null, new InterfaceC9540l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
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
                int size3 = list2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i11), 0, 0, 0.0f, (InterfaceC9540l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }
}
