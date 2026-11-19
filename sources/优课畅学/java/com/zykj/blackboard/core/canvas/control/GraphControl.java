package com.zykj.blackboard.core.canvas.control;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.bean.BackgroundLineConfig;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectFunctionType;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectGraphControl;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionRectF;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.view.RenderLayer;
import com.zykj.blackboard.core.edit.RenderChangeListener;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.RectBoardUtils;
import com.zykj.board.EzyPageSnapshot;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p113g8.AbstractC8661c0;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class GraphControl implements IGraphControl {
    private final BoardConfig boardConfig;
    private int defaultBackgroundColor;
    private final BackgroundLineConfig defaultBackgroundLineConfig;
    private InterfaceC10570l deleteCallback;
    private DrawControl drawControl;
    private float iconWidth;
    private boolean isDraw;
    private boolean isSelectAction;
    private Matrix matrix;
    private final MatrixAdapter matrixAdapter;
    private final NewSelectGraphControl newSelectGraphControl;
    private Paint paint;
    private final RenderLayer renderLayer;
    private IGraph rootGraph;
    private RectF selectedRectF;

    public GraphControl(MatrixAdapter matrixAdapter, RenderLayer renderLayer, BoardConfig boardConfig) {
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(renderLayer, "renderLayer");
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        this.matrixAdapter = matrixAdapter;
        this.renderLayer = renderLayer;
        this.boardConfig = boardConfig;
        this.drawControl = new DrawControl(boardConfig);
        this.matrix = new Matrix();
        this.isSelectAction = true;
        this.isDraw = true;
        this.defaultBackgroundLineConfig = new BackgroundLineConfig(0, 0.0f, null, 0.0f, 15, null);
        matrixAdapter.setVisibleRectF(renderLayer.getRenderRect());
        this.drawControl.setMatrixAdapter(matrixAdapter);
        this.drawControl.setRenderLayer(renderLayer);
        this.newSelectGraphControl = new NewSelectGraphControl(this.drawControl);
    }

    private final void resetBackground() {
        updateBackgroundColor(this.defaultBackgroundColor);
        updateBackgroundLineConfig(this.defaultBackgroundLineConfig);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void addGraph(String str, IGraph graph) {
        Graph graphFindById;
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC5380q.m2623s("GraphControl:addGraph -> [" + graph.graphType() + "] parentId:" + str + ", graphId:" + graph.getId());
        if (str == null || AbstractC8661c0.m13993h0(str)) {
            this.rootGraph = graph;
            if (this.isDraw) {
                this.drawControl.add(graph);
                return;
            }
            return;
        }
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || iGraph == null || (graphFindById = iGraph.findById(str)) == null) {
            return;
        }
        graphFindById.addGraph(graph);
        if (this.isDraw) {
            this.drawControl.add(graph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void addImageGraph(ImageGraph graph) {
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC5380q.m2623s("GraphControl:addImageGraph -> graphId:" + graph.getId());
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            if (iGraph != null) {
                iGraph.addImageGraph(graph);
            }
            reDrawFixView();
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChangeEnd(Matrix matrix) {
        AbstractC5380q.m2623s("GraphControl:cameraChangeEnd");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            if (matrix != null) {
                this.matrixAdapter.cameraMatrixConcat(matrix);
            }
            if (this.isDraw) {
                this.drawControl.cameraChangeEnd(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChangeStart() {
        IGraph iGraph;
        AbstractC5380q.m2623s("GraphControl:cameraChangeStart ");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            this.drawControl.cameraChangeStart(iGraph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void cameraChanging(Matrix matrix) {
        AbstractC9133u.m16133g(matrix, "matrix");
        if (this.isDraw && this.rootGraph != null) {
            DrawControl drawControl = this.drawControl;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getScreenMatrix()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.matrixAdapter.getScreenMatrix());
            drawControl.cameraChanging(matrix2);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void changeImageGraph(String graphId, RectF originRectF, Matrix renderMatrix, String filePath) {
        List<IGraph> childGraph;
        AbstractC9133u.m16133g(graphId, "graphId");
        AbstractC9133u.m16133g(originRectF, "originRectF");
        AbstractC9133u.m16133g(renderMatrix, "renderMatrix");
        AbstractC9133u.m16133g(filePath, "filePath");
        AbstractC5380q.m2623s("GraphControl:changeImageGraph -> graphId: " + graphId);
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (childGraph = iGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph2 : childGraph) {
            if (AbstractC9133u.m16128b(iGraph2.getId(), graphId) && (iGraph2 instanceof ImageGraph)) {
                ImageGraph imageGraph = (ImageGraph) iGraph2;
                imageGraph.changeOriginalRectF(originRectF);
                imageGraph.changeRenderMatrix(renderMatrix);
                imageGraph.updateFilePath(filePath);
                if (isDraw()) {
                    DrawControl drawControl = this.drawControl;
                    ArrayList arrayList = new ArrayList();
                    IGraph iGraph3 = this.rootGraph;
                    if (iGraph3 != null) {
                        arrayList.add(iGraph3);
                    }
                    drawControl.drawGraphInFix(arrayList);
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void changeTextGraph(String graphId, String content, Paint paint, RectF originRectF) {
        List<IGraph> childGraph;
        AbstractC9133u.m16133g(graphId, "graphId");
        AbstractC9133u.m16133g(content, "content");
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(originRectF, "originRectF");
        AbstractC5380q.m2623s("GraphControl:changeTextGraph -> graphId: " + graphId);
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (childGraph = iGraph.getChildGraph()) == null) {
            return;
        }
        for (IGraph iGraph2 : childGraph) {
            if (AbstractC9133u.m16128b(iGraph2.getId(), graphId) && (iGraph2 instanceof TextGraph)) {
                TextGraph textGraph = (TextGraph) iGraph2;
                textGraph.setContent(content);
                textGraph.setPaint(paint);
                textGraph.changeOriginalRectF(originRectF);
                if (isDraw()) {
                    DrawControl drawControl = this.drawControl;
                    ArrayList arrayList = new ArrayList();
                    IGraph iGraph3 = this.rootGraph;
                    if (iGraph3 != null) {
                        arrayList.add(iGraph3);
                    }
                    drawControl.drawGraphInFix(arrayList);
                    RectF rectF = this.selectedRectF;
                    if (rectF != null) {
                        Path selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth);
                        this.drawControl.selectCancel();
                        this.drawControl.select(selectActionRectBoardPath, this.paint);
                    }
                }
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void concatMatrix(IGraph graph, Matrix matrix) {
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC9133u.m16133g(matrix, "matrix");
        graph.concatMatrix(matrix);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public Bitmap contentThumbnail() {
        IGraph iGraph;
        if (!isDraw() || (iGraph = this.rootGraph) == null) {
            return null;
        }
        return this.drawControl.contentThumbnail(iGraph);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void delete(List<IGraph> graphList) {
        IGraph iGraph;
        AbstractC9133u.m16133g(graphList, "graphList");
        if (graphList.isEmpty() || (iGraph = this.rootGraph) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:delete -> root:");
        sb.append(iGraph.getId());
        sb.append(": ");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        iGraph.deleteGraphList(graphList);
        for (IGraph iGraph2 : graphList) {
            InterfaceC10570l interfaceC10570l = this.deleteCallback;
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(iGraph2);
            }
        }
        if (this.isDraw) {
            this.drawControl.delete(iGraph);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void drawGraphInActive(List<? extends IGraph> graphList) {
        AbstractC9133u.m16133g(graphList, "graphList");
        if (isDraw()) {
            this.drawControl.drawGraphInActive(graphList);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void drawPath(Path path, Paint paint, Matrix matrix) {
        AbstractC9133u.m16133g(path, "path");
        AbstractC9133u.m16133g(paint, "paint");
        this.drawControl.drawPath(path, paint, matrix);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getBackgroundColor() {
        return this.drawControl.getBackgroundColor();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public BackgroundLineConfig getBackgroundLineConfig() {
        return this.drawControl.getBackgroundLineConfig();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getDefaultBackgroundColor() {
        return this.defaultBackgroundColor;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public BackgroundLineConfig getDefaultBackgroundLineConfig() {
        return this.defaultBackgroundLineConfig;
    }

    public final InterfaceC10570l getDeleteCallback() {
        return this.deleteCallback;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public int getImageGraphCount() {
        List<IGraph> childGraph;
        IGraph iGraph = this.rootGraph;
        int i10 = 0;
        if (iGraph != null && (childGraph = iGraph.getChildGraph()) != null) {
            Iterator<T> it = childGraph.iterator();
            while (it.hasNext()) {
                if (((IGraph) it.next()) instanceof ImageGraph) {
                    i10++;
                }
            }
        }
        return i10;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public RectF getOldPageRectF() {
        return new RectF(this.drawControl.getOldPageRectF());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public RectF getPageRectF() {
        return new RectF(this.renderLayer.getRenderRect());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public RectF getRenderRectF() {
        return this.matrixAdapter.getRenderRectF();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void init(IGraph rootGraph) {
        AbstractC9133u.m16133g(rootGraph, "rootGraph");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:init -> ");
        sb.append(rootGraph.getId());
        sb.append(": ");
        List<IGraph> childGraph = rootGraph.getChildGraph();
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(childGraph, 10));
        Iterator<T> it = childGraph.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        this.rootGraph = rootGraph;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void isDraw(boolean z10) {
        this.isDraw = z10;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public Bitmap minScreenShot(int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, IGraph iGraph) {
        IGraph iGraph2 = this.rootGraph;
        if (iGraph2 != null) {
            return this.drawControl.getMinScreenShot(iGraph2, i10, i11, i12, i13, z10, z11, z12, iGraph);
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandleEnd(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.newSelectGraphControl.newChangeHandleEnd(iGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandleStart(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(groupGraph, "groupGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.newSelectGraphControl.newChangeHandleStart(iGraph, groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newChangeHandling(GroupGraph groupGraph, RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(groupGraph, "groupGraph");
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        if (this.rootGraph != null) {
            this.newSelectGraphControl.newChangeHandling(groupGraph, selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newSelect(RectF selectRectF, Matrix matrix, RectF selectFunctionRectF, FunctionRectF functionRectF, List<? extends NewSelectFunctionType> typeList, PointF pointF) {
        AbstractC9133u.m16133g(selectRectF, "selectRectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC9133u.m16133g(selectFunctionRectF, "selectFunctionRectF");
        AbstractC9133u.m16133g(functionRectF, "functionRectF");
        AbstractC9133u.m16133g(typeList, "typeList");
        this.newSelectGraphControl.drawNewSelectRectF(selectRectF, matrix, selectFunctionRectF, functionRectF, typeList, pointF);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void newSelecting(float f10, float f11, float f12, float f13) {
        this.newSelectGraphControl.drawNewSelectRectF(f10, f11, f12, f13);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public synchronized void reDrawFixView() {
        try {
            if (this.isDraw) {
                AbstractC5380q.m2623s("GraphControl:reDrawFixView -> cameraMatrix=" + this.matrixAdapter.getCameraMatrix());
                DrawControl drawControl = this.drawControl;
                ArrayList arrayList = new ArrayList();
                IGraph iGraph = this.rootGraph;
                if (iGraph != null) {
                    arrayList.add(iGraph);
                }
                drawControl.drawGraphInFix(arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void refresh() {
        this.drawControl.refresh();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void registerRenderRectFChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.matrixAdapter.registerRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void release() {
        AbstractC5380q.m2623s("GraphControl:release");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            iGraph.onDestroy();
        }
        this.drawControl.release();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void renderRectF(RectF rectF, List<IGraph> graphList) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(graphList, "graphList");
        if (this.isDraw && !rectF.isEmpty()) {
            this.drawControl.renderRectFInFix(rectF, graphList);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void reset() {
        AbstractC5380q.m2623s("GraphControl:reset");
        resetBackground();
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            iGraph.onDestroy();
        }
        this.rootGraph = null;
        this.drawControl.reset();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void resetCamera() {
        AbstractC5380q.m2623s("GraphControl:resetCamera");
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            this.matrixAdapter.resetCamera();
            if (this.isDraw) {
                this.drawControl.cameraChangeEnd(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public IGraph rootGraph() {
        return this.rootGraph;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public String rootGraphId() {
        IGraph iGraph = this.rootGraph;
        if (iGraph != null) {
            return iGraph.getId();
        }
        return null;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public Bitmap screenshot() {
        IGraph iGraph;
        if (!isDraw() || (iGraph = this.rootGraph) == null) {
            return null;
        }
        return this.drawControl.screenshot(iGraph);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void select(RectF rectF, Matrix matrix, Paint paint, float f10, boolean z10) {
        AbstractC9133u.m16133g(rectF, "rectF");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (this.isDraw) {
            this.selectedRectF = rectF;
            this.paint = paint;
            this.iconWidth = f10;
            this.matrix.set(matrix);
            this.isSelectAction = z10;
            if (this.rootGraph != null) {
                Path selectActionRectBoardPath = z10 ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, matrix, f10) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, matrix, f10);
                this.drawControl.selectCancel();
                this.drawControl.select(selectActionRectBoardPath, paint);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void selectCancel() {
        if (this.isDraw) {
            this.selectedRectF = null;
            this.matrix.reset();
            this.drawControl.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setDefaultBackgroundColor(int i10) {
        this.defaultBackgroundColor = i10;
        this.drawControl.setBackgroundColor(i10);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setDefaultBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        BackgroundLineConfig backgroundLineConfig2 = this.defaultBackgroundLineConfig;
        backgroundLineConfig2.setLineType(backgroundLineConfig.getLineType());
        backgroundLineConfig2.setLineColor(backgroundLineConfig.getLineColor());
        backgroundLineConfig2.setLineSpace(backgroundLineConfig.getLineSpace());
        this.drawControl.setBackgroundLineConfig(backgroundLineConfig);
    }

    public final void setDeleteCallback(InterfaceC10570l interfaceC10570l) {
        this.deleteCallback = interfaceC10570l;
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setGraphMatrix(String graphId, Matrix matrix) {
        Graph graphFindById;
        AbstractC9133u.m16133g(graphId, "graphId");
        AbstractC9133u.m16133g(matrix, "matrix");
        AbstractC5380q.m2623s("GraphControl:setGraphMatrix -> graphId:" + graphId);
        IGraph iGraph = this.rootGraph;
        if (iGraph != null && (graphFindById = iGraph.findById(graphId)) != null) {
            graphFindById.initMatrix(matrix);
        }
        reDrawFixView();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void setOldPageRectF(RectF rectF) {
        AbstractC9133u.m16133g(rectF, "rectF");
        this.drawControl.getOldPageRectF().set(rectF);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public EzyPageSnapshot.PageSnapshot.GraphSnapshot snapshot() {
        EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b snapshot;
        IGraph iGraph = this.rootGraph;
        if (iGraph == null || (snapshot = iGraph.getSnapshot()) == null) {
            return null;
        }
        return snapshot.build();
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandle(TextGraph graph, RectF rectF, Matrix matrix) {
        Path selectActionRectBoardPath;
        AbstractC9133u.m16133g(graph, "graph");
        if (this.isDraw) {
            if (rectF != null) {
                this.selectedRectF = rectF;
                this.matrix.set(matrix);
                selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth);
            } else {
                selectActionRectBoardPath = null;
            }
            this.drawControl.textHandle(graph, selectActionRectBoardPath, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandleEnd(TextGraph graph, RectF rectF, Matrix matrix) {
        IGraph iGraph;
        Path selectActionRectBoardPath;
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC5380q.m2623s("GraphControl:textHandleEnd");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            if (rectF != null) {
                this.selectedRectF = rectF;
                this.matrix.set(matrix);
                selectActionRectBoardPath = this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth);
            } else {
                selectActionRectBoardPath = null;
            }
            this.drawControl.textHandleEnd(iGraph, selectActionRectBoardPath, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void textHandleStart(TextGraph graph) {
        IGraph iGraph;
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC5380q.m2623s("GraphControl:textHandleStart");
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            RectF rectF = this.selectedRectF;
            this.drawControl.textHandleStart(iGraph, graph, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translation(List<? extends IGraph> graphList, Matrix matrix) {
        AbstractC9133u.m16133g(graphList, "graphList");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (this.isDraw) {
            DrawControl drawControl = this.drawControl;
            Matrix matrix2 = new Matrix();
            matrix2.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
            matrix2.postConcat(matrix);
            matrix2.postConcat(this.matrixAdapter.getAdapterMatrix());
            drawControl.transGraph(matrix2);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translationEnd(List<? extends IGraph> graphList, Matrix matrix) {
        AbstractC9133u.m16133g(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationEnd -> matrix:");
        sb.append(matrix);
        sb.append(" graph:");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        for (IGraph iGraph : graphList) {
            Matrix matrix2 = new Matrix();
            if (matrix != null) {
                matrix2.postConcat(matrix);
            }
            C8736p c8736p = C8736p.f16368a;
            concatMatrix(iGraph, matrix2);
        }
        if (this.isDraw) {
            if (this.selectedRectF != null) {
                Matrix matrix3 = this.matrix;
                Matrix matrix4 = new Matrix();
                if (matrix != null) {
                    matrix4.postConcat(MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
                    matrix4.postConcat(matrix);
                    matrix4.postConcat(this.matrixAdapter.getAdapterMatrix());
                }
                matrix3.postConcat(matrix4);
            }
            IGraph iGraph2 = this.rootGraph;
            if (iGraph2 != null) {
                RectF rectF = this.selectedRectF;
                this.drawControl.transGraphEnd(iGraph2, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
            }
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void translationStart(List<? extends IGraph> graphList) {
        IGraph iGraph;
        AbstractC9133u.m16133g(graphList, "graphList");
        StringBuilder sb = new StringBuilder();
        sb.append("GraphControl:translationStart -> graph:");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        if (this.isDraw && (iGraph = this.rootGraph) != null) {
            RectF rectF = this.selectedRectF;
            this.drawControl.transGraphStart(iGraph, graphList, rectF != null ? this.isSelectAction ? RectBoardUtils.INSTANCE.getSelectActionRectBoardPath(rectF, this.matrix, this.iconWidth) : RectBoardUtils.INSTANCE.getTextActionRectBoardPath(rectF, this.matrix, this.iconWidth) : null, this.paint);
        }
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void unRegisterRenderRectFChangeListener(RenderChangeListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        this.matrixAdapter.unRegisterRenderRectFChangeListener(listener);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundColor(int i10) {
        AbstractC5380q.m2623s("GraphControl:updateBackground -> color:" + i10);
        this.drawControl.setBackgroundColor(i10);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundLineConfig(BackgroundLineConfig backgroundLineConfig) {
        AbstractC9133u.m16133g(backgroundLineConfig, "backgroundLineConfig");
        this.drawControl.setBackgroundLineConfig(backgroundLineConfig);
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public void updateBackgroundMatrix() {
        this.drawControl.updateBackgroundMatrix(this.matrixAdapter.getAdapterMatrix());
    }

    @Override // com.zykj.blackboard.core.canvas.control.IGraphControl
    public boolean isDraw() {
        return this.isDraw;
    }
}
