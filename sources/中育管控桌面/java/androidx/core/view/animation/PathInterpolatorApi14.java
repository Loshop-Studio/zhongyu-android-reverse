package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private final float[] f476mX;

    /* renamed from: mY */
    private final float[] f477mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i6 = (int) (length / 0.002f);
        int i7 = i6 + 1;
        this.f476mX = new float[i7];
        this.f477mY = new float[i7];
        float[] fArr = new float[2];
        for (int i8 = 0; i8 < i7; i8++) {
            pathMeasure.getPosTan((i8 * length) / i6, fArr, null);
            this.f476mX[i8] = fArr[0];
            this.f477mY[i8] = fArr[1];
        }
    }

    private static Path createCubic(float f6, float f7, float f8, float f9) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f6, f7, f8, f9, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f6, f7, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        if (f6 <= 0.0f) {
            return 0.0f;
        }
        if (f6 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f476mX.length - 1;
        int i6 = 0;
        while (length - i6 > 1) {
            int i7 = (i6 + length) / 2;
            if (f6 < this.f476mX[i7]) {
                length = i7;
            } else {
                i6 = i7;
            }
        }
        float[] fArr = this.f476mX;
        float f7 = fArr[length];
        float f8 = fArr[i6];
        float f9 = f7 - f8;
        if (f9 == 0.0f) {
            return this.f477mY[i6];
        }
        float f10 = (f6 - f8) / f9;
        float[] fArr2 = this.f477mY;
        float f11 = fArr2[i6];
        return f11 + (f10 * (fArr2[length] - f11));
    }

    public PathInterpolatorApi14(float f6, float f7) {
        this(createQuad(f6, f7));
    }

    public PathInterpolatorApi14(float f6, float f7, float f8, float f9) {
        this(createCubic(f6, f7, f8, f9));
    }
}
