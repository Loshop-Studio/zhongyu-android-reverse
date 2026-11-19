package androidx.compose.foundation.text;

import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import java.util.List;
import p123h7.C8736p;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class EmptyMeasurePolicy implements MeasurePolicy {
    public static final EmptyMeasurePolicy INSTANCE = new EmptyMeasurePolicy();
    private static final InterfaceC10570l placementBlock = new InterfaceC10570l() { // from class: androidx.compose.foundation.text.EmptyMeasurePolicy$placementBlock$1
        public final void invoke(Placeable.PlacementScope placementScope) {
        }

        @Override // p300x7.InterfaceC10570l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Placeable.PlacementScope) obj);
            return C8736p.f16368a;
        }
    };

    private EmptyMeasurePolicy() {
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        return MeasureScope.layout$default(measureScope, Constraints.m26852getMaxWidthimpl(j10), Constraints.m26851getMaxHeightimpl(j10), null, placementBlock, 4, null);
    }
}
