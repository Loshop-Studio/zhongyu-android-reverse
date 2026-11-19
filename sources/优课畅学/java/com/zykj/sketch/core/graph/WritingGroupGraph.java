package com.zykj.sketch.core.graph;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public class WritingGroupGraph extends BoundedContainerGraph {
    private Bitmap snapshotBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingGroupGraph(IControl control) {
        super(control);
        AbstractC9133u.m16133g(control, "control");
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void addGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        super.addGraph(graph);
        onMeasure();
    }

    public final Path createPath(List<PointF> list) {
        AbstractC9133u.m16133g(list, "list");
        Path path = new Path();
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : list) {
            if (path.isEmpty()) {
                path.moveTo(pointF.x, pointF.y);
                path.lineTo(pointF.x, pointF.y);
            } else {
                float f12 = 2;
                path.quadTo(f10, f11, (pointF.x + f10) / f12, (pointF.y + f11) / f12);
            }
            f10 = pointF.x;
            f11 = pointF.y;
        }
        for (int size = list.size(); size > 0; size--) {
            PointF pointF2 = list.get(size - 1);
            if (path.isEmpty()) {
                float f13 = 1;
                path.moveTo(pointF2.x, pointF2.y - f13);
                path.lineTo(pointF2.x, pointF2.y - f13);
            } else {
                float f14 = 2;
                path.quadTo(f10, f11, (pointF2.x + f10) / f14, ((pointF2.y - 1) + f11) / f14);
            }
            f10 = pointF2.x;
            f11 = pointF2.y - 1;
        }
        if (!path.isEmpty()) {
            path.close();
        }
        list.clear();
        return path;
    }

    public final boolean crossLine(RectF r12, RectF r22) {
        AbstractC9133u.m16133g(r12, "r1");
        AbstractC9133u.m16133g(r22, "r2");
        float f10 = 2;
        return Math.abs(((r12.left + r12.right) / f10) - ((r22.left + r22.right) / f10)) < (((r12.right + r22.right) - r12.left) - r22.left) / f10 && Math.abs(((r12.top + r12.bottom) / f10) - ((r22.top + r22.bottom) / f10)) < (((r12.bottom + r22.bottom) - r12.top) - r22.top) / f10;
    }

    public final List<Graph> getIntersectGraph(float f10, float f11, float f12) {
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(f10, f11, f12)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        AbstractC9133u.m16132f(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.WRITING_GROUP_GRAPH;
    }

    public final Region rectConvertRegion(Path path) {
        AbstractC9133u.m16133g(path, "path");
        path.computeBounds(new RectF(), true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) Math.floor(r0.left), (int) Math.floor(r0.top), (int) Math.ceil(r0.right), (int) Math.ceil(r0.bottom))));
        return region;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void removeGraph(Graph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        super.removeGraph(graph);
        onMeasure();
    }

    public final List<Graph> getIntersectGraph(Path path) {
        AbstractC9133u.m16133g(path, "path");
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(path)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }
}
