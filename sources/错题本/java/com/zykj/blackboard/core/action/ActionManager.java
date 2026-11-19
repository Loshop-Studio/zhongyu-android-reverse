package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.InvalidProtocolBufferException;
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
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.blackboard.utils.EventConvert;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyModeEnum$ModeEnum;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyRectF$RectF;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0016\u0010\u0017J?\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b&\u0010'J+\u0010,\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b,\u0010-J-\u00100\u001a\u00020\u00122\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)H\u0016¢\u0006\u0004\b0\u00101J%\u00104\u001a\u00020\u00122\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001a2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105JU\u0010?\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010\u001e\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001f2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016¢\u0006\u0004\b?\u0010@Jc\u0010E\u001a\u00020\u00122\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u0002062\u0006\u0010B\u001a\u00020A2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u001a2\u0006\u0010\u001e\u001a\u00020;2\u0014\u0010>\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016¢\u0006\u0004\bE\u0010FJa\u0010O\u001a\u00020\u00122\u0006\u0010G\u001a\u00020%2\u0006\u0010H\u001a\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010I2\b\u0010<\u001a\u0004\u0018\u00010\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010;2\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020C\u0018\u00010\u001a2\b\u0010M\u001a\u0004\u0018\u00010L2\b\u0010N\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\bO\u0010PJ%\u0010Q\u001a\u00020\u00122\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\bQ\u0010RJ\u0011\u0010T\u001a\u0004\u0018\u00010SH\u0016¢\u0006\u0004\bT\u0010UJ\u0011\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bW\u0010XJ\u0011\u0010Z\u001a\u0004\u0018\u00010YH\u0016¢\u0006\u0004\bZ\u0010[J\u000f\u0010]\u001a\u00020\\H\u0016¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u0006H\u0016¢\u0006\u0004\ba\u0010bJ\u000f\u0010c\u001a\u00020\bH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0012H\u0016¢\u0006\u0004\be\u0010fJ\u001d\u0010h\u001a\u00020\u00122\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aH\u0016¢\u0006\u0004\bh\u0010iJ\u001d\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0012\u0018\u00010=H\u0016¢\u0006\u0004\bj\u0010kJ!\u0010m\u001a\u00020\u00122\b\u0010l\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\bm\u0010nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010oR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010pR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010qR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010rR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010sR\u0016\u0010\r\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010tR\u0018\u0010u\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0017\u0010x\u001a\u00020w8\u0006¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R%\u0010|\u001a\u0004\u0018\u00010S8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010U\"\u0005\b\u007f\u0010\u0080\u0001R*\u0010\u0081\u0001\u001a\u0004\u0018\u00010V8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0005\b\u0083\u0001\u0010X\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u0086\u0001\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010[\"\u0006\b\u0089\u0001\u0010\u008a\u0001R=\u0010\u008e\u0001\u001a\u0016\u0012\u0005\u0012\u00030\u008c\u00010\u008b\u0001j\n\u0012\u0005\u0012\u00030\u008c\u0001`\u008d\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001RG\u0010\u0096\u0001\u001a!\u0012\u0015\u0012\u00130\u001f¢\u0006\u000e\b\u0094\u0001\u0012\t\b\u0095\u0001\u0012\u0004\b\b(!\u0012\u0004\u0012\u00020\u0012\u0018\u00010=8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010k\"\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009b\u0001"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/ActionManager;", "Lcom/zykj/blackboard/core/action/IActionListener;", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "graphControl", "Lcom/zykj/blackboard/bean/BoardConfig;", "boardConfig", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "routerRecord", "Lcom/zykj/blackboard/core/edit/HistoryControl;", "historyControl", "<init>", "(Lcom/zykj/blackboard/core/canvas/control/GraphControl;Lcom/zykj/blackboard/bean/BoardConfig;Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/loader/SourceLoader;Lcom/zykj/blackboard/core/record/SourceRouterRecord;Lcom/zykj/blackboard/core/edit/HistoryControl;)V", "Landroid/view/MotionEvent;", "motionEvent", "Ld6/s;", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/core/action/ITouchAction;", "getCurrentAction", "()Lcom/zykj/blackboard/core/action/ITouchAction;", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "eventList", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "", "parentGraphId", "graphId", "Lcom/zykj/blackboard/core/graph/Graph;", "writingGraphEvent", "(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/blackboard/core/graph/IGraph;", "groupGraphEvent", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "", "Lcom/zykj/board/EzyMatrix$Matrix;", "matrixList", "transformGraphEvent", "(Ljava/util/List;Ljava/util/List;)V", "originMatrix", "lastMatrix", "transformCameraEvent", "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V", "", "currentTime", "deleteGraphEvent", "(Ljava/util/List;J)V", "", "width", "height", "x", "y", "Landroid/graphics/Paint;", "content", "Lkotlin/Function1;", "callback", "textGraphEvent", "(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V", "", "geometryType", "Landroid/graphics/PointF;", "pointList", "geometryGraphEvent", "(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V", "graph", "graphEnum", "Landroid/graphics/RectF;", "originRectF", "points", "Landroid/graphics/Matrix;", "renderMatrix", "filePath", "changeGraph", "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V", "moveCursor", "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V", "Lcom/zykj/blackboard/listener/ITextSelectListener;", "getTextSelectListener", "()Lcom/zykj/blackboard/listener/ITextSelectListener;", "Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "getGeometrySelectListener", "()Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "getAreaMoveListener", "()Lcom/zykj/blackboard/listener/IAreaMoveListener;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getSourceLoader", "()Lcom/zykj/blackboard/core/loader/SourceLoader;", "saveSnapshot", "()V", "graphIdList", "newSelectGraph", "(Ljava/util/List;)V", "getGeometryCreateListener", "()Lr6/c;", "mode", "handleNewSelectTouchEvent", "(Lcom/zykj/blackboard/core/action/ITouchAction;Landroid/view/MotionEvent;)V", "Lcom/zykj/blackboard/core/canvas/control/GraphControl;", "Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "Lcom/zykj/blackboard/core/record/SourceRouterRecord;", "Lcom/zykj/blackboard/core/edit/HistoryControl;", "actionMode", "Lcom/zykj/blackboard/core/action/ITouchAction;", "Lcom/zykj/blackboard/core/action/TouchActionModeFactory;", "modeFactory", "Lcom/zykj/blackboard/core/action/TouchActionModeFactory;", "getModeFactory", "()Lcom/zykj/blackboard/core/action/TouchActionModeFactory;", "mTextSelectListener", "Lcom/zykj/blackboard/listener/ITextSelectListener;", "getMTextSelectListener", "setMTextSelectListener", "(Lcom/zykj/blackboard/listener/ITextSelectListener;)V", "mGeometrySelectListener", "Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "getMGeometrySelectListener", "setMGeometrySelectListener", "(Lcom/zykj/blackboard/listener/IGeometrySelectListener;)V", "mAreaMoveListener", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "getMAreaMoveListener", "setMAreaMoveListener", "(Lcom/zykj/blackboard/listener/IAreaMoveListener;)V", "Ljava/util/ArrayList;", "Lcom/zykj/blackboard/listener/GraphDeleteListener;", "Lkotlin/collections/ArrayList;", "mGraphDeleteListenerList", "Ljava/util/ArrayList;", "getMGraphDeleteListenerList", "()Ljava/util/ArrayList;", "setMGraphDeleteListenerList", "(Ljava/util/ArrayList;)V", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "mGeometryCreateListener", "Lr6/c;", "getMGeometryCreateListener", "setMGeometryCreateListener", "(Lr6/c;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class ActionManager implements IActionListener {

    @Nullable
    private ITouchAction actionMode;

    @NotNull
    private final BoardConfig boardConfig;

    @NotNull
    private final GraphControl graphControl;

    @Nullable
    private final HistoryControl historyControl;

    @Nullable
    private IAreaMoveListener mAreaMoveListener;

    @Nullable
    private InterfaceC6471c mGeometryCreateListener;

    @Nullable
    private IGeometrySelectListener mGeometrySelectListener;

    @NotNull
    private ArrayList<GraphDeleteListener> mGraphDeleteListenerList;

    @Nullable
    private ITextSelectListener mTextSelectListener;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    @NotNull
    private final TouchActionModeFactory modeFactory;

    @Nullable
    private final SourceRouterRecord routerRecord;

    @NotNull
    private final SourceLoader sourceLoader;

    public ActionManager(@NotNull GraphControl graphControl, @NotNull BoardConfig boardConfig, @NotNull MatrixAdapter matrixAdapter, @NotNull SourceLoader sourceLoader, @Nullable SourceRouterRecord sourceRouterRecord, @Nullable HistoryControl historyControl) {
        AbstractC5830k.m5330g(graphControl, "graphControl");
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(sourceLoader, "sourceLoader");
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

    private final void handleNewSelectTouchEvent(ITouchAction mode, MotionEvent motionEvent) {
        if (mode instanceof NewSelectAction) {
            ((NewSelectAction) mode).onTouchEvent(motionEvent);
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void changeGraph(@NotNull IGraph graph, @NotNull EzyGraphEnum$GraphEnum graphEnum, @Nullable RectF originRectF, @Nullable String content, @Nullable Paint paint, @Nullable List<? extends PointF> points, @Nullable Matrix renderMatrix, @Nullable String filePath) throws ExecutionException, InterruptedException {
        CommandRecord commandRecord;
        ArrayList arrayList;
        AbstractC5830k.m5330g(graph, "graph");
        AbstractC5830k.m5330g(graphEnum, "graphEnum");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        String id = graph.getId();
        EzyRectF$RectF ezyRectF$RectFCovertEzyRectF = originRectF != null ? GraphUtilsKt.covertEzyRectF(originRectF) : null;
        EzyPaint$Paint ezyPaint$PaintCovertEzyPaint = paint != null ? GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f) : null;
        if (points != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC5806u.m5277p(points, 10));
            Iterator<T> it = points.iterator();
            while (it.hasNext()) {
                arrayList2.add(GraphUtilsKt.covertEzyPointF((PointF) it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        commandRecord.changeGraph(id, graphEnum, ezyRectF$RectFCovertEzyRectF, content, ezyPaint$PaintCovertEzyPaint, arrayList, renderMatrix != null ? MatrixExtKt.toEzyMatrix(renderMatrix, System.currentTimeMillis()) : null, filePath, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void deleteGraphEvent(@NotNull List<? extends IGraph> graphList, long currentTime) {
        CommandRecord commandRecord;
        AbstractC5830k.m5330g(graphList, "graphList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord != null && (commandRecord = sourceRouterRecord.getCommandRecord()) != null) {
            ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(graphList, 10));
            Iterator<T> it = graphList.iterator();
            while (it.hasNext()) {
                arrayList.add(((IGraph) it.next()).getGraphData().build());
            }
            commandRecord.removeGraphList(arrayList, currentTime);
        }
        for (IGraph iGraph : graphList) {
            ArrayList<GraphDeleteListener> arrayList2 = this.mGraphDeleteListenerList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                GraphDeleteListener graphDeleteListener = arrayList2.get(i);
                i++;
                graphDeleteListener.onGraphDelete(iGraph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void geometryGraphEvent(float width, float height, float x3, float y2, int geometryType, @NotNull List<? extends PointF> pointList, @NotNull Paint paint, @Nullable InterfaceC6471c callback) throws InvalidProtocolBufferException {
        SourceRouterRecord sourceRouterRecord;
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddGeometryGraphCommand;
        AbstractC5830k.m5330g(pointList, "pointList");
        AbstractC5830k.m5330g(paint, "paint");
        String strRootGraphId = this.graphControl.rootGraphId();
        if (strRootGraphId == null || (sourceRouterRecord = this.routerRecord) == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddGeometryGraphCommand = commandRecord.addGeometryGraphCommand(strRootGraphId, width, height, geometryType, pointList, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddGeometryGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph != null) {
            float[] fArr = {x3, y2};
            MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            transformGraphEvent(AbstractC5806u.m5286y(graph), AbstractC5806u.m5247A(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
            graph.concatMatrix(matrix);
            if (callback != null) {
                callback.invoke(graph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    /* renamed from: getAreaMoveListener, reason: from getter */
    public IAreaMoveListener getMAreaMoveListener() {
        return this.mAreaMoveListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @NotNull
    public BoardConfig getBoardConfig() {
        return this.boardConfig;
    }

    @Nullable
    public final ITouchAction getCurrentAction() {
        return this.modeFactory.getCurrentAction(this);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    /* renamed from: getGeometryCreateListener, reason: from getter */
    public InterfaceC6471c getMGeometryCreateListener() {
        return this.mGeometryCreateListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    /* renamed from: getGeometrySelectListener, reason: from getter */
    public IGeometrySelectListener getMGeometrySelectListener() {
        return this.mGeometrySelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @NotNull
    public IGraphControl getGraphControl() {
        return this.graphControl;
    }

    @Nullable
    public final IAreaMoveListener getMAreaMoveListener() {
        return this.mAreaMoveListener;
    }

    @Nullable
    public final InterfaceC6471c getMGeometryCreateListener() {
        return this.mGeometryCreateListener;
    }

    @Nullable
    public final IGeometrySelectListener getMGeometrySelectListener() {
        return this.mGeometrySelectListener;
    }

    @NotNull
    public final ArrayList<GraphDeleteListener> getMGraphDeleteListenerList() {
        return this.mGraphDeleteListenerList;
    }

    @Nullable
    public final ITextSelectListener getMTextSelectListener() {
        return this.mTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @NotNull
    public MatrixAdapter getMatrixAdapter() {
        return this.matrixAdapter;
    }

    @NotNull
    public final TouchActionModeFactory getModeFactory() {
        return this.modeFactory;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @NotNull
    public SourceLoader getSourceLoader() {
        return this.sourceLoader;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    public ITextSelectListener getTextSelectListener() {
        return this.mTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    public IGraph groupGraphEvent(@NotNull String parentGraphId) throws InvalidProtocolBufferException {
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddCommand;
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddCommand = commandRecord.addCommand(parentGraphId, EzyGraphEnum$GraphEnum.GROUP_GRAPH, EzyRectF$RectF.newBuilder().build(), System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph == null) {
            return null;
        }
        this.graphControl.addGraph(graphData.getParentGraphId(), graph);
        return graph;
    }

    public final void handleTouchEvent(@NotNull MotionEvent motionEvent) {
        ITouchAction iTouchAction;
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
        EzyTouchEvent$TouchEvent ezyTouchEvent$TouchEventMotionEventConvertTouchEvent = EventConvert.INSTANCE.motionEventConvertTouchEvent(motionEvent, MatrixExtKt.invert(this.matrixAdapter.getAdapterMatrix()));
        int action = ezyTouchEvent$TouchEventMotionEventConvertTouchEvent.getAction();
        if (action == 0) {
            ITouchAction iTouchActionCreate = this.modeFactory.create(this);
            this.actionMode = iTouchActionCreate;
            if (iTouchActionCreate != null) {
                iTouchActionCreate.onTouchDown(ezyTouchEvent$TouchEventMotionEventConvertTouchEvent);
            }
        } else if (action == 1) {
            ITouchAction iTouchAction2 = this.actionMode;
            if (iTouchAction2 != null) {
                iTouchAction2.onTouchUp(ezyTouchEvent$TouchEventMotionEventConvertTouchEvent);
            }
            handleNewSelectTouchEvent(this.actionMode, motionEvent);
            this.actionMode = null;
        } else if (action == 2) {
            ITouchAction iTouchAction3 = this.actionMode;
            if (iTouchAction3 != null) {
                iTouchAction3.onTouchMove(ezyTouchEvent$TouchEventMotionEventConvertTouchEvent);
            }
        } else if (action == 5) {
            ITouchAction iTouchAction4 = this.actionMode;
            if (iTouchAction4 != null) {
                iTouchAction4.onTouchPointerDown(ezyTouchEvent$TouchEventMotionEventConvertTouchEvent);
            }
        } else if (action == 6 && (iTouchAction = this.actionMode) != null) {
            iTouchAction.onTouchPointerUp(ezyTouchEvent$TouchEventMotionEventConvertTouchEvent);
        }
        handleNewSelectTouchEvent(this.actionMode, motionEvent);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void moveCursor(@NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint) {
        CommandRecord commandRecord;
        AbstractC5830k.m5330g(eventList, "eventList");
        AbstractC5830k.m5330g(paint, "paint");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        commandRecord.moveCursor(eventList, paint, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void newSelectGraph(@NotNull List<String> graphIdList) {
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        this.boardConfig.setMode(EzyModeEnum$ModeEnum.ACTION_NEW_SELECT);
        ITouchAction currentAction = getCurrentAction();
        AbstractC5830k.m5328e(currentAction, "null cannot be cast to non-null type com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction");
        ((NewSelectAction) currentAction).selectGraphList(graphIdList);
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void saveSnapshot() {
        HistoryControl historyControl;
        IGraph rootGraph = this.graphControl.getRootGraph();
        if (rootGraph == null || (historyControl = this.historyControl) == null) {
            return;
        }
        historyControl.saveSnapshot((Graph) rootGraph, this.graphControl.getBackgroundColor(), this.graphControl.getBackgroundLineConfig());
    }

    public final void setMAreaMoveListener(@Nullable IAreaMoveListener iAreaMoveListener) {
        this.mAreaMoveListener = iAreaMoveListener;
    }

    public final void setMGeometryCreateListener(@Nullable InterfaceC6471c interfaceC6471c) {
        this.mGeometryCreateListener = interfaceC6471c;
    }

    public final void setMGeometrySelectListener(@Nullable IGeometrySelectListener iGeometrySelectListener) {
        this.mGeometrySelectListener = iGeometrySelectListener;
    }

    public final void setMGraphDeleteListenerList(@NotNull ArrayList<GraphDeleteListener> arrayList) {
        AbstractC5830k.m5330g(arrayList, "<set-?>");
        this.mGraphDeleteListenerList = arrayList;
    }

    public final void setMTextSelectListener(@Nullable ITextSelectListener iTextSelectListener) {
        this.mTextSelectListener = iTextSelectListener;
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void textGraphEvent(float width, float height, float x3, float y2, @NotNull Paint paint, @NotNull String content, @Nullable InterfaceC6471c callback) throws InvalidProtocolBufferException {
        SourceRouterRecord sourceRouterRecord;
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddTextGraphCommand;
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(content, "content");
        String strRootGraphId = this.graphControl.rootGraphId();
        if (strRootGraphId == null || (sourceRouterRecord = this.routerRecord) == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddTextGraphCommand = commandRecord.addTextGraphCommand(strRootGraphId, width, height, GraphUtilsKt.covertEzyPaint(paint, 1.0f, 0.0f), content, System.currentTimeMillis())) == null) {
            return;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddTextGraphCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        Graph graph = graphBuildFactory.parse(graphData, this.sourceLoader);
        if (graph != null) {
            float[] fArr = {x3, y2};
            MatrixExtKt.invert(getMatrixAdapter().getAdapterMatrix()).mapPoints(fArr);
            Matrix matrix = new Matrix();
            matrix.postTranslate(fArr[0], fArr[1]);
            transformGraphEvent(AbstractC5806u.m5286y(graph), AbstractC5806u.m5247A(MatrixExtKt.toEzyMatrix(matrix, System.currentTimeMillis())));
            graph.concatMatrix(matrix);
            if (callback != null) {
                callback.invoke(graph);
            }
        }
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void transformCameraEvent(@NotNull EzyMatrix$Matrix originMatrix, @NotNull EzyMatrix$Matrix lastMatrix, @NotNull List<EzyMatrix$Matrix> matrixList) {
        CommandRecord commandRecord;
        AbstractC5830k.m5330g(originMatrix, "originMatrix");
        AbstractC5830k.m5330g(lastMatrix, "lastMatrix");
        AbstractC5830k.m5330g(matrixList, "matrixList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        commandRecord.addCameraMatrix(originMatrix, lastMatrix, matrixList, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    public void transformGraphEvent(@NotNull List<? extends IGraph> graphList, @NotNull List<EzyMatrix$Matrix> matrixList) {
        CommandRecord commandRecord;
        AbstractC5830k.m5330g(graphList, "graphList");
        AbstractC5830k.m5330g(matrixList, "matrixList");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(graphList, 10));
        Iterator<T> it = graphList.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getGraphData().build());
        }
        commandRecord.addGraphMatrix(arrayList, matrixList, System.currentTimeMillis());
    }

    @Override // com.zykj.blackboard.core.action.IActionListener
    @Nullable
    public Graph writingGraphEvent(@NotNull EzyGraphEnum$GraphEnum graphType, @NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint, @NotNull String parentGraphId, @NotNull String graphId) throws InvalidProtocolBufferException {
        CommandRecord commandRecord;
        CommandInfoEntity commandInfoEntityAddCommand;
        AbstractC5830k.m5330g(graphType, "graphType");
        AbstractC5830k.m5330g(eventList, "eventList");
        AbstractC5830k.m5330g(paint, "paint");
        AbstractC5830k.m5330g(parentGraphId, "parentGraphId");
        AbstractC5830k.m5330g(graphId, "graphId");
        SourceRouterRecord sourceRouterRecord = this.routerRecord;
        if (sourceRouterRecord == null || (commandRecord = sourceRouterRecord.getCommandRecord()) == null || (commandInfoEntityAddCommand = commandRecord.addCommand(parentGraphId, graphType, eventList, paint, graphId, System.currentTimeMillis())) == null) {
            return null;
        }
        EzyCommand$CommandSource.CommandInfo.GraphData graphData = EzyCommand$CommandSource.CommandInfo.GraphData.parseFrom(commandInfoEntityAddCommand.getData());
        GraphBuildFactory graphBuildFactory = GraphBuildFactory.INSTANCE;
        AbstractC5830k.m5329f(graphData, "graphData");
        return graphBuildFactory.parse(graphData, this.sourceLoader);
    }

    public /* synthetic */ ActionManager(GraphControl graphControl, BoardConfig boardConfig, MatrixAdapter matrixAdapter, SourceLoader sourceLoader, SourceRouterRecord sourceRouterRecord, HistoryControl historyControl, int i, AbstractC5824e abstractC5824e) {
        this(graphControl, boardConfig, matrixAdapter, sourceLoader, (i & 16) != 0 ? null : sourceRouterRecord, (i & 32) != 0 ? null : historyControl);
    }
}
