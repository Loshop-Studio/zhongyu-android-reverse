package com.zykj.sketch.core.graph;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000f¨\u0006\u0010"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/RectGraph;", "Lcom/zykj/sketch/core/graph/ShapeGraph;", "Lcom/zykj/sketch/core/listener/IControl;", "control", "Landroid/graphics/RectF;", "rect", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;Landroid/graphics/RectF;)V", "Landroid/graphics/Canvas;", "canvas", "Ld6/s;", "render", "(Landroid/graphics/Canvas;)V", "onMeasure", "()V", "Landroid/graphics/RectF;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class RectGraph extends ShapeGraph {

    @NotNull
    private final RectF rect;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectGraph(@NotNull IControl control, @NotNull RectF rect) {
        super(control);
        AbstractC5830k.m5330g(control, "control");
        AbstractC5830k.m5330g(rect, "rect");
        this.rect = rect;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IDraw
    public void render(@NotNull Canvas canvas) {
        AbstractC5830k.m5330g(canvas, "canvas");
        canvas.drawRect(this.rect, getMPaint());
    }
}
