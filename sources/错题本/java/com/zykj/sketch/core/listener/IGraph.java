package com.zykj.sketch.core.listener;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.zykj.sketch.GraphSnapshot;
import com.zykj.sketch.core.graph.Graph;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a\"\b\b\u0000\u0010\u0017*\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H&¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0012H&¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m5110d2 = {"Lcom/zykj/sketch/core/listener/IGraph;", "", "Ld6/s;", "onMeasure", "()V", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "", "isInRect", "(FFF)Z", "Lcom/zykj/sketch/GraphSnapshot$GraphData;", "getSnapshot", "()Lcom/zykj/sketch/GraphSnapshot$GraphData;", "Lcom/zykj/sketch/GraphSnapshot$GraphType;", "graphType", "()Lcom/zykj/sketch/GraphSnapshot$GraphType;", "", HintConstants.AUTOFILL_HINT_NAME, "Lcom/zykj/sketch/core/graph/Graph;", "findGraphByName", "(Ljava/lang/String;)Lcom/zykj/sketch/core/graph/Graph;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "className", "", "findGraphByType", "(Ljava/lang/Class;)Ljava/util/List;", "getGraphName", "()Ljava/lang/String;", "isComplete", "()Z", "removeGraph", "(Ljava/lang/String;)V", "sketch_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IGraph {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        public static /* synthetic */ boolean isInRect$default(IGraph iGraph, float f, float f7, float f8, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isInRect");
            }
            if ((i & 4) != 0) {
                f8 = 0.0f;
            }
            return iGraph.isInRect(f, f7, f8);
        }
    }

    @Nullable
    Graph findGraphByName(@NotNull String name);

    @NotNull
    <T extends Graph> List<T> findGraphByType(@NotNull Class<T> className);

    @NotNull
    /* renamed from: getGraphName */
    String getName();

    @NotNull
    GraphSnapshot.GraphData getSnapshot();

    @NotNull
    GraphSnapshot.GraphType graphType();

    boolean isComplete();

    boolean isInRect(float x3, float y2, float offset);

    void onMeasure();

    void removeGraph(@NotNull String className);
}
