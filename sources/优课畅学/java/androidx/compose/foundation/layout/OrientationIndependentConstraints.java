package androidx.compose.foundation.layout;

import androidx.compose.p013ui.unit.Constraints;
import androidx.compose.p013ui.unit.ConstraintsKt;

/* loaded from: classes.dex */
public final class OrientationIndependentConstraints {
    private final long value;

    private /* synthetic */ OrientationIndependentConstraints(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OrientationIndependentConstraints m20822boximpl(long j10) {
        return new OrientationIndependentConstraints(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m20824constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-yUG9Ft0, reason: not valid java name */
    public static final long m20826copyyUG9Ft0(long j10, int i10, int i11, int i12, int i13) {
        return m20823constructorimpl(i10, i11, i12, i13);
    }

    /* renamed from: copy-yUG9Ft0$default, reason: not valid java name */
    public static /* synthetic */ long m20827copyyUG9Ft0$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = Constraints.m26854getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = Constraints.m26852getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = Constraints.m26853getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = Constraints.m26851getMaxHeightimpl(j10);
        }
        return m20826copyyUG9Ft0(j10, i15, i16, i17, i13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20828equalsimpl(long j10, Object obj) {
        return (obj instanceof OrientationIndependentConstraints) && Constraints.m26845equalsimpl0(j10, ((OrientationIndependentConstraints) obj).m20840unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20829equalsimpl0(long j10, long j11) {
        return Constraints.m26845equalsimpl0(j10, j11);
    }

    /* renamed from: getCrossAxisMax-impl, reason: not valid java name */
    public static final int m20830getCrossAxisMaximpl(long j10) {
        return Constraints.m26851getMaxHeightimpl(j10);
    }

    /* renamed from: getCrossAxisMin-impl, reason: not valid java name */
    public static final int m20831getCrossAxisMinimpl(long j10) {
        return Constraints.m26853getMinHeightimpl(j10);
    }

    /* renamed from: getMainAxisMax-impl, reason: not valid java name */
    public static final int m20832getMainAxisMaximpl(long j10) {
        return Constraints.m26852getMaxWidthimpl(j10);
    }

    /* renamed from: getMainAxisMin-impl, reason: not valid java name */
    public static final int m20833getMainAxisMinimpl(long j10) {
        return Constraints.m26854getMinWidthimpl(j10);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20834hashCodeimpl(long j10) {
        return Constraints.m26855hashCodeimpl(j10);
    }

    /* renamed from: maxHeight-impl, reason: not valid java name */
    public static final int m20835maxHeightimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m26851getMaxHeightimpl(j10) : Constraints.m26852getMaxWidthimpl(j10);
    }

    /* renamed from: maxWidth-impl, reason: not valid java name */
    public static final int m20836maxWidthimpl(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? Constraints.m26852getMaxWidthimpl(j10) : Constraints.m26851getMaxHeightimpl(j10);
    }

    /* renamed from: stretchCrossAxis-q4ezo7Y, reason: not valid java name */
    public static final long m20837stretchCrossAxisq4ezo7Y(long j10) {
        return m20823constructorimpl(Constraints.m26854getMinWidthimpl(j10), Constraints.m26852getMaxWidthimpl(j10), Constraints.m26851getMaxHeightimpl(j10) != Integer.MAX_VALUE ? Constraints.m26851getMaxHeightimpl(j10) : Constraints.m26853getMinHeightimpl(j10), Constraints.m26851getMaxHeightimpl(j10));
    }

    /* renamed from: toBoxConstraints-OenEA2s, reason: not valid java name */
    public static final long m20838toBoxConstraintsOenEA2s(long j10, LayoutOrientation layoutOrientation) {
        return layoutOrientation == LayoutOrientation.Horizontal ? ConstraintsKt.Constraints(Constraints.m26854getMinWidthimpl(j10), Constraints.m26852getMaxWidthimpl(j10), Constraints.m26853getMinHeightimpl(j10), Constraints.m26851getMaxHeightimpl(j10)) : ConstraintsKt.Constraints(Constraints.m26853getMinHeightimpl(j10), Constraints.m26851getMaxHeightimpl(j10), Constraints.m26854getMinWidthimpl(j10), Constraints.m26852getMaxWidthimpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20839toStringimpl(long j10) {
        return "OrientationIndependentConstraints(value=" + ((Object) Constraints.m26857toStringimpl(j10)) + ')';
    }

    public boolean equals(Object obj) {
        return m20828equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m20834hashCodeimpl(this.value);
    }

    public String toString() {
        return m20839toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20840unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20823constructorimpl(int i10, int i11, int i12, int i13) {
        return m20824constructorimpl(ConstraintsKt.Constraints(i10, i11, i12, i13));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20825constructorimpl(long j10, LayoutOrientation layoutOrientation) {
        LayoutOrientation layoutOrientation2 = LayoutOrientation.Horizontal;
        return m20823constructorimpl(layoutOrientation == layoutOrientation2 ? Constraints.m26854getMinWidthimpl(j10) : Constraints.m26853getMinHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m26852getMaxWidthimpl(j10) : Constraints.m26851getMaxHeightimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m26853getMinHeightimpl(j10) : Constraints.m26854getMinWidthimpl(j10), layoutOrientation == layoutOrientation2 ? Constraints.m26851getMaxHeightimpl(j10) : Constraints.m26852getMaxWidthimpl(j10));
    }
}
