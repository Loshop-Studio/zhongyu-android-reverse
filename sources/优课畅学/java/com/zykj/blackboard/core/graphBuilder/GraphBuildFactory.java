package com.zykj.blackboard.core.graphBuilder;

import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand;
import com.zykj.board.EzyGraphEnum;
import java.util.Map;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public enum GraphBuildFactory {
    INSTANCE { // from class: com.zykj.blackboard.core.graphBuilder.GraphBuildFactory.INSTANCE
        private final Map<EzyGraphEnum.GraphEnum, GraphBuild> buildMap;

        @Override // com.zykj.blackboard.core.graphBuilder.GraphBuildFactory
        public Graph parse(EzyCommand.CommandSource.CommandInfo.GraphData graphData, SourceLoader sourceLoad) {
            AbstractC9133u.m16133g(graphData, "graphData");
            AbstractC9133u.m16133g(sourceLoad, "sourceLoad");
            GraphBuild graphBuild = this.buildMap.get(graphData.m7760s());
            if (graphBuild != null) {
                return graphBuild.build(graphData, sourceLoad);
            }
            return null;
        }
    };

    /* synthetic */ GraphBuildFactory(AbstractC9126n abstractC9126n) {
        this();
    }

    public abstract Graph parse(EzyCommand.CommandSource.CommandInfo.GraphData graphData, SourceLoader sourceLoader);
}
