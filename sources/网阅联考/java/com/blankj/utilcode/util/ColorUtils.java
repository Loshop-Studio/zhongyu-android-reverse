package com.blankj.utilcode.util;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;

/* loaded from: classes2.dex */
public final class ColorUtils {
    private ColorUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getColor(@ColorRes int i4) {
        return ContextCompat.getColor(Utils.getApp(), i4);
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static String int2ArgbString(@ColorInt int i4) {
        String hexString = Integer.toHexString(i4);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        while (hexString.length() < 8) {
            hexString = "f" + hexString;
        }
        return "#" + hexString;
    }

    public static String int2RgbString(@ColorInt int i4) {
        String hexString = Integer.toHexString(i4 & ViewCompat.MEASURED_SIZE_MASK);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        return "#" + hexString;
    }

    public static boolean isLightColor(@ColorInt int i4) {
        return ((((double) Color.red(i4)) * 0.299d) + (((double) Color.green(i4)) * 0.587d)) + (((double) Color.blue(i4)) * 0.114d) >= 127.5d;
    }

    public static int setAlphaComponent(@ColorInt int i4, @FloatRange(from = 0.0d, m95to = 1.0d) float f4) {
        return (i4 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((f4 * 255.0f) + 0.5f)) << 24);
    }

    public static int setBlueComponent(@ColorInt int i4, @FloatRange(from = 0.0d, m95to = 1.0d) float f4) {
        return (i4 & InputDeviceCompat.SOURCE_ANY) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static int setGreenComponent(@ColorInt int i4, @FloatRange(from = 0.0d, m95to = 1.0d) float f4) {
        return (i4 & (-65281)) | (((int) ((f4 * 255.0f) + 0.5f)) << 8);
    }

    public static int setRedComponent(@ColorInt int i4, @FloatRange(from = 0.0d, m95to = 1.0d) float f4) {
        return (i4 & (-16711681)) | (((int) ((f4 * 255.0f) + 0.5f)) << 16);
    }

    public static int string2Int(@NonNull String str) {
        return Color.parseColor(str);
    }

    public static int getRandomColor(boolean z3) {
        return (z3 ? ((int) (Math.random() * 256.0d)) << 24 : ViewCompat.MEASURED_STATE_MASK) | ((int) (Math.random() * 1.6777216E7d));
    }

    public static int setAlphaComponent(@ColorInt int i4, @IntRange(from = 0, m96to = 255) int i5) {
        return (i4 & ViewCompat.MEASURED_SIZE_MASK) | (i5 << 24);
    }

    public static int setBlueComponent(@ColorInt int i4, @IntRange(from = 0, m96to = 255) int i5) {
        return (i4 & InputDeviceCompat.SOURCE_ANY) | i5;
    }

    public static int setGreenComponent(@ColorInt int i4, @IntRange(from = 0, m96to = 255) int i5) {
        return (i4 & (-65281)) | (i5 << 8);
    }

    public static int setRedComponent(@ColorInt int i4, @IntRange(from = 0, m96to = 255) int i5) {
        return (i4 & (-16711681)) | (i5 << 16);
    }
}
