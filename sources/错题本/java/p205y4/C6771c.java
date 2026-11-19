package p205y4;

import androidx.collection.AbstractC0584a;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.unit.Constraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5806u;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AbstractC5830k;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

/* renamed from: y4.c */
/* loaded from: classes3.dex */
public final class C6771c implements MeasurePolicy {

    /* renamed from: a */
    public final /* synthetic */ float f11445a;

    /* renamed from: b */
    public final /* synthetic */ List f11446b;

    public C6771c(List list, float f) {
        this.f11445a = f;
        this.f11446b = list;
    }

    @Override // androidx.compose.p011ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo6545measure3p2s80s(MeasureScope Layout, List measurables, long j7) {
        int i;
        AbstractC5830k.m5330g(Layout, "$this$Layout");
        AbstractC5830k.m5330g(measurables, "measurables");
        final int iMo6897roundToPx0680j_4 = Layout.mo6897roundToPx0680j_4(this.f11445a);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        final int iMo6897roundToPx0680j_42 = Layout.mo6897roundToPx0680j_4(AbstractC6773e.f11449b);
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(measurables, 10));
        Iterator it = measurables.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Measurable) it.next()).maxIntrinsicWidth(iMo6897roundToPx0680j_42)));
        }
        int size = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < size) {
            int iIntValue = ((Number) arrayList.get(i8)).intValue() + (i8 > 0 ? iMo6897roundToPx0680j_4 : 0) + i9;
            if (iIntValue > iM13258getMaxWidthimpl) {
                break;
            }
            i10 = i8 + 1;
            i8 = i10;
            i9 = iIntValue;
        }
        ListBuilder listBuilderM5278q = AbstractC5806u.m5278q();
        if (i10 == 0) {
            listBuilderM5278q.add(((Measurable) measurables.get(0)).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, iM13258getMaxWidthimpl, 0, 0, 12, null)));
            i = iM13258getMaxWidthimpl;
        } else {
            int i11 = 0;
            while (i11 < i10) {
                listBuilderM5278q.add(((Measurable) measurables.get(i11)).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, ((Number) arrayList.get(i11)).intValue(), 0, 0, 12, null)));
                i11++;
                iM13258getMaxWidthimpl = iM13258getMaxWidthimpl;
            }
            i = iM13258getMaxWidthimpl;
            if (i10 < this.f11446b.size()) {
                int i12 = (i - i9) - iMo6897roundToPx0680j_4;
                int i13 = i12 < 0 ? 0 : i12;
                if (i13 > 0) {
                    listBuilderM5278q.add(((Measurable) measurables.get(i10)).mo12033measureBRTryo0(Constraints.m13248copyZbe2FdA$default(j7, 0, i13, 0, 0, 12, null)));
                }
            }
        }
        final List listBuild = listBuilderM5278q.build();
        return MeasureScope.layout$default(Layout, i, iMo6897roundToPx0680j_42, null, new InterfaceC6471c() { // from class: y4.b
            @Override // p152r6.InterfaceC6471c
            public final Object invoke(Object obj) {
                Placeable.PlacementScope layout = (Placeable.PlacementScope) obj;
                AbstractC5830k.m5330g(layout, "$this$layout");
                int i14 = 0;
                int width = 0;
                for (Object obj2 : listBuild) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC5806u.m5258L();
                        throw null;
                    }
                    Placeable placeable = (Placeable) obj2;
                    if (i14 > 0) {
                        width += iMo6897roundToPx0680j_4;
                    }
                    Placeable.PlacementScope.place$default(layout, placeable, width, AbstractC0584a.m906g(placeable, iMo6897roundToPx0680j_42, 2), 0.0f, 4, null);
                    width += placeable.getWidth();
                    i14 = i15;
                }
                return C5443s.f8405a;
            }
        }, 4, null);
    }
}
