package androidx.compose.p013ui.node;

/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m25769boximpl(long j10) {
        return new DistanceAndFlags(j10);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m25770compareTo9YPOF3E(long j10, long j11) {
        boolean zM25777isInLayerimpl = m25777isInLayerimpl(j10);
        if (zM25777isInLayerimpl != m25777isInLayerimpl(j11)) {
            return zM25777isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m25774getDistanceimpl(j10), m25774getDistanceimpl(j11)) >= 0.0f && m25776isInExpandedBoundsimpl(j10) != m25776isInExpandedBoundsimpl(j11)) ? m25776isInExpandedBoundsimpl(j10) ? -1 : 1 : (int) Math.signum(m25774getDistanceimpl(j10) - m25774getDistanceimpl(j11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m25771constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m25772equalsimpl(long j10, Object obj) {
        return (obj instanceof DistanceAndFlags) && j10 == ((DistanceAndFlags) obj).m25779unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m25773equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m25774getDistanceimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m25775hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m25776isInExpandedBoundsimpl(long j10) {
        return (j10 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m25777isInLayerimpl(long j10) {
        return (j10 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m25778toStringimpl(long j10) {
        return "DistanceAndFlags(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m25772equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m25775hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m25778toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m25779unboximpl() {
        return this.packedValue;
    }
}
