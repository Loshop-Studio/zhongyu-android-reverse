package androidx.compose.foundation.text;

import androidx.compose.p014ui.geometry.Rect;
import androidx.compose.p014ui.layout.Measurable;
import androidx.compose.p014ui.layout.MeasurePolicy;
import androidx.compose.p014ui.layout.MeasureResult;
import androidx.compose.p014ui.layout.MeasureScope;
import androidx.compose.p014ui.layout.Placeable;
import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.p014ui.unit.IntOffset;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import p181hd.InterfaceC9529a;
import p181hd.InterfaceC9540l;
import p309qc.C10786q;

/* loaded from: classes.dex */
final class TextMeasurePolicy implements MeasurePolicy {
    private final InterfaceC9529a placements;
    private final InterfaceC9529a shouldMeasureLinks;

    public TextMeasurePolicy(InterfaceC9529a interfaceC9529a, InterfaceC9529a interfaceC9529a2) {
        this.shouldMeasureLinks = interfaceC9529a;
        this.placements = interfaceC9529a2;
    }

    @Override // androidx.compose.p014ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10) {
        final ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList(list.size());
        List<? extends Measurable> list2 = list;
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            Measurable measurable = list.get(i10);
            if (!(measurable.getParentData() instanceof TextRangeLayoutModifier)) {
                arrayList2.add(measurable);
            }
        }
        List list3 = (List) this.placements.invoke();
        if (list3 != null) {
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size2 = list3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Rect rect = (Rect) list3.get(i11);
                Pair pair = rect != null ? new Pair(((Measurable) arrayList2.get(i11)).mo32229measureBRTryo0(ConstraintsKt.Constraints$default(0, (int) Math.floor(rect.getRight() - rect.getLeft()), 0, (int) Math.floor(rect.getBottom() - rect.getTop()), 5, null)), IntOffset.m33620boximpl(IntOffset.m33623constructorimpl((Math.round(rect.getTop()) & 4294967295L) | (Math.round(rect.getLeft()) << 32)))) : null;
                if (pair != null) {
                    arrayList3.add(pair);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Measurable measurable2 = list.get(i12);
            if (measurable2.getParentData() instanceof TextRangeLayoutModifier) {
                arrayList4.add(measurable2);
            }
        }
        final List listMeasureWithTextRangeMeasureConstraints = BasicTextKt.measureWithTextRangeMeasureConstraints(arrayList4, this.shouldMeasureLinks);
        return MeasureScope.layout$default(measureScope, Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10), null, new InterfaceC9540l() { // from class: androidx.compose.foundation.text.TextMeasurePolicy$measure$1
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
                List<Pair<Placeable, IntOffset>> list4 = arrayList;
                if (list4 != null) {
                    int size4 = list4.size();
                    for (int i13 = 0; i13 < size4; i13++) {
                        Pair<Placeable, IntOffset> pair2 = list4.get(i13);
                        Placeable.PlacementScope.m32293place70tqf50$default(placementScope, (Placeable) pair2.m20048a(), ((IntOffset) pair2.m20049c()).m33638unboximpl(), 0.0f, 2, null);
                    }
                }
                List<Pair<Placeable, InterfaceC9529a>> list5 = listMeasureWithTextRangeMeasureConstraints;
                if (list5 != null) {
                    int size5 = list5.size();
                    for (int i14 = 0; i14 < size5; i14++) {
                        Pair<Placeable, InterfaceC9529a> pair3 = list5.get(i14);
                        Placeable placeable = (Placeable) pair3.m20048a();
                        InterfaceC9529a interfaceC9529a = (InterfaceC9529a) pair3.m20049c();
                        Placeable.PlacementScope.m32293place70tqf50$default(placementScope, placeable, interfaceC9529a != null ? ((IntOffset) interfaceC9529a.invoke()).m33638unboximpl() : IntOffset.Companion.m33640getZeronOccac(), 0.0f, 2, null);
                    }
                }
            }
        }, 4, null);
    }
}
