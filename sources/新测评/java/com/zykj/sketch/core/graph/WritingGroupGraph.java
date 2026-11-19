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
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0014\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0016\u001a\u00020\fJ$\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010!\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, m13558d2 = {"Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "Lcom/zykj/sketch/core/graph/BoundedContainerGraph;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "snapshotBitmap", "Landroid/graphics/Bitmap;", "addGraph", "", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "createPath", "Landroid/graphics/Path;", "list", "", "Landroid/graphics/PointF;", "crossLine", "", "r1", "Landroid/graphics/RectF;", "r2", "getIntersectGraph", "path", "x", "", "y", "radius", "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "rectConvertRegion", "Landroid/graphics/Region;", "removeGraph", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public class WritingGroupGraph extends BoundedContainerGraph {
    private Bitmap snapshotBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingGroupGraph(IControl control) {
        super(control);
        Intrinsics.checkNotNullParameter(control, "control");
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void addGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.addGraph(graph);
        onMeasure();
    }

    public final Path createPath(List<PointF> list) {
        Intrinsics.checkNotNullParameter(list, "list");
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
        Intrinsics.checkNotNullParameter(r12, "r1");
        Intrinsics.checkNotNullParameter(r22, "r2");
        float f10 = 2;
        return Math.abs(((r12.left + r12.right) / f10) - ((r22.left + r22.right) / f10)) < (((r12.right + r22.right) - r12.left) - r22.left) / f10 && Math.abs(((r12.top + r12.bottom) / f10) - ((r22.top + r22.bottom) / f10)) < (((r12.bottom + r22.bottom) - r12.top) - r22.top) / f10;
    }

    public final List<Graph> getIntersectGraph(float x9, float y9, float radius) {
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(x9, y9, radius)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        Intrinsics.checkNotNullExpressionValue(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.WRITING_GROUP_GRAPH;
    }

    public final Region rectConvertRegion(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        path.computeBounds(new RectF(), true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) Math.floor(r0.left), (int) Math.floor(r0.top), (int) Math.ceil(r0.right), (int) Math.ceil(r0.bottom))));
        return region;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void removeGraph(Graph graph) {
        Intrinsics.checkNotNullParameter(graph, "graph");
        super.removeGraph(graph);
        onMeasure();
    }

    public final List<Graph> getIntersectGraph(Path path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(path)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }
}
