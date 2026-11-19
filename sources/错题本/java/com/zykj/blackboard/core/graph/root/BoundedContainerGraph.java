package com.zykj.blackboard.core.graph.root;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.board.C4361d0;
import com.zykj.board.C4386q;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0016\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006'"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/root/BoundedContainerGraph;", "Lcom/zykj/blackboard/core/graph/Graph;", "", "id", "Landroid/graphics/RectF;", "outRectF", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "render", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "Lcom/zykj/board/q;", "getGraphData", "()Lcom/zykj/board/q;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "Ljava/lang/String;", "getSourceFileName", "()Ljava/lang/String;", "setSourceFileName", "(Ljava/lang/String;)V", "Ljava/lang/Integer;", "getSourceId", "()Ljava/lang/Integer;", "setSourceId", "(Ljava/lang/Integer;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class BoundedContainerGraph extends Graph {

    @Nullable
    private String sourceFileName;

    @Nullable
    private Integer sourceId;

    public /* synthetic */ BoundedContainerGraph(String str, RectF rectF, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
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
    @NotNull
    public C4386q getGraphData() {
        C4386q graphData = super.getGraphData();
        String sourceFileName = getSourceFileName();
        if (sourceFileName != null) {
            graphData.m3815n(sourceFileName);
        }
        Integer sourceId = getSourceId();
        if (sourceId != null) {
            graphData.m3816o(sourceId.intValue());
        }
        return graphData;
    }

    @Override // com.zykj.blackboard.core.graph.Graph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public C4361d0 getSnapshot() {
        C4361d0 snapshot = super.getSnapshot();
        String sourceFileName = getSourceFileName();
        if (sourceFileName != null) {
            snapshot.getClass();
            snapshot.f5467j = sourceFileName;
            snapshot.f5458a |= 32;
            snapshot.onChanged();
        }
        Integer sourceId = getSourceId();
        if (sourceId != null) {
            snapshot.f5468k = sourceId.intValue();
            snapshot.f5458a |= 64;
            snapshot.onChanged();
        }
        return snapshot;
    }

    @Nullable
    public String getSourceFileName() {
        return this.sourceFileName;
    }

    @Nullable
    public Integer getSourceId() {
        return this.sourceId;
    }

    @Override // com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.BOUNDED_CONTAINER_GRAPH;
    }

    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
    }

    public void setSourceFileName(@Nullable String str) {
        this.sourceFileName = str;
    }

    public void setSourceId(@Nullable Integer num) {
        this.sourceId = num;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoundedContainerGraph(@NotNull String id, @NotNull RectF outRectF, @Nullable String str, @Nullable Integer num) {
        super(id, outRectF);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRectF, "outRectF");
        this.sourceFileName = str;
        this.sourceId = num;
    }
}
