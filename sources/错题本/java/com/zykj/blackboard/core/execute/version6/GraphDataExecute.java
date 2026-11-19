package com.zykj.blackboard.core.execute.version6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.TouchEventThread;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzySource$TouchSource;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/version6/GraphDataExecute;", "Lcom/zykj/blackboard/core/execute/CommandExecute;", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "data", "Ld6/s;", "execute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphDataExecute implements CommandExecute<EzyCommand$CommandSource.CommandInfo.GraphData> {

    @NotNull
    private final IGraphControl graphControl;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final SourceLoader sourceLoader;

    public GraphDataExecute(@NotNull SourceLoader sourceLoader, @NotNull MatrixAdapter matrixAdapter, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    @Nullable
    public PlayThread asyncExecute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData data, long skipTime) {
        AbstractC5830k.m5330g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String sourceFileName = data.getSourceFileName();
        AbstractC5830k.m5329f(sourceFileName, "data.sourceFileName");
        EzySource$TouchSource.TouchInfo touchCache = sourceLoader.getTouchCache(sourceFileName, data.getSourceId());
        if (touchCache == null) {
            return null;
        }
        TouchEventThread touchEventThread = new TouchEventThread();
        touchEventThread.setGraphControl(this.graphControl);
        touchEventThread.setSourceLoader(this.sourceLoader);
        touchEventThread.setMatrixAdapter(this.matrixAdapter);
        touchEventThread.setTouchInfo(touchCache, skipTime);
        return touchEventThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData data) {
        AbstractC5830k.m5330g(data, "data");
        Graph graph = GraphBuildFactory.INSTANCE.parse(data, this.sourceLoader);
        if (graph != null) {
            if (graph instanceof ImageGraph) {
                String extras = data.getExtras();
                AbstractC5830k.m5329f(extras, "data.extras");
                if (AbstractC5855p.m5372F(extras, "imageBackground", false)) {
                    this.graphControl.addImageGraph((ImageGraph) graph);
                    return;
                }
            }
            this.graphControl.addGraph(data.getParentGraphId(), graph);
        }
    }
}
