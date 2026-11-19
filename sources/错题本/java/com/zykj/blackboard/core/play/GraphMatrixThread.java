package com.zykj.blackboard.core.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
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

@Metadata(m5109d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\r\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0018j\b\u0012\u0004\u0012\u00020\u0006`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR&\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u001b0\u0018j\b\u0012\u0004\u0012\u00020\u001b`\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/GraphMatrixThread;", "Lcom/zykj/blackboard/core/execute/EventPlayThread;", "Lcom/zykj/board/EzyMatrix$Matrix;", "<init>", "()V", "", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "graphIdList", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "info", "", "skipTime", "Ld6/s;", "setMatrixInfo", "(Ljava/util/List;Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V", "handle", "(Lcom/zykj/board/EzyMatrix$Matrix;)V", "currentTime", "", "needHandle", "(Lcom/zykj/board/EzyMatrix$Matrix;J)Z", "", "matrixList", "Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphMatrixThread extends EventPlayThread<EzyMatrix$Matrix> {

    @NotNull
    private ArrayList<EzyCommand$CommandSource.CommandInfo.GraphData> graphIdList = new ArrayList<>();

    @NotNull
    private ArrayList<IGraph> graphList = new ArrayList<>();

    @Nullable
    private List<EzyMatrix$Matrix> matrixList;

    public final void setMatrixInfo(@NotNull List<EzyCommand$CommandSource.CommandInfo.GraphData> graphIdList, @NotNull EzySource$MatrixSource.MatrixInfo info, long skipTime) {
        IGraph rootGraph;
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        AbstractC5830k.m5330g(info, "info");
        this.graphIdList.clear();
        this.graphIdList.addAll(graphIdList);
        ArrayList<EzyCommand$CommandSource.CommandInfo.GraphData> arrayList = this.graphIdList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            EzyCommand$CommandSource.CommandInfo.GraphData graphData = arrayList.get(i);
            i++;
            EzyCommand$CommandSource.CommandInfo.GraphData graphData2 = graphData;
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
                String graphId = graphData2.getGraphId();
                AbstractC5830k.m5329f(graphId, "it.graphId");
                Graph graphFindById = rootGraph.findById(graphId);
                if (graphFindById != null) {
                    this.graphList.add(graphFindById);
                }
            }
        }
        List<EzyMatrix$Matrix> matrixList = info.getMatrixList();
        AbstractC5830k.m5329f(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.matrixList = info.getMatrixList();
        setListIterator(info.getMatrixList().listIterator());
        List<EzyMatrix$Matrix> matrixList2 = info.getMatrixList();
        AbstractC5830k.m5329f(matrixList2, "info.matrixList");
        initStartPlayTime(((EzyMatrix$Matrix) AbstractC5805t.m5228h0(matrixList2)).getEventTime());
        seekTo(skipTime);
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public void handle(@NotNull EzyMatrix$Matrix info) {
        AbstractC5830k.m5330g(info, "info");
        List<EzyMatrix$Matrix> list = this.matrixList;
        if (list != null) {
            if (info.equals(AbstractC5805t.m5228h0(list))) {
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
    public boolean needHandle(@NotNull EzyMatrix$Matrix info, long currentTime) {
        AbstractC5830k.m5330g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= currentTime;
    }
}
