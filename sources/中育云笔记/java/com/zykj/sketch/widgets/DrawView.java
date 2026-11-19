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
import kotlin.jvm.internal.AbstractC9979u;
import p309qc.InterfaceC10770a;

@InterfaceC10770a
/* loaded from: classes6.dex */
public final class DrawView extends View implements RealDraw {
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;
    private Graph graph;
    private RectF limitDrawArea;
    private RectF paintTableArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC9979u.m20294g(context, "context");
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
        AbstractC9979u.m20294g(graph, "graph");
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
    public void setDrawBackground(int i10) {
        this.backgroundId = i10;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void setLimitDrawArea(RectF rectF) {
        this.limitDrawArea = rectF;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void shutdown() {
    }
}
