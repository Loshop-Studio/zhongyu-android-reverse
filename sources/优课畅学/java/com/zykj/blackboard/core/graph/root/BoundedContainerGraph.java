package com.zykj.blackboard.core.graph.root;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyPageSnapshot;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public class BoundedContainerGraph extends Graph {
    private String sourceFileName;
    private Integer sourceId;

    public /* synthetic */ BoundedContainerGraph(String str, RectF rectF, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public Graph copy() {
        BoundedContainerGraph boundedContainerGraph = new BoundedContainerGraph(getId(), new RectF(getOriginalRectF()), getSourceFileName(), getSourceId());
        boundedContainerGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            boundedContainerGraph.addGraph(((IGraph) it.next()).copy());
        }
        return boundedContainerGraph;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyCommand.CommandSource.CommandInfo.GraphData.C7194b getGraphData() {
        EzyCommand.CommandSource.CommandInfo.GraphData.C7194b graphData = super.getGraphData();
        String sourceFileName = getSourceFileName();
        if (sourceFileName != null) {
            graphData.m7770C(sourceFileName);
        }
        Integer sourceId = getSourceId();
        if (sourceId != null) {
            graphData.m7771D(sourceId.intValue());
        }
        return graphData;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b getSnapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot = super.getSnapshot();
        String sourceFileName = getSourceFileName();
        if (sourceFileName != null) {
            snapshot.m8413R(sourceFileName);
        }
        Integer sourceId = getSourceId();
        if (sourceId != null) {
            snapshot.m8414S(sourceId.intValue());
        }
        return snapshot;
    }

    public String getSourceFileName() {
        return this.sourceFileName;
    }

    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH;
    }

    public void render(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
    }

    public void setSourceFileName(String str) {
        this.sourceFileName = str;
    }

    public void setSourceId(Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedContainerGraph(String id, RectF outRectF, String str, Integer num) {
        super(id, outRectF);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRectF, "outRectF");
        this.sourceFileName = str;
        this.sourceId = num;
    }
}
