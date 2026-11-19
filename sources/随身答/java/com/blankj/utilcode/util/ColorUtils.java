package com.blankj.utilcode.util;

import android.graphics.Color;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.video.AudioStats;
import androidx.collection.ScatterMapKt;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.color.utilities.Contrast;

/* loaded from: classes3.dex */
public final class ColorUtils {
    private ColorUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static int getColor(@ColorRes int i9) {
        return ContextCompat.getColor(Utils.getApp(), i9);
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static String int2ArgbString(@ColorInt int i9) {
        String hexString = Integer.toHexString(i9);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        while (hexString.length() < 8) {
            hexString = "f" + hexString;
        }
        return "#" + hexString;
    }

    public static String int2RgbString(@ColorInt int i9) {
        String hexString = Integer.toHexString(i9 & ViewCompat.MEASURED_SIZE_MASK);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        return "#" + hexString;
    }

    public static boolean isLightColor(@ColorInt int i9) {
        return ((((double) Color.red(i9)) * 0.299d) + (((double) Color.green(i9)) * 0.587d)) + (((double) Color.blue(i9)) * 0.114d) >= 127.5d;
    }

    public static int setAlphaComponent(@ColorInt int i9, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((f10 * 255.0f) + 0.5f)) << 24);
    }

    public static int setBlueComponent(@ColorInt int i9, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return (i9 & (-256)) | ((int) ((f10 * 255.0f) + 0.5f));
    }

    public static int setGreenComponent(@ColorInt int i9, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return (i9 & (-65281)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8);
    }

    public static int setRedComponent(@ColorInt int i9, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m265to = Contrast.RATIO_MIN) float f10) {
        return (i9 & (-16711681)) | (((int) ((f10 * 255.0f) + 0.5f)) << 16);
    }

    public static int string2Int(@NonNull String str) {
        return Color.parseColor(str);
    }

    public static int getRandomColor(boolean z9) {
        return (z9 ? ((int) (Math.random() * 256.0d)) << 24 : ViewCompat.MEASURED_STATE_MASK) | ((int) (Math.random() * 1.6777216E7d));
    }

    public static int setAlphaComponent(@ColorInt int i9, @IntRange(from = 0, m266to = ScatterMapKt.Sentinel) int i10) {
        return (i9 & ViewCompat.MEASURED_SIZE_MASK) | (i10 << 24);
    }

    public static int setBlueComponent(@ColorInt int i9, @IntRange(from = 0, m266to = ScatterMapKt.Sentinel) int i10) {
        return (i9 & (-256)) | i10;
    }

    public static int setGreenComponent(@ColorInt int i9, @IntRange(from = 0, m266to = ScatterMapKt.Sentinel) int i10) {
        return (i9 & (-65281)) | (i10 << 8);
    }

    public static int setRedComponent(@ColorInt int i9, @IntRange(from = 0, m266to = ScatterMapKt.Sentinel) int i10) {
        return (i9 & (-16711681)) | (i10 << 16);
    }
}
