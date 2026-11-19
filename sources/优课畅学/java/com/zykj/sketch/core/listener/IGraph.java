package com.zykj.sketch.core.listener;

import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.Graph;
import java.util.List;

/* loaded from: classes3.dex */
public interface IGraph {

    public static final class DefaultImpls {
        public static /* synthetic */ boolean isInRect$default(IGraph iGraph, float f10, float f11, float f12, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInRect");
            }
            if ((i10 & 4) != 0) {
                f12 = 0.0f;
            }
            return iGraph.isInRect(f10, f11, f12);
        }
    }

    Graph findGraphByName(String str);

    <T extends Graph> List<T> findGraphByType(Class<T> cls);

    String getGraphName();

    GraphSnapshot.GraphData getSnapshot();

    GraphSnapshot.GraphType graphType();

    boolean isComplete();

    boolean isInRect(float f10, float f11, float f12);

    void onMeasure();

    void removeGraph(String str);
}
