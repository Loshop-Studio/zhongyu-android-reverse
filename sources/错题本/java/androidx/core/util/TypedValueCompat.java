package androidx.core.util;

import android.annotation.SuppressLint;
import android.os.Build;
import android.support.v4.media.AbstractC0037f;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    @RequiresApi(34)
    public static class Api34Impl {
        private Api34Impl() {
        }

        public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
            return TypedValue.deriveDimension(i, f, displayMetrics);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
    }

    public static float deriveDimension(int i, float f, DisplayMetrics displayMetrics) {
        float f7;
        float f8;
        if (Build.VERSION.SDK_INT >= 34) {
            return Api34Impl.deriveDimension(i, f, displayMetrics);
        }
        if (i == 0) {
            return f;
        }
        if (i == 1) {
            float f9 = displayMetrics.density;
            if (f9 == 0.0f) {
                return 0.0f;
            }
            return f / f9;
        }
        if (i == 2) {
            float f10 = displayMetrics.scaledDensity;
            if (f10 == 0.0f) {
                return 0.0f;
            }
            return f / f10;
        }
        if (i == 3) {
            float f11 = displayMetrics.xdpi;
            if (f11 == 0.0f) {
                return 0.0f;
            }
            f7 = f / f11;
            f8 = INCHES_PER_PT;
        } else {
            if (i == 4) {
                float f12 = displayMetrics.xdpi;
                if (f12 == 0.0f) {
                    return 0.0f;
                }
                return f / f12;
            }
            if (i != 5) {
                throw new IllegalArgumentException(AbstractC0037f.m81f(i, "Invalid unitToConvertTo "));
            }
            float f13 = displayMetrics.xdpi;
            if (f13 == 0.0f) {
                return 0.0f;
            }
            f7 = f / f13;
            f8 = INCHES_PER_MM;
        }
        return f7 / f8;
    }

    public static float dpToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    @SuppressLint({"WrongConstant"})
    public static int getUnitFromComplexDimension(int i) {
        return i & 15;
    }

    public static float pxToDp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(1, f, displayMetrics);
    }

    public static float pxToSp(float f, DisplayMetrics displayMetrics) {
        return deriveDimension(2, f, displayMetrics);
    }

    public static float spToPx(float f, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(2, f, displayMetrics);
    }
}
