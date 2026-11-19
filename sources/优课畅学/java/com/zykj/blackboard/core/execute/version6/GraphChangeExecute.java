package com.zykj.blackboard.core.execute.version6;

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
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p134i7.AbstractC8811w;

/* loaded from: classes4.dex */
public final class GraphChangeExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.GraphChange> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public GraphChangeExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.GraphChange data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.GraphChange data) {
        List<IGraph> childGraph;
        String resPath;
        Object next;
        AbstractC9133u.m16133g(data, "data");
        IGraph iGraphRootGraph = this.graphControl.rootGraph();
        if (iGraphRootGraph == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph : childGraph) {
            if (AbstractC9133u.m16128b(iGraph.getId(), data.m7692v())) {
                if ((iGraph instanceof IChangeField) && data.hasOutRect()) {
                    EzyRectF.RectF rectFM7693w = data.m7693w();
                    AbstractC9133u.m16132f(rectFM7693w, "data.outRect");
                    ((IChangeField) iGraph).changeOriginalRectF(GraphUtilsKt.covertRectF(rectFM7693w));
                }
                if (iGraph instanceof TextGraph) {
                    String content = data.getContent();
                    AbstractC9133u.m16132f(content, "data.content");
                    if (!AbstractC8661c0.m13993h0(content)) {
                        ((TextGraph) iGraph).setContent(data.getContent());
                    }
                    if (data.m7684B()) {
                        EzyPaint.Paint paintM7694x = data.m7694x();
                        AbstractC9133u.m16132f(paintM7694x, "data.paint");
                        ((TextGraph) iGraph).setPaint(GraphUtilsKt.covertPaint(paintM7694x));
                    }
                } else if (iGraph instanceof GeometryGraph) {
                    List listM7696z = data.m7696z();
                    AbstractC9133u.m16132f(listM7696z, "data.pointsList");
                    if (!listM7696z.isEmpty()) {
                        GeometryGraph geometryGraph = (GeometryGraph) iGraph;
                        List<EzyPointF.PointF> listM7696z2 = data.m7696z();
                        AbstractC9133u.m16132f(listM7696z2, "data.pointsList");
                        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(listM7696z2, 10));
                        for (EzyPointF.PointF it : listM7696z2) {
                            AbstractC9133u.m16132f(it, "it");
                            arrayList.add(GraphUtilsKt.covertPointF(it));
                        }
                        geometryGraph.setPointList(arrayList);
                    }
                    if (data.m7684B()) {
                        EzyPaint.Paint paintM7694x2 = data.m7694x();
                        AbstractC9133u.m16132f(paintM7694x2, "data.paint");
                        ((GeometryGraph) iGraph).setPaint(GraphUtilsKt.covertPaint(paintM7694x2));
                    }
                } else if (iGraph instanceof ImageGraph) {
                    if (data.m7685C()) {
                        EzyMatrix.Matrix matrixM7683A = data.m7683A();
                        AbstractC9133u.m16132f(matrixM7683A, "data.renderMatrix");
                        ((ImageGraph) iGraph).changeRenderMatrix(MatrixExtKt.toMatrix(matrixM7683A));
                    }
                    String strM7690t = data.m7690t();
                    AbstractC9133u.m16132f(strM7690t, "data.filePath");
                    if (!AbstractC8661c0.m13993h0(strM7690t)) {
                        String strPath = this.sourceLoader.path();
                        if (strPath == null || (resPath = SourceRouterRecord.Companion.getResPath(strPath, DocumentType.IMAGE)) == null) {
                            return;
                        }
                        String absolutePath = new File(resPath, data.m7690t()).getAbsolutePath();
                        AbstractC9133u.m16132f(absolutePath, "absolutePath");
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
                    if (AbstractC9133u.m16128b(iGraph2.getId(), data.m7692v()) && (iGraph2 instanceof StrokeGraph)) {
                        break;
                    }
                }
                IGraph iGraph3 = (IGraph) next;
                if (iGraph3 != null) {
                    StrokeGraph strokeGraph = (StrokeGraph) iGraph3;
                    if (data.m7684B()) {
                        EzyPaint.Paint paintM7694x3 = data.m7694x();
                        AbstractC9133u.m16132f(paintM7694x3, "data.paint");
                        strokeGraph.setPaint(GraphUtilsKt.covertPaint(paintM7694x3), data.m7694x().m8476j(), data.m7694x().m8477k());
                    }
                    groupGraph.changeUpdate(true);
                    this.graphControl.reDrawFixView();
                    return;
                }
            }
        }
    }
}
