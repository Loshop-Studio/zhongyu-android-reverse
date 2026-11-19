package com.zykj.sketch.core.graph;

import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public class BoundedContainerGraph extends Graph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedContainerGraph(IControl control) {
        super(control);
        AbstractC9979u.m20294g(control, "control");
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        AbstractC9979u.m20293f(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.BOUNDED_CONTAINER_GRAPH;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
        getMOutRect().setEmpty();
        for (Graph graph : getChild()) {
            graph.onMeasure();
            getMOutRect().union(graph.getOutRect());
        }
    }
}
