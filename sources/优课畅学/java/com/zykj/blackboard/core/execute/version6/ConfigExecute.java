package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class ConfigExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.Config> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public ConfigExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.Config data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.Config data) {
        AbstractC9133u.m16133g(data, "data");
        this.graphControl.updateBackgroundColor(data.m7593j());
        IGraphControl iGraphControl = this.graphControl;
        EzyHeader.BackgroundLineConfig backgroundLineConfigM7594k = data.m7594k();
        AbstractC9133u.m16132f(backgroundLineConfigM7594k, "data.lastBackgroundLineConfig");
        iGraphControl.updateBackgroundLineConfig(ConvertExtKt.toConfig(backgroundLineConfigM7594k));
        this.graphControl.reDrawFixView();
    }
}
