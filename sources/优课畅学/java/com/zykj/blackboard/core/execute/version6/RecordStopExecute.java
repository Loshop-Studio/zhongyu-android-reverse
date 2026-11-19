package com.zykj.blackboard.core.execute.version6;

import com.google.protobuf.Any;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.loader.SourceLoader;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class RecordStopExecute implements CommandExecute<Any> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public RecordStopExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(Any data) {
        AbstractC9133u.m16133g(data, "data");
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(Any data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }
}
