package com.zykj.sketch.core.action;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.StrokeGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.IControl;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)"}, m13413d2 = {"Lcom/zykj/sketch/core/action/WritingAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "writingGroupGraph", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V", "graph", "Lcom/zykj/sketch/core/graph/StrokeGraph;", "getGraph", "()Lcom/zykj/sketch/core/graph/StrokeGraph;", "setGraph", "(Lcom/zykj/sketch/core/graph/StrokeGraph;)V", "mX", "", "getMX", "()F", "setMX", "(F)V", "mY", "getMY", "setMY", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "createGraph", "", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "enumType", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getParentGraphName", "", "onTouchDown", "onTouchMove", "onTouchPointerDown", "onTouchPointerUp", "onTouchUp", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public class WritingAction extends BaseAction {
    private final IControl actionControl;
    private StrokeGraph graph;
    private float mX;
    private float mY;
    private Path path;
    private final WritingGroupGraph writingGroupGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingAction(IControl actionControl, WritingGroupGraph writingGroupGraph) {
        super(actionControl);
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        Intrinsics.checkNotNullParameter(writingGroupGraph, "writingGroupGraph");
        this.actionControl = actionControl;
        this.writingGroupGraph = writingGroupGraph;
        this.path = new Path();
    }

    private final void createGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        List listFindGraph$default = IControl.DefaultImpls.findGraph$default(this.actionControl, event.getX(), event.getY(), 0.0f, 4, null);
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
        GraphExtKt.initPaint(strokeGraph, strokeGraph.getControl().getConfig().getColor(), strokeGraph.getControl().getConfig().getWidth());
        this.writingGroupGraph.addGraph(strokeGraph);
        PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
        this.path.reset();
        float f10 = pointFMapPoint.x;
        this.mX = f10;
        float f11 = pointFMapPoint.y;
        this.mY = f11;
        this.path.moveTo(f10, f11);
        this.path.lineTo(this.mX, this.mY);
        strokeGraph.addPoint(event.getX(), event.getY());
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
        return this.mX;
    }

    public final float getMY() {
        return this.mY;
    }

    public final String getParentGraphName() {
        return this.writingGroupGraph.getName();
    }

    public final Path getPath() {
        return this.path;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            createGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            StrokeGraph strokeGraph = this.graph;
            if (strokeGraph != null) {
                PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
                Path path = this.path;
                float f10 = this.mX;
                float f11 = this.mY;
                float f12 = 2;
                path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
                this.mX = pointFMapPoint.x;
                this.mY = pointFMapPoint.y;
                strokeGraph.addPoint(event.getX(), event.getY());
                strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            }
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
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
        this.mX = f10;
    }

    public final void setMY(float f10) {
        this.mY = f10;
    }

    public final void setPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "<set-?>");
        this.path = path;
    }
}
