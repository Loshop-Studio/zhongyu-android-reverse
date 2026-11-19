package com.zykj.sketch.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.List;
import kotlin.jvm.internal.AbstractC9979u;

/* loaded from: classes6.dex */
public final class SelectAction extends BaseAction {
    private final int DRAG;
    private final int NONE;
    private final int ZOOM;
    private final IControl actionControl;
    private float anchorX;
    private float anchorY;
    private Matrix mTempMatrix;
    private PointF midPoint;
    private int mode;
    private float oldDistance;
    private float oldRotation;
    private Graph selectGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAction(IControl actionControl) {
        super(actionControl);
        AbstractC9979u.m20294g(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.oldDistance = 1.0f;
        this.midPoint = new PointF();
        this.mTempMatrix = new Matrix();
        this.DRAG = 1;
        this.ZOOM = 4;
        this.mode = this.NONE;
    }

    private final void initTempValue(Graph graph) {
        this.mTempMatrix.set(graph.getMatrix());
    }

    @Override // com.zykj.sketch.core.listener.IAction
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_SELECT;
    }

    public final int getMode() {
        return this.mode;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchDown(event);
        List listFindGraph$default = IControl.DefaultImpls.findGraph$default(this.actionControl, event.getX(), event.getY(), 0.0f, 4, null);
        if (!listFindGraph$default.isEmpty()) {
            this.selectGraph = (Graph) listFindGraph$default.get(0);
        }
        listFindGraph$default.clear();
        this.actionControl.getRootGraph().cancelSelected();
        Graph graph = this.selectGraph;
        if (graph != null) {
            graph.setSelect(true);
            initTempValue(graph);
            PointF pointFMapPoint = GraphExtKt.mapPoint(graph, new PointF(event.getX(), event.getY()), GraphExtKt.getWP2FPMatrix(graph));
            this.anchorX = pointFMapPoint.x;
            this.anchorY = pointFMapPoint.y;
            this.mode = this.DRAG;
            this.actionControl.render();
            setRecord(true);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchMove(event);
        Graph graph = this.selectGraph;
        if (graph != null) {
            int i10 = this.mode;
            if (i10 == this.DRAG) {
                Matrix matrix = new Matrix();
                matrix.postConcat(this.mTempMatrix);
                PointF pointFMapPoint = GraphExtKt.mapPoint(graph, new PointF(event.getX(), event.getY()), GraphExtKt.getWP2FPMatrix(graph));
                matrix.postTranslate(pointFMapPoint.x - this.anchorX, pointFMapPoint.y - this.anchorY);
                graph.setMatrix(matrix);
            } else if (i10 == this.ZOOM) {
                Matrix matrix2 = new Matrix();
                matrix2.postConcat(this.mTempMatrix);
                float distance = ExtensionsKt.getDistance(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph)) / this.oldDistance;
                PointF pointF = this.midPoint;
                matrix2.postScale(distance, distance, pointF.x, pointF.y);
                float rotation = ExtensionsKt.getRotation(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph)) - this.oldRotation;
                PointF pointF2 = this.midPoint;
                matrix2.postRotate(rotation, pointF2.x, pointF2.y);
                PointF midPoint = ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
                float f10 = midPoint.x;
                PointF pointF3 = this.midPoint;
                matrix2.postTranslate(f10 - pointF3.x, midPoint.y - pointF3.y);
                graph.setMatrix(matrix2);
            }
            this.actionControl.render();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchPointerDown(event);
        Graph graph = this.selectGraph;
        if (graph != null) {
            initTempValue(graph);
            this.oldDistance = ExtensionsKt.getDistance(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
            this.oldRotation = ExtensionsKt.getRotation(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
            this.midPoint = ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
            this.mode = this.ZOOM;
            this.actionControl.render();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchPointerUp(event);
        this.mode = this.NONE;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC9979u.m20294g(event, "event");
        super.onTouchUp(event);
        this.mode = this.NONE;
        this.actionControl.render();
    }

    public final void setMode(int i10) {
        this.mode = i10;
    }
}
