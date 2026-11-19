package androidx.compose.p014ui.graphics.colorspace;

import androidx.annotation.Size;

/* loaded from: classes2.dex */
public final class WhitePoint {

    /* renamed from: x */
    private final float f1162x;

    /* renamed from: y */
    private final float f1163y;

    public WhitePoint(float f10, float f11) {
        this.f1162x = f10;
        this.f1163y = f11;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = whitePoint.f1162x;
        }
        if ((i10 & 2) != 0) {
            f11 = whitePoint.f1163y;
        }
        return whitePoint.copy(f10, f11);
    }

    public final float component1() {
        return this.f1162x;
    }

    public final float component2() {
        return this.f1163y;
    }

    public final WhitePoint copy(float f10, float f11) {
        return new WhitePoint(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WhitePoint)) {
            return false;
        }
        WhitePoint whitePoint = (WhitePoint) obj;
        return Float.compare(this.f1162x, whitePoint.f1162x) == 0 && Float.compare(this.f1163y, whitePoint.f1163y) == 0;
    }

    public final float getX() {
        return this.f1162x;
    }

    public final float getY() {
        return this.f1163y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f1162x) * 31) + Float.hashCode(this.f1163y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f1162x + ", y=" + this.f1163y + ')';
    }

    @Size(3)
    public final float[] toXyz$ui_graphics_release() {
        float f10 = this.f1162x;
        float f11 = this.f1163y;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public WhitePoint(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private WhitePoint(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
