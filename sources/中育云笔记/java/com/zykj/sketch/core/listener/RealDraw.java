package com.zykj.sketch.core.listener;

import android.graphics.RectF;
import com.zykj.sketch.core.graph.Graph;

/* loaded from: classes6.dex */
public interface RealDraw {
    void drawGraph(Graph graph);

    void setDrawBackground(int i10);

    void setLimitDrawArea(RectF rectF);

    void shutdown();
}
