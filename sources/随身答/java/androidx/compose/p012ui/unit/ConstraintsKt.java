package androidx.compose.p012ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13412d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0082\b\u001a\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a-\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0019\u001a\u0011\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010&\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0000\u001a\u0010\u0010,\u001a\u00020-2\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a\u0011\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u001c\u0010/\u001a\u00020\u0014*\u00020\u00142\u0006\u00100\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001e\u0010/\u001a\u000203*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00102\u001a\u001e\u00105\u001a\u00020\u0003*\u00020\u00142\u0006\u00106\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001e\u00109\u001a\u00020\u0003*\u00020\u00142\u0006\u0010:\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00108\u001a\u001e\u0010<\u001a\u00020=*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a*\u0010@\u001a\u00020\u0014*\u00020\u00142\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, m13413d2 = {"FocusMask", "", "Infinity", "", "MaxAllowedForMaxFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxAllowedForMinFocusBits", "MaxAllowedForMinNonFocusBits", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V", "MaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusMask", "MinNonFocusBits", "MinNonFocusMask", Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "bitOffsetToIndex", "bits", "bitsNeedForSizeUnchecked", "size", "createConstraints", "heightMask", "bitOffset", "indexToBitOffset", "index", "maxAllowedForSize", "minHeightOffsets", "throwInvalidConstraintException", "", "widthVal", "heightVal", "throwInvalidConstraintsSizeException", "", "widthMask", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, m13414k = 2, m13415mv = {1, 9, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/unit/InlineClassHelperKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,634:1\n621#1:635\n627#1:636\n552#1,4:733\n552#1,4:739\n37#2,5:637\n101#3,10:642\n101#3,10:652\n101#3,10:662\n101#3,10:672\n101#3,10:684\n101#3,10:696\n101#3,10:708\n101#3,10:718\n105#3:732\n105#3:737\n105#3:738\n105#3:743\n105#3:744\n54#4:682\n59#4:694\n54#4:728\n59#4:730\n85#5:683\n90#5:695\n80#5:707\n85#5:729\n90#5:731\n30#6:706\n*S KotlinDebug\n*F\n+ 1 Constraints.kt\nandroidx/compose/ui/unit/ConstraintsKt\n*L\n440#1:635\n442#1:636\n546#1:733,4\n548#1:739,4\n486#1:637,5\n514#1:642,10\n515#1:652,10\n516#1:662,10\n517#1:672,10\n525#1:684,10\n526#1:696,10\n530#1:708,10\n533#1:718,10\n545#1:732\n546#1:737\n547#1:738\n548#1:743\n555#1:744\n525#1:682\n526#1:694\n538#1:728\n538#1:730\n525#1:683\n526#1:695\n524#1:707\n538#1:729\n538#1:731\n524#1:706\n*E\n"})
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
    public static final long Constraints(int i9, int i10, int i11, int i12) {
        if (!((i11 >= 0) & (i10 >= i9) & (i12 >= i11) & (i9 >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i9, i10, i11, i12);
    }

    public static /* synthetic */ long Constraints$default(int i9, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i9 = 0;
        }
        if ((i13 & 2) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = Integer.MAX_VALUE;
        }
        return Constraints(i9, i10, i11, i12);
    }

    private static final int addMaxWithMinimum(int i9, int i10) {
        if (i9 == Integer.MAX_VALUE) {
            return i9;
        }
        int i11 = i9 + i10;
        if (i11 < 0) {
            return 0;
        }
        return i11;
    }

    private static final int bitOffsetToIndex(int i9) {
        return (i9 >> 1) + (i9 & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i9) {
        if (i9 < MaxNonFocusMask) {
            return 13;
        }
        if (i9 < 32767) {
            return 15;
        }
        if (i9 < 65535) {
            return 16;
        }
        return i9 < MaxFocusMask ? 18 : 255;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m23961constrain4WqzIAM(long j9, long j10) {
        int i9 = (int) (j10 >> 32);
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        if (i9 < iM23949getMinWidthimpl) {
            i9 = iM23949getMinWidthimpl;
        }
        if (i9 <= iM23947getMaxWidthimpl) {
            iM23947getMaxWidthimpl = i9;
        }
        int i10 = (int) (j10 & 4294967295L);
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
        if (i10 < iM23948getMinHeightimpl) {
            i10 = iM23948getMinHeightimpl;
        }
        if (i10 <= iM23946getMaxHeightimpl) {
            iM23946getMaxHeightimpl = i10;
        }
        return IntSize.m24160constructorimpl((iM23947getMaxWidthimpl << 32) | (iM23946getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m23962constrainN9IONVI(long j9, long j10) {
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
        int iM23949getMinWidthimpl2 = Constraints.m23949getMinWidthimpl(j10);
        if (iM23949getMinWidthimpl2 < iM23949getMinWidthimpl) {
            iM23949getMinWidthimpl2 = iM23949getMinWidthimpl;
        }
        if (iM23949getMinWidthimpl2 > iM23947getMaxWidthimpl) {
            iM23949getMinWidthimpl2 = iM23947getMaxWidthimpl;
        }
        int iM23947getMaxWidthimpl2 = Constraints.m23947getMaxWidthimpl(j10);
        if (iM23947getMaxWidthimpl2 >= iM23949getMinWidthimpl) {
            iM23949getMinWidthimpl = iM23947getMaxWidthimpl2;
        }
        if (iM23949getMinWidthimpl <= iM23947getMaxWidthimpl) {
            iM23947getMaxWidthimpl = iM23949getMinWidthimpl;
        }
        int iM23948getMinHeightimpl2 = Constraints.m23948getMinHeightimpl(j10);
        if (iM23948getMinHeightimpl2 < iM23948getMinHeightimpl) {
            iM23948getMinHeightimpl2 = iM23948getMinHeightimpl;
        }
        if (iM23948getMinHeightimpl2 > iM23946getMaxHeightimpl) {
            iM23948getMinHeightimpl2 = iM23946getMaxHeightimpl;
        }
        int iM23946getMaxHeightimpl2 = Constraints.m23946getMaxHeightimpl(j10);
        if (iM23946getMaxHeightimpl2 >= iM23948getMinHeightimpl) {
            iM23948getMinHeightimpl = iM23946getMaxHeightimpl2;
        }
        if (iM23948getMinHeightimpl <= iM23946getMaxHeightimpl) {
            iM23946getMaxHeightimpl = iM23948getMinHeightimpl;
        }
        return Constraints(iM23949getMinWidthimpl2, iM23947getMaxWidthimpl, iM23948getMinHeightimpl2, iM23946getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m23963constrainHeightK40F9xA(long j9, int i9) {
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9);
        int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
        if (i9 < iM23948getMinHeightimpl) {
            i9 = iM23948getMinHeightimpl;
        }
        return i9 > iM23946getMaxHeightimpl ? iM23946getMaxHeightimpl : i9;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m23964constrainWidthK40F9xA(long j9, int i9) {
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        if (i9 < iM23949getMinWidthimpl) {
            i9 = iM23949getMinWidthimpl;
        }
        return i9 > iM23947getMaxWidthimpl ? iM23947getMaxWidthimpl : i9;
    }

    public static final long createConstraints(int i9, int i10, int i11, int i12) {
        int i13 = i12 == Integer.MAX_VALUE ? i11 : i12;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i13);
        int i14 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i14);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i14, i13);
        }
        int i15 = i10 + 1;
        int i16 = i12 + 1;
        int i17 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m23935constructorimpl(((i15 & (~(i15 >> 31))) << 33) | ((i17 >> 1) + (i17 & 1)) | (i9 << 2) | (i11 << (iBitsNeedForSizeUnchecked2 + 2)) | ((i16 & (~(i16 >> 31))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    @PublishedApi
    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i9) {
        return (1 << (18 - i9)) - 1;
    }

    private static final int indexToBitOffset(int i9) {
        return ((i9 & 1) << 1) + (((i9 & 2) >> 1) * 3);
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m23965isSatisfiedBy4WqzIAM(long j9, long j10) {
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9);
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        int i9 = (int) (j10 >> 32);
        if (iM23949getMinWidthimpl > i9 || i9 > iM23947getMaxWidthimpl) {
            return false;
        }
        int i10 = (int) (j10 & 4294967295L);
        return Constraints.m23948getMinHeightimpl(j9) <= i10 && i10 <= Constraints.m23946getMaxHeightimpl(j9);
    }

    private static final int maxAllowedForSize(int i9) {
        if (i9 < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i9 < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i9 < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i9 < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i9);
        throw new KotlinNothingValueException();
    }

    private static final int minHeightOffsets(int i9) {
        return i9 + 15;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m23966offsetNN6EwU(long j9, int i9, int i10) {
        int iM23949getMinWidthimpl = Constraints.m23949getMinWidthimpl(j9) + i9;
        if (iM23949getMinWidthimpl < 0) {
            iM23949getMinWidthimpl = 0;
        }
        int iM23947getMaxWidthimpl = Constraints.m23947getMaxWidthimpl(j9);
        if (iM23947getMaxWidthimpl != Integer.MAX_VALUE && (iM23947getMaxWidthimpl = iM23947getMaxWidthimpl + i9) < 0) {
            iM23947getMaxWidthimpl = 0;
        }
        int iM23948getMinHeightimpl = Constraints.m23948getMinHeightimpl(j9) + i10;
        if (iM23948getMinHeightimpl < 0) {
            iM23948getMinHeightimpl = 0;
        }
        int iM23946getMaxHeightimpl = Constraints.m23946getMaxHeightimpl(j9);
        return Constraints(iM23949getMinWidthimpl, iM23947getMaxWidthimpl, iM23948getMinHeightimpl, (iM23946getMaxHeightimpl == Integer.MAX_VALUE || (iM23946getMaxHeightimpl = iM23946getMaxHeightimpl + i10) >= 0) ? iM23946getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m23967offsetNN6EwU$default(long j9, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i9 = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return m23966offsetNN6EwU(j9, i9, i10);
    }

    public static final void throwInvalidConstraintException(int i9, int i10) {
        throw new IllegalArgumentException("Can't represent a width of " + i9 + " and height of " + i10 + " in Constraints");
    }

    public static final Void throwInvalidConstraintsSizeException(int i9) {
        throw new IllegalArgumentException("Can't represent a size of " + i9 + " in Constraints");
    }

    private static final int widthMask(int i9) {
        return (1 << (i9 + 13)) - 1;
    }
}
