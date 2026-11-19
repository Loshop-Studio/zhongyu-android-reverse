package androidx.compose.p006ui.unit;

import androidx.compose.animation.AbstractC0321a;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Immutable
@Metadata(m5174d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 02\u00020\u0001:\u00010B\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010#\u001a\u00020\u00002\b\b\u0002\u0010 \u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u00072\b\b\u0002\u0010\u001e\u001a\u00020\u00072\b\b\u0002\u0010\u001a\u001a\u00020\u0007ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\u000b2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u000f\u0010,\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\rR\u001a\u0010\u0017\u001a\u00020\u000b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u001a\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\"\u0010\u0012\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00061"}, m5175d2 = {"Landroidx/compose/ui/unit/Constraints;", "", "value", "", "constructor-impl", "(J)J", "focusIndex", "", "getFocusIndex-impl", "(J)I", "hasBoundedHeight", "", "getHasBoundedHeight-impl", "(J)Z", "hasBoundedWidth", "getHasBoundedWidth-impl", "hasFixedHeight", "getHasFixedHeight$annotations", "()V", "getHasFixedHeight-impl", "hasFixedWidth", "getHasFixedWidth$annotations", "getHasFixedWidth-impl", "isZero", "isZero$annotations", "isZero-impl", "maxHeight", "getMaxHeight-impl", "maxWidth", "getMaxWidth-impl", "minHeight", "getMinHeight-impl", "minWidth", "getMinWidth-impl", "getValue$annotations", "copy", "copy-Zbe2FdA", "(JIIII)J", "equals", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "Companion", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@JvmInline
/* loaded from: classes.dex */
public final class Constraints {
    private static final long FocusMask = 3;
    public static final int Infinity = Integer.MAX_VALUE;
    private static final int MaxFocusBits = 18;
    private static final long MaxFocusHeight = 3;
    private static final long MaxFocusWidth = 1;
    private static final int MaxNonFocusBits = 13;
    private static final int MinFocusBits = 16;
    private static final long MinFocusHeight = 2;
    private static final int MinFocusMask = 65535;
    private static final long MinFocusWidth = 0;
    private static final int MinNonFocusBits = 15;
    private final long value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int[] MinHeightOffsets = {18, 20, 17, 15};
    private static final int MaxFocusMask = 262143;
    private static final int MinNonFocusMask = 32767;
    private static final int MaxNonFocusMask = 8191;
    private static final int[] WidthMask = {65535, MaxFocusMask, MinNonFocusMask, MaxNonFocusMask};
    private static final int[] HeightMask = {MinNonFocusMask, MaxNonFocusMask, 65535, MaxFocusMask};

    @Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\bH\u0002J8\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b$\u0010%J \u0010&\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(J \u0010)\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\bH\u0007ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b*\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006+"}, m5175d2 = {"Landroidx/compose/ui/unit/Constraints$Companion;", "", "()V", "FocusMask", "", "HeightMask", "", "Infinity", "", "MaxFocusBits", "MaxFocusHeight", "MaxFocusMask", "MaxFocusWidth", "MaxNonFocusBits", "MaxNonFocusMask", "MinFocusBits", "MinFocusHeight", "MinFocusMask", "MinFocusWidth", "MinHeightOffsets", "MinNonFocusBits", "MinNonFocusMask", "WidthMask", "bitsNeedForSize", "size", "createConstraints", "Landroidx/compose/ui/unit/Constraints;", "minWidth", "maxWidth", "minHeight", "maxHeight", "createConstraints-Zbe2FdA$ui_unit_release", "(IIII)J", "fixed", "width", "height", "fixed-JhjzzOo", "(II)J", "fixedHeight", "fixedHeight-OenEA2s", "(I)J", "fixedWidth", "fixedWidth-OenEA2s", "ui-unit_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final int bitsNeedForSize(int size) {
            if (size < Constraints.MaxNonFocusMask) {
                return 13;
            }
            if (size < Constraints.MinNonFocusMask) {
                return 15;
            }
            if (size < 65535) {
                return 16;
            }
            if (size < Constraints.MaxFocusMask) {
                return 18;
            }
            throw new IllegalArgumentException("Can't represent a size of " + size + " in Constraints");
        }

        /* renamed from: createConstraints-Zbe2FdA$ui_unit_release, reason: not valid java name */
        public final long m11500createConstraintsZbe2FdA$ui_unit_release(int minWidth, int maxWidth, int minHeight, int maxHeight) {
            long j4;
            int i4 = maxHeight == Integer.MAX_VALUE ? minHeight : maxHeight;
            int iBitsNeedForSize = bitsNeedForSize(i4);
            int i5 = maxWidth == Integer.MAX_VALUE ? minWidth : maxWidth;
            int iBitsNeedForSize2 = bitsNeedForSize(i5);
            if (iBitsNeedForSize + iBitsNeedForSize2 > 31) {
                throw new IllegalArgumentException("Can't represent a width of " + i5 + " and height of " + i4 + " in Constraints");
            }
            if (iBitsNeedForSize2 == 13) {
                j4 = 3;
            } else if (iBitsNeedForSize2 == 18) {
                j4 = 1;
            } else if (iBitsNeedForSize2 == 15) {
                j4 = 2;
            } else {
                if (iBitsNeedForSize2 != 16) {
                    throw new IllegalStateException("Should only have the provided constants.");
                }
                j4 = 0;
            }
            int i6 = maxWidth == Integer.MAX_VALUE ? 0 : maxWidth + 1;
            int i7 = maxHeight != Integer.MAX_VALUE ? maxHeight + 1 : 0;
            int i8 = Constraints.MinHeightOffsets[(int) j4];
            return Constraints.m11482constructorimpl((i6 << 33) | j4 | (minWidth << 2) | (minHeight << i8) | (i7 << (i8 + 31)));
        }

        @Stable
        /* renamed from: fixed-JhjzzOo, reason: not valid java name */
        public final long m11501fixedJhjzzOo(int width, int height) {
            if (width >= 0 && height >= 0) {
                return m11500createConstraintsZbe2FdA$ui_unit_release(width, width, height, height);
            }
            throw new IllegalArgumentException(("width(" + width + ") and height(" + height + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedHeight-OenEA2s, reason: not valid java name */
        public final long m11502fixedHeightOenEA2s(int height) {
            if (height >= 0) {
                return m11500createConstraintsZbe2FdA$ui_unit_release(0, Integer.MAX_VALUE, height, height);
            }
            throw new IllegalArgumentException(("height(" + height + ") must be >= 0").toString());
        }

        @Stable
        /* renamed from: fixedWidth-OenEA2s, reason: not valid java name */
        public final long m11503fixedWidthOenEA2s(int width) {
            if (width >= 0) {
                return m11500createConstraintsZbe2FdA$ui_unit_release(width, width, 0, Integer.MAX_VALUE);
            }
            throw new IllegalArgumentException(("width(" + width + ") must be >= 0").toString());
        }
    }

    private /* synthetic */ Constraints(long j4) {
        this.value = j4;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Constraints m11481boximpl(long j4) {
        return new Constraints(j4);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m11482constructorimpl(long j4) {
        return j4;
    }

    /* renamed from: copy-Zbe2FdA, reason: not valid java name */
    public static final long m11483copyZbe2FdA(long j4, int i4, int i5, int i6, int i7) {
        boolean z3 = true;
        if (!(i6 >= 0 && i4 >= 0)) {
            throw new IllegalArgumentException(("minHeight(" + i6 + ") and minWidth(" + i4 + ") must be >= 0").toString());
        }
        if (!(i5 >= i4 || i5 == Integer.MAX_VALUE)) {
            throw new IllegalArgumentException(("maxWidth(" + i5 + ") must be >= minWidth(" + i4 + ')').toString());
        }
        if (i7 < i6 && i7 != Integer.MAX_VALUE) {
            z3 = false;
        }
        if (z3) {
            return INSTANCE.m11500createConstraintsZbe2FdA$ui_unit_release(i4, i5, i6, i7);
        }
        throw new IllegalArgumentException(("maxHeight(" + i7 + ") must be >= minHeight(" + i6 + ')').toString());
    }

    /* renamed from: copy-Zbe2FdA$default, reason: not valid java name */
    public static /* synthetic */ long m11484copyZbe2FdA$default(long j4, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i4 = m11495getMinWidthimpl(j4);
        }
        int i9 = i4;
        if ((i8 & 2) != 0) {
            i5 = m11493getMaxWidthimpl(j4);
        }
        int i10 = i5;
        if ((i8 & 4) != 0) {
            i6 = m11494getMinHeightimpl(j4);
        }
        int i11 = i6;
        if ((i8 & 8) != 0) {
            i7 = m11492getMaxHeightimpl(j4);
        }
        return m11483copyZbe2FdA(j4, i9, i10, i11, i7);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11485equalsimpl(long j4, Object obj) {
        return (obj instanceof Constraints) && j4 == ((Constraints) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11486equalsimpl0(long j4, long j5) {
        return j4 == j5;
    }

    /* renamed from: getFocusIndex-impl, reason: not valid java name */
    private static final int m11487getFocusIndeximpl(long j4) {
        return (int) (j4 & 3);
    }

    /* renamed from: getHasBoundedHeight-impl, reason: not valid java name */
    public static final boolean m11488getHasBoundedHeightimpl(long j4) {
        int iM11487getFocusIndeximpl = m11487getFocusIndeximpl(j4);
        return (((int) (j4 >> (MinHeightOffsets[iM11487getFocusIndeximpl] + 31))) & HeightMask[iM11487getFocusIndeximpl]) != 0;
    }

    /* renamed from: getHasBoundedWidth-impl, reason: not valid java name */
    public static final boolean m11489getHasBoundedWidthimpl(long j4) {
        return (((int) (j4 >> 33)) & WidthMask[m11487getFocusIndeximpl(j4)]) != 0;
    }

    @Stable
    public static /* synthetic */ void getHasFixedHeight$annotations() {
    }

    /* renamed from: getHasFixedHeight-impl, reason: not valid java name */
    public static final boolean m11490getHasFixedHeightimpl(long j4) {
        return m11492getMaxHeightimpl(j4) == m11494getMinHeightimpl(j4);
    }

    @Stable
    public static /* synthetic */ void getHasFixedWidth$annotations() {
    }

    /* renamed from: getHasFixedWidth-impl, reason: not valid java name */
    public static final boolean m11491getHasFixedWidthimpl(long j4) {
        return m11493getMaxWidthimpl(j4) == m11495getMinWidthimpl(j4);
    }

    /* renamed from: getMaxHeight-impl, reason: not valid java name */
    public static final int m11492getMaxHeightimpl(long j4) {
        int iM11487getFocusIndeximpl = m11487getFocusIndeximpl(j4);
        int i4 = ((int) (j4 >> (MinHeightOffsets[iM11487getFocusIndeximpl] + 31))) & HeightMask[iM11487getFocusIndeximpl];
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    /* renamed from: getMaxWidth-impl, reason: not valid java name */
    public static final int m11493getMaxWidthimpl(long j4) {
        int i4 = ((int) (j4 >> 33)) & WidthMask[m11487getFocusIndeximpl(j4)];
        if (i4 == 0) {
            return Integer.MAX_VALUE;
        }
        return i4 - 1;
    }

    /* renamed from: getMinHeight-impl, reason: not valid java name */
    public static final int m11494getMinHeightimpl(long j4) {
        int iM11487getFocusIndeximpl = m11487getFocusIndeximpl(j4);
        return ((int) (j4 >> MinHeightOffsets[iM11487getFocusIndeximpl])) & HeightMask[iM11487getFocusIndeximpl];
    }

    /* renamed from: getMinWidth-impl, reason: not valid java name */
    public static final int m11495getMinWidthimpl(long j4) {
        return ((int) (j4 >> 2)) & WidthMask[m11487getFocusIndeximpl(j4)];
    }

    @PublishedApi
    public static /* synthetic */ void getValue$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11496hashCodeimpl(long j4) {
        return AbstractC0321a.m137a(j4);
    }

    @Stable
    public static /* synthetic */ void isZero$annotations() {
    }

    /* renamed from: isZero-impl, reason: not valid java name */
    public static final boolean m11497isZeroimpl(long j4) {
        return m11493getMaxWidthimpl(j4) == 0 || m11492getMaxHeightimpl(j4) == 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11498toStringimpl(long j4) {
        int iM11493getMaxWidthimpl = m11493getMaxWidthimpl(j4);
        String strValueOf = iM11493getMaxWidthimpl == Integer.MAX_VALUE ? "Infinity" : String.valueOf(iM11493getMaxWidthimpl);
        int iM11492getMaxHeightimpl = m11492getMaxHeightimpl(j4);
        return "Constraints(minWidth = " + m11495getMinWidthimpl(j4) + ", maxWidth = " + strValueOf + ", minHeight = " + m11494getMinHeightimpl(j4) + ", maxHeight = " + (iM11492getMaxHeightimpl != Integer.MAX_VALUE ? String.valueOf(iM11492getMaxHeightimpl) : "Infinity") + ')';
    }

    public boolean equals(Object obj) {
        return m11485equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11496hashCodeimpl(this.value);
    }

    public String toString() {
        return m11498toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
