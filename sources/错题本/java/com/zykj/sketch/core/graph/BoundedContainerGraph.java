package com.zykj.sketch.core.graph;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m5110d2 = {"Lcom/zykj/sketch/core/graph/BoundedContainerGraph;", "Lcom/zykj/sketch/core/graph/Graph;", "Lcom/zykj/sketch/core/listener/IControl;", "control", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Ld6/s;", "onMeasure", "()V", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class BoundedContainerGraph extends Graph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedContainerGraph(@NotNull IControl control) {
        super(control);
        AbstractC5830k.m5330g(control, "control");
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    @NotNull
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        AbstractC5830k.m5329f(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    @NotNull
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
