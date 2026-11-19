package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.core.internal.view.SupportMenu;
import com.blankj.utilcode.util.AbstractC5380q;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyTouchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC9133u;
import p123h7.C8736p;
import p134i7.AbstractC8811w;
import p300x7.InterfaceC10559a;

/* loaded from: classes4.dex */
public final class EraseWritingAction extends MoveAction {
    private final Path circlePath;
    private final HashMap<Long, List<IGraph>> deleteCommandMap;
    private final HashMap<String, RectF> minOutRectFMap;
    private Paint paint;
    private float touchRadius;

    public EraseWritingAction() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setStrokeWidth(20.0f);
        this.paint = paint;
        this.circlePath = new Path();
        this.touchRadius = 40.0f;
        this.minOutRectFMap = new HashMap<>();
        this.deleteCommandMap = new HashMap<>();
        EventBus.INSTANCE.register(EventKey.DELETE_ACTION, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.1
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27408invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27408invoke() {
                IGraph iGraphRootGraph;
                List<IGraph> childGraph;
                Matrix adapterMatrix;
                EraseWritingAction.this.minOutRectFMap.clear();
                IGraphControl graphControl = EraseWritingAction.this.getGraphControl();
                if (graphControl == null || (iGraphRootGraph = graphControl.rootGraph()) == null || (childGraph = iGraphRootGraph.getChildGraph()) == null) {
                    return;
                }
                EraseWritingAction eraseWritingAction = EraseWritingAction.this;
                for (IGraph iGraph : childGraph) {
                    RectF rectF = new RectF(iGraph.getOriginalRectF());
                    Matrix matrix = new Matrix();
                    matrix.postConcat(iGraph.getRenderMatrix());
                    MatrixAdapter matrixAdapter = eraseWritingAction.getMatrixAdapter();
                    if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                        matrix.postConcat(adapterMatrix);
                    }
                    matrix.mapRect(rectF);
                    for (IGraph iGraph2 : iGraph.getChildGraph()) {
                        MatrixAdapter matrixAdapter2 = eraseWritingAction.getMatrixAdapter();
                        RectF minOutRectF = iGraph2.getMinOutRectF(matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
                        eraseWritingAction.minOutRectFMap.put(iGraph2.getId(), minOutRectF);
                        rectF.union(minOutRectF);
                    }
                    eraseWritingAction.minOutRectFMap.put(iGraph.getId(), rectF);
                }
            }
        });
    }

    private final void deleteCommand() {
        IActionListener listener;
        Set<Long> setKeySet = this.deleteCommandMap.keySet();
        AbstractC9133u.m16132f(setKeySet, "deleteCommandMap.keys");
        for (Long it : setKeySet) {
            IActionListener listener2 = getListener();
            if (listener2 != null) {
                List<IGraph> list = this.deleteCommandMap.get(it);
                AbstractC9133u.m16130d(list);
                AbstractC9133u.m16132f(it, "it");
                listener2.deleteGraphEvent(list, it.longValue());
            }
        }
        if (!this.deleteCommandMap.isEmpty() && (listener = getListener()) != null) {
            listener.saveSnapshot();
        }
        this.deleteCommandMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteGraph(EzyTouchEvent.TouchEvent touchEvent) {
        IGraph iGraphRootGraph;
        List<IGraph> deleteGraphByPoint = getDeleteGraphByPoint(touchEvent);
        if (deleteGraphByPoint.isEmpty()) {
            return;
        }
        this.deleteCommandMap.put(Long.valueOf(System.currentTimeMillis()), deleteGraphByPoint);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null) {
            iGraphRootGraph.deleteGraphList(deleteGraphByPoint);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("EraseWritingAction:deleteGraph -> graphList: ");
        ArrayList arrayList = new ArrayList(AbstractC8811w.m14786x(deleteGraphByPoint, 10));
        Iterator<T> it = deleteGraphByPoint.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC5380q.m2623s(sb.toString());
        RectF renderAreaRectF = getRenderAreaRectF(deleteGraphByPoint);
        renderAreaRectF.left -= 4.0f;
        renderAreaRectF.top -= 4.0f;
        renderAreaRectF.right += 4.0f;
        renderAreaRectF.bottom += 4.0f;
        List<IGraph> intersectGraphByAreaRectF = getIntersectGraphByAreaRectF(renderAreaRectF);
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.renderRectF(renderAreaRectF, intersectGraphByAreaRectF);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawDeleteCircle(EzyTouchEvent.TouchEvent touchEvent) {
        Matrix adapterMatrix;
        Matrix matrixInvert;
        this.circlePath.reset();
        Path path = this.circlePath;
        float x10 = touchEvent.getX();
        float y10 = touchEvent.getY();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        path.addCircle(x10, y10, (matrixAdapter == null || (adapterMatrix = matrixAdapter.getAdapterMatrix()) == null || (matrixInvert = MatrixExtKt.invert(adapterMatrix)) == null) ? 0.0f : matrixInvert.mapRadius(this.touchRadius), Path.Direction.CW);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path path2 = this.circlePath;
            Paint paint = this.paint;
            MatrixAdapter matrixAdapter2 = getMatrixAdapter();
            graphControl.drawPath(path2, paint, matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
        }
    }

    private final void filterDeleteGraphList(List<IGraph> list, float f10, float f11, float f12) {
        IGraph iGraphRootGraph;
        List<IGraph> childGraph;
        ArrayList arrayList = new ArrayList();
        for (IGraph iGraph : list) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null && (childGraph = iGraphRootGraph.getChildGraph()) != null) {
                int size = childGraph.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    IGraph parent = iGraph.getParent();
                    if (AbstractC9133u.m16128b(parent != null ? parent.getId() : null, childGraph.get(size).getId())) {
                        break;
                    } else if (RectF.intersects(childGraph.get(size).getRenderRectF(), iGraph.getRenderRectF()) && RectF.intersects(childGraph.get(size).getRenderRectF(), new RectF(f10 - f12, f11 - f12, f10 + f12, f11 + f12))) {
                        arrayList.add(iGraph);
                    }
                }
            }
        }
        list.removeAll(arrayList);
    }

    private final List<IGraph> getDeleteGraphByPoint(EzyTouchEvent.TouchEvent touchEvent) {
        IGraph iGraphRootGraph;
        List<IGraph> childGraph;
        Matrix adapterMatrix;
        Matrix matrixInvert;
        Matrix adapterMatrix2;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {touchEvent.getX(), touchEvent.getY()};
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix2 = matrixAdapter.getAdapterMatrix()) != null) {
            adapterMatrix2.mapPoints(fArr);
        }
        float f10 = fArr[0];
        float f11 = this.touchRadius;
        float f12 = fArr[1];
        RectF rectF = new RectF(f10 - f11, f12 - f11, f10 + f11, f12 + f11);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        float fMapRadius = (matrixAdapter2 == null || (adapterMatrix = matrixAdapter2.getAdapterMatrix()) == null || (matrixInvert = MatrixExtKt.invert(adapterMatrix)) == null) ? 0.0f : matrixInvert.mapRadius(this.touchRadius);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null && (childGraph = iGraphRootGraph.getChildGraph()) != null) {
            for (IGraph iGraph : childGraph) {
                if (RectF.intersects(getMinOutRectF(iGraph), rectF)) {
                    for (IGraph iGraph2 : iGraph.getChildGraph()) {
                        if (RectF.intersects(getMinOutRectF(iGraph2), rectF) && iGraph2.isCollide(touchEvent.getX(), touchEvent.getY(), fMapRadius)) {
                            arrayList.add(iGraph2);
                        }
                    }
                }
            }
        }
        filterDeleteGraphList(arrayList, touchEvent.getX(), touchEvent.getY(), fMapRadius);
        return arrayList;
    }

    private final List<IGraph> getIntersectGraphByAreaRectF(RectF rectF) {
        IGraph iGraphRootGraph;
        List<IGraph> childGraph;
        ArrayList arrayList = new ArrayList();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (iGraphRootGraph = graphControl.rootGraph()) != null && (childGraph = iGraphRootGraph.getChildGraph()) != null) {
            for (IGraph iGraph : childGraph) {
                if (RectF.intersects(rectF, getMinOutRectF(iGraph)) && RectF.intersects(rectF, getMinOutRectF(iGraph))) {
                    arrayList.add(iGraph);
                }
            }
        }
        return arrayList;
    }

    private final RectF getMinOutRectF(IGraph iGraph) {
        Matrix adapterMatrix;
        if (!this.minOutRectFMap.containsKey(iGraph.getId())) {
            if (iGraph instanceof GroupGraph) {
                RectF rectF = new RectF(iGraph.getOriginalRectF());
                Matrix matrix = new Matrix();
                matrix.postConcat(iGraph.getRenderMatrix());
                MatrixAdapter matrixAdapter = getMatrixAdapter();
                if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                    matrix.postConcat(adapterMatrix);
                }
                matrix.mapRect(rectF);
                for (IGraph childGraph : ((GroupGraph) iGraph).getChildGraph()) {
                    AbstractC9133u.m16132f(childGraph, "childGraph");
                    rectF.union(getMinOutRectF(childGraph));
                }
                this.minOutRectFMap.put(iGraph.getId(), rectF);
            } else if (iGraph instanceof WritingGraph) {
                HashMap<String, RectF> map = this.minOutRectFMap;
                String id = iGraph.getId();
                MatrixAdapter matrixAdapter2 = getMatrixAdapter();
                map.put(id, iGraph.getMinOutRectF(matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null));
            }
        }
        RectF rectF2 = this.minOutRectFMap.get(iGraph.getId());
        AbstractC9133u.m16130d(rectF2);
        return rectF2;
    }

    public final RectF getRenderAreaRectF(List<IGraph> deleteGraphList) {
        AbstractC9133u.m16133g(deleteGraphList, "deleteGraphList");
        RectF rectF = new RectF();
        for (IGraph iGraph : deleteGraphList) {
            if (rectF.isEmpty()) {
                rectF.set(getMinOutRectF(iGraph));
            } else {
                rectF.union(getMinOutRectF(iGraph));
            }
        }
        return rectF;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction, com.zykj.blackboard.core.action.ITouchAction
    public void reset() {
        this.circlePath.reset();
        BoardConfig boardConfig = getBoardConfig();
        this.touchRadius = boardConfig != null ? boardConfig.getEraserWidth() : 40.0f;
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchCancel(EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(final EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchDown.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27409invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27409invoke() {
                EventBus eventBus = EventBus.INSTANCE;
                eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                EraseWritingAction.this.drawDeleteCircle(event);
                EraseWritingAction.this.deleteGraph(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(final EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchMove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27410invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27410invoke() {
                EraseWritingAction.this.drawDeleteCircle(event);
                EraseWritingAction.this.deleteGraph(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(final EzyTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        isSingleFingerInput(event, new InterfaceC10559a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchUp.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p300x7.InterfaceC10559a
            public /* bridge */ /* synthetic */ Object invoke() {
                m27411invoke();
                return C8736p.f16368a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m27411invoke() {
                EraseWritingAction.this.deleteGraph(event);
            }
        });
        deleteCommand();
        this.circlePath.reset();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path path = this.circlePath;
            Paint paint = this.paint;
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(path, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
        IGraphControl graphControl2 = getGraphControl();
        if (graphControl2 != null) {
            graphControl2.reDrawFixView();
        }
    }
}
