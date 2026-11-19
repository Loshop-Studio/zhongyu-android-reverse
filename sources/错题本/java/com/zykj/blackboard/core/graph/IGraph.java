package com.zykj.blackboard.core.graph;

import android.graphics.Matrix;
import android.graphics.RectF;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.board.C4361d0;
import com.zykj.board.C4386q;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u00012\u00020\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00000\bH&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH&¢\u0006\u0004\b\u0015\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0012H&¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001d\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&¢\u0006\u0004\b\u001d\u0010\u001eJ5\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00192\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001fH&¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020!2\u0006\u0010$\u001a\u00020\u000f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001fH&¢\u0006\u0004\b%\u0010&J'\u0010'\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H&¢\u0006\u0004\b)\u0010(J\u0019\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010*\u001a\u00020\u0003H&¢\u0006\u0004\b,\u0010-J\u000f\u0010/\u001a\u00020.H&¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020+H&¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H&¢\u0006\u0004\b7\u00108J\u001d\u0010:\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00000\u001fH&¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\fH&¢\u0006\u0004\b<\u0010=¨\u0006>"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/IGraph;", "Lcom/zykj/blackboard/core/graph/IGraphChange;", "Lcom/zykj/blackboard/core/graph/IDraw;", "", "getId", "()Ljava/lang/String;", "getParent", "()Lcom/zykj/blackboard/core/graph/IGraph;", "", "getChildGraph", "()Ljava/util/List;", "graph", "Ld6/s;", "setParent", "(Lcom/zykj/blackboard/core/graph/IGraph;)V", "Landroid/graphics/RectF;", "getOriginalRectF", "()Landroid/graphics/RectF;", "Landroid/graphics/Matrix;", "getRenderMatrix", "()Landroid/graphics/Matrix;", "getRenderRectF", "adapterMatrix", "getMinOutRectF", "(Landroid/graphics/Matrix;)Landroid/graphics/RectF;", "", "x", "y", TypedValues.CycleType.S_WAVE_OFFSET, "findByPoint", "(FFF)Lcom/zykj/blackboard/core/graph/IGraph;", "", "list", "", "findGraphListByPoint", "(FFFLjava/util/List;)Z", "rectF", "findByRectF", "(Landroid/graphics/RectF;Ljava/util/List;)Z", "isInRect", "(FFF)Z", "isCollide", "id", "Lcom/zykj/blackboard/core/graph/Graph;", "findById", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "Lcom/zykj/board/d0;", "getSnapshot", "()Lcom/zykj/board/d0;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/board/q;", "getGraphData", "()Lcom/zykj/board/q;", "graphList", "deleteGraphList", "(Ljava/util/List;)V", "onDestroy", "()V", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IGraph extends IGraphChange, IDraw {
    @NotNull
    Graph copy();

    void deleteGraphList(@NotNull List<IGraph> graphList);

    @Nullable
    Graph findById(@NotNull String id);

    @Nullable
    IGraph findByPoint(float x3, float y2, float offset);

    boolean findByRectF(@NotNull RectF rectF, @NotNull List<IGraph> list);

    boolean findGraphListByPoint(float x3, float y2, float offset, @NotNull List<IGraph> list);

    @NotNull
    List<IGraph> getChildGraph();

    @NotNull
    C4386q getGraphData();

    @NotNull
    String getId();

    @NotNull
    RectF getMinOutRectF(@Nullable Matrix adapterMatrix);

    @NotNull
    RectF getOriginalRectF();

    @Nullable
    /* renamed from: getParent */
    IGraph getParentGraph();

    @NotNull
    Matrix getRenderMatrix();

    @NotNull
    RectF getRenderRectF();

    @NotNull
    C4361d0 getSnapshot();

    @NotNull
    EzyGraphEnum$GraphEnum graphType();

    boolean isCollide(float x3, float y2, float offset);

    boolean isInRect(float x3, float y2, float offset);

    void onDestroy();

    void setParent(@NotNull IGraph graph);
}
