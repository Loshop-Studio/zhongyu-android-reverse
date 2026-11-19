package androidx.compose.foundation.layout;

/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j10) {
            this.packedValue = j10;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m27330boximpl(long j10) {
            return new FlingResult(j10);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m27331constructorimpl(long j10) {
            return j10;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m27332equalsimpl(long j10, Object obj) {
            return (obj instanceof FlingResult) && j10 == ((FlingResult) obj).m27338unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m27333equalsimpl0(long j10, long j11) {
            return j10 == j11;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m27334getDistanceCoefficientimpl(long j10) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m27335getVelocityCoefficientimpl(long j10) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m27336hashCodeimpl(long j10) {
            return Long.hashCode(j10);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m27337toStringimpl(long j10) {
            return "FlingResult(packedValue=" + j10 + ')';
        }

        public boolean equals(Object obj) {
            return m27332equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m27336hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m27337toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m27338unboximpl() {
            return this.packedValue;
        }
    }

    static {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20 = 0.0f;
        int i10 = 0;
        float f21 = 0.0f;
        while (true) {
            float f22 = 1.0f;
            if (i10 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f23 = i10 / 100;
            float f24 = 1.0f;
            while (true) {
                f10 = ((f24 - f20) / 2.0f) + f20;
                f11 = f22 - f10;
                f12 = f10 * 3.0f * f11;
                f13 = f10 * f10 * f10;
                float f25 = (((f11 * 0.175f) + (f10 * 0.35000002f)) * f12) + f13;
                f14 = f22;
                f15 = f23;
                if (Math.abs(f25 - f23) < 1.0E-5d) {
                    break;
                }
                if (f25 > f15) {
                    f24 = f10;
                } else {
                    f20 = f10;
                }
                f22 = f14;
                f23 = f15;
            }
            SplinePositions[i10] = (f12 * ((f11 * 0.5f) + f10)) + f13;
            float f26 = f14;
            while (true) {
                f16 = ((f26 - f21) / 2.0f) + f21;
                f17 = f14 - f16;
                f18 = f16 * 3.0f * f17;
                f19 = f16 * f16 * f16;
                float f27 = (((f17 * 0.5f) + f16) * f18) + f19;
                if (Math.abs(f27 - f15) >= 1.0E-5d) {
                    if (f27 > f15) {
                        f26 = f16;
                    } else {
                        f21 = f16;
                    }
                }
            }
            SplineTimes[i10] = (f18 * ((f17 * 0.175f) + (f16 * 0.35000002f))) + f19;
            i10++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m27329flingPositionLfoxSSI(float f10) {
        float f11;
        float f12;
        float f13 = 100;
        int i10 = (int) (f13 * f10);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = SplinePositions;
            float f16 = fArr[i10];
            f12 = (fArr[i11] - f16) / (f15 - f14);
            f11 = f16 + ((f10 - f14) * f12);
        } else {
            f11 = 1.0f;
            f12 = 0.0f;
        }
        return FlingResult.m27331constructorimpl((Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32));
    }
}
