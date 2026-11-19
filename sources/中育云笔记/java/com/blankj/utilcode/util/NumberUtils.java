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

    public static String format(float f10, int i10) {
        return format(f10, false, 1, i10, true);
    }

    public static DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }

    public static String format(float f10, int i10, boolean z10) {
        return format(f10, false, 1, i10, z10);
    }

    public static String format(float f10, int i10, int i11, boolean z10) {
        return format(f10, false, i10, i11, z10);
    }

    public static String format(float f10, boolean z10, int i10) {
        return format(f10, z10, 1, i10, true);
    }

    public static String format(float f10, boolean z10, int i10, boolean z11) {
        return format(f10, z10, 1, i10, z11);
    }

    public static String format(float f10, boolean z10, int i10, int i11, boolean z11) {
        return format(float2Double(f10), z10, i10, i11, z11);
    }

    public static String format(double d10, int i10) {
        return format(d10, false, 1, i10, true);
    }

    public static String format(double d10, int i10, boolean z10) {
        return format(d10, false, 1, i10, z10);
    }

    public static String format(double d10, int i10, int i11, boolean z10) {
        return format(d10, false, i10, i11, z10);
    }

    public static String format(double d10, boolean z10, int i10) {
        return format(d10, z10, 1, i10, true);
    }

    public static String format(double d10, boolean z10, int i10, boolean z11) {
        return format(d10, z10, 1, i10, z11);
    }

    public static String format(double d10, boolean z10, int i10, int i11, boolean z11) {
        DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z10);
        safeDecimalFormat.setRoundingMode(z11 ? RoundingMode.HALF_UP : RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(i10);
        safeDecimalFormat.setMinimumFractionDigits(i11);
        safeDecimalFormat.setMaximumFractionDigits(i11);
        return safeDecimalFormat.format(d10);
    }
}
