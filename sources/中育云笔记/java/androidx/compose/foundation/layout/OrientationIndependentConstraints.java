package androidx.compose.foundation.layout;

import androidx.compose.p014ui.unit.Constraints;
import androidx.compose.p014ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m27424boximpl(long j10) {
        return new OrientationIndependentConstraints(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m27426constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m27428copyyUG9Ft0(long j10, int i10, int i11, int i12, int i13) {
        return m27425constructorimpl(i10, i11, i12, i13);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m27429copyyUG9Ft0$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = Constraints.m33456getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = Constraints.m33454getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = Constraints.m33455getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = Constraints.m33453getMaxHeightimpl(j10);
        }
        return m27428copyyUG9Ft0(j10, i15, i16, i17, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27430equalsimpl(long j10, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m33447equalsimpl0(j10, ((OrientationIndependentConstraints) obj).m27442unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27431equalsimpl0(long j10, long j11) {
        return Constraints.m33447equalsimpl0(j10, j11);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m27432getCrossAxisMaximpl(long j10) {
        return Constraints.m33453getMaxHeightimpl(j10);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m27433getCrossAxisMinimpl(long j10) {
        return Constraints.m33455getMinHeightimpl(j10);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m27434getMainAxisMaximpl(long j10) {
        return Constraints.m33454getMaxWidthimpl(j10);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m27435getMainAxisMinimpl(long j10) {
        return Constraints.m33456getMinWidthimpl(j10);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27436hashCodeimpl(long j10) {
        return Constraints.m33457hashCodeimpl(j10);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m27437maxHeightimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m33453getMaxHeightimpl(j10) : Constraints.m33454getMaxWidthimpl(j10);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m27438maxWidthimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m33454getMaxWidthimpl(j10) : Constraints.m33453getMaxHeightimpl(j10);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m27439stretchCrossAxisq4ezo7Y(long j10) {
        return m27425constructorimpl(Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10), Constraints.m33453getMaxHeightimpl(j10) != Integer.MAX_VALUE ? Constraints.m33453getMaxHeightimpl(j10) : Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m27440toBoxConstraintsOenEA2s(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10), Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10)) : ConstraintsKt.Constraints(Constraints.m33455getMinHeightimpl(j10), Constraints.m33453getMaxHeightimpl(j10), Constraints.m33456getMinWidthimpl(j10), Constraints.m33454getMaxWidthimpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27441toStringimpl(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m33459toStringimpl(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return m27430equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m27436hashCodeimpl(this.value);
    }

    public String toString() {
        return m27441toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27442unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27425constructorimpl(int i10, int i11, int i12, int i13) {
        return m27426constructorimpl(ConstraintsKt.Constraints(i10, i11, i12, i13));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27427constructorimpl(long j10, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m27425constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m33456getMinWidthimpl(j10) : Constraints.m33455getMinHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m33454getMaxWidthimpl(j10) : Constraints.m33453getMaxHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m33455getMinHeightimpl(j10) : Constraints.m33456getMinWidthimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m33453getMaxHeightimpl(j10) : Constraints.m33454getMaxWidthimpl(j10));
    }
}
