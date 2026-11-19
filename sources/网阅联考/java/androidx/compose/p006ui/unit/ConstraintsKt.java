package androidx.compose.p006ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import kotlin.Metadata;
import kotlin.ranges.RangesKt___RangesKt;

@Metadata(m5174d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\u001a8\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002\u001a\u001f\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u000b\u001a\u00020\u000f*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000e\u001a!\u0010\u0012\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a!\u0010\u0016\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a-\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u0003H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\""}, m5175d2 = {Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "size", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "offset", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, m5176k = 2, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class ConstraintsKt {
    @Stable
    public static final long Constraints(int i4, int i5, int i6, int i7) {
        if (!(i5 >= i4)) {
            throw new IllegalArgumentException(("maxWidth(" + i5 + ") must be >= than minWidth(" + i4 + ')').toString());
        }
        if (!(i7 >= i6)) {
            throw new IllegalArgumentException(("maxHeight(" + i7 + ") must be >= than minHeight(" + i6 + ')').toString());
        }
        if (i4 >= 0 && i6 >= 0) {
            return Constraints.INSTANCE.m11500createConstraintsZbe2FdA$ui_unit_release(i4, i5, i6, i7);
        }
        throw new IllegalArgumentException(("minWidth(" + i4 + ") and minHeight(" + i6 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long Constraints$default(int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = 0;
        }
        if ((i8 & 2) != 0) {
            i5 = Integer.MAX_VALUE;
        }
        if ((i8 & 4) != 0) {
            i6 = 0;
        }
        if ((i8 & 8) != 0) {
            i7 = Integer.MAX_VALUE;
        }
        return Constraints(i4, i5, i6, i7);
    }

    private static final int addMaxWithMinimum(int i4, int i5) {
        return i4 == Integer.MAX_VALUE ? i4 : RangesKt___RangesKt.coerceAtLeast(i4 + i5, 0);
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m11504constrain4WqzIAM(long j4, long j5) {
        return IntSizeKt.IntSize(RangesKt___RangesKt.coerceIn(IntSize.m11685getWidthimpl(j5), Constraints.m11495getMinWidthimpl(j4), Constraints.m11493getMaxWidthimpl(j4)), RangesKt___RangesKt.coerceIn(IntSize.m11684getHeightimpl(j5), Constraints.m11494getMinHeightimpl(j4), Constraints.m11492getMaxHeightimpl(j4)));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m11505constrainN9IONVI(long j4, long j5) {
        return Constraints(RangesKt___RangesKt.coerceIn(Constraints.m11495getMinWidthimpl(j5), Constraints.m11495getMinWidthimpl(j4), Constraints.m11493getMaxWidthimpl(j4)), RangesKt___RangesKt.coerceIn(Constraints.m11493getMaxWidthimpl(j5), Constraints.m11495getMinWidthimpl(j4), Constraints.m11493getMaxWidthimpl(j4)), RangesKt___RangesKt.coerceIn(Constraints.m11494getMinHeightimpl(j5), Constraints.m11494getMinHeightimpl(j4), Constraints.m11492getMaxHeightimpl(j4)), RangesKt___RangesKt.coerceIn(Constraints.m11492getMaxHeightimpl(j5), Constraints.m11494getMinHeightimpl(j4), Constraints.m11492getMaxHeightimpl(j4)));
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m11506constrainHeightK40F9xA(long j4, int i4) {
        return RangesKt___RangesKt.coerceIn(i4, Constraints.m11494getMinHeightimpl(j4), Constraints.m11492getMaxHeightimpl(j4));
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m11507constrainWidthK40F9xA(long j4, int i4) {
        return RangesKt___RangesKt.coerceIn(i4, Constraints.m11495getMinWidthimpl(j4), Constraints.m11493getMaxWidthimpl(j4));
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m11508isSatisfiedBy4WqzIAM(long j4, long j5) {
        int iM11495getMinWidthimpl = Constraints.m11495getMinWidthimpl(j4);
        int iM11493getMaxWidthimpl = Constraints.m11493getMaxWidthimpl(j4);
        int iM11685getWidthimpl = IntSize.m11685getWidthimpl(j5);
        if (iM11495getMinWidthimpl <= iM11685getWidthimpl && iM11685getWidthimpl <= iM11493getMaxWidthimpl) {
            int iM11494getMinHeightimpl = Constraints.m11494getMinHeightimpl(j4);
            int iM11492getMaxHeightimpl = Constraints.m11492getMaxHeightimpl(j4);
            int iM11684getHeightimpl = IntSize.m11684getHeightimpl(j5);
            if (iM11494getMinHeightimpl <= iM11684getHeightimpl && iM11684getHeightimpl <= iM11492getMaxHeightimpl) {
                return true;
            }
        }
        return false;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m11509offsetNN6EwU(long j4, int i4, int i5) {
        return Constraints(RangesKt___RangesKt.coerceAtLeast(Constraints.m11495getMinWidthimpl(j4) + i4, 0), addMaxWithMinimum(Constraints.m11493getMaxWidthimpl(j4), i4), RangesKt___RangesKt.coerceAtLeast(Constraints.m11494getMinHeightimpl(j4) + i5, 0), addMaxWithMinimum(Constraints.m11492getMaxHeightimpl(j4), i5));
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m11510offsetNN6EwU$default(long j4, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i4 = 0;
        }
        if ((i6 & 2) != 0) {
            i5 = 0;
        }
        return m11509offsetNN6EwU(j4, i4, i5);
    }
}
