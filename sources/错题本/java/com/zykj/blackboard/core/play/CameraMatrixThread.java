package com.zykj.blackboard.core.play;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.EventPlayThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzySource$MatrixSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.AbstractC5805t;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m5110d2 = {"Lcom/zykj/blackboard/core/play/CameraMatrixThread;", "Lcom/zykj/blackboard/core/execute/EventPlayThread;", "Lcom/zykj/board/EzyMatrix$Matrix;", "<init>", "()V", "Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;", "info", "", "skipTime", "Ld6/s;", "setMatrixInfo", "(Lcom/zykj/board/EzySource$MatrixSource$MatrixInfo;J)V", "handle", "(Lcom/zykj/board/EzyMatrix$Matrix;)V", "currentTime", "", "needHandle", "(Lcom/zykj/board/EzyMatrix$Matrix;J)Z", "", "matrixList", "Ljava/util/List;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CameraMatrixThread extends EventPlayThread<EzyMatrix$Matrix> {

    @Nullable
    private List<EzyMatrix$Matrix> matrixList;

    public final void setMatrixInfo(@NotNull EzySource$MatrixSource.MatrixInfo info, long skipTime) {
        AbstractC5830k.m5330g(info, "info");
        List<EzyMatrix$Matrix> matrixList = info.getMatrixList();
        AbstractC5830k.m5329f(matrixList, "info.matrixList");
        if (matrixList.isEmpty()) {
            return;
        }
        this.matrixList = info.getMatrixList();
        setListIterator(info.getMatrixList().listIterator());
        List<EzyMatrix$Matrix> matrixList2 = info.getMatrixList();
        AbstractC5830k.m5329f(matrixList2, "info.matrixList");
        initStartPlayTime(((EzyMatrix$Matrix) AbstractC5805t.m5228h0(matrixList2)).getEventTime());
        seekTo(skipTime);
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public void handle(@NotNull EzyMatrix$Matrix info) {
        AbstractC5830k.m5330g(info, "info");
        List<EzyMatrix$Matrix> list = this.matrixList;
        if (list != null) {
            if (info.equals(AbstractC5805t.m5235o0(list))) {
                IGraphControl graphControl = getGraphControl();
                if (graphControl != null) {
                    graphControl.cameraChangeEnd(MatrixExtKt.toMatrix(info));
                    return;
                }
                return;
            }
            if (info.equals(AbstractC5805t.m5228h0(list))) {
                IGraphControl graphControl2 = getGraphControl();
                if (graphControl2 != null) {
                    graphControl2.cameraChangeStart();
                    return;
                }
                return;
            }
            IGraphControl graphControl3 = getGraphControl();
            if (graphControl3 != null) {
                graphControl3.cameraChanging(MatrixExtKt.toMatrix(info));
            }
        }
    }

    @Override // com.zykj.blackboard.core.execute.EventPlayThread
    public boolean needHandle(@NotNull EzyMatrix$Matrix info, long currentTime) {
        AbstractC5830k.m5330g(info, "info");
        return info.getEventTime() - getStartPlayTime() <= currentTime;
    }
}
