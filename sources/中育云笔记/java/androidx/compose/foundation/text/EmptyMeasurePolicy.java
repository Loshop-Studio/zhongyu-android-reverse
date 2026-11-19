package androidx.compose.foundation.text;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import java.util.List;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {
    public static final EmptyMeasurePolicy INSTANCE = new EmptyMeasurePolicy();
    private static final InterfaceC9540l placementBlock = new InterfaceC9540l() { // from class: androidx.compose.foundation.text.EmptyMeasurePolicy$placementBlock$1
        public final void invoke(Placeable.PlacementScope placementScope) {
        }

        @Override // p181hd.InterfaceC9540l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return C10786q.f26013a;
        }
    };

    private EmptyMeasurePolicy() {
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, placementBlock, 4, null);
    }
}
