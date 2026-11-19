package com.zykj.sketch.core.action;

import android.graphics.Matrix;
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
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR$\u0010\u001d\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\fR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010$R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R$\u0010.\u001a\u0004\u0018\u00010-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00105\u001a\u0002048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010<\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010A¨\u0006E"}, m5110d2 = {"Lcom/zykj/sketch/core/action/WritingAndMoveVerticalAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "writingGroupGraph", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V", "Lcom/zykj/sketch/core/graph/Graph;", "it", "Ld6/s;", "initTempValue", "(Lcom/zykj/sketch/core/graph/Graph;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchDown", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "", "getParentGraphName", "()Ljava/lang/String;", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "enumType", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "Lcom/zykj/sketch/core/listener/IControl;", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "selectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "getSelectGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "setSelectGraph", "", "NONE", "I", "DRAG", "Landroid/graphics/Matrix;", "mTempMatrix", "Landroid/graphics/Matrix;", "mode", "Landroid/graphics/PointF;", "midPoint", "Landroid/graphics/PointF;", "Lcom/zykj/sketch/core/graph/StrokeGraph;", "graph", "Lcom/zykj/sketch/core/graph/StrokeGraph;", "getGraph", "()Lcom/zykj/sketch/core/graph/StrokeGraph;", "setGraph", "(Lcom/zykj/sketch/core/graph/StrokeGraph;)V", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "", "mX", "F", "getMX", "()F", "setMX", "(F)V", "mY", "getMY", "setMY", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WritingAndMoveVerticalAction extends BaseAction {
    private final int DRAG;
    private final int NONE;

    @NotNull
    private final IControl actionControl;

    @Nullable
    private StrokeGraph graph;

    @NotNull
    private Matrix mTempMatrix;
    private float mX;
    private float mY;

    @NotNull
    private PointF midPoint;
    private int mode;

    @NotNull
    private Path path;

    @Nullable
    private Graph selectGraph;

    @NotNull
    private final WritingGroupGraph writingGroupGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingAndMoveVerticalAction(@NotNull IControl actionControl, @NotNull WritingGroupGraph writingGroupGraph) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
        AbstractC5830k.m5330g(writingGroupGraph, "writingGroupGraph");
        this.actionControl = actionControl;
        this.writingGroupGraph = writingGroupGraph;
        this.DRAG = 1;
        this.mTempMatrix = new Matrix();
        this.mode = this.NONE;
        this.midPoint = new PointF();
        this.path = new Path();
    }

    private final void initTempValue(Graph it) {
        this.mTempMatrix.set(it.getMMatrix());
    }

    @Override // com.zykj.sketch.core.listener.IAction
    @NotNull
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE_VERTICAL;
    }

    @Nullable
    public final StrokeGraph getGraph() {
        return this.graph;
    }

    public final float getMX() {
        return this.mX;
    }

    public final float getMY() {
        return this.mY;
    }

    @NotNull
    public final String getParentGraphName() {
        return this.writingGroupGraph.getName();
    }

    @NotNull
    public final Path getPath() {
        return this.path;
    }

    @Nullable
    public final Graph getSelectGraph() {
        return this.selectGraph;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (isTouchEnable(event, false)) {
            super.onTouchDown(event);
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
            float f = pointFMapPoint.x;
            this.mX = f;
            float f7 = pointFMapPoint.y;
            this.mY = f7;
            this.path.moveTo(f, f7);
            this.path.lineTo(this.mX, this.mY);
            strokeGraph.addPoint(event.getX(), event.getY());
            strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            this.actionControl.resetStatus();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Graph graph;
        AbstractC5830k.m5330g(event, "event");
        if (event.getPointerCount() != 1 || BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            int i = this.mode;
            if (i == this.NONE) {
                StrokeGraph strokeGraph = this.graph;
                if (strokeGraph != null) {
                    PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
                    Path path = this.path;
                    float f = this.mX;
                    float f7 = this.mY;
                    float f8 = 2;
                    path.quadTo(f, f7, (pointFMapPoint.x + f) / f8, (pointFMapPoint.y + f7) / f8);
                    this.mX = pointFMapPoint.x;
                    this.mY = pointFMapPoint.y;
                    strokeGraph.addPoint(event.getX(), event.getY());
                    strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
                }
            } else if (i == this.DRAG && (graph = this.selectGraph) != null && event.getPointerCount() > 1) {
                Matrix matrix = new Matrix();
                matrix.postConcat(this.mTempMatrix);
                matrix.postTranslate(0.0f, ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph)).y - this.midPoint.y);
                graph.setMatrix(matrix);
            }
            this.actionControl.render();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerDown(event);
        StrokeGraph strokeGraph = this.graph;
        if (strokeGraph != null) {
            this.writingGroupGraph.removeGraph(strokeGraph);
        }
        this.graph = null;
        this.path.reset();
        Graph rootGraph = this.actionControl.getRootGraph();
        this.selectGraph = rootGraph;
        if (rootGraph != null) {
            initTempValue(rootGraph);
            this.midPoint = ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(rootGraph));
            this.mode = this.DRAG;
            this.actionControl.render();
        }
        this.actionControl.resetStatus();
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerUp(event);
        this.selectGraph = null;
        StrokeGraph strokeGraph = this.graph;
        if (strokeGraph != null) {
            this.writingGroupGraph.removeGraph(strokeGraph);
            strokeGraph.setComplete(true);
        }
        this.graph = null;
        this.mode = this.NONE;
        setRecord(true);
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (isTouchEnable(event, false)) {
            super.onTouchPointerUp(event);
            StrokeGraph strokeGraph = this.graph;
            if (strokeGraph != null) {
                this.writingGroupGraph.onMeasure();
                strokeGraph.setComplete(true);
                strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
                strokeGraph.getActionControl().render();
            }
            this.graph = null;
            this.path = new Path();
            setRecord(true);
        }
    }

    public final void setGraph(@Nullable StrokeGraph strokeGraph) {
        this.graph = strokeGraph;
    }

    public final void setMX(float f) {
        this.mX = f;
    }

    public final void setMY(float f) {
        this.mY = f;
    }

    public final void setPath(@NotNull Path path) {
        AbstractC5830k.m5330g(path, "<set-?>");
        this.path = path;
    }

    public final void setSelectGraph(@Nullable Graph graph) {
        this.selectGraph = graph;
    }
}
