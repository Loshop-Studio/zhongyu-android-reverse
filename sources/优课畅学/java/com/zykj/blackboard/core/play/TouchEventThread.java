package com.zykj.blackboard.core.play;

import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class TouchEventThread extends EventPlayThread<EzyTouchEvent.TouchEvent> {

    /* renamed from: mX */
    private float f8780mX;

    /* renamed from: mY */
    private float f8781mY;
    private final Paint paint = new Paint();
    private Path path = new Path();

    public final Path getPath() {
        return this.path;
    }

    public final void setPath(Path path) {
        this.path = path;
    }

    public final void setTouchInfo(EzySource.TouchSource.TouchInfo touchInfo, long j10) {
        AbstractC9133u.m16133g(touchInfo, "touchInfo");
        Paint paint = this.paint;
        EzyPaint.Paint paintM9013j = touchInfo.m9013j();
        AbstractC9133u.m16132f(paintM9013j, "touchInfo.paint");
        paint.set(GraphUtilsKt.covertPaint(paintM9013j));
        Path path = this.path;
        if (path != null) {
            path.reset();
        }
        List touchEventList = touchInfo.getTouchEventList();
        AbstractC9133u.m16132f(touchEventList, "touchInfo.touchEventList");
        if (touchEventList.isEmpty()) {
            return;
        }
        setListIterator(touchInfo.getTouchEventList().listIterator());
        List touchEventList2 = touchInfo.getTouchEventList();
        AbstractC9133u.m16132f(touchEventList2, "touchInfo.touchEventList");
        initStartPlayTime(((EzyTouchEvent.TouchEvent) AbstractC8778f0.m14566l0(touchEventList2)).getEventTime());
        seekTo(j10);
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void shutdown() {
        super.shutdown();
        this.path = null;
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public void handle(EzyTouchEvent.TouchEvent info) {
        AbstractC9133u.m16133g(info, "info");
        Path path = this.path;
        if (path != null && path.isEmpty()) {
            this.f8780mX = info.getX();
            float y10 = info.getY();
            this.f8781mY = y10;
            Path path2 = this.path;
            if (path2 != null) {
                path2.moveTo(this.f8780mX, y10);
            }
            Path path3 = this.path;
            if (path3 != null) {
                path3.lineTo(this.f8780mX, this.f8781mY);
                return;
            }
            return;
        }
        Path path4 = this.path;
        if (path4 != null) {
            float f10 = 2;
            path4.quadTo(this.f8780mX, this.f8781mY, (info.getX() + this.f8780mX) / f10, (info.getY() + this.f8781mY) / f10);
        }
        this.f8780mX = info.getX();
        this.f8781mY = info.getY();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Path path5 = this.path;
            AbstractC9133u.m16130d(path5);
            Paint paint = this.paint;
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(path5, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public boolean needHandle(EzyTouchEvent.TouchEvent info, long j10) {
        AbstractC9133u.m16133g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= j10;
    }
}
