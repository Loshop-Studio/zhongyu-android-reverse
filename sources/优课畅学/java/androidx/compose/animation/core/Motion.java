package androidx.compose.animation.core;

/* loaded from: classes.dex */
public final class Motion {
    private final long packedValue;

    private /* synthetic */ Motion(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Motion m20264boximpl(long j10) {
        return new Motion(j10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20265constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20266equalsimpl(long j10, Object obj) {
        return (obj instanceof Motion) && j10 == ((Motion) obj).m20272unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20267equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    public static final float m20268getValueimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getVelocity-impl, reason: not valid java name */
    public static final float m20269getVelocityimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20270hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20271toStringimpl(long j10) {
        return "Motion(packedValue=" + j10 + ')';
    }

    public boolean equals(Object obj) {
        return m20266equalsimpl(this.packedValue, obj);
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    public int hashCode() {
        return m20270hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20271toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20272unboximpl() {
        return this.packedValue;
    }
}
