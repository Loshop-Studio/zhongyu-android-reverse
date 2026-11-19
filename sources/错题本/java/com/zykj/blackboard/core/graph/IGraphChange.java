package com.zykj.blackboard.core.graph;

import android.graphics.Matrix;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.group.ImageGraph;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(m5109d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0004H&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/IGraphChange;", "", "Lcom/zykj/blackboard/core/graph/IGraph;", "graph", "Ld6/s;", "addGraph", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "Lcom/zykj/blackboard/core/graph/group/ImageGraph;", "addImageGraph", "(Lcom/zykj/blackboard/core/graph/group/ImageGraph;)V", "removeGraph", "Landroid/graphics/Matrix;", "matrix", "concatMatrix", "(Landroid/graphics/Matrix;)V", "initMatrix", "updateRenderRectF", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IGraphChange {
    void addGraph(@NotNull IGraph graph);

    void addImageGraph(@NotNull ImageGraph graph);

    void concatMatrix(@NotNull Matrix matrix);

    void initMatrix(@NotNull Matrix matrix);

    void removeGraph(@NotNull IGraph graph);

    void updateRenderRectF();
}
