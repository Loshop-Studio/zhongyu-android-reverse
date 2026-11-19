package com.zykj.blackboard.listener;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.IGraph;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m5110d2 = {"Lcom/zykj/blackboard/listener/GraphDeleteListener;", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "Ld6/s;", "onGraphDelete", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface GraphDeleteListener {
    void onGraphDelete(@NotNull IGraph graph);
}
