package com.zykj.sketch.core.listener;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.Graph;
import java.util.List;
import kotlin.Metadata;

@Metadata(m13557d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\b\b\u0000\u0010\b*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH&J\b\u0010\u000b\u001a\u00020\u0005H&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u000fH&J\b\u0010\u0010\u001a\u00020\u0011H&J\"\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\u001a"}, m13558d2 = {"Lcom/zykj/sketch/core/listener/IGraph;", "", "findGraphByName", "Lcom/zykj/sketch/core/graph/Graph;", HintConstants.AUTOFILL_HINT_NAME, "", "findGraphByType", "", ExifInterface.GPS_DIRECTION_TRUE, "className", "Ljava/lang/Class;", "getGraphName", "getSnapshot", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "graphType", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "isComplete", "", "isInRect", "x", "", "y", TypedValues.CycleType.S_WAVE_OFFSET, "onMeasure", "", "removeGraph", "sketch_release"}, m13559k = 1, m13560mv = {1, 7, 1}, m13562xi = 48)
/* loaded from: classes5.dex */
public interface IGraph {

    @Metadata(m13559k = 3, m13560mv = {1, 7, 1}, m13562xi = 48)
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

    Graph findGraphByName(String name);

    <T extends Graph> List<T> findGraphByType(Class<T> className);

    /* renamed from: getGraphName */
    String getName();

    GraphSnapshot.GraphData getSnapshot();

    GraphSnapshot.GraphType graphType();

    boolean isComplete();

    boolean isInRect(float x9, float y9, float offset);

    void onMeasure();

    void removeGraph(String className);
}
