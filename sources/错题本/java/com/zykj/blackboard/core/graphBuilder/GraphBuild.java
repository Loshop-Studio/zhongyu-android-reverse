package com.zykj.blackboard.core.graphBuilder;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyCommand$CommandSource;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m5110d2 = {"Lcom/zykj/blackboard/core/graphBuilder/GraphBuild;", "", "build", "Lcom/zykj/blackboard/core/graph/Graph;", "graphData", "Lcom/zykj/board/EzyCommand$CommandSource$CommandInfo$GraphData;", "sourceLoad", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface GraphBuild {
    @NotNull
    Graph build(@NotNull EzyCommand$CommandSource.CommandInfo.GraphData graphData, @NotNull SourceLoader sourceLoad);
}
