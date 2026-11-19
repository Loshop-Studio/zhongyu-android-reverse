package androidx.collection;

/* loaded from: classes.dex */
public final class FloatFloatPair {
    public final long packedValue;

    private /* synthetic */ FloatFloatPair(long j10) {
        this.packedValue = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FloatFloatPair m26710boximpl(long j10) {
        return new FloatFloatPair(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m26711component1impl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m26712component2impl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26714constructorimpl(long j10) {
        return j10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m26715equalsimpl(long j10, Object obj) {
        return (obj instanceof FloatFloatPair) && j10 == ((FloatFloatPair) obj).m26721unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m26716equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final float m26717getFirstimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final float m26718getSecondimpl(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m26719hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m26720toStringimpl(long j10) {
        return '(' + Float.intBitsToFloat((int) (j10 >> 32)) + ", " + Float.intBitsToFloat((int) (j10 & 4294967295L)) + ')';
    }

    public boolean equals(Object obj) {
        return m26715equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m26719hashCodeimpl(this.packedValue);
    }

    public String toString() {
        return m26720toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m26721unboximpl() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m26713constructorimpl(float f10, float f11) {
        return m26714constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }
}
