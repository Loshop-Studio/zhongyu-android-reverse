package com.blankj.utilcode.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* loaded from: classes3.dex */
public final class NumberUtils {
    private static final ThreadLocal<DecimalFormat> DF_THREAD_LOCAL = new ThreadLocal<DecimalFormat>() { // from class: com.blankj.utilcode.util.NumberUtils.1
        @Override // java.lang.ThreadLocal
        public DecimalFormat initialValue() {
            return (DecimalFormat) NumberFormat.getInstance();
        }
    };

    private NumberUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static double float2Double(float f10) {
        return new BigDecimal(String.valueOf(f10)).doubleValue();
    }

    public static String format(float f10, int i9) {
        return format(f10, false, 1, i9, true);
    }

    public static DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }

    public static String format(float f10, int i9, boolean z9) {
        return format(f10, false, 1, i9, z9);
    }

    public static String format(float f10, int i9, int i10, boolean z9) {
        return format(f10, false, i9, i10, z9);
    }

    public static String format(float f10, boolean z9, int i9) {
        return format(f10, z9, 1, i9, true);
    }

    public static String format(float f10, boolean z9, int i9, boolean z10) {
        return format(f10, z9, 1, i9, z10);
    }

    public static String format(float f10, boolean z9, int i9, int i10, boolean z10) {
        return format(float2Double(f10), z9, i9, i10, z10);
    }

    public static String format(double d10, int i9) {
        return format(d10, false, 1, i9, true);
    }

    public static String format(double d10, int i9, boolean z9) {
        return format(d10, false, 1, i9, z9);
    }

    public static String format(double d10, int i9, int i10, boolean z9) {
        return format(d10, false, i9, i10, z9);
    }

    public static String format(double d10, boolean z9, int i9) {
        return format(d10, z9, 1, i9, true);
    }

    public static String format(double d10, boolean z9, int i9, boolean z10) {
        return format(d10, z9, 1, i9, z10);
    }

    public static String format(double d10, boolean z9, int i9, int i10, boolean z10) {
        DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z9);
        safeDecimalFormat.setRoundingMode(z10 ? RoundingMode.HALF_UP : RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(i9);
        safeDecimalFormat.setMinimumFractionDigits(i10);
        safeDecimalFormat.setMaximumFractionDigits(i10);
        return safeDecimalFormat.format(d10);
    }
}
