package com.zykj.blackboard.core.action;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.bean.BoardConfig;
import com.zykj.blackboard.core.canvas.MatrixAdapter;
import com.zykj.blackboard.core.canvas.control.IGraphControl;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.blackboard.listener.IAreaMoveListener;
import com.zykj.blackboard.listener.IGeometrySelectListener;
import com.zykj.blackboard.listener.ITextSelectListener;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import com.zykj.board.EzyMatrix$Matrix;
import com.zykj.board.EzyPaint$Paint;
import com.zykj.board.EzyTouchEvent$TouchEvent;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p152r6.InterfaceC6471c;

@Metadata(m5109d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001JA\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0017\u001a\u00020\u00162\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u0017\u0010\u0018J-\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H&¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u00020\u00162\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\u0006\u0010\u001e\u001a\u00020\u001dH&¢\u0006\u0004\b\u001f\u0010 JU\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010\b\u001a\u00020&2\u0006\u0010'\u001a\u00020\t2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&¢\u0006\u0004\b*\u0010+Jc\u00100\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010-\u001a\u00020,2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u00042\u0006\u0010\b\u001a\u00020&2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&¢\u0006\u0004\b0\u00101Jm\u0010:\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u00022\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010&2\u0010\b\u0002\u00106\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00042\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\n\b\u0002\u00109\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b:\u0010;J%\u0010<\u001a\u00020\u00162\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b<\u0010=J\u0011\u0010?\u001a\u0004\u0018\u00010>H&¢\u0006\u0004\b?\u0010@J\u0011\u0010B\u001a\u0004\u0018\u00010AH&¢\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001a\u0004\u0018\u00010DH&¢\u0006\u0004\bE\u0010FJ\u000f\u0010H\u001a\u00020GH&¢\u0006\u0004\bH\u0010IJ\u000f\u0010K\u001a\u00020JH&¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u00020MH&¢\u0006\u0004\bN\u0010OJ\u000f\u0010Q\u001a\u00020PH&¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\u0016H&¢\u0006\u0004\bS\u0010TJ\u001d\u0010V\u001a\u00020\u00162\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H&¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0016\u0018\u00010(H&¢\u0006\u0004\bX\u0010Y¨\u0006Z"}, m5110d2 = {"Lcom/zykj/blackboard/core/action/IActionListener;", "", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "", "Lcom/zykj/board/EzyTouchEvent$TouchEvent;", "eventList", "Lcom/zykj/board/EzyPaint$Paint;", "paint", "", "parentGraphId", "graphId", "Lcom/zykj/blackboard/core/graph/Graph;", "writingGraphEvent", "(Lcom/zykj/board/EzyGraphEnum$GraphEnum;Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;Ljava/lang/String;Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/Graph;", "Lcom/zykj/blackboard/core/graph/IGraph;", "groupGraphEvent", "(Ljava/lang/String;)Lcom/zykj/blackboard/core/graph/IGraph;", "graphList", "", "Lcom/zykj/board/EzyMatrix$Matrix;", "matrixList", "Ld6/s;", "transformGraphEvent", "(Ljava/util/List;Ljava/util/List;)V", "originMatrix", "lastMatrix", "transformCameraEvent", "(Lcom/zykj/board/EzyMatrix$Matrix;Lcom/zykj/board/EzyMatrix$Matrix;Ljava/util/List;)V", "", "currentTime", "deleteGraphEvent", "(Ljava/util/List;J)V", "", "width", "height", "x", "y", "Landroid/graphics/Paint;", "content", "Lkotlin/Function1;", "callback", "textGraphEvent", "(FFFFLandroid/graphics/Paint;Ljava/lang/String;Lr6/c;)V", "", "geometryType", "Landroid/graphics/PointF;", "pointList", "geometryGraphEvent", "(FFFFILjava/util/List;Landroid/graphics/Paint;Lr6/c;)V", "graph", "graphEnum", "Landroid/graphics/RectF;", "originRectF", "points", "Landroid/graphics/Matrix;", "renderMatrix", "filePath", "changeGraph", "(Lcom/zykj/blackboard/core/graph/IGraph;Lcom/zykj/board/EzyGraphEnum$GraphEnum;Landroid/graphics/RectF;Ljava/lang/String;Landroid/graphics/Paint;Ljava/util/List;Landroid/graphics/Matrix;Ljava/lang/String;)V", "moveCursor", "(Ljava/util/List;Lcom/zykj/board/EzyPaint$Paint;)V", "Lcom/zykj/blackboard/listener/ITextSelectListener;", "getTextSelectListener", "()Lcom/zykj/blackboard/listener/ITextSelectListener;", "Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "getGeometrySelectListener", "()Lcom/zykj/blackboard/listener/IGeometrySelectListener;", "Lcom/zykj/blackboard/listener/IAreaMoveListener;", "getAreaMoveListener", "()Lcom/zykj/blackboard/listener/IAreaMoveListener;", "Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "getGraphControl", "()Lcom/zykj/blackboard/core/canvas/control/IGraphControl;", "Lcom/zykj/blackboard/bean/BoardConfig;", "getBoardConfig", "()Lcom/zykj/blackboard/bean/BoardConfig;", "Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "getMatrixAdapter", "()Lcom/zykj/blackboard/core/canvas/MatrixAdapter;", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "getSourceLoader", "()Lcom/zykj/blackboard/core/loader/SourceLoader;", "saveSnapshot", "()V", "graphIDList", "newSelectGraph", "(Ljava/util/List;)V", "getGeometryCreateListener", "()Lr6/c;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public interface IActionListener {

    @Metadata(m5111k = 3, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void changeGraph$default(IActionListener iActionListener, IGraph iGraph, EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum, RectF rectF, String str, Paint paint, List list, Matrix matrix, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: changeGraph");
            }
            if ((i & 4) != 0) {
                rectF = null;
            }
            if ((i & 8) != 0) {
                str = null;
            }
            if ((i & 16) != 0) {
                paint = null;
            }
            if ((i & 32) != 0) {
                list = null;
            }
            if ((i & 64) != 0) {
                matrix = null;
            }
            if ((i & 128) != 0) {
                str2 = null;
            }
            iActionListener.changeGraph(iGraph, ezyGraphEnum$GraphEnum, rectF, str, paint, list, matrix, str2);
        }

        public static /* synthetic */ Graph writingGraphEvent$default(IActionListener iActionListener, EzyGraphEnum$GraphEnum ezyGraphEnum$GraphEnum, List list, EzyPaint$Paint ezyPaint$Paint, String str, String str2, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: writingGraphEvent");
            }
            if ((i & 16) != 0) {
                str2 = UUID.randomUUID().toString();
                AbstractC5830k.m5329f(str2, "randomUUID().toString()");
            }
            return iActionListener.writingGraphEvent(ezyGraphEnum$GraphEnum, list, ezyPaint$Paint, str, str2);
        }
    }

    void changeGraph(@NotNull IGraph graph, @NotNull EzyGraphEnum$GraphEnum graphEnum, @Nullable RectF originRectF, @Nullable String content, @Nullable Paint paint, @Nullable List<? extends PointF> points, @Nullable Matrix renderMatrix, @Nullable String filePath);

    void deleteGraphEvent(@NotNull List<? extends IGraph> graphList, long currentTime);

    void geometryGraphEvent(float width, float height, float x3, float y2, int geometryType, @NotNull List<? extends PointF> pointList, @NotNull Paint paint, @Nullable InterfaceC6471c callback);

    @Nullable
    IAreaMoveListener getAreaMoveListener();

    @NotNull
    BoardConfig getBoardConfig();

    @Nullable
    InterfaceC6471c getGeometryCreateListener();

    @Nullable
    IGeometrySelectListener getGeometrySelectListener();

    @NotNull
    IGraphControl getGraphControl();

    @NotNull
    MatrixAdapter getMatrixAdapter();

    @NotNull
    SourceLoader getSourceLoader();

    @Nullable
    ITextSelectListener getTextSelectListener();

    @Nullable
    IGraph groupGraphEvent(@NotNull String parentGraphId);

    void moveCursor(@NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint);

    void newSelectGraph(@NotNull List<String> graphIDList);

    void saveSnapshot();

    void textGraphEvent(float width, float height, float x3, float y2, @NotNull Paint paint, @NotNull String content, @Nullable InterfaceC6471c callback);

    void transformCameraEvent(@NotNull EzyMatrix$Matrix originMatrix, @NotNull EzyMatrix$Matrix lastMatrix, @NotNull List<EzyMatrix$Matrix> matrixList);

    void transformGraphEvent(@NotNull List<? extends IGraph> graphList, @NotNull List<EzyMatrix$Matrix> matrixList);

    @Nullable
    Graph writingGraphEvent(@NotNull EzyGraphEnum$GraphEnum graphType, @NotNull List<EzyTouchEvent$TouchEvent> eventList, @NotNull EzyPaint$Paint paint, @NotNull String parentGraphId, @NotNull String graphId);
}
