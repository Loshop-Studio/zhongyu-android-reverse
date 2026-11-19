package androidx.core.view.animation;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
class PathInterpolatorApi14 implements Interpolator {
    private static final float PRECISION = 0.002f;

    /* renamed from: mX */
    private final float[] f1427mX;

    /* renamed from: mY */
    private final float[] f1428mY;

    public PathInterpolatorApi14(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i9 = (int) (length / 0.002f);
        int i10 = i9 + 1;
        this.f1427mX = new float[i10];
        this.f1428mY = new float[i10];
        float[] fArr = new float[2];
        for (int i11 = 0; i11 < i10; i11++) {
            pathMeasure.getPosTan((i11 * length) / i9, fArr, null);
            this.f1427mX[i11] = fArr[0];
            this.f1428mY[i11] = fArr[1];
        }
    }

    private static Path createCubic(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f10, f11, f12, f13, 1.0f, 1.0f);
        return path;
    }

    private static Path createQuad(float f10, float f11) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f10, f11, 1.0f, 1.0f);
        return path;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        int length = this.f1427mX.length - 1;
        int i9 = 0;
        while (length - i9 > 1) {
            int i10 = (i9 + length) / 2;
            if (f10 < this.f1427mX[i10]) {
                length = i10;
            } else {
                i9 = i10;
            }
        }
        float[] fArr = this.f1427mX;
        float f11 = fArr[length];
        float f12 = fArr[i9];
        float f13 = f11 - f12;
        if (f13 == 0.0f) {
            return this.f1428mY[i9];
        }
        float f14 = (f10 - f12) / f13;
        float[] fArr2 = this.f1428mY;
        float f15 = fArr2[i9];
        return f15 + (f14 * (fArr2[length] - f15));
    }

    public PathInterpolatorApi14(float f10, float f11) {
        this(createQuad(f10, f11));
    }

    public PathInterpolatorApi14(float f10, float f11, float f12, float f13) {
        this(createCubic(f10, f11, f12, f13));
    }
}
