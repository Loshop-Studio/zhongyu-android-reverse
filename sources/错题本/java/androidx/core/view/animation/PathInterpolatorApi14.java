package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.support.v4.media.AbstractC0037f;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private final float[] f1044mX;

    /* renamed from: mY */
    private final float[] f1045mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = (int) (length / 0.002f);
        int i8 = i + 1;
        this.f1044mX = new float[i8];
        this.f1045mY = new float[i8];
        float[] fArr = new float[2];
        for (int i9 = 0; i9 < i8; i9++) {
            pathMeasure.getPosTan((i9 * length) / i, fArr, null);
            this.f1044mX[i9] = fArr[0];
            this.f1045mY[i9] = fArr[1];
        }
    }

    private static Path createCubic(float f, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f, f7, f8, f9, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f, f7, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        int length = this.f1044mX.length - 1;
        int i = 0;
        while (length - i > 1) {
            int i8 = (i + length) / 2;
            if (f < this.f1044mX[i8]) {
                length = i8;
            } else {
                i = i8;
            }
        }
        float[] fArr = this.f1044mX;
        float f7 = fArr[length];
        float f8 = fArr[i];
        float f9 = f7 - f8;
        if (f9 == 0.0f) {
            return this.f1045mY[i];
        }
        float f10 = (f - f8) / f9;
        float[] fArr2 = this.f1045mY;
        float f11 = fArr2[i];
        return AbstractC0037f.m77b(fArr2[length], f11, f10, f11);
    }

    public PathInterpolatorApi14(float f, float f7) {
        this(createQuad(f, f7));
    }

    public PathInterpolatorApi14(float f, float f7, float f8, float f9) {
        this(createCubic(f, f7, f8, f9));
    }
}
