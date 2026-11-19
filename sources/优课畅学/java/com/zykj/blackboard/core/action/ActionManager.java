package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.GraphControl;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.blackboard.core.edit.HistoryControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graphBuilder.GraphBuildFactory;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.record.SourceRouterRecord;
import com.zykj.blackboard.core.record.dataRecorder.CommandRecord;
import com.zykj.blackboard.listener.GraphDeleteListener;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.utils.EventConvert;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyModeEnum;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyRectF;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8807u;
import p134i7.AbstractC8809v;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10570l;

/* loaded from: classes4.dex */
public final class ActionManager implements IActionListener {
    private ITouchAction actionMode;
    private final BoardConfig boardConfig;
    private final GraphControl graphControl;
    private final HistoryControl historyControl;
    private IAreaMoveListener mAreaMoveListener;
    private InterfaceC10570l mGeometryCreateListener;
    private ArrayList<GraphDeleteListener> mGraphDeleteListenerList;
    private ITextSelectListener mTextSelectListener;
    private final MatrixAdapter matrixAdapter;
    private final TouchActionModeFactory modeFactory;
    private final SourceRouterRecord routerRecord;
    private final SourceLoader sourceLoader;

    public ActionManager(GraphControl graphControl, BoardConfig boardConfig, MatrixAdapter matrixAdapter, SourceLoader sourceLoader, SourceRouterRecord sourceRouterRecord, HistoryControl historyControl) {
        AbstractC9133u.m16133g(graphControl, "graphControl");
        AbstractC9133u.m16133g(boardConfig, "boardConfig");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        this.graphControl = graphControl;
        this.boardConfig = boardConfig;
        this.matrixAdapter = matrixAdapter;
        this.sourceLoader = sourceLoader;
        this.routerRecord = sourceRouterRecord;
        this.historyControl = historyControl;
        TouchActionModeFactory touchActionModeFactory = new TouchActionModeFactory();
        this.modeFactory = touchActionModeFactory;
        this.mGraphDeleteListenerList = new ArrayList<>();
        touchActionModeFactory.setListener(this);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void changeGraph(IGraph graph, EzyGraphEnum.GraphEnum graphEnum, RectF rectF, String str, Paint paint, List<? extends PointF> list, Matrix matrix, String str2) throws ExecutionException, InterruptedException {
        CommandRecord commandRecord;
        ArrayList arrayList;
        AbstractC9133u.m16133g(graph, "graph");
        AbstractC9133u.m16133g(graphEnum, "graphEnum");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        String id = graph.getId();
        EzyRectF.RectF rectFCovertEzyRectF = rectF != null ? GraphUtilsKt.covertEzyRectF(rectF) : null;
        EzyPaint.Paint paintCovertEzyPaint = paint != null ? GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f) : null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC8811w.m14786x(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(GraphUtilsKt.covertEzyPointF((PointF) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        commandRecord.changeGraph(id, graphEnum, rectFCovertEzyRectF, str, paintCovertEzyPaint, arrayList, matrix != null ? MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis()) : null, str2, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void deleteGraphEvent(List<? extends IGraph> graphList, long j10) {
        CommandRecord commandRecord;
        AbstractC9133u.m16133g(graphList, "graphList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord != null && (commandRecord = sourceRouterRecord.getCommandRecord()) != null) {
            ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(graphList, 10));
            Iterator<T> it = graphList.iterator();
            while (it.hasNext()) {
                arrayList.add(((IGraph) it.next()).getGraphData().build());
            }
            commandRecord.removeGraphList(arrayList, j10);
        }
        for (IGraph iGraph : graphList) {
            Iterator<T> it2 = this.mGraphDeleteListenerList.iterator();
            while (it2.hasNext()) {
                ((GraphDeleteListener) it2.next()).onGraphDelete(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void geometryGraphEvent(float f10, float f11, float f12, float f13, int i10, List<? extends PointF> pointList, Paint paint, InterfaceC10570l interfaceC10570l) {
        SourceRouterRecord sourceRouterRecord;
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddGeometryGraphCommand;
        AbstractC9133u.m16133g(pointList, "pointList");
        AbstractC9133u.m16133g(paint, "paint");
        String strRootGraphId = this.graphControl.rootGraphId();
        if (strRootGraphId == null || (sourceRouterRecord = this.routerRecord) == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddGeometryGraphCommand = commandRecord.addGeometryGraphCommand(strRootGraphId, f10, f11, i10, pointList, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddGeometryGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph != null) {
            float[] fArr = {f12, f13};
            MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            transformGraphEvent(AbstractC8807u.m14755e(graph), AbstractC8809v.m14776s(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
            graph.concatMatrix(matrix);
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(graph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public IAreaMoveListener getAreaMoveListener() {
        return this.mAreaMoveListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    public final ITouchAction getCurrentAction() {
        return this.modeFactory.getCurrentAction(this);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public InterfaceC10570l getGeometryCreateListener() {
        return this.mGeometryCreateListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public IGraphControl getGraphControl() {
        return this.graphControl;
    }

    public final IAreaMoveListener getMAreaMoveListener() {
        return this.mAreaMoveListener;
    }

    public final InterfaceC10570l getMGeometryCreateListener() {
        return this.mGeometryCreateListener;
    }

    public final ArrayList<GraphDeleteListener> getMGraphDeleteListenerList() {
        return this.mGraphDeleteListenerList;
    }

    public final ITextSelectListener getMTextSelectListener() {
        return this.mTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    public final TouchActionModeFactory getModeFactory() {
        return this.modeFactory;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public ITextSelectListener getTextSelectListener() {
        return this.mTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public IGraph groupGraphEvent(String parentGraphId) throws ExecutionException, InterruptedException {
        CommandRecord commandRecord;
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return null;
        }
        EzyGraphEnum.GraphEnum graphEnum = EzyGraphEnum.GraphEnum.GROUP_GRAPH;
        EzyRectF.RectF rectFBuild = EzyRectF.RectF.m8548h().build();
        AbstractC9133u.m16132f(rectFBuild, "newBuilder().build()");
        CommandInfoEntity commandInfoEntityAddCommand = commandRecord.addCommand(parentGraphId, graphEnum, rectFBuild, System.currentTimeMillis());
        if (commandInfoEntityAddCommand == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph == null) {
            return null;
        }
        this.graphControl.addGraph(graphData.m7764w(), graph);
        return graph;
    }

    public final void handleTouchEvent(MotionEvent motionEvent) {
        ITouchAction iTouchAction;
        AbstractC9133u.m16133g(motionEvent, "motionEvent");
        EzyTouchEvent.TouchEvent touchEventMotionEventConvertTouchEvent = EventConvert.INSTANCE.motionEventConvertTouchEvent(motionEvent, MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
        int action = touchEventMotionEventConvertTouchEvent.getAction();
        if (action == 0) {
            ITouchAction iTouchActionCreate = this.modeFactory.create(this);
            this.actionMode = iTouchActionCreate;
            if (iTouchActionCreate != null) {
                iTouchActionCreate.onTouchDown(touchEventMotionEventConvertTouchEvent);
                return;
            }
            return;
        }
        if (action == 1) {
            ITouchAction iTouchAction2 = this.actionMode;
            if (iTouchAction2 != null) {
                iTouchAction2.onTouchUp(touchEventMotionEventConvertTouchEvent);
            }
            this.actionMode = null;
            return;
        }
        if (action == 2) {
            ITouchAction iTouchAction3 = this.actionMode;
            if (iTouchAction3 != null) {
                iTouchAction3.onTouchMove(touchEventMotionEventConvertTouchEvent);
                return;
            }
            return;
        }
        if (action != 5) {
            if (action == 6 && (iTouchAction = this.actionMode) != null) {
                iTouchAction.onTouchPointerUp(touchEventMotionEventConvertTouchEvent);
                return;
            }
            return;
        }
        ITouchAction iTouchAction4 = this.actionMode;
        if (iTouchAction4 != null) {
            iTouchAction4.onTouchPointerDown(touchEventMotionEventConvertTouchEvent);
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void moveCursor(List<EzyTouchEvent.TouchEvent> eventList, EzyPaint.Paint paint) {
        CommandRecord commandRecord;
        AbstractC9133u.m16133g(eventList, "eventList");
        AbstractC9133u.m16133g(paint, "paint");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        commandRecord.moveCursor(eventList, paint, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void newSelectGraph(List<String> graphIdList) {
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        this.boardConfig.setMode(EzyModeEnum.ModeEnum.ACTION_NEW_SELECT);
        ITouchAction currentAction = getCurrentAction();
        AbstractC9133u.m16131e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) currentAction).selectGraphList(graphIdList);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void saveSnapshot() {
        HistoryControl historyControl;
        IGraph iGraphRootGraph = this.graphControl.rootGraph();
        if (iGraphRootGraph == null || (historyControl = this.historyControl) == null) {
            return;
        }
        historyControl.saveSnapshot((Graph) iGraphRootGraph, this.graphControl.getBackgroundColor(), this.graphControl.getBackgroundLineConfig());
    }

    public final void setMAreaMoveListener(IAreaMoveListener iAreaMoveListener) {
        this.mAreaMoveListener = iAreaMoveListener;
    }

    public final void setMGeometryCreateListener(InterfaceC10570l interfaceC10570l) {
        this.mGeometryCreateListener = interfaceC10570l;
    }

    public final void setMGraphDeleteListenerList(ArrayList<GraphDeleteListener> arrayList) {
        AbstractC9133u.m16133g(arrayList, "<set-?>");
        this.mGraphDeleteListenerList = arrayList;
    }

    public final void setMTextSelectListener(ITextSelectListener iTextSelectListener) {
        this.mTextSelectListener = iTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void textGraphEvent(float f10, float f11, float f12, float f13, Paint paint, String content, InterfaceC10570l interfaceC10570l) {
        SourceRouterRecord sourceRouterRecord;
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddTextGraphCommand;
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(content, "content");
        String strRootGraphId = this.graphControl.rootGraphId();
        if (strRootGraphId == null || (sourceRouterRecord = this.routerRecord) == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddTextGraphCommand = commandRecord.addTextGraphCommand(strRootGraphId, f10, f11, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddTextGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph != null) {
            float[] fArr = {f12, f13};
            MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            transformGraphEvent(AbstractC8807u.m14755e(graph), AbstractC8809v.m14776s(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
            graph.concatMatrix(matrix);
            if (interfaceC10570l != null) {
                interfaceC10570l.invoke(graph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void transformCameraEvent(EzyMatrix.Matrix originMatrix, EzyMatrix.Matrix lastMatrix, List<EzyMatrix.Matrix> matrixList) {
        CommandRecord commandRecord;
        AbstractC9133u.m16133g(originMatrix, "originMatrix");
        AbstractC9133u.m16133g(lastMatrix, "lastMatrix");
        AbstractC9133u.m16133g(matrixList, "matrixList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        commandRecord.addCameraMatrix(originMatrix, lastMatrix, matrixList, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void transformGraphEvent(List<? extends IGraph> graphList, List<EzyMatrix.Matrix> matrixList) {
        CommandRecord commandRecord;
        AbstractC9133u.m16133g(graphList, "graphList");
        AbstractC9133u.m16133g(matrixList, "matrixList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getGraphData().build());
        }
        commandRecord.addGraphMatrix(arrayList, matrixList, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public Graph writingGraphEvent(EzyGraphEnum.GraphEnum graphType, List<EzyTouchEvent.TouchEvent> eventList, EzyPaint.Paint paint, String parentGraphId, String graphId) {
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddCommand;
        AbstractC9133u.m16133g(graphType, "graphType");
        AbstractC9133u.m16133g(eventList, "eventList");
        AbstractC9133u.m16133g(paint, "paint");
        AbstractC9133u.m16133g(parentGraphId, "parentGraphId");
        AbstractC9133u.m16133g(graphId, "graphId");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddCommand = commandRecord.addCommand(parentGraphId, graphType, eventList, paint, graphId, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand.CommandSource.CommandInfo.GraphData graphData = EzyCommand.CommandSource.CommandInfo.GraphData.m7738D(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC9133u.m16132f(graphData, "graphData");
        return graphBuildFactory.parse(graphData, this.sourceLoader);
    }

    public /* synthetic */ ActionManager(GraphControl graphControl, BoardConfig boardConfig, MatrixAdapter matrixAdapter, SourceLoader sourceLoader, SourceRouterRecord sourceRouterRecord, HistoryControl historyControl, int i10, AbstractC9126n abstractC9126n) {
        this(graphControl, boardConfig, matrixAdapter, sourceLoader, (i10 & 16) != 0 ? null : sourceRouterRecord, (i10 & 32) != 0 ? null : historyControl);
    }
}
