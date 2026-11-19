package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, -f10, -f11, 0.0f);
    }

    private static void normalize(float[] fArr, float f10, float f11) {
        Matrix.translateM(fArr, 0, f10, f11, 0.0f);
    }

    public static void postRotate(@NonNull float[] fArr, float f10, float f11, float f12) throws Throwable {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            try {
                Matrix.setIdentityM(fArr2, 0);
                normalize(fArr2, f11, f12);
                Matrix.rotateM(fArr2, 0, f10, 0.0f, 0.0f, 1.0f);
                denormalize(fArr2, f11, f12);
            } catch (Throwable th) {
                th = th;
            }
            try {
                Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
            } catch (Throwable th2) {
                th = th2;
                fArr2 = fArr2;
                Throwable th3 = th;
                throw th3;
            }
        }
    }

    public static void preRotate(@NonNull float[] fArr, float f10, float f11, float f12) {
        normalize(fArr, f11, f12);
        Matrix.rotateM(fArr, 0, f10, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f11, f12);
    }

    public static void preVerticalFlip(@NonNull float[] fArr, float f10) {
        normalize(fArr, 0.0f, f10);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f10);
    }

    public static void setRotate(@NonNull float[] fArr, float f10, float f11, float f12) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f10, f11, f12);
    }

    @NonNull
    public static String toString(@NonNull float[] fArr, int i10) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i10]), Float.valueOf(fArr[i10 + 4]), Float.valueOf(fArr[i10 + 8]), Float.valueOf(fArr[i10 + 12]), Float.valueOf(fArr[i10 + 1]), Float.valueOf(fArr[i10 + 5]), Float.valueOf(fArr[i10 + 9]), Float.valueOf(fArr[i10 + 13]), Float.valueOf(fArr[i10 + 2]), Float.valueOf(fArr[i10 + 6]), Float.valueOf(fArr[i10 + 10]), Float.valueOf(fArr[i10 + 14]), Float.valueOf(fArr[i10 + 3]), Float.valueOf(fArr[i10 + 7]), Float.valueOf(fArr[i10 + 11]), Float.valueOf(fArr[i10 + 15]));
    }
}
