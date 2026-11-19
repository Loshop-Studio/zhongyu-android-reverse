package androidx.compose.foundation.text;

import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.IntOffset;
import java.util.List;
import kotlin.Pair;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class LinksTextMeasurePolicy implements MeasurePolicy {
    private final InterfaceC9529a shouldMeasureLinks;

    public LinksTextMeasurePolicy(InterfaceC9529a interfaceC9529a) {
        this.shouldMeasureLinks = interfaceC9529a;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j10) {
        return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$measure$1
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
                List listMeasureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(list, this.shouldMeasureLinks);
                if (listMeasureWithTextRangeMeasureConstraints != null) {
                    int size = listMeasureWithTextRangeMeasureConstraints.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Pair pair = (Pair) listMeasureWithTextRangeMeasureConstraints.get(i10);
                        Placeable placeable = (Placeable) pair.m20048a();
                        InterfaceC9529a interfaceC9529a = (InterfaceC9529a) pair.m20049c();
                        Placeable.PlacementScope.m32293place70tqf50$default(placementScope, placeable, interfaceC9529a != null ? ((IntOffset) interfaceC9529a.invoke()).m33638unboximpl() : IntOffset.Companion.m33640getZeronOccac(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
