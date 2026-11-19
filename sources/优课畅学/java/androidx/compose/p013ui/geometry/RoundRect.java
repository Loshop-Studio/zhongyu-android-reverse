package androidx.compose.p013ui.geometry;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC9126n;

@Immutable
/* loaded from: classes2.dex */
public final class RoundRect {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static final RoundRect Zero = RoundRectKt.m24089RoundRectgG7oq9Y(0.0f, 0.0f, 0.0f, 0.0f, CornerRadius.Companion.m24007getZerokKHJgLs());
    private RoundRect _scaledRadiiRect;
    private final float bottom;
    private final long bottomLeftCornerRadius;
    private final long bottomRightCornerRadius;
    private final float left;
    private final float right;

    /* renamed from: top, reason: collision with root package name */
    private final float f21448top;
    private final long topLeftCornerRadius;
    private final long topRightCornerRadius;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public static /* synthetic */ void getZero$annotations() {
        }

        public final RoundRect getZero() {
            return RoundRect.Zero;
        }

        private Companion() {
        }
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, j10, j11, j12, j13);
    }

    /* renamed from: copy-MDFrsts$default, reason: not valid java name */
    public static /* synthetic */ RoundRect m24076copyMDFrsts$default(RoundRect roundRect, float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = roundRect.left;
        }
        if ((i10 & 2) != 0) {
            f11 = roundRect.f21448top;
        }
        if ((i10 & 4) != 0) {
            f12 = roundRect.right;
        }
        if ((i10 & 8) != 0) {
            f13 = roundRect.bottom;
        }
        if ((i10 & 16) != 0) {
            j10 = roundRect.topLeftCornerRadius;
        }
        if ((i10 & 32) != 0) {
            j11 = roundRect.topRightCornerRadius;
        }
        if ((i10 & 64) != 0) {
            j12 = roundRect.bottomRightCornerRadius;
        }
        if ((i10 & 128) != 0) {
            j13 = roundRect.bottomLeftCornerRadius;
        }
        long j14 = j13;
        long j15 = j12;
        long j16 = j11;
        long j17 = j10;
        return roundRect.m24082copyMDFrsts(f10, f11, f12, f13, j17, j16, j15, j14);
    }

    public static final RoundRect getZero() {
        return Companion.getZero();
    }

    private final float minRadius(float f10, float f11, float f12, float f13) {
        float f14 = f11 + f12;
        return (f14 <= f13 || f14 == 0.0f) ? f10 : Math.min(f10, f13 / f14);
    }

    private final RoundRect scaledRadiiRect() {
        RoundRect roundRect = this._scaledRadiiRect;
        if (roundRect != null) {
            return roundRect;
        }
        float fMinRadius = minRadius(minRadius(minRadius(minRadius(1.0f, Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)), Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)), getWidth()), Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)), Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)), getHeight()), Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)), Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)), getWidth());
        float f10 = this.left * fMinRadius;
        float f11 = this.f21448top * fMinRadius;
        float f12 = this.right * fMinRadius;
        float f13 = this.bottom * fMinRadius;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (this.topLeftCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.topLeftCornerRadius & 4294967295L)) * fMinRadius;
        long jM23989constructorimpl = CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (this.topRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (this.topRightCornerRadius & 4294967295L)) * fMinRadius;
        long jM23989constructorimpl2 = CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat3) << 32));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (this.bottomRightCornerRadius & 4294967295L)) * fMinRadius;
        long jM23989constructorimpl3 = CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat6) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat5) << 32));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius >> 32)) * fMinRadius;
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (this.bottomLeftCornerRadius & 4294967295L)) * fMinRadius;
        RoundRect roundRect2 = new RoundRect(f10, f11, f12, f13, jM23989constructorimpl, jM23989constructorimpl2, jM23989constructorimpl3, CornerRadius.m23989constructorimpl((Float.floatToRawIntBits(fIntBitsToFloat7) << 32) | (Float.floatToRawIntBits(fIntBitsToFloat8) & 4294967295L)), null);
        this._scaledRadiiRect = roundRect2;
        return roundRect2;
    }

    public final float component1() {
        return this.left;
    }

    public final float component2() {
        return this.f21448top;
    }

    public final float component3() {
        return this.right;
    }

    public final float component4() {
        return this.bottom;
    }

    /* renamed from: component5-kKHJgLs, reason: not valid java name */
    public final long m24077component5kKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: component6-kKHJgLs, reason: not valid java name */
    public final long m24078component6kKHJgLs() {
        return this.topRightCornerRadius;
    }

    /* renamed from: component7-kKHJgLs, reason: not valid java name */
    public final long m24079component7kKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    /* renamed from: component8-kKHJgLs, reason: not valid java name */
    public final long m24080component8kKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m24081containsk4lQ0M(long j10) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        float fIntBitsToFloat3;
        float fIntBitsToFloat4;
        int i10 = (int) (j10 >> 32);
        if (Float.intBitsToFloat(i10) >= this.left && Float.intBitsToFloat(i10) < this.right) {
            int i11 = (int) (j10 & 4294967295L);
            if (Float.intBitsToFloat(i11) >= this.f21448top && Float.intBitsToFloat(i11) < this.bottom) {
                RoundRect roundRectScaledRadiiRect = scaledRadiiRect();
                if (Float.intBitsToFloat(i10) < this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32)) && Float.intBitsToFloat(i11) < this.f21448top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f21448top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topLeftCornerRadius));
                } else if (Float.intBitsToFloat(i10) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32)) && Float.intBitsToFloat(i11) < this.f21448top + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.f21448top) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.topRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.topRightCornerRadius));
                } else if (Float.intBitsToFloat(i10) > this.right - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32)) && Float.intBitsToFloat(i11) > this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L))) {
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.right) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomRightCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomRightCornerRadius));
                } else {
                    if (Float.intBitsToFloat(i10) >= this.left + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32)) || Float.intBitsToFloat(i11) <= this.bottom - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L))) {
                        return true;
                    }
                    fIntBitsToFloat = (Float.intBitsToFloat(i10) - this.left) - Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat2 = (Float.intBitsToFloat(i11) - this.bottom) + Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius & 4294967295L));
                    fIntBitsToFloat3 = Float.intBitsToFloat((int) (roundRectScaledRadiiRect.bottomLeftCornerRadius >> 32));
                    fIntBitsToFloat4 = Float.intBitsToFloat((int) (4294967295L & roundRectScaledRadiiRect.bottomLeftCornerRadius));
                }
                float f10 = fIntBitsToFloat / fIntBitsToFloat3;
                float f11 = fIntBitsToFloat2 / fIntBitsToFloat4;
                return (f10 * f10) + (f11 * f11) <= 1.0f;
            }
        }
        return false;
    }

    /* renamed from: copy-MDFrsts, reason: not valid java name */
    public final RoundRect m24082copyMDFrsts(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        return new RoundRect(f10, f11, f12, f13, j10, j11, j12, j13, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoundRect)) {
            return false;
        }
        RoundRect roundRect = (RoundRect) obj;
        return Float.compare(this.left, roundRect.left) == 0 && Float.compare(this.f21448top, roundRect.f21448top) == 0 && Float.compare(this.right, roundRect.right) == 0 && Float.compare(this.bottom, roundRect.bottom) == 0 && CornerRadius.m23994equalsimpl0(this.topLeftCornerRadius, roundRect.topLeftCornerRadius) && CornerRadius.m23994equalsimpl0(this.topRightCornerRadius, roundRect.topRightCornerRadius) && CornerRadius.m23994equalsimpl0(this.bottomRightCornerRadius, roundRect.bottomRightCornerRadius) && CornerRadius.m23994equalsimpl0(this.bottomLeftCornerRadius, roundRect.bottomLeftCornerRadius);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m24083getBottomLeftCornerRadiuskKHJgLs() {
        return this.bottomLeftCornerRadius;
    }

    /* renamed from: getBottomRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m24084getBottomRightCornerRadiuskKHJgLs() {
        return this.bottomRightCornerRadius;
    }

    public final float getHeight() {
        return this.bottom - this.f21448top;
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getRight() {
        return this.right;
    }

    public final float getTop() {
        return this.f21448top;
    }

    /* renamed from: getTopLeftCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m24085getTopLeftCornerRadiuskKHJgLs() {
        return this.topLeftCornerRadius;
    }

    /* renamed from: getTopRightCornerRadius-kKHJgLs, reason: not valid java name */
    public final long m24086getTopRightCornerRadiuskKHJgLs() {
        return this.topRightCornerRadius;
    }

    public final float getWidth() {
        return this.right - this.left;
    }

    public int hashCode() {
        return (((((((((((((Float.hashCode(this.left) * 31) + Float.hashCode(this.f21448top)) * 31) + Float.hashCode(this.right)) * 31) + Float.hashCode(this.bottom)) * 31) + CornerRadius.m23997hashCodeimpl(this.topLeftCornerRadius)) * 31) + CornerRadius.m23997hashCodeimpl(this.topRightCornerRadius)) * 31) + CornerRadius.m23997hashCodeimpl(this.bottomRightCornerRadius)) * 31) + CornerRadius.m23997hashCodeimpl(this.bottomLeftCornerRadius);
    }

    public String toString() {
        long j10 = this.topLeftCornerRadius;
        long j11 = this.topRightCornerRadius;
        long j12 = this.bottomRightCornerRadius;
        long j13 = this.bottomLeftCornerRadius;
        String str = GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f21448top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1);
        if (!CornerRadius.m23994equalsimpl0(j10, j11) || !CornerRadius.m23994equalsimpl0(j11, j12) || !CornerRadius.m23994equalsimpl0(j12, j13)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) CornerRadius.m24003toStringimpl(j10)) + ", topRight=" + ((Object) CornerRadius.m24003toStringimpl(j11)) + ", bottomRight=" + ((Object) CornerRadius.m24003toStringimpl(j12)) + ", bottomLeft=" + ((Object) CornerRadius.m24003toStringimpl(j13)) + ')';
        }
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.intBitsToFloat(i11)) {
            return "RoundRect(rect=" + str + ", radius=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i10), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i10), 1) + ", y=" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i11), 1) + ')';
    }

    private RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13) {
        this.left = f10;
        this.f21448top = f11;
        this.right = f12;
        this.bottom = f13;
        this.topLeftCornerRadius = j10;
        this.topRightCornerRadius = j11;
        this.bottomRightCornerRadius = j12;
        this.bottomLeftCornerRadius = j13;
    }

    public /* synthetic */ RoundRect(float f10, float f11, float f12, float f13, long j10, long j11, long j12, long j13, int i10, AbstractC9126n abstractC9126n) {
        this(f10, f11, f12, f13, (i10 & 16) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j10, (i10 & 32) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j11, (i10 & 64) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j12, (i10 & 128) != 0 ? CornerRadius.Companion.m24007getZerokKHJgLs() : j13, null);
    }
}
