package androidx.compose.foundation.lazy.staggeredgrid;

/* loaded from: classes.dex */
public final class SpanRange {
    private final long packedValue;

    private /* synthetic */ SpanRange(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ SpanRange m27687boximpl(long j10) {
        return new SpanRange(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m27689constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m27690equalsimpl(long j10, Object obj) {
        return (obj instanceof SpanRange) && j10 == ((SpanRange) obj).m27697unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m27691equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m27692getEndimpl(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m27693getSizeimpl(long j10) {
        return ((int) (4294967295L & j10)) - ((int) (j10 >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m27694getStartimpl(long j10) {
        return (int) (j10 >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m27695hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m27696toStringimpl(long j10) {
        return "SpanRange(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m27690equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m27695hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m27696toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m27697unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m27688constructorimpl(int i10, int i11) {
        return m27689constructorimpl(((i11 + i10) & 4294967295L) | (i10 << 32));
    }
}
