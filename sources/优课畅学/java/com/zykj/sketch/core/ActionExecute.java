package com.zykj.sketch.core;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.BoundedContainerGraph;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.graph.ImageHistoryGraph;
import com.zykj.sketch.core.graph.StrokeGraph;
import com.zykj.sketch.core.graph.UnBoundedContainerGraph;
import com.zykj.sketch.core.graph.WebViewGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.EventListener;
import com.zykj.sketch.core.listener.IAction;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10570l;

/* loaded from: classes3.dex */
public class ActionExecute implements EventListener {
    private IAction action;
    private final ActionStrategyFactory actionFactory;
    private final IControl control;
    private final float[] matrixValue;
    private final List<ViewControl> viewControlList;
    private final ViewGroup viewGroup;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraphSnapshot.GraphType.values().length];
            iArr[GraphSnapshot.GraphType.UNBOUNDED_CONTAINER_GRAPH.ordinal()] = 1;
            iArr[GraphSnapshot.GraphType.BOUNDED_CONTAINER_GRAPH.ordinal()] = 2;
            iArr[GraphSnapshot.GraphType.IMAGE_GRAPH.ordinal()] = 3;
            iArr[GraphSnapshot.GraphType.WEB_VIEW_GRAPH.ordinal()] = 4;
            iArr[GraphSnapshot.GraphType.WRITING_GROUP_GRAPH.ordinal()] = 5;
            iArr[GraphSnapshot.GraphType.STROKE_GRAPH.ordinal()] = 6;
            iArr[GraphSnapshot.GraphType.SHAPE_GRAPH.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ActionExecute(ViewGroup viewGroup, IControl control, ActionStrategyFactory actionFactory) {
        AbstractC9133u.m16133g(viewGroup, "viewGroup");
        AbstractC9133u.m16133g(control, "control");
        AbstractC9133u.m16133g(actionFactory, "actionFactory");
        this.viewGroup = viewGroup;
        this.control = control;
        this.actionFactory = actionFactory;
        this.viewControlList = new ArrayList();
        this.matrixValue = new float[9];
    }

    private final void addNewGraph(Graph graph) {
        this.control.getRootGraph().addGraph(graph);
        graph.onMeasure();
        this.control.render();
        this.control.resetStatus();
        this.actionFactory.reset();
    }

    private final Graph buildHistoryGraph(GraphSnapshot.GraphData graphData) {
        GraphSnapshot.GraphType graphType = graphData.getGraphType();
        switch (graphType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphType.ordinal()]) {
            case 1:
                UnBoundedContainerGraph unBoundedContainerGraph = new UnBoundedContainerGraph(this.control);
                setAttribute2$default(this, unBoundedContainerGraph, graphData, null, 4, null);
                return unBoundedContainerGraph;
            case 2:
                BoundedContainerGraph boundedContainerGraph = new BoundedContainerGraph(this.control);
                setAttribute2$default(this, boundedContainerGraph, graphData, null, 4, null);
                return boundedContainerGraph;
            case 3:
                GraphSnapshot.File file = (GraphSnapshot.File) graphData.getExtra().unpack(GraphSnapshot.File.class);
                IControl iControl = this.control;
                int width = file.getWidth();
                int height = file.getHeight();
                int viewWidth = file.getViewWidth();
                int viewHeight = file.getViewHeight();
                String fileName = file.getFileName();
                AbstractC9133u.m16132f(fileName, "fileData.fileName");
                ImageHistoryGraph imageHistoryGraph = new ImageHistoryGraph(iControl, width, height, viewWidth, viewHeight, fileName);
                setAttribute2$default(this, imageHistoryGraph, graphData, null, 4, null);
                return imageHistoryGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphData.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                AbstractC9133u.m16132f(fileName2, "fileData.fileName");
                WebViewGraph webViewGraph = new WebViewGraph(viewGroup, fileName2, this.control, file2.getWidth(), file2.getHeight(), file2.getViewWidth(), file2.getViewHeight(), null, 128, null);
                setAttribute2$default(this, webViewGraph, graphData, null, 4, null);
                return webViewGraph;
            case 5:
                WritingGroupGraph writingGroupGraph = new WritingGroupGraph(this.control);
                setAttribute2$default(this, writingGroupGraph, graphData, null, 4, null);
                return writingGroupGraph;
            case 6:
                final GraphSnapshot.Touch touch = (GraphSnapshot.Touch) graphData.getExtra().unpack(GraphSnapshot.Touch.class);
                final StrokeGraph strokeGraph = new StrokeGraph(this.control);
                setAttribute2(strokeGraph, graphData, new InterfaceC10570l() { // from class: com.zykj.sketch.core.ActionExecute$buildHistoryGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Graph it) {
                        AbstractC9133u.m16133g(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        AbstractC9133u.m16132f(pointFList, "touchData.pointFList");
                        StrokeGraph strokeGraph2 = strokeGraph;
                        for (GraphSnapshot.PointF pointF : pointFList) {
                            strokeGraph2.addFPPoint(new PointF(pointF.getX(), pointF.getY()));
                        }
                    }
                });
                return strokeGraph;
            case 7:
            default:
                return null;
        }
    }

    private final void setAttribute(Graph graph, Graph graph2, GraphSnapshot.GraphData graphData, InterfaceC10570l interfaceC10570l) {
        List<Float> matrixList = graphData.getMatrixList();
        AbstractC9133u.m16132f(matrixList, "graphSnapshot.matrixList");
        graph2.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphData.getChildExtendMatrixList();
        AbstractC9133u.m16132f(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph2.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph2, graphData.getColor(), graphData.getWidth());
        graph2.setSelect(graphData.getIsSelect());
        graph2.setShowDelete(graphData.getShowDelete());
        String name = graphData.getName();
        AbstractC9133u.m16132f(name, "graphSnapshot.name");
        graph2.setName(name);
        graph2.setOutRect(new RectF(graphData.getOutRect().getLeft(), graphData.getOutRect().getTop(), graphData.getOutRect().getRight(), graphData.getOutRect().getBottom()));
        interfaceC10570l.invoke(graph2);
        if (graph != null) {
            graph.addGraph(graph2);
        }
        List<GraphSnapshot.GraphData> childGraphList = graphData.getChildGraphList();
        AbstractC9133u.m16132f(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            AbstractC9133u.m16132f(it, "it");
            buildGraph(graph2, it);
        }
    }

    public static /* synthetic */ void setAttribute$default(ActionExecute actionExecute, Graph graph, Graph graph2, GraphSnapshot.GraphData graphData, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute");
        }
        if ((i10 & 8) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute.1
                public final void invoke(Graph it) {
                    AbstractC9133u.m16133g(it, "it");
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Graph) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        actionExecute.setAttribute(graph, graph2, graphData, interfaceC10570l);
    }

    private final void setAttribute2(Graph graph, GraphSnapshot.GraphData graphData, InterfaceC10570l interfaceC10570l) {
        List<Float> matrixList = graphData.getMatrixList();
        AbstractC9133u.m16132f(matrixList, "graphSnapshot.matrixList");
        graph.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphData.getChildExtendMatrixList();
        AbstractC9133u.m16132f(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph, graphData.getColor(), graphData.getWidth());
        graph.setSelect(graphData.getIsSelect());
        graph.setShowDelete(graphData.getShowDelete());
        String name = graphData.getName();
        AbstractC9133u.m16132f(name, "graphSnapshot.name");
        graph.setName(name);
        graph.setOutRect(new RectF(graphData.getOutRect().getLeft(), graphData.getOutRect().getTop(), graphData.getOutRect().getRight(), graphData.getOutRect().getBottom()));
        interfaceC10570l.invoke(graph);
        List<GraphSnapshot.GraphData> childGraphList = graphData.getChildGraphList();
        AbstractC9133u.m16132f(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            AbstractC9133u.m16132f(it, "it");
            Graph graphBuildHistoryGraph = buildHistoryGraph(it);
            if (graphBuildHistoryGraph != null) {
                graph.addGraph(graphBuildHistoryGraph);
            }
        }
    }

    public static /* synthetic */ void setAttribute2$default(ActionExecute actionExecute, Graph graph, GraphSnapshot.GraphData graphData, InterfaceC10570l interfaceC10570l, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute2");
        }
        if ((i10 & 4) != 0) {
            interfaceC10570l = new InterfaceC10570l() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute2.1
                public final void invoke(Graph it) {
                    AbstractC9133u.m16133g(it, "it");
                }

                @Override // p300x7.InterfaceC10570l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Graph) obj2);
                    return C8736p.f16368a;
                }
            };
        }
        actionExecute.setAttribute2(graph, graphData, interfaceC10570l);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void addViewControl(ViewControl viewControl) {
        AbstractC9133u.m16133g(viewControl, "viewControl");
        this.viewControlList.add(viewControl);
    }

    public final Graph buildGraph(Graph graph, GraphSnapshot.GraphData graphSnapshot) {
        AbstractC9133u.m16133g(graphSnapshot, "graphSnapshot");
        GraphSnapshot.GraphType graphType = graphSnapshot.getGraphType();
        switch (graphType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphType.ordinal()]) {
            case 1:
                UnBoundedContainerGraph unBoundedContainerGraph = new UnBoundedContainerGraph(this.control);
                setAttribute$default(this, graph, unBoundedContainerGraph, graphSnapshot, null, 8, null);
                return unBoundedContainerGraph;
            case 2:
                BoundedContainerGraph boundedContainerGraph = new BoundedContainerGraph(this.control);
                setAttribute$default(this, graph, boundedContainerGraph, graphSnapshot, null, 8, null);
                return boundedContainerGraph;
            case 3:
                GraphSnapshot.File file = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                IControl iControl = this.control;
                int width = file.getWidth();
                int height = file.getHeight();
                int viewWidth = file.getViewWidth();
                int viewHeight = file.getViewHeight();
                String fileName = file.getFileName();
                AbstractC9133u.m16132f(fileName, "fileData.fileName");
                Graph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, fileName, file.getPositionFlag());
                setAttribute(graph, imageGraph, graphSnapshot, new InterfaceC10570l() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$3$1
                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Graph it) {
                        AbstractC9133u.m16133g(it, "it");
                        ((ImageGraph) it).checkOldData();
                    }
                });
                return imageGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                AbstractC9133u.m16132f(fileName2, "fileData.fileName");
                WebViewGraph webViewGraph = new WebViewGraph(viewGroup, fileName2, this.control, file2.getWidth(), file2.getHeight(), file2.getViewWidth(), file2.getViewHeight(), null, 128, null);
                setAttribute$default(this, graph, webViewGraph, graphSnapshot, null, 8, null);
                return webViewGraph;
            case 5:
                WritingGroupGraph writingGroupGraph = new WritingGroupGraph(this.control);
                setAttribute$default(this, graph, writingGroupGraph, graphSnapshot, null, 8, null);
                return writingGroupGraph;
            case 6:
                final GraphSnapshot.Touch touch = (GraphSnapshot.Touch) graphSnapshot.getExtra().unpack(GraphSnapshot.Touch.class);
                final StrokeGraph strokeGraph = new StrokeGraph(this.control);
                setAttribute(graph, strokeGraph, graphSnapshot, new InterfaceC10570l() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p300x7.InterfaceC10570l
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C8736p.f16368a;
                    }

                    public final void invoke(Graph it) {
                        AbstractC9133u.m16133g(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        AbstractC9133u.m16132f(pointFList, "touchData.pointFList");
                        StrokeGraph strokeGraph2 = strokeGraph;
                        for (GraphSnapshot.PointF pointF : pointFList) {
                            strokeGraph2.addFPPoint(new PointF(pointF.getX(), pointF.getY()));
                        }
                    }
                });
                return strokeGraph;
            case 7:
            default:
                return null;
        }
    }

    public final Matrix buildMatrix(List<Float> list) {
        AbstractC9133u.m16133g(list, "list");
        float[] fArr = new float[9];
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                AbstractC8809v.m14780w();
            }
            fArr[i10] = ((Number) obj).floatValue();
            i10 = i11;
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public final IAction getAction() {
        return this.action;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void graphSnapShot(EzyDrawBoard.ActionContent actionContent, boolean z10) {
        AbstractC9133u.m16133g(actionContent, "actionContent");
        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
        AbstractC9133u.m16132f(graphSnapshot, "actionContent.graphSnapshot");
        Graph graphBuildGraph = buildGraph(null, graphSnapshot);
        if (graphBuildGraph != null) {
            this.control.setRootGraph(graphBuildGraph);
            if (actionContent.hasResetData()) {
                EzyDrawBoard.GraphResetData resetData = actionContent.getResetData();
                AbstractC9133u.m16132f(resetData, "actionContent.resetData");
                initConfig(resetData);
            }
        }
        this.control.forceRender();
        this.control.resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void initConfig(EzyDrawBoard.GraphResetData resetData) {
        AbstractC9133u.m16133g(resetData, "resetData");
        IControl iControl = this.control;
        EzyDrawBoard.ActionModeConfig.Mode modeConfig = resetData.getModeConfig();
        AbstractC9133u.m16132f(modeConfig, "resetData.modeConfig");
        iControl.setMode(modeConfig);
        IControl iControl2 = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfig = resetData.getGraphConfig();
        AbstractC9133u.m16132f(graphConfig, "resetData.graphConfig");
        iControl2.setRecordConfig(graphConfig);
        if (resetData.hasDrawArea()) {
            this.control.setDrawArea(resetData.getDrawArea());
        } else {
            this.control.setDrawArea(null);
        }
        if (resetData.getBackgroundColor() != 0) {
            this.control.setBackgroundColor(resetData.getBackgroundColor());
        }
        ActionStrategyFactory actionStrategyFactory = this.actionFactory;
        EzyDrawBoard.GraphResetData.ActionFactory action = resetData.getAction();
        AbstractC9133u.m16132f(action, "resetData.action");
        actionStrategyFactory.parseActionMode(action);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onActionModeEvent(EzyDrawBoard.ActionModeConfig modeConfig) {
        AbstractC9133u.m16133g(modeConfig, "modeConfig");
        if (this.control.getMode() != modeConfig.getMode()) {
            IControl iControl = this.control;
            EzyDrawBoard.ActionModeConfig.Mode mode = modeConfig.getMode();
            AbstractC9133u.m16132f(mode, "modeConfig.mode");
            iControl.setMode(mode);
            this.control.resetStatus();
            this.actionFactory.clearAction();
        }
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(EzyDrawBoard.ActionImageConfig imageConfig, InterfaceC10570l callBack) {
        AbstractC9133u.m16133g(imageConfig, "imageConfig");
        AbstractC9133u.m16133g(callBack, "callBack");
        IControl iControl = this.control;
        int width = imageConfig.getWidth();
        int height = imageConfig.getHeight();
        int viewWidth = imageConfig.getViewWidth();
        int viewHeight = imageConfig.getViewHeight();
        String path = imageConfig.getPath();
        AbstractC9133u.m16132f(path, "imageConfig.path");
        ImageGraph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, path, imageConfig.getPositionFlag());
        addNewGraph(imageGraph);
        callBack.invoke(imageGraph);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig webViewConfig, InterfaceC10570l viewBack) {
        AbstractC9133u.m16133g(webViewConfig, "webViewConfig");
        AbstractC9133u.m16133g(viewBack, "viewBack");
        ViewGroup viewGroup = this.viewGroup;
        String path = webViewConfig.getPath();
        AbstractC9133u.m16132f(path, "webViewConfig.path");
        addNewGraph(new WebViewGraph(viewGroup, path, this.control, webViewConfig.getWidth(), webViewConfig.getHeight(), webViewConfig.getViewWidth(), webViewConfig.getViewHeight(), viewBack));
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(EzyDrawBoard.AudioStartAction action) {
        AbstractC9133u.m16133g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(EzyDrawBoard.AudioStopAction action) {
        AbstractC9133u.m16133g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(EzyDrawBoard.ActionClearBoard action) {
        AbstractC9133u.m16133g(action, "action");
        this.control.clear();
        this.actionFactory.reset();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig config) {
        EzyDrawBoard.DrawArea drawArea;
        AbstractC9133u.m16133g(config, "config");
        if (config.hasField(EzyDrawBoard.ActionDrawConfig.getDescriptor().findFieldByName("backgroundColor"))) {
            this.control.setBackgroundColor(config.getBackgroundColor());
        }
        if (config.hasDrawArea() && (drawArea = config.getDrawArea()) != null) {
            this.control.setDrawArea(drawArea);
        }
        this.control.resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onGraphConfigEvent(EzyDrawBoard.ActionGraphConfig graphConfig) {
        AbstractC9133u.m16133g(graphConfig, "graphConfig");
        IControl iControl = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig config = graphConfig.getConfig();
        AbstractC9133u.m16132f(config, "graphConfig.config");
        iControl.setRecordConfig(config);
        this.control.resetStatus();
        this.actionFactory.clearAction();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(EzyDrawBoard.ActionNextAction action) {
        AbstractC9133u.m16133g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onPrevActionEvent(EzyDrawBoard.ActionPrevAction action) {
        AbstractC9133u.m16133g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onTouchEvent(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        IAction iAction;
        AbstractC9133u.m16133g(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.control.setTouch(true);
            IAction iActionCreate = this.actionFactory.create(this.control.getMode());
            this.action = iActionCreate;
            if (iActionCreate != null) {
                iActionCreate.onTouchDown(event);
            }
            LogUtils.Companion companion = LogUtils.Companion;
            IAction iAction2 = this.action;
            companion.m9793i(String.valueOf(iAction2 != null ? iAction2.enumType() : null));
            return;
        }
        if (action == 1) {
            this.control.setTouch(false);
            IAction iAction3 = this.action;
            if (iAction3 != null) {
                iAction3.onTouchUp(event);
            }
            this.control.clearTempPaint();
            return;
        }
        if (action == 2) {
            IAction iAction4 = this.action;
            if (iAction4 != null) {
                iAction4.onTouchMove(event);
                return;
            }
            return;
        }
        if (action != 5) {
            if (action == 6 && (iAction = this.action) != null) {
                iAction.onTouchPointerUp(event);
                return;
            }
            return;
        }
        if (this.action == null) {
            this.control.setTouch(true);
            this.action = this.actionFactory.create(this.control.getMode());
        }
        IAction iAction5 = this.action;
        if (iAction5 != null) {
            iAction5.onTouchPointerDown(event);
        }
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public boolean onTranslation(EzyDrawBoard.ActionTranslation action) {
        AbstractC9133u.m16133g(action, "action");
        Matrix matrix = this.control.getRootGraph().getMatrix();
        if (!action.getKeep()) {
            matrix.getValues(this.matrixValue);
            if (action.hasTransX() && action.hasTransY()) {
                this.matrixValue[2] = action.getTransX().getValue();
                this.matrixValue[5] = action.getTransY().getValue();
            } else if (action.hasTransX()) {
                this.matrixValue[2] = action.getTransX().getValue();
            } else {
                this.matrixValue[5] = action.getTransY().getValue();
            }
            matrix.setValues(this.matrixValue);
        } else if (action.hasTransX() && action.hasTransY()) {
            matrix.postTranslate(action.getTransX().getValue(), action.getTransY().getValue());
        } else if (action.hasTransX()) {
            matrix.postTranslate(action.getTransX().getValue(), 0.0f);
        } else {
            matrix.postTranslate(0.0f, action.getTransY().getValue());
        }
        this.control.resetStatus();
        return true;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public boolean onZoom(EzyDrawBoard.ActionZoom action) {
        AbstractC9133u.m16133g(action, "action");
        Matrix matrix = this.control.getRootGraph().getMatrix();
        if (action.getKeep()) {
            matrix.postScale(action.getScaleX(), action.getScaleY(), action.getCenterX(), action.getCenterY());
        } else {
            matrix.getValues(this.matrixValue);
            matrix.reset();
            float[] fArr = this.matrixValue;
            matrix.postTranslate(fArr[2], fArr[5]);
            matrix.postScale(action.getScaleX(), action.getScaleY(), action.getCenterX(), action.getCenterY());
        }
        this.control.resetStatus();
        return true;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void reset() {
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void resetMatrix(EzyDrawBoard.ActionResetMatrix action) {
        AbstractC9133u.m16133g(action, "action");
        this.control.getRootGraph().getMatrix().reset();
        this.control.resetStatus();
    }

    public final void setAction(IAction iAction) {
        this.action = iAction;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void graphSnapShot(GraphSnapshot.GraphData graphSnapshot) {
        AbstractC9133u.m16133g(graphSnapshot, "graphSnapshot");
        Graph graphBuildHistoryGraph = buildHistoryGraph(graphSnapshot);
        if (graphBuildHistoryGraph != null) {
            this.control.setRootGraph(graphBuildHistoryGraph);
        }
        this.control.forceRender();
    }
}
