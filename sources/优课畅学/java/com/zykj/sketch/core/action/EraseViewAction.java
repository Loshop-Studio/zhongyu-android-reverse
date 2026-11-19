package com.zykj.sketch.core.action;

import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.ImageGraph;
import com.zykj.sketch.core.graph.ImageHistoryGraph;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.ImageDeleteListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class EraseViewAction extends BaseAction {
    private final IControl actionControl;
    private Graph prevSelectGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraseViewAction(IControl actionControl) {
        super(actionControl);
        AbstractC9133u.m16133g(actionControl, "actionControl");
        this.actionControl = actionControl;
    }

    private final void deleteGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent) {
        Graph graph;
        Iterator<T> it = this.actionControl.findSelectGraph().iterator();
        while (true) {
            graph = null;
            if (!it.hasNext()) {
                break;
            }
            Graph graph2 = (Graph) it.next();
            this.prevSelectGraph = graph2;
            if (graph2.isClickDelete(touchEvent.getX(), touchEvent.getY())) {
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
        List<Graph> listFindGraph = this.actionControl.findGraph(touchEvent.getX(), touchEvent.getY(), Graph.Companion.getCornerSize().y / 2);
        if (!listFindGraph.isEmpty()) {
            graph = listFindGraph.get(0);
            if (AbstractC9133u.m16128b(this.prevSelectGraph, graph)) {
                setRecord(false);
                return;
            }
        }
        listFindGraph.clear();
        if (graph != null) {
            graph.setDeleteBitmap(this.actionControl.getDeleteBitmap());
            if (graph.getShowDelete() && graph.isClickDelete(touchEvent.getX(), touchEvent.getY())) {
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
        AbstractC9133u.m16133g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            deleteGraph(event);
        }
    }
}
