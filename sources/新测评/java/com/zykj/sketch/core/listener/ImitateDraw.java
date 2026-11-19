package com.zykj.sketch.core.listener;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u000eH&J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&¨\u0006\u0012"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/ImitateDraw;", "", "clearGraph", "", "drawPath", "path", "Landroid/graphics/Path;", "paint", "Landroid/graphics/Paint;", "drawThumbnail", "bitmap", "Landroid/graphics/Bitmap;", "graphMatrix", "matrix", "Landroid/graphics/Matrix;", "setLimitDrawArea", "rectF", "Landroid/graphics/RectF;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface ImitateDraw {
    void clearGraph();

    void drawPath(Path path, Paint paint);

    void drawThumbnail(Bitmap bitmap);

    void graphMatrix(Matrix matrix);

    void setLimitDrawArea(RectF rectF);
}
