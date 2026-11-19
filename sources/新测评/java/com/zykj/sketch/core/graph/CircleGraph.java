package com.zykj.sketch.core.graph;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/CircleGraph;", "Lcom/zykj/sketch/core/graph/ShapeGraph;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "rect", "Landroid/graphics/RectF;", "(Lcom/zykj/sketch/core/listener/IControl;Landroid/graphics/RectF;)V", "onMeasure", "", "render", "canvas", "Landroid/graphics/Canvas;", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class CircleGraph extends ShapeGraph {
    private final RectF rect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleGraph(IControl control, RectF rect) {
        super(control);
        Intrinsics.checkNotNullParameter(control, "control");
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.rect = rect;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.drawOval(this.rect, getMPaint());
    }
}
