package com.zykj.blackboard.core.graphBuilder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand$CommandSource;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&j\u0002\b\t¨\u0006\n"}, m5110d2 = {"Lcom/zykj/blackboard/core/graphBuilder/GraphBuildFactory;", "", "(Ljava/lang/String;I)V", "parse", "Lcom/zykj/blackboard/core/graph/Graph;", "graphData", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "sourceLoad", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "INSTANCE", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public enum GraphBuildFactory {
    INSTANCE { // from class: com.zykj.blackboard.core.graphBuilder.GraphBuildFactory.INSTANCE

        @NotNull
        private final Map<EzyGraphEnum$GraphEnum, GraphBuild> buildMap;

        @Override // com.zykj.blackboard.core.graphBuilder.GraphBuildFactory
        @Nullable
        public Graph parse(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData graphData, @NotNull SourceLoader sourceLoad) {
            AbstractC5830k.m5330g(graphData, "graphData");
            AbstractC5830k.m5330g(sourceLoad, "sourceLoad");
            GraphBuild graphBuild = this.buildMap.get(graphData.getGraphEnum());
            if (graphBuild != null) {
                return graphBuild.build(graphData, sourceLoad);
            }
            return null;
        }
    };

    /* synthetic */ GraphBuildFactory(AbstractC5824e abstractC5824e) {
        this();
    }

    @Nullable
    public abstract Graph parse(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData graphData, @NotNull SourceLoader sourceLoad);
}
