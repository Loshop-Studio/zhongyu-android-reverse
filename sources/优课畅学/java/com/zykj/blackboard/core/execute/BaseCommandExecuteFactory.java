package com.zykj.blackboard.core.execute;

import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public abstract class BaseCommandExecuteFactory {
    public final PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo command, long j10) {
        AbstractC9133u.m16133g(command, "command");
        return executeCommand(true, command, j10);
    }

    public final void execute(EzyCommand.CommandSource.CommandInfo command) {
        AbstractC9133u.m16133g(command, "command");
        executeCommand(false, command, 0L);
    }

    public abstract PlayThread executeCommand(boolean z10, EzyCommand.CommandSource.CommandInfo commandInfo, long j10);

    public abstract void executeCommand(CommandInfoEntity commandInfoEntity);
}
