package com.zykj.blackboard.core.action.newSelectAtion;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.tencent.smtt.sdk.TbsListener;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.action.IActionListener;
import com.zykj.blackboard.core.action.MoveAction;
import com.zykj.blackboard.core.action.newSelectAtion.function.FunctionManager;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GeometryGraph;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import com.zykj.blackboard.core.graph.group.TextGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.blackboard.utils.PointUtils;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8778f0;
import p134i7.AbstractC8809v;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class NewSelectAction extends MoveAction {
    private float firstX;
    private float firstY;
    private FunctionManager functionManager;
    private boolean isStart;
    private long lastClickTime;
    private float lastClickX;
    private float lastClickY;
    private final int maxInterval = TbsListener.ErrorCode.INFO_CODE_MINIQB;
    private boolean isClick = true;
    private final float minMoveDistance = 20.0f;
    private boolean isSpecialFunctionClick = true;
    private ArrayList<IGraph> selectGraphList = new ArrayList<>();
    private ArrayList<RectF> selectGraphMinOutRectFList = new ArrayList<>();

    public NewSelectAction() {
        EventBus.INSTANCE.register(EventKey.SELECT_ACTION_SELECTED_CANCEL, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27417invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27417invoke() {
                NewSelectAction.this.selectGraphList.clear();
                NewSelectAction.this.selectGraphMinOutRectFList.clear();
                IGraphControl graphControl = NewSelectAction.this.getGraphControl();
                if (graphControl != null) {
                    graphControl.selectCancel();
                }
                if (NewSelectAction.this.functionManager != null) {
                    FunctionManager functionManager = NewSelectAction.this.functionManager;
                    if (functionManager == null) {
                        AbstractC9133u.m16151y("functionManager");
                        functionManager = null;
                    }
                    functionManager.reset();
                }
            }
        });
    }

    private final void checkMinOutRectF(RectF rectF) {
        BoardConfig boardConfig = getBoardConfig();
        float f10 = 2;
        float selectIconWidth = (boardConfig != null ? boardConfig.getSelectIconWidth() : 36.0f) * f10;
        float fWidth = selectIconWidth - rectF.width();
        float fHeight = selectIconWidth - rectF.height();
        if (fWidth > 0.0f) {
            float f11 = fWidth / f10;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fHeight > 0.0f) {
            float f12 = fHeight / f10;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
    }

    private final void checkMinOutRectFWithMatrix(RectF rectF, Matrix matrix) {
        Matrix matrixInvert = MatrixExtKt.invert(matrix);
        BoardConfig boardConfig = getBoardConfig();
        float f10 = 2;
        float selectIconWidth = (boardConfig != null ? boardConfig.getSelectIconWidth() : 36.0f) * f10;
        float fMapRadius = matrixInvert.mapRadius(selectIconWidth) - rectF.width();
        float fMapRadius2 = matrixInvert.mapRadius(selectIconWidth) - rectF.height();
        if (fMapRadius > 0.0f) {
            float f11 = fMapRadius / f10;
            rectF.left -= f11;
            rectF.right += f11;
        }
        if (fMapRadius2 > 0.0f) {
            float f12 = fMapRadius2 / f10;
            rectF.top -= f12;
            rectF.bottom += f12;
        }
    }

    private final void countRectF(RectF rectF, RectF rectF2) {
        if (rectF2.isEmpty()) {
            rectF2.set(rectF);
        } else {
            rectF2.union(rectF);
        }
    }

    private final PointF getRenderPointF(float f10, float f11) {
        PointUtils pointUtils = PointUtils.INSTANCE;
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        AbstractC9133u.m16130d(matrixAdapter);
        return pointUtils.mapPoint(f10, f11, matrixAdapter.getAdapterMatrix());
    }

    private final void handleClickToSelect(float f10, float f11) {
        List<Graph> listM14771n;
        Matrix matrix;
        IGraph iGraphRootGraph;
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null || (listM14771n = boardConfig.getSelectExcludeGraphList()) == null) {
            listM14771n = AbstractC8809v.m14771n();
        }
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
        IGraphControl graphControl = getGraphControl();
        List<IGraph> childGraph = (graphControl == null || (iGraphRootGraph = graphControl.rootGraph()) == null) ? null : iGraphRootGraph.getChildGraph();
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
            if (iGraph.isInRect(f10, f11, 0.0f) && !AbstractC8778f0.m14556d0(listM14771n, iGraph)) {
                this.selectGraphList.add(iGraph);
                ArrayList<RectF> arrayList = this.selectGraphMinOutRectFList;
                MatrixAdapter matrixAdapter = getMatrixAdapter();
                if (matrixAdapter == null || (matrix = matrixAdapter.getAdapterMatrix()) == null) {
                    matrix = new Matrix();
                }
                arrayList.add(iGraph.getMinOutRectF(matrix));
                return;
            }
        }
    }

    private final void handleDragToSelect(RectF rectF) {
        List<Graph> listM14771n;
        Matrix matrix;
        IGraph iGraphRootGraph;
        BoardConfig boardConfig = getBoardConfig();
        if (boardConfig == null || (listM14771n = boardConfig.getSelectExcludeGraphList()) == null) {
            listM14771n = AbstractC8809v.m14771n();
        }
        IGraphControl graphControl = getGraphControl();
        List<IGraph> childGraph = (graphControl == null || (iGraphRootGraph = graphControl.rootGraph()) == null) ? null : iGraphRootGraph.getChildGraph();
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
            if (rectF.contains(minOutRectF) && !AbstractC8778f0.m14556d0(listM14771n, iGraph)) {
                this.selectGraphList.add(iGraph);
                this.selectGraphMinOutRectFList.add(minOutRectF);
            }
        }
    }

    private final void handleSelectedRectF(List<? extends IGraph> list, List<? extends RectF> list2) {
        Matrix adapterMatrix;
        RectF rectF = new RectF();
        Iterator<T> it = list2.iterator();
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
        FunctionManager functionManager2 = null;
        if (functionManager == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager = null;
        }
        functionManager.initCurrentFunction(list);
        FunctionManager functionManager3 = this.functionManager;
        if (functionManager3 == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager3 = null;
        }
        functionManager3.setSelectGraphList(list);
        IGraph iGraph = (IGraph) AbstractC8778f0.m14566l0(list);
        if (list.size() == 1 && ((iGraph instanceof GeometryGraph) || (iGraph instanceof TextGraph) || (iGraph instanceof ImageGraph))) {
            RectF rectF2 = new RectF(iGraph.getOriginalRectF());
            Matrix matrix = new Matrix();
            matrix.postConcat(iGraph.getRenderMatrix());
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                matrix.postConcat(adapterMatrix);
            }
            PointF pointF = iGraph instanceof GeometryGraph ? (PointF) AbstractC8778f0.m14568n0(((GeometryGraph) iGraph).getMovePointFList()) : null;
            checkMinOutRectFWithMatrix(rectF2, matrix);
            FunctionManager functionManager4 = this.functionManager;
            if (functionManager4 == null) {
                AbstractC9133u.m16151y("functionManager");
                functionManager4 = null;
            }
            functionManager4.setSingleGraphData(rectF2, matrix, pointF);
        } else {
            checkMinOutRectF(rectF);
            FunctionManager functionManager5 = this.functionManager;
            if (functionManager5 == null) {
                AbstractC9133u.m16151y("functionManager");
                functionManager5 = null;
            }
            functionManager5.setSelectRectF(rectF);
        }
        FunctionManager functionManager6 = this.functionManager;
        if (functionManager6 == null) {
            AbstractC9133u.m16151y("functionManager");
        } else {
            functionManager2 = functionManager6;
        }
        functionManager2.showSelectRectF();
    }

    private final boolean isDoubleClick(float f10, float f11) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.isClick) {
            double d10 = 2;
            float fSqrt = (float) Math.sqrt(((float) Math.pow(f10 - this.lastClickX, d10)) + ((float) Math.pow(f11 - this.lastClickY, d10)));
            if (jCurrentTimeMillis - this.lastClickTime < this.maxInterval && fSqrt < this.minMoveDistance) {
                return true;
            }
        }
        return false;
    }

    private final boolean isMove(float f10, float f11) {
        PointF renderPointF = getRenderPointF(f10, f11);
        double d10 = 2;
        return ((float) Math.sqrt((double) (((float) Math.pow((double) (renderPointF.x - this.firstX), d10)) + ((float) Math.pow((double) (renderPointF.y - this.firstY), d10))))) > this.minMoveDistance;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.firstX = 0.0f;
        this.firstY = 0.0f;
        this.selectGraphList.clear();
        this.selectGraphMinOutRectFList.clear();
    }

    public final void selectGraphList(List<String> graphIdList) {
        Matrix matrix;
        IGraph iGraphRootGraph;
        AbstractC9133u.m16133g(graphIdList, "graphIdList");
        reset();
        FunctionManager functionManager = this.functionManager;
        List<IGraph> childGraph = null;
        if (functionManager == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager = null;
        }
        functionManager.reset();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null) {
            childGraph = iGraphRootGraph.getChildGraph();
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
    public void setActionListener(IActionListener listener) {
        AbstractC9133u.m16133g(listener, "listener");
        super.setActionListener(listener);
        this.functionManager = new FunctionManager(listener);
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        FunctionManager functionManager = this.functionManager;
        if (functionManager == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager = null;
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
    public void singleTouchDown(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        Log.i(NotificationCompat.CATEGORY_EVENT, "Down: X---> " + event.getX() + ", Y---> " + event.getY());
        this.isClick = true;
        PointF renderPointF = getRenderPointF(event.getX(), event.getY());
        this.firstX = renderPointF.x;
        this.firstY = renderPointF.y;
        FunctionManager functionManager = this.functionManager;
        FunctionManager functionManager2 = null;
        if (functionManager == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager = null;
        }
        functionManager.setFirstPoint(this.firstX, this.firstY);
        FunctionManager functionManager3 = this.functionManager;
        if (functionManager3 == null) {
            AbstractC9133u.m16151y("functionManager");
            functionManager3 = null;
        }
        boolean zIsClickInSelectFunction = functionManager3.isClickInSelectFunction(this.firstX, this.firstY);
        this.isSpecialFunctionClick = zIsClickInSelectFunction;
        if (zIsClickInSelectFunction) {
            FunctionManager functionManager4 = this.functionManager;
            if (functionManager4 == null) {
                AbstractC9133u.m16151y("functionManager");
            } else {
                functionManager2 = functionManager4;
            }
            functionManager2.initForFunctionTouch();
            return;
        }
        FunctionManager functionManager5 = this.functionManager;
        if (functionManager5 == null) {
            AbstractC9133u.m16151y("functionManager");
        } else {
            functionManager2 = functionManager5;
        }
        functionManager2.reset();
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(EzyTouchEvent.TouchEvent event) {
        Matrix adapterMatrix;
        AbstractC9133u.m16133g(event, "event");
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
        FunctionManager functionManager = null;
        if (!this.isStart) {
            FunctionManager functionManager2 = this.functionManager;
            if (functionManager2 == null) {
                AbstractC9133u.m16151y("functionManager");
                functionManager2 = null;
            }
            functionManager2.handleMoveStart(renderPointF.x, renderPointF.y);
            this.isStart = true;
        }
        FunctionManager functionManager3 = this.functionManager;
        if (functionManager3 == null) {
            AbstractC9133u.m16151y("functionManager");
        } else {
            functionManager = functionManager3;
        }
        functionManager.handleMoving(renderPointF.x, renderPointF.y);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    @Override // com.zykj.blackboard.core.action.MoveAction
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void singleTouchUp(com.zykj.board.EzyTouchEvent.TouchEvent r7) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zykj.blackboard.core.action.newSelectAtion.NewSelectAction.singleTouchUp(com.zykj.board.EzyTouchEvent$TouchEvent):void"); // DEX body: android/优课畅学/smali_classes4/com/zykj/blackboard/core/action/newSelectAtion/NewSelectAction.smali:2704
    }
}
