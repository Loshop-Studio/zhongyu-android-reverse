package com.zykj.blackboard.core.execute.version6;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyMatrix$Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/version6/CameraExecute;", "Lcom/zykj/blackboard/core/execute/CommandExecute;", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "matrixAdapter", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "graphControl", "<init>", "(Lcom/zykj/blackboard/core/canvas/MatrixAdapter;Lcom/zykj/blackboard/core/canvas/control/IGraphControl;)V", "data", "Ld6/s;", "execute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$Camera;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class CameraExecute implements CommandExecute<EzyCommand$CommandSource.CommandInfo.Camera> {

    @NotNull
    private final IGraphControl graphControl;

    @NotNull
    private final MatrixAdapter matrixAdapter;

    public CameraExecute(@NotNull MatrixAdapter matrixAdapter, @NotNull IGraphControl graphControl) {
        AbstractC5830k.m5330g(matrixAdapter, "matrixAdapter");
        AbstractC5830k.m5330g(graphControl, "graphControl");
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    @Nullable
    public PlayThread asyncExecute(@NotNull EzyCommand$CommandSource.CommandInfo.Camera data, long skipTime) {
        AbstractC5830k.m5330g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(@NotNull EzyCommand$CommandSource.CommandInfo.Camera data) {
        AbstractC5830k.m5330g(data, "data");
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        EzyMatrix$Matrix lastMatrix = data.getLastMatrix();
        AbstractC5830k.m5329f(lastMatrix, "data.lastMatrix");
        matrixAdapter.setCameraMatrix(MatrixExtKt.toMatrix(lastMatrix));
        this.graphControl.reDrawFixView();
    }
}
