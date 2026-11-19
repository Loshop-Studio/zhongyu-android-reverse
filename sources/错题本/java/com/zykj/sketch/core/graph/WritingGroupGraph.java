package com.zykj.sketch.core.graph;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0010¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "Lcom/zykj/sketch/core/graph/BoundedContainerGraph;", "Lcom/zykj/sketch/core/listener/IControl;", "control", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "Ld6/s;", "addGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "removeGraph", "", "x", "y", "radius", "", "getIntersectGraph", "(FFF)Ljava/util/List;", "Landroid/graphics/Path;", "path", "(Landroid/graphics/Path;)Ljava/util/List;", "Landroid/graphics/Region;", "rectConvertRegion", "(Landroid/graphics/Path;)Landroid/graphics/Region;", "Landroid/graphics/RectF;", "r1", "r2", "", "crossLine", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z", "Landroid/graphics/PointF;", "list", "createPath", "(Ljava/util/List;)Landroid/graphics/Path;", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "Landroid/graphics/Bitmap;", "snapshotBitmap", "Landroid/graphics/Bitmap;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class WritingGroupGraph extends BoundedContainerGraph {

    @Nullable
    private Bitmap snapshotBitmap;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingGroupGraph(@NotNull IControl control) {
        super(control);
        AbstractC5830k.m5330g(control, "control");
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void addGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        super.addGraph(graph);
        onMeasure();
    }

    @NotNull
    public final Path createPath(@NotNull List<PointF> list) {
        AbstractC5830k.m5330g(list, "list");
        Path path = new Path();
        float f = 0.0f;
        float f7 = 0.0f;
        for (PointF pointF : list) {
            if (path.isEmpty()) {
                path.moveTo(pointF.x, pointF.y);
                path.lineTo(pointF.x, pointF.y);
            } else {
                float f8 = 2;
                path.quadTo(f, f7, (pointF.x + f) / f8, (pointF.y + f7) / f8);
            }
            f = pointF.x;
            f7 = pointF.y;
        }
        for (int size = list.size(); size > 0; size--) {
            PointF pointF2 = list.get(size - 1);
            if (path.isEmpty()) {
                float f9 = 1;
                path.moveTo(pointF2.x, pointF2.y - f9);
                path.lineTo(pointF2.x, pointF2.y - f9);
            } else {
                float f10 = 2;
                path.quadTo(f, f7, (pointF2.x + f) / f10, ((pointF2.y - 1) + f7) / f10);
            }
            f = pointF2.x;
            f7 = pointF2.y - 1;
        }
        if (!path.isEmpty()) {
            path.close();
        }
        list.clear();
        return path;
    }

    public final boolean crossLine(@NotNull RectF r1, @NotNull RectF r22) {
        AbstractC5830k.m5330g(r1, "r1");
        AbstractC5830k.m5330g(r22, "r2");
        float f = 2;
        return Math.abs(((r1.left + r1.right) / f) - ((r22.left + r22.right) / f)) < (((r1.right + r22.right) - r1.left) - r22.left) / f && Math.abs(((r1.top + r1.bottom) / f) - ((r22.top + r22.bottom) / f)) < (((r1.bottom + r22.bottom) - r1.top) - r22.top) / f;
    }

    @NotNull
    public final List<Graph> getIntersectGraph(float x3, float y2, float radius) {
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(x3, y2, radius)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        AbstractC5830k.m5329f(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.graph.BoundedContainerGraph, com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.WRITING_GROUP_GRAPH;
    }

    @NotNull
    public final Region rectConvertRegion(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "path");
        path.computeBounds(new RectF(), true);
        Region region = new Region();
        region.setPath(path, new Region(new Rect((int) Math.floor(r0.left), (int) Math.floor(r0.top), (int) Math.ceil(r0.right), (int) Math.ceil(r0.bottom))));
        return region;
    }

    @Override // com.zykj.sketch.core.graph.Graph
    public void removeGraph(@NotNull Graph graph) {
        AbstractC5830k.m5330g(graph, "graph");
        super.removeGraph(graph);
        onMeasure();
    }

    @NotNull
    public final List<Graph> getIntersectGraph(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "path");
        ArrayList arrayList = new ArrayList();
        for (Graph graph : getChild()) {
            if ((graph instanceof StrokeGraph) && ((StrokeGraph) graph).isIntersect(path)) {
                arrayList.add(graph);
            }
        }
        return arrayList;
    }
}
