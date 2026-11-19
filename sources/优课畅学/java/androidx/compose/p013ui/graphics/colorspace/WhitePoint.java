package androidx.compose.p013ui.graphics.colorspace;

import androidx.annotation.Size;

/* loaded from: classes2.dex */
public final class WhitePoint {

    /* renamed from: x */
    private final float f1232x;

    /* renamed from: y */
    private final float f1233y;

    public WhitePoint(float f10, float f11) {
        this.f1232x = f10;
        this.f1233y = f11;
    }

    public static /* synthetic */ WhitePoint copy$default(WhitePoint whitePoint, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = whitePoint.f1232x;
        }
        if ((i10 & 2) != 0) {
            f11 = whitePoint.f1233y;
        }
        return whitePoint.copy(f10, f11);
    }

    public final float component1() {
        return this.f1232x;
    }

    public final float component2() {
        return this.f1233y;
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
        return Float.compare(this.f1232x, whitePoint.f1232x) == 0 && Float.compare(this.f1233y, whitePoint.f1233y) == 0;
    }

    public final float getX() {
        return this.f1232x;
    }

    public final float getY() {
        return this.f1233y;
    }

    public int hashCode() {
        return (Float.hashCode(this.f1232x) * 31) + Float.hashCode(this.f1233y);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f1232x + ", y=" + this.f1233y + ')';
    }

    @Size(3)
    public final float[] toXyz$ui_graphics_release() {
        float f10 = this.f1232x;
        float f11 = this.f1233y;
        return new float[]{f10 / f11, 1.0f, ((1.0f - f10) - f11) / f11};
    }

    public WhitePoint(float f10, float f11, float f12) {
        this(f10, f11, f12, f10 + f11 + f12);
    }

    private WhitePoint(float f10, float f11, float f12, float f13) {
        this(f10 / f13, f11 / f13);
    }
}
