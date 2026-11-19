package androidx.compose.p014ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9972n;

@Immutable
/* loaded from: classes2.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9972n abstractC9972n) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m32971getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m32954boximpl(long j10) {
        return new TextRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m32955constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m32956contains5zctL8(long j10, long j11) {
        return (m32964getMinimpl(j10) <= m32964getMinimpl(j11)) & (m32963getMaximpl(j11) <= m32963getMaximpl(j10));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m32957containsimpl(long j10, int i10) {
        return i10 < m32963getMaximpl(j10) && m32964getMinimpl(j10) <= i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32958equalsimpl(long j10, Object obj) {
        return (obj instanceof TextRange) && j10 == ((TextRange) obj).m32970unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32959equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m32960getCollapsedimpl(long j10) {
        return m32966getStartimpl(j10) == m32961getEndimpl(j10);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m32961getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m32962getLengthimpl(long j10) {
        return m32963getMaximpl(j10) - m32964getMinimpl(j10);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m32963getMaximpl(long j10) {
        return Math.max(m32966getStartimpl(j10), m32961getEndimpl(j10));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m32964getMinimpl(long j10) {
        return Math.min(m32966getStartimpl(j10), m32961getEndimpl(j10));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m32965getReversedimpl(long j10) {
        return m32966getStartimpl(j10) > m32961getEndimpl(j10);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m32966getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32967hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m32968intersects5zctL8(long j10, long j11) {
        return (m32964getMinimpl(j10) < m32963getMaximpl(j11)) & (m32964getMinimpl(j11) < m32963getMaximpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32969toStringimpl(long j10) {
        return "TextRange(" + m32966getStartimpl(j10) + ", " + m32961getEndimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m32958equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m32967hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32969toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32970unboximpl() {
        return this.packedValue;
    }
}
