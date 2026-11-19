package com.zykj.sketch.core.graph;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.listener.IControl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, m13558d2 = {"Lcom/zykj/sketch/core/graph/UnBoundedContainerGraph;", "Lcom/zykj/sketch/core/graph/Graph;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "isInRect", "", "x", "", "y", TypedValues.CycleType.S_WAVE_OFFSET, "onMeasure", "", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class UnBoundedContainerGraph extends Graph {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnBoundedContainerGraph(IControl control) {
        super(control);
        Intrinsics.checkNotNullParameter(control, "control");
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphData getSnapshot() {
        GraphSnapshot.GraphData graphDataBuild = getSnapshotBuild().build();
        Intrinsics.checkNotNullExpressionValue(graphDataBuild, "getSnapshotBuild().build()");
        return graphDataBuild;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public GraphSnapshot.GraphType graphType() {
        return GraphSnapshot.GraphType.UNBOUNDED_CONTAINER_GRAPH;
    }

    @Override // com.zykj.sketch.core.graph.Graph, com.zykj.sketch.core.listener.IGraph
    public boolean isInRect(float x9, float y9, float offset) {
        return false;
    }

    @Override // com.zykj.sketch.core.listener.IGraph
    public void onMeasure() {
    }
}
