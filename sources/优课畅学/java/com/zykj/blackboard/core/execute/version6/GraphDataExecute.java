package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.TouchEventThread;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;

/* loaded from: classes4.dex */
public final class GraphDataExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.GraphData> {
    private final IGraphControl graphControl;
    private final MatrixAdapter matrixAdapter;
    private final SourceLoader sourceLoader;

    public GraphDataExecute(SourceLoader sourceLoader, MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.GraphData data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String strM7765x = data.m7765x();
        AbstractC9133u.m16132f(strM7765x, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchCache = sourceLoader.getTouchCache(strM7765x, data.m7766y());
        if (touchCache == null) {
            return null;
        }
        TouchEventThread touchEventThread = new TouchEventThread();
        touchEventThread.setGraphControl(this.graphControl);
        touchEventThread.setSourceLoader(this.sourceLoader);
        touchEventThread.setMatrixAdapter(this.matrixAdapter);
        touchEventThread.setTouchInfo(touchCache, j10);
        return touchEventThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.GraphData data) {
        AbstractC9133u.m16133g(data, "data");
        Graph graph = GraphBuildFactory.INSTANCE.parse(data, this.sourceLoader);
        if (graph != null) {
            if (graph instanceof ImageGraph) {
                String strM7759r = data.m7759r();
                AbstractC9133u.m16132f(strM7759r, "data.extras");
                if (AbstractC8661c0.m13973S(strM7759r, "imageBackground", false, 2, null)) {
                    this.graphControl.addImageGraph((ImageGraph) graph);
                    return;
                }
            }
            this.graphControl.addGraph(data.m7764w(), graph);
        }
    }
}
