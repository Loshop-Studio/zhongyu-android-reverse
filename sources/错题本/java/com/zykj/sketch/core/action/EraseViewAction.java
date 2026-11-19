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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m5110d2 = {"Lcom/zykj/sketch/core/action/EraseViewAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "deleteGraph", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "Lcom/zykj/sketch/core/graph/Graph;", "graph", "handleListener", "(Lcom/zykj/sketch/core/graph/Graph;)V", "onTouchDown", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "enumType", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "Lcom/zykj/sketch/core/listener/IControl;", "prevSelectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EraseViewAction extends BaseAction {

    @NotNull
    private final IControl actionControl;

    @Nullable
    private Graph prevSelectGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraseViewAction(@NotNull IControl actionControl) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
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
            if (AbstractC5830k.m5325b(this.prevSelectGraph, graph)) {
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
    @NotNull
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_VIEW;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            deleteGraph(event);
        }
    }
}
