package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
final class CamUtils {
    static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};
    static final float[][] SRGB_TO_XYZ = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    private CamUtils() {
    }

    public static int intFromLStar(float f4) {
        if (f4 < 1.0f) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (f4 > 99.0f) {
            return -1;
        }
        float f5 = (f4 + 16.0f) / 116.0f;
        float f6 = (f4 > 8.0f ? 1 : (f4 == 8.0f ? 0 : -1)) > 0 ? f5 * f5 * f5 : f4 / 903.2963f;
        float f7 = f5 * f5 * f5;
        boolean z3 = f7 > 0.008856452f;
        float f8 = z3 ? f7 : ((f5 * 116.0f) - 16.0f) / 903.2963f;
        if (!z3) {
            f7 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return ColorUtils.XYZToColor(f8 * fArr[0], f6 * fArr[1], f7 * fArr[2]);
    }

    public static float lStarFromInt(int i4) {
        return lStarFromY(yFromInt(i4));
    }

    public static float lStarFromY(float f4) {
        float f5 = f4 / 100.0f;
        return f5 <= 0.008856452f ? f5 * 903.2963f : (((float) Math.cbrt(f5)) * 116.0f) - 16.0f;
    }

    public static float lerp(float f4, float f5, float f6) {
        return f4 + ((f5 - f4) * f6);
    }

    public static float linearized(int i4) {
        float f4 = i4 / 255.0f;
        return (f4 <= 0.04045f ? f4 / 12.92f : (float) Math.pow((f4 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    @NonNull
    public static float[] xyzFromInt(int i4) {
        float fLinearized = linearized(Color.red(i4));
        float fLinearized2 = linearized(Color.green(i4));
        float fLinearized3 = linearized(Color.blue(i4));
        float[][] fArr = SRGB_TO_XYZ;
        float[] fArr2 = fArr[0];
        float f4 = (fArr2[0] * fLinearized) + (fArr2[1] * fLinearized2) + (fArr2[2] * fLinearized3);
        float[] fArr3 = fArr[1];
        float f5 = (fArr3[0] * fLinearized) + (fArr3[1] * fLinearized2) + (fArr3[2] * fLinearized3);
        float[] fArr4 = fArr[2];
        return new float[]{f4, f5, (fLinearized * fArr4[0]) + (fLinearized2 * fArr4[1]) + (fLinearized3 * fArr4[2])};
    }

    public static float yFromInt(int i4) {
        float fLinearized = linearized(Color.red(i4));
        float fLinearized2 = linearized(Color.green(i4));
        float fLinearized3 = linearized(Color.blue(i4));
        float[] fArr = SRGB_TO_XYZ[1];
        return (fLinearized * fArr[0]) + (fLinearized2 * fArr[1]) + (fLinearized3 * fArr[2]);
    }

    public static float yFromLStar(float f4) {
        return (f4 > 8.0f ? (float) Math.pow((f4 + 16.0d) / 116.0d, 3.0d) : f4 / 903.2963f) * 100.0f;
    }
}
