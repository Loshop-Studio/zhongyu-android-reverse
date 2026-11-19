package com.zykj.blackboard.core.execute;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.data.dao.CommandInfoEntity;
import com.zykj.board.EzyCommand$CommandSource;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0012H&¢\u0006\u0004\b\u0010\u0010\u0013¨\u0006\u0014"}, m5110d2 = {"Lcom/zykj/blackboard/core/execute/BaseCommandExecuteFactory;", "", "<init>", "()V", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;", "command", "Ld6/s;", "execute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;)V", "", "skipTime", "Lcom/zykj/blackboard/core/execute/PlayThread;", "asyncExecute", "(Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "", "async", "executeCommand", "(ZLcom/zykj/board/EzyCommand$CommandSource$CommandInfo;J)Lcom/zykj/blackboard/core/execute/PlayThread;", "Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;", "(Lcom/zykj/blackboard/core/data/dao/CommandInfoEntity;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public abstract class BaseCommandExecuteFactory {
    @Nullable
    public final PlayThread asyncExecute(@NotNull EzyCommand$CommandSource.CommandInfo command, long skipTime) {
        AbstractC5830k.m5330g(command, "command");
        return executeCommand(true, command, skipTime);
    }

    public final void execute(@NotNull EzyCommand$CommandSource.CommandInfo command) {
        AbstractC5830k.m5330g(command, "command");
        executeCommand(false, command, 0L);
    }

    @Nullable
    public abstract PlayThread executeCommand(boolean async, @NotNull EzyCommand$CommandSource.CommandInfo command, long skipTime);

    public abstract void executeCommand(@NotNull CommandInfoEntity command);
}
