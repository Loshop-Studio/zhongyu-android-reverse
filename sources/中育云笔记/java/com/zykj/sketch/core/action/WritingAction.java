package com.zykj.sketch.core.action;

import android.graphics.Path;
import android.graphics.PointF;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.StrokeGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.IControl;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public class WritingAction extends BaseAction {
    private final IControl actionControl;
    private StrokeGraph graph;

    /* renamed from: mX */
    private float f19913mX;

    /* renamed from: mY */
    private float f19914mY;
    private Path path;
    private final WritingGroupGraph writingGroupGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingAction(IControl actionControl, WritingGroupGraph writingGroupGraph) {
        super(actionControl);
        AbstractC9979u.m20294g(actionControl, "actionControl");
        AbstractC9979u.m20294g(writingGroupGraph, "writingGroupGraph");
        this.actionControl = actionControl;
        this.writingGroupGraph = writingGroupGraph;
        this.path = new Path();
    }

    private final void createGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent touchEvent) {
        List listFindGraph$default = IControl.DefaultImpls.findGraph$default(this.actionControl, touchEvent.getX(), touchEvent.getY(), 0.0f, 4, null);
        if (this.writingGroupGraph.getMFatherGraph() == null) {
            if (listFindGraph$default.isEmpty()) {
                this.actionControl.getRootGraph().addGraph(this.writingGroupGraph);
            } else {
                ((Graph) listFindGraph$default.get(0)).addGraph(this.writingGroupGraph);
            }
        }
        listFindGraph$default.clear();
        StrokeGraph strokeGraph = new StrokeGraph(this.actionControl);
        this.graph = strokeGraph;
        strokeGraph.setComplete(false);
        GraphExtKt.initPaint(strokeGraph, strokeGraph.getControl().getGraphConfig().getColor(), strokeGraph.getControl().getGraphConfig().getWidth());
        this.writingGroupGraph.addGraph(strokeGraph);
        PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, touchEvent.getX(), touchEvent.getY(), strokeGraph.getActionControl().getCameraMatrix());
        this.path.reset();
        float f10 = pointFMapPoint.x;
        this.f19913mX = f10;
        float f11 = pointFMapPoint.y;
        this.f19914mY = f11;
        this.path.moveTo(f10, f11);
        this.path.lineTo(this.f19913mX, this.f19914mY);
        strokeGraph.addPoint(touchEvent.getX(), touchEvent.getY());
        strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING;
    }

    public final StrokeGraph getGraph() {
        return this.graph;
    }

    public final float getMX() {
        return this.f19913mX;
    }

    public final float getMY() {
        return this.f19914mY;
    }

    public final String getParentGraphName() {
        return this.writingGroupGraph.getGraphName();
    }

    public final Path getPath() {
        return this.path;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            createGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            StrokeGraph strokeGraph = this.graph;
            if (strokeGraph != null) {
                PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
                Path path = this.path;
                float f10 = this.f19913mX;
                float f11 = this.f19914mY;
                float f12 = 2;
                path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
                this.f19913mX = pointFMapPoint.x;
                this.f19914mY = pointFMapPoint.y;
                strokeGraph.addPoint(event.getX(), event.getY());
                strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            }
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchUp(event);
        StrokeGraph strokeGraph = this.graph;
        if (strokeGraph != null) {
            this.writingGroupGraph.onMeasure();
            strokeGraph.setComplete(true);
            strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            strokeGraph.getActionControl().render();
        }
        this.path.reset();
        setRecord(true);
    }

    public final void setGraph(StrokeGraph strokeGraph) {
        this.graph = strokeGraph;
    }

    public final void setMX(float f10) {
        this.f19913mX = f10;
    }

    public final void setMY(float f10) {
        this.f19914mY = f10;
    }

    public final void setPath(Path path) {
        AbstractC9979u.m20294g(path, "<set-?>");
        this.path = path;
    }
}
