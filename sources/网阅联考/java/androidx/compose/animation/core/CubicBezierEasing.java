package androidx.compose.animation.core;

import androidx.compose.runtime.Immutable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.umeng.analytics.pro.C3335ai;
import kotlin.Metadata;

@Immutable
@Metadata(m5174d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J \u0010\f\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m5175d2 = {"Landroidx/compose/animation/core/CubicBezierEasing;", "Landroidx/compose/animation/core/Easing;", C3335ai.f1705at, "", "b", C3335ai.f1663aD, "d", "(FFFF)V", "equals", "", "other", "", "evaluateCubic", "m", "hashCode", "", "transform", "fraction", "animation-core_release"}, m5176k = 1, m5177mv = {1, 8, 0}, m5179xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class CubicBezierEasing implements Easing {
    public static final int $stable = 0;
    private final float a;
    private final float b;
    private final float c;
    private final float d;

    public CubicBezierEasing(float f4, float f5, float f6, float f7) {
        this.a = f4;
        this.b = f5;
        this.c = f6;
        this.d = f7;
        if ((Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) ? false : true) {
            return;
        }
        throw new IllegalArgumentException(("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f4 + ", " + f5 + ", " + f6 + ", " + f7 + '.').toString());
    }

    private final float evaluateCubic(float a4, float b4, float m4) {
        float f4 = 3;
        float f5 = 1 - m4;
        return (a4 * f4 * f5 * f5 * m4) + (f4 * b4 * f5 * m4 * m4) + (m4 * m4 * m4);
    }

    public boolean equals(Object other) {
        if (!(other instanceof CubicBezierEasing)) {
            return false;
        }
        CubicBezierEasing cubicBezierEasing = (CubicBezierEasing) other;
        if (!(this.a == cubicBezierEasing.a)) {
            return false;
        }
        if (!(this.b == cubicBezierEasing.b)) {
            return false;
        }
        if (this.c == cubicBezierEasing.c) {
            return (this.d > cubicBezierEasing.d ? 1 : (this.d == cubicBezierEasing.d ? 0 : -1)) == 0;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    @Override // androidx.compose.animation.core.Easing
    public float transform(float fraction) {
        float f4 = 0.0f;
        if (fraction > 0.0f) {
            float f5 = 1.0f;
            if (fraction < 1.0f) {
                while (true) {
                    float f6 = (f4 + f5) / 2;
                    float fEvaluateCubic = evaluateCubic(this.a, this.c, f6);
                    if (Math.abs(fraction - fEvaluateCubic) < 0.001f) {
                        return evaluateCubic(this.b, this.d, f6);
                    }
                    if (fEvaluateCubic < fraction) {
                        f4 = f6;
                    } else {
                        f5 = f6;
                    }
                }
            }
        }
        return fraction;
    }
}
