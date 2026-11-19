package com.xuexiang.xui.widget.imageview.crop;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
final class ImageViewUtil {
    private ImageViewUtil() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    static Rect getBitmapRectCenterInside(Bitmap bitmap, View view) {
        return getBitmapRectCenterInsideHelper(bitmap.getWidth(), bitmap.getHeight(), view.getWidth(), view.getHeight());
    }

    private static Rect getBitmapRectCenterInsideHelper(int i4, int i5, int i6, int i7) {
        double d4;
        double d5;
        long jRound;
        int i8;
        double d6 = i6 < i4 ? i6 / i4 : Double.POSITIVE_INFINITY;
        double d7 = i7 < i5 ? i7 / i5 : Double.POSITIVE_INFINITY;
        if (d6 == Double.POSITIVE_INFINITY && d7 == Double.POSITIVE_INFINITY) {
            d4 = i5;
            d5 = i4;
        } else if (d6 <= d7) {
            double d8 = i6;
            double d9 = (i5 * d8) / i4;
            d5 = d8;
            d4 = d9;
        } else {
            d4 = i7;
            d5 = (i4 * d4) / i5;
        }
        double d10 = i6;
        int iRound = 0;
        if (d5 == d10) {
            jRound = Math.round((i7 - d4) / 2.0d);
        } else {
            double d11 = i7;
            if (d4 == d11) {
                iRound = (int) Math.round((d10 - d5) / 2.0d);
                i8 = 0;
                return new Rect(iRound, i8, ((int) Math.ceil(d5)) + iRound, ((int) Math.ceil(d4)) + i8);
            }
            iRound = (int) Math.round((d10 - d5) / 2.0d);
            jRound = Math.round((d11 - d4) / 2.0d);
        }
        i8 = (int) jRound;
        return new Rect(iRound, i8, ((int) Math.ceil(d5)) + iRound, ((int) Math.ceil(d4)) + i8);
    }

    static Rect getBitmapRectCenterInside(int i4, int i5, int i6, int i7) {
        return getBitmapRectCenterInsideHelper(i4, i5, i6, i7);
    }
}
