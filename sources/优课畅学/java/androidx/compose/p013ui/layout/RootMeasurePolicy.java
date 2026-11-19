package androidx.compose.p013ui.layout;

import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.node.LayoutNode;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class RootMeasurePolicy extends LayoutNode.NoIntrinsicsMeasurePolicy {
    public static final int $stable = 0;
    public static final RootMeasurePolicy INSTANCE = new RootMeasurePolicy();

    private RootMeasurePolicy() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        int size = list.size();
        if (size == 0) {
            return MeasureScope.layout$default(measureScope, Constraints.m26854getMinWidthimpl(j10), Constraints.m26853getMinHeightimpl(j10), null, new InterfaceC10570l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$1
                public final void invoke(Placeable.PlacementScope placementScope) {
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }
            }, 4, null);
        }
        if (size == 1) {
            final Placeable placeableMo25627measureBRTryo0 = list.get(0).mo25627measureBRTryo0(j10);
            return MeasureScope.layout$default(measureScope, ConstraintsKt.m26869constrainWidthK40F9xA(j10, placeableMo25627measureBRTryo0.getWidth()), ConstraintsKt.m26868constrainHeightK40F9xA(j10, placeableMo25627measureBRTryo0.getHeight()), null, new InterfaceC10570l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$2
                {
                    super(1);
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Placeable.PlacementScope) obj);
                    return C8736p.f16368a;
                }

                public final void invoke(Placeable.PlacementScope placementScope) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, placeableMo25627measureBRTryo0, 0, 0, 0.0f, (InterfaceC10570l) null, 12, (Object) null);
                }
            }, 4, null);
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            Placeable placeableMo25627measureBRTryo02 = list.get(i10).mo25627measureBRTryo0(j10);
            iMax = Math.max(placeableMo25627measureBRTryo02.getWidth(), iMax);
            iMax2 = Math.max(placeableMo25627measureBRTryo02.getHeight(), iMax2);
            arrayList.add(placeableMo25627measureBRTryo02);
        }
        return MeasureScope.layout$default(measureScope, ConstraintsKt.m26869constrainWidthK40F9xA(j10, iMax), ConstraintsKt.m26868constrainHeightK40F9xA(j10, iMax2), null, new InterfaceC10570l() { // from class: androidx.compose.ui.layout.RootMeasurePolicy$measure$3
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
                int size3 = list2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    Placeable.PlacementScope.placeRelativeWithLayer$default(placementScope, list2.get(i11), 0, 0, 0.0f, (InterfaceC10570l) null, 12, (Object) null);
                }
            }
        }, 4, null);
    }
}
