package androidx.compose.foundation.text;

import androidx.compose.p013ui.layout.Measurable;
import androidx.compose.p013ui.layout.MeasurePolicy;
import androidx.compose.p013ui.layout.MeasureResult;
import androidx.compose.p013ui.layout.MeasureScope;
import androidx.compose.p013ui.layout.Placeable;
import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.IntOffset;
import java.util.List;
import kotlin.Pair;
import p123h7.C8736p;
import p300x7.InterfaceC10559a;
import p300x7.InterfaceC10570l;

/* loaded from: classes.dex */
final class LinksTextMeasurePolicy implements MeasurePolicy {
    private final InterfaceC10559a shouldMeasureLinks;

    public LinksTextMeasurePolicy(InterfaceC10559a interfaceC10559a) {
        this.shouldMeasureLinks = interfaceC10559a;
    }

    @Override // androidx.compose.p013ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo20139measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j10) {
        return MeasureScope.layout$default(measureScope, Constraints.m26852getMaxWidthimpl(j10), Constraints.m26851getMaxHeightimpl(j10), null, new InterfaceC10570l() { // from class: androidx.compose.foundation.text.LinksTextMeasurePolicy$measure$1
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
                List listMeasureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(list, this.shouldMeasureLinks);
                if (listMeasureWithTextRangeMeasureConstraints != null) {
                    int size = listMeasureWithTextRangeMeasureConstraints.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Pair pair = (Pair) listMeasureWithTextRangeMeasureConstraints.get(i10);
                        Placeable placeable = (Placeable) pair.m15903a();
                        InterfaceC10559a interfaceC10559a = (InterfaceC10559a) pair.m15904b();
                        Placeable.PlacementScope.m25691place70tqf50$default(placementScope, placeable, interfaceC10559a != null ? ((IntOffset) interfaceC10559a.invoke()).m27036unboximpl() : IntOffset.Companion.m27038getZeronOccac(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
