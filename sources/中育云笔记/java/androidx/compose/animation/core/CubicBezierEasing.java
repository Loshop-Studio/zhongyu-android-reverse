package androidx.compose.animation.core;

import androidx.compose.p014ui.graphics.BezierKt;
import androidx.compose.runtime.Immutable;

@Immutable
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;

    /* renamed from: a */
    private final float f1074a;

    /* renamed from: b */
    private final float f1075b;

    /* renamed from: c */
    private final float f1076c;

    /* renamed from: d */
    private final float f1077d;
    private final float max;
    private final float min;

    public CubicBezierEasing(float f10, float f11, float f12, float f13) {
        this.f1074a = f10;
        this.f1075b = f11;
        this.f1076c = f12;
        this.f1077d = f13;
        if (!((Float.isNaN(f10) || Float.isNaN(f11) || Float.isNaN(f12) || Float.isNaN(f13)) ? false : true)) {
            PreconditionsKt.throwIllegalArgumentException("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f10 + ", " + f11 + ", " + f12 + ", " + f13 + '.');
        }
        long jComputeCubicVerticalBounds = BezierKt.computeCubicVerticalBounds(0.0f, f11, f13, 1.0f, new float[5], 0);
        this.min = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds >> 32));
        this.max = Float.intBitsToFloat((int) (jComputeCubicVerticalBounds & 4294967295L));
    }

    private final void throwNoSolution(float f10) {
        throw new IllegalArgumentException("The cubic curve with parameters (" + this.f1074a + ", " + this.f1075b + ", " + this.f1076c + ", " + this.f1077d + ") has no solution at " + f10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) obj;
        return this.f1074a == cubicBezierEasing.f1074a && this.f1075b == cubicBezierEasing.f1075b && this.f1076c == cubicBezierEasing.f1076c && this.f1077d == cubicBezierEasing.f1077d;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f1074a) * 31) + Float.hashCode(this.f1075b)) * 31) + Float.hashCode(this.f1076c)) * 31) + Float.hashCode(this.f1077d);
    }

    public String toString() {
        return "CubicBezierEasing(a=" + this.f1074a + ", b=" + this.f1075b + ", c=" + this.f1076c + ", d=" + this.f1077d + ')';
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float f10) {
        if (f10 > 0.0f && f10 < 1.0f) {
            float fMax = Math.max(f10, 1.1920929E-7f);
            float fFindFirstCubicRoot = BezierKt.findFirstCubicRoot(0.0f - fMax, this.f1074a - fMax, this.f1076c - fMax, 1.0f - fMax);
            if (Float.isNaN(fFindFirstCubicRoot)) {
                throwNoSolution(f10);
            }
            f10 = BezierKt.evaluateCubic(this.f1075b, this.f1077d, fFindFirstCubicRoot);
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
