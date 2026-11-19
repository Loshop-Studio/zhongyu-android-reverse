package androidx.core.graphics;

import android.graphics.Color;
import android.support.v4.media.MediaDescriptionCompat;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresApi;
import androidx.annotation.Size;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ScatterMapKt;
import androidx.core.content.res.CamColor;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.utilities.Contrast;
import java.util.Objects;
import kotlin.jvm.internal.DoubleCompanionObject;

/* loaded from: classes2.dex */
public final class ColorUtils {
    private static final int MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10;
    private static final int MIN_ALPHA_SEARCH_PRECISION = 1;
    private static final ThreadLocal<double[]> TEMP_ARRAY = new ThreadLocal<>();
    private static final double XYZ_EPSILON = 0.008856d;
    private static final double XYZ_KAPPA = 903.3d;
    private static final double XYZ_WHITE_REFERENCE_X = 95.047d;
    private static final double XYZ_WHITE_REFERENCE_Y = 100.0d;
    private static final double XYZ_WHITE_REFERENCE_Z = 108.883d;

    @RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
        }

        public static Color compositeColors(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float fAlpha = color.alpha();
            float fAlpha2 = color2.alpha() * (1.0f - fAlpha);
            int componentCount = color2.getComponentCount() - 1;
            float f6 = fAlpha + fAlpha2;
            components2[componentCount] = f6;
            if (f6 > 0.0f) {
                fAlpha /= f6;
                fAlpha2 /= f6;
            }
            for (int i6 = 0; i6 < componentCount; i6++) {
                components2[i6] = (components[i6] * fAlpha) + (components2[i6] * fAlpha2);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private ColorUtils() {
    }

    @ColorInt
    public static int HSLToColor(float[] fArr) {
        int iRound;
        int iRound2;
        int iRound3;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float fAbs = (1.0f - Math.abs((f8 * 2.0f) - 1.0f)) * f7;
        float f9 = f8 - (0.5f * fAbs);
        float fAbs2 = (1.0f - Math.abs(((f6 / 60.0f) % 2.0f) - 1.0f)) * fAbs;
        switch (((int) f6) / 60) {
            case 0:
                iRound = Math.round((fAbs + f9) * 255.0f);
                iRound2 = Math.round((fAbs2 + f9) * 255.0f);
                iRound3 = Math.round(f9 * 255.0f);
                break;
            case 1:
                iRound = Math.round((fAbs2 + f9) * 255.0f);
                iRound2 = Math.round((fAbs + f9) * 255.0f);
                iRound3 = Math.round(f9 * 255.0f);
                break;
            case 2:
                iRound = Math.round(f9 * 255.0f);
                iRound2 = Math.round((fAbs + f9) * 255.0f);
                iRound3 = Math.round((fAbs2 + f9) * 255.0f);
                break;
            case 3:
                iRound = Math.round(f9 * 255.0f);
                iRound2 = Math.round((fAbs2 + f9) * 255.0f);
                iRound3 = Math.round((fAbs + f9) * 255.0f);
                break;
            case 4:
                iRound = Math.round((fAbs2 + f9) * 255.0f);
                iRound2 = Math.round(f9 * 255.0f);
                iRound3 = Math.round((fAbs + f9) * 255.0f);
                break;
            case 5:
            case 6:
                iRound = Math.round((fAbs + f9) * 255.0f);
                iRound2 = Math.round(f9 * 255.0f);
                iRound3 = Math.round((fAbs2 + f9) * 255.0f);
                break;
            default:
                iRound3 = 0;
                iRound = 0;
                iRound2 = 0;
                break;
        }
        return Color.rgb(constrain(iRound, 0, 255), constrain(iRound2, 0, 255), constrain(iRound3, 0, 255));
    }

    @ColorInt
    public static int LABToColor(@FloatRange(from = 0.0d, m58to = 100.0d) double d6, @FloatRange(from = -128.0d, m58to = 127.0d) double d7, @FloatRange(from = -128.0d, m58to = 127.0d) double d8) {
        double[] tempDouble3Array = getTempDouble3Array();
        LABToXYZ(d6, d7, d8, tempDouble3Array);
        return XYZToColor(tempDouble3Array[0], tempDouble3Array[1], tempDouble3Array[2]);
    }

    public static void LABToXYZ(@FloatRange(from = 0.0d, m58to = 100.0d) double d6, @FloatRange(from = -128.0d, m58to = 127.0d) double d7, @FloatRange(from = -128.0d, m58to = 127.0d) double d8, double[] dArr) {
        double d9 = (d6 + 16.0d) / 116.0d;
        double d10 = (d7 / 500.0d) + d9;
        double d11 = d9 - (d8 / 200.0d);
        double dPow = Math.pow(d10, 3.0d);
        if (dPow <= XYZ_EPSILON) {
            dPow = ((d10 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        double dPow2 = d6 > 7.9996247999999985d ? Math.pow(d9, 3.0d) : d6 / XYZ_KAPPA;
        double dPow3 = Math.pow(d11, 3.0d);
        if (dPow3 <= XYZ_EPSILON) {
            dPow3 = ((d11 * 116.0d) - 16.0d) / XYZ_KAPPA;
        }
        dArr[0] = dPow * XYZ_WHITE_REFERENCE_X;
        dArr[1] = dPow2 * 100.0d;
        dArr[2] = dPow3 * XYZ_WHITE_REFERENCE_Z;
    }

    @ColorInt
    public static int M3HCTToColor(@FloatRange(from = 0.0d, m58to = 360.0d, toInclusive = false) float f6, @FloatRange(from = 0.0d, m58to = DoubleCompanionObject.POSITIVE_INFINITY, toInclusive = false) float f7, @FloatRange(from = 0.0d, m58to = 100.0d) float f8) {
        return CamColor.toColor(f6, f7, f8);
    }

    public static void RGBToHSL(@IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i8, float[] fArr) {
        float f6;
        float fAbs;
        float f7 = i6 / 255.0f;
        float f8 = i7 / 255.0f;
        float f9 = i8 / 255.0f;
        float fMax = Math.max(f7, Math.max(f8, f9));
        float fMin = Math.min(f7, Math.min(f8, f9));
        float f10 = fMax - fMin;
        float f11 = (fMax + fMin) / 2.0f;
        if (fMax == fMin) {
            f6 = 0.0f;
            fAbs = 0.0f;
        } else {
            f6 = fMax == f7 ? ((f8 - f9) / f10) % 6.0f : fMax == f8 ? ((f9 - f7) / f10) + 2.0f : 4.0f + ((f7 - f8) / f10);
            fAbs = f10 / (1.0f - Math.abs((2.0f * f11) - 1.0f));
        }
        float f12 = (f6 * 60.0f) % 360.0f;
        if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        fArr[0] = constrain(f12, 0.0f, 360.0f);
        fArr[1] = constrain(fAbs, 0.0f, 1.0f);
        fArr[2] = constrain(f11, 0.0f, 1.0f);
    }

    public static void RGBToLAB(@IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i8, double[] dArr) {
        RGBToXYZ(i6, i7, i8, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void RGBToXYZ(@IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i8, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = i6 / 255.0d;
        double dPow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = i7 / 255.0d;
        double dPow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = i8 / 255.0d;
        double dPow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * dPow) + (0.3576d * dPow2) + (0.1805d * dPow3)) * 100.0d;
        dArr[1] = ((0.2126d * dPow) + (0.7152d * dPow2) + (0.0722d * dPow3)) * 100.0d;
        dArr[2] = ((dPow * 0.0193d) + (dPow2 * 0.1192d) + (dPow3 * 0.9505d)) * 100.0d;
    }

    @ColorInt
    public static int XYZToColor(@FloatRange(from = 0.0d, m58to = XYZ_WHITE_REFERENCE_X) double d6, @FloatRange(from = 0.0d, m58to = 100.0d) double d7, @FloatRange(from = 0.0d, m58to = XYZ_WHITE_REFERENCE_Z) double d8) {
        double d9 = (((3.2406d * d6) + ((-1.5372d) * d7)) + ((-0.4986d) * d8)) / 100.0d;
        double d10 = ((((-0.9689d) * d6) + (1.8758d * d7)) + (0.0415d * d8)) / 100.0d;
        double d11 = (((0.0557d * d6) + ((-0.204d) * d7)) + (1.057d * d8)) / 100.0d;
        return Color.rgb(constrain((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), constrain((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255));
    }

    public static void XYZToLAB(@FloatRange(from = 0.0d, m58to = XYZ_WHITE_REFERENCE_X) double d6, @FloatRange(from = 0.0d, m58to = 100.0d) double d7, @FloatRange(from = 0.0d, m58to = XYZ_WHITE_REFERENCE_Z) double d8, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double dPivotXyzComponent = pivotXyzComponent(d6 / XYZ_WHITE_REFERENCE_X);
        double dPivotXyzComponent2 = pivotXyzComponent(d7 / 100.0d);
        double dPivotXyzComponent3 = pivotXyzComponent(d8 / XYZ_WHITE_REFERENCE_Z);
        dArr[0] = Math.max(0.0d, (116.0d * dPivotXyzComponent2) - 16.0d);
        dArr[1] = (dPivotXyzComponent - dPivotXyzComponent2) * 500.0d;
        dArr[2] = (dPivotXyzComponent2 - dPivotXyzComponent3) * 200.0d;
    }

    @ColorInt
    public static int blendARGB(@ColorInt int i6, @ColorInt int i7, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6) {
        float f7 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i6) * f7) + (Color.alpha(i7) * f6)), (int) ((Color.red(i6) * f7) + (Color.red(i7) * f6)), (int) ((Color.green(i6) * f7) + (Color.green(i7) * f6)), (int) ((Color.blue(i6) * f7) + (Color.blue(i7) * f6)));
    }

    public static void blendHSL(float[] fArr, float[] fArr2, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) float f6, float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f7 = 1.0f - f6;
        fArr3[0] = circularInterpolate(fArr[0], fArr2[0], f6);
        fArr3[1] = (fArr[1] * f7) + (fArr2[1] * f6);
        fArr3[2] = (fArr[2] * f7) + (fArr2[2] * f6);
    }

    public static void blendLAB(double[] dArr, double[] dArr2, @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN) double d6, double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d7 = 1.0d - d6;
        dArr3[0] = (dArr[0] * d7) + (dArr2[0] * d6);
        dArr3[1] = (dArr[1] * d7) + (dArr2[1] * d6);
        dArr3[2] = (dArr[2] * d7) + (dArr2[2] * d6);
    }

    public static double calculateContrast(@ColorInt int i6, @ColorInt int i7) {
        if (Color.alpha(i7) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i7));
        }
        if (Color.alpha(i6) < 255) {
            i6 = compositeColors(i6, i7);
        }
        double dCalculateLuminance = calculateLuminance(i6) + 0.05d;
        double dCalculateLuminance2 = calculateLuminance(i7) + 0.05d;
        return Math.max(dCalculateLuminance, dCalculateLuminance2) / Math.min(dCalculateLuminance, dCalculateLuminance2);
    }

    @FloatRange(from = 0.0d, m58to = Contrast.RATIO_MIN)
    public static double calculateLuminance(@ColorInt int i6) {
        double[] tempDouble3Array = getTempDouble3Array();
        colorToXYZ(i6, tempDouble3Array);
        return tempDouble3Array[1] / 100.0d;
    }

    public static int calculateMinimumAlpha(@ColorInt int i6, @ColorInt int i7, float f6) {
        int i8 = 255;
        if (Color.alpha(i7) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i7));
        }
        double d6 = f6;
        if (calculateContrast(setAlphaComponent(i6, 255), i7) < d6) {
            return -1;
        }
        int i9 = 0;
        for (int i10 = 0; i10 <= 10 && i8 - i9 > 1; i10++) {
            int i11 = (i9 + i8) / 2;
            if (calculateContrast(setAlphaComponent(i6, i11), i7) < d6) {
                i9 = i11;
            } else {
                i8 = i11;
            }
        }
        return i8;
    }

    @VisibleForTesting
    public static float circularInterpolate(float f6, float f7, float f8) {
        if (Math.abs(f7 - f6) > 180.0f) {
            if (f7 > f6) {
                f6 += 360.0f;
            } else {
                f7 += 360.0f;
            }
        }
        return (f6 + ((f7 - f6) * f8)) % 360.0f;
    }

    public static void colorToHSL(@ColorInt int i6, float[] fArr) {
        RGBToHSL(Color.red(i6), Color.green(i6), Color.blue(i6), fArr);
    }

    public static void colorToLAB(@ColorInt int i6, double[] dArr) {
        RGBToLAB(Color.red(i6), Color.green(i6), Color.blue(i6), dArr);
    }

    public static void colorToM3HCT(@ColorInt int i6, @Size(MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) float[] fArr) {
        CamColor.getM3HCTfromColor(i6, fArr);
    }

    public static void colorToXYZ(@ColorInt int i6, double[] dArr) {
        RGBToXYZ(Color.red(i6), Color.green(i6), Color.blue(i6), dArr);
    }

    private static int compositeAlpha(int i6, int i7) {
        return 255 - (((255 - i7) * (255 - i6)) / 255);
    }

    public static int compositeColors(@ColorInt int i6, @ColorInt int i7) {
        int iAlpha = Color.alpha(i7);
        int iAlpha2 = Color.alpha(i6);
        int iCompositeAlpha = compositeAlpha(iAlpha2, iAlpha);
        return Color.argb(iCompositeAlpha, compositeComponent(Color.red(i6), iAlpha2, Color.red(i7), iAlpha, iCompositeAlpha), compositeComponent(Color.green(i6), iAlpha2, Color.green(i7), iAlpha, iCompositeAlpha), compositeComponent(Color.blue(i6), iAlpha2, Color.blue(i7), iAlpha, iCompositeAlpha));
    }

    private static int compositeComponent(int i6, int i7, int i8, int i9, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return (((i6 * 255) * i7) + ((i8 * i9) * (255 - i7))) / (i10 * 255);
    }

    private static float constrain(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : Math.min(f6, f8);
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[0] - dArr2[0], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    private static double[] getTempDouble3Array() {
        ThreadLocal<double[]> threadLocal = TEMP_ARRAY;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double pivotXyzComponent(double d6) {
        return d6 > XYZ_EPSILON ? Math.pow(d6, 0.3333333333333333d) : ((d6 * XYZ_KAPPA) + 16.0d) / 116.0d;
    }

    @ColorInt
    public static int setAlphaComponent(@ColorInt int i6, @IntRange(from = 0, m59to = ScatterMapKt.Sentinel) int i7) {
        if (i7 < 0 || i7 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i6 & ViewCompat.MEASURED_SIZE_MASK) | (i7 << 24);
    }

    private static int constrain(int i6, int i7, int i8) {
        return i6 < i7 ? i7 : Math.min(i6, i8);
    }

    @RequiresApi(26)
    public static Color compositeColors(Color color, Color color2) {
        return Api26Impl.compositeColors(color, color2);
    }
}
