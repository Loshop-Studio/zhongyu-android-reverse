package androidx.compose.p014ui.spatial;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes2.dex */
final class EmptyFillMeasurePolicy implements MeasurePolicy {
    public static final EmptyFillMeasurePolicy INSTANCE = new EmptyFillMeasurePolicy();

    private EmptyFillMeasurePolicy() {
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.ui.spatial.EmptyFillMeasurePolicy$measure$1
            public final void invoke(Placeable.PlacementScope placementScope) {
            }

            @Override // p181hd.InterfaceC9540l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Placeable.PlacementScope) obj);
                return C10786q.f26013a;
            }
        }, 4, null);
    }
}
