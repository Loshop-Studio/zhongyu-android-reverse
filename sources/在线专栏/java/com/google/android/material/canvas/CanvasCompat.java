package com.google.android.material.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class CanvasCompat {
    private CanvasCompat() {
    }

    public static int saveLayerAlpha(Canvas canvas, RectF rectF, int i4) {
        return canvas.saveLayerAlpha(rectF, i4);
    }

    public static int saveLayerAlpha(Canvas canvas, float f4, float f5, float f6, float f7, int i4) {
        return canvas.saveLayerAlpha(f4, f5, f6, f7, i4);
    }
}
