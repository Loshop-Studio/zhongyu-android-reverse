package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;

@Stable
/* loaded from: classes2.dex */
public interface MultiContentMeasurePolicy {
    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo27405measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i12), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo27405measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo27405measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j10);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return mo27405measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            List<? extends IntrinsicMeasurable> list2 = list.get(i11);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList2.add(new DefaultIntrinsicMeasurable(list2.get(i12), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return mo27405measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }
}
