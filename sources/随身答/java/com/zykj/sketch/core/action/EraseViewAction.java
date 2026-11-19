package com.zykj.sketch.core.action;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.graph.ImageHistoryGraph;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m13413d2 = {"Lcom/zykj/sketch/core/action/EraseViewAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "prevSelectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "deleteGraph", "", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "enumType", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "handleListener", "graph", "onTouchDown", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public final class EraseViewAction extends BaseAction {
    private final IControl actionControl;
    private Graph prevSelectGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraseViewAction(IControl actionControl) {
        super(actionControl);
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        this.actionControl = actionControl;
    }

    private final void deleteGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Graph graph;
        Iterator<T> it = this.actionControl.findSelectGraph().iterator();
        while (true) {
            graph = null;
            if (!it.hasNext()) {
                break;
            }
            Graph graph2 = (Graph) it.next();
            this.prevSelectGraph = graph2;
            if (graph2.isClickDelete(event.getX(), event.getY())) {
                Graph mFatherGraph = graph2.getMFatherGraph();
                if (mFatherGraph != null) {
                    mFatherGraph.removeGraph(graph2);
                }
                handleListener(graph2);
                graph2.setMFatherGraph(null);
                this.actionControl.render();
                setRecord(true);
            }
        }
        List<Graph> listFindGraph = this.actionControl.findGraph(event.getX(), event.getY(), Graph.INSTANCE.getCornerSize().y / 2);
        if (!listFindGraph.isEmpty()) {
            graph = listFindGraph.get(0);
            if (Intrinsics.areEqual(this.prevSelectGraph, graph)) {
                setRecord(false);
                return;
            }
        }
        listFindGraph.clear();
        if (graph != null) {
            graph.setDeleteBitmap(this.actionControl.getDeleteBitmap());
            if (graph.getShowDelete() && graph.isClickDelete(event.getX(), event.getY())) {
                Graph mFatherGraph2 = graph.getMFatherGraph();
                if (mFatherGraph2 != null) {
                    mFatherGraph2.removeGraph(graph);
                }
                handleListener(graph);
            } else {
                this.actionControl.getRootGraph().cancelSelected();
                graph.setShowDelete(true);
                graph.setSelect(true);
            }
            setRecord(true);
        }
        if (graph == null) {
            this.actionControl.getRootGraph().cancelSelected();
        }
        this.actionControl.render();
    }

    private final void handleListener(Graph graph) {
        ImageDeleteListener imageDeleteListener = this.actionControl.getImageDeleteListener();
        if (imageDeleteListener != null) {
            String fileName = graph instanceof ImageGraph ? ((ImageGraph) graph).getFileName() : graph instanceof ImageHistoryGraph ? ((ImageHistoryGraph) graph).getFileName() : "";
            if (fileName.length() > 0) {
                imageDeleteListener.onDeleteImagePath(fileName);
            }
        }
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_VIEW;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            deleteGraph(event);
        }
    }
}
