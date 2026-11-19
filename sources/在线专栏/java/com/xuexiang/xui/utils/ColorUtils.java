package com.xuexiang.xui.utils;

import android.graphics.Color;
import com.xuexiang.xui.widget.popupwindow.good.IGoodView;
import java.util.Random;

/* loaded from: classes.dex */
public final class ColorUtils {

    public static class RandomColor {
        int alpha;
        int lower;
        int upper;

        RandomColor(int i4, int i5, int i6) {
            if (i6 <= i5) {
                throw new IllegalArgumentException("must be lower < upper");
            }
            setAlpha(i4);
            setLower(i5);
            setUpper(i6);
        }

        public int getAlpha() {
            return this.alpha;
        }

        public int getColor() {
            return Color.argb(getAlpha(), getLower() + new Random().nextInt((getUpper() - getLower()) + 1), getLower() + new Random().nextInt((getUpper() - getLower()) + 1), getLower() + new Random().nextInt((getUpper() - getLower()) + 1));
        }

        int getLower() {
            return this.lower;
        }

        int getUpper() {
            return this.upper;
        }

        public void setAlpha(int i4) {
            if (i4 > 255) {
                i4 = 255;
            }
            if (i4 < 0) {
                i4 = 0;
            }
            this.alpha = i4;
        }

        void setLower(int i4) {
            if (i4 < 0) {
                i4 = 0;
            }
            this.lower = i4;
        }

        void setUpper(int i4) {
            if (i4 > 255) {
                i4 = 255;
            }
            this.upper = i4;
        }
    }

    private ColorUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static String colorToString(int i4) {
        return String.format("#%08X", Integer.valueOf(i4));
    }

    public static int computeColor(int i4, int i5, float f4) {
        float fMax = Math.max(Math.min(f4, 1.0f), IGoodView.DEFAULT_TO_ALPHA);
        return Color.argb(((int) ((Color.alpha(i5) - r0) * fMax)) + Color.alpha(i4), ((int) ((Color.red(i5) - r0) * fMax)) + Color.red(i4), ((int) ((Color.green(i5) - r0) * fMax)) + Color.green(i4), ((int) ((Color.blue(i5) - r4) * fMax)) + Color.blue(i4));
    }

    public static int darker(int i4) {
        return darker(i4, 0.8f);
    }

    public static int getRandomColor() {
        return new RandomColor(255, 0, 255).getColor();
    }

    public static boolean isColorDark(int i4) {
        return isColorDark(i4, 0.5d);
    }

    public static int lighter(int i4) {
        return lighter(i4, 0.8f);
    }

    public static int setColorAlpha(int i4, float f4) {
        return setColorAlpha(i4, f4, true);
    }

    public static int setColorAlpha(int i4, float f4, boolean z3) {
        return (i4 & 16777215) | (((int) (f4 * (z3 ? 255 : 255 & (i4 >> 24)))) << 24);
    }

    public static int darker(int i4, float f4) {
        return Color.argb(Color.alpha(i4), Math.max((int) (Color.red(i4) * f4), 0), Math.max((int) (Color.green(i4) * f4), 0), Math.max((int) (Color.blue(i4) * f4), 0));
    }

    public static boolean isColorDark(int i4, double d4) {
        return 1.0d - ((((((double) Color.red(i4)) * 0.299d) + (((double) Color.green(i4)) * 0.587d)) + (((double) Color.blue(i4)) * 0.114d)) / 255.0d) >= d4;
    }

    public static int lighter(int i4, float f4) {
        float f5 = 1.0f - f4;
        return Color.argb(Color.alpha(i4), (int) ((((Color.red(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.green(i4) * f5) / 255.0f) + f4) * 255.0f), (int) ((((Color.blue(i4) * f5) / 255.0f) + f4) * 255.0f));
    }
}
