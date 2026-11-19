package com.zykj.sketch.core.graph;

import android.graphics.Canvas;
import android.graphics.RectF;
import com.zykj.sketch.core.listener.IControl;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class CircleGraph extends ShapeGraph {
    private final RectF rect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleGraph(IControl control, RectF rect) {
        super(control);
        AbstractC9133u.m16133g(control, "control");
        AbstractC9133u.m16133g(rect, "rect");
        this.rect = rect;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(Canvas canvas) {
        AbstractC9133u.m16133g(canvas, "canvas");
        canvas.drawOval(this.rect, getMPaint());
    }
}
