package com.zykj.blackboard.core.play;

import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class GraphMatrixThread extends EventPlayThread<EzyMatrix.Matrix> {
    private ArrayList<EzyCommand.CommandSource.CommandInfo.GraphData> graphIdList = new ArrayList<>();
    private ArrayList<IGraph> graphList = new ArrayList<>();
    private List<EzyMatrix.Matrix> matrixList;

    public final void setMatrixInfo(List<EzyCommand.CommandSource.CommandInfo.GraphData> graphIdList, EzySource.MatrixSource.MatrixInfo info, long j10) {
        IGraph iGraphRootGraph;
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        AbstractC9133u.m16133g(info, "info");
        this.graphIdList.clear();
        this.graphIdList.addAll(graphIdList);
        for (EzyCommand.CommandSource.CommandInfo.GraphData graphData : this.graphIdList) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null) {
                String strM7762u = graphData.m7762u();
                AbstractC9133u.m16132f(strM7762u, "it.graphId");
                Graph graphFindById = iGraphRootGraph.findById(strM7762u);
                if (graphFindById != null) {
                    this.graphList.add(graphFindById);
                }
            }
        }
        List matrixList = info.getMatrixList();
        AbstractC9133u.m16132f(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.matrixList = info.getMatrixList();
        setListIterator(info.getMatrixList().listIterator());
        List matrixList2 = info.getMatrixList();
        AbstractC9133u.m16132f(matrixList2, "info.matrixList");
        initStartPlayTime(((EzyMatrix.Matrix) AbstractC8778f0.m14566l0(matrixList2)).getEventTime());
        seekTo(j10);
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public void handle(EzyMatrix.Matrix info) {
        AbstractC9133u.m16133g(info, "info");
        List<EzyMatrix.Matrix> list = this.matrixList;
        if (list != null) {
            if (AbstractC9133u.m16128b(info, AbstractC8778f0.m14566l0(list))) {
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null) {
                    graphControl.translationStart(this.graphList);
                    return;
                }
                return;
            }
            IGraphControl graphControl2 = getGraphControl();
            if (graphControl2 != null) {
                graphControl2.translation(this.graphList, MatrixExtKt.toMatrix(info));
            }
        }
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public boolean needHandle(EzyMatrix.Matrix info, long j10) {
        AbstractC9133u.m16133g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= j10;
    }
}
