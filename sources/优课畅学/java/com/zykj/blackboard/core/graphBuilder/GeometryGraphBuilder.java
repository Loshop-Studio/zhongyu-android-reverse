package com.zykj.blackboard.core.graphBuilder;

import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class GeometryGraphBuilder implements GraphBuild {
    @Override // com.zykj.blackboard.core.graphBuilder.GraphBuild
    public Graph build(EzyCommand.CommandSource.CommandInfo.GraphData graphData, SourceLoader sourceLoad) {
        AbstractC9133u.m16133g(graphData, "graphData");
        AbstractC9133u.m16133g(sourceLoad, "sourceLoad");
        String strM7762u = graphData.m7762u();
        AbstractC9133u.m16132f(strM7762u, "graphData.graphId");
        EzyRectF.RectF rectFM7763v = graphData.m7763v();
        AbstractC9133u.m16132f(rectFM7763v, "graphData.outRect");
        return new GeometryGraph(strM7762u, GraphUtilsKt.covertRectF(rectFM7763v), sourceLoad, graphData.m7765x(), Integer.valueOf(graphData.m7766y()));
    }
}
