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
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001bR\u0016\u0010 \u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020%8\u0002X\u0082D¢\u0006\u0006\n\u0004\b)\u0010'R\"\u0010*\u001a\u00020%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010'\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u0006/"}, m5110d2 = {"Lcom/zykj/sketch/core/action/SelectAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Lcom/zykj/sketch/core/graph/Graph;", "it", "Ld6/s;", "initTempValue", "(Lcom/zykj/sketch/core/graph/Graph;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchDown", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "onTouchPointerDown", "onTouchMove", "onTouchPointerUp", "onTouchUp", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "enumType", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "Lcom/zykj/sketch/core/listener/IControl;", "selectGraph", "Lcom/zykj/sketch/core/graph/Graph;", "", "anchorX", "F", "anchorY", "oldDistance", "oldRotation", "Landroid/graphics/PointF;", "midPoint", "Landroid/graphics/PointF;", "Landroid/graphics/Matrix;", "mTempMatrix", "Landroid/graphics/Matrix;", "", "NONE", "I", "DRAG", "ZOOM", "mode", "getMode", "()I", "setMode", "(I)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SelectAction extends BaseAction {
    private final int DRAG;
    private final int NONE;
    private final int ZOOM;

    @NotNull
    private final IControl actionControl;
    private float anchorX;
    private float anchorY;

    @NotNull
    private Matrix mTempMatrix;

    @NotNull
    private PointF midPoint;
    private int mode;
    private float oldDistance;
    private float oldRotation;

    @Nullable
    private Graph selectGraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectAction(@NotNull IControl actionControl) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
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
    @NotNull
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_SELECT;
    }

    public final int getMode() {
        return this.mode;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
    public void onTouchMove(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchMove(event);
        Graph graph = this.selectGraph;
        if (graph != null) {
            int i = this.mode;
            if (i == this.DRAG) {
                Matrix matrix = new Matrix();
                matrix.postConcat(this.mTempMatrix);
                PointF pointFMapPoint = GraphExtKt.mapPoint(graph, new PointF(event.getX(), event.getY()), GraphExtKt.getWP2FPMatrix(graph));
                matrix.postTranslate(pointFMapPoint.x - this.anchorX, pointFMapPoint.y - this.anchorY);
                graph.setMatrix(matrix);
            } else if (i == this.ZOOM) {
                Matrix matrix2 = new Matrix();
                matrix2.postConcat(this.mTempMatrix);
                float distance = ExtensionsKt.getDistance(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph)) / this.oldDistance;
                PointF pointF = this.midPoint;
                matrix2.postScale(distance, distance, pointF.x, pointF.y);
                float rotation = ExtensionsKt.getRotation(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph)) - this.oldRotation;
                PointF pointF2 = this.midPoint;
                matrix2.postRotate(rotation, pointF2.x, pointF2.y);
                PointF midPoint = ExtensionsKt.getMidPoint(event.getPointerCoords(0).getX(), event.getPointerCoords(0).getY(), event.getPointerCoords(1).getX(), event.getPointerCoords(1).getY(), GraphExtKt.getWP2FPMatrix(graph));
                float f = midPoint.x;
                PointF pointF3 = this.midPoint;
                matrix2.postTranslate(f - pointF3.x, midPoint.y - pointF3.y);
                graph.setMatrix(matrix2);
            }
            this.actionControl.render();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
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
    public void onTouchPointerUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerUp(event);
        this.mode = this.NONE;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchUp(event);
        this.mode = this.NONE;
        this.actionControl.render();
    }

    public final void setMode(int i) {
        this.mode = i;
    }
}
