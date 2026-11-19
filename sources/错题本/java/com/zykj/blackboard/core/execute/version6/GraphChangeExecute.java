package com.zykj.blackboard.core.execute.version6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.IChangeField;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.core.graph.stroke.StrokeGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.enums.DocumentType;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyPointF$PointF;
import com.zykj.board.EzyRectF$RectF;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.text.AbstractC5855p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/version6/GraphChangeExecute;", "Lcom/zykj/blackboard/core/execute/CommandExecute;", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "data", "Ld6/s;", "execute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphChange;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GraphChangeExecute implements CommandExecute<EzyCommand$CommandSource.CommandInfo.GraphChange> {

    @NotNull
    private final IGraphControl graphControl;

    @NotNull
    private final SourceLoader sourceLoader;

    public GraphChangeExecute(@NotNull SourceLoader sourceLoader, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    @Nullable
    public PlayThread asyncExecute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphChange data, long skipTime) {
        AbstractC5830k.m5330g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(@NotNull EzyCommand$CommandSource.CommandInfo.GraphChange data) {
        List<IGraph> childGraph;
        String resPath;
        Object next;
        AbstractC5830k.m5330g(data, "data");
        IGraph iGraphRootGraph = this.graphControl.getRootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph : childGraph) {
            if (AbstractC5830k.m5325b(iGraph.getId(), data.getGraphId())) {
                if ((iGraph instanceof IChangeField) && data.hasOutRect()) {
                    EzyRectF$RectF outRect = data.getOutRect();
                    AbstractC5830k.m5329f(outRect, "data.outRect");
                    ((IChangeField) iGraph).changeOriginalRectF(GraphUtilsKt.covertRectF(outRect));
                }
                if (iGraph instanceof TextGraph) {
                    String content = data.getContent();
                    AbstractC5830k.m5329f(content, "data.content");
                    if (!AbstractC5855p.m5382P(content)) {
                        ((TextGraph) iGraph).setContent(data.getContent());
                    }
                    if (data.hasPaint()) {
                        EzyPaint$Paint paint = data.getPaint();
                        AbstractC5830k.m5329f(paint, "data.paint");
                        ((TextGraph) iGraph).setPaint(GraphUtilsKt.covertPaint(paint));
                    }
                } else if (iGraph instanceof GeometryGraph) {
                    List<EzyPointF$PointF> pointsList = data.getPointsList();
                    AbstractC5830k.m5329f(pointsList, "data.pointsList");
                    if (!pointsList.isEmpty()) {
                        GeometryGraph geometryGraph = (GeometryGraph) iGraph;
                        List<EzyPointF$PointF> pointsList2 = data.getPointsList();
                        AbstractC5830k.m5329f(pointsList2, "data.pointsList");
                        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(pointsList2, 10));
                        for (EzyPointF$PointF it : pointsList2) {
                            AbstractC5830k.m5329f(it, "it");
                            arrayList.add(GraphUtilsKt.covertPointF(it));
                        }
                        geometryGraph.setPointList(arrayList);
                    }
                    if (data.hasPaint()) {
                        EzyPaint$Paint paint2 = data.getPaint();
                        AbstractC5830k.m5329f(paint2, "data.paint");
                        ((GeometryGraph) iGraph).setPaint(GraphUtilsKt.covertPaint(paint2));
                    }
                } else if (iGraph instanceof ImageGraph) {
                    if (data.hasRenderMatrix()) {
                        EzyMatrix$Matrix renderMatrix = data.getRenderMatrix();
                        AbstractC5830k.m5329f(renderMatrix, "data.renderMatrix");
                        ((ImageGraph) iGraph).changeRenderMatrix(MatrixExtKt.toMatrix(renderMatrix));
                    }
                    String filePath = data.getFilePath();
                    AbstractC5830k.m5329f(filePath, "data.filePath");
                    if (!AbstractC5855p.m5382P(filePath)) {
                        String strPath = this.sourceLoader.getPageRootPath();
                        if (strPath == null || (resPath = SourceRouterRecord.INSTANCE.getResPath(strPath, DocumentType.IMAGE)) == null) {
                            return;
                        }
                        String absolutePath = new File(resPath, data.getFilePath()).getAbsolutePath();
                        AbstractC5830k.m5329f(absolutePath, "absolutePath");
                        ((ImageGraph) iGraph).updateFilePath(absolutePath);
                    }
                }
                this.graphControl.reDrawFixView();
                return;
            }
            if (iGraph instanceof GroupGraph) {
                GroupGraph groupGraph = (GroupGraph) iGraph;
                Iterator<T> it2 = groupGraph.getChildGraph().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    IGraph iGraph2 = (IGraph) next;
                    if (AbstractC5830k.m5325b(iGraph2.getId(), data.getGraphId()) && (iGraph2 instanceof StrokeGraph)) {
                        break;
                    }
                }
                IGraph iGraph3 = (IGraph) next;
                if (iGraph3 != null) {
                    StrokeGraph strokeGraph = (StrokeGraph) iGraph3;
                    if (data.hasPaint()) {
                        EzyPaint$Paint paint3 = data.getPaint();
                        AbstractC5830k.m5329f(paint3, "data.paint");
                        strokeGraph.setPaint(GraphUtilsKt.covertPaint(paint3), data.getPaint().getItemLength(), data.getPaint().getSpacing());
                    }
                    groupGraph.changeUpdate(true);
                    this.graphControl.reDrawFixView();
                    return;
                }
            }
        }
    }
}
