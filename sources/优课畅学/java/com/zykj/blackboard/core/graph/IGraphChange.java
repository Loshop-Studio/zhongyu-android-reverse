package com.zykj.blackboard.core.graph;

import android.graphics.Matrix;
import com.zykj.blackboard.core.graph.group.ImageGraph;

/* loaded from: classes4.dex */
public interface IGraphChange {
    void addGraph(IGraph iGraph);

    void addImageGraph(ImageGraph imageGraph);

    void concatMatrix(Matrix matrix);

    void initMatrix(Matrix matrix);

    void removeGraph(IGraph iGraph);

    void updateRenderRectF();
}
