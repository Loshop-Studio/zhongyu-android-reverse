package androidx.compose.p012ui.util;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(m13412d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0001\u001a\u0011\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\r*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u0015\u0010\u0015\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0013*\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\r*\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0086\b\u001a\u001d\u0010\u0017\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000eH\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0013H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0019*\u00020\u0001H\u0086\b¨\u0006\u001a"}, m13413d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "normalizedAngleCos", "normalizedDegrees", "normalizedAngleSin", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "fastIsFinite", "", "ui-util_release"}, m13414k = 2, m13415mv = {1, 8, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nMathHelpers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,339:1\n69#1,6:341\n87#1,6:347\n105#1,6:353\n123#1,6:359\n306#1,4:366\n28#2:340\n22#2:365\n*S KotlinDebug\n*F\n+ 1 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n65#1:341,6\n83#1:347,6\n101#1:353,6\n119#1:359,6\n338#1:366,4\n31#1:340\n271#1:365\n*E\n"})
/* loaded from: classes2.dex */
public final class MathHelpersKt {
    public static final float fastCbrt(float f10) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f10) & 8589934591L) / 3)) + 709952852);
        float f11 = fIntBitsToFloat - ((fIntBitsToFloat - (f10 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f11 - ((f11 - (f10 / (f11 * f11))) * 0.33333334f);
    }

    public static final double fastCoerceAtLeast(double d10, double d11) {
        return d10 < d11 ? d11 : d10;
    }

    public static final double fastCoerceAtMost(double d10, double d11) {
        return d10 > d11 ? d11 : d10;
    }

    public static final double fastCoerceIn(double d10, double d11, double d12) {
        if (d10 < d11) {
            d10 = d11;
        }
        return d10 > d12 ? d12 : d10;
    }

    public static final boolean fastIsFinite(float f10) {
        return (Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final float fastMaxOf(float f10, float f11, float f12, float f13) {
        return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
    }

    public static final float fastMinOf(float f10, float f11, float f12, float f13) {
        return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
    }

    public static final float lerp(float f10, float f11, float f12) {
        return ((1 - f12) * f10) + (f12 * f11);
    }

    public static final float normalizedAngleCos(float f10) {
        float fFloor = (f10 + 0.25f) - ((float) Math.floor(0.5f + r3));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f11 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f11) / (1.25f - (fAbs * f11));
    }

    public static final float normalizedAngleSin(float f10) {
        float fFloor = f10 - ((float) Math.floor(0.5f + f10));
        float fAbs = Math.abs(fFloor) * 2.0f;
        float f11 = 1.0f - fAbs;
        return ((fFloor * 8.0f) * f11) / (1.25f - (fAbs * f11));
    }

    public static final float fastCoerceAtLeast(float f10, float f11) {
        return f10 < f11 ? f11 : f10;
    }

    public static final float fastCoerceAtMost(float f10, float f11) {
        return f10 > f11 ? f11 : f10;
    }

    public static final float fastCoerceIn(float f10, float f11, float f12) {
        if (f10 < f11) {
            f10 = f11;
        }
        return f10 > f12 ? f12 : f10;
    }

    public static final boolean fastIsFinite(double d10) {
        return (Double.doubleToRawLongBits(d10) & Long.MAX_VALUE) < 9218868437227405312L;
    }

    public static final long lerp(long j9, long j10, float f10) {
        return j9 + MathKt.roundToLong((j10 - j9) * f10);
    }

    public static final int fastCoerceAtLeast(int i9, int i10) {
        return i9 < i10 ? i10 : i9;
    }

    public static final int fastCoerceAtMost(int i9, int i10) {
        return i9 > i10 ? i10 : i9;
    }

    public static final int fastCoerceIn(int i9, int i10, int i11) {
        if (i9 < i10) {
            i9 = i10;
        }
        return i9 > i11 ? i11 : i9;
    }

    public static final int lerp(int i9, int i10, float f10) {
        return i9 + ((int) Math.round((i10 - i9) * f10));
    }

    public static final long fastCoerceAtLeast(long j9, long j10) {
        return j9 < j10 ? j10 : j9;
    }

    public static final long fastCoerceAtMost(long j9, long j10) {
        return j9 > j10 ? j10 : j9;
    }

    public static final long fastCoerceIn(long j9, long j10, long j11) {
        if (j9 < j10) {
            j9 = j10;
        }
        return j9 > j11 ? j11 : j9;
    }
}
