package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private final float[] f361mX;

    /* renamed from: mY */
    private final float[] f362mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i4 = ((int) (length / PRECISION)) + 1;
        this.f361mX = new float[i4];
        this.f362mY = new float[i4];
        float[] fArr = new float[2];
        for (int i5 = 0; i5 < i4; i5++) {
            pathMeasure.getPosTan((i5 * length) / (i4 - 1), fArr, null);
            this.f361mX[i5] = fArr[0];
            this.f362mY[i5] = fArr[1];
        }
    }

    private static Path createCubic(float f4, float f5, float f6, float f7) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f4, f5, f6, f7, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f4, f5, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        if (f4 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f361mX.length - 1;
        int i4 = 0;
        while (length - i4 > 1) {
            int i5 = (i4 + length) / 2;
            if (f4 < this.f361mX[i5]) {
                length = i5;
            } else {
                i4 = i5;
            }
        }
        float[] fArr = this.f361mX;
        float f5 = fArr[length];
        float f6 = fArr[i4];
        float f7 = f5 - f6;
        if (f7 == 0.0f) {
            return this.f362mY[i4];
        }
        float f8 = (f4 - f6) / f7;
        float[] fArr2 = this.f362mY;
        float f9 = fArr2[i4];
        return f9 + (f8 * (fArr2[length] - f9));
    }

    public PathInterpolatorApi14(float f4, float f5) {
        this(createQuad(f4, f5));
    }

    public PathInterpolatorApi14(float f4, float f5, float f6, float f7) {
        this(createCubic(f4, f5, f6, f7));
    }
}
