package com.zykj.blackboard.core.execute.version6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.GraphMatrixThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzySource$MatrixSource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/version6/GraphMatrixExecute;", "Lcom/zykj/blackboard/core/execute/CommandExecute;", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "data", "Ld6/s;", "execute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphMatrix;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphMatrixExecute implements CommandExecute<EzyCommand$CommandSource.CommandInfo.GraphMatrix> {

    @NotNull
    private final IGraphControl graphControl;

    @NotNull
    private final SourceLoader sourceLoader;

    public GraphMatrixExecute(@NotNull SourceLoader sourceLoader, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    @Nullable
    public PlayThread asyncExecute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphMatrix data, long skipTime) {
        AbstractC5830k.m5330g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String sourceFileName = data.getSourceFileName();
        AbstractC5830k.m5329f(sourceFileName, "data.sourceFileName");
        EzySource$MatrixSource.MatrixInfo matrixCache = sourceLoader.getMatrixCache(sourceFileName, data.getSourceId());
        if (matrixCache == null) {
            return null;
        }
        GraphMatrixThread graphMatrixThread = new GraphMatrixThread();
        graphMatrixThread.setGraphControl(this.graphControl);
        graphMatrixThread.setSourceLoader(this.sourceLoader);
        List<EzyCommand$CommandSource.CommandInfo.GraphData> graphDataList = data.getGraphDataList();
        AbstractC5830k.m5329f(graphDataList, "data.graphDataList");
        graphMatrixThread.setMatrixInfo(graphDataList, matrixCache, skipTime);
        return graphMatrixThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphMatrix data) {
        AbstractC5830k.m5330g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String sourceFileName = data.getSourceFileName();
        AbstractC5830k.m5329f(sourceFileName, "data.sourceFileName");
        EzySource$MatrixSource.MatrixInfo matrixCache = sourceLoader.getMatrixCache(sourceFileName, data.getSourceId());
        if (matrixCache != null) {
            ArrayList arrayList = new ArrayList();
            List<EzyCommand$CommandSource.CommandInfo.GraphData> graphDataList = data.getGraphDataList();
            AbstractC5830k.m5329f(graphDataList, "data.graphDataList");
            for (EzyCommand$CommandSource.CommandInfo.GraphData graphData : graphDataList) {
                IGraph iGraphRootGraph = this.graphControl.getRootGraph();
                if (iGraphRootGraph != null) {
                    String graphId = graphData.getGraphId();
                    AbstractC5830k.m5329f(graphId, "graph.graphId");
                    Graph graphFindById = iGraphRootGraph.findById(graphId);
                    if (graphFindById != null) {
                        arrayList.add(graphFindById);
                    }
                }
            }
            IGraphControl iGraphControl = this.graphControl;
            List<EzyMatrix$Matrix> matrixList = matrixCache.getMatrixList();
            AbstractC5830k.m5329f(matrixList, "it.matrixList");
            Object objM5235o0 = AbstractC5805t.m5235o0(matrixList);
            AbstractC5830k.m5329f(objM5235o0, "it.matrixList.last()");
            iGraphControl.translationEnd(arrayList, MatrixExtKt.toMatrix((EzyMatrix$Matrix) objM5235o0));
        }
    }
}
