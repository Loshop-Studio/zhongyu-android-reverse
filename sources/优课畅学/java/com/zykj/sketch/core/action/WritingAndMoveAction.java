package com.zykj.sketch.core.action;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.StrokeGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes3.dex */
public final class WritingAndMoveAction extends BaseAction {
    private final int DRAG;
    private final int NONE;
    private final IControl actionControl;
    private final float[] floatArray;
    private StrokeGraph graph;
    private Matrix mTempMatrix;

    /* renamed from: mX */
    private float f10613mX;

    /* renamed from: mY */
    private float f10614mY;
    private PointF midPoint;
    private int mode;
    private Path path;
    private Graph selectGraph;
    private final WritingGroupGraph writingGroupGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingAndMoveAction(IControl actionControl, WritingGroupGraph writingGroupGraph) {
        super(actionControl);
        AbstractC9133u.m16133g(actionControl, "actionControl");
        AbstractC9133u.m16133g(writingGroupGraph, "writingGroupGraph");
        this.actionControl = actionControl;
        this.writingGroupGraph = writingGroupGraph;
        this.DRAG = 1;
        this.mTempMatrix = new Matrix();
        this.mode = this.NONE;
        this.midPoint = new PointF();
        this.path = new Path();
        this.floatArray = new float[9];
    }

    private final void initTempValue(Graph graph) {
        this.mTempMatrix.set(graph.getMatrix());
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE;
    }

    public final StrokeGraph getGraph() {
        return this.graph;
    }

    public final float getMX() {
        return this.f10613mX;
    }

    public final float getMY() {
        return this.f10614mY;
    }

    public final String getParentGraphName() {
        return this.writingGroupGraph.getGraphName();
    }

    public final Path getPath() {
        return this.path;
    }

    public final Graph getSelectGraph() {
        return this.selectGraph;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
            GraphExtKt.initPaint(strokeGraph, strokeGraph.getControl().getGraphConfig().getColor(), strokeGraph.getControl().getGraphConfig().getWidth());
            this.writingGroupGraph.addGraph(strokeGraph);
            PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
            this.path.reset();
            float f10 = pointFMapPoint.x;
            this.f10613mX = f10;
            float f11 = pointFMapPoint.y;
            this.f10614mY = f11;
            this.path.moveTo(f10, f11);
            this.path.lineTo(this.f10613mX, this.f10614mY);
            strokeGraph.addPoint(event.getX(), event.getY());
            strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            this.actionControl.resetStatus();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Graph graph;
        AbstractC9133u.m16133g(event, "event");
        if (event.getPointerCount() != 1 || BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            int i10 = this.mode;
            if (i10 == this.NONE) {
                StrokeGraph strokeGraph = this.graph;
                if (strokeGraph != null) {
                    PointF pointFMapPoint = GraphExtKt.mapPoint(strokeGraph, event.getX(), event.getY(), strokeGraph.getActionControl().getCameraMatrix());
                    Path path = this.path;
                    float f10 = this.f10613mX;
                    float f11 = this.f10614mY;
                    float f12 = 2;
                    path.quadTo(f10, f11, (pointFMapPoint.x + f10) / f12, (pointFMapPoint.y + f11) / f12);
                    this.f10613mX = pointFMapPoint.x;
                    this.f10614mY = pointFMapPoint.y;
                    strokeGraph.addPoint(event.getX(), event.getY());
                    strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
                }
            } else if (i10 == this.DRAG && (graph = this.selectGraph) != null && event.getPointerCount() > 1) {
                Matrix matrix = new Matrix();
                matrix.postConcat(this.mTempMatrix);
                PointF midPoint = ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
                float f13 = midPoint.x;
                PointF pointF = this.midPoint;
                matrix.postTranslate(f13 - pointF.x, midPoint.y - pointF.y);
                graph.setMatrix(matrix);
                matrix.getValues(this.floatArray);
                float f14 = this.floatArray[5];
                GraphMatrixListener graphMatrixListener = graph.getControl().getGraphMatrixListener();
                if (graphMatrixListener != null) {
                    float[] fArr = this.floatArray;
                    graphMatrixListener.onTranslation(fArr[2], fArr[5]);
                }
            }
            this.actionControl.render();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9133u.m16133g(event, "event");
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

    public final void setGraph(StrokeGraph strokeGraph) {
        this.graph = strokeGraph;
    }

    public final void setMX(float f10) {
        this.f10613mX = f10;
    }

    public final void setMY(float f10) {
        this.f10614mY = f10;
    }

    public final void setPath(Path path) {
        AbstractC9133u.m16133g(path, "<set-?>");
        this.path = path;
    }

    public final void setSelectGraph(Graph graph) {
        this.selectGraph = graph;
    }
}
