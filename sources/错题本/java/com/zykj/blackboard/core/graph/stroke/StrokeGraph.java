package com.zykj.blackboard.core.graph.stroke;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyGraphEnum$GraphEnum;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5824e;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m5109d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m5110d2 = {"Lcom/zykj/blackboard/core/graph/stroke/StrokeGraph;", "Lcom/zykj/blackboard/core/graph/stroke/WritingGraph;", "", "id", "Landroid/graphics/RectF;", "outRect", "Lcom/zykj/blackboard/core/loader/SourceLoader;", "sourceLoader", "sourceFileName", "", "sourceId", "<init>", "(Ljava/lang/String;Landroid/graphics/RectF;Lcom/zykj/blackboard/core/loader/SourceLoader;Ljava/lang/String;Ljava/lang/Integer;)V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/Matrix;", "matrix", "Ld6/s;", "renderPath", "(Landroid/graphics/Canvas;Landroid/graphics/Matrix;)V", "render", "Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "graphType", "()Lcom/zykj/board/EzyGraphEnum$GraphEnum;", "Lcom/zykj/blackboard/core/graph/Graph;", "copy", "()Lcom/zykj/blackboard/core/graph/Graph;", "blackboard_release"}, m5111k = 1, m5112mv = {1, 7, 1}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public class StrokeGraph extends WritingGraph {
    public /* synthetic */ StrokeGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i, AbstractC5824e abstractC5824e) {
        this(str, rectF, (i & 4) != 0 ? null : sourceLoader, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : num);
    }

    private final void renderPath(Canvas canvas, Matrix matrix) {
        if (getPath() == null) {
            return;
        }
        getTempMatrix().reset();
        getTempMatrix().postConcat(getRenderMatrix());
        getTempMatrix().postConcat(matrix);
        Path path = getPath();
        if (path != null) {
            path.transform(getTempMatrix(), getRenderPath());
        }
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            if (getRenderPath() != null) {
                Path renderPath = getRenderPath();
                if (renderPath != null) {
                    canvas.drawPath(renderPath, mPaint);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder("exception renderPath == null ");
            sb.append(hashCode());
            sb.append(" path = ");
            Path path2 = getPath();
            sb.append(path2 != null ? Boolean.valueOf(path2.isEmpty()) : null);
            sb.append(" path = ");
            Path path3 = getPath();
            sb.append(path3 != null ? Boolean.valueOf(path3.isEmpty()) : null);
            sb.append(" StrokeGraph id = ");
            sb.append(getId());
            System.out.println((Object) sb.toString());
        }
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public Graph copy() {
        StrokeGraph strokeGraph = new StrokeGraph(getId(), new RectF(getOriginalRectF()), getSourceLoader(), getSourceFileName(), getSourceId());
        strokeGraph.getMEventList().addAll(getMEventList());
        Path path = getPath();
        if (path != null) {
            strokeGraph.setPath(new Path(path));
        }
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            strokeGraph.setPaint(new Paint(mPaint), getPaintItemLength(), getPaintSpacing());
        }
        strokeGraph.initMatrix(getRenderMatrix());
        strokeGraph.updateRenderRectF();
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            strokeGraph.addGraph(((IGraph) it.next()).copy());
        }
        return strokeGraph;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    @NotNull
    public EzyGraphEnum$GraphEnum graphType() {
        return EzyGraphEnum$GraphEnum.STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(@NotNull Canvas canvas, @NotNull Matrix matrix) {
        AbstractC5830k.m5330g(canvas, "canvas");
        AbstractC5830k.m5330g(matrix, "matrix");
        if (getPath() == null || getMPaint() == null) {
            initPath();
        }
        renderPath(canvas, matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeGraph(@NotNull String id, @NotNull RectF outRect, @Nullable SourceLoader sourceLoader, @Nullable String str, @Nullable Integer num) {
        super(id, outRect, sourceLoader, str, num);
        AbstractC5830k.m5330g(id, "id");
        AbstractC5830k.m5330g(outRect, "outRect");
    }
}
