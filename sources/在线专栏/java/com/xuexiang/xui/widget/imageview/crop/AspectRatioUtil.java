package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Rect;

/* loaded from: classes.dex */
final class AspectRatioUtil {
    private AspectRatioUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static float calculateAspectRatio(float f4, float f5, float f6, float f7) {
        return (f6 - f4) / (f7 - f5);
    }

    static float calculateAspectRatio(Rect rect) {
        return rect.width() / rect.height();
    }

    static float calculateBottom(float f4, float f5, float f6, float f7) {
        return ((f6 - f4) / f7) + f5;
    }

    static float calculateHeight(float f4, float f5, float f6) {
        return (f5 - f4) / f6;
    }

    static float calculateLeft(float f4, float f5, float f6, float f7) {
        return f5 - (f7 * (f6 - f4));
    }

    static float calculateRight(float f4, float f5, float f6, float f7) {
        return (f7 * (f6 - f5)) + f4;
    }

    static float calculateTop(float f4, float f5, float f6, float f7) {
        return f6 - ((f5 - f4) / f7);
    }

    static float calculateWidth(float f4, float f5, float f6) {
        return f6 * (f5 - f4);
    }
}
