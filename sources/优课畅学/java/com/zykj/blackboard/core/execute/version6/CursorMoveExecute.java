package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.core.play.CursorMoveThread;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzySource;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CursorMoveExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.CursorMove> {
    private final IGraphControl graphControl;
    private final MatrixAdapter matrixAdapter;
    private final SourceLoader sourceLoader;

    public CursorMoveExecute(SourceLoader sourceLoader, MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.matrixAdapter = matrixAdapter;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.CursorMove data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        SourceLoader sourceLoader = this.sourceLoader;
        String strM7639g = data.m7639g();
        AbstractC9133u.m16132f(strM7639g, "data.sourceFileName");
        EzySource.TouchSource.TouchInfo touchCache = sourceLoader.getTouchCache(strM7639g, data.m7640h());
        if (touchCache == null) {
            return null;
        }
        CursorMoveThread cursorMoveThread = new CursorMoveThread();
        cursorMoveThread.setGraphControl(this.graphControl);
        cursorMoveThread.setSourceLoader(this.sourceLoader);
        cursorMoveThread.setMatrixAdapter(this.matrixAdapter);
        cursorMoveThread.setTouchInfo(touchCache, j10);
        return cursorMoveThread;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.CursorMove data) {
        AbstractC9133u.m16133g(data, "data");
        this.graphControl.selectCancel();
    }
}
