package androidx.compose.p011ui.unit;

import android.support.v4.media.AbstractC0037f;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\t\n\u0002\b\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0018\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0012\u001a7\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001c\u0010\u0018\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001e\u0010\u0018\u001a\u00020\u0019*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0017\u001a\u001e\u0010\u001e\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010!\u001a\u00020\u0000*\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010\u001d\u001a\u001e\u0010%\u001a\u00020\"*\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a*\u0010*\u001a\u00020\u000e*\u00020\u000e2\b\b\u0002\u0010&\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a \u0010-\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b-\u0010.\u001a\u0018\u00100\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b0\u0010\u0012\u001a\u0018\u00102\u001a\u00020\u00002\u0006\u00101\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b2\u0010\u0012\u001a\u0018\u00104\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b4\u0010\u0012\u001a\u0018\u00105\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b5\u0010\u0012\u001a\u0018\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u00020\u0000H\u0082\b¢\u0006\u0004\b6\u0010\u0012\"\u0014\u00107\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00108\"\u0014\u0010:\u001a\u0002098\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;\"\u0014\u0010<\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b<\u00108\"\u0014\u0010=\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b=\u00108\"\u0014\u0010>\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b>\u00108\"\u0014\u0010?\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b?\u00108\"\u0014\u0010@\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b@\u00108\"\u0014\u0010A\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u00108\"\u0014\u0010B\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bB\u00108\"\u0014\u0010C\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u00108\"\u0014\u0010D\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u00108\"\u0014\u0010E\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bE\u00108\"\u0014\u0010F\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u00108\"\u0014\u0010G\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u00108\"\u001a\u0010H\u001a\u0002098\u0000X\u0081T¢\u0006\f\n\u0004\bH\u0010;\u0012\u0004\bI\u0010J\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006K"}, m5110d2 = {"", "widthVal", "heightVal", "Ld6/s;", "throwInvalidConstraintException", "(II)V", "size", "", "throwInvalidConstraintsSizeException", "(I)Ljava/lang/Void;", "minWidth", "maxWidth", "minHeight", "maxHeight", "Landroidx/compose/ui/unit/Constraints;", "createConstraints", "(IIII)J", "bitsNeedForSizeUnchecked", "(I)I", "maxAllowedForSize", Constraints.TAG, "otherConstraints", "constrain-N9IONVI", "(JJ)J", "constrain", "Landroidx/compose/ui/unit/IntSize;", "constrain-4WqzIAM", "width", "constrainWidth-K40F9xA", "(JI)I", "constrainWidth", "height", "constrainHeight-K40F9xA", "constrainHeight", "", "isSatisfiedBy-4WqzIAM", "(JJ)Z", "isSatisfiedBy", "horizontal", "vertical", "offset-NN6Ew-U", "(JII)J", TypedValues.CycleType.S_WAVE_OFFSET, "max", "value", "addMaxWithMinimum", "(II)I", "index", "indexToBitOffset", "bits", "bitOffsetToIndex", "bitOffset", "minHeightOffsets", "widthMask", "heightMask", "Infinity", "I", "", "FocusMask", "J", "MinFocusBits", "MaxAllowedForMinFocusBits", "MinFocusMask", "MinNonFocusBits", "MaxAllowedForMinNonFocusBits", "MinNonFocusMask", "MaxFocusBits", "MaxAllowedForMaxFocusBits", "MaxFocusMask", "MaxNonFocusBits", "MaxAllowedForMaxNonFocusBits", "MaxNonFocusMask", "MaxDimensionsAndFocusMask", "getMaxDimensionsAndFocusMask$annotations", "()V", "ui-unit_release"}, m5111k = 2, m5112mv = {1, 9, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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
    public static final long Constraints(int i, int i8, int i9, int i10) {
        if (!((i9 >= 0) & (i8 >= i) & (i10 >= i9) & (i >= 0))) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return createConstraints(i, i8, i9, i10);
    }

    public static /* synthetic */ long Constraints$default(int i, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        if ((i11 & 4) != 0) {
            i9 = 0;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return Constraints(i, i8, i9, i10);
    }

    private static final int addMaxWithMinimum(int i, int i8) {
        if (i == Integer.MAX_VALUE) {
            return i;
        }
        int i9 = i + i8;
        if (i9 < 0) {
            return 0;
        }
        return i9;
    }

    private static final int bitOffsetToIndex(int i) {
        return (i >> 1) + (i & 1);
    }

    public static final int bitsNeedForSizeUnchecked(int i) {
        if (i < MaxNonFocusMask) {
            return 13;
        }
        if (i < 32767) {
            return 15;
        }
        if (i < 65535) {
            return 16;
        }
        return i < MaxFocusMask ? 18 : 255;
    }

    @Stable
    /* renamed from: constrain-4WqzIAM, reason: not valid java name */
    public static final long m13272constrain4WqzIAM(long j7, long j8) {
        int i = (int) (j8 >> 32);
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        if (i < iM13260getMinWidthimpl) {
            i = iM13260getMinWidthimpl;
        }
        if (i <= iM13258getMaxWidthimpl) {
            iM13258getMaxWidthimpl = i;
        }
        int i8 = (int) (j8 & 4294967295L);
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        if (i8 < iM13259getMinHeightimpl) {
            i8 = iM13259getMinHeightimpl;
        }
        if (i8 <= iM13257getMaxHeightimpl) {
            iM13257getMaxHeightimpl = i8;
        }
        return IntSize.m13471constructorimpl((iM13258getMaxWidthimpl << 32) | (iM13257getMaxHeightimpl & 4294967295L));
    }

    /* renamed from: constrain-N9IONVI, reason: not valid java name */
    public static final long m13273constrainN9IONVI(long j7, long j8) {
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        int iM13260getMinWidthimpl2 = Constraints.m13260getMinWidthimpl(j8);
        if (iM13260getMinWidthimpl2 < iM13260getMinWidthimpl) {
            iM13260getMinWidthimpl2 = iM13260getMinWidthimpl;
        }
        if (iM13260getMinWidthimpl2 > iM13258getMaxWidthimpl) {
            iM13260getMinWidthimpl2 = iM13258getMaxWidthimpl;
        }
        int iM13258getMaxWidthimpl2 = Constraints.m13258getMaxWidthimpl(j8);
        if (iM13258getMaxWidthimpl2 >= iM13260getMinWidthimpl) {
            iM13260getMinWidthimpl = iM13258getMaxWidthimpl2;
        }
        if (iM13260getMinWidthimpl <= iM13258getMaxWidthimpl) {
            iM13258getMaxWidthimpl = iM13260getMinWidthimpl;
        }
        int iM13259getMinHeightimpl2 = Constraints.m13259getMinHeightimpl(j8);
        if (iM13259getMinHeightimpl2 < iM13259getMinHeightimpl) {
            iM13259getMinHeightimpl2 = iM13259getMinHeightimpl;
        }
        if (iM13259getMinHeightimpl2 > iM13257getMaxHeightimpl) {
            iM13259getMinHeightimpl2 = iM13257getMaxHeightimpl;
        }
        int iM13257getMaxHeightimpl2 = Constraints.m13257getMaxHeightimpl(j8);
        if (iM13257getMaxHeightimpl2 >= iM13259getMinHeightimpl) {
            iM13259getMinHeightimpl = iM13257getMaxHeightimpl2;
        }
        if (iM13259getMinHeightimpl <= iM13257getMaxHeightimpl) {
            iM13257getMaxHeightimpl = iM13259getMinHeightimpl;
        }
        return Constraints(iM13260getMinWidthimpl2, iM13258getMaxWidthimpl, iM13259getMinHeightimpl2, iM13257getMaxHeightimpl);
    }

    @Stable
    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final int m13274constrainHeightK40F9xA(long j7, int i) {
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7);
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        if (i < iM13259getMinHeightimpl) {
            i = iM13259getMinHeightimpl;
        }
        return i > iM13257getMaxHeightimpl ? iM13257getMaxHeightimpl : i;
    }

    @Stable
    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final int m13275constrainWidthK40F9xA(long j7, int i) {
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        if (i < iM13260getMinWidthimpl) {
            i = iM13260getMinWidthimpl;
        }
        return i > iM13258getMaxWidthimpl ? iM13258getMaxWidthimpl : i;
    }

    public static final long createConstraints(int i, int i8, int i9, int i10) {
        int i11 = i10 == Integer.MAX_VALUE ? i9 : i10;
        int iBitsNeedForSizeUnchecked = bitsNeedForSizeUnchecked(i11);
        int i12 = i8 == Integer.MAX_VALUE ? i : i8;
        int iBitsNeedForSizeUnchecked2 = bitsNeedForSizeUnchecked(i12);
        if (iBitsNeedForSizeUnchecked + iBitsNeedForSizeUnchecked2 > 31) {
            throwInvalidConstraintException(i12, i11);
        }
        int i13 = i8 + 1;
        int i14 = i10 + 1;
        int i15 = iBitsNeedForSizeUnchecked2 - 13;
        return Constraints.m13246constructorimpl(((i13 & (~(i13 >> 31))) << 33) | ((i15 >> 1) + (i15 & 1)) | (i << 2) | (i9 << (iBitsNeedForSizeUnchecked2 + 2)) | ((i14 & (~(i14 >> 31))) << (iBitsNeedForSizeUnchecked2 + 33)));
    }

    @PublishedApi
    public static /* synthetic */ void getMaxDimensionsAndFocusMask$annotations() {
    }

    private static final int heightMask(int i) {
        return (1 << (18 - i)) - 1;
    }

    private static final int indexToBitOffset(int i) {
        return (((i & 2) >> 1) * 3) + ((i & 1) << 1);
    }

    @Stable
    /* renamed from: isSatisfiedBy-4WqzIAM, reason: not valid java name */
    public static final boolean m13276isSatisfiedBy4WqzIAM(long j7, long j8) {
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7);
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        int i = (int) (j8 >> 32);
        if (iM13260getMinWidthimpl > i || i > iM13258getMaxWidthimpl) {
            return false;
        }
        int i8 = (int) (j8 & 4294967295L);
        return Constraints.m13259getMinHeightimpl(j7) <= i8 && i8 <= Constraints.m13257getMaxHeightimpl(j7);
    }

    private static final int maxAllowedForSize(int i) {
        if (i < MaxNonFocusMask) {
            return MaxAllowedForMaxNonFocusBits;
        }
        if (i < 32767) {
            return MaxAllowedForMinNonFocusBits;
        }
        if (i < 65535) {
            return MaxAllowedForMinFocusBits;
        }
        if (i < MaxFocusMask) {
            return MaxAllowedForMaxFocusBits;
        }
        throwInvalidConstraintsSizeException(i);
        throw new KotlinNothingValueException();
    }

    private static final int minHeightOffsets(int i) {
        return i + 15;
    }

    @Stable
    /* renamed from: offset-NN6Ew-U, reason: not valid java name */
    public static final long m13277offsetNN6EwU(long j7, int i, int i8) {
        int iM13260getMinWidthimpl = Constraints.m13260getMinWidthimpl(j7) + i;
        if (iM13260getMinWidthimpl < 0) {
            iM13260getMinWidthimpl = 0;
        }
        int iM13258getMaxWidthimpl = Constraints.m13258getMaxWidthimpl(j7);
        if (iM13258getMaxWidthimpl != Integer.MAX_VALUE && (iM13258getMaxWidthimpl = iM13258getMaxWidthimpl + i) < 0) {
            iM13258getMaxWidthimpl = 0;
        }
        int iM13259getMinHeightimpl = Constraints.m13259getMinHeightimpl(j7) + i8;
        if (iM13259getMinHeightimpl < 0) {
            iM13259getMinHeightimpl = 0;
        }
        int iM13257getMaxHeightimpl = Constraints.m13257getMaxHeightimpl(j7);
        return Constraints(iM13260getMinWidthimpl, iM13258getMaxWidthimpl, iM13259getMinHeightimpl, (iM13257getMaxHeightimpl == Integer.MAX_VALUE || (iM13257getMaxHeightimpl = iM13257getMaxHeightimpl + i8) >= 0) ? iM13257getMaxHeightimpl : 0);
    }

    /* renamed from: offset-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ long m13278offsetNN6EwU$default(long j7, int i, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i = 0;
        }
        if ((i9 & 2) != 0) {
            i8 = 0;
        }
        return m13277offsetNN6EwU(j7, i, i8);
    }

    public static final void throwInvalidConstraintException(int i, int i8) {
        throw new IllegalArgumentException("Can't represent a width of " + i + " and height of " + i8 + " in Constraints");
    }

    @NotNull
    public static final Void throwInvalidConstraintsSizeException(int i) {
        throw new IllegalArgumentException(AbstractC0037f.m82g(i, "Can't represent a size of ", " in Constraints"));
    }

    private static final int widthMask(int i) {
        return (1 << (i + 13)) - 1;
    }
}
