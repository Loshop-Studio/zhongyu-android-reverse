package com.zykj.blackboard.utils;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8801r;

/* loaded from: classes4.dex */
public final class GraphHelper {
    public static final GraphHelper INSTANCE = new GraphHelper();

    private GraphHelper() {
    }

    public final StrokeGraph createStrokeGraph(SourceLoader sourceLoader, PointF... points) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(points, "points");
        PointF pointF = (PointF) AbstractC8801r.m14735u0(points);
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
