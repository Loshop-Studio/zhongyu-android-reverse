package com.zykj.sketch.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.listener.RealDraw;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Deprecated(message = "性能问题")
@Metadata(m5109d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010!\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 ¨\u0006\""}, m5110d2 = {"Lcom/zykj/sketch/widgets/DrawView;", "Landroid/view/View;", "Lcom/zykj/sketch/core/listener/RealDraw;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "Ld6/s;", "drawGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "", "colorId", "setDrawBackground", "(I)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "shutdown", "()V", "Lcom/zykj/sketch/core/graph/Graph;", "backgroundId", "I", "limitDrawArea", "Landroid/graphics/RectF;", "paintTableArea", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class DrawView extends View implements RealDraw {

    @NotNull
    public Map<Integer, View> _$_findViewCache;
    private int backgroundId;

    @Nullable
    private Graph graph;

    @Nullable
    private RectF limitDrawArea;

    @Nullable
    private RectF paintTableArea;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC5830k.m5330g(context, "context");
        this._$_findViewCache = new LinkedHashMap();
        this.backgroundId = -1;
        setLayerType(2, null);
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

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void drawGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        this.graph = graph;
        postInvalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@Nullable Canvas canvas) {
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
    public void setLimitDrawArea(@Nullable RectF rectF) {
        this.limitDrawArea = rectF;
    }

    @Override // com.zykj.sketch.core.listener.RealDraw
    public void shutdown() {
    }
}
