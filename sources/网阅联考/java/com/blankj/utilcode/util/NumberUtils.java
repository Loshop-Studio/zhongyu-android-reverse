package com.blankj.utilcode.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/* loaded from: classes2.dex */
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

    public static double float2Double(float f4) {
        return new BigDecimal(String.valueOf(f4)).doubleValue();
    }

    public static String format(float f4, int i4) {
        return format(f4, false, 1, i4, true);
    }

    public static DecimalFormat getSafeDecimalFormat() {
        return DF_THREAD_LOCAL.get();
    }

    public static String format(float f4, int i4, boolean z3) {
        return format(f4, false, 1, i4, z3);
    }

    public static String format(float f4, int i4, int i5, boolean z3) {
        return format(f4, false, i4, i5, z3);
    }

    public static String format(float f4, boolean z3, int i4) {
        return format(f4, z3, 1, i4, true);
    }

    public static String format(float f4, boolean z3, int i4, boolean z4) {
        return format(f4, z3, 1, i4, z4);
    }

    public static String format(float f4, boolean z3, int i4, int i5, boolean z4) {
        return format(float2Double(f4), z3, i4, i5, z4);
    }

    public static String format(double d4, int i4) {
        return format(d4, false, 1, i4, true);
    }

    public static String format(double d4, int i4, boolean z3) {
        return format(d4, false, 1, i4, z3);
    }

    public static String format(double d4, int i4, int i5, boolean z3) {
        return format(d4, false, i4, i5, z3);
    }

    public static String format(double d4, boolean z3, int i4) {
        return format(d4, z3, 1, i4, true);
    }

    public static String format(double d4, boolean z3, int i4, boolean z4) {
        return format(d4, z3, 1, i4, z4);
    }

    public static String format(double d4, boolean z3, int i4, int i5, boolean z4) {
        DecimalFormat safeDecimalFormat = getSafeDecimalFormat();
        safeDecimalFormat.setGroupingUsed(z3);
        safeDecimalFormat.setRoundingMode(z4 ? RoundingMode.HALF_UP : RoundingMode.DOWN);
        safeDecimalFormat.setMinimumIntegerDigits(i4);
        safeDecimalFormat.setMinimumFractionDigits(i5);
        safeDecimalFormat.setMaximumFractionDigits(i5);
        return safeDecimalFormat.format(d4);
    }
}
