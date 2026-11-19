package com.zykj.sketch.core.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.sketch.EzyDrawBoard;
import com.zykj.sketch.core.graph.Graph;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.sketch.core.listener.IControl;
import com.zykj.sketch.extensions.ExtensionsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m13412d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010$\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, m13413d2 = {"Lcom/zykj/sketch/core/action/SelectAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "actionControl", "Lcom/zykj/sketch/core/listener/IControl;", "(Lcom/zykj/sketch/core/listener/IControl;)V", "DRAG", "", "NONE", "ZOOM", "anchorX", "", "anchorY", "mTempMatrix", "Landroid/graphics/Matrix;", "midPoint", "Landroid/graphics/PointF;", "mode", "getMode", "()I", "setMode", "(I)V", "oldDistance", "oldRotation", "selectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "enumType", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "initTempValue", "", "it", "onTouchDown", NotificationCompat.CATEGORY_EVENT, "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", "onTouchMove", "onTouchPointerDown", "onTouchPointerUp", "onTouchUp", "sketch_release"}, m13414k = 1, m13415mv = {1, 7, 1}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
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
        Intrinsics.checkNotNullParameter(actionControl, "actionControl");
        this.actionControl = actionControl;
        this.oldDistance = 1.0f;
        this.midPoint = new PointF();
        this.mTempMatrix = new Matrix();
        this.DRAG = 1;
        this.ZOOM = 4;
        this.mode = this.NONE;
    }

    private final void initTempValue(Graph it) {
        this.mTempMatrix.set(it.getMMatrix());
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchMove(event);
        Graph graph = this.selectGraph;
        if (graph != null) {
            int i9 = this.mode;
            if (i9 == this.DRAG) {
                Matrix matrix = new Matrix();
                matrix.postConcat(this.mTempMatrix);
                PointF pointFMapPoint = GraphExtKt.mapPoint(graph, new PointF(event.getX(), event.getY()), GraphExtKt.getWP2FPMatrix(graph));
                matrix.postTranslate(pointFMapPoint.x - this.anchorX, pointFMapPoint.y - this.anchorY);
                graph.setMatrix(matrix);
            } else if (i9 == this.ZOOM) {
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
        Intrinsics.checkNotNullParameter(event, "event");
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
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchPointerUp(event);
        this.mode = this.NONE;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onTouchUp(event);
        this.mode = this.NONE;
        this.actionControl.render();
    }

    public final void setMode(int i9) {
        this.mode = i9;
    }
}
