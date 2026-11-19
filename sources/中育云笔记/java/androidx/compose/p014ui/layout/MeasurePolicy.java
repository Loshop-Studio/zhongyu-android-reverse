package androidx.compose.p014ui.layout;

import androidx.compose.p014ui.unit.ConstraintsKt;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;

@Stable
/* loaded from: classes2.dex */
public interface MeasurePolicy {

    public static final class DefaultImpls {
        @Deprecated
        public static int maxIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            return MeasurePolicy.super.maxIntrinsicHeight(intrinsicMeasureScope, list, i10);
        }

        @Deprecated
        public static int maxIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            return MeasurePolicy.super.maxIntrinsicWidth(intrinsicMeasureScope, list, i10);
        }

        @Deprecated
        public static int minIntrinsicHeight(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            return MeasurePolicy.super.minIntrinsicHeight(intrinsicMeasureScope, list, i10);
        }

        @Deprecated
        public static int minIntrinsicWidth(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
            return MeasurePolicy.super.minIntrinsicWidth(intrinsicMeasureScope, list, i10);
        }
    }

    default int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return mo26741measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return mo26741measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }

    /* renamed from: measure-3p2s80s */
    MeasureResult mo26741measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j10);

    default int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return mo26741measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i10, 0, 0, 13, null)).getHeight();
    }

    default int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new DefaultIntrinsicMeasurable(list.get(i11), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return mo26741measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i10, 7, null)).getWidth();
    }
}
