package com.zykj.view.simpleBoard.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.DrawControl;
import com.zykj.view.simpleBoard.SimpleBoardConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/action/EraserAction;", "Lcom/zykj/view/simpleBoard/action/BaseAction;", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "boardConfig", "Landroid/graphics/Matrix;", "cameraMatrix", "Lcom/zykj/view/simpleBoard/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "singleTouchDown", "(Landroid/view/MotionEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/DrawControl;", "Landroid/graphics/PointF;", "lastPointF", "Landroid/graphics/PointF;", "tempPointF", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class EraserAction extends BaseAction {

    @NotNull
    private final SimpleBoardConfig boardConfig;

    @NotNull
    private final Matrix cameraMatrix;

    @NotNull
    private final DrawControl drawControl;

    @NotNull
    private final PointF lastPointF;

    @NotNull
    private final PointF tempPointF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EraserAction(@NotNull SimpleBoardConfig boardConfig, @NotNull Matrix cameraMatrix, @NotNull DrawControl drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(cameraMatrix, "cameraMatrix");
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.boardConfig = boardConfig;
        this.cameraMatrix = cameraMatrix;
        this.drawControl = drawControl;
        this.lastPointF = new PointF();
        this.tempPointF = new PointF();
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchCancel(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        singleTouchUp(event);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchDown(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.tempPointF.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.cameraMatrix), this.tempPointF);
        this.lastPointF.set(pointFMapPoint.x, pointFMapPoint.y);
        this.drawControl.handleEraser(this.lastPointF);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchMove(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        singleTouchDown(event);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.tempPointF.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.cameraMatrix), this.tempPointF);
        this.lastPointF.set(pointFMapPoint.x, pointFMapPoint.y);
        this.drawControl.handleEraserEnd(this.lastPointF);
    }
}
