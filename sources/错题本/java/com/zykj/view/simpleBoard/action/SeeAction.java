package com.zykj.view.simpleBoard.action;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.view.simpleBoard.DrawControl;
import com.zykj.view.simpleBoard.SimpleBoardConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/action/SeeAction;", "Lcom/zykj/view/simpleBoard/action/BaseAction;", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "boardConfig", "Landroid/graphics/Matrix;", "cameraMatrix", "Lcom/zykj/view/simpleBoard/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "singleTouchDown", "(Landroid/view/MotionEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "onTouchPointerUp", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/DrawControl;", "Landroid/graphics/PointF;", "firstPointF", "Landroid/graphics/PointF;", "originMatrix", "tempMatrix", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SeeAction extends BaseAction {

    @NotNull
    private final SimpleBoardConfig boardConfig;

    @NotNull
    private final Matrix cameraMatrix;

    @NotNull
    private final DrawControl drawControl;

    @NotNull
    private final PointF firstPointF;

    @NotNull
    private final Matrix originMatrix;

    @NotNull
    private final Matrix tempMatrix;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeeAction(@NotNull SimpleBoardConfig boardConfig, @NotNull Matrix cameraMatrix, @NotNull DrawControl drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(cameraMatrix, "cameraMatrix");
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.boardConfig = boardConfig;
        this.cameraMatrix = cameraMatrix;
        this.drawControl = drawControl;
        this.firstPointF = new PointF();
        this.originMatrix = new Matrix();
        this.tempMatrix = new Matrix();
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void onTouchPointerUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        super.onTouchPointerUp(event);
        onTouchDown(event);
        this.firstPointF.set(-1.0f, -1.0f);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchCancel(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchDown(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.firstPointF.set(event.getX(), event.getY());
        this.originMatrix.set(this.cameraMatrix);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchMove(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        if (!this.firstPointF.equals(-1.0f, -1.0f)) {
            this.tempMatrix.set(this.originMatrix);
            this.tempMatrix.postTranslate(event.getX() - this.firstPointF.x, event.getY() - this.firstPointF.y);
            this.drawControl.handleCameraMatrix(this.tempMatrix);
        } else {
            this.firstPointF.x = event.getX();
            this.firstPointF.y = event.getY();
        }
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
    }
}
