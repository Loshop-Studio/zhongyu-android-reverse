package androidx.compose.p011ui.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import p169t6.AbstractC6600a;

@Metadata(m5109d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0001\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0013H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0086\b¨\u0006\u001a"}, m5110d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "normalizedAngleCos", "normalizedDegrees", "normalizedAngleSin", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "fastIsFinite", "", "ui-util_release"}, m5111k = 2, m5112mv = {1, 8, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,339:1\n69#1,6:341\n87#1,6:347\n105#1,6:353\n123#1,6:359\n306#1,4:366\n28#2:340\n22#2:365\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n65#1:341,6\n83#1:347,6\n101#1:353,6\n119#1:359,6\n338#1:366,4\n31#1:340\n271#1:365\n*E\n"})
/* loaded from: classes2.dex */
public final class MathHelpersKt {
    public static final float fastCbrt(float f) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f7 = fIntBitsToFloat - ((fIntBitsToFloat - (f / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f7 - ((f7 - (f / (f7 * f7))) * 0.33333334f);
    }

    public static final double fastCoerceAtLeast(double d9, double d10) {
        return d9 < d10 ? d10 : d9;
    }

    public static final double fastCoerceAtMost(double d9, double d10) {
        return d9 > d10 ? d10 : d9;
    }

    public static final double fastCoerceIn(double d9, double d10, double d11) {
        if (d9 < d10) {
            d9 = d10;
        }
        return d9 > d11 ? d11 : d9;
    }

    public static final boolean fastIsFinite(float f) {
        return (Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final float fastMaxOf(float f, float f7, float f8, float f9) {
        return Math.max(f, Math.max(f7, Math.max(f8, f9)));
    }

    public static final float fastMinOf(float f, float f7, float f8, float f9) {
        return Math.min(f, Math.min(f7, Math.min(f8, f9)));
    }

    public static final float lerp(float f, float f7, float f8) {
        return (f8 * f7) + ((1 - f8) * f);
    }

    public static final float normalizedAngleCos(float f) {
        float fFloor = (f + 0.25f) - ((float) Math.floor(0.5f + r3));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f7 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f7) / (1.25f - (fAbs * f7));
    }

    public static final float normalizedAngleSin(float f) {
        float fFloor = f - ((float) Math.floor(0.5f + f));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f7 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f7) / (1.25f - (fAbs * f7));
    }

    public static final float fastCoerceAtLeast(float f, float f7) {
        return f < f7 ? f7 : f;
    }

    public static final float fastCoerceAtMost(float f, float f7) {
        return f > f7 ? f7 : f;
    }

    public static final float fastCoerceIn(float f, float f7, float f8) {
        if (f < f7) {
            f = f7;
        }
        return f > f8 ? f8 : f;
    }

    public static final boolean fastIsFinite(double d9) {
        return (Double.doubleToRawLongBits(d9) & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static final long lerp(long j7, long j8, float f) {
        return AbstractC6600a.m6242r((j8 - j7) * f) + j7;
    }

    public static final int fastCoerceAtLeast(int i, int i8) {
        return i < i8 ? i8 : i;
    }

    public static final int fastCoerceAtMost(int i, int i8) {
        return i > i8 ? i8 : i;
    }

    public static final int fastCoerceIn(int i, int i8, int i9) {
        if (i < i8) {
            i = i8;
        }
        return i > i9 ? i9 : i;
    }

    public static final int lerp(int i, int i8, float f) {
        return i + ((int) Math.round((i8 - i) * f));
    }

    public static final long fastCoerceAtLeast(long j7, long j8) {
        return j7 < j8 ? j8 : j7;
    }

    public static final long fastCoerceAtMost(long j7, long j8) {
        return j7 > j8 ? j8 : j7;
    }

    public static final long fastCoerceIn(long j7, long j8, long j9) {
        if (j7 < j8) {
            j7 = j8;
        }
        return j7 > j9 ? j9 : j7;
    }
}
