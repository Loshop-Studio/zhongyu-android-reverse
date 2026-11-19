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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0019\u001a\u00020\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\rH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m13558d2 = {"Lcom/zykj/sketch/widgets/DrawTempView;", "Landroid/view/View;", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bitmap", "Landroid/graphics/Bitmap;", "graphMatrix", "Landroid/graphics/Matrix;", "limitDrawArea", "Landroid/graphics/RectF;", "paint", "Landroid/graphics/Paint;", "paintTableArea", "path", "Landroid/graphics/Path;", "rendRectF", "clearGraph", "", "drawPath", "drawThumbnail", "matrix", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setLimitDrawArea", "rectF", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
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
        Intrinsics.checkNotNullParameter(context, "context");
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
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(paint, "paint");
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
