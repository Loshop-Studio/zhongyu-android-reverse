package com.zykj.blackboard.core.graphBuilder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyRectF$RectF;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, m5110d2 = {"Lcom/zykj/blackboard/core/graphBuilder/GroupGraphBuilder;", "Lcom/zykj/blackboard/core/graphBuilder/GraphBuild;", "()V", "build", "Lcom/zykj/blackboard/core/graph/Graph;", "graphData", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "sourceLoad", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GroupGraphBuilder implements GraphBuild {
    @Override // com.zykj.blackboard.core.graphBuilder.GraphBuild
    @NotNull
    public Graph build(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData graphData, @NotNull SourceLoader sourceLoad) {
        AbstractC5830k.m5330g(graphData, "graphData");
        AbstractC5830k.m5330g(sourceLoad, "sourceLoad");
        String graphId = graphData.getGraphId();
        AbstractC5830k.m5329f(graphId, "graphData.graphId");
        EzyRectF$RectF outRect = graphData.getOutRect();
        AbstractC5830k.m5329f(outRect, "graphData.outRect");
        return new GroupGraph(graphId, GraphUtilsKt.covertRectF(outRect), null, null, 12, null);
    }
}
