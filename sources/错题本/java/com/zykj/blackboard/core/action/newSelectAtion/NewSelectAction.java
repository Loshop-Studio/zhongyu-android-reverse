package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.MoveAction;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionManager;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.enums.SelectGraphEnum;
import com.zykj.blackboard.enums.SelectGraphEnumKt;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0018\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001e\u0010\u0013J\u001f\u0010!\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\fJ\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0016¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b-\u0010,J\u0017\u0010.\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b.\u0010,J\u0017\u0010/\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b/\u0010,J\u001b\u0010\u0016\u001a\u00020\r2\f\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0014¢\u0006\u0004\b\u0016\u00102J\u0015\u00105\u001a\u00020\r2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082D¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010C\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010D\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010E\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010G\u001a\u00020F8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u0010HR&\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00150Ij\b\u0012\u0004\u0012\u00020\u0015`J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010KR&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00100Ij\b\u0012\u0004\u0012\u00020\u0010`J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010KR\u0016\u0010L\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010A¨\u0006M"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/newSelectAtion/NewSelectAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "", "x", "y", "Landroid/graphics/PointF;", "getRenderPointF", "(FF)Landroid/graphics/PointF;", "", "isMove", "(FF)Z", "Ld6/s;", "handleClickToSelect", "(FF)V", "Landroid/graphics/RectF;", "rectF", "handleDragToSelect", "(Landroid/graphics/RectF;)V", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "selectGraphList", "selectGraphMinOutRectFList", "handleSelectedRectF", "(Ljava/util/List;Ljava/util/List;)V", "srcRectF", "dstRectF", "countRectF", "(Landroid/graphics/RectF;Landroid/graphics/RectF;)V", "checkMinOutRectF", "Landroid/graphics/Matrix;", "matrix", "checkMinOutRectFWithMatrix", "(Landroid/graphics/RectF;Landroid/graphics/Matrix;)V", "isDoubleClick", "Lcom/zykj/blackboard/core/action/IActionListener;", "listener", "setActionListener", "(Lcom/zykj/blackboard/core/action/IActionListener;)V", "reset", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "singleTouchDown", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "", "graphIdList", "(Ljava/util/List;)V", "Landroid/view/MotionEvent;", "motionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "maxInterval", "I", "", "lastClickTime", "J", "lastClickX", "F", "lastClickY", "isClick", "Z", "minMoveDistance", "isSpecialFunctionClick", "firstX", "firstY", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;", "functionManager", "Lcom/zykj/blackboard/core/action/newSelectAtion/function/FunctionManager;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "isStart", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class NewSelectAction extends MoveAction {
    private float firstX;
    private float firstY;
    private FunctionManager functionManager;
    private boolean isStart;
    private long lastClickTime;
    private float lastClickX;
    private float lastClickY;
    private final int maxInterval = 500;
    private boolean isClick = true;
    private final float minMoveDistance = 20.0f;
    private boolean isSpecialFunctionClick = true;

    @NotNull
    private ArrayList<IGraph> selectGraphList = new ArrayList<>();

    @NotNull
    private ArrayList<RectF> selectGraphMinOutRectFList = new ArrayList<>();

    public NewSelectAction() {
        EventBus.INSTANCE.register(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13746invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13746invoke() {
                NewSelectAction.this.selectGraphList.clear();
                NewSelectAction.this.selectGraphMinOutRectFList.clear();
                IGraphControl graphControl = NewSelectAction.this.getGraphControl();
                if (graphControl != null) {
                    graphControl.selectCancel();
                }
                if (NewSelectAction.this.functionManager != null) {
                    FunctionManager functionManager = NewSelectAction.this.functionManager;
                    if (functionManager != null) {
                        functionManager.reset();
                    } else {
                        AbstractC5830k.m5339p("functionManager");
                        throw null;
                    }
                }
            }
        });
    }

    private final void checkMinOutRectF(RectF rectF) {
        BoardConfig boardConfig = getBoardConfig();
        float f = 2;
        float selectIconWidth = (boardConfig != null ? boardConfig.getSelectIconWidth() : 36.0f) * f;
        float fWidth = selectIconWidth - rectF.width();
        float fHeight = selectIconWidth - rectF.height();
        if (fWidth > 0.0f) {
            float f7 = fWidth / f;
            rectF.left -= f7;
            rectF.right += f7;
        }
        if (fHeight > 0.0f) {
            float f8 = fHeight / f;
            rectF.top -= f8;
            rectF.bottom += f8;
        }
    }

    private final void checkMinOutRectFWithMatrix(RectF rectF, Matrix matrix) {
        Matrix matrixInvert = MatrixExtKt.invert(matrix);
        BoardConfig boardConfig = getBoardConfig();
        float f = 2;
        float selectIconWidth = (boardConfig != null ? boardConfig.getSelectIconWidth() : 36.0f) * f;
        float fMapRadius = matrixInvert.mapRadius(selectIconWidth) - rectF.width();
        float fMapRadius2 = matrixInvert.mapRadius(selectIconWidth) - rectF.height();
        if (fMapRadius > 0.0f) {
            float f7 = fMapRadius / f;
            rectF.left -= f7;
            rectF.right += f7;
        }
        if (fMapRadius2 > 0.0f) {
            float f8 = fMapRadius2 / f;
            rectF.top -= f8;
            rectF.bottom += f8;
        }
    }

    private final void countRectF(RectF srcRectF, RectF dstRectF) {
        if (dstRectF.isEmpty()) {
            dstRectF.set(srcRectF);
        } else {
            dstRectF.union(srcRectF);
        }
    }

    private final PointF getRenderPointF(float x3, float y2) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC5830k.m5327d(matrixAdapter);
        return pointUtils.mapPoint(x3, y2, matrixAdapter.getAdapterMatrix());
    }

    private final void handleClickToSelect(float x3, float y2) {
        IGraph iGraph;
        Matrix matrix;
        IGraph rootGraph;
        BoardConfig boardConfig = getBoardConfig();
        List<IGraph> childGraph = null;
        List<SelectGraphEnum> selectIncludeGraphEnumListByClick = boardConfig != null ? boardConfig.getSelectIncludeGraphEnumListByClick() : null;
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
            childGraph = rootGraph.getChildGraph();
        }
        if (childGraph == null || childGraph.isEmpty()) {
            return;
        }
        int size = childGraph.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            iGraph = childGraph.get(size);
            if (iGraph.isInRect(x3, y2, 0.0f) && (selectIncludeGraphEnumListByClick == null || selectIncludeGraphEnumListByClick.contains(SelectGraphEnumKt.convert2SelectGraphEnum(iGraph)))) {
                break;
            }
        }
        this.selectGraphList.add(iGraph);
        ArrayList<RectF> arrayList = this.selectGraphMinOutRectFList;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
            matrix = new Matrix();
        }
        arrayList.add(iGraph.getMinOutRectF(matrix));
    }

    private final void handleDragToSelect(RectF rectF) {
        Matrix matrix;
        IGraph rootGraph;
        BoardConfig boardConfig = getBoardConfig();
        List<IGraph> childGraph = null;
        List<SelectGraphEnum> selectIncludeGraphEnumListByDrag = boardConfig != null ? boardConfig.getSelectIncludeGraphEnumListByDrag() : null;
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
            childGraph = rootGraph.getChildGraph();
        }
        if (childGraph == null || childGraph.isEmpty()) {
            return;
        }
        int size = childGraph.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            IGraph iGraph = childGraph.get(size);
            IGraph iGraph2 = childGraph.get(size);
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                matrix = new Matrix();
            }
            RectF minOutRectF = iGraph2.getMinOutRectF(matrix);
            if (rectF.contains(minOutRectF) && (selectIncludeGraphEnumListByDrag == null || selectIncludeGraphEnumListByDrag.contains(SelectGraphEnumKt.convert2SelectGraphEnum(iGraph)))) {
                this.selectGraphList.add(iGraph);
                this.selectGraphMinOutRectFList.add(minOutRectF);
            }
        }
    }

    private final void handleSelectedRectF(List<? extends IGraph> selectGraphList, List<? extends RectF> selectGraphMinOutRectFList) {
        Matrix adapterMatrix;
        RectF rectF = new RectF();
        Iterator<T> it = selectGraphMinOutRectFList.iterator();
        while (it.hasNext()) {
            countRectF((RectF) it.next(), rectF);
        }
        if (rectF.isEmpty()) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.selectCancel();
                return;
            }
            return;
        }
        FunctionManager functionManager = this.functionManager;
        if (functionManager == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        functionManager.initCurrentFunction(selectGraphList);
        FunctionManager functionManager2 = this.functionManager;
        if (functionManager2 == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        functionManager2.setSelectGraphList(selectGraphList);
        IGraph iGraph = (IGraph) AbstractC5805t.m5228h0(selectGraphList);
        if (selectGraphList.size() == 1 && ((iGraph instanceof GeometryGraph) || (iGraph instanceof TextGraph) || (iGraph instanceof ImageGraph))) {
            RectF rectF2 = new RectF(iGraph.getOriginalRectF());
            Matrix matrix = new Matrix();
            matrix.postConcat(iGraph.getRenderMatrix());
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                matrix.postConcat(adapterMatrix);
            }
            PointF pointF = iGraph instanceof GeometryGraph ? (PointF) AbstractC5805t.m5229i0(((GeometryGraph) iGraph).getMovePointFList()) : null;
            checkMinOutRectFWithMatrix(rectF2, matrix);
            FunctionManager functionManager3 = this.functionManager;
            if (functionManager3 == null) {
                AbstractC5830k.m5339p("functionManager");
                throw null;
            }
            functionManager3.setSingleGraphData(rectF2, matrix, pointF);
        } else {
            checkMinOutRectF(rectF);
            FunctionManager functionManager4 = this.functionManager;
            if (functionManager4 == null) {
                AbstractC5830k.m5339p("functionManager");
                throw null;
            }
            functionManager4.setSelectRectF(rectF);
        }
        FunctionManager functionManager5 = this.functionManager;
        if (functionManager5 != null) {
            functionManager5.showSelectRectF();
        } else {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
    }

    private final boolean isDoubleClick(float x3, float y2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.isClick) {
            double d9 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(x3 - this.lastClickX, d9)) + ((float) Math.pow(y2 - this.lastClickY, d9)));
            if (jCurrentTimeMillis - this.lastClickTime < this.maxInterval && fSqrt < this.minMoveDistance) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMove(float x3, float y2) {
        PointF renderPointF = getRenderPointF(x3, y2);
        double d9 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d9)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d9))))) > this.minMoveDistance;
    }

    public final void onTouchEvent(@NotNull MotionEvent motionEvent) {
        AbstractC5830k.m5330g(motionEvent, "motionEvent");
        FunctionManager functionManager = this.functionManager;
        if (functionManager != null) {
            functionManager.handleTouchEvent(motionEvent);
        } else {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.firstX = 0.0f;
        this.firstY = 0.0f;
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
    }

    public final void selectGraphList(@NotNull List<String> graphIdList) {
        Matrix matrix;
        IGraph rootGraph;
        AbstractC5830k.m5330g(graphIdList, "graphIdList");
        reset();
        FunctionManager functionManager = this.functionManager;
        List<IGraph> childGraph = null;
        if (functionManager == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        functionManager.reset();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
            childGraph = rootGraph.getChildGraph();
        }
        if (childGraph != null && (!childGraph.isEmpty())) {
            for (int size = childGraph.size() - 1; -1 < size; size--) {
                if (graphIdList.contains(childGraph.get(size).getId())) {
                    this.selectGraphList.add(childGraph.get(size));
                    ArrayList<RectF> arrayList = this.selectGraphMinOutRectFList;
                    IGraph iGraph = childGraph.get(size);
                    MatrixAdapter matrixAdapter = getMatrixAdapter();
                    if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                        matrix = new Matrix();
                    }
                    arrayList.add(iGraph.getMinOutRectF(matrix));
                }
            }
        }
        handleSelectedRectF(this.selectGraphList, this.selectGraphMinOutRectFList);
    }

    @Override // com.zykj.blackboard.core.action.BaseTouchAction
    public void setActionListener(@NotNull IActionListener listener) {
        AbstractC5830k.m5330g(listener, "listener");
        super.setActionListener(listener);
        this.functionManager = new FunctionManager(listener);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        FunctionManager functionManager = this.functionManager;
        if (functionManager == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        functionManager.reset();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            graphControl.reDrawFixView();
        }
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.selectCancel();
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.isClick = true;
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        float f = renderPointF.x;
        this.firstX = f;
        float f7 = renderPointF.y;
        this.firstY = f7;
        FunctionManager functionManager = this.functionManager;
        if (functionManager == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        functionManager.setFirstPoint(f, f7);
        FunctionManager functionManager2 = this.functionManager;
        if (functionManager2 == null) {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
        boolean zIsClickInSelectFunction = functionManager2.isClickInSelectFunction(this.firstX, this.firstY);
        this.isSpecialFunctionClick = zIsClickInSelectFunction;
        if (zIsClickInSelectFunction) {
            FunctionManager functionManager3 = this.functionManager;
            if (functionManager3 != null) {
                functionManager3.initForFunctionTouch();
                return;
            } else {
                AbstractC5830k.m5339p("functionManager");
                throw null;
            }
        }
        FunctionManager functionManager4 = this.functionManager;
        if (functionManager4 != null) {
            functionManager4.reset();
        } else {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull EzyTouchEvent$TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC5830k.m5330g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Move: X---> " + event.getX() + ", Y---> " + event.getY());
        if (isMove(event.getX(), event.getY())) {
            this.isClick = false;
        }
        if (!this.isSpecialFunctionClick) {
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (adapterMatrix = matrixAdapter.getAdapterMatrix()) == null) {
                return;
            }
            float[] fArr = {event.getX(), event.getY()};
            adapterMatrix.mapPoints(fArr);
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                graphControl.newSelecting(this.firstX, this.firstY, fArr[0], fArr[1]);
                return;
            }
            return;
        }
        if (this.isClick) {
            return;
        }
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        if (!this.isStart) {
            FunctionManager functionManager = this.functionManager;
            if (functionManager == null) {
                AbstractC5830k.m5339p("functionManager");
                throw null;
            }
            functionManager.handleMoveStart(renderPointF.x, renderPointF.y);
            this.isStart = true;
        }
        FunctionManager functionManager2 = this.functionManager;
        if (functionManager2 != null) {
            functionManager2.handleMoving(renderPointF.x, renderPointF.y);
        } else {
            AbstractC5830k.m5339p("functionManager");
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    @Override // com.zykj.blackboard.core.action.MoveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void singleTouchUp(@org.jetbrains.annotations.NotNull com.zykj.board.EzyTouchEvent$TouchEvent r7) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.singleTouchUp(com.zykj.board.EzyTouchEvent$TouchEvent):void"); // DEX body: android/错题本/smali_classes3/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali:2861
    }
}
