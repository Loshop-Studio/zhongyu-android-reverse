package androidx.compose.p014ui.geometry;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class MutableRect {
    public static final int $stable = 8;
    private float bottom;
    private float left;
    private float right;

    /* renamed from: top, reason: collision with root package name */
    private float f28514top;

    public MutableRect(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.f28514top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    /* renamed from: contains-k-4lQ0M, reason: not valid java name */
    public final boolean m30611containsk4lQ0M(long j10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return (fIntBitsToFloat >= this.left) & (fIntBitsToFloat < this.right) & (fIntBitsToFloat2 >= this.f28514top) & (fIntBitsToFloat2 < this.bottom);
    }

    public final void deflate(float f10) {
        inflate(-f10);
    }

    public final float getBottom() {
        return this.bottom;
    }

    /* renamed from: getBottomCenter-F1C5BW0, reason: not valid java name */
    public final long m30612getBottomCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f10 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getBottomLeft-F1C5BW0, reason: not valid java name */
    public final long m30613getBottomLeftF1C5BW0() {
        float f10 = this.left;
        float f11 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getBottomRight-F1C5BW0, reason: not valid java name */
    public final long m30614getBottomRightF1C5BW0() {
        float f10 = this.right;
        float f11 = this.bottom;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
    public final long m30615getCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float bottom = this.f28514top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getCenterLeft-F1C5BW0, reason: not valid java name */
    public final long m30616getCenterLeftF1C5BW0() {
        float f10 = this.left;
        float bottom = this.f28514top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getCenterRight-F1C5BW0, reason: not valid java name */
    public final long m30617getCenterRightF1C5BW0() {
        float f10 = this.right;
        float bottom = this.f28514top + ((getBottom() - getTop()) / 2.0f);
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float getHeight() {
        return getBottom() - getTop();
    }

    public final float getLeft() {
        return this.left;
    }

    public final float getMaxDimension() {
        return Math.max(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getMinDimension() {
        return Math.min(Math.abs(getRight() - getLeft()), Math.abs(getBottom() - getTop()));
    }

    public final float getRight() {
        return this.right;
    }

    /* renamed from: getSize-NH-jbRc, reason: not valid java name */
    public final long m30618getSizeNHjbRc() {
        float right = getRight() - getLeft();
        float bottom = getBottom() - getTop();
        return Size.m30697constructorimpl((Float.floatToRawIntBits(bottom) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    public final float getTop() {
        return this.f28514top;
    }

    /* renamed from: getTopCenter-F1C5BW0, reason: not valid java name */
    public final long m30619getTopCenterF1C5BW0() {
        float right = this.left + ((getRight() - getLeft()) / 2.0f);
        float f10 = this.f28514top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(right) << 32));
    }

    /* renamed from: getTopLeft-F1C5BW0, reason: not valid java name */
    public final long m30620getTopLeftF1C5BW0() {
        float f10 = this.left;
        float f11 = this.f28514top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    /* renamed from: getTopRight-F1C5BW0, reason: not valid java name */
    public final long m30621getTopRightF1C5BW0() {
        float f10 = this.right;
        float f11 = this.f28514top;
        return Offset.m30629constructorimpl((Float.floatToRawIntBits(f11) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32));
    }

    public final float getWidth() {
        return getRight() - getLeft();
    }

    public final void inflate(float f10) {
        this.left -= f10;
        this.f28514top -= f10;
        this.right += f10;
        this.bottom += f10;
    }

    public final void intersect(float f10, float f11, float f12, float f13) {
        this.left = Math.max(f10, this.left);
        this.f28514top = Math.max(f11, this.f28514top);
        this.right = Math.min(f12, this.right);
        this.bottom = Math.min(f13, this.bottom);
    }

    public final boolean isEmpty() {
        return (this.left >= this.right) | (this.f28514top >= this.bottom);
    }

    public final boolean isFinite() {
        return ((Float.floatToRawIntBits(this.left) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.f28514top) & Integer.MAX_VALUE) < 2139095040) & ((Float.floatToRawIntBits(this.right) & Integer.MAX_VALUE) < 2139095040) & ((Integer.MAX_VALUE & Float.floatToRawIntBits(this.bottom)) < 2139095040);
    }

    public final boolean isInfinite() {
        return (this.left == Float.POSITIVE_INFINITY) | (this.f28514top == Float.POSITIVE_INFINITY) | (this.right == Float.POSITIVE_INFINITY) | (this.bottom == Float.POSITIVE_INFINITY);
    }

    public final boolean overlaps(Rect rect) {
        return (this.left < rect.getRight()) & (rect.getLeft() < this.right) & (this.f28514top < rect.getBottom()) & (rect.getTop() < this.bottom);
    }

    public final void set(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.f28514top = f11;
        this.right = f12;
        this.bottom = f13;
    }

    public final void setBottom(float f10) {
        this.bottom = f10;
    }

    public final void setLeft(float f10) {
        this.left = f10;
    }

    public final void setRight(float f10) {
        this.right = f10;
    }

    public final void setTop(float f10) {
        this.f28514top = f10;
    }

    public String toString() {
        return "MutableRect(" + GeometryUtilsKt.toStringAsFixed(this.left, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.f28514top, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.right, 1) + ", " + GeometryUtilsKt.toStringAsFixed(this.bottom, 1) + ')';
    }

    public final void translate(float f10, float f11) {
        this.left += f10;
        this.f28514top += f11;
        this.right += f10;
        this.bottom += f11;
    }

    /* renamed from: translate-k-4lQ0M, reason: not valid java name */
    public final void m30622translatek4lQ0M(long j10) {
        translate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public final boolean overlaps(MutableRect mutableRect) {
        return this.right > mutableRect.left && mutableRect.right > this.left && this.bottom > mutableRect.f28514top && mutableRect.bottom > this.f28514top;
    }
}
