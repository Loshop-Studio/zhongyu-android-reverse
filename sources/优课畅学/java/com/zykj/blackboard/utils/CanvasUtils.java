package com.zykj.blackboard.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CanvasUtils {
    public static final CanvasUtils INSTANCE = new CanvasUtils();

    private CanvasUtils() {
    }

    public final void drawLargeBitmap(Canvas canvas, Bitmap largeBitmap, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(largeBitmap, "largeBitmap");
        AbstractC9133u.m16133g(matrix, "matrix");
        int maximumBitmapWidth = canvas.getMaximumBitmapWidth();
        int maximumBitmapHeight = canvas.getMaximumBitmapHeight();
        int width = largeBitmap.getWidth();
        int height = largeBitmap.getHeight();
        int i10 = width / maximumBitmapWidth;
        int i11 = height / maximumBitmapHeight;
        Rect rect = new Rect();
        Matrix matrix2 = new Matrix();
        int i12 = 0;
        while (i12 < i10) {
            int i13 = 0;
            while (i13 < i11) {
                i13++;
                int i14 = maximumBitmapWidth;
                rect.set(i12 * maximumBitmapWidth, i13 * maximumBitmapHeight, (i12 + 1) * maximumBitmapWidth, i13 * maximumBitmapHeight);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(largeBitmap, rect.left, rect.top, rect.width(), rect.height());
                matrix2.setTranslate(rect.left, rect.top);
                matrix2.postConcat(matrix);
                canvas.drawBitmap(bitmapCreateBitmap, matrix2, null);
                maximumBitmapWidth = i14;
            }
            int i15 = maximumBitmapWidth;
            i12++;
            rect.set(i12 * i15, i11 * maximumBitmapHeight, i12 * i15, height);
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(largeBitmap, rect.left, rect.top, rect.width(), rect.height());
            matrix2.setTranslate(rect.left, rect.top);
            matrix2.postConcat(matrix);
            canvas.drawBitmap(bitmapCreateBitmap2, matrix2, null);
            maximumBitmapWidth = i15;
        }
        int i16 = maximumBitmapWidth;
        int i17 = 0;
        while (i17 < i11) {
            int i18 = i17 * maximumBitmapHeight;
            i17++;
            rect.set(i10 * i16, i18, width, i17 * maximumBitmapHeight);
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(largeBitmap, rect.left, rect.top, rect.width(), rect.height());
            matrix2.setTranslate(rect.left, rect.top);
            matrix2.postConcat(matrix);
            canvas.drawBitmap(bitmapCreateBitmap3, matrix2, null);
        }
        rect.set(i10 * i16, i11 * maximumBitmapHeight, width, height);
        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(largeBitmap, rect.left, rect.top, rect.width(), rect.height());
        matrix2.setTranslate(rect.left, rect.top);
        matrix2.postConcat(matrix);
        canvas.drawBitmap(bitmapCreateBitmap4, matrix2, null);
    }
}
