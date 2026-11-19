package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.annotation.NonNull;
import java.util.Locale;

/* loaded from: classes.dex */
public final class MatrixExt {
    private static final float[] sTemp = new float[16];

    private MatrixExt() {
    }

    private static void denormalize(float[] fArr, float f, float f7) {
        Matrix.translateM(fArr, 0, -f, -f7, 0.0f);
    }

    private static void normalize(float[] fArr, float f, float f7) {
        Matrix.translateM(fArr, 0, f, f7, 0.0f);
    }

    public static void postRotate(@NonNull float[] fArr, float f, float f7, float f8) throws Throwable {
        float[] fArr2 = sTemp;
        synchronized (fArr2) {
            try {
                Matrix.setIdentityM(fArr2, 0);
                normalize(fArr2, f7, f8);
                Matrix.rotateM(fArr2, 0, f, 0.0f, 0.0f, 1.0f);
                denormalize(fArr2, f7, f8);
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

    public static void preRotate(@NonNull float[] fArr, float f, float f7, float f8) {
        normalize(fArr, f7, f8);
        Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        denormalize(fArr, f7, f8);
    }

    public static void preVerticalFlip(@NonNull float[] fArr, float f) {
        normalize(fArr, 0.0f, f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        denormalize(fArr, 0.0f, f);
    }

    public static void setRotate(@NonNull float[] fArr, float f, float f7, float f8) {
        Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f, f7, f8);
    }

    @NonNull
    public static String toString(@NonNull float[] fArr, int i) {
        return String.format(Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", Float.valueOf(fArr[i]), Float.valueOf(fArr[i + 4]), Float.valueOf(fArr[i + 8]), Float.valueOf(fArr[i + 12]), Float.valueOf(fArr[i + 1]), Float.valueOf(fArr[i + 5]), Float.valueOf(fArr[i + 9]), Float.valueOf(fArr[i + 13]), Float.valueOf(fArr[i + 2]), Float.valueOf(fArr[i + 6]), Float.valueOf(fArr[i + 10]), Float.valueOf(fArr[i + 14]), Float.valueOf(fArr[i + 3]), Float.valueOf(fArr[i + 7]), Float.valueOf(fArr[i + 11]), Float.valueOf(fArr[i + 15]));
    }
}
