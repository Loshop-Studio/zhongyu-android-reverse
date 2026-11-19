package androidx.compose.p006ui.layout;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.compose.ui.layout.c */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1419c {
    /* renamed from: a */
    public static int m640a(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: b */
    public static int m641b(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: c */
    public static int m642c(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i4);
    }

    /* renamed from: d */
    public static int m643d(LayoutModifier layoutModifier, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i4) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(layoutModifier, intrinsicMeasureScope, measurable, i4);
    }
}
