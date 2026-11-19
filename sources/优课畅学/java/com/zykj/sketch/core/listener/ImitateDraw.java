package com.zykj.sketch.core.listener;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes3.dex */
public interface ImitateDraw {
    void clearGraph();

    void drawPath(Path path, Paint paint);

    void drawThumbnail(Bitmap bitmap);

    void graphMatrix(Matrix matrix);

    void setLimitDrawArea(RectF rectF);
}
