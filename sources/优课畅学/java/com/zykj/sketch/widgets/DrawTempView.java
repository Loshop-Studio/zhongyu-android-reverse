package com.zykj.sketch.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zykj.sketch.core.listener.ImitateDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class DrawTempView extends View implements ImitateDraw {
    public Map<Integer, View> _$_findViewCache;
    private Bitmap bitmap;
    private Matrix graphMatrix;
    private RectF limitDrawArea;
    private Paint paint;
    private RectF paintTableArea;
    private Path path;
    private RectF rendRectF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawTempView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9133u.m16133g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.rendRectF = new RectF();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i10) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i10);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), viewFindViewById);
        return viewFindViewById;
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void clearGraph() {
        this.path = null;
        this.paint = null;
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.bitmap = null;
        postInvalidate();
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void drawPath(Path path, Paint paint) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(paint, "paint");
        this.path = path;
        this.paint = paint;
        postInvalidate();
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void drawThumbnail(Bitmap bitmap) {
        this.bitmap = bitmap;
        postInvalidate();
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void graphMatrix(Matrix matrix) {
        this.graphMatrix = matrix;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        Paint paint;
        RectF rectF;
        if (canvas != null) {
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        }
        if (canvas != null) {
            RectF rectF2 = this.paintTableArea;
            if (rectF2 == null || (rectF2 != null && rectF2.isEmpty())) {
                this.paintTableArea = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            }
            Matrix matrix = this.graphMatrix;
            if (matrix != null && (rectF = this.limitDrawArea) != null) {
                RectF rectF3 = new RectF();
                this.rendRectF = rectF3;
                if (matrix.mapRect(rectF3, rectF) && this.rendRectF.intersect(this.paintTableArea)) {
                    canvas.clipRect(this.rendRectF);
                }
            }
            Path path = this.path;
            if (path != null && (paint = this.paint) != null) {
                canvas.drawPath(path, paint);
            }
            Bitmap bitmap = this.bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    float width = getWidth() / bitmap.getWidth();
                    float height = getHeight() / bitmap.getHeight();
                    if (width > height) {
                        width = height;
                    }
                    canvas.drawBitmap(Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * width), (int) (bitmap.getHeight() * width), true), (getWidth() - r0.getWidth()) / 2.0f, (getHeight() - r0.getHeight()) / 2.0f, (Paint) null);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void setLimitDrawArea(RectF rectF) {
        this.limitDrawArea = rectF;
    }
}
