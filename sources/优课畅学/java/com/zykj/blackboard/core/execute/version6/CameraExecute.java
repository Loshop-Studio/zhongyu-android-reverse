package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CameraExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.Camera> {
    private final IGraphControl graphControl;
    private final MatrixAdapter matrixAdapter;

    public CameraExecute(MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.Camera data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.Camera data) {
        AbstractC9133u.m16133g(data, "data");
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        EzyMatrix.Matrix matrixM7499h = data.m7499h();
        AbstractC9133u.m16132f(matrixM7499h, "data.lastMatrix");
        matrixAdapter.setCameraMatrix(MatrixExtKt.toMatrix(matrixM7499h));
        this.graphControl.reDrawFixView();
    }
}
