package androidx.compose.p013ui.graphics.colorspace;

import androidx.annotation.IntRange;
import androidx.annotation.Size;
import androidx.compose.p013ui.graphics.ColorKt;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes2.dex */
public abstract class ColorSpace {
    public static final Companion Companion = new Companion(null);
    public static final int MaxId = 63;
    public static final int MinId = -1;

    /* renamed from: id */
    private final int f1215id;
    private final long model;
    private final String name;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ColorSpace(String str, long j10, int i10, AbstractC9126n abstractC9126n) {
        this(str, j10, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorSpace colorSpace = (ColorSpace) obj;
        if (this.f1215id == colorSpace.f1215id && AbstractC9133u.m16128b(this.name, colorSpace.name)) {
            return ColorModel.m24683equalsimpl0(this.model, colorSpace.model);
        }
        return false;
    }

    @Size(min = 3)
    public final float[] fromXyz(float f10, float f11, float f12) {
        float[] fArr = new float[ColorModel.m24684getComponentCountimpl(this.model)];
        fArr[0] = f10;
        fArr[1] = f11;
        fArr[2] = f12;
        return fromXyz(fArr);
    }

    @Size(min = 3)
    public abstract float[] fromXyz(@Size(min = 3) float[] fArr);

    @IntRange(from = 1, m244to = 4)
    public final int getComponentCount() {
        return ColorModel.m24684getComponentCountimpl(this.model);
    }

    public final int getId$ui_graphics_release() {
        return this.f1215id;
    }

    public abstract float getMaxValue(@IntRange(from = 0, m244to = 3) int i10);

    public abstract float getMinValue(@IntRange(from = 0, m244to = 3) int i10);

    /* renamed from: getModel-xdoWZVw, reason: not valid java name */
    public final long m24692getModelxdoWZVw() {
        return this.model;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + ColorModel.m24685hashCodeimpl(this.model)) * 31) + this.f1215id;
    }

    public boolean isSrgb() {
        return false;
    }

    public abstract boolean isWideGamut();

    public String toString() {
        return this.name + " (id=" + this.f1215id + ", model=" + ((Object) ColorModel.m24686toStringimpl(this.model)) + ')';
    }

    public long toXy$ui_graphics_release(float f10, float f11, float f12) {
        float[] xyz = toXyz(f10, f11, f12);
        float f13 = xyz[0];
        float f14 = xyz[1];
        return (Float.floatToRawIntBits(f13) << 32) | (Float.floatToRawIntBits(f14) & 4294967295L);
    }

    @Size(3)
    public final float[] toXyz(float f10, float f11, float f12) {
        return toXyz(new float[]{f10, f11, f12});
    }

    @Size(min = 3)
    public abstract float[] toXyz(@Size(min = 3) float[] fArr);

    public float toZ$ui_graphics_release(float f10, float f11, float f12) {
        return toXyz(f10, f11, f12)[2];
    }

    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics_release, reason: not valid java name */
    public long mo24693xyzaToColorJlNiLsg$ui_graphics_release(float f10, float f11, float f12, float f13, ColorSpace colorSpace) {
        float[] fArrFromXyz = fromXyz(f10, f11, f12);
        return ColorKt.Color(fArrFromXyz[0], fArrFromXyz[1], fArrFromXyz[2], f13, colorSpace);
    }

    public /* synthetic */ ColorSpace(String str, long j10, AbstractC9126n abstractC9126n) {
        this(str, j10);
    }

    private ColorSpace(String str, long j10, int i10) {
        this.name = str;
        this.model = j10;
        this.f1215id = i10;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i10 < -1 || i10 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    private ColorSpace(String str, long j10) {
        this(str, j10, -1, null);
    }
}
