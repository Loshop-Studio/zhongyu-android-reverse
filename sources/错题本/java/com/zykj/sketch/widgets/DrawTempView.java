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
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.listener.ImitateDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010'¨\u0006*"}, m5110d2 = {"Lcom/zykj/sketch/widgets/DrawTempView;", "Landroid/view/View;", "Lcom/zykj/sketch/core/listener/ImitateDraw;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Paint;", "paint", "Ld6/s;", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "Landroid/graphics/Matrix;", "matrix", "graphMatrix", "(Landroid/graphics/Matrix;)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "clearGraph", "()V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/Bitmap;", "bitmap", "drawThumbnail", "(Landroid/graphics/Bitmap;)V", "Landroid/graphics/Path;", "Landroid/graphics/Paint;", "Landroid/graphics/Bitmap;", "Landroid/graphics/Matrix;", "paintTableArea", "Landroid/graphics/RectF;", "rendRectF", "limitDrawArea", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DrawTempView extends View implements ImitateDraw {

    @NotNull
    public Map<Integer, View> _$_findViewCache;

    @Nullable
    private Bitmap bitmap;

    @Nullable
    private Matrix graphMatrix;

    @Nullable
    private RectF limitDrawArea;

    @Nullable
    private Paint paint;

    @Nullable
    private RectF paintTableArea;

    @Nullable
    private Path path;

    @NotNull
    private RectF rendRectF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawTempView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.rendRectF = new RectF();
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    @Nullable
    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(i);
        if (viewFindViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), viewFindViewById);
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
    public void drawPath(@NotNull Path path, @NotNull Paint paint) {
        AbstractC5830k.m5330g(path, "path");
        AbstractC5830k.m5330g(paint, "paint");
        this.path = path;
        this.paint = paint;
        postInvalidate();
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void drawThumbnail(@Nullable Bitmap bitmap) {
        this.bitmap = bitmap;
        postInvalidate();
    }

    @Override // com.zykj.sketch.core.listener.ImitateDraw
    public void graphMatrix(@Nullable Matrix matrix) {
        this.graphMatrix = matrix;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
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
    public void setLimitDrawArea(@Nullable RectF rectF) {
        this.limitDrawArea = rectF;
    }
}
