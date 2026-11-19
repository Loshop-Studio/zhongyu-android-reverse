package com.zykj.sketch.core;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
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
import com.zykj.sketch.core.listener.PPTControl;
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0013H\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0014\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u0012J\u0018\u0010#\u001a\u00020\u00152\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010#\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010(\u001a\u00020\u00152\u0006\u0010)\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J&\u0010.\u001a\u00020\u00152\u0006\u0010/\u001a\u0002002\u0014\u00101\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u000103\u0012\u0004\u0012\u00020\u001502H\u0016J$\u00104\u001a\u00020\u00152\u0006\u00105\u001a\u0002062\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\u001502H\u0016J\u0010\u00109\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020:H\u0016J\u0010\u0010;\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020<H\u0016J\u0010\u0010=\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020>H\u0016J\u0010\u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020AH\u0016J\u0010\u0010B\u001a\u00020\u00152\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020FH\u0016J\u0010\u0010G\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020HH\u0016J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020'2\u0006\u0010\t\u001a\u00020MH\u0016J\u0010\u0010N\u001a\u00020'2\u0006\u0010\t\u001a\u00020OH\u0016J\b\u0010P\u001a\u00020\u0015H\u0016J\u0010\u0010Q\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020RH\u0016J8\u0010S\u001a\u00020\u00152\b\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001502H\u0002J.\u0010U\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u001502H\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, m13558d2 = {"Lcom/zykj/sketch/core/ActionExecute;", "Lcom/zykj/sketch/core/listener/EventListener;", "viewGroup", "Landroid/view/ViewGroup;", "control", "Lcom/zykj/sketch/core/listener/IControl;", "actionFactory", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "action", "Lcom/zykj/sketch/core/listener/IAction;", "getAction", "()Lcom/zykj/sketch/core/listener/IAction;", "setAction", "(Lcom/zykj/sketch/core/listener/IAction;)V", "matrixValue", "", "viewControlList", "", "Lcom/zykj/sketch/core/listener/ViewControl;", "addNewGraph", "", "graph", "Lcom/zykj/sketch/core/graph/Graph;", "addViewControl", "viewControl", "buildGraph", "rootGraph", "graphSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "buildHistoryGraph", "buildMatrix", "Landroid/graphics/Matrix;", "list", "", "graphSnapShot", "actionContent", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "updateMode", "", "initConfig", "resetData", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "onActionModeEvent", "modeConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "onAddImageEvent", "imageConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "callBack", "Lkotlin/Function1;", "Lcom/zykj/sketch/core/graph/ImageGraph;", "onAddPPTEvent", "webViewConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "viewBack", "Lcom/zykj/sketch/core/listener/PPTControl;", "onAudioStartRecord", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStopRecord", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onClearBoardEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onDrawConfigEvent", "config", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "onGraphConfigEvent", "graphConfig", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "onNextActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onPrevActionEvent", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "onTouchEvent", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "onTranslation", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onZoom", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "reset", "resetMatrix", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "setAttribute", "fatherGraph", "setAttribute2", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public class ActionExecute implements EventListener {
    private IAction action;
    private final ActionStrategyFactory actionFactory;
    private final IControl control;
    private final float[] matrixValue;
    private final List<ViewControl> viewControlList;
    private final ViewGroup viewGroup;

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
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
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(control, "control");
        Intrinsics.checkNotNullParameter(actionFactory, "actionFactory");
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

    private final Graph buildHistoryGraph(GraphSnapshot.GraphData graphSnapshot) {
        GraphSnapshot.GraphType graphType = graphSnapshot.getGraphType();
        switch (graphType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphType.ordinal()]) {
            case 1:
                UnBoundedContainerGraph unBoundedContainerGraph = new UnBoundedContainerGraph(this.control);
                setAttribute2$default(this, unBoundedContainerGraph, graphSnapshot, null, 4, null);
                return unBoundedContainerGraph;
            case 2:
                BoundedContainerGraph boundedContainerGraph = new BoundedContainerGraph(this.control);
                setAttribute2$default(this, boundedContainerGraph, graphSnapshot, null, 4, null);
                return boundedContainerGraph;
            case 3:
                GraphSnapshot.File file = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                IControl iControl = this.control;
                int width = file.getWidth();
                int height = file.getHeight();
                int viewWidth = file.getViewWidth();
                int viewHeight = file.getViewHeight();
                String fileName = file.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "fileData.fileName");
                ImageHistoryGraph imageHistoryGraph = new ImageHistoryGraph(iControl, width, height, viewWidth, viewHeight, fileName);
                setAttribute2$default(this, imageHistoryGraph, graphSnapshot, null, 4, null);
                return imageHistoryGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName2, "fileData.fileName");
                WebViewGraph webViewGraph = new WebViewGraph(viewGroup, fileName2, this.control, file2.getWidth(), file2.getHeight(), file2.getViewWidth(), file2.getViewHeight(), null, 128, null);
                setAttribute2$default(this, webViewGraph, graphSnapshot, null, 4, null);
                return webViewGraph;
            case 5:
                WritingGroupGraph writingGroupGraph = new WritingGroupGraph(this.control);
                setAttribute2$default(this, writingGroupGraph, graphSnapshot, null, 4, null);
                return writingGroupGraph;
            case 6:
                final GraphSnapshot.Touch touch = (GraphSnapshot.Touch) graphSnapshot.getExtra().unpack(GraphSnapshot.Touch.class);
                final StrokeGraph strokeGraph = new StrokeGraph(this.control);
                setAttribute2(strokeGraph, graphSnapshot, new Function1<Graph, Unit>() { // from class: com.zykj.sketch.core.ActionExecute$buildHistoryGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Graph graph) {
                        invoke2(graph);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Graph it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        Intrinsics.checkNotNullExpressionValue(pointFList, "touchData.pointFList");
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

    private final void setAttribute(Graph fatherGraph, Graph graph, GraphSnapshot.GraphData graphSnapshot, Function1<? super Graph, Unit> callBack) {
        List<Float> matrixList = graphSnapshot.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "graphSnapshot.matrixList");
        graph.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphSnapshot.getChildExtendMatrixList();
        Intrinsics.checkNotNullExpressionValue(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph, graphSnapshot.getColor(), graphSnapshot.getWidth());
        graph.setSelect(graphSnapshot.getIsSelect());
        graph.setShowDelete(graphSnapshot.getShowDelete());
        String name = graphSnapshot.getName();
        Intrinsics.checkNotNullExpressionValue(name, "graphSnapshot.name");
        graph.setName(name);
        graph.setOutRect(new RectF(graphSnapshot.getOutRect().getLeft(), graphSnapshot.getOutRect().getTop(), graphSnapshot.getOutRect().getRight(), graphSnapshot.getOutRect().getBottom()));
        callBack.invoke(graph);
        if (fatherGraph != null) {
            fatherGraph.addGraph(graph);
        }
        List<GraphSnapshot.GraphData> childGraphList = graphSnapshot.getChildGraphList();
        Intrinsics.checkNotNullExpressionValue(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            buildGraph(graph, it);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAttribute$default(ActionExecute actionExecute, Graph graph, Graph graph2, GraphSnapshot.GraphData graphData, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute");
        }
        if ((i10 & 8) != 0) {
            function1 = new Function1<Graph, Unit>() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Graph it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Graph graph3) {
                    invoke2(graph3);
                    return Unit.INSTANCE;
                }
            };
        }
        actionExecute.setAttribute(graph, graph2, graphData, function1);
    }

    private final void setAttribute2(Graph graph, GraphSnapshot.GraphData graphSnapshot, Function1<? super Graph, Unit> callBack) {
        List<Float> matrixList = graphSnapshot.getMatrixList();
        Intrinsics.checkNotNullExpressionValue(matrixList, "graphSnapshot.matrixList");
        graph.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphSnapshot.getChildExtendMatrixList();
        Intrinsics.checkNotNullExpressionValue(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph, graphSnapshot.getColor(), graphSnapshot.getWidth());
        graph.setSelect(graphSnapshot.getIsSelect());
        graph.setShowDelete(graphSnapshot.getShowDelete());
        String name = graphSnapshot.getName();
        Intrinsics.checkNotNullExpressionValue(name, "graphSnapshot.name");
        graph.setName(name);
        graph.setOutRect(new RectF(graphSnapshot.getOutRect().getLeft(), graphSnapshot.getOutRect().getTop(), graphSnapshot.getOutRect().getRight(), graphSnapshot.getOutRect().getBottom()));
        callBack.invoke(graph);
        List<GraphSnapshot.GraphData> childGraphList = graphSnapshot.getChildGraphList();
        Intrinsics.checkNotNullExpressionValue(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            Graph graphBuildHistoryGraph = buildHistoryGraph(it);
            if (graphBuildHistoryGraph != null) {
                graph.addGraph(graphBuildHistoryGraph);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setAttribute2$default(ActionExecute actionExecute, Graph graph, GraphSnapshot.GraphData graphData, Function1 function1, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute2");
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1<Graph, Unit>() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute2.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Graph it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Graph graph2) {
                    invoke2(graph2);
                    return Unit.INSTANCE;
                }
            };
        }
        actionExecute.setAttribute2(graph, graphData, function1);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void addViewControl(ViewControl viewControl) {
        Intrinsics.checkNotNullParameter(viewControl, "viewControl");
        this.viewControlList.add(viewControl);
    }

    public final Graph buildGraph(Graph rootGraph, GraphSnapshot.GraphData graphSnapshot) {
        Intrinsics.checkNotNullParameter(graphSnapshot, "graphSnapshot");
        GraphSnapshot.GraphType graphType = graphSnapshot.getGraphType();
        switch (graphType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[graphType.ordinal()]) {
            case 1:
                UnBoundedContainerGraph unBoundedContainerGraph = new UnBoundedContainerGraph(this.control);
                setAttribute$default(this, rootGraph, unBoundedContainerGraph, graphSnapshot, null, 8, null);
                return unBoundedContainerGraph;
            case 2:
                BoundedContainerGraph boundedContainerGraph = new BoundedContainerGraph(this.control);
                setAttribute$default(this, rootGraph, boundedContainerGraph, graphSnapshot, null, 8, null);
                return boundedContainerGraph;
            case 3:
                GraphSnapshot.File file = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                IControl iControl = this.control;
                int width = file.getWidth();
                int height = file.getHeight();
                int viewWidth = file.getViewWidth();
                int viewHeight = file.getViewHeight();
                String fileName = file.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName, "fileData.fileName");
                Graph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, fileName, file.getPositionFlag());
                setAttribute(rootGraph, imageGraph, graphSnapshot, new Function1<Graph, Unit>() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$3$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Graph graph) {
                        invoke2(graph);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Graph it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ((ImageGraph) it).checkOldData();
                    }
                });
                return imageGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                Intrinsics.checkNotNullExpressionValue(fileName2, "fileData.fileName");
                WebViewGraph webViewGraph = new WebViewGraph(viewGroup, fileName2, this.control, file2.getWidth(), file2.getHeight(), file2.getViewWidth(), file2.getViewHeight(), null, 128, null);
                setAttribute$default(this, rootGraph, webViewGraph, graphSnapshot, null, 8, null);
                return webViewGraph;
            case 5:
                WritingGroupGraph writingGroupGraph = new WritingGroupGraph(this.control);
                setAttribute$default(this, rootGraph, writingGroupGraph, graphSnapshot, null, 8, null);
                return writingGroupGraph;
            case 6:
                final GraphSnapshot.Touch touch = (GraphSnapshot.Touch) graphSnapshot.getExtra().unpack(GraphSnapshot.Touch.class);
                final StrokeGraph strokeGraph = new StrokeGraph(this.control);
                setAttribute(rootGraph, strokeGraph, graphSnapshot, new Function1<Graph, Unit>() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Graph graph) {
                        invoke2(graph);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Graph it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        Intrinsics.checkNotNullExpressionValue(pointFList, "touchData.pointFList");
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
        Intrinsics.checkNotNullParameter(list, "list");
        float[] fArr = new float[9];
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
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
    public void graphSnapShot(EzyDrawBoard.ActionContent actionContent, boolean updateMode) {
        Intrinsics.checkNotNullParameter(actionContent, "actionContent");
        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
        Intrinsics.checkNotNullExpressionValue(graphSnapshot, "actionContent.graphSnapshot");
        Graph graphBuildGraph = buildGraph(null, graphSnapshot);
        if (graphBuildGraph != null) {
            this.control.setRootGraph(graphBuildGraph);
            if (actionContent.hasResetData()) {
                EzyDrawBoard.GraphResetData resetData = actionContent.getResetData();
                Intrinsics.checkNotNullExpressionValue(resetData, "actionContent.resetData");
                initConfig(resetData);
            }
        }
        this.control.forceRender();
        this.control.resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void initConfig(EzyDrawBoard.GraphResetData resetData) {
        Intrinsics.checkNotNullParameter(resetData, "resetData");
        IControl iControl = this.control;
        EzyDrawBoard.ActionModeConfig.Mode modeConfig = resetData.getModeConfig();
        Intrinsics.checkNotNullExpressionValue(modeConfig, "resetData.modeConfig");
        iControl.setMode(modeConfig);
        IControl iControl2 = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfig = resetData.getGraphConfig();
        Intrinsics.checkNotNullExpressionValue(graphConfig, "resetData.graphConfig");
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
        Intrinsics.checkNotNullExpressionValue(action, "resetData.action");
        actionStrategyFactory.parseActionMode(action);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onActionModeEvent(EzyDrawBoard.ActionModeConfig modeConfig) {
        Intrinsics.checkNotNullParameter(modeConfig, "modeConfig");
        if (this.control.getCurrentMode() != modeConfig.getMode()) {
            IControl iControl = this.control;
            EzyDrawBoard.ActionModeConfig.Mode mode = modeConfig.getMode();
            Intrinsics.checkNotNullExpressionValue(mode, "modeConfig.mode");
            iControl.setMode(mode);
            this.control.resetStatus();
            this.actionFactory.clearAction();
        }
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(EzyDrawBoard.ActionImageConfig imageConfig, Function1<? super ImageGraph, Unit> callBack) {
        Intrinsics.checkNotNullParameter(imageConfig, "imageConfig");
        Intrinsics.checkNotNullParameter(callBack, "callBack");
        IControl iControl = this.control;
        int width = imageConfig.getWidth();
        int height = imageConfig.getHeight();
        int viewWidth = imageConfig.getViewWidth();
        int viewHeight = imageConfig.getViewHeight();
        String path = imageConfig.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "imageConfig.path");
        ImageGraph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, path, imageConfig.getPositionFlag());
        addNewGraph(imageGraph);
        callBack.invoke(imageGraph);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(EzyDrawBoard.ActionWebViewConfig webViewConfig, Function1<? super PPTControl, Unit> viewBack) {
        Intrinsics.checkNotNullParameter(webViewConfig, "webViewConfig");
        Intrinsics.checkNotNullParameter(viewBack, "viewBack");
        ViewGroup viewGroup = this.viewGroup;
        String path = webViewConfig.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "webViewConfig.path");
        addNewGraph(new WebViewGraph(viewGroup, path, this.control, webViewConfig.getWidth(), webViewConfig.getHeight(), webViewConfig.getViewWidth(), webViewConfig.getViewHeight(), viewBack));
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(EzyDrawBoard.AudioStartAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(EzyDrawBoard.AudioStopAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(EzyDrawBoard.ActionClearBoard action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.control.clear();
        this.actionFactory.reset();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(EzyDrawBoard.ActionDrawConfig config) {
        EzyDrawBoard.DrawArea drawArea;
        Intrinsics.checkNotNullParameter(config, "config");
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
        Intrinsics.checkNotNullParameter(graphConfig, "graphConfig");
        IControl iControl = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig config = graphConfig.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "graphConfig.config");
        iControl.setRecordConfig(config);
        this.control.resetStatus();
        this.actionFactory.clearAction();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(EzyDrawBoard.ActionNextAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onPrevActionEvent(EzyDrawBoard.ActionPrevAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onTouchEvent(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        IAction iAction;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.control.setTouch(true);
            IAction iActionCreate = this.actionFactory.create(this.control.getCurrentMode());
            this.action = iActionCreate;
            if (iActionCreate != null) {
                iActionCreate.onTouchDown(event);
            }
            LogUtils.Companion companion = LogUtils.INSTANCE;
            IAction iAction2 = this.action;
            companion.m10649i(String.valueOf(iAction2 != null ? iAction2.enumType() : null));
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
            this.action = this.actionFactory.create(this.control.getCurrentMode());
        }
        IAction iAction5 = this.action;
        if (iAction5 != null) {
            iAction5.onTouchPointerDown(event);
        }
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public boolean onTranslation(EzyDrawBoard.ActionTranslation action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Matrix mMatrix = this.control.getRootGraph().getMMatrix();
        if (!action.getKeep()) {
            mMatrix.getValues(this.matrixValue);
            if (action.hasTransX() && action.hasTransY()) {
                this.matrixValue[2] = action.getTransX().getValue();
                this.matrixValue[5] = action.getTransY().getValue();
            } else if (action.hasTransX()) {
                this.matrixValue[2] = action.getTransX().getValue();
            } else {
                this.matrixValue[5] = action.getTransY().getValue();
            }
            mMatrix.setValues(this.matrixValue);
        } else if (action.hasTransX() && action.hasTransY()) {
            mMatrix.postTranslate(action.getTransX().getValue(), action.getTransY().getValue());
        } else if (action.hasTransX()) {
            mMatrix.postTranslate(action.getTransX().getValue(), 0.0f);
        } else {
            mMatrix.postTranslate(0.0f, action.getTransY().getValue());
        }
        this.control.resetStatus();
        return true;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public boolean onZoom(EzyDrawBoard.ActionZoom action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Matrix mMatrix = this.control.getRootGraph().getMMatrix();
        if (action.getKeep()) {
            mMatrix.postScale(action.getScaleX(), action.getScaleY(), action.getCenterX(), action.getCenterY());
        } else {
            mMatrix.getValues(this.matrixValue);
            mMatrix.reset();
            float[] fArr = this.matrixValue;
            mMatrix.postTranslate(fArr[2], fArr[5]);
            mMatrix.postScale(action.getScaleX(), action.getScaleY(), action.getCenterX(), action.getCenterY());
        }
        this.control.resetStatus();
        return true;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void reset() {
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void resetMatrix(EzyDrawBoard.ActionResetMatrix action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.control.getRootGraph().getMMatrix().reset();
        this.control.resetStatus();
    }

    public final void setAction(IAction iAction) {
        this.action = iAction;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void graphSnapShot(GraphSnapshot.GraphData graphSnapshot) {
        Intrinsics.checkNotNullParameter(graphSnapshot, "graphSnapshot");
        Graph graphBuildHistoryGraph = buildHistoryGraph(graphSnapshot);
        if (graphBuildHistoryGraph != null) {
            this.control.setRootGraph(graphBuildHistoryGraph);
        }
        this.control.forceRender();
    }
}
