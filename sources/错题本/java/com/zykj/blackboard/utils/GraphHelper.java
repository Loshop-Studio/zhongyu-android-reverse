package com.zykj.blackboard.utils;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import kotlin.Metadata;
import kotlin.collections.AbstractC5802q;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/blackboard/utils/GraphHelper;", "", "()V", "createStrokeGraph", "Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;", "sourceLoader", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "points", "", "Landroid/graphics/PointF;", "(Lcom/zykj/blackboard/core/loader/SourceLoader;[Landroid/graphics/PointF;)Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphHelper {

    @NotNull
    public static final GraphHelper INSTANCE = new GraphHelper();

    private GraphHelper() {
    }

    @NotNull
    public final StrokeGraph createStrokeGraph(@NotNull SourceLoader sourceLoader, @NotNull PointF... points) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(points, "points");
        PointF pointF = (PointF) AbstractC5802q.m5191R(points);
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        for (PointF pointF2 : points) {
            path.lineTo(pointF2.x, pointF2.y);
        }
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        StrokeGraph strokeGraph = new StrokeGraph("", rectF, sourceLoader, "", 1);
        strokeGraph.updatePath(path);
        return strokeGraph;
    }
}
