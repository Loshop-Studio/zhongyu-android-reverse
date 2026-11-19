package com.zykj.blackboard.core.play;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzySource;
import com.zykj.board.EzyTouchEvent;
import java.util.List;
import kotlin.jvm.internal.AbstractC9133u;
import p134i7.AbstractC8778f0;

/* loaded from: classes4.dex */
public final class CursorMoveThread extends EventPlayThread<EzyTouchEvent.TouchEvent> {
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
        Matrix matrix;
        Matrix adapterMatrix;
        AbstractC9133u.m16133g(info, "info");
        Path path = this.path;
        if (path != null) {
            path.reset();
            float x10 = info.getX();
            float y10 = info.getY();
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            if (matrixAdapter == null || (adapterMatrix = matrixAdapter.getAdapterMatrix()) == null || (matrix = MatrixExtKt.invert(adapterMatrix)) == null) {
                matrix = new Matrix();
            }
            path.addCircle(x10, y10, matrix.mapRadius(this.paint.getStrokeWidth() / 2), Path.Direction.CW);
            IGraphControl graphControl = getGraphControl();
            if (graphControl != null) {
                Paint paint = this.paint;
                MatrixAdapter matrixAdapter2 = getMatrixAdapter();
                graphControl.drawPath(path, paint, matrixAdapter2 != null ? matrixAdapter2.getAdapterMatrix() : null);
            }
        }
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public boolean needHandle(EzyTouchEvent.TouchEvent info, long j10) {
        AbstractC9133u.m16133g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= j10;
    }
}
