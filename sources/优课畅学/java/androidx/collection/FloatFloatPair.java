package androidx.collection;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m20108boximpl(long j10) {
        return new FloatFloatPair(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m20109component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m20110component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20112constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m20113equalsimpl(long j10, Object obj) {
        return (obj instanceof FloatFloatPair) && j10 == ((FloatFloatPair) obj).m20119unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m20114equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m20115getFirstimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m20116getSecondimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m20117hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m20118toStringimpl(long j10) {
        return '(' + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m20113equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m20117hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m20118toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m20119unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m20111constructorimpl(float f10, float f11) {
        return m20112constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
