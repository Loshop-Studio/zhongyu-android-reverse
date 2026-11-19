package com.zykj.sketch.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.internal.view.SupportMenu;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.ViewGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.core.listener.IGraph;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class EraseWritingAction extends BaseAction {
    public static final Companion Companion = new Companion(null);
    private static float TouchRadius = 40.0f;
    private final IControl actionControl;
    private Paint paint;

    public static final class Companion {
        public /* synthetic */ Companion(AbstractC9126n abstractC9126n) {
            this();
        }

        public final float getTouchRadius() {
            return EraseWritingAction.TouchRadius;
        }

        public final void setTouchRadius(float f10) {
            EraseWritingAction.TouchRadius = f10;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraseWritingAction(IControl actionControl) {
        super(actionControl);
        AbstractC9133u.m16133g(actionControl, "actionControl");
        this.actionControl = actionControl;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(SupportMenu.CATEGORY_MASK);
        this.paint.setStrokeWidth(20.0f);
        actionControl.getCameraMatrix().getValues(new float[9]);
    }

    private final void deleteGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent) {
        List<Graph> listFindGraph = this.actionControl.findGraph(touchEvent.getX(), touchEvent.getY(), TouchRadius);
        Path path = new Path();
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.actionControl.getCameraMatrix(), new PointF(touchEvent.getX(), touchEvent.getY()));
        path.addCircle(pointFMapPoint.x, pointFMapPoint.y, TouchRadius, Path.Direction.CW);
        for (Graph graph : listFindGraph) {
            if (graph instanceof ViewGraph) {
                if (IGraph.DefaultImpls.isInRect$default(graph, touchEvent.getX(), touchEvent.getY(), 0.0f, 4, null)) {
                    break;
                }
            } else if (graph instanceof WritingGroupGraph) {
                Iterator<T> it = ((WritingGroupGraph) graph).getIntersectGraph(touchEvent.getX(), touchEvent.getY(), TouchRadius).iterator();
                while (it.hasNext()) {
                    graph.removeGraph((Graph) it.next());
                    setRecord(true);
                }
                if (!graph.hasChild()) {
                    Graph mFatherGraph = graph.getMFatherGraph();
                    if (mFatherGraph != null) {
                        mFatherGraph.removeGraph(graph);
                    }
                    graph.setMFatherGraph(null);
                }
            }
        }
        listFindGraph.clear();
        this.actionControl.render();
        this.actionControl.renderTempPath(path, this.paint);
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_WRITING;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            deleteGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            deleteGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
            deleteGraph(event);
            this.actionControl.resetStatus();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
            deleteGraph(event);
            this.actionControl.resetStatus();
        }
    }
}
