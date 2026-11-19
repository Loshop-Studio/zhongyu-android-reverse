package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class GraphRemoveExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.GraphRemove> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public GraphRemoveExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.GraphRemove data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.GraphRemove data) {
        AbstractC9133u.m16133g(data, "data");
        ArrayList arrayList = new ArrayList();
        List<EzyCommand.CommandSource.CommandInfo.GraphData> listM7862h = data.m7862h();
        AbstractC9133u.m16132f(listM7862h, "data.graphDataList");
        for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM7862h) {
            IGraph iGraphRootGraph = this.graphControl.rootGraph();
            if (iGraphRootGraph != null) {
                String strM7762u = graphData.m7762u();
                AbstractC9133u.m16132f(strM7762u, "it.graphId");
                Graph graphFindById = iGraphRootGraph.findById(strM7762u);
                if (graphFindById != null) {
                    arrayList.add(graphFindById);
                }
            }
        }
        this.graphControl.delete(arrayList);
    }
}
