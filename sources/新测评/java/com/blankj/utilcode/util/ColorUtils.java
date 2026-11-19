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

    public static int getColor(@ColorRes int i10) {
        return ContextCompat.getColor(Utils.getApp(), i10);
    }

    public static int getRandomColor() {
        return getRandomColor(true);
    }

    public static String int2ArgbString(@ColorInt int i10) {
        String hexString = Integer.toHexString(i10);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        while (hexString.length() < 8) {
            hexString = "f" + hexString;
        }
        return "#" + hexString;
    }

    public static String int2RgbString(@ColorInt int i10) {
        String hexString = Integer.toHexString(i10 & ViewCompat.MEASURED_SIZE_MASK);
        while (hexString.length() < 6) {
            hexString = "0" + hexString;
        }
        return "#" + hexString;
    }

    public static boolean isLightColor(@ColorInt int i10) {
        return ((((double) Color.red(i10)) * 0.299d) + (((double) Color.green(i10)) * 0.587d)) + (((double) Color.blue(i10)) * 0.114d) >= 127.5d;
    }

    public static int setAlphaComponent(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (((int) ((f10 * 255.0f) + 0.5f)) << 24);
    }

    public static int setBlueComponent(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        return (i10 & (-256)) | ((int) ((f10 * 255.0f) + 0.5f));
    }

    public static int setGreenComponent(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        return (i10 & (-65281)) | (((int) ((f10 * 255.0f) + 0.5f)) << 8);
    }

    public static int setRedComponent(@ColorInt int i10, @FloatRange(from = AudioStats.AUDIO_AMPLITUDE_NONE, m487to = Contrast.RATIO_MIN) float f10) {
        return (i10 & (-16711681)) | (((int) ((f10 * 255.0f) + 0.5f)) << 16);
    }

    public static int string2Int(@NonNull String str) {
        return Color.parseColor(str);
    }

    public static int getRandomColor(boolean z9) {
        return (z9 ? ((int) (Math.random() * 256.0d)) << 24 : ViewCompat.MEASURED_STATE_MASK) | ((int) (Math.random() * 1.6777216E7d));
    }

    public static int setAlphaComponent(@ColorInt int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11) {
        return (i10 & ViewCompat.MEASURED_SIZE_MASK) | (i11 << 24);
    }

    public static int setBlueComponent(@ColorInt int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11) {
        return (i10 & (-256)) | i11;
    }

    public static int setGreenComponent(@ColorInt int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11) {
        return (i10 & (-65281)) | (i11 << 8);
    }

    public static int setRedComponent(@ColorInt int i10, @IntRange(from = 0, m488to = ScatterMapKt.Sentinel) int i11) {
        return (i10 & (-16711681)) | (i11 << 16);
    }
}
