package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.CameraMatrixThread;
import com.zykj.blackboard.utils.MatrixExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CameraMatrixExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.CameraMatrix> {
    private final IGraphControl graphControl;
    private final MatrixAdapter matrixAdapter;
    private final SourceLoader sourceLoader;

    public CameraMatrixExecute(SourceLoader sourceLoader, MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.CameraMatrix data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String strM7546l = data.m7546l();
        AbstractC9133u.m16132f(strM7546l, "data.sourceFileName");
        EzySource.MatrixSource.MatrixInfo matrixCache = sourceLoader.getMatrixCache(strM7546l, data.m7547m());
        if (matrixCache == null) {
            return null;
        }
        CameraMatrixThread cameraMatrixThread = new CameraMatrixThread();
        cameraMatrixThread.setGraphControl(this.graphControl);
        cameraMatrixThread.setSourceLoader(this.sourceLoader);
        cameraMatrixThread.setMatrixAdapter(this.matrixAdapter);
        cameraMatrixThread.setMatrixInfo(matrixCache, j10);
        return cameraMatrixThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.CameraMatrix data) {
        AbstractC9133u.m16133g(data, "data");
        MatrixAdapter matrixAdapter = this.matrixAdapter;
        EzyMatrix.Matrix matrixM7544j = data.m7544j();
        AbstractC9133u.m16132f(matrixM7544j, "data.lastMatrix");
        matrixAdapter.setCameraMatrix(MatrixExtKt.toMatrix(matrixM7544j));
        this.graphControl.reDrawFixView();
    }
}
