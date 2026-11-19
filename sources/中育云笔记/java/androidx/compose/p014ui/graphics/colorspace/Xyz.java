package androidx.compose.p014ui.graphics.colorspace;

import androidx.compose.p014ui.graphics.ColorKt;

/* loaded from: classes2.dex */
public final class Xyz extends ColorSpace {
    public Xyz(String str, int i10) {
        super(str, ColorModel.Companion.m31293getXyzxdoWZVw(), i10, null);
    }

    private final float clamp(float f10) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            return 2.0f;
        }
        return f10;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] fromXyz(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMaxValue(int i10) {
        return 2.0f;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float getMinValue(int i10) {
        return -2.0f;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public boolean isWideGamut() {
        return true;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public long toXy$ui_graphics_release(float f10, float f11, float f12) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        return (Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11 <= 2.0f ? f11 : 2.0f) & 4294967295L);
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float[] toXyz(float[] fArr) {
        float f10 = fArr[0];
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        fArr[0] = f10;
        float f11 = fArr[1];
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        fArr[1] = f11;
        float f12 = fArr[2];
        float f13 = f12 >= -2.0f ? f12 : -2.0f;
        fArr[2] = f13 <= 2.0f ? f13 : 2.0f;
        return fArr;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    public float toZ$ui_graphics_release(float f10, float f11, float f12) {
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        if (f12 > 2.0f) {
            return 2.0f;
        }
        return f12;
    }

    @Override // androidx.compose.p014ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release */
    public long mo31295xyzaToColorJlNiLsg$ui_graphics_release(float f10, float f11, float f12, float f13, ColorSpace colorSpace) {
        if (f10 < -2.0f) {
            f10 = -2.0f;
        }
        if (f10 > 2.0f) {
            f10 = 2.0f;
        }
        if (f11 < -2.0f) {
            f11 = -2.0f;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        if (f12 < -2.0f) {
            f12 = -2.0f;
        }
        return ColorKt.Color(f10, f11, f12 <= 2.0f ? f12 : 2.0f, f13, colorSpace);
    }
}
