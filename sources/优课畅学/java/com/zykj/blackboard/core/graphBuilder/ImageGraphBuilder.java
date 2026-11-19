package com.zykj.blackboard.core.graphBuilder;

import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyRectF;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ImageGraphBuilder implements GraphBuild {
    @Override // com.zykj.blackboard.core.graphBuilder.GraphBuild
    public Graph build(EzyCommand.CommandSource.CommandInfo.GraphData graphData, SourceLoader sourceLoad) {
        AbstractC9133u.m16133g(graphData, "graphData");
        AbstractC9133u.m16133g(sourceLoad, "sourceLoad");
        String strM7762u = graphData.m7762u();
        AbstractC9133u.m16132f(strM7762u, "graphData.graphId");
        EzyRectF.RectF rectFM7763v = graphData.m7763v();
        AbstractC9133u.m16132f(rectFM7763v, "graphData.outRect");
        RectF rectFCovertRectF = GraphUtilsKt.covertRectF(rectFM7763v);
        String strM7765x = graphData.m7765x();
        AbstractC9133u.m16132f(strM7765x, "graphData.sourceFileName");
        return new ImageGraph(strM7762u, rectFCovertRectF, sourceLoad, strM7765x, graphData.m7766y());
    }
}
