package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Stable;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
public final class ConstraintsKt {
    private static final long FocusMask = 3;
    private static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxAllowedForMaxFocusBits = 8190;
    private static final int MaxAllowedForMaxNonFocusBits = 262142;
    private static final int MaxAllowedForMinFocusBits = 32766;
    private static final int MaxAllowedForMinNonFocusBits = 65534;
    public static final long MaxDimensionsAndFocusMask = -8589934589L;
    private static final int MaxFocusBits = 18;
    private static final int MaxFocusMask = 262143;
    private static final int MaxNonFocusBits = 13;
    private static final int MaxNonFocusMask = 8191;
    private static final int MinFocusBits = 16;
    private static final int MinFocusMask = 65535;
    private static final int MinNonFocusBits = 15;
    private static final int MinNonFocusMask = 32767;

    @Stable
    public static final long Constraints(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i10, i11, i12, i13);
    }

    public static /* synthetic */ long Constraints$default(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return Constraints(i10, i11, i12, i13);
    }

    private static final int addMaxWithMinimum(int i10, int i11) {
        if (i10 == Integer.MAX_VALUE) {
            return i10;
        }
        int i12 = i10 + i11;
        if (i12 < 0) {
            return 0;
        }
        return i12;
    }

    private static final int bitOffsetToIndex(int i10) {
        return (i10 >> 1) + (i10 & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i10) {
        if (i10 < MaxNonFocusMask) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < MaxFocusMask ? 18 : 255;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m26866constrain4WqzIAM(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        if (i10 < iM26854getMinWidthimpl) {
            i10 = iM26854getMinWidthimpl;
        }
        if (i10 <= iM26852getMaxWidthimpl) {
            iM26852getMaxWidthimpl = i10;
        }
        int i11 = (int) (j11 & 4294967295L);
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        if (i11 < iM26853getMinHeightimpl) {
            i11 = iM26853getMinHeightimpl;
        }
        if (i11 <= iM26851getMaxHeightimpl) {
            iM26851getMaxHeightimpl = i11;
        }
        return IntSize.m27065constructorimpl((iM26852getMaxWidthimpl << 32) | (iM26851getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m26867constrainN9IONVI(long j10, long j11) {
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        int iM26854getMinWidthimpl2 = Constraints.m26854getMinWidthimpl(j11);
        if (iM26854getMinWidthimpl2 < iM26854getMinWidthimpl) {
            iM26854getMinWidthimpl2 = iM26854getMinWidthimpl;
        }
        if (iM26854getMinWidthimpl2 > iM26852getMaxWidthimpl) {
            iM26854getMinWidthimpl2 = iM26852getMaxWidthimpl;
        }
        int iM26852getMaxWidthimpl2 = Constraints.m26852getMaxWidthimpl(j11);
        if (iM26852getMaxWidthimpl2 >= iM26854getMinWidthimpl) {
            iM26854getMinWidthimpl = iM26852getMaxWidthimpl2;
        }
        if (iM26854getMinWidthimpl <= iM26852getMaxWidthimpl) {
            iM26852getMaxWidthimpl = iM26854getMinWidthimpl;
        }
        int iM26853getMinHeightimpl2 = Constraints.m26853getMinHeightimpl(j11);
        if (iM26853getMinHeightimpl2 < iM26853getMinHeightimpl) {
            iM26853getMinHeightimpl2 = iM26853getMinHeightimpl;
        }
        if (iM26853getMinHeightimpl2 > iM26851getMaxHeightimpl) {
            iM26853getMinHeightimpl2 = iM26851getMaxHeightimpl;
        }
        int iM26851getMaxHeightimpl2 = Constraints.m26851getMaxHeightimpl(j11);
        if (iM26851getMaxHeightimpl2 >= iM26853getMinHeightimpl) {
            iM26853getMinHeightimpl = iM26851getMaxHeightimpl2;
        }
        if (iM26853getMinHeightimpl <= iM26851getMaxHeightimpl) {
            iM26851getMaxHeightimpl = iM26853getMinHeightimpl;
        }
        return Constraints(iM26854getMinWidthimpl2, iM26852getMaxWidthimpl, iM26853getMinHeightimpl2, iM26851getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m26868constrainHeightK40F9xA(long j10, int i10) {
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10);
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        if (i10 < iM26853getMinHeightimpl) {
            i10 = iM26853getMinHeightimpl;
        }
        return i10 > iM26851getMaxHeightimpl ? iM26851getMaxHeightimpl : i10;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m26869constrainWidthK40F9xA(long j10, int i10) {
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        if (i10 < iM26854getMinWidthimpl) {
            i10 = iM26854getMinWidthimpl;
        }
        return i10 > iM26852getMaxWidthimpl ? iM26852getMaxWidthimpl : i10;
    }

    public static final long createConstraints(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i15);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m26840constructorimpl(((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iBitsNeedForSizeUnchecked2 + 2)) | ((i17 & (~(i17 >> 31))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i10) {
        return (1 << (18 - i10)) - 1;
    }

    private static final int indexToBitOffset(int i10) {
        return ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m26870isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10);
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        int i10 = (int) (j11 >> 32);
        if (iM26854getMinWidthimpl > i10 || i10 > iM26852getMaxWidthimpl) {
            return false;
        }
        int i11 = (int) (j11 & 4294967295L);
        return Constraints.m26853getMinHeightimpl(j10) <= i11 && i11 <= Constraints.m26851getMaxHeightimpl(j10);
    }

    private static final int maxAllowedForSize(int i10) {
        if (i10 < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i10 < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i10 < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i10 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i10);
        throw new KotlinNothingValueException();
    }

    private static final int minHeightOffsets(int i10) {
        return i10 + 15;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m26871offsetNN6EwU(long j10, int i10, int i11) {
        int iM26854getMinWidthimpl = Constraints.m26854getMinWidthimpl(j10) + i10;
        if (iM26854getMinWidthimpl < 0) {
            iM26854getMinWidthimpl = 0;
        }
        int iM26852getMaxWidthimpl = Constraints.m26852getMaxWidthimpl(j10);
        if (iM26852getMaxWidthimpl != Integer.MAX_VALUE && (iM26852getMaxWidthimpl = iM26852getMaxWidthimpl + i10) < 0) {
            iM26852getMaxWidthimpl = 0;
        }
        int iM26853getMinHeightimpl = Constraints.m26853getMinHeightimpl(j10) + i11;
        if (iM26853getMinHeightimpl < 0) {
            iM26853getMinHeightimpl = 0;
        }
        int iM26851getMaxHeightimpl = Constraints.m26851getMaxHeightimpl(j10);
        return Constraints(iM26854getMinWidthimpl, iM26852getMaxWidthimpl, iM26853getMinHeightimpl, (iM26851getMaxHeightimpl == Integer.MAX_VALUE || (iM26851getMaxHeightimpl = iM26851getMaxHeightimpl + i11) >= 0) ? iM26851getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m26872offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m26871offsetNN6EwU(j10, i10, i11);
    }

    public static final void throwInvalidConstraintException(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int i10) {
        throw new IllegalArgumentException("Can't represent a size of " + i10 + " in Constraints");
    }

    private static final int widthMask(int i10) {
        return (1 << (i10 + 13)) - 1;
    }
}
