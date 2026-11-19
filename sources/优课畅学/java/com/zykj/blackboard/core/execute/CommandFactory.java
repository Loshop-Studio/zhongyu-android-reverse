package com.zykj.blackboard.core.execute;

import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.version6.CommandExecuteFactory6;
import com.zykj.blackboard.core.loader.SourceLoader;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class CommandFactory {
    public static final CommandFactory INSTANCE = new CommandFactory();

    private CommandFactory() {
    }

    public final BaseCommandExecuteFactory createCommandFactory(int i10, SourceLoader sourceLoader, MatrixAdapter matrixAdapter, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(matrixAdapter, "matrixAdapter");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        return i10 == 6 ? new CommandExecuteFactory6(sourceLoader, matrixAdapter, graphControl) : new CommandExecuteFactory6(sourceLoader, matrixAdapter, graphControl);
    }
}
