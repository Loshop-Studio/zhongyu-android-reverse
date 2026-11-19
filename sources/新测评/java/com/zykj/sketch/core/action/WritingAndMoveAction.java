package com.zykj.sketch.core.action;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.graph.StrokeGraph;
import com.zykj.sketch.core.graph.WritingGroupGraph;
import com.zykj.sketch.core.listener.GraphMatrixListener;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13557d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010,\u001a\u00020-H\u0016J\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'H\u0002J\u0010\u00103\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016J\u0010\u00107\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016J\u0010\u00108\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016J\u0010\u00109\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, m13558d2 = {"Lcom/zykj/sketch/core/action/WritingAndMoveAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "writingGroupGraph", "Lcom/zykj/sketch/core/graph/WritingGroupGraph;", "(Lcom/zykj/sketch/core/listener/IControl;Lcom/zykj/sketch/core/graph/WritingGroupGraph;)V", "DRAG", "", "NONE", "floatArray", "", "graph", "Lcom/zykj/sketch/core/graph/StrokeGraph;", "getGraph", "()Lcom/zykj/sketch/core/graph/StrokeGraph;", "setGraph", "(Lcom/zykj/sketch/core/graph/StrokeGraph;)V", "mTempMatrix", "Landroid/graphics/Matrix;", "mX", "", "getMX", "()F", "setMX", "(F)V", "mY", "getMY", "setMY", "midPoint", "Landroid/graphics/PointF;", "mode", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "selectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "getSelectGraph", "()Lcom/zykj/sketch/core/graph/Graph;", "setSelectGraph", "(Lcom/zykj/sketch/core/graph/Graph;)V", "enumType", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "getParentGraphName", "", "initTempValue", "", "it", "onTouchDown", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "onTouchMove", "onTouchPointerDown", "onTouchPointerUp", "onTouchUp", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public final class WritingAndMoveAction extends BaseAction {
    private final int DRAG;
    private final int NONE;
    private final IControl actionControl;
    private final float[] floatArray;
    private StrokeGraph graph;
    private Matrix mTempMatrix;
    private float mX;
    private float mY;
    private PointF midPoint;
    private int mode;
    private Path path;
    private Graph selectGraph;
    private final WritingGroupGraph writingGroupGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WritingAndMoveAction(IControl actionControl, WritingGroupGraph writingGroupGraph) {
        super(actionControl);
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        Intrinsics.checkNotNullParameter(writingGroupGraph, "writingGroupGraph");
        this.actionControl = actionControl;
        this.writingGroupGraph = writingGroupGraph;
        this.DRAG = 1;
        this.mTempMatrix = new Matrix();
        this.mode = this.NONE;
        this.midPoint = new PointF();
        this.path = new Path();
        this.floatArray = new float[9];
    }

    private final void initTempValue(Graph it) {
        this.mTempMatrix.set(it.getMMatrix());
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_WRITING_MOVE;
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

    public final Graph getSelectGraph() {
        return this.selectGraph;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
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
            float f10 = pointFMapPoint.x;
            this.mX = f10;
            float f11 = pointFMapPoint.y;
            this.mY = f11;
            this.path.moveTo(f10, f11);
            this.path.lineTo(this.mX, this.mY);
            strokeGraph.addPoint(event.getX(), event.getY());
            strokeGraph.getActionControl().renderTempPath(new Path(this.path), strokeGraph.getMPaint());
            this.actionControl.resetStatus();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Graph graph;
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPointerCount() != 1 || BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            int i10 = this.mode;
            if (i10 == this.NONE) {
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        this.mX = f10;
    }

    public final void setMY(float f10) {
        this.mY = f10;
    }

    public final void setPath(Path path) {
        Intrinsics.checkNotNullParameter(path, "<set-?>");
        this.path = path;
    }

    public final void setSelectGraph(Graph graph) {
        this.selectGraph = graph;
    }
}
