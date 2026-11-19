package androidx.compose.p013ui.util;

import p322z7.AbstractC10729c;

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

    public static final long lerp(long j10, long j11, float f10) {
        return j10 + AbstractC10729c.m20036e((j11 - j10) * f10);
    }

    public static final int fastCoerceAtLeast(int i10, int i11) {
        return i10 < i11 ? i11 : i10;
    }

    public static final int fastCoerceAtMost(int i10, int i11) {
        return i10 > i11 ? i11 : i10;
    }

    public static final int fastCoerceIn(int i10, int i11, int i12) {
        if (i10 < i11) {
            i10 = i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    public static final int lerp(int i10, int i11, float f10) {
        return i10 + ((int) Math.round((i11 - i10) * f10));
    }

    public static final long fastCoerceAtLeast(long j10, long j11) {
        return j10 < j11 ? j11 : j10;
    }

    public static final long fastCoerceAtMost(long j10, long j11) {
        return j10 > j11 ? j11 : j10;
    }

    public static final long fastCoerceIn(long j10, long j11, long j12) {
        if (j10 < j11) {
            j10 = j11;
        }
        return j10 > j12 ? j12 : j10;
    }
}
