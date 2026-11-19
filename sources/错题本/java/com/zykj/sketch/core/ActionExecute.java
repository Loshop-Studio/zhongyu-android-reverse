package com.zykj.sketch.core;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import com.zykj.sketch.core.listener.ViewControl;
import com.zykj.sketch.utils.LogUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045d6.C5443s;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J?\u0010\u0016\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J-\u0010-\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b-\u0010.J+\u00103\u001a\u00020\f2\u0006\u00100\u001a\u00020/2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\f0\u0014H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00106\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\f2\u0006\u00106\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\f2\u0006\u00106\u001a\u00020?H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020\f2\u0006\u00106\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020F2\u0006\u00106\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020F2\u0006\u00106\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001a\u00020\f2\u0006\u00106\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010Q\u001a\u00020\f2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\u00020\f2\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020FH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010V\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\bV\u0010XJ!\u0010Z\u001a\u0004\u0018\u00010\n2\b\u0010Y\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\bZ\u0010[J\u001b\u0010`\u001a\u00020_2\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\fH\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010f\u001a\u00020\f2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010hR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010iR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010jR$\u00106\u001a\u0004\u0018\u00010k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020d0\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010t\u001a\u00020s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010u¨\u0006v"}, m5110d2 = {"Lcom/zykj/sketch/core/ActionExecute;", "Lcom/zykj/sketch/core/listener/EventListener;", "Landroid/view/ViewGroup;", "viewGroup", "Lcom/zykj/sketch/core/listener/IControl;", "control", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "actionFactory", "<init>", "(Landroid/view/ViewGroup;Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/ActionStrategyFactory;)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "Ld6/s;", "addNewGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphSnapshot", "buildHistoryGraph", "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;", "fatherGraph", "Lkotlin/Function1;", "callBack", "setAttribute", "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V", "setAttribute2", "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;", "modeConfig", "onActionModeEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;", "graphConfig", "onGraphConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionGraphConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;", "config", "onDrawConfigEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionDrawConfig;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;", "imageConfig", "Lcom/zykj/sketch/core/graph/ImageGraph;", "onAddImageEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionImageConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;", "webViewConfig", "Lcom/zykj/sketch/core/listener/PPTControl;", "viewBack", "onAddPPTEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionWebViewConfig;Lr6/c;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;", "action", "onPrevActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionPrevAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;", "onNextActionEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionNextAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;", "onClearBoardEvent", "(Lcom/zykj/sketch/EzyDrawBoard$ActionClearBoard;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;", "onAudioStartRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStartAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;", "onAudioStopRecord", "(Lcom/zykj/sketch/EzyDrawBoard$AudioStopAction;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;", "", "onZoom", "(Lcom/zykj/sketch/EzyDrawBoard$ActionZoom;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;", "onTranslation", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTranslation;)Z", "Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;", "resetMatrix", "(Lcom/zykj/sketch/EzyDrawBoard$ActionResetMatrix;)V", "Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;", "resetData", "initConfig", "(Lcom/zykj/sketch/EzyDrawBoard$GraphResetData;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionContent;", "actionContent", "updateMode", "graphSnapShot", "(Lcom/zykj/sketch/EzyDrawBoard$ActionContent;Z)V", "(Lcom/zykj/sketch/GraphSnapshot$GraphData;)V", "rootGraph", "buildGraph", "(Lcom/zykj/sketch/core/graph/Graph;Lcom/zykj/sketch/GraphSnapshot$GraphData;)Lcom/zykj/sketch/core/graph/Graph;", "", "", "list", "Landroid/graphics/Matrix;", "buildMatrix", "(Ljava/util/List;)Landroid/graphics/Matrix;", "reset", "()V", "Lcom/zykj/sketch/core/listener/ViewControl;", "viewControl", "addViewControl", "(Lcom/zykj/sketch/core/listener/ViewControl;)V", "Landroid/view/ViewGroup;", "Lcom/zykj/sketch/core/listener/IControl;", "Lcom/zykj/sketch/core/ActionStrategyFactory;", "Lcom/zykj/sketch/core/listener/IAction;", "Lcom/zykj/sketch/core/listener/IAction;", "getAction", "()Lcom/zykj/sketch/core/listener/IAction;", "setAction", "(Lcom/zykj/sketch/core/listener/IAction;)V", "viewControlList", "Ljava/util/List;", "", "matrixValue", "[F", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class ActionExecute implements EventListener {

    @Nullable
    private IAction action;

    @NotNull
    private final ActionStrategyFactory actionFactory;

    @NotNull
    private final IControl control;

    @NotNull
    private final float[] matrixValue;

    @NotNull
    private final List<ViewControl> viewControlList;

    @NotNull
    private final ViewGroup viewGroup;

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
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

    public ActionExecute(@NotNull ViewGroup viewGroup, @NotNull IControl control, @NotNull ActionStrategyFactory actionFactory) {
        AbstractC5830k.m5330g(viewGroup, "viewGroup");
        AbstractC5830k.m5330g(control, "control");
        AbstractC5830k.m5330g(actionFactory, "actionFactory");
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
                AbstractC5830k.m5329f(fileName, "fileData.fileName");
                ImageHistoryGraph imageHistoryGraph = new ImageHistoryGraph(iControl, width, height, viewWidth, viewHeight, fileName);
                setAttribute2$default(this, imageHistoryGraph, graphSnapshot, null, 4, null);
                return imageHistoryGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                AbstractC5830k.m5329f(fileName2, "fileData.fileName");
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
                setAttribute2(strokeGraph, graphSnapshot, new InterfaceC6471c() { // from class: com.zykj.sketch.core.ActionExecute$buildHistoryGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull Graph it) {
                        AbstractC5830k.m5330g(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        AbstractC5830k.m5329f(pointFList, "touchData.pointFList");
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

    private final void setAttribute(Graph fatherGraph, Graph graph, GraphSnapshot.GraphData graphSnapshot, InterfaceC6471c callBack) {
        List<Float> matrixList = graphSnapshot.getMatrixList();
        AbstractC5830k.m5329f(matrixList, "graphSnapshot.matrixList");
        graph.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphSnapshot.getChildExtendMatrixList();
        AbstractC5830k.m5329f(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph, graphSnapshot.getColor(), graphSnapshot.getWidth());
        graph.setSelect(graphSnapshot.getIsSelect());
        graph.setShowDelete(graphSnapshot.getShowDelete());
        String name = graphSnapshot.getName();
        AbstractC5830k.m5329f(name, "graphSnapshot.name");
        graph.setName(name);
        graph.setOutRect(new RectF(graphSnapshot.getOutRect().getLeft(), graphSnapshot.getOutRect().getTop(), graphSnapshot.getOutRect().getRight(), graphSnapshot.getOutRect().getBottom()));
        callBack.invoke(graph);
        if (fatherGraph != null) {
            fatherGraph.addGraph(graph);
        }
        List<GraphSnapshot.GraphData> childGraphList = graphSnapshot.getChildGraphList();
        AbstractC5830k.m5329f(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            AbstractC5830k.m5329f(it, "it");
            buildGraph(graph, it);
        }
    }

    public static /* synthetic */ void setAttribute$default(ActionExecute actionExecute, Graph graph, Graph graph2, GraphSnapshot.GraphData graphData, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute");
        }
        if ((i & 8) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute.1
                public final void invoke(@NotNull Graph it) {
                    AbstractC5830k.m5330g(it, "it");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Graph) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        actionExecute.setAttribute(graph, graph2, graphData, interfaceC6471c);
    }

    private final void setAttribute2(Graph graph, GraphSnapshot.GraphData graphSnapshot, InterfaceC6471c callBack) {
        List<Float> matrixList = graphSnapshot.getMatrixList();
        AbstractC5830k.m5329f(matrixList, "graphSnapshot.matrixList");
        graph.setMatrix(buildMatrix(matrixList));
        List<Float> childExtendMatrixList = graphSnapshot.getChildExtendMatrixList();
        AbstractC5830k.m5329f(childExtendMatrixList, "graphSnapshot.childExtendMatrixList");
        graph.setChildExtendMatrix(buildMatrix(childExtendMatrixList));
        GraphExtKt.initPaint(graph, graphSnapshot.getColor(), graphSnapshot.getWidth());
        graph.setSelect(graphSnapshot.getIsSelect());
        graph.setShowDelete(graphSnapshot.getShowDelete());
        String name = graphSnapshot.getName();
        AbstractC5830k.m5329f(name, "graphSnapshot.name");
        graph.setName(name);
        graph.setOutRect(new RectF(graphSnapshot.getOutRect().getLeft(), graphSnapshot.getOutRect().getTop(), graphSnapshot.getOutRect().getRight(), graphSnapshot.getOutRect().getBottom()));
        callBack.invoke(graph);
        List<GraphSnapshot.GraphData> childGraphList = graphSnapshot.getChildGraphList();
        AbstractC5830k.m5329f(childGraphList, "graphSnapshot.childGraphList");
        for (GraphSnapshot.GraphData it : childGraphList) {
            AbstractC5830k.m5329f(it, "it");
            Graph graphBuildHistoryGraph = buildHistoryGraph(it);
            if (graphBuildHistoryGraph != null) {
                graph.addGraph(graphBuildHistoryGraph);
            }
        }
    }

    public static /* synthetic */ void setAttribute2$default(ActionExecute actionExecute, Graph graph, GraphSnapshot.GraphData graphData, InterfaceC6471c interfaceC6471c, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setAttribute2");
        }
        if ((i & 4) != 0) {
            interfaceC6471c = new InterfaceC6471c() { // from class: com.zykj.sketch.core.ActionExecute.setAttribute2.1
                public final void invoke(@NotNull Graph it) {
                    AbstractC5830k.m5330g(it, "it");
                }

                @Override // p152r6.InterfaceC6471c
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Graph) obj2);
                    return C5443s.f8405a;
                }
            };
        }
        actionExecute.setAttribute2(graph, graphData, interfaceC6471c);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void addViewControl(@NotNull ViewControl viewControl) {
        AbstractC5830k.m5330g(viewControl, "viewControl");
        this.viewControlList.add(viewControl);
    }

    @Nullable
    public final Graph buildGraph(@Nullable Graph rootGraph, @NotNull GraphSnapshot.GraphData graphSnapshot) {
        AbstractC5830k.m5330g(graphSnapshot, "graphSnapshot");
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
                AbstractC5830k.m5329f(fileName, "fileData.fileName");
                Graph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, fileName, file.getPositionFlag());
                setAttribute(rootGraph, imageGraph, graphSnapshot, new InterfaceC6471c() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$3$1
                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull Graph it) {
                        AbstractC5830k.m5330g(it, "it");
                        ((ImageGraph) it).checkOldData();
                    }
                });
                return imageGraph;
            case 4:
                GraphSnapshot.File file2 = (GraphSnapshot.File) graphSnapshot.getExtra().unpack(GraphSnapshot.File.class);
                ViewGroup viewGroup = this.viewGroup;
                String fileName2 = file2.getFileName();
                AbstractC5830k.m5329f(fileName2, "fileData.fileName");
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
                setAttribute(rootGraph, strokeGraph, graphSnapshot, new InterfaceC6471c() { // from class: com.zykj.sketch.core.ActionExecute$buildGraph$6$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // p152r6.InterfaceC6471c
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((Graph) obj);
                        return C5443s.f8405a;
                    }

                    public final void invoke(@NotNull Graph it) {
                        AbstractC5830k.m5330g(it, "it");
                        List<GraphSnapshot.PointF> pointFList = touch.getPointFList();
                        AbstractC5830k.m5329f(pointFList, "touchData.pointFList");
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

    @NotNull
    public final Matrix buildMatrix(@NotNull List<Float> list) {
        AbstractC5830k.m5330g(list, "list");
        float[] fArr = new float[9];
        int i = 0;
        for (Object obj : list) {
            int i8 = i + 1;
            if (i < 0) {
                AbstractC5806u.m5258L();
                throw null;
            }
            fArr[i] = ((Number) obj).floatValue();
            i = i8;
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    @Nullable
    public final IAction getAction() {
        return this.action;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void graphSnapShot(@NotNull EzyDrawBoard.ActionContent actionContent, boolean updateMode) {
        AbstractC5830k.m5330g(actionContent, "actionContent");
        GraphSnapshot.GraphData graphSnapshot = actionContent.getGraphSnapshot();
        AbstractC5830k.m5329f(graphSnapshot, "actionContent.graphSnapshot");
        // An absent proto3 submessage yields an empty root. The native V5 audio-boundary
        // callback still replaces the tree; resetData reconnects the drawing strategy.
        Graph graphBuildGraph = buildGraph(null, graphSnapshot);
        if (graphBuildGraph != null) {
            this.control.setRootGraph(graphBuildGraph);
            if (actionContent.hasResetData()) {
                EzyDrawBoard.GraphResetData resetData = actionContent.getResetData();
                AbstractC5830k.m5329f(resetData, "actionContent.resetData");
                initConfig(resetData);
            }
        }
        this.control.forceRender();
        this.control.resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void initConfig(@NotNull EzyDrawBoard.GraphResetData resetData) {
        AbstractC5830k.m5330g(resetData, "resetData");
        IControl iControl = this.control;
        EzyDrawBoard.ActionModeConfig.Mode modeConfig = resetData.getModeConfig();
        AbstractC5830k.m5329f(modeConfig, "resetData.modeConfig");
        iControl.setMode(modeConfig);
        IControl iControl2 = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig graphConfig = resetData.getGraphConfig();
        AbstractC5830k.m5329f(graphConfig, "resetData.graphConfig");
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
        AbstractC5830k.m5329f(action, "resetData.action");
        actionStrategyFactory.parseActionMode(action);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onActionModeEvent(@NotNull EzyDrawBoard.ActionModeConfig modeConfig) {
        AbstractC5830k.m5330g(modeConfig, "modeConfig");
        if (this.control.getCurrentMode() != modeConfig.getMode()) {
            IControl iControl = this.control;
            EzyDrawBoard.ActionModeConfig.Mode mode = modeConfig.getMode();
            AbstractC5830k.m5329f(mode, "modeConfig.mode");
            iControl.setMode(mode);
            this.control.resetStatus();
            this.actionFactory.clearAction();
        }
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddImageEvent(@NotNull EzyDrawBoard.ActionImageConfig imageConfig, @NotNull InterfaceC6471c callBack) {
        AbstractC5830k.m5330g(imageConfig, "imageConfig");
        AbstractC5830k.m5330g(callBack, "callBack");
        IControl iControl = this.control;
        int width = imageConfig.getWidth();
        int height = imageConfig.getHeight();
        int viewWidth = imageConfig.getViewWidth();
        int viewHeight = imageConfig.getViewHeight();
        String path = imageConfig.getPath();
        AbstractC5830k.m5329f(path, "imageConfig.path");
        ImageGraph imageGraph = new ImageGraph(iControl, width, height, viewWidth, viewHeight, path, imageConfig.getPositionFlag());
        addNewGraph(imageGraph);
        callBack.invoke(imageGraph);
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAddPPTEvent(@NotNull EzyDrawBoard.ActionWebViewConfig webViewConfig, @NotNull InterfaceC6471c viewBack) {
        AbstractC5830k.m5330g(webViewConfig, "webViewConfig");
        AbstractC5830k.m5330g(viewBack, "viewBack");
        ViewGroup viewGroup = this.viewGroup;
        String path = webViewConfig.getPath();
        AbstractC5830k.m5329f(path, "webViewConfig.path");
        addNewGraph(new WebViewGraph(viewGroup, path, this.control, webViewConfig.getWidth(), webViewConfig.getHeight(), webViewConfig.getViewWidth(), webViewConfig.getViewHeight(), viewBack));
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStartRecord(@NotNull EzyDrawBoard.AudioStartAction action) {
        AbstractC5830k.m5330g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onAudioStopRecord(@NotNull EzyDrawBoard.AudioStopAction action) {
        AbstractC5830k.m5330g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onClearBoardEvent(@NotNull EzyDrawBoard.ActionClearBoard action) {
        AbstractC5830k.m5330g(action, "action");
        this.control.clear();
        this.actionFactory.reset();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onDrawConfigEvent(@NotNull EzyDrawBoard.ActionDrawConfig config) {
        EzyDrawBoard.DrawArea drawArea;
        AbstractC5830k.m5330g(config, "config");
        if (config.hasField(EzyDrawBoard.ActionDrawConfig.getDescriptor().findFieldByName("backgroundColor"))) {
            this.control.setBackgroundColor(config.getBackgroundColor());
        }
        if (config.hasDrawArea() && (drawArea = config.getDrawArea()) != null) {
            this.control.setDrawArea(drawArea);
        }
        this.control.resetStatus();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onGraphConfigEvent(@NotNull EzyDrawBoard.ActionGraphConfig graphConfig) {
        AbstractC5830k.m5330g(graphConfig, "graphConfig");
        IControl iControl = this.control;
        EzyDrawBoard.ActionGraphConfig.GraphConfig config = graphConfig.getConfig();
        AbstractC5830k.m5329f(config, "graphConfig.config");
        iControl.setRecordConfig(config);
        this.control.resetStatus();
        this.actionFactory.clearAction();
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onNextActionEvent(@NotNull EzyDrawBoard.ActionNextAction action) {
        AbstractC5830k.m5330g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onPrevActionEvent(@NotNull EzyDrawBoard.ActionPrevAction action) {
        AbstractC5830k.m5330g(action, "action");
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void onTouchEvent(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        IAction iAction;
        AbstractC5830k.m5330g(event, "event");
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
            companion.m4523i(String.valueOf(iAction2 != null ? iAction2.enumType() : null));
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
    public boolean onTranslation(@NotNull EzyDrawBoard.ActionTranslation action) {
        AbstractC5830k.m5330g(action, "action");
        Matrix mMatrix = this.control.getRootGraph().getMMatrix();
        // Absolute translation replaces only the provided axis; the other axis survives.
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
    public boolean onZoom(@NotNull EzyDrawBoard.ActionZoom action) {
        AbstractC5830k.m5330g(action, "action");
        Matrix mMatrix = this.control.getRootGraph().getMMatrix();
        // The absolute zoom branch rebuilds the matrix around the existing translation.
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
    public void resetMatrix(@NotNull EzyDrawBoard.ActionResetMatrix action) {
        AbstractC5830k.m5330g(action, "action");
        this.control.getRootGraph().getMMatrix().reset();
        this.control.resetStatus();
    }

    public final void setAction(@Nullable IAction iAction) {
        this.action = iAction;
    }

    @Override // com.zykj.sketch.core.listener.EventListener
    public void graphSnapShot(@NotNull GraphSnapshot.GraphData graphSnapshot) {
        AbstractC5830k.m5330g(graphSnapshot, "graphSnapshot");
        Graph graphBuildHistoryGraph = buildHistoryGraph(graphSnapshot);
        if (graphBuildHistoryGraph != null) {
            this.control.setRootGraph(graphBuildHistoryGraph);
        }
        this.control.forceRender();
    }
}
