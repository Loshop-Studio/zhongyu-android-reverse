package com.zykj.blackboard.core.play;

import android.graphics.Paint;
import android.graphics.Path;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.utils.GraphUtilsKt;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzySource$TouchSource;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, m5110d2 = {"Lcom/zykj/blackboard/core/play/TouchEventThread;", "Lcom/zykj/blackboard/core/execute/EventPlayThread;", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "<init>", "()V", "Lcom/zykj/board/EzySource$TouchSource$TouchInfo;", "touchInfo", "", "skipTime", "Ld6/s;", "setTouchInfo", "(Lcom/zykj/board/EzySource$TouchSource$TouchInfo;J)V", "info", "handle", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;)V", "currentTime", "", "needHandle", "(Lcom/zykj/board/EzyTouchEvent$TouchEvent;J)Z", "shutdown", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "", "mX", "F", "mY", "Landroid/graphics/Path;", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "setPath", "(Landroid/graphics/Path;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class TouchEventThread extends EventPlayThread<EzyTouchEvent$TouchEvent> {
    private float mX;
    private float mY;

    @NotNull
    private final Paint paint = new Paint();

    @Nullable
    private Path path = new Path();

    @Nullable
    public final Path getPath() {
        return this.path;
    }

    public final void setPath(@Nullable Path path) {
        this.path = path;
    }

    public final void setTouchInfo(@NotNull EzySource$TouchSource.TouchInfo touchInfo, long skipTime) {
        AbstractC5830k.m5330g(touchInfo, "touchInfo");
        Paint paint = this.paint;
        EzyPaint$Paint paint2 = touchInfo.getPaint();
        AbstractC5830k.m5329f(paint2, "touchInfo.paint");
        paint.set(GraphUtilsKt.covertPaint(paint2));
        Path path = this.path;
        if (path != null) {
            path.reset();
        }
        List<EzyTouchEvent$TouchEvent> touchEventList = touchInfo.getTouchEventList();
        AbstractC5830k.m5329f(touchEventList, "touchInfo.touchEventList");
        if (touchEventList.isEmpty()) {
            return;
        }
        setListIterator(touchInfo.getTouchEventList().listIterator());
        List<EzyTouchEvent$TouchEvent> touchEventList2 = touchInfo.getTouchEventList();
        AbstractC5830k.m5329f(touchEventList2, "touchInfo.touchEventList");
        initStartPlayTime(((EzyTouchEvent$TouchEvent) AbstractC5805t.m5228h0(touchEventList2)).getEventTime());
        seekTo(skipTime);
    }

    @Override // com.zykj.blackboard.core.execute.PlayThread
    public void shutdown() {
        super.shutdown();
        this.path = null;
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    // RE note 正在书写的曲线停在相邻触点的中点。外层命令结束后由完整 StrokeGraph
    // 渲染最终路径，末端再连到最后的触点。直接跳播保留这两个阶段的差别。
    public void handle(@NotNull EzyTouchEvent$TouchEvent info) {
        AbstractC5830k.m5330g(info, "info");
        Path path = this.path;
        if (path == null) {
            return;
        }
        if (path.isEmpty()) {
            this.mX = info.getX();
            float y2 = info.getY();
            this.mY = y2;
            path.moveTo(this.mX, y2);
            path.lineTo(this.mX, this.mY);
            return;
        }
        float f = 2;
        path.quadTo(this.mX, this.mY, (info.getX() + this.mX) / f, (info.getY() + this.mY) / f);
        this.mX = info.getX();
        this.mY = info.getY();
        IGraphControl graphControl = getGraphControl();
        if (graphControl != null) {
            Paint paint = this.paint;
            MatrixAdapter matrixAdapter = getMatrixAdapter();
            graphControl.drawPath(path, paint, matrixAdapter != null ? matrixAdapter.getAdapterMatrix() : null);
        }
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public boolean needHandle(@NotNull EzyTouchEvent$TouchEvent info, long currentTime) {
        AbstractC5830k.m5330g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= currentTime;
    }
}
