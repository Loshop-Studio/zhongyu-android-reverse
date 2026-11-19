package com.zykj.sketch.core.listener;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&J\b\u0010\f\u001a\u00020\u0003H&¨\u0006\r"}, m13413d2 = {"Lcom/zykj/sketch/core/listener/RealDraw;", "", "drawGraph", "", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "setDrawBackground", "colorId", "", "setLimitDrawArea", "rectF", "Landroid/graphics/RectF;", "shutdown", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public interface RealDraw {
    void drawGraph(Graph graph);

    void setDrawBackground(int colorId);

    void setLimitDrawArea(RectF rectF);

    void shutdown();
}
