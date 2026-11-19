package com.zykj.sketch.core.listener;

import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.core.graph.Graph;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/RealDraw;", "", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "Ld6/s;", "drawGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "", "colorId", "setDrawBackground", "(I)V", "Landroid/graphics/RectF;", "rectF", "setLimitDrawArea", "(Landroid/graphics/RectF;)V", "shutdown", "()V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface RealDraw {
    void drawGraph(@NotNull Graph graph);

    void setDrawBackground(int colorId);

    void setLimitDrawArea(@Nullable RectF rectF);

    void shutdown();
}
