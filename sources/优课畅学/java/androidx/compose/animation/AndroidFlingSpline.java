package androidx.compose.animation;

import androidx.compose.runtime.internal.StabilityInferred;
import p077d8.AbstractC8323h;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidFlingSpline {
    public static final int $stable;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final int NbSamples = 100;
    private static final float[] SplinePositions;
    private static final float[] SplineTimes;

    @StabilityInferred(parameters = 1)
    public static final class FlingResult {
        public static final int $stable = 0;
        private final float distanceCoefficient;
        private final float velocityCoefficient;

        public FlingResult(float f10, float f11) {
            this.distanceCoefficient = f10;
            this.velocityCoefficient = f11;
        }

        public static /* synthetic */ FlingResult copy$default(FlingResult flingResult, float f10, float f11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = flingResult.distanceCoefficient;
            }
            if ((i10 & 2) != 0) {
                f11 = flingResult.velocityCoefficient;
            }
            return flingResult.copy(f10, f11);
        }

        public final float component1() {
            return this.distanceCoefficient;
        }

        public final float component2() {
            return this.velocityCoefficient;
        }

        public final FlingResult copy(float f10, float f11) {
            return new FlingResult(f10, f11);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FlingResult)) {
                return false;
            }
            FlingResult flingResult = (FlingResult) obj;
            return Float.compare(this.distanceCoefficient, flingResult.distanceCoefficient) == 0 && Float.compare(this.velocityCoefficient, flingResult.velocityCoefficient) == 0;
        }

        public final float getDistanceCoefficient() {
            return this.distanceCoefficient;
        }

        public final float getVelocityCoefficient() {
            return this.velocityCoefficient;
        }

        public int hashCode() {
            return (Float.hashCode(this.distanceCoefficient) * 31) + Float.hashCode(this.velocityCoefficient);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.distanceCoefficient + ", velocityCoefficient=" + this.velocityCoefficient + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        SplinePositions = fArr;
        float[] fArr2 = new float[101];
        SplineTimes = fArr2;
        SplineBasedDecayKt.computeSplineInfo(fArr, fArr2, 100);
        $stable = 8;
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float f10, float f11) {
        return Math.log((Math.abs(f10) * 0.35f) / f11);
    }

    public final FlingResult flingPosition(float f10) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        float fM13517l = AbstractC8323h.m13517l(f10, 0.0f, 1.0f);
        float f13 = 100;
        int i10 = (int) (f13 * fM13517l);
        if (i10 < 100) {
            float f14 = i10 / f13;
            int i11 = i10 + 1;
            float f15 = i11 / f13;
            float[] fArr = SplinePositions;
            float f16 = fArr[i10];
            float f17 = (fArr[i11] - f16) / (f15 - f14);
            float f18 = ((fM13517l - f14) * f17) + f16;
            f11 = f17;
            f12 = f18;
        }
        return new FlingResult(f12, f11);
    }
}
