package androidx.compose.p013ui.geometry;

import androidx.compose.p013ui.util.MathHelpersKt;

/* loaded from: classes2.dex */
public final class RoundRectKt {
    public static final RoundRect RoundRect(Rect rect, float f10, float f11) {
        return RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), f10, f11);
    }

    /* renamed from: RoundRect-ZAM2FJo, reason: not valid java name */
    public static final RoundRect m24087RoundRectZAM2FJo(Rect rect, long j10, long j11, long j12, long j13) {
        return new RoundRect(rect.getLeft(), rect.getTop(), rect.getRight(), rect.getBottom(), j10, j11, j12, j13, null);
    }

    /* renamed from: RoundRect-gG7oq9Y, reason: not valid java name */
    public static final RoundRect m24089RoundRectgG7oq9Y(float f10, float f11, float f12, float f13, long j10) {
        return RoundRect(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    /* renamed from: RoundRect-sniSvfs, reason: not valid java name */
    public static final RoundRect m24090RoundRectsniSvfs(Rect rect, long j10) {
        return RoundRect(rect, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final Rect getBoundingRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft(), roundRect.getTop(), roundRect.getRight(), roundRect.getBottom());
    }

    public static final long getCenter(RoundRect roundRect) {
        float left = roundRect.getLeft() + (roundRect.getWidth() / 2.0f);
        float top2 = roundRect.getTop() + (roundRect.getHeight() / 2.0f);
        return Offset.m24027constructorimpl((Float.floatToRawIntBits(top2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32));
    }

    public static final float getMaxDimension(RoundRect roundRect) {
        return Math.max(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final float getMinDimension(RoundRect roundRect) {
        return Math.min(Math.abs(roundRect.getWidth()), Math.abs(roundRect.getHeight()));
    }

    public static final Rect getSafeInnerRect(RoundRect roundRect) {
        return new Rect(roundRect.getLeft() + (Math.max(Float.intBitsToFloat((int) (roundRect.m24083getBottomLeftCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getTop() + (Math.max(Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m24086getTopRightCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f), roundRect.getRight() - (Math.max(Float.intBitsToFloat((int) (roundRect.m24086getTopRightCornerRadiuskKHJgLs() >> 32)), Float.intBitsToFloat((int) (roundRect.m24084getBottomRightCornerRadiuskKHJgLs() >> 32))) * 0.29289323f), roundRect.getBottom() - (Math.max(Float.intBitsToFloat((int) (roundRect.m24084getBottomRightCornerRadiuskKHJgLs() & 4294967295L)), Float.intBitsToFloat((int) (roundRect.m24083getBottomLeftCornerRadiuskKHJgLs() & 4294967295L))) * 0.29289323f));
    }

    public static final boolean isCircle(RoundRect roundRect) {
        return roundRect.getWidth() == roundRect.getHeight() && isEllipse(roundRect);
    }

    public static final boolean isEllipse(RoundRect roundRect) {
        return roundRect.m24085getTopLeftCornerRadiuskKHJgLs() == roundRect.m24086getTopRightCornerRadiuskKHJgLs() && roundRect.m24086getTopRightCornerRadiuskKHJgLs() == roundRect.m24084getBottomRightCornerRadiuskKHJgLs() && roundRect.m24084getBottomRightCornerRadiuskKHJgLs() == roundRect.m24083getBottomLeftCornerRadiuskKHJgLs() && ((double) roundRect.getWidth()) <= ((double) Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() >> 32))) * 2.0d && ((double) roundRect.getHeight()) <= ((double) Float.intBitsToFloat((int) (roundRect.m24085getTopLeftCornerRadiuskKHJgLs() & 4294967295L))) * 2.0d;
    }

    public static final boolean isEmpty(RoundRect roundRect) {
        return roundRect.getLeft() >= roundRect.getRight() || roundRect.getTop() >= roundRect.getBottom();
    }

    public static final boolean isFinite(RoundRect roundRect) {
        return (Float.floatToRawIntBits(roundRect.getLeft()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getTop()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getRight()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(roundRect.getBottom()) & Integer.MAX_VALUE) < 2139095040;
    }

    public static final boolean isRect(RoundRect roundRect) {
        long jM24085getTopLeftCornerRadiuskKHJgLs = roundRect.m24085getTopLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM24085getTopLeftCornerRadiuskKHJgLs) & (jM24085getTopLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM24086getTopRightCornerRadiuskKHJgLs = roundRect.m24086getTopRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM24086getTopRightCornerRadiuskKHJgLs) & (jM24086getTopRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM24083getBottomLeftCornerRadiuskKHJgLs = roundRect.m24083getBottomLeftCornerRadiuskKHJgLs() & 9223372034707292159L;
        if (((~jM24083getBottomLeftCornerRadiuskKHJgLs) & (jM24083getBottomLeftCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32) & (-9223372034707292160L)) == 0) {
            return false;
        }
        long jM24084getBottomRightCornerRadiuskKHJgLs = roundRect.m24084getBottomRightCornerRadiuskKHJgLs() & 9223372034707292159L;
        return (((~jM24084getBottomRightCornerRadiuskKHJgLs) & (jM24084getBottomRightCornerRadiuskKHJgLs - InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) != 0;
    }

    public static final boolean isSimple(RoundRect roundRect) {
        long jM24085getTopLeftCornerRadiuskKHJgLs = roundRect.m24085getTopLeftCornerRadiuskKHJgLs();
        return (jM24085getTopLeftCornerRadiuskKHJgLs >>> 32) == (jM24085getTopLeftCornerRadiuskKHJgLs & 4294967295L) && roundRect.m24085getTopLeftCornerRadiuskKHJgLs() == roundRect.m24086getTopRightCornerRadiuskKHJgLs() && roundRect.m24085getTopLeftCornerRadiuskKHJgLs() == roundRect.m24084getBottomRightCornerRadiuskKHJgLs() && roundRect.m24085getTopLeftCornerRadiuskKHJgLs() == roundRect.m24083getBottomLeftCornerRadiuskKHJgLs();
    }

    public static final RoundRect lerp(RoundRect roundRect, RoundRect roundRect2, float f10) {
        return new RoundRect(MathHelpersKt.lerp(roundRect.getLeft(), roundRect2.getLeft(), f10), MathHelpersKt.lerp(roundRect.getTop(), roundRect2.getTop(), f10), MathHelpersKt.lerp(roundRect.getRight(), roundRect2.getRight(), f10), MathHelpersKt.lerp(roundRect.getBottom(), roundRect2.getBottom(), f10), CornerRadiusKt.m24008lerp3Ry4LBc(roundRect.m24085getTopLeftCornerRadiuskKHJgLs(), roundRect2.m24085getTopLeftCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m24008lerp3Ry4LBc(roundRect.m24086getTopRightCornerRadiuskKHJgLs(), roundRect2.m24086getTopRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m24008lerp3Ry4LBc(roundRect.m24084getBottomRightCornerRadiuskKHJgLs(), roundRect2.m24084getBottomRightCornerRadiuskKHJgLs(), f10), CornerRadiusKt.m24008lerp3Ry4LBc(roundRect.m24083getBottomLeftCornerRadiuskKHJgLs(), roundRect2.m24083getBottomLeftCornerRadiuskKHJgLs(), f10), null);
    }

    /* renamed from: translate-Uv8p0NA, reason: not valid java name */
    public static final RoundRect m24091translateUv8p0NA(RoundRect roundRect, long j10) {
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (4294967295L & j10);
        return new RoundRect(roundRect.getLeft() + Float.intBitsToFloat(i10), roundRect.getTop() + Float.intBitsToFloat(i11), roundRect.getRight() + Float.intBitsToFloat(i10), Float.intBitsToFloat(i11) + roundRect.getBottom(), roundRect.m24085getTopLeftCornerRadiuskKHJgLs(), roundRect.m24086getTopRightCornerRadiuskKHJgLs(), roundRect.m24084getBottomRightCornerRadiuskKHJgLs(), roundRect.m24083getBottomLeftCornerRadiuskKHJgLs(), null);
    }

    public static final RoundRect RoundRect(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jM23989constructorimpl = CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        return new RoundRect(f10, f11, f12, f13, jM23989constructorimpl, jM23989constructorimpl, jM23989constructorimpl, jM23989constructorimpl, null);
    }
}
