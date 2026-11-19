package androidx.compose.animation.core;

import androidx.compose.p013ui.graphics.BezierKt;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a */
    private final float f1144a;

    /* renamed from: b */
    private final float f1145b;

    /* renamed from: c */
    private final float f1146c;

    /* renamed from: d */
    private final float f1147d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f10, float f11, float f12, float f13) {
        this.f1144a = f10;
        this.f1145b = f11;
        this.f1146c = f12;
        this.f1147d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f1144a + ", " + this.f1145b + ", " + this.f1146c + ", " + this.f1147d + ") has no solution at " + f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.f1144a == cubicBezierEasing.f1144a && this.f1145b == cubicBezierEasing.f1145b && this.f1146c == cubicBezierEasing.f1146c && this.f1147d == cubicBezierEasing.f1147d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1144a) * 31) + Float.hashCode(this.f1145b)) * 31) + Float.hashCode(this.f1146c)) * 31) + Float.hashCode(this.f1147d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f1144a + ", b=" + this.f1145b + ", c=" + this.f1146c + ", d=" + this.f1147d + ')';
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fMax = Math.max(f10, 1.1920929E-7f);
            float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - fMax, this.f1144a - fMax, this.f1146c - fMax, 1.0f - fMax);
            if (Float.isNaN(fFindFirstCubicRoot)) {
                throwNoSolution(f10);
            }
            f10 = BezierKt.evaluateCubic(this.f1145b, this.f1147d, fFindFirstCubicRoot);
            float f11 = this.min;
            float f12 = this.max;
            if (f10 < f11) {
                f10 = f11;
            }
            if (f10 > f12) {
                return f12;
            }
        }
        return f10;
    }
}
