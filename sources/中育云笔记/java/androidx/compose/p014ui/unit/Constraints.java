package androidx.compose.p014ui.unit;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.AbstractC9972n;
import p309qc.InterfaceC10770a;

@Immutable
/* loaded from: classes2.dex */
public final class Constraints {
    public static final Companion Companion = new Companion(null);
    public static final int Infinity = Integer.MAX_VALUE;
    private final long value;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: restrictConstraints-xF2OJ5Q$default, reason: not valid java name */
        public static /* synthetic */ long m33461restrictConstraintsxF2OJ5Q$default(Companion companion, int i10, int i11, int i12, int i13, boolean z10, int i14, Object obj) {
            if ((i14 & 16) != 0) {
                z10 = true;
            }
            return companion.m33467restrictConstraintsxF2OJ5Q(i10, i11, i12, i13, z10);
        }

        @Stable
        /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
        public final long m33462fitPrioritizingHeightZbe2FdA(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i12, 262142);
            int iMin2 = i13 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i13, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i15);
                        throw new KotlinNothingValueException();
                    }
                    i14 = 8190;
                }
            }
            return ConstraintsKt.Constraints(Math.min(i14, i10), i11 != Integer.MAX_VALUE ? Math.min(i14, i11) : Integer.MAX_VALUE, iMin, iMin2);
        }

        @Stable
        /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
        public final long m33463fitPrioritizingWidthZbe2FdA(int i10, int i11, int i12, int i13) {
            int i14 = 262142;
            int iMin = Math.min(i10, 262142);
            int iMin2 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i11, 262142);
            int i15 = iMin2 == Integer.MAX_VALUE ? iMin : iMin2;
            if (i15 >= 8191) {
                if (i15 < 32767) {
                    i14 = 65534;
                } else if (i15 < 65535) {
                    i14 = 32766;
                } else {
                    if (i15 >= 262143) {
                        ConstraintsKt.throwInvalidConstraintsSizeException(i15);
                        throw new KotlinNothingValueException();
                    }
                    i14 = 8190;
                }
            }
            return ConstraintsKt.Constraints(iMin, iMin2, Math.min(i14, i12), i13 != Integer.MAX_VALUE ? Math.min(i14, i13) : Integer.MAX_VALUE);
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m33464fixedJhjzzOo(int i10, int i11) {
            if (!((i11 >= 0) & (i10 >= 0))) {
                InlineClassHelperKt.throwIllegalArgumentException("width and height must be >= 0");
            }
            return ConstraintsKt.createConstraints(i10, i10, i11, i11);
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m33465fixedHeightOenEA2s(int i10) {
            if (!(i10 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("height must be >= 0");
            }
            return ConstraintsKt.createConstraints(0, Integer.MAX_VALUE, i10, i10);
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m33466fixedWidthOenEA2s(int i10) {
            if (!(i10 >= 0)) {
                InlineClassHelperKt.throwIllegalArgumentException("width must be >= 0");
            }
            return ConstraintsKt.createConstraints(i10, i10, 0, Integer.MAX_VALUE);
        }

        @Stable
        @InterfaceC10770a
        /* renamed from: restrictConstraints-xF2OJ5Q, reason: not valid java name */
        public final long m33467restrictConstraintsxF2OJ5Q(int i10, int i11, int i12, int i13, boolean z10) {
            return z10 ? m33463fitPrioritizingWidthZbe2FdA(i10, i11, i12, i13) : m33462fitPrioritizingHeightZbe2FdA(i10, i11, i12, i13);
        }

        private Companion() {
        }
    }

    private /* synthetic */ Constraints(long j10) {
        this.value = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m33441boximpl(long j10) {
        return new Constraints(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m33442constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m33443copyZbe2FdA(long j10, int i10, int i11, int i12, int i13) {
        if (!(i11 >= i10 && i13 >= i12 && i10 >= 0 && i12 >= 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return ConstraintsKt.createConstraints(i10, i11, i12, i13);
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m33444copyZbe2FdA$default(long j10, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = m33456getMinWidthimpl(j10);
        }
        int i15 = i10;
        if ((i14 & 2) != 0) {
            i11 = m33454getMaxWidthimpl(j10);
        }
        int i16 = i11;
        if ((i14 & 4) != 0) {
            i12 = m33455getMinHeightimpl(j10);
        }
        int i17 = i12;
        if ((i14 & 8) != 0) {
            i13 = m33453getMaxHeightimpl(j10);
        }
        return m33443copyZbe2FdA(j10, i15, i16, i17, i13);
    }

    /* renamed from: copyMaxDimensions-msEJaDk, reason: not valid java name */
    public static final long m33445copyMaxDimensionsmsEJaDk(long j10) {
        return m33442constructorimpl(j10 & ConstraintsKt.MaxDimensionsAndFocusMask);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m33446equalsimpl(long j10, Object obj) {
        return (obj instanceof Constraints) && j10 == ((Constraints) obj).m33460unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33447equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m33448getFocusIndeximpl(long j10) {
        return (int) (j10 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m33449getHasBoundedHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return (((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m33450getHasBoundedWidthimpl(long j10) {
        int i10 = (int) (3 & j10);
        return (((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1)) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m33451getHasFixedHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = (1 << (18 - i11)) - 1;
        int i13 = ((int) (j10 >> (i11 + 15))) & i12;
        int i14 = ((int) (j10 >> (i11 + 46))) & i12;
        return i13 == (i14 == 0 ? Integer.MAX_VALUE : i14 - 1);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m33452getHasFixedWidthimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = (1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1;
        int i12 = ((int) (j10 >> 2)) & i11;
        int i13 = ((int) (j10 >> 33)) & i11;
        return i12 == (i13 == 0 ? Integer.MAX_VALUE : i13 - 1);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m33453getMaxHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        int i12 = ((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1);
        if (i12 == 0) {
            return Integer.MAX_VALUE;
        }
        return i12 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m33454getMaxWidthimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((int) (j10 >> 33)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
        if (i11 == 0) {
            return Integer.MAX_VALUE;
        }
        return i11 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m33455getMinHeightimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((int) (j10 >> (i11 + 15))) & ((1 << (18 - i11)) - 1);
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m33456getMinWidthimpl(long j10) {
        int i10 = (int) (3 & j10);
        return ((int) (j10 >> 2)) & ((1 << ((((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3)) + 13)) - 1);
    }

    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m33457hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m33458isZeroimpl(long j10) {
        int i10 = (int) (3 & j10);
        int i11 = ((i10 & 1) << 1) + (((i10 & 2) >> 1) * 3);
        return ((((int) (j10 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1 == 0) | ((((int) (j10 >> (i11 + 46))) & ((1 << (18 - i11)) - 1)) - 1 == 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m33459toStringimpl(long j10) {
        int iM33454getMaxWidthimpl = m33454getMaxWidthimpl(j10);
        String strValueOf = iM33454getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM33454getMaxWidthimpl);
        int iM33453getMaxHeightimpl = m33453getMaxHeightimpl(j10);
        return "Constraints(minWidth = " + m33456getMinWidthimpl(j10) + ", maxWidth = " + strValueOf + ", minHeight = " + m33455getMinHeightimpl(j10) + ", maxHeight = " + (iM33453getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM33453getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m33446equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m33457hashCodeimpl(this.value);
    }

    public String toString() {
        return m33459toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m33460unboximpl() {
        return this.value;
    }
}
