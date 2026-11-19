package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.g */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1423g {
    /* renamed from: a */
    public static int m663a(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list = (List) measurables.get(i5);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i6), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m10611measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: b */
    public static int m664b(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list = (List) measurables.get(i5);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i6), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m10611measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null)).getWidth();
    }

    /* renamed from: c */
    public static int m665c(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list = (List) measurables.get(i5);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i6), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m10611measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: d */
    public static int m666d(MultiContentMeasurePolicy multiContentMeasurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            List list = (List) measurables.get(i5);
            ArrayList arrayList2 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i6 = 0; i6 < size2; i6++) {
                arrayList2.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) list.get(i6), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
            }
            arrayList.add(arrayList2);
        }
        return multiContentMeasurePolicy.m10611measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null)).getWidth();
    }
}
