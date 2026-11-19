package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import com.blankj.utilcode.util.AbstractC3387g;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.graph.group.GroupGraph;
import com.zykj.blackboard.core.graph.stroke.WritingGraph;
import com.zykj.blackboard.utils.EventBus;
import com.zykj.blackboard.utils.EventKey;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.AbstractC5806u;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import p045d6.C5443s;
import p152r6.InterfaceC6469a;

@Metadata(m5109d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0013\u001a\u00020\u00062\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\bJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010\bJ\u0017\u0010!\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\bJ\u001b\u0010\"\u001a\u00020\u00152\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\"\u0010#R\u0016\u0010%\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010*\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010/\u001a\u001e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00150,j\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0015`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R<\u00103\u001a*\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b020,j\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b02`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00100¨\u00064"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/EraseWritingAction;", "Lcom/zykj/blackboard/core/action/MoveAction;", "<init>", "()V", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "drawDeleteCircle", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "deleteGraph", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "getDeleteGraphByPoint", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)Ljava/util/List;", "deleteGraphList", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "filterDeleteGraphList", "(Ljava/util/List;FFF)V", "Landroid/graphics/RectF;", "adapterAreaRectF", "getIntersectGraphByAreaRectF", "(Landroid/graphics/RectF;)Ljava/util/List;", "graph", "getMinOutRectF", "(Lcom/zykj/blackboard/core/graph/IGraph;)Landroid/graphics/RectF;", "deleteCommand", "reset", "singleTouchDown", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "getRenderAreaRectF", "(Ljava/util/List;)Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/Path;", "circlePath", "Landroid/graphics/Path;", "touchRadius", "F", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "minOutRectFMap", "Ljava/util/HashMap;", "", "", "deleteCommandMap", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EraseWritingAction extends MoveAction {

    @NotNull
    private final Path circlePath;

    @NotNull
    private final HashMap<Long, List<IGraph>> deleteCommandMap;

    @NotNull
    private final HashMap<String, RectF> minOutRectFMap;

    @NotNull
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
        EventBus.INSTANCE.register(EventKey.DELETE_ACTION, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.1
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13737invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13737invoke() {
                IGraph rootGraph;
                List<IGraph> childGraph;
                Matrix adapterMatrix;
                EraseWritingAction.this.minOutRectFMap.clear();
                IGraphControl graphControl = EraseWritingAction.this.getGraphControl();
                if (graphControl == null || (rootGraph = graphControl.getRootGraph()) == null || (childGraph = rootGraph.getChildGraph()) == null) {
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
        AbstractC5830k.m5329f(setKeySet, "deleteCommandMap.keys");
        for (Long it : setKeySet) {
            IActionListener listener2 = getListener();
            if (listener2 != null) {
                List<IGraph> list = this.deleteCommandMap.get(it);
                AbstractC5830k.m5327d(list);
                AbstractC5830k.m5329f(it, "it");
                listener2.deleteGraphEvent(list, it.longValue());
            }
        }
        if (!this.deleteCommandMap.isEmpty() && (listener = getListener()) != null) {
            listener.saveSnapshot();
        }
        this.deleteCommandMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteGraph(EzyTouchEvent$TouchEvent event) {
        IGraph rootGraph;
        List<IGraph> deleteGraphByPoint = getDeleteGraphByPoint(event);
        if (deleteGraphByPoint.isEmpty()) {
            return;
        }
        this.deleteCommandMap.put(Long.valueOf(System.currentTimeMillis()), deleteGraphByPoint);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null) {
            rootGraph.deleteGraphList(deleteGraphByPoint);
        }
        StringBuilder sb = new StringBuilder("EraseWritingAction:deleteGraph -> graphList: ");
        ArrayList arrayList = new ArrayList(AbstractC5806u.m5277p(deleteGraphByPoint, 10));
        Iterator<T> it = deleteGraphByPoint.iterator();
        while (it.hasNext()) {
            arrayList.add(((IGraph) it.next()).getId());
        }
        sb.append(arrayList);
        AbstractC3387g.m2342e(sb.toString());
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
    public final void drawDeleteCircle(EzyTouchEvent$TouchEvent event) {
        Matrix adapterMatrix;
        Matrix matrixInvert;
        this.circlePath.reset();
        Path path = this.circlePath;
        float x3 = event.getX();
        float y2 = event.getY();
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        path.addCircle(x3, y2, (matrixAdapter == null || (adapterMatrix = matrixAdapter.getAdapterMatrix()) == null || (matrixInvert = MatrixExtKt.invert(adapterMatrix)) == null) ? 0.0f : matrixInvert.mapRadius(this.touchRadius), Path.Direction.CW);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path path2 = this.circlePath;
            Paint paint = this.paint;
            MatrixAdapter matrixAdapter2 = getMatrixAdapter();
            graphControl.drawPath(path2, paint, matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
        }
    }

    private final void filterDeleteGraphList(List<IGraph> deleteGraphList, float x3, float y2, float offset) {
        IGraph rootGraph;
        List<IGraph> childGraph;
        ArrayList arrayList = new ArrayList();
        for (IGraph iGraph : deleteGraphList) {
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null && (childGraph = rootGraph.getChildGraph()) != null) {
                int size = childGraph.size();
                while (true) {
                    size--;
                    if (-1 >= size) {
                        break;
                    }
                    IGraph parentGraph = iGraph.getParentGraph();
                    if (AbstractC5830k.m5325b(parentGraph != null ? parentGraph.getId() : null, childGraph.get(size).getId())) {
                        break;
                    } else if (RectF.intersects(childGraph.get(size).getRenderRectF(), iGraph.getRenderRectF()) && RectF.intersects(childGraph.get(size).getRenderRectF(), new RectF(x3 - offset, y2 - offset, x3 + offset, y2 + offset))) {
                        arrayList.add(iGraph);
                    }
                }
            }
        }
        deleteGraphList.removeAll(arrayList);
    }

    private final List<IGraph> getDeleteGraphByPoint(EzyTouchEvent$TouchEvent event) {
        IGraph rootGraph;
        List<IGraph> childGraph;
        Matrix adapterMatrix;
        Matrix matrixInvert;
        Matrix adapterMatrix2;
        ArrayList arrayList = new ArrayList();
        float[] fArr = {event.getX(), event.getY()};
        MatrixAdapter matrixAdapter = getMatrixAdapter();
        if (matrixAdapter != null && (adapterMatrix2 = matrixAdapter.getAdapterMatrix()) != null) {
            adapterMatrix2.mapPoints(fArr);
        }
        float f = fArr[0];
        float f7 = this.touchRadius;
        float f8 = fArr[1];
        RectF rectF = new RectF(f - f7, f8 - f7, f + f7, f8 + f7);
        MatrixAdapter matrixAdapter2 = getMatrixAdapter();
        float fMapRadius = (matrixAdapter2 == null || (adapterMatrix = matrixAdapter2.getAdapterMatrix()) == null || (matrixInvert = MatrixExtKt.invert(adapterMatrix)) == null) ? 0.0f : matrixInvert.mapRadius(this.touchRadius);
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null && (childGraph = rootGraph.getChildGraph()) != null) {
            for (IGraph iGraph : childGraph) {
                if (RectF.intersects(getMinOutRectF(iGraph), rectF)) {
                    for (IGraph iGraph2 : iGraph.getChildGraph()) {
                        if (RectF.intersects(getMinOutRectF(iGraph2), rectF) && iGraph2.isCollide(event.getX(), event.getY(), fMapRadius)) {
                            arrayList.add(iGraph2);
                        }
                    }
                }
            }
        }
        filterDeleteGraphList(arrayList, event.getX(), event.getY(), fMapRadius);
        return arrayList;
    }

    private final List<IGraph> getIntersectGraphByAreaRectF(RectF adapterAreaRectF) {
        IGraph rootGraph;
        List<IGraph> childGraph;
        ArrayList arrayList = new ArrayList();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null && (rootGraph = graphControl.getRootGraph()) != null && (childGraph = rootGraph.getChildGraph()) != null) {
            for (IGraph iGraph : childGraph) {
                if (RectF.intersects(adapterAreaRectF, getMinOutRectF(iGraph)) && RectF.intersects(adapterAreaRectF, getMinOutRectF(iGraph))) {
                    arrayList.add(iGraph);
                }
            }
        }
        return arrayList;
    }

    private final RectF getMinOutRectF(IGraph graph) {
        Matrix adapterMatrix;
        if (!this.minOutRectFMap.containsKey(graph.getId())) {
            if (graph instanceof GroupGraph) {
                RectF rectF = new RectF(graph.getOriginalRectF());
                Matrix matrix = new Matrix();
                matrix.postConcat(graph.getRenderMatrix());
                MatrixAdapter matrixAdapter = getMatrixAdapter();
                if (matrixAdapter != null && (adapterMatrix = matrixAdapter.getAdapterMatrix()) != null) {
                    matrix.postConcat(adapterMatrix);
                }
                matrix.mapRect(rectF);
                for (IGraph childGraph : ((GroupGraph) graph).getChildGraph()) {
                    AbstractC5830k.m5329f(childGraph, "childGraph");
                    rectF.union(getMinOutRectF(childGraph));
                }
                this.minOutRectFMap.put(graph.getId(), rectF);
            } else if (graph instanceof WritingGraph) {
                HashMap<String, RectF> map = this.minOutRectFMap;
                String id = graph.getId();
                MatrixAdapter matrixAdapter2 = getMatrixAdapter();
                map.put(id, graph.getMinOutRectF(matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null));
            }
        }
        RectF rectF2 = this.minOutRectFMap.get(graph.getId());
        AbstractC5830k.m5327d(rectF2);
        return rectF2;
    }

    @NotNull
    public final RectF getRenderAreaRectF(@NotNull List<IGraph> deleteGraphList) {
        AbstractC5830k.m5330g(deleteGraphList, "deleteGraphList");
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
    public void singleTouchCancel(@NotNull EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchDown(@NotNull final EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchDown.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13738invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13738invoke() {
                EventBus eventBus = EventBus.INSTANCE;
                eventBus.post(EventKey.TEXT_ACTION_SELECTED_CANCEL);
                eventBus.post(EventKey.SELECT_ACTION_SELECTED_CANCEL);
                EraseWritingAction.this.drawDeleteCircle(event);
                EraseWritingAction.this.deleteGraph(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchMove(@NotNull final EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchMove.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13739invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13739invoke() {
                EraseWritingAction.this.drawDeleteCircle(event);
                EraseWritingAction.this.deleteGraph(event);
            }
        });
    }

    @Override // com.zykj.blackboard.core.action.MoveAction
    public void singleTouchUp(@NotNull final EzyTouchEvent$TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        isSingleFingerInput(event, new InterfaceC6469a() { // from class: com.zykj.blackboard.core.action.EraseWritingAction.singleTouchUp.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p152r6.InterfaceC6469a
            public /* bridge */ /* synthetic */ Object invoke() {
                m13740invoke();
                return C5443s.f8405a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13740invoke() {
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
