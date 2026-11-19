package androidx.compose.p006ui.layout;

import androidx.compose.p006ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1421e {
    /* renamed from: a */
    public static int m654a(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i5), IntrinsicMinMax.Max, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo6928measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: b */
    public static int m655b(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i5), IntrinsicMinMax.Max, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo6928measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null)).getWidth();
    }

    /* renamed from: c */
    public static int m656c(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i5), IntrinsicMinMax.Min, IntrinsicWidthHeight.Height));
        }
        return measurePolicy.mo6928measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, i4, 0, 0, 13, null)).getHeight();
    }

    /* renamed from: d */
    public static int m657d(MeasurePolicy measurePolicy, IntrinsicMeasureScope intrinsicMeasureScope, List measurables, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(new DefaultIntrinsicMeasurable((IntrinsicMeasurable) measurables.get(i5), IntrinsicMinMax.Min, IntrinsicWidthHeight.Width));
        }
        return measurePolicy.mo6928measure3p2s80s(new IntrinsicsMeasureScope(intrinsicMeasureScope, intrinsicMeasureScope.getLayoutDirection()), arrayList, ConstraintsKt.Constraints$default(0, 0, 0, i4, 7, null)).getWidth();
    }
}
