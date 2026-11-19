package com.zykj.view.simpleBoard.action;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.MotionEvent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.sketch.core.graph.GraphExtKt;
import com.zykj.view.simpleBoard.DrawControl;
import com.zykj.view.simpleBoard.SimpleBoardConfig;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Lcom/zykj/view/simpleBoard/action/WriteAction;", "Lcom/zykj/view/simpleBoard/action/BaseAction;", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "boardConfig", "Landroid/graphics/Matrix;", "cameraMatrix", "Lcom/zykj/view/simpleBoard/DrawControl;", "drawControl", "<init>", "(Lcom/zykj/view/simpleBoard/SimpleBoardConfig;Landroid/graphics/Matrix;Lcom/zykj/view/simpleBoard/DrawControl;)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "Ld6/s;", "singleTouchDown", "(Landroid/view/MotionEvent;)V", "singleTouchMove", "singleTouchUp", "singleTouchCancel", "Lcom/zykj/view/simpleBoard/SimpleBoardConfig;", "Landroid/graphics/Matrix;", "Lcom/zykj/view/simpleBoard/DrawControl;", "", "mLastX", "F", "mLastY", "Landroid/graphics/Path;", "tempPath", "Landroid/graphics/Path;", "Ljava/util/ArrayList;", "Landroid/graphics/PointF;", "Lkotlin/collections/ArrayList;", "tempPointFList", "Ljava/util/ArrayList;", "tempPointF", "Landroid/graphics/PointF;", "view_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class WriteAction extends BaseAction {

    @NotNull
    private final SimpleBoardConfig boardConfig;

    @NotNull
    private final Matrix cameraMatrix;

    @NotNull
    private final DrawControl drawControl;
    private float mLastX;
    private float mLastY;

    @NotNull
    private final Path tempPath;

    @NotNull
    private final PointF tempPointF;

    @NotNull
    private final ArrayList<PointF> tempPointFList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WriteAction(@NotNull SimpleBoardConfig boardConfig, @NotNull Matrix cameraMatrix, @NotNull DrawControl drawControl) {
        super(boardConfig, cameraMatrix, drawControl);
        AbstractC5830k.m5330g(boardConfig, "boardConfig");
        AbstractC5830k.m5330g(cameraMatrix, "cameraMatrix");
        AbstractC5830k.m5330g(drawControl, "drawControl");
        this.boardConfig = boardConfig;
        this.cameraMatrix = cameraMatrix;
        this.drawControl = drawControl;
        this.tempPath = new Path();
        this.tempPointFList = new ArrayList<>();
        this.tempPointF = new PointF();
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchCancel(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.drawControl.handleWritePathCancel();
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchDown(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.tempPointF.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.cameraMatrix), this.tempPointF);
        this.tempPointFList.clear();
        this.tempPointFList.add(pointFMapPoint);
        this.tempPath.reset();
        this.tempPath.moveTo(pointFMapPoint.x, pointFMapPoint.y);
        this.tempPath.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.mLastX = pointFMapPoint.x;
        this.mLastY = pointFMapPoint.y;
        this.drawControl.handleWritePath(this.tempPath);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchMove(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.tempPointF.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.cameraMatrix), this.tempPointF);
        this.tempPointFList.add(pointFMapPoint);
        Path path = this.tempPath;
        float f = this.mLastX;
        float f7 = this.mLastY;
        float f8 = 2;
        path.quadTo(f, f7, (pointFMapPoint.x + f) / f8, (pointFMapPoint.y + f7) / f8);
        this.mLastX = pointFMapPoint.x;
        this.mLastY = pointFMapPoint.y;
        this.drawControl.handleWritePath(this.tempPath);
    }

    @Override // com.zykj.view.simpleBoard.action.BaseAction
    public void singleTouchUp(@NotNull MotionEvent event) {
        AbstractC5830k.m5330g(event, "event");
        this.tempPointF.set(event.getX(), event.getY());
        PointF pointFMapPoint = GraphExtKt.mapPoint(MatrixExtKt.invert(this.cameraMatrix), this.tempPointF);
        this.tempPointFList.add(pointFMapPoint);
        Path path = this.tempPath;
        float f = this.mLastX;
        float f7 = this.mLastY;
        float f8 = 2;
        path.quadTo(f, f7, (pointFMapPoint.x + f) / f8, (pointFMapPoint.y + f7) / f8);
        this.tempPath.lineTo(pointFMapPoint.x, pointFMapPoint.y);
        this.drawControl.handleWritePathEnd(this.tempPath, this.tempPointFList);
    }
}
