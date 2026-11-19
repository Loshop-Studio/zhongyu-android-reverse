package com.zykj.blackboard.core.graphBuilder;

import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand;

/* loaded from: classes4.dex */
public interface GraphBuild {
    Graph build(EzyCommand.CommandSource.CommandInfo.GraphData graphData, SourceLoader sourceLoader);
}
