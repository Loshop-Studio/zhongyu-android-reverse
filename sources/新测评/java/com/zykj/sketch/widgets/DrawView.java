package com.zykj.sketch.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated(message = "性能问题")
@Metadata(m13557d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0015J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\tH\u0016J\u0012\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0018\u001a\u00020\u0010H\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m13558d2 = {"Lcom/zykj/sketch/widgets/DrawView;", "Landroid/view/View;", "Lcom/zykj/sketch/core/listener/RealDraw;", "context", "Landroid/content/Context;", "attr", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "backgroundId", "", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "limitDrawArea", "Landroid/graphics/RectF;", "paintTableArea", "drawGraph", "", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setDrawBackground", "colorId", "setLimitDrawArea", "rectF", "shutdown", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class DrawView extends View implements RealDraw {
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;
    private Graph graph;
    private RectF limitDrawArea;
    private RectF paintTableArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.backgroundId = -1;
        setLayerType(2, null);
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

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        this.graph = graph;
        postInvalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(Canvas canvas) {
        RectF rectF;
        if (canvas != null) {
            canvas.drawColor(this.backgroundId);
        }
        RectF rectF2 = this.paintTableArea;
        if (rectF2 == null || (rectF2 != null && rectF2.isEmpty())) {
            this.paintTableArea = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        RectF rectF3 = this.limitDrawArea;
        if (rectF3 == null || (rectF3 != null && rectF3.isEmpty())) {
            this.limitDrawArea = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        RectF rectF4 = this.limitDrawArea;
        if (rectF4 != null && (rectF = this.paintTableArea) != null && rectF.intersect(rectF4) && canvas != null) {
            canvas.clipRect(rectF);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Graph graph = this.graph;
            if (graph != null) {
                graph.onDraw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setDrawBackground(int colorId) {
        this.backgroundId = colorId;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setLimitDrawArea(RectF rectF) {
        this.limitDrawArea = rectF;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void shutdown() {
    }
}
