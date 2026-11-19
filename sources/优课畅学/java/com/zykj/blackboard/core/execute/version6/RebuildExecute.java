package com.zykj.blackboard.core.execute.version6;

import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.execute.CommandExecute;
import com.zykj.blackboard.core.execute.PlayThread;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.utils.ConvertExtKt;
import com.zykj.blackboard.utils.GraphUtils;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyPageSnapshot;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public final class RebuildExecute implements CommandExecute<EzyCommand.CommandSource.CommandInfo.REBUILD> {
    private final IGraphControl graphControl;
    private final SourceLoader sourceLoader;

    public RebuildExecute(SourceLoader sourceLoader, IGraphControl graphControl) {
        AbstractC9133u.m16133g(sourceLoader, "sourceLoader");
        AbstractC9133u.m16133g(graphControl, "graphControl");
        this.sourceLoader = sourceLoader;
        this.graphControl = graphControl;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public PlayThread asyncExecute(EzyCommand.CommandSource.CommandInfo.REBUILD data, long j10) {
        AbstractC9133u.m16133g(data, "data");
        execute(data);
        return null;
    }

    @Override // com.zykj.blackboard.core.execute.CommandExecute
    public void execute(EzyCommand.CommandSource.CommandInfo.REBUILD data) {
        AbstractC9133u.m16133g(data, "data");
        GraphUtils graphUtils = GraphUtils.INSTANCE;
        SourceLoader sourceLoader = this.sourceLoader;
        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshotM7898j = data.m7898j();
        AbstractC9133u.m16132f(graphSnapshotM7898j, "data.snapshot");
        Graph graphBuildGraph = graphUtils.buildGraph(sourceLoader, graphSnapshotM7898j);
        if (graphBuildGraph != null) {
            this.graphControl.init(graphBuildGraph);
            this.graphControl.updateBackgroundColor(data.getBackgroundColor());
            IGraphControl iGraphControl = this.graphControl;
            EzyHeader.BackgroundLineConfig backgroundLineConfigM7896g = data.m7896g();
            AbstractC9133u.m16132f(backgroundLineConfigM7896g, "data.backgroundLineConfig");
            iGraphControl.updateBackgroundLineConfig(ConvertExtKt.toConfig(backgroundLineConfigM7896g));
            this.graphControl.reDrawFixView();
        }
    }
}
