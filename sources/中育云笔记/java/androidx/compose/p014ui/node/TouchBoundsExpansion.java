package androidx.compose.p014ui.node;

import androidx.compose.p014ui.internal.InlineClassHelperKt;
import androidx.compose.p014ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC9972n;

/* loaded from: classes2.dex */
public final class TouchBoundsExpansion {
    private static final long IS_LAYOUT_DIRECTION_AWARE = Long.MIN_VALUE;
    private static final int MASK = 32767;
    public static final int MAX_VALUE = 32767;
    private static final int SHIFT = 15;
    private final long packedValue;
    public static final Companion Companion = new Companion(null);
    private static final long None = TouchBoundsExpansionKt.TouchBoundsExpansion$default(0, 0, 0, 0, 14, null);

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: Absolute-vsh68fg$default, reason: not valid java name */
        public static /* synthetic */ long m32603Absolutevsh68fg$default(Companion companion, int i10, int i11, int i12, int i13, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i10 = 0;
            }
            if ((i14 & 2) != 0) {
                i11 = 0;
            }
            if ((i14 & 4) != 0) {
                i12 = 0;
            }
            if ((i14 & 8) != 0) {
                i13 = 0;
            }
            return companion.m32604Absolutevsh68fg(i10, i11, i12, i13);
        }

        private final long trimAndShift(int i10, int i11) {
            return (i10 & 32767) << (i11 * 15);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int unpack(long j10, int i10) {
            return ((int) (j10 >> (i10 * 15))) & 32767;
        }

        /* renamed from: Absolute-vsh68fg, reason: not valid java name */
        public final long m32604Absolutevsh68fg(int i10, int i11, int i12, int i13) {
            if (!(i10 >= 0 && i10 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
            }
            if (!(i11 >= 0 && i11 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
            }
            if (!(i12 >= 0 && i12 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
            }
            if (!(i13 >= 0 && i13 < 32768)) {
                InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
            }
            return TouchBoundsExpansion.m32592constructorimpl(pack$ui_release(i10, i11, i12, i13, false));
        }

        /* renamed from: getNone-RZrCHBk, reason: not valid java name */
        public final long m32605getNoneRZrCHBk() {
            return TouchBoundsExpansion.None;
        }

        public final long pack$ui_release(int i10, int i11, int i12, int i13, boolean z10) {
            return trimAndShift(i11, 1) | trimAndShift(i10, 0) | trimAndShift(i12, 2) | trimAndShift(i13, 3) | (z10 ? Long.MIN_VALUE : 0L);
        }

        private Companion() {
        }
    }

    private /* synthetic */ TouchBoundsExpansion(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TouchBoundsExpansion m32589boximpl(long j10) {
        return new TouchBoundsExpansion(j10);
    }

    /* renamed from: computeLeft-impl$ui_release, reason: not valid java name */
    public static final int m32590computeLeftimpl$ui_release(long j10, LayoutDirection layoutDirection) {
        return (!m32600isLayoutDirectionAwareimpl(j10) || layoutDirection == LayoutDirection.Ltr) ? m32597getStartimpl(j10) : m32596getEndimpl(j10);
    }

    /* renamed from: computeRight-impl$ui_release, reason: not valid java name */
    public static final int m32591computeRightimpl$ui_release(long j10, LayoutDirection layoutDirection) {
        return (!m32600isLayoutDirectionAwareimpl(j10) || layoutDirection == LayoutDirection.Ltr) ? m32596getEndimpl(j10) : m32597getStartimpl(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m32592constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32593equalsimpl(long j10, Object obj) {
        return (obj instanceof TouchBoundsExpansion) && j10 == ((TouchBoundsExpansion) obj).m32602unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32594equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getBottom-impl, reason: not valid java name */
    public static final int m32595getBottomimpl(long j10) {
        return Companion.unpack(j10, 3);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m32596getEndimpl(long j10) {
        return Companion.unpack(j10, 2);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m32597getStartimpl(long j10) {
        return Companion.unpack(j10, 0);
    }

    /* renamed from: getTop-impl, reason: not valid java name */
    public static final int m32598getTopimpl(long j10) {
        return Companion.unpack(j10, 1);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32599hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isLayoutDirectionAware-impl, reason: not valid java name */
    public static final boolean m32600isLayoutDirectionAwareimpl(long j10) {
        return (j10 & Long.MIN_VALUE) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32601toStringimpl(long j10) {
        return "TouchBoundsExpansion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m32593equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m32599hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32601toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32602unboximpl() {
        return this.packedValue;
    }
}
