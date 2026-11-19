package com.zykj.blackboard.core.graph.stroke;

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
public final class BeelineStrokeGraph extends StrokeGraph {
    public /* synthetic */ BeelineStrokeGraph(String str, RectF rectF, SourceLoader sourceLoader, String str2, Integer num, int i10, AbstractC9126n abstractC9126n) {
        this(str, rectF, (i10 & 4) != 0 ? null : sourceLoader, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num);
    }

    @Override // com.zykj.blackboard.core.graph.stroke.StrokeGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public Graph copy() {
        BeelineStrokeGraph beelineStrokeGraph = new BeelineStrokeGraph(getId(), new RectF(getOriginalRectF()), getSourceLoader(), getSourceFileName(), getSourceId());
        beelineStrokeGraph.getMEventList().addAll(getMEventList());
        Path path = getPath();
        if (path != null) {
            beelineStrokeGraph.setPath(new Path(path));
        }
        Paint mPaint = getMPaint();
        if (mPaint != null) {
            beelineStrokeGraph.setPaint(new Paint(mPaint), getPaintItemLength(), getPaintSpacing());
        }
        beelineStrokeGraph.initMatrix(getRenderMatrix());
        beelineStrokeGraph.updateRenderRectF();
        beelineStrokeGraph.initMatrix(getRenderMatrix());
        Iterator<T> it = getChildGraph().iterator();
        while (it.hasNext()) {
            beelineStrokeGraph.addGraph(((IGraph) it.next()).copy());
        }
        return beelineStrokeGraph;
    }

    @Override // com.zykj.blackboard.core.graph.stroke.StrokeGraph, com.zykj.blackboard.core.graph.root.BoundedContainerGraph, com.zykj.blackboard.core.graph.IGraph
    public EzyGraphEnum.GraphEnum graphType() {
        return EzyGraphEnum.GraphEnum.BEELINE_STROKE_GRAPH;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeelineStrokeGraph(String id, RectF outRect, SourceLoader sourceLoader, String str, Integer num) {
        super(id, outRect, sourceLoader, str, num);
        AbstractC9133u.m16133g(id, "id");
        AbstractC9133u.m16133g(outRect, "outRect");
    }
}
