package androidx.compose.p014ui.node;

/* loaded from: classes2.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    private /* synthetic */ DistanceAndFlags(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DistanceAndFlags m32371boximpl(long j10) {
        return new DistanceAndFlags(j10);
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m32372compareTo9YPOF3E(long j10, long j11) {
        boolean zM32379isInLayerimpl = m32379isInLayerimpl(j10);
        if (zM32379isInLayerimpl != m32379isInLayerimpl(j11)) {
            return zM32379isInLayerimpl ? -1 : 1;
        }
        return (Math.min(m32376getDistanceimpl(j10), m32376getDistanceimpl(j11)) >= 0.0f && m32378isInExpandedBoundsimpl(j10) != m32378isInExpandedBoundsimpl(j11)) ? m32378isInExpandedBoundsimpl(j10) ? -1 : 1 : (int) Math.signum(m32376getDistanceimpl(j10) - m32376getDistanceimpl(j11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m32373constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m32374equalsimpl(long j10, Object obj) {
        return (obj instanceof DistanceAndFlags) && j10 == ((DistanceAndFlags) obj).m32381unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m32375equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m32376getDistanceimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m32377hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m32378isInExpandedBoundsimpl(long j10) {
        return (j10 & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m32379isInLayerimpl(long j10) {
        return (j10 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m32380toStringimpl(long j10) {
        return "DistanceAndFlags(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m32374equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m32377hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m32380toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m32381unboximpl() {
        return this.packedValue;
    }
}
