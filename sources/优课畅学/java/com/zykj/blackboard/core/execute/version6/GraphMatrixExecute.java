package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.GraphMatrixThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class GraphMatrixExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.GraphMatrix> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public GraphMatrixExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.GraphMatrix data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String strM7816r = data.m7816r();
        AbstractC9133u.m16132f(strM7816r, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixCache = sourceLoader.getMatrixCache(strM7816r, data.m7817s());
        if (matrixCache == null) {
            return null;
        }
        GraphMatrixThread graphMatrixThread = new GraphMatrixThread();
        graphMatrixThread.setGraphControl(this.graphControl);
        graphMatrixThread.setSourceLoader(this.sourceLoader);
        List<EzyCommand.CommandSource.CommandInfo.GraphData> listM7813o = data.m7813o();
        AbstractC9133u.m16132f(listM7813o, "data.graphDataList");
        graphMatrixThread.setMatrixInfo(listM7813o, matrixCache, j10);
        return graphMatrixThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.GraphMatrix data) {
        AbstractC9133u.m16133g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String strM7816r = data.m7816r();
        AbstractC9133u.m16132f(strM7816r, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixCache = sourceLoader.getMatrixCache(strM7816r, data.m7817s());
        if (matrixCache != null) {
            ArrayList arrayList = new ArrayList();
            List<EzyCommand.CommandSource.CommandInfo.GraphData> listM7813o = data.m7813o();
            AbstractC9133u.m16132f(listM7813o, "data.graphDataList");
            for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : listM7813o) {
                IGraph iGraphRootGraph = this.graphControl.rootGraph();
                if (iGraphRootGraph != null) {
                    String strM7762u = graphData.m7762u();
                    AbstractC9133u.m16132f(strM7762u, "graph.graphId");
                    Graph graphFindById = iGraphRootGraph.findById(strM7762u);
                    if (graphFindById != null) {
                        arrayList.add(graphFindById);
                    }
                }
            }
            IGraphControl iGraphControl = this.graphControl;
            List matrixList = matrixCache.getMatrixList();
            AbstractC9133u.m16132f(matrixList, "it.matrixList");
            Object objM14578x0 = AbstractC8778f0.m14578x0(matrixList);
            AbstractC9133u.m16132f(objM14578x0, "it.matrixList.last()");
            iGraphControl.translationEnd(arrayList, MatrixExtKt.toMatrix((EzyMatrix.Matrix) objM14578x0));
        }
    }
}
