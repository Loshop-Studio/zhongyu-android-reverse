package androidx.compose.p013ui.text;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class TextRange {
    public static final Companion Companion = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m26369getZerod9O1mEE() {
            return TextRange.Zero;
        }

        private Companion() {
        }
    }

    private /* synthetic */ TextRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m26352boximpl(long j10) {
        return new TextRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26353constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m26354contains5zctL8(long j10, long j11) {
        return (m26362getMinimpl(j10) <= m26362getMinimpl(j11)) & (m26361getMaximpl(j11) <= m26361getMaximpl(j10));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m26355containsimpl(long j10, int i10) {
        return i10 < m26361getMaximpl(j10) && m26362getMinimpl(j10) <= i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26356equalsimpl(long j10, Object obj) {
        return (obj instanceof TextRange) && j10 == ((TextRange) obj).m26368unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26357equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m26358getCollapsedimpl(long j10) {
        return m26364getStartimpl(j10) == m26359getEndimpl(j10);
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m26359getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m26360getLengthimpl(long j10) {
        return m26361getMaximpl(j10) - m26362getMinimpl(j10);
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m26361getMaximpl(long j10) {
        return Math.max(m26364getStartimpl(j10), m26359getEndimpl(j10));
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m26362getMinimpl(long j10) {
        return Math.min(m26364getStartimpl(j10), m26359getEndimpl(j10));
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m26363getReversedimpl(long j10) {
        return m26364getStartimpl(j10) > m26359getEndimpl(j10);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m26364getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26365hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m26366intersects5zctL8(long j10, long j11) {
        return (m26362getMinimpl(j10) < m26361getMaximpl(j11)) & (m26362getMinimpl(j11) < m26361getMaximpl(j10));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26367toStringimpl(long j10) {
        return "TextRange(" + m26364getStartimpl(j10) + ", " + m26359getEndimpl(j10) + ')';
    }

    public boolean equals(Object obj) {
        return m26356equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26365hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m26367toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26368unboximpl() {
        return this.packedValue;
    }
}
