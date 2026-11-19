package com.zykj.sketch.core.action;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
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
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, m5110d2 = {"Lcom/zykj/sketch/core/action/EraseWritingAction;", "Lcom/zykj/sketch/core/action/BaseAction;", "Lcom/zykj/sketch/core/listener/IControl;", "actionControl", "<init>", "(Lcom/zykj/sketch/core/listener/IControl;)V", "Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "deleteGraph", "(Lcom/zykj/sketch/EzyDrawBoard$ActionTouchEvent$TouchEvent;)V", "onTouchDown", "onTouchPointerDown", "onTouchMove", "onTouchUp", "onTouchPointerUp", "Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "enumType", "()Lcom/zykj/sketch/EzyDrawBoard$ActionModeConfig$Mode;", "Lcom/zykj/sketch/core/listener/IControl;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Companion", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EraseWritingAction extends BaseAction {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static float TouchRadius = 40.0f;

    @NotNull
    private final IControl actionControl;

    @NotNull
    private Paint paint;

    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, m5110d2 = {"Lcom/zykj/sketch/core/action/EraseWritingAction$Companion;", "", "()V", "TouchRadius", "", "getTouchRadius", "()F", "setTouchRadius", "(F)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC5824e abstractC5824e) {
            this();
        }

        public final float getTouchRadius() {
            return EraseWritingAction.TouchRadius;
        }

        public final void setTouchRadius(float f) {
            EraseWritingAction.TouchRadius = f;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraseWritingAction(@NotNull IControl actionControl) {
        super(actionControl);
        AbstractC5830k.m5330g(actionControl, "actionControl");
        this.actionControl = actionControl;
        Paint paint = new Paint();
        this.paint = paint;
        paint.setStyle(Paint.Style.FILL);
        this.paint.setColor(SupportMenu.CATEGORY_MASK);
        this.paint.setStrokeWidth(20.0f);
        actionControl.getCameraMatrix().getValues(new float[9]);
    }

    private final void deleteGraph(EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        List<Graph> listFindGraph = this.actionControl.findGraph(event.getX(), event.getY(), TouchRadius);
        Path path = new Path();
        PointF pointFMapPoint = GraphExtKt.mapPoint(this.actionControl.getCameraMatrix(), new PointF(event.getX(), event.getY()));
        path.addCircle(pointFMapPoint.x, pointFMapPoint.y, TouchRadius, Path.Direction.CW);
        for (Graph graph : listFindGraph) {
            if (graph instanceof ViewGraph) {
                if (IGraph.DefaultImpls.isInRect$default(graph, event.getX(), event.getY(), 0.0f, 4, null)) {
                    break;
                }
            } else if (graph instanceof WritingGroupGraph) {
                Iterator<T> it = ((WritingGroupGraph) graph).getIntersectGraph(event.getX(), event.getY(), TouchRadius).iterator();
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
    @NotNull
    public EzyDrawBoard.ActionModeConfig.Mode enumType() {
        return EzyDrawBoard.ActionModeConfig.Mode.ACTION_ERASER_WRITING;
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchDown(event);
            deleteGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchMove(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchMove(event);
            deleteGraph(event);
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerDown(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchPointerUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
            deleteGraph(event);
            this.actionControl.resetStatus();
        }
    }

    @Override // com.zykj.sketch.core.action.BaseAction, com.zykj.sketch.core.listener.IAction
    public void onTouchUp(@NotNull EzyDrawBoard.ActionTouchEvent.TouchEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (BaseAction.isTouchEnable$default(this, event, false, 2, null)) {
            super.onTouchUp(event);
            deleteGraph(event);
            this.actionControl.resetStatus();
        }
    }
}
