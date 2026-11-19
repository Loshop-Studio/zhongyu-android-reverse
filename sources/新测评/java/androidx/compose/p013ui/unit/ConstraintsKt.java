package androidx.compose.p013ui.unit;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.Constraints;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m13557d1 = {"\u00008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\u001a5\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0082\b\u001a\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a-\u0010!\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0003H\u0000¢\u0006\u0002\u0010\u0019\u001a\u0011\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010$\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010&\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a\u0011\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u0003H\u0000\u001a\u0010\u0010,\u001a\u00020-2\u0006\u0010 \u001a\u00020\u0003H\u0000\u001a\u0011\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\u0003H\u0082\b\u001a\u001c\u0010/\u001a\u00020\u0014*\u00020\u00142\u0006\u00100\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a\u001e\u0010/\u001a\u000203*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00102\u001a\u001e\u00105\u001a\u00020\u0003*\u00020\u00142\u0006\u00106\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a\u001e\u00109\u001a\u00020\u0003*\u00020\u00142\u0006\u0010:\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b;\u00108\u001a\u001e\u0010<\u001a\u00020=*\u00020\u00142\u0006\u0010 \u001a\u000203H\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010?\u001a*\u0010@\u001a\u00020\u0014*\u00020\u00142\b\b\u0002\u0010A\u001a\u00020\u00032\b\b\u0002\u0010B\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\bC\u0010D\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\b\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, m13558d2 = {"FocusMask", "", "Infinity", "", "MaxAllowedForMaxFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxAllowedForMinFocusBits", "MaxAllowedForMinNonFocusBits", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V", "MaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusMask", "MinNonFocusBits", "MinNonFocusMask", Constraints.TAG, "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "(IIII)J", "addMaxWithMinimum", "max", "value", "bitOffsetToIndex", "bits", "bitsNeedForSizeUnchecked", "size", "createConstraints", "heightMask", "bitOffset", "indexToBitOffset", "index", "maxAllowedForSize", "minHeightOffsets", "throwInvalidConstraintException", "", "widthVal", "heightVal", "throwInvalidConstraintsSizeException", "", "widthMask", "constrain", "otherConstraints", "constrain-N9IONVI", "(JJ)J", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "constrainHeight", "height", "constrainHeight-K40F9xA", "(JI)I", "constrainWidth", "width", "constrainWidth-K40F9xA", "isSatisfiedBy", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", TypedValues.CycleType.S_WAVE_OFFSET, "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", "ui-unit_release"}, m13559k = 2, m13560mv = {1, 9, 0}, m13562xi = 48)
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
    public static final long m23528constrain4WqzIAM(long j10, long j11) {
        int i10 = (int) (j11 >> 32);
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        if (i10 < iM23516getMinWidthimpl) {
            i10 = iM23516getMinWidthimpl;
        }
        if (i10 <= iM23514getMaxWidthimpl) {
            iM23514getMaxWidthimpl = i10;
        }
        int i11 = (int) (j11 & 4294967295L);
        int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
        int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
        if (i11 < iM23515getMinHeightimpl) {
            i11 = iM23515getMinHeightimpl;
        }
        if (i11 <= iM23513getMaxHeightimpl) {
            iM23513getMaxHeightimpl = i11;
        }
        return IntSize.m23727constructorimpl((iM23514getMaxWidthimpl << 32) | (iM23513getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m23529constrainN9IONVI(long j10, long j11) {
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
        int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
        int iM23516getMinWidthimpl2 = Constraints.m23516getMinWidthimpl(j11);
        if (iM23516getMinWidthimpl2 < iM23516getMinWidthimpl) {
            iM23516getMinWidthimpl2 = iM23516getMinWidthimpl;
        }
        if (iM23516getMinWidthimpl2 > iM23514getMaxWidthimpl) {
            iM23516getMinWidthimpl2 = iM23514getMaxWidthimpl;
        }
        int iM23514getMaxWidthimpl2 = Constraints.m23514getMaxWidthimpl(j11);
        if (iM23514getMaxWidthimpl2 >= iM23516getMinWidthimpl) {
            iM23516getMinWidthimpl = iM23514getMaxWidthimpl2;
        }
        if (iM23516getMinWidthimpl <= iM23514getMaxWidthimpl) {
            iM23514getMaxWidthimpl = iM23516getMinWidthimpl;
        }
        int iM23515getMinHeightimpl2 = Constraints.m23515getMinHeightimpl(j11);
        if (iM23515getMinHeightimpl2 < iM23515getMinHeightimpl) {
            iM23515getMinHeightimpl2 = iM23515getMinHeightimpl;
        }
        if (iM23515getMinHeightimpl2 > iM23513getMaxHeightimpl) {
            iM23515getMinHeightimpl2 = iM23513getMaxHeightimpl;
        }
        int iM23513getMaxHeightimpl2 = Constraints.m23513getMaxHeightimpl(j11);
        if (iM23513getMaxHeightimpl2 >= iM23515getMinHeightimpl) {
            iM23515getMinHeightimpl = iM23513getMaxHeightimpl2;
        }
        if (iM23515getMinHeightimpl <= iM23513getMaxHeightimpl) {
            iM23513getMaxHeightimpl = iM23515getMinHeightimpl;
        }
        return Constraints(iM23516getMinWidthimpl2, iM23514getMaxWidthimpl, iM23515getMinHeightimpl2, iM23513getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m23530constrainHeightK40F9xA(long j10, int i10) {
        int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10);
        int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
        if (i10 < iM23515getMinHeightimpl) {
            i10 = iM23515getMinHeightimpl;
        }
        return i10 > iM23513getMaxHeightimpl ? iM23513getMaxHeightimpl : i10;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m23531constrainWidthK40F9xA(long j10, int i10) {
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        if (i10 < iM23516getMinWidthimpl) {
            i10 = iM23516getMinWidthimpl;
        }
        return i10 > iM23514getMaxWidthimpl ? iM23514getMaxWidthimpl : i10;
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
        return Constraints.m23502constructorimpl(((i16 & (~(i16 >> 31))) << 33) | ((i18 >> 1) + (i18 & 1)) | (i10 << 2) | (i12 << (iBitsNeedForSizeUnchecked2 + 2)) | ((i17 & (~(i17 >> 31))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    @PublishedApi
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
    public static final boolean m23532isSatisfiedBy4WqzIAM(long j10, long j11) {
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10);
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        int i10 = (int) (j11 >> 32);
        if (iM23516getMinWidthimpl > i10 || i10 > iM23514getMaxWidthimpl) {
            return false;
        }
        int i11 = (int) (j11 & 4294967295L);
        return Constraints.m23515getMinHeightimpl(j10) <= i11 && i11 <= Constraints.m23513getMaxHeightimpl(j10);
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
    public static final long m23533offsetNN6EwU(long j10, int i10, int i11) {
        int iM23516getMinWidthimpl = Constraints.m23516getMinWidthimpl(j10) + i10;
        if (iM23516getMinWidthimpl < 0) {
            iM23516getMinWidthimpl = 0;
        }
        int iM23514getMaxWidthimpl = Constraints.m23514getMaxWidthimpl(j10);
        if (iM23514getMaxWidthimpl != Integer.MAX_VALUE && (iM23514getMaxWidthimpl = iM23514getMaxWidthimpl + i10) < 0) {
            iM23514getMaxWidthimpl = 0;
        }
        int iM23515getMinHeightimpl = Constraints.m23515getMinHeightimpl(j10) + i11;
        if (iM23515getMinHeightimpl < 0) {
            iM23515getMinHeightimpl = 0;
        }
        int iM23513getMaxHeightimpl = Constraints.m23513getMaxHeightimpl(j10);
        return Constraints(iM23516getMinWidthimpl, iM23514getMaxWidthimpl, iM23515getMinHeightimpl, (iM23513getMaxHeightimpl == Integer.MAX_VALUE || (iM23513getMaxHeightimpl = iM23513getMaxHeightimpl + i11) >= 0) ? iM23513getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m23534offsetNN6EwU$default(long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return m23533offsetNN6EwU(j10, i10, i11);
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
