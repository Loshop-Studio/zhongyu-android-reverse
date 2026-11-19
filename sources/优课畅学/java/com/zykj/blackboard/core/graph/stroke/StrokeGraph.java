package com.zykj.blackboard.core.graph.stroke;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.zykj.blackboard.core.graph.Graph;
import com.zykj.blackboard.core.graph.IGraph;
import com.zykj.blackboard.core.loader.SourceLoader;
import com.zykj.board.EzyGraphEnum;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC9126n;
import kotlin.jvm.internal.AbstractC9133u;

/* loaded from: classes4.dex */
public class StrokeGraph extends WritingGraph {
    public /* synthetic */ StrokeGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : sourceLoader, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
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
            StringBuilder sb = new StringBuilder();
            sb.append("exception renderPath == null ");
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
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.STROKE_GRAPH;
    }

    @Override // com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IDraw
    public void render(Canvas canvas, Matrix matrix) {
        AbstractC9133u.m16133g(canvas, "canvas");
        AbstractC9133u.m16133g(matrix, "matrix");
        if (getPath() == null || getMPaint() == null) {
            initPath();
        }
        renderPath(canvas, matrix);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StrokeGraph(String id, RectF outRect, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRect, sourceLoader, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRect, "outRect");
    }
}
